// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.publicalerts.cap;

public  final class Circle extends
    com.google.protobuf.GeneratedMessage
    implements CircleOrBuilder {
  // Use Circle.newBuilder() to construct.
  private Circle(Builder builder) {
    super(builder);
  }
  private Circle(boolean noInit) {}
  
  private static final Circle defaultInstance;
  public static Circle getDefaultInstance() {
    return defaultInstance;
  }
  
  public Circle getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Circle_descriptor;
  }
  
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Circle_fieldAccessorTable;
  }
  
  private int bitField0_;
  // required .alerts.cap.Point point = 1;
  public static final int POINT_FIELD_NUMBER = 1;
  private com.google.publicalerts.cap.Point point_;
  public boolean hasPoint() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  public com.google.publicalerts.cap.Point getPoint() {
    return point_;
  }
  public com.google.publicalerts.cap.PointOrBuilder getPointOrBuilder() {
    return point_;
  }
  
  // required double radius = 2;
  public static final int RADIUS_FIELD_NUMBER = 2;
  private double radius_;
  public boolean hasRadius() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  public double getRadius() {
    return radius_;
  }
  
  private void initFields() {
    point_ = com.google.publicalerts.cap.Point.getDefaultInstance();
    radius_ = 0D;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;
    
    if (!hasPoint()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasRadius()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getPoint().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, point_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeDouble(2, radius_);
    }
    getUnknownFields().writeTo(output);
  }
  
  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;
  
    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, point_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, radius_);
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
    if (!(obj instanceof com.google.publicalerts.cap.Circle)) {
      return super.equals(obj);
    }
    com.google.publicalerts.cap.Circle other = (com.google.publicalerts.cap.Circle) obj;
    
    boolean result = true;
    result = result && (hasPoint() == other.hasPoint());
    if (hasPoint()) {
      result = result && getPoint()
          .equals(other.getPoint());
    }
    result = result && (hasRadius() == other.hasRadius());
    if (hasRadius()) {
      result = result && (Double.doubleToLongBits(getRadius())    == Double.doubleToLongBits(other.getRadius()));
    }
    result = result &&
        getUnknownFields().equals(other.getUnknownFields());
    return result;
  }
  
  @java.lang.Override
  public int hashCode() {
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasPoint()) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPoint().hashCode();
    }
    if (hasRadius()) {
      hash = (37 * hash) + RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + hashLong(
          Double.doubleToLongBits(getRadius()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    return hash;
  }
  
  public static com.google.publicalerts.cap.Circle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static com.google.publicalerts.cap.Circle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static com.google.publicalerts.cap.Circle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  public static com.google.publicalerts.cap.Circle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static com.google.publicalerts.cap.Circle parseDelimitedFrom(
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
  public static com.google.publicalerts.cap.Circle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  
  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.publicalerts.cap.Circle prototype) {
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
     implements com.google.publicalerts.cap.CircleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Circle_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.publicalerts.cap.Cap.internal_static_alerts_cap_Circle_fieldAccessorTable;
    }
    
    // Construct using com.google.publicalerts.cap.Circle.newBuilder()
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
        point_ = com.google.publicalerts.cap.Point.getDefaultInstance();
      } else {
        pointBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      radius_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    
    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }
    
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.publicalerts.cap.Circle.getDescriptor();
    }
    
    public com.google.publicalerts.cap.Circle getDefaultInstanceForType() {
      return com.google.publicalerts.cap.Circle.getDefaultInstance();
    }
    
    public com.google.publicalerts.cap.Circle build() {
      com.google.publicalerts.cap.Circle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }
    
    private com.google.publicalerts.cap.Circle buildParsed()
        throws com.google.protobuf.InvalidProtocolBufferException {
      com.google.publicalerts.cap.Circle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(
          result).asInvalidProtocolBufferException();
      }
      return result;
    }
    
    public com.google.publicalerts.cap.Circle buildPartial() {
      com.google.publicalerts.cap.Circle result = new com.google.publicalerts.cap.Circle(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (pointBuilder_ == null) {
        result.point_ = point_;
      } else {
        result.point_ = pointBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.radius_ = radius_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }
    
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.publicalerts.cap.Circle) {
        return mergeFrom((com.google.publicalerts.cap.Circle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }
    
    public Builder mergeFrom(com.google.publicalerts.cap.Circle other) {
      if (other == com.google.publicalerts.cap.Circle.getDefaultInstance()) return this;
      if (other.hasPoint()) {
        mergePoint(other.getPoint());
      }
      if (other.hasRadius()) {
        setRadius(other.getRadius());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasPoint()) {
        
        return false;
      }
      if (!hasRadius()) {
        
        return false;
      }
      if (!getPoint().isInitialized()) {
        
        return false;
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
            if (hasPoint()) {
              subBuilder.mergeFrom(getPoint());
            }
            input.readMessage(subBuilder, extensionRegistry);
            setPoint(subBuilder.buildPartial());
            break;
          }
          case 17: {
            bitField0_ |= 0x00000002;
            radius_ = input.readDouble();
            break;
          }
        }
      }
    }
    
    private int bitField0_;
    
    // required .alerts.cap.Point point = 1;
    private com.google.publicalerts.cap.Point point_ = com.google.publicalerts.cap.Point.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder> pointBuilder_;
    public boolean hasPoint() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.google.publicalerts.cap.Point getPoint() {
      if (pointBuilder_ == null) {
        return point_;
      } else {
        return pointBuilder_.getMessage();
      }
    }
    public Builder setPoint(com.google.publicalerts.cap.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point_ = value;
        onChanged();
      } else {
        pointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    public Builder setPoint(
        com.google.publicalerts.cap.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        point_ = builderForValue.build();
        onChanged();
      } else {
        pointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    public Builder mergePoint(com.google.publicalerts.cap.Point value) {
      if (pointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            point_ != com.google.publicalerts.cap.Point.getDefaultInstance()) {
          point_ =
            com.google.publicalerts.cap.Point.newBuilder(point_).mergeFrom(value).buildPartial();
        } else {
          point_ = value;
        }
        onChanged();
      } else {
        pointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    public Builder clearPoint() {
      if (pointBuilder_ == null) {
        point_ = com.google.publicalerts.cap.Point.getDefaultInstance();
        onChanged();
      } else {
        pointBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    public com.google.publicalerts.cap.Point.Builder getPointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPointFieldBuilder().getBuilder();
    }
    public com.google.publicalerts.cap.PointOrBuilder getPointOrBuilder() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilder();
      } else {
        return point_;
      }
    }
    private com.google.protobuf.SingleFieldBuilder<
        com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder>(
                point_,
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      return pointBuilder_;
    }
    
    // required double radius = 2;
    private double radius_ ;
    public boolean hasRadius() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public double getRadius() {
      return radius_;
    }
    public Builder setRadius(double value) {
      bitField0_ |= 0x00000002;
      radius_ = value;
      onChanged();
      return this;
    }
    public Builder clearRadius() {
      bitField0_ = (bitField0_ & ~0x00000002);
      radius_ = 0D;
      onChanged();
      return this;
    }
    
    // @@protoc_insertion_point(builder_scope:alerts.cap.Circle)
  }
  
  static {
    defaultInstance = new Circle(true);
    defaultInstance.initFields();
  }
  
  // @@protoc_insertion_point(class_scope:alerts.cap.Circle)
}

