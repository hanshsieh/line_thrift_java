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

public enum SyncActionType implements org.apache.thrift.TEnum {
  SYNC(0),
  REPORT(1);

  private final int value;

  private SyncActionType(int value) {
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
  public static SyncActionType findByValue(int value) { 
    switch (value) {
      case 0:
        return SYNC;
      case 1:
        return REPORT;
      default:
        return null;
    }
  }
}
