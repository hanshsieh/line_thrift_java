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

public enum ErrorCode implements org.apache.thrift.TEnum {
  ILLEGAL_ARGUMENT(0),
  AUTHENTICATION_FAILED(1),
  DB_FAILED(2),
  INVALID_STATE(3),
  EXCESSIVE_ACCESS(4),
  NOT_FOUND(5),
  INVALID_LENGTH(6),
  NOT_AVAILABLE_USER(7),
  NOT_AUTHORIZED_DEVICE(8),
  INVALID_MID(9),
  NOT_A_MEMBER(10),
  INCOMPATIBLE_APP_VERSION(11),
  NOT_READY(12),
  NOT_AVAILABLE_SESSION(13),
  NOT_AUTHORIZED_SESSION(14),
  SYSTEM_ERROR(15),
  NO_AVAILABLE_VERIFICATION_METHOD(16),
  NOT_AUTHENTICATED(17),
  INVALID_IDENTITY_CREDENTIAL(18),
  NOT_AVAILABLE_IDENTITY_IDENTIFIER(19),
  INTERNAL_ERROR(20),
  NO_SUCH_IDENTITY_IDENFIER(21),
  DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY(22),
  ILLEGAL_IDENTITY_CREDENTIAL(23),
  UNKNOWN_CHANNEL(24),
  NO_SUCH_MESSAGE_BOX(25),
  NOT_AVAILABLE_MESSAGE_BOX(26),
  CHANNEL_DOES_NOT_MATCH(27),
  NOT_YOUR_MESSAGE(28),
  MESSAGE_DEFINED_ERROR(29),
  USER_CANNOT_ACCEPT_PRESENTS(30),
  USER_NOT_STICKER_OWNER(32),
  MAINTENANCE_ERROR(33),
  ACCOUNT_NOT_MATCHED(34),
  ABUSE_BLOCK(35),
  NOT_FRIEND(36),
  NOT_ALLOWED_CALL(37),
  BLOCK_FRIEND(38),
  INCOMPATIBLE_VOIP_VERSION(39),
  INVALID_SNS_ACCESS_TOKEN(40),
  EXTERNAL_SERVICE_NOT_AVAILABLE(41),
  NOT_ALLOWED_ADD_CONTACT(42),
  NOT_CERTIFICATED(43),
  NOT_ALLOWED_SECONDARY_DEVICE(44),
  INVALID_PIN_CODE(45),
  NOT_FOUND_IDENTITY_CREDENTIAL(46),
  EXCEED_FILE_MAX_SIZE(47),
  EXCEED_DAILY_QUOTA(48),
  NOT_SUPPORT_SEND_FILE(49),
  MUST_UPGRADE(50),
  NOT_AVAILABLE_PIN_CODE_SESSION(51);

  private final int value;

  private ErrorCode(int value) {
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
  public static ErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return ILLEGAL_ARGUMENT;
      case 1:
        return AUTHENTICATION_FAILED;
      case 2:
        return DB_FAILED;
      case 3:
        return INVALID_STATE;
      case 4:
        return EXCESSIVE_ACCESS;
      case 5:
        return NOT_FOUND;
      case 6:
        return INVALID_LENGTH;
      case 7:
        return NOT_AVAILABLE_USER;
      case 8:
        return NOT_AUTHORIZED_DEVICE;
      case 9:
        return INVALID_MID;
      case 10:
        return NOT_A_MEMBER;
      case 11:
        return INCOMPATIBLE_APP_VERSION;
      case 12:
        return NOT_READY;
      case 13:
        return NOT_AVAILABLE_SESSION;
      case 14:
        return NOT_AUTHORIZED_SESSION;
      case 15:
        return SYSTEM_ERROR;
      case 16:
        return NO_AVAILABLE_VERIFICATION_METHOD;
      case 17:
        return NOT_AUTHENTICATED;
      case 18:
        return INVALID_IDENTITY_CREDENTIAL;
      case 19:
        return NOT_AVAILABLE_IDENTITY_IDENTIFIER;
      case 20:
        return INTERNAL_ERROR;
      case 21:
        return NO_SUCH_IDENTITY_IDENFIER;
      case 22:
        return DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY;
      case 23:
        return ILLEGAL_IDENTITY_CREDENTIAL;
      case 24:
        return UNKNOWN_CHANNEL;
      case 25:
        return NO_SUCH_MESSAGE_BOX;
      case 26:
        return NOT_AVAILABLE_MESSAGE_BOX;
      case 27:
        return CHANNEL_DOES_NOT_MATCH;
      case 28:
        return NOT_YOUR_MESSAGE;
      case 29:
        return MESSAGE_DEFINED_ERROR;
      case 30:
        return USER_CANNOT_ACCEPT_PRESENTS;
      case 32:
        return USER_NOT_STICKER_OWNER;
      case 33:
        return MAINTENANCE_ERROR;
      case 34:
        return ACCOUNT_NOT_MATCHED;
      case 35:
        return ABUSE_BLOCK;
      case 36:
        return NOT_FRIEND;
      case 37:
        return NOT_ALLOWED_CALL;
      case 38:
        return BLOCK_FRIEND;
      case 39:
        return INCOMPATIBLE_VOIP_VERSION;
      case 40:
        return INVALID_SNS_ACCESS_TOKEN;
      case 41:
        return EXTERNAL_SERVICE_NOT_AVAILABLE;
      case 42:
        return NOT_ALLOWED_ADD_CONTACT;
      case 43:
        return NOT_CERTIFICATED;
      case 44:
        return NOT_ALLOWED_SECONDARY_DEVICE;
      case 45:
        return INVALID_PIN_CODE;
      case 46:
        return NOT_FOUND_IDENTITY_CREDENTIAL;
      case 47:
        return EXCEED_FILE_MAX_SIZE;
      case 48:
        return EXCEED_DAILY_QUOTA;
      case 49:
        return NOT_SUPPORT_SEND_FILE;
      case 50:
        return MUST_UPGRADE;
      case 51:
        return NOT_AVAILABLE_PIN_CODE_SESSION;
      default:
        return null;
    }
  }
}
