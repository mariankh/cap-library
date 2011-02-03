// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.publicalerts.cap;

public  final class Polygon extends
    com.google.protobuf.GeneratedMessage
    implements PolygonOrBuilder {
  // Use Polygon.newBuilder() to construct.
  private Polygon(Builder builder) {
    super(builder);
  }
  private Polygon(boolean noInit) {}
  
  private static final Polygon defaultInstance;
  public static Polygon getDefaultInstance() {
    return defaultInstance;
  }
  
  public Polygon getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Polygon_descriptor;
  }
  
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Polygon_fieldAccessorTable;
  }
  
  // repeated .alerts.cap.Point point = 1;
  public static final int POINT_FIELD_NUMBER = 1;
  private java.util.List<com.google.publicalerts.cap.Point> point_;
  public java.util.List<com.google.publicalerts.cap.Point> getPointList() {
    return point_;
  }
  public java.util.List<? extends com.google.publicalerts.cap.PointOrBuilder> 
      getPointOrBuilderList() {
    return point_;
  }
  public int getPointCount() {
    return point_.size();
  }
  public com.google.publicalerts.cap.Point getPoint(int index) {
    return point_.get(index);
  }
  public com.google.publicalerts.cap.PointOrBuilder getPointOrBuilder(
      int index) {
    return point_.get(index);
  }
  
  private void initFields() {
    point_ = java.util.Collections.emptyList();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;
    
    for (int i = 0; i < getPointCount(); i++) {
      if (!getPoint(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    for (int i = 0; i < point_.size(); i++) {
      output.writeMessage(1, point_.get(i));
    }
    getUnknownFields().writeTo(output);
  }
  
  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;
  
    size = 0;
    for (int i = 0; i < point_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, point_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }
  
  @java.lang.Override
  protected Object writeReplace() throws java.io.ObjectStreamException {
    return super.writeReplace();
  }
  
  @java.lang.Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.publicalerts.cap.Polygon)) {
      return super.equals(obj);
    }
    com.google.publicalerts.cap.Polygon other = (com.google.publicalerts.cap.Polygon) obj;
    
    boolean result = true;
    result = result && getPointList()
        .equals(other.getPointList());
    result = result &&
        getUnknownFields().equals(other.getUnknownFields());
    return result;
  }
  
  @java.lang.Override
  public int hashCode() {
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getPointCount() > 0) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPointList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    return hash;
  }
  
  public static com.google.publicalerts.cap.Polygon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static com.google.publicalerts.cap.Polygon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static com.google.publicalerts.cap.Polygon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static com.google.publicalerts.cap.Polygon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static com.google.publicalerts.cap.Polygon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static com.google.publicalerts.cap.Polygon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  public static com.google.publicalerts.cap.Polygon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static com.google.publicalerts.cap.Polygon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static com.google.publicalerts.cap.Polygon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static com.google.publicalerts.cap.Polygon parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  
  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.publicalerts.cap.Polygon prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }
  
  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.google.publicalerts.cap.PolygonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Polygon_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Polygon_fieldAccessorTable;
    }
    
    // Construct using com.google.publicalerts.cap.Polygon.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }
    
    private Builder(BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getPointFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }
    
    public Builder clear() {
      super.clear();
      if (pointBuilder_ == null) {
        point_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pointBuilder_.clear();
      }
      return this;
    }
    
    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }
    
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.publicalerts.cap.Polygon.getDescriptor();
    }
    
    public com.google.publicalerts.cap.Polygon getDefaultInstanceForType() {
      return com.google.publicalerts.cap.Polygon.getDefaultInstance();
    }
    
    public com.google.publicalerts.cap.Polygon build() {
      com.google.publicalerts.cap.Polygon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }
    
    private com.google.publicalerts.cap.Polygon buildParsed()
        throws com.google.protobuf.InvalidProtocolBufferException {
      com.google.publicalerts.cap.Polygon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(
          result).asInvalidProtocolBufferException();
      }
      return result;
    }
    
    public com.google.publicalerts.cap.Polygon buildPartial() {
      com.google.publicalerts.cap.Polygon result = new com.google.publicalerts.cap.Polygon(this);
      int from_bitField0_ = bitField0_;
      if (pointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          point_ = java.util.Collections.unmodifiableList(point_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.point_ = point_;
      } else {
        result.point_ = pointBuilder_.build();
      }
      onBuilt();
      return result;
    }
    
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.publicalerts.cap.Polygon) {
        return mergeFrom((com.google.publicalerts.cap.Polygon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }
    
    public Builder mergeFrom(com.google.publicalerts.cap.Polygon other) {
      if (other == com.google.publicalerts.cap.Polygon.getDefaultInstance()) return this;
      if (pointBuilder_ == null) {
        if (!other.point_.isEmpty()) {
          if (point_.isEmpty()) {
            point_ = other.point_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePointIsMutable();
            point_.addAll(other.point_);
          }
          onChanged();
        }
      } else {
        if (!other.point_.isEmpty()) {
          if (pointBuilder_.isEmpty()) {
            pointBuilder_.dispose();
            pointBuilder_ = null;
            point_ = other.point_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pointBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPointFieldBuilder() : null;
          } else {
            pointBuilder_.addAllMessages(other.point_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }
    
    public final boolean isInitialized() {
      for (int i = 0; i < getPointCount(); i++) {
        if (!getPoint(i).isInitialized()) {
          
          return false;
        }
      }
      return true;
    }
    
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder(
          this.getUnknownFields());
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            this.setUnknownFields(unknownFields.build());
            onChanged();
            return this;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            }
            break;
          }
          case 10: {
            com.google.publicalerts.cap.Point.Builder subBuilder = com.google.publicalerts.cap.Point.newBuilder();
            input.readMessage(subBuilder, extensionRegistry);
            addPoint(subBuilder.buildPartial());
            break;
          }
        }
      }
    }
    
    private int bitField0_;
    
    // repeated .alerts.cap.Point point = 1;
    private java.util.List<com.google.publicalerts.cap.Point> point_ =
      java.util.Collections.emptyList();
    private void ensurePointIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        point_ = new java.util.ArrayList<com.google.publicalerts.cap.Point>(point_);
        bitField0_ |= 0x00000001;
       }
    }
    
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder> pointBuilder_;
    
    public java.util.List<com.google.publicalerts.cap.Point> getPointList() {
      if (pointBuilder_ == null) {
        return java.util.Collections.unmodifiableList(point_);
      } else {
        return pointBuilder_.getMessageList();
      }
    }
    public int getPointCount() {
      if (pointBuilder_ == null) {
        return point_.size();
      } else {
        return pointBuilder_.getCount();
      }
    }
    public com.google.publicalerts.cap.Point getPoint(int index) {
      if (pointBuilder_ == null) {
        return point_.get(index);
      } else {
        return pointBuilder_.getMessage(index);
      }
    }
    public Builder setPoint(
        int index, com.google.publicalerts.cap.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointIsMutable();
        point_.set(index, value);
        onChanged();
      } else {
        pointBuilder_.setMessage(index, value);
      }
      return this;
    }
    public Builder setPoint(
        int index, com.google.publicalerts.cap.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.set(index, builderForValue.build());
        onChanged();
      } else {
        pointBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    public Builder addPoint(com.google.publicalerts.cap.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointIsMutable();
        point_.add(value);
        onChanged();
      } else {
        pointBuilder_.addMessage(value);
      }
      return this;
    }
    public Builder addPoint(
        int index, com.google.publicalerts.cap.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointIsMutable();
        point_.add(index, value);
        onChanged();
      } else {
        pointBuilder_.addMessage(index, value);
      }
      return this;
    }
    public Builder addPoint(
        com.google.publicalerts.cap.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.add(builderForValue.build());
        onChanged();
      } else {
        pointBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    public Builder addPoint(
        int index, com.google.publicalerts.cap.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.add(index, builderForValue.build());
        onChanged();
      } else {
        pointBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    public Builder addAllPoint(
        java.lang.Iterable<? extends com.google.publicalerts.cap.Point> values) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        super.addAll(values, point_);
        onChanged();
      } else {
        pointBuilder_.addAllMessages(values);
      }
      return this;
    }
    public Builder clearPoint() {
      if (pointBuilder_ == null) {
        point_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pointBuilder_.clear();
      }
      return this;
    }
    public Builder removePoint(int index) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.remove(index);
        onChanged();
      } else {
        pointBuilder_.remove(index);
      }
      return this;
    }
    public com.google.publicalerts.cap.Point.Builder getPointBuilder(
        int index) {
      return getPointFieldBuilder().getBuilder(index);
    }
    public com.google.publicalerts.cap.PointOrBuilder getPointOrBuilder(
        int index) {
      if (pointBuilder_ == null) {
        return point_.get(index);  } else {
        return pointBuilder_.getMessageOrBuilder(index);
      }
    }
    public java.util.List<? extends com.google.publicalerts.cap.PointOrBuilder> 
         getPointOrBuilderList() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(point_);
      }
    }
    public com.google.publicalerts.cap.Point.Builder addPointBuilder() {
      return getPointFieldBuilder().addBuilder(
          com.google.publicalerts.cap.Point.getDefaultInstance());
    }
    public com.google.publicalerts.cap.Point.Builder addPointBuilder(
        int index) {
      return getPointFieldBuilder().addBuilder(
          index, com.google.publicalerts.cap.Point.getDefaultInstance());
    }
    public java.util.List<com.google.publicalerts.cap.Point.Builder> 
         getPointBuilderList() {
      return getPointFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder>(
                point_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      return pointBuilder_;
    }
    
    // @@protoc_insertion_point(builder_scope:alerts.cap.Polygon)
  }
  
  static {
    defaultInstance = new Polygon(true);
    defaultInstance.initFields();
  }
  
  // @@protoc_insertion_point(class_scope:alerts.cap.Polygon)
}

