/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manager.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

/**
 * Protobuf type {@code manager.PFateId}
 */
public final class PFateId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:manager.PFateId)
    PFateIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PFateId.newBuilder() to construct.
  private PFateId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PFateId() {
    type_ = 0;
    txUUIDStr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PFateId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.accumulo.core.compaction.protobuf.ManagerProto.internal_static_manager_PFateId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.accumulo.core.compaction.protobuf.ManagerProto.internal_static_manager_PFateId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.accumulo.core.compaction.protobuf.PFateId.class, org.apache.accumulo.core.compaction.protobuf.PFateId.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <code>.manager.PFateInstanceType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.manager.PFateInstanceType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public org.apache.accumulo.core.compaction.protobuf.PFateInstanceType getType() {
    org.apache.accumulo.core.compaction.protobuf.PFateInstanceType result = org.apache.accumulo.core.compaction.protobuf.PFateInstanceType.forNumber(type_);
    return result == null ? org.apache.accumulo.core.compaction.protobuf.PFateInstanceType.UNRECOGNIZED : result;
  }

  public static final int TXUUIDSTR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object txUUIDStr_ = "";
  /**
   * <code>string txUUIDStr = 2;</code>
   * @return The txUUIDStr.
   */
  @java.lang.Override
  public java.lang.String getTxUUIDStr() {
    java.lang.Object ref = txUUIDStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      txUUIDStr_ = s;
      return s;
    }
  }
  /**
   * <code>string txUUIDStr = 2;</code>
   * @return The bytes for txUUIDStr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTxUUIDStrBytes() {
    java.lang.Object ref = txUUIDStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      txUUIDStr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (type_ != org.apache.accumulo.core.compaction.protobuf.PFateInstanceType.UNKNOWN.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txUUIDStr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, txUUIDStr_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != org.apache.accumulo.core.compaction.protobuf.PFateInstanceType.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txUUIDStr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, txUUIDStr_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.accumulo.core.compaction.protobuf.PFateId)) {
      return super.equals(obj);
    }
    org.apache.accumulo.core.compaction.protobuf.PFateId other = (org.apache.accumulo.core.compaction.protobuf.PFateId) obj;

    if (type_ != other.type_) return false;
    if (!getTxUUIDStr()
        .equals(other.getTxUUIDStr())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + TXUUIDSTR_FIELD_NUMBER;
    hash = (53 * hash) + getTxUUIDStr().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PFateId parseFrom(
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
  public static Builder newBuilder(org.apache.accumulo.core.compaction.protobuf.PFateId prototype) {
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
   * Protobuf type {@code manager.PFateId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:manager.PFateId)
      org.apache.accumulo.core.compaction.protobuf.PFateIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.accumulo.core.compaction.protobuf.ManagerProto.internal_static_manager_PFateId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.accumulo.core.compaction.protobuf.ManagerProto.internal_static_manager_PFateId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.accumulo.core.compaction.protobuf.PFateId.class, org.apache.accumulo.core.compaction.protobuf.PFateId.Builder.class);
    }

    // Construct using org.apache.accumulo.core.compaction.protobuf.PFateId.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      txUUIDStr_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.accumulo.core.compaction.protobuf.ManagerProto.internal_static_manager_PFateId_descriptor;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PFateId getDefaultInstanceForType() {
      return org.apache.accumulo.core.compaction.protobuf.PFateId.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PFateId build() {
      org.apache.accumulo.core.compaction.protobuf.PFateId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PFateId buildPartial() {
      org.apache.accumulo.core.compaction.protobuf.PFateId result = new org.apache.accumulo.core.compaction.protobuf.PFateId(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.accumulo.core.compaction.protobuf.PFateId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.txUUIDStr_ = txUUIDStr_;
      }
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
      if (other instanceof org.apache.accumulo.core.compaction.protobuf.PFateId) {
        return mergeFrom((org.apache.accumulo.core.compaction.protobuf.PFateId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.accumulo.core.compaction.protobuf.PFateId other) {
      if (other == org.apache.accumulo.core.compaction.protobuf.PFateId.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getTxUUIDStr().isEmpty()) {
        txUUIDStr_ = other.txUUIDStr_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              txUUIDStr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <code>.manager.PFateInstanceType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.manager.PFateInstanceType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.manager.PFateInstanceType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PFateInstanceType getType() {
      org.apache.accumulo.core.compaction.protobuf.PFateInstanceType result = org.apache.accumulo.core.compaction.protobuf.PFateInstanceType.forNumber(type_);
      return result == null ? org.apache.accumulo.core.compaction.protobuf.PFateInstanceType.UNRECOGNIZED : result;
    }
    /**
     * <code>.manager.PFateInstanceType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.apache.accumulo.core.compaction.protobuf.PFateInstanceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.manager.PFateInstanceType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object txUUIDStr_ = "";
    /**
     * <code>string txUUIDStr = 2;</code>
     * @return The txUUIDStr.
     */
    public java.lang.String getTxUUIDStr() {
      java.lang.Object ref = txUUIDStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        txUUIDStr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string txUUIDStr = 2;</code>
     * @return The bytes for txUUIDStr.
     */
    public com.google.protobuf.ByteString
        getTxUUIDStrBytes() {
      java.lang.Object ref = txUUIDStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txUUIDStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string txUUIDStr = 2;</code>
     * @param value The txUUIDStr to set.
     * @return This builder for chaining.
     */
    public Builder setTxUUIDStr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      txUUIDStr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string txUUIDStr = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTxUUIDStr() {
      txUUIDStr_ = getDefaultInstance().getTxUUIDStr();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string txUUIDStr = 2;</code>
     * @param value The bytes for txUUIDStr to set.
     * @return This builder for chaining.
     */
    public Builder setTxUUIDStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      txUUIDStr_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:manager.PFateId)
  }

  // @@protoc_insertion_point(class_scope:manager.PFateId)
  private static final org.apache.accumulo.core.compaction.protobuf.PFateId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.accumulo.core.compaction.protobuf.PFateId();
  }

  public static org.apache.accumulo.core.compaction.protobuf.PFateId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PFateId>
      PARSER = new com.google.protobuf.AbstractParser<PFateId>() {
    @java.lang.Override
    public PFateId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PFateId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PFateId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.accumulo.core.compaction.protobuf.PFateId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
