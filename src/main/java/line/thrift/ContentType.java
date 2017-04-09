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

public enum ContentType implements org.apache.thrift.TEnum {
  NONE(0),
  IMAGE(1),
  VIDEO(2),
  AUDIO(3),
  HTML(4),
  PDF(5),
  CALL(6),
  STICKER(7),
  PRESENCE(8),
  GIFT(9),
  GROUPBOARD(10),
  APPLINK(11),
  LINK(12),
  CONTACT(13),
  FILE(14),
  LOCATION(15),
  POSTNOTIFICATION(16),
  RICH(17),
  CHATEVENT(18);

  private final int value;

  private ContentType(int value) {
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
  public static ContentType findByValue(int value) { 
    switch (value) {
      case 0:
        return NONE;
      case 1:
        return IMAGE;
      case 2:
        return VIDEO;
      case 3:
        return AUDIO;
      case 4:
        return HTML;
      case 5:
        return PDF;
      case 6:
        return CALL;
      case 7:
        return STICKER;
      case 8:
        return PRESENCE;
      case 9:
        return GIFT;
      case 10:
        return GROUPBOARD;
      case 11:
        return APPLINK;
      case 12:
        return LINK;
      case 13:
        return CONTACT;
      case 14:
        return FILE;
      case 15:
        return LOCATION;
      case 16:
        return POSTNOTIFICATION;
      case 17:
        return RICH;
      case 18:
        return CHATEVENT;
      default:
        return null;
    }
  }
}
