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

package com.google.publicalerts.cap.profile;

import com.google.publicalerts.cap.Alert;
import com.google.publicalerts.cap.CachedSaxInputSource;
import com.google.publicalerts.cap.CapDateUtil;
import com.google.publicalerts.cap.CapException.Reason;
import com.google.publicalerts.cap.CapException.ReasonType;
import com.google.publicalerts.cap.CapXmlParser;
import com.google.publicalerts.cap.NotCapException;

import org.xml.sax.SAXParseException;

import java.util.List;

/**
 * Abstract base class for CAP profiles.
 *
 * @author shakusa@google.com (Steve Hakusa)
 */
public abstract class AbstractCapProfile extends CapXmlParser implements CapProfile {

  public AbstractCapProfile() {
    this(false);
  }

  /**
   * @param strictXsdValidation if true, perform by-the-spec xsd schema
   * validation, which does not check a number of properties specified
   * elsewhere in the spec. If false (the default), attempt to do extra
   * validation to conform to the text of the spec.
   */
  public AbstractCapProfile(boolean strictXsdValidation) {
    super(true /* validate */, strictXsdValidation);
  }

  @Override
  protected Alert parseFromInternal(CachedSaxInputSource is, List<Reason> parseErrors)
      throws NotCapException, SAXParseException {
    Alert alert = super.parseFromInternal(is, parseErrors);
    parseErrors.addAll(checkForErrors(alert));
    return alert;
  }

  /**
   * Checks if the timezone on the given {@code dateStr} is zero.  If so, adds
   * a new reason with the given xpath and type to the list of reasons.
   *
   * @param reasons list to add to if timezone is zero
   * @param dateStr date string to check
   * @param xpath xpath of the element
   * @param type type of the error to add if timezone is zero
   */
  protected void checkZeroTimezone(List<Reason> reasons,
      String dateStr, String xpath, ReasonType type) {
    if (!CapDateUtil.isValidDate(dateStr)) {
      return;
    }
    if (CapDateUtil.getTimezoneOffset(dateStr) == 0) {
      reasons.add(new Reason(xpath, type));
    }
  }
}
