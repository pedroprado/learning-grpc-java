// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fxLimit.proto

package grpc.client.app.fxLimit;

/**
 * <pre>
 * Limit types
 * </pre>
 *
 * Protobuf enum {@code grpc_limits.LimitType}
 */
public enum LimitType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_TYPE = 0;</code>
   */
  UNKNOWN_TYPE(0),
  /**
   * <code>BUY_CURRENCY = 1;</code>
   */
  BUY_CURRENCY(1),
  /**
   * <code>SELL_CURRENCY = 2;</code>
   */
  SELL_CURRENCY(2),
  /**
   * <code>IMPORT = 3;</code>
   */
  IMPORT(3),
  /**
   * <code>EXPORT = 4;</code>
   */
  EXPORT(4),
  /**
   * <code>GENERAL = 5;</code>
   */
  GENERAL(5),
  /**
   * <code>TED = 6;</code>
   */
  TED(6),
  /**
   * <code>PIX = 7;</code>
   */
  PIX(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_TYPE = 0;</code>
   */
  public static final int UNKNOWN_TYPE_VALUE = 0;
  /**
   * <code>BUY_CURRENCY = 1;</code>
   */
  public static final int BUY_CURRENCY_VALUE = 1;
  /**
   * <code>SELL_CURRENCY = 2;</code>
   */
  public static final int SELL_CURRENCY_VALUE = 2;
  /**
   * <code>IMPORT = 3;</code>
   */
  public static final int IMPORT_VALUE = 3;
  /**
   * <code>EXPORT = 4;</code>
   */
  public static final int EXPORT_VALUE = 4;
  /**
   * <code>GENERAL = 5;</code>
   */
  public static final int GENERAL_VALUE = 5;
  /**
   * <code>TED = 6;</code>
   */
  public static final int TED_VALUE = 6;
  /**
   * <code>PIX = 7;</code>
   */
  public static final int PIX_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LimitType valueOf(int value) {
    return forNumber(value);
  }

  public static LimitType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_TYPE;
      case 1: return BUY_CURRENCY;
      case 2: return SELL_CURRENCY;
      case 3: return IMPORT;
      case 4: return EXPORT;
      case 5: return GENERAL;
      case 6: return TED;
      case 7: return PIX;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LimitType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LimitType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LimitType>() {
          public LimitType findValueByNumber(int number) {
            return LimitType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return grpc.client.app.fxLimit.FxLimit.getDescriptor().getEnumTypes().get(1);
  }

  private static final LimitType[] VALUES = values();

  public static LimitType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LimitType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpc_limits.LimitType)
}

