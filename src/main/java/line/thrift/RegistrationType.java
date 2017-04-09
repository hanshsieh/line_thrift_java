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

public enum RegistrationType implements org.apache.thrift.TEnum {
  PHONE(0),
  EMAIL_WAP(1),
  FACEBOOK(2305),
  SINA(2306),
  RENREN(2307),
  FEIXIN(2308);

  private final int value;

  private RegistrationType(int value) {
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
  public static RegistrationType findByValue(int value) { 
    switch (value) {
      case 0:
        return PHONE;
      case 1:
        return EMAIL_WAP;
      case 2305:
        return FACEBOOK;
      case 2306:
        return SINA;
      case 2307:
        return RENREN;
      case 2308:
        return FEIXIN;
      default:
        return null;
    }
  }
}
