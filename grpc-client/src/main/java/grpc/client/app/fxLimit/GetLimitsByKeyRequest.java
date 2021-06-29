// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fxLimit.proto

package grpc.client.app.fxLimit;

/**
 * <pre>
 * The request to get limits by key
 * </pre>
 *
 * Protobuf type {@code grpc_limits.GetLimitsByKeyRequest}
 */
public  final class GetLimitsByKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc_limits.GetLimitsByKeyRequest)
    GetLimitsByKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetLimitsByKeyRequest.newBuilder() to construct.
  private GetLimitsByKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetLimitsByKeyRequest() {
    revokedFilter_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetLimitsByKeyRequest(
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
            grpc.client.app.fxLimit.LimitKey.Builder subBuilder = null;
            if (limitKey_ != null) {
              subBuilder = limitKey_.toBuilder();
            }
            limitKey_ = input.readMessage(grpc.client.app.fxLimit.LimitKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(limitKey_);
              limitKey_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            revokedFilter_ = rawValue;
            break;
          }
          case 26: {
            grpc.client.app.fxLimit.Paginator.Builder subBuilder = null;
            if (paginator_ != null) {
              subBuilder = paginator_.toBuilder();
            }
            paginator_ = input.readMessage(grpc.client.app.fxLimit.Paginator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(paginator_);
              paginator_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return grpc.client.app.fxLimit.FxLimit.internal_static_grpc_limits_GetLimitsByKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.client.app.fxLimit.FxLimit.internal_static_grpc_limits_GetLimitsByKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.client.app.fxLimit.GetLimitsByKeyRequest.class, grpc.client.app.fxLimit.GetLimitsByKeyRequest.Builder.class);
  }

  public static final int LIMITKEY_FIELD_NUMBER = 1;
  private grpc.client.app.fxLimit.LimitKey limitKey_;
  /**
   * <code>.grpc_limits.LimitKey limitKey = 1;</code>
   */
  public boolean hasLimitKey() {
    return limitKey_ != null;
  }
  /**
   * <code>.grpc_limits.LimitKey limitKey = 1;</code>
   */
  public grpc.client.app.fxLimit.LimitKey getLimitKey() {
    return limitKey_ == null ? grpc.client.app.fxLimit.LimitKey.getDefaultInstance() : limitKey_;
  }
  /**
   * <code>.grpc_limits.LimitKey limitKey = 1;</code>
   */
  public grpc.client.app.fxLimit.LimitKeyOrBuilder getLimitKeyOrBuilder() {
    return getLimitKey();
  }

  public static final int REVOKEDFILTER_FIELD_NUMBER = 2;
  private int revokedFilter_;
  /**
   * <code>.grpc_limits.RevokedFilter revokedFilter = 2;</code>
   */
  public int getRevokedFilterValue() {
    return revokedFilter_;
  }
  /**
   * <code>.grpc_limits.RevokedFilter revokedFilter = 2;</code>
   */
  public grpc.client.app.fxLimit.RevokedFilter getRevokedFilter() {
    @SuppressWarnings("deprecation")
    grpc.client.app.fxLimit.RevokedFilter result = grpc.client.app.fxLimit.RevokedFilter.valueOf(revokedFilter_);
    return result == null ? grpc.client.app.fxLimit.RevokedFilter.UNRECOGNIZED : result;
  }

  public static final int PAGINATOR_FIELD_NUMBER = 3;
  private grpc.client.app.fxLimit.Paginator paginator_;
  /**
   * <code>.grpc_limits.Paginator paginator = 3;</code>
   */
  public boolean hasPaginator() {
    return paginator_ != null;
  }
  /**
   * <code>.grpc_limits.Paginator paginator = 3;</code>
   */
  public grpc.client.app.fxLimit.Paginator getPaginator() {
    return paginator_ == null ? grpc.client.app.fxLimit.Paginator.getDefaultInstance() : paginator_;
  }
  /**
   * <code>.grpc_limits.Paginator paginator = 3;</code>
   */
  public grpc.client.app.fxLimit.PaginatorOrBuilder getPaginatorOrBuilder() {
    return getPaginator();
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
    if (limitKey_ != null) {
      output.writeMessage(1, getLimitKey());
    }
    if (revokedFilter_ != grpc.client.app.fxLimit.RevokedFilter.ALL_LIMITS.getNumber()) {
      output.writeEnum(2, revokedFilter_);
    }
    if (paginator_ != null) {
      output.writeMessage(3, getPaginator());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (limitKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLimitKey());
    }
    if (revokedFilter_ != grpc.client.app.fxLimit.RevokedFilter.ALL_LIMITS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, revokedFilter_);
    }
    if (paginator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPaginator());
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
    if (!(obj instanceof grpc.client.app.fxLimit.GetLimitsByKeyRequest)) {
      return super.equals(obj);
    }
    grpc.client.app.fxLimit.GetLimitsByKeyRequest other = (grpc.client.app.fxLimit.GetLimitsByKeyRequest) obj;

    boolean result = true;
    result = result && (hasLimitKey() == other.hasLimitKey());
    if (hasLimitKey()) {
      result = result && getLimitKey()
          .equals(other.getLimitKey());
    }
    result = result && revokedFilter_ == other.revokedFilter_;
    result = result && (hasPaginator() == other.hasPaginator());
    if (hasPaginator()) {
      result = result && getPaginator()
          .equals(other.getPaginator());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLimitKey()) {
      hash = (37 * hash) + LIMITKEY_FIELD_NUMBER;
      hash = (53 * hash) + getLimitKey().hashCode();
    }
    hash = (37 * hash) + REVOKEDFILTER_FIELD_NUMBER;
    hash = (53 * hash) + revokedFilter_;
    if (hasPaginator()) {
      hash = (37 * hash) + PAGINATOR_FIELD_NUMBER;
      hash = (53 * hash) + getPaginator().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest parseFrom(
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
  public static Builder newBuilder(grpc.client.app.fxLimit.GetLimitsByKeyRequest prototype) {
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
   * <pre>
   * The request to get limits by key
   * </pre>
   *
   * Protobuf type {@code grpc_limits.GetLimitsByKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc_limits.GetLimitsByKeyRequest)
      grpc.client.app.fxLimit.GetLimitsByKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.client.app.fxLimit.FxLimit.internal_static_grpc_limits_GetLimitsByKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.client.app.fxLimit.FxLimit.internal_static_grpc_limits_GetLimitsByKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.client.app.fxLimit.GetLimitsByKeyRequest.class, grpc.client.app.fxLimit.GetLimitsByKeyRequest.Builder.class);
    }

    // Construct using grpc.client.app.fxLimit.GetLimitsByKeyRequest.newBuilder()
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
      if (limitKeyBuilder_ == null) {
        limitKey_ = null;
      } else {
        limitKey_ = null;
        limitKeyBuilder_ = null;
      }
      revokedFilter_ = 0;

      if (paginatorBuilder_ == null) {
        paginator_ = null;
      } else {
        paginator_ = null;
        paginatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.client.app.fxLimit.FxLimit.internal_static_grpc_limits_GetLimitsByKeyRequest_descriptor;
    }

    @java.lang.Override
    public grpc.client.app.fxLimit.GetLimitsByKeyRequest getDefaultInstanceForType() {
      return grpc.client.app.fxLimit.GetLimitsByKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.client.app.fxLimit.GetLimitsByKeyRequest build() {
      grpc.client.app.fxLimit.GetLimitsByKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.client.app.fxLimit.GetLimitsByKeyRequest buildPartial() {
      grpc.client.app.fxLimit.GetLimitsByKeyRequest result = new grpc.client.app.fxLimit.GetLimitsByKeyRequest(this);
      if (limitKeyBuilder_ == null) {
        result.limitKey_ = limitKey_;
      } else {
        result.limitKey_ = limitKeyBuilder_.build();
      }
      result.revokedFilter_ = revokedFilter_;
      if (paginatorBuilder_ == null) {
        result.paginator_ = paginator_;
      } else {
        result.paginator_ = paginatorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.client.app.fxLimit.GetLimitsByKeyRequest) {
        return mergeFrom((grpc.client.app.fxLimit.GetLimitsByKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.client.app.fxLimit.GetLimitsByKeyRequest other) {
      if (other == grpc.client.app.fxLimit.GetLimitsByKeyRequest.getDefaultInstance()) return this;
      if (other.hasLimitKey()) {
        mergeLimitKey(other.getLimitKey());
      }
      if (other.revokedFilter_ != 0) {
        setRevokedFilterValue(other.getRevokedFilterValue());
      }
      if (other.hasPaginator()) {
        mergePaginator(other.getPaginator());
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
      grpc.client.app.fxLimit.GetLimitsByKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.client.app.fxLimit.GetLimitsByKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private grpc.client.app.fxLimit.LimitKey limitKey_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.client.app.fxLimit.LimitKey, grpc.client.app.fxLimit.LimitKey.Builder, grpc.client.app.fxLimit.LimitKeyOrBuilder> limitKeyBuilder_;
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public boolean hasLimitKey() {
      return limitKeyBuilder_ != null || limitKey_ != null;
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public grpc.client.app.fxLimit.LimitKey getLimitKey() {
      if (limitKeyBuilder_ == null) {
        return limitKey_ == null ? grpc.client.app.fxLimit.LimitKey.getDefaultInstance() : limitKey_;
      } else {
        return limitKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public Builder setLimitKey(grpc.client.app.fxLimit.LimitKey value) {
      if (limitKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        limitKey_ = value;
        onChanged();
      } else {
        limitKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public Builder setLimitKey(
        grpc.client.app.fxLimit.LimitKey.Builder builderForValue) {
      if (limitKeyBuilder_ == null) {
        limitKey_ = builderForValue.build();
        onChanged();
      } else {
        limitKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public Builder mergeLimitKey(grpc.client.app.fxLimit.LimitKey value) {
      if (limitKeyBuilder_ == null) {
        if (limitKey_ != null) {
          limitKey_ =
            grpc.client.app.fxLimit.LimitKey.newBuilder(limitKey_).mergeFrom(value).buildPartial();
        } else {
          limitKey_ = value;
        }
        onChanged();
      } else {
        limitKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public Builder clearLimitKey() {
      if (limitKeyBuilder_ == null) {
        limitKey_ = null;
        onChanged();
      } else {
        limitKey_ = null;
        limitKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public grpc.client.app.fxLimit.LimitKey.Builder getLimitKeyBuilder() {
      
      onChanged();
      return getLimitKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    public grpc.client.app.fxLimit.LimitKeyOrBuilder getLimitKeyOrBuilder() {
      if (limitKeyBuilder_ != null) {
        return limitKeyBuilder_.getMessageOrBuilder();
      } else {
        return limitKey_ == null ?
            grpc.client.app.fxLimit.LimitKey.getDefaultInstance() : limitKey_;
      }
    }
    /**
     * <code>.grpc_limits.LimitKey limitKey = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.client.app.fxLimit.LimitKey, grpc.client.app.fxLimit.LimitKey.Builder, grpc.client.app.fxLimit.LimitKeyOrBuilder> 
        getLimitKeyFieldBuilder() {
      if (limitKeyBuilder_ == null) {
        limitKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            grpc.client.app.fxLimit.LimitKey, grpc.client.app.fxLimit.LimitKey.Builder, grpc.client.app.fxLimit.LimitKeyOrBuilder>(
                getLimitKey(),
                getParentForChildren(),
                isClean());
        limitKey_ = null;
      }
      return limitKeyBuilder_;
    }

    private int revokedFilter_ = 0;
    /**
     * <code>.grpc_limits.RevokedFilter revokedFilter = 2;</code>
     */
    public int getRevokedFilterValue() {
      return revokedFilter_;
    }
    /**
     * <code>.grpc_limits.RevokedFilter revokedFilter = 2;</code>
     */
    public Builder setRevokedFilterValue(int value) {
      revokedFilter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc_limits.RevokedFilter revokedFilter = 2;</code>
     */
    public grpc.client.app.fxLimit.RevokedFilter getRevokedFilter() {
      @SuppressWarnings("deprecation")
      grpc.client.app.fxLimit.RevokedFilter result = grpc.client.app.fxLimit.RevokedFilter.valueOf(revokedFilter_);
      return result == null ? grpc.client.app.fxLimit.RevokedFilter.UNRECOGNIZED : result;
    }
    /**
     * <code>.grpc_limits.RevokedFilter revokedFilter = 2;</code>
     */
    public Builder setRevokedFilter(grpc.client.app.fxLimit.RevokedFilter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      revokedFilter_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.grpc_limits.RevokedFilter revokedFilter = 2;</code>
     */
    public Builder clearRevokedFilter() {
      
      revokedFilter_ = 0;
      onChanged();
      return this;
    }

    private grpc.client.app.fxLimit.Paginator paginator_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.client.app.fxLimit.Paginator, grpc.client.app.fxLimit.Paginator.Builder, grpc.client.app.fxLimit.PaginatorOrBuilder> paginatorBuilder_;
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public boolean hasPaginator() {
      return paginatorBuilder_ != null || paginator_ != null;
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public grpc.client.app.fxLimit.Paginator getPaginator() {
      if (paginatorBuilder_ == null) {
        return paginator_ == null ? grpc.client.app.fxLimit.Paginator.getDefaultInstance() : paginator_;
      } else {
        return paginatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public Builder setPaginator(grpc.client.app.fxLimit.Paginator value) {
      if (paginatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        paginator_ = value;
        onChanged();
      } else {
        paginatorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public Builder setPaginator(
        grpc.client.app.fxLimit.Paginator.Builder builderForValue) {
      if (paginatorBuilder_ == null) {
        paginator_ = builderForValue.build();
        onChanged();
      } else {
        paginatorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public Builder mergePaginator(grpc.client.app.fxLimit.Paginator value) {
      if (paginatorBuilder_ == null) {
        if (paginator_ != null) {
          paginator_ =
            grpc.client.app.fxLimit.Paginator.newBuilder(paginator_).mergeFrom(value).buildPartial();
        } else {
          paginator_ = value;
        }
        onChanged();
      } else {
        paginatorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public Builder clearPaginator() {
      if (paginatorBuilder_ == null) {
        paginator_ = null;
        onChanged();
      } else {
        paginator_ = null;
        paginatorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public grpc.client.app.fxLimit.Paginator.Builder getPaginatorBuilder() {
      
      onChanged();
      return getPaginatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    public grpc.client.app.fxLimit.PaginatorOrBuilder getPaginatorOrBuilder() {
      if (paginatorBuilder_ != null) {
        return paginatorBuilder_.getMessageOrBuilder();
      } else {
        return paginator_ == null ?
            grpc.client.app.fxLimit.Paginator.getDefaultInstance() : paginator_;
      }
    }
    /**
     * <code>.grpc_limits.Paginator paginator = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.client.app.fxLimit.Paginator, grpc.client.app.fxLimit.Paginator.Builder, grpc.client.app.fxLimit.PaginatorOrBuilder> 
        getPaginatorFieldBuilder() {
      if (paginatorBuilder_ == null) {
        paginatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            grpc.client.app.fxLimit.Paginator, grpc.client.app.fxLimit.Paginator.Builder, grpc.client.app.fxLimit.PaginatorOrBuilder>(
                getPaginator(),
                getParentForChildren(),
                isClean());
        paginator_ = null;
      }
      return paginatorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc_limits.GetLimitsByKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc_limits.GetLimitsByKeyRequest)
  private static final grpc.client.app.fxLimit.GetLimitsByKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.client.app.fxLimit.GetLimitsByKeyRequest();
  }

  public static grpc.client.app.fxLimit.GetLimitsByKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLimitsByKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetLimitsByKeyRequest>() {
    @java.lang.Override
    public GetLimitsByKeyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetLimitsByKeyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetLimitsByKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLimitsByKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.client.app.fxLimit.GetLimitsByKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
