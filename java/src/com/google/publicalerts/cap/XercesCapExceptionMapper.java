/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.publicalerts.cap;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.publicalerts.cap.CapException.Reason;
import com.google.publicalerts.cap.CapException.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Attempts to map {@link Reason}s of type {@link Type#OTHER} derived
 * from Xerces-generated {@code SAXParseException}s to reasons with more
 * descriptive {@link Type}s and error messages specific to CAP.
 *
 * <p>Implementation note: Translation is done by parsing the messages
 * generated by the Xerces schema validator. Other validators are not
 * guaranteed to produce the same error messages. The goal is to push as
 * much of the validation as possible out of code and into the .xsd.
 *
 * @author shakusa@google.com (Steve Hakusa)
 */
public class XercesCapExceptionMapper {
  private static final Pattern XERCES_ONE_PARAM_PATTERN = Pattern.compile(
  ".* '(.*)' .*");
  private static final Pattern XERCES_TWO_PARAM_PATTERN = Pattern.compile(
      ".* '(.*)'.* '(.*)'.*");
  private static final Pattern ANON_TYPE_PATTERN = Pattern.compile(
      ".*AnonType_(.*)alert.*");

  private static final Set<String> VALID_TAGS = buildValidTagSet();
  private static final Set<String> DATE_TAGS = buildDateTags();

  /**
   * @see #map(List)
   *
   * @param exception the exception with reasons to map
   * @return a new exception with mapped reasons
   */
  public CapException map(CapException exception) {
    return new CapException(map(exception.getReasons()));
  }

  /**
   * Attempts to map {@link Reason}s of type {@link Type#OTHER} derived
   * from Xerces-generated {@code SAXParseException}s to reasons with more
   * descriptive {@link Type}s and error messages specific to CAP.
   *
   * <p>Each {@link Reason} is expected to have 3 message parameters;
   * the first is the {@code SAXParseException} error message;
   * the second is the localName of the element being parsed at the time of
   * the exception;
   * the third is any characters that had been parsed at the time of the
   * exception.
   *
   * @param reasons the reasons to map
   * @return the mapped reasons
   */
  public List<Reason> map(List<Reason> reasons) {
    List<Reason> ret = new ArrayList<Reason>();
    for (Reason r : reasons) {
      if (r.getType() == Type.OTHER) {
        r = map(r);
      }
      if (r != null && !ret.contains(r)) {
        ret.add(r);
      }
    }
    return ret;
  }

  private Reason map(Reason reason) {
    String message = reason.getMessage();
    String code = extractMessageCode(message);
    String tag = (String) reason.getMessageParam(1);
    String value = (String) reason.getMessageParam(2);

    Type type = Type.OTHER;
    String[] args = new String[] { reason.getMessage() };

    // Codes defined at http://www.w3.org/TR/xmlschema-1/#validation_failures
    if ("cvc-complex-type.2.4.a".equals(code)) {
      Matcher matcher = XERCES_TWO_PARAM_PATTERN.matcher(message);
      if (matcher.matches()) {
        if (VALID_TAGS.contains(matcher.group(1))) {
          if (matcher.group(1).equals(tag)) {
            type = Type.DUPLICATE_ELEMENT;
            args = new String[] { tag, value };
          } else {
            type = Type.INVALID_SEQUENCE;
            args = new String[] { matcher.group(2), matcher.group(1) };
          }
        } else {
          type = Type.UNSUPPORTED_ELEMENT;
          args = new String[] { matcher.group(1) };
        }
      }
    } else if ("cvc-complex-type.2.4.b".equals(code)) {
      // Missing required element
      Matcher matcher = XERCES_TWO_PARAM_PATTERN.matcher(message);
      if (matcher.matches()) {
        type = Type.MISSING_REQUIRED_ELEMENT;
        args = new  String[] { matcher.group(1), matcher.group(2) };
      }
    } else if ("cvc-complex-type.2.3".equals(code)) {
      // Invalid character data in an element
      Matcher matcher = XERCES_ONE_PARAM_PATTERN.matcher(message);
      if (matcher.matches()) {
        type = Type.INVALID_CHARACTERS;
        args = new String[] { matcher.group(1) };
      }
    } else if ("cvc-datatype-valid.1.2.1".equals(code)) {
      // invalid datetime or integer
      if (DATE_TAGS.contains(tag)) {
        type = Type.INVALID_DATE;
        args = new String[] { tag, value };
      }
    } else if ("cvc-enumeration-valid".equals(code)) {
      // invalid enum
      Matcher matcher = XERCES_TWO_PARAM_PATTERN.matcher(message);
      if (matcher.matches()) {
        type = Type.INVALID_ENUM_VALUE;
        args = new String[] {tag, value, matcher.group(2)};
      }
    } else if ("cvc-pattern-valid".equals(code)) {
      // fail regex pattern match
      Map<String, Type> tagTypeMap = new HashMap<String, Type>();
      tagTypeMap.put("identifier", Type.INVALID_IDENTIFIER);
      tagTypeMap.put("sender", Type.INVALID_SENDER);
      tagTypeMap.put("references", Type.INVALID_REFERENCES);
      tagTypeMap.put("circle", Type.INVALID_CIRCLE);

      if (tagTypeMap.containsKey(tag)) {
        type = tagTypeMap.get(tag);
        args = new String[] { value };
      } else if ("polygon".equals(tag)) {
        type = Type.INVALID_POLYGON;
        args = new String[] {
            value.length() > 50 ? value.substring(0, 47) + "..." : value };
      } else if (DATE_TAGS.contains(tag)) {
        type = Type.INVALID_DATE;
        args = new String[] { tag, value };
      } else {
        Matcher matcher = ANON_TYPE_PATTERN.matcher(message);
        if (matcher.matches()) {
          tag = matcher.group(1);
        }
        type = tagTypeMap.containsKey(tag) ?
            tagTypeMap.get(tag) : Type.INVALID_VALUE;
        args = new String[] { tag, value };
      }
    } else if ("cvc-type.3.1.2".equals(code)) {
      // Invalid character data in an element
      type = Type.INVALID_VALUE;
      args = new String[] { tag, value };
    } else if ("cvc-type.3.1.3".equals(code)) {
      // Any time this is generated, it is coupled with one of the handled
      // cases above, so do not add a duplicate here
      return null;
    }

    return new Reason(reason.getLineNumber(), reason.getColumnNumber(),
        reason.getXPath(), type, (Object[]) args);
  }

  private String extractMessageCode(String message) {
    if (message == null || message.indexOf(':') < 0) {
      return null;
    }
    return message.substring(0, message.indexOf(':'));
  }

  private static Set<String> buildValidTagSet() {
    Set<String> ret = new HashSet<String>();
    ret.add("alert");
    for (Descriptor d : Cap.getDescriptor().getMessageTypes()) {
      for (FieldDescriptor fd : d.getFields()) {
        ret.add(CapUtil.javaCase(fd.getName()));
      }
    }
    return ret;
  }

  private static Set<String> buildDateTags() {
    Set<String> dateTags = new HashSet<String>();
    dateTags.add("sent");
    dateTags.add("effective");
    dateTags.add("onset");
    dateTags.add("expires");
    return dateTags;
  }
}
