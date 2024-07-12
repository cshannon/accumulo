// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tabletserver.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

/**
 * Protobuf type {@code tablet_server.PInputFile}
 */
public final class PInputFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tablet_server.PInputFile)
    PInputFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PInputFile.newBuilder() to construct.
  private PInputFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PInputFile() {
    metadataFileEntry_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PInputFile();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.accumulo.core.compaction.protobuf.TabletServerProto.internal_static_tablet_server_PInputFile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.accumulo.core.compaction.protobuf.TabletServerProto.internal_static_tablet_server_PInputFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.accumulo.core.compaction.protobuf.PInputFile.class, org.apache.accumulo.core.compaction.protobuf.PInputFile.Builder.class);
  }

  public static final int METADATAFILEENTRY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object metadataFileEntry_ = "";
  /**
   * <pre>
   * This is nullable in Thrift but I am not marking as optional as
   * I think it should always be set
   * </pre>
   *
   * <code>string metadataFileEntry = 1;</code>
   * @return The metadataFileEntry.
   */
  @java.lang.Override
  public java.lang.String getMetadataFileEntry() {
    java.lang.Object ref = metadataFileEntry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadataFileEntry_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is nullable in Thrift but I am not marking as optional as
   * I think it should always be set
   * </pre>
   *
   * <code>string metadataFileEntry = 1;</code>
   * @return The bytes for metadataFileEntry.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetadataFileEntryBytes() {
    java.lang.Object ref = metadataFileEntry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metadataFileEntry_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private long size_ = 0L;
  /**
   * <code>int64 size = 2;</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }

  public static final int ENTRIES_FIELD_NUMBER = 3;
  private long entries_ = 0L;
  /**
   * <code>int64 entries = 3;</code>
   * @return The entries.
   */
  @java.lang.Override
  public long getEntries() {
    return entries_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private long timestamp_ = 0L;
  /**
   * <code>int64 timestamp = 4;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataFileEntry_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metadataFileEntry_);
    }
    if (size_ != 0L) {
      output.writeInt64(2, size_);
    }
    if (entries_ != 0L) {
      output.writeInt64(3, entries_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(4, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataFileEntry_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metadataFileEntry_);
    }
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, size_);
    }
    if (entries_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, entries_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, timestamp_);
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
    if (!(obj instanceof org.apache.accumulo.core.compaction.protobuf.PInputFile)) {
      return super.equals(obj);
    }
    org.apache.accumulo.core.compaction.protobuf.PInputFile other = (org.apache.accumulo.core.compaction.protobuf.PInputFile) obj;

    if (!getMetadataFileEntry()
        .equals(other.getMetadataFileEntry())) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getEntries()
        != other.getEntries()) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + METADATAFILEENTRY_FIELD_NUMBER;
    hash = (53 * hash) + getMetadataFileEntry().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEntries());
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PInputFile parseFrom(
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
  public static Builder newBuilder(org.apache.accumulo.core.compaction.protobuf.PInputFile prototype) {
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
   * Protobuf type {@code tablet_server.PInputFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tablet_server.PInputFile)
      org.apache.accumulo.core.compaction.protobuf.PInputFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.accumulo.core.compaction.protobuf.TabletServerProto.internal_static_tablet_server_PInputFile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.accumulo.core.compaction.protobuf.TabletServerProto.internal_static_tablet_server_PInputFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.accumulo.core.compaction.protobuf.PInputFile.class, org.apache.accumulo.core.compaction.protobuf.PInputFile.Builder.class);
    }

    // Construct using org.apache.accumulo.core.compaction.protobuf.PInputFile.newBuilder()
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
      metadataFileEntry_ = "";
      size_ = 0L;
      entries_ = 0L;
      timestamp_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.accumulo.core.compaction.protobuf.TabletServerProto.internal_static_tablet_server_PInputFile_descriptor;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PInputFile getDefaultInstanceForType() {
      return org.apache.accumulo.core.compaction.protobuf.PInputFile.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PInputFile build() {
      org.apache.accumulo.core.compaction.protobuf.PInputFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PInputFile buildPartial() {
      org.apache.accumulo.core.compaction.protobuf.PInputFile result = new org.apache.accumulo.core.compaction.protobuf.PInputFile(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.accumulo.core.compaction.protobuf.PInputFile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metadataFileEntry_ = metadataFileEntry_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.size_ = size_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.entries_ = entries_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.timestamp_ = timestamp_;
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
      if (other instanceof org.apache.accumulo.core.compaction.protobuf.PInputFile) {
        return mergeFrom((org.apache.accumulo.core.compaction.protobuf.PInputFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.accumulo.core.compaction.protobuf.PInputFile other) {
      if (other == org.apache.accumulo.core.compaction.protobuf.PInputFile.getDefaultInstance()) return this;
      if (!other.getMetadataFileEntry().isEmpty()) {
        metadataFileEntry_ = other.metadataFileEntry_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (other.getEntries() != 0L) {
        setEntries(other.getEntries());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
              metadataFileEntry_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              size_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              entries_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              timestamp_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object metadataFileEntry_ = "";
    /**
     * <pre>
     * This is nullable in Thrift but I am not marking as optional as
     * I think it should always be set
     * </pre>
     *
     * <code>string metadataFileEntry = 1;</code>
     * @return The metadataFileEntry.
     */
    public java.lang.String getMetadataFileEntry() {
      java.lang.Object ref = metadataFileEntry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadataFileEntry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is nullable in Thrift but I am not marking as optional as
     * I think it should always be set
     * </pre>
     *
     * <code>string metadataFileEntry = 1;</code>
     * @return The bytes for metadataFileEntry.
     */
    public com.google.protobuf.ByteString
        getMetadataFileEntryBytes() {
      java.lang.Object ref = metadataFileEntry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metadataFileEntry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is nullable in Thrift but I am not marking as optional as
     * I think it should always be set
     * </pre>
     *
     * <code>string metadataFileEntry = 1;</code>
     * @param value The metadataFileEntry to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataFileEntry(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      metadataFileEntry_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is nullable in Thrift but I am not marking as optional as
     * I think it should always be set
     * </pre>
     *
     * <code>string metadataFileEntry = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadataFileEntry() {
      metadataFileEntry_ = getDefaultInstance().getMetadataFileEntry();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is nullable in Thrift but I am not marking as optional as
     * I think it should always be set
     * </pre>
     *
     * <code>string metadataFileEntry = 1;</code>
     * @param value The bytes for metadataFileEntry to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataFileEntryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      metadataFileEntry_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long size_ ;
    /**
     * <code>int64 size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <code>int64 size = 2;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {

      size_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      size_ = 0L;
      onChanged();
      return this;
    }

    private long entries_ ;
    /**
     * <code>int64 entries = 3;</code>
     * @return The entries.
     */
    @java.lang.Override
    public long getEntries() {
      return entries_;
    }
    /**
     * <code>int64 entries = 3;</code>
     * @param value The entries to set.
     * @return This builder for chaining.
     */
    public Builder setEntries(long value) {

      entries_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 entries = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntries() {
      bitField0_ = (bitField0_ & ~0x00000004);
      entries_ = 0L;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 4;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 4;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000008);
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tablet_server.PInputFile)
  }

  // @@protoc_insertion_point(class_scope:tablet_server.PInputFile)
  private static final org.apache.accumulo.core.compaction.protobuf.PInputFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.accumulo.core.compaction.protobuf.PInputFile();
  }

  public static org.apache.accumulo.core.compaction.protobuf.PInputFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PInputFile>
      PARSER = new com.google.protobuf.AbstractParser<PInputFile>() {
    @java.lang.Override
    public PInputFile parsePartialFrom(
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

  public static com.google.protobuf.Parser<PInputFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PInputFile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.accumulo.core.compaction.protobuf.PInputFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

