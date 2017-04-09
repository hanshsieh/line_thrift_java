/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ChannelConfiguration implements org.apache.thrift.TEnum {
  MESSAGE(0),
  MESSAGE_NOTIFICATION(1),
  NOTIFICATION_CENTER(2);

  private final int value;

  private ChannelConfiguration(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ChannelConfiguration findByValue(int value) { 
    switch (value) {
      case 0:
        return MESSAGE;
      case 1:
        return MESSAGE_NOTIFICATION;
      case 2:
        return NOTIFICATION_CENTER;
      default:
        return null;
    }
  }
}
