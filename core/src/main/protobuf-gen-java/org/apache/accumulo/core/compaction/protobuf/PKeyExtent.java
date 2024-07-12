// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

/**
 * Protobuf type {@code data.PKeyExtent}
 */
public final class PKeyExtent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.PKeyExtent)
    PKeyExtentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PKeyExtent.newBuilder() to construct.
  private PKeyExtent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PKeyExtent() {
    table_ = com.google.protobuf.ByteString.EMPTY;
    endRow_ = com.google.protobuf.ByteString.EMPTY;
    prevEndRow_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PKeyExtent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.accumulo.core.compaction.protobuf.DataProto.internal_static_data_PKeyExtent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.accumulo.core.compaction.protobuf.DataProto.internal_static_data_PKeyExtent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.accumulo.core.compaction.protobuf.PKeyExtent.class, org.apache.accumulo.core.compaction.protobuf.PKeyExtent.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString table_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes table = 1;</code>
   * @return The table.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTable() {
    return table_;
  }

  public static final int ENDROW_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString endRow_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * optional to generate hasEndRow() and hasPrevEndRow() becuase
   * of no nulls in protobuf
   * </pre>
   *
   * <code>optional bytes endRow = 2;</code>
   * @return Whether the endRow field is set.
   */
  @java.lang.Override
  public boolean hasEndRow() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * optional to generate hasEndRow() and hasPrevEndRow() becuase
   * of no nulls in protobuf
   * </pre>
   *
   * <code>optional bytes endRow = 2;</code>
   * @return The endRow.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEndRow() {
    return endRow_;
  }

  public static final int PREVENDROW_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString prevEndRow_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>optional bytes prevEndRow = 3;</code>
   * @return Whether the prevEndRow field is set.
   */
  @java.lang.Override
  public boolean hasPrevEndRow() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes prevEndRow = 3;</code>
   * @return The prevEndRow.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrevEndRow() {
    return prevEndRow_;
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
    if (!table_.isEmpty()) {
      output.writeBytes(1, table_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBytes(2, endRow_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(3, prevEndRow_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!table_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, table_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, endRow_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, prevEndRow_);
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
    if (!(obj instanceof org.apache.accumulo.core.compaction.protobuf.PKeyExtent)) {
      return super.equals(obj);
    }
    org.apache.accumulo.core.compaction.protobuf.PKeyExtent other = (org.apache.accumulo.core.compaction.protobuf.PKeyExtent) obj;

    if (!getTable()
        .equals(other.getTable())) return false;
    if (hasEndRow() != other.hasEndRow()) return false;
    if (hasEndRow()) {
      if (!getEndRow()
          .equals(other.getEndRow())) return false;
    }
    if (hasPrevEndRow() != other.hasPrevEndRow()) return false;
    if (hasPrevEndRow()) {
      if (!getPrevEndRow()
          .equals(other.getPrevEndRow())) return false;
    }
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
    hash = (37 * hash) + TABLE_FIELD_NUMBER;
    hash = (53 * hash) + getTable().hashCode();
    if (hasEndRow()) {
      hash = (37 * hash) + ENDROW_FIELD_NUMBER;
      hash = (53 * hash) + getEndRow().hashCode();
    }
    if (hasPrevEndRow()) {
      hash = (37 * hash) + PREVENDROW_FIELD_NUMBER;
      hash = (53 * hash) + getPrevEndRow().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent parseFrom(
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
  public static Builder newBuilder(org.apache.accumulo.core.compaction.protobuf.PKeyExtent prototype) {
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
   * Protobuf type {@code data.PKeyExtent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.PKeyExtent)
      org.apache.accumulo.core.compaction.protobuf.PKeyExtentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.accumulo.core.compaction.protobuf.DataProto.internal_static_data_PKeyExtent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.accumulo.core.compaction.protobuf.DataProto.internal_static_data_PKeyExtent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.accumulo.core.compaction.protobuf.PKeyExtent.class, org.apache.accumulo.core.compaction.protobuf.PKeyExtent.Builder.class);
    }

    // Construct using org.apache.accumulo.core.compaction.protobuf.PKeyExtent.newBuilder()
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
      table_ = com.google.protobuf.ByteString.EMPTY;
      endRow_ = com.google.protobuf.ByteString.EMPTY;
      prevEndRow_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.accumulo.core.compaction.protobuf.DataProto.internal_static_data_PKeyExtent_descriptor;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PKeyExtent getDefaultInstanceForType() {
      return org.apache.accumulo.core.compaction.protobuf.PKeyExtent.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PKeyExtent build() {
      org.apache.accumulo.core.compaction.protobuf.PKeyExtent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PKeyExtent buildPartial() {
      org.apache.accumulo.core.compaction.protobuf.PKeyExtent result = new org.apache.accumulo.core.compaction.protobuf.PKeyExtent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.accumulo.core.compaction.protobuf.PKeyExtent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.table_ = table_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endRow_ = endRow_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.prevEndRow_ = prevEndRow_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof org.apache.accumulo.core.compaction.protobuf.PKeyExtent) {
        return mergeFrom((org.apache.accumulo.core.compaction.protobuf.PKeyExtent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.accumulo.core.compaction.protobuf.PKeyExtent other) {
      if (other == org.apache.accumulo.core.compaction.protobuf.PKeyExtent.getDefaultInstance()) return this;
      if (other.getTable() != com.google.protobuf.ByteString.EMPTY) {
        setTable(other.getTable());
      }
      if (other.hasEndRow()) {
        setEndRow(other.getEndRow());
      }
      if (other.hasPrevEndRow()) {
        setPrevEndRow(other.getPrevEndRow());
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
            case 10: {
              table_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              endRow_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              prevEndRow_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.google.protobuf.ByteString table_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes table = 1;</code>
     * @return The table.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTable() {
      return table_;
    }
    /**
     * <code>bytes table = 1;</code>
     * @param value The table to set.
     * @return This builder for chaining.
     */
    public Builder setTable(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      table_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes table = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTable() {
      bitField0_ = (bitField0_ & ~0x00000001);
      table_ = getDefaultInstance().getTable();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString endRow_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * optional to generate hasEndRow() and hasPrevEndRow() becuase
     * of no nulls in protobuf
     * </pre>
     *
     * <code>optional bytes endRow = 2;</code>
     * @return Whether the endRow field is set.
     */
    @java.lang.Override
    public boolean hasEndRow() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * optional to generate hasEndRow() and hasPrevEndRow() becuase
     * of no nulls in protobuf
     * </pre>
     *
     * <code>optional bytes endRow = 2;</code>
     * @return The endRow.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEndRow() {
      return endRow_;
    }
    /**
     * <pre>
     * optional to generate hasEndRow() and hasPrevEndRow() becuase
     * of no nulls in protobuf
     * </pre>
     *
     * <code>optional bytes endRow = 2;</code>
     * @param value The endRow to set.
     * @return This builder for chaining.
     */
    public Builder setEndRow(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      endRow_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional to generate hasEndRow() and hasPrevEndRow() becuase
     * of no nulls in protobuf
     * </pre>
     *
     * <code>optional bytes endRow = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndRow() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endRow_ = getDefaultInstance().getEndRow();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString prevEndRow_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes prevEndRow = 3;</code>
     * @return Whether the prevEndRow field is set.
     */
    @java.lang.Override
    public boolean hasPrevEndRow() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes prevEndRow = 3;</code>
     * @return The prevEndRow.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPrevEndRow() {
      return prevEndRow_;
    }
    /**
     * <code>optional bytes prevEndRow = 3;</code>
     * @param value The prevEndRow to set.
     * @return This builder for chaining.
     */
    public Builder setPrevEndRow(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      prevEndRow_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes prevEndRow = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrevEndRow() {
      bitField0_ = (bitField0_ & ~0x00000004);
      prevEndRow_ = getDefaultInstance().getPrevEndRow();
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


    // @@protoc_insertion_point(builder_scope:data.PKeyExtent)
  }

  // @@protoc_insertion_point(class_scope:data.PKeyExtent)
  private static final org.apache.accumulo.core.compaction.protobuf.PKeyExtent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.accumulo.core.compaction.protobuf.PKeyExtent();
  }

  public static org.apache.accumulo.core.compaction.protobuf.PKeyExtent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PKeyExtent>
      PARSER = new com.google.protobuf.AbstractParser<PKeyExtent>() {
    @java.lang.Override
    public PKeyExtent parsePartialFrom(
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

  public static com.google.protobuf.Parser<PKeyExtent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PKeyExtent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.accumulo.core.compaction.protobuf.PKeyExtent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

