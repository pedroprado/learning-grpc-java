// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fxLimit.proto

package grpc.server.app.fxLimit;

/**
 * <pre>
 * Event types
 * </pre>
 *
 * Protobuf enum {@code grpc_limits.EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ALL_EVENTS = 0;</code>
   */
  ALL_EVENTS(0),
  /**
   * <code>CREATE_LIMIT = 1;</code>
   */
  CREATE_LIMIT(1),
  /**
   * <code>INCREASE_AMOUNT_LIMIT = 2;</code>
   */
  INCREASE_AMOUNT_LIMIT(2),
  /**
   * <code>RENEW_LIMIT = 3;</code>
   */
  RENEW_LIMIT(3),
  /**
   * <code>REVOKE_LIMIT = 4;</code>
   */
  REVOKE_LIMIT(4),
  /**
   * <code>TRANSACTION = 5;</code>
   */
  TRANSACTION(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ALL_EVENTS = 0;</code>
   */
  public static final int ALL_EVENTS_VALUE = 0;
  /**
   * <code>CREATE_LIMIT = 1;</code>
   */
  public static final int CREATE_LIMIT_VALUE = 1;
  /**
   * <code>INCREASE_AMOUNT_LIMIT = 2;</code>
   */
  public static final int INCREASE_AMOUNT_LIMIT_VALUE = 2;
  /**
   * <code>RENEW_LIMIT = 3;</code>
   */
  public static final int RENEW_LIMIT_VALUE = 3;
  /**
   * <code>REVOKE_LIMIT = 4;</code>
   */
  public static final int REVOKE_LIMIT_VALUE = 4;
  /**
   * <code>TRANSACTION = 5;</code>
   */
  public static final int TRANSACTION_VALUE = 5;


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
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return ALL_EVENTS;
      case 1: return CREATE_LIMIT;
      case 2: return INCREASE_AMOUNT_LIMIT;
      case 3: return RENEW_LIMIT;
      case 4: return REVOKE_LIMIT;
      case 5: return TRANSACTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
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
    return grpc.server.app.fxLimit.FxLimit.getDescriptor().getEnumTypes().get(3);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
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

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpc_limits.EventType)
}

