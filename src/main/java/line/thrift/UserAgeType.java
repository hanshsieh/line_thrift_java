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

public enum UserAgeType implements org.apache.thrift.TEnum {
  OVER(1),
  UNDER(2),
  UNDEFINED(3);

  private final int value;

  private UserAgeType(int value) {
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
  public static UserAgeType findByValue(int value) { 
    switch (value) {
      case 1:
        return OVER;
      case 2:
        return UNDER;
      case 3:
        return UNDEFINED;
      default:
        return null;
    }
  }
}
