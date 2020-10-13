// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.netty.protobuf;

public final class DataInfo {
  private DataInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StudentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.netty.protobuf.Student)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string phone = 2;</code>
     * @return Whether the phone field is set.
     */
    boolean hasPhone();
    /**
     * <code>optional string phone = 2;</code>
     * @return The phone.
     */
    java.lang.String getPhone();
    /**
     * <code>optional string phone = 2;</code>
     * @return The bytes for phone.
     */
    com.google.protobuf.ByteString
        getPhoneBytes();

    /**
     * <code>optional int32 age = 3;</code>
     * @return Whether the age field is set.
     */
    boolean hasAge();
    /**
     * <code>optional int32 age = 3;</code>
     * @return The age.
     */
    int getAge();
  }
  /**
   * Protobuf type {@code com.netty.protobuf.Student}
   */
  public static final class Student extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.netty.protobuf.Student)
      StudentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Student.newBuilder() to construct.
    private Student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Student() {
      name_ = "";
      phone_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Student();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Student(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              phone_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              age_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.netty.protobuf.DataInfo.internal_static_com_netty_protobuf_Student_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.netty.protobuf.DataInfo.internal_static_com_netty_protobuf_Student_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.netty.protobuf.DataInfo.Student.class, com.netty.protobuf.DataInfo.Student.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PHONE_FIELD_NUMBER = 2;
    private volatile java.lang.Object phone_;
    /**
     * <code>optional string phone = 2;</code>
     * @return Whether the phone field is set.
     */
    @java.lang.Override
    public boolean hasPhone() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string phone = 2;</code>
     * @return The phone.
     */
    @java.lang.Override
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          phone_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string phone = 2;</code>
     * @return The bytes for phone.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 3;
    private int age_;
    /**
     * <code>optional int32 age = 3;</code>
     * @return Whether the age field is set.
     */
    @java.lang.Override
    public boolean hasAge() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 age = 3;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, phone_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt32(3, age_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, phone_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, age_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.netty.protobuf.DataInfo.Student)) {
        return super.equals(obj);
      }
      com.netty.protobuf.DataInfo.Student other = (com.netty.protobuf.DataInfo.Student) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasPhone() != other.hasPhone()) return false;
      if (hasPhone()) {
        if (!getPhone()
            .equals(other.getPhone())) return false;
      }
      if (hasAge() != other.hasAge()) return false;
      if (hasAge()) {
        if (getAge()
            != other.getAge()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasPhone()) {
        hash = (37 * hash) + PHONE_FIELD_NUMBER;
        hash = (53 * hash) + getPhone().hashCode();
      }
      if (hasAge()) {
        hash = (37 * hash) + AGE_FIELD_NUMBER;
        hash = (53 * hash) + getAge();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.netty.protobuf.DataInfo.Student parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.netty.protobuf.DataInfo.Student parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.netty.protobuf.DataInfo.Student parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.netty.protobuf.DataInfo.Student parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.netty.protobuf.DataInfo.Student prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.netty.protobuf.Student}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.netty.protobuf.Student)
        com.netty.protobuf.DataInfo.StudentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.netty.protobuf.DataInfo.internal_static_com_netty_protobuf_Student_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.netty.protobuf.DataInfo.internal_static_com_netty_protobuf_Student_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.netty.protobuf.DataInfo.Student.class, com.netty.protobuf.DataInfo.Student.Builder.class);
      }

      // Construct using com.netty.protobuf.DataInfo.Student.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        phone_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.netty.protobuf.DataInfo.internal_static_com_netty_protobuf_Student_descriptor;
      }

      @java.lang.Override
      public com.netty.protobuf.DataInfo.Student getDefaultInstanceForType() {
        return com.netty.protobuf.DataInfo.Student.getDefaultInstance();
      }

      @java.lang.Override
      public com.netty.protobuf.DataInfo.Student build() {
        com.netty.protobuf.DataInfo.Student result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.netty.protobuf.DataInfo.Student buildPartial() {
        com.netty.protobuf.DataInfo.Student result = new com.netty.protobuf.DataInfo.Student(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.phone_ = phone_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.age_ = age_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.netty.protobuf.DataInfo.Student) {
          return mergeFrom((com.netty.protobuf.DataInfo.Student)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.netty.protobuf.DataInfo.Student other) {
        if (other == com.netty.protobuf.DataInfo.Student.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasPhone()) {
          bitField0_ |= 0x00000002;
          phone_ = other.phone_;
          onChanged();
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.netty.protobuf.DataInfo.Student parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.netty.protobuf.DataInfo.Student) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object phone_ = "";
      /**
       * <code>optional string phone = 2;</code>
       * @return Whether the phone field is set.
       */
      public boolean hasPhone() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string phone = 2;</code>
       * @return The phone.
       */
      public java.lang.String getPhone() {
        java.lang.Object ref = phone_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            phone_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string phone = 2;</code>
       * @return The bytes for phone.
       */
      public com.google.protobuf.ByteString
          getPhoneBytes() {
        java.lang.Object ref = phone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          phone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string phone = 2;</code>
       * @param value The phone to set.
       * @return This builder for chaining.
       */
      public Builder setPhone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        phone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string phone = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhone() {
        bitField0_ = (bitField0_ & ~0x00000002);
        phone_ = getDefaultInstance().getPhone();
        onChanged();
        return this;
      }
      /**
       * <code>optional string phone = 2;</code>
       * @param value The bytes for phone to set.
       * @return This builder for chaining.
       */
      public Builder setPhoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        phone_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>optional int32 age = 3;</code>
       * @return Whether the age field is set.
       */
      @java.lang.Override
      public boolean hasAge() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 age = 3;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>optional int32 age = 3;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000004;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 age = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000004);
        age_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.netty.protobuf.Student)
    }

    // @@protoc_insertion_point(class_scope:com.netty.protobuf.Student)
    private static final com.netty.protobuf.DataInfo.Student DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.netty.protobuf.DataInfo.Student();
    }

    public static com.netty.protobuf.DataInfo.Student getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Student>
        PARSER = new com.google.protobuf.AbstractParser<Student>() {
      @java.lang.Override
      public Student parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Student(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Student> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Student> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.netty.protobuf.DataInfo.Student getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_netty_protobuf_Student_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_netty_protobuf_Student_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\022\022com.netty.protobuf\"3\n\007S" +
      "tudent\022\014\n\004name\030\001 \001(\t\022\r\n\005phone\030\002 \001(\t\022\013\n\003a" +
      "ge\030\003 \001(\005B \n\022com.netty.protobufB\010DataInfo" +
      "H\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_netty_protobuf_Student_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_netty_protobuf_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_netty_protobuf_Student_descriptor,
        new java.lang.String[] { "Name", "Phone", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}