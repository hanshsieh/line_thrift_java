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

public enum CustomMode implements org.apache.thrift.TEnum {
  PROMOTION_FRIENDS_INVITE(1),
  CAPABILITY_SERVER_SIDE_SMS(2),
  LINE_CLIENT_ANALYTICS_CONFIGURATION(3);

  private final int value;

  private CustomMode(int value) {
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
  public static CustomMode findByValue(int value) { 
    switch (value) {
      case 1:
        return PROMOTION_FRIENDS_INVITE;
      case 2:
        return CAPABILITY_SERVER_SIDE_SMS;
      case 3:
        return LINE_CLIENT_ANALYTICS_CONFIGURATION;
      default:
        return null;
    }
  }
}
