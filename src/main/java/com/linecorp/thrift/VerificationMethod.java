/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.linecorp.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum VerificationMethod implements org.apache.thrift.TEnum {
  NO_AVAILABLE(0),
  PIN_VIA_SMS(1),
  CALLERID_INDIGO(2),
  PIN_VIA_TTS(4),
  SKIP(10);

  private final int value;

  private VerificationMethod(int value) {
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
  public static VerificationMethod findByValue(int value) { 
    switch (value) {
      case 0:
        return NO_AVAILABLE;
      case 1:
        return PIN_VIA_SMS;
      case 2:
        return CALLERID_INDIGO;
      case 4:
        return PIN_VIA_TTS;
      case 10:
        return SKIP;
      default:
        return null;
    }
  }
}
