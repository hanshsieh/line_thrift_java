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

public enum BuddyBannerLinkType implements org.apache.thrift.TEnum {
  BUDDY_BANNER_LINK_HIDDEN(0),
  BUDDY_BANNER_LINK_MID(1),
  BUDDY_BANNER_LINK_URL(2);

  private final int value;

  private BuddyBannerLinkType(int value) {
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
  public static BuddyBannerLinkType findByValue(int value) { 
    switch (value) {
      case 0:
        return BUDDY_BANNER_LINK_HIDDEN;
      case 1:
        return BUDDY_BANNER_LINK_MID;
      case 2:
        return BUDDY_BANNER_LINK_URL;
      default:
        return null;
    }
  }
}
