/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line.thrift;


public enum EmailConfirmationType implements org.apache.thrift.TEnum {
  SERVER_SIDE_EMAIL(0),
  CLIENT_SIDE_EMAIL(1);

  private final int value;

  private EmailConfirmationType(int value) {
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
  public static EmailConfirmationType findByValue(int value) { 
    switch (value) {
      case 0:
        return SERVER_SIDE_EMAIL;
      case 1:
        return CLIENT_SIDE_EMAIL;
      default:
        return null;
    }
  }
}