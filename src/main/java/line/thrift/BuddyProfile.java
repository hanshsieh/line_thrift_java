/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-15")
public class BuddyProfile implements org.apache.thrift.TBase<BuddyProfile, BuddyProfile._Fields>, java.io.Serializable, Cloneable, Comparable<BuddyProfile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuddyProfile");

  private static final org.apache.thrift.protocol.TField BUDDY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("buddyId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEARCH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("searchId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusMessage", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CONTACT_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("contactCount", org.apache.thrift.protocol.TType.I64, (short)11);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuddyProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuddyProfileTupleSchemeFactory());
  }

  private String buddyId; // required
  private String mid; // required
  private String searchId; // required
  private String displayName; // required
  private String statusMessage; // required
  private long contactCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUDDY_ID((short)1, "buddyId"),
    MID((short)2, "mid"),
    SEARCH_ID((short)3, "searchId"),
    DISPLAY_NAME((short)4, "displayName"),
    STATUS_MESSAGE((short)5, "statusMessage"),
    CONTACT_COUNT((short)11, "contactCount");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BUDDY_ID
          return BUDDY_ID;
        case 2: // MID
          return MID;
        case 3: // SEARCH_ID
          return SEARCH_ID;
        case 4: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 5: // STATUS_MESSAGE
          return STATUS_MESSAGE;
        case 11: // CONTACT_COUNT
          return CONTACT_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CONTACTCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUDDY_ID, new org.apache.thrift.meta_data.FieldMetaData("buddyId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEARCH_ID, new org.apache.thrift.meta_data.FieldMetaData("searchId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("statusMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTACT_COUNT, new org.apache.thrift.meta_data.FieldMetaData("contactCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuddyProfile.class, metaDataMap);
  }

  public BuddyProfile() {
  }

  public BuddyProfile(
    String buddyId,
    String mid,
    String searchId,
    String displayName,
    String statusMessage,
    long contactCount)
  {
    this();
    this.buddyId = buddyId;
    this.mid = mid;
    this.searchId = searchId;
    this.displayName = displayName;
    this.statusMessage = statusMessage;
    this.contactCount = contactCount;
    setContactCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyProfile(BuddyProfile other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBuddyId()) {
      this.buddyId = other.buddyId;
    }
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    if (other.isSetSearchId()) {
      this.searchId = other.searchId;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetStatusMessage()) {
      this.statusMessage = other.statusMessage;
    }
    this.contactCount = other.contactCount;
  }

  public BuddyProfile deepCopy() {
    return new BuddyProfile(this);
  }

  @Override
  public void clear() {
    this.buddyId = null;
    this.mid = null;
    this.searchId = null;
    this.displayName = null;
    this.statusMessage = null;
    setContactCountIsSet(false);
    this.contactCount = 0;
  }

  public String getBuddyId() {
    return this.buddyId;
  }

  public void setBuddyId(String buddyId) {
    this.buddyId = buddyId;
  }

  public void unsetBuddyId() {
    this.buddyId = null;
  }

  /** Returns true if field buddyId is set (has been assigned a value) and false otherwise */
  public boolean isSetBuddyId() {
    return this.buddyId != null;
  }

  public void setBuddyIdIsSet(boolean value) {
    if (!value) {
      this.buddyId = null;
    }
  }

  public String getMid() {
    return this.mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public String getSearchId() {
    return this.searchId;
  }

  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }

  public void unsetSearchId() {
    this.searchId = null;
  }

  /** Returns true if field searchId is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchId() {
    return this.searchId != null;
  }

  public void setSearchIdIsSet(boolean value) {
    if (!value) {
      this.searchId = null;
    }
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public String getStatusMessage() {
    return this.statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public void unsetStatusMessage() {
    this.statusMessage = null;
  }

  /** Returns true if field statusMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusMessage() {
    return this.statusMessage != null;
  }

  public void setStatusMessageIsSet(boolean value) {
    if (!value) {
      this.statusMessage = null;
    }
  }

  public long getContactCount() {
    return this.contactCount;
  }

  public void setContactCount(long contactCount) {
    this.contactCount = contactCount;
    setContactCountIsSet(true);
  }

  public void unsetContactCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONTACTCOUNT_ISSET_ID);
  }

  /** Returns true if field contactCount is set (has been assigned a value) and false otherwise */
  public boolean isSetContactCount() {
    return EncodingUtils.testBit(__isset_bitfield, __CONTACTCOUNT_ISSET_ID);
  }

  public void setContactCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONTACTCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BUDDY_ID:
      if (value == null) {
        unsetBuddyId();
      } else {
        setBuddyId((String)value);
      }
      break;

    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((String)value);
      }
      break;

    case SEARCH_ID:
      if (value == null) {
        unsetSearchId();
      } else {
        setSearchId((String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((String)value);
      }
      break;

    case STATUS_MESSAGE:
      if (value == null) {
        unsetStatusMessage();
      } else {
        setStatusMessage((String)value);
      }
      break;

    case CONTACT_COUNT:
      if (value == null) {
        unsetContactCount();
      } else {
        setContactCount((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BUDDY_ID:
      return getBuddyId();

    case MID:
      return getMid();

    case SEARCH_ID:
      return getSearchId();

    case DISPLAY_NAME:
      return getDisplayName();

    case STATUS_MESSAGE:
      return getStatusMessage();

    case CONTACT_COUNT:
      return getContactCount();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BUDDY_ID:
      return isSetBuddyId();
    case MID:
      return isSetMid();
    case SEARCH_ID:
      return isSetSearchId();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case STATUS_MESSAGE:
      return isSetStatusMessage();
    case CONTACT_COUNT:
      return isSetContactCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyProfile)
      return this.equals((BuddyProfile)that);
    return false;
  }

  public boolean equals(BuddyProfile that) {
    if (that == null)
      return false;

    boolean this_present_buddyId = true && this.isSetBuddyId();
    boolean that_present_buddyId = true && that.isSetBuddyId();
    if (this_present_buddyId || that_present_buddyId) {
      if (!(this_present_buddyId && that_present_buddyId))
        return false;
      if (!this.buddyId.equals(that.buddyId))
        return false;
    }

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_searchId = true && this.isSetSearchId();
    boolean that_present_searchId = true && that.isSetSearchId();
    if (this_present_searchId || that_present_searchId) {
      if (!(this_present_searchId && that_present_searchId))
        return false;
      if (!this.searchId.equals(that.searchId))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_statusMessage = true && this.isSetStatusMessage();
    boolean that_present_statusMessage = true && that.isSetStatusMessage();
    if (this_present_statusMessage || that_present_statusMessage) {
      if (!(this_present_statusMessage && that_present_statusMessage))
        return false;
      if (!this.statusMessage.equals(that.statusMessage))
        return false;
    }

    boolean this_present_contactCount = true;
    boolean that_present_contactCount = true;
    if (this_present_contactCount || that_present_contactCount) {
      if (!(this_present_contactCount && that_present_contactCount))
        return false;
      if (this.contactCount != that.contactCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_buddyId = true && (isSetBuddyId());
    list.add(present_buddyId);
    if (present_buddyId)
      list.add(buddyId);

    boolean present_mid = true && (isSetMid());
    list.add(present_mid);
    if (present_mid)
      list.add(mid);

    boolean present_searchId = true && (isSetSearchId());
    list.add(present_searchId);
    if (present_searchId)
      list.add(searchId);

    boolean present_displayName = true && (isSetDisplayName());
    list.add(present_displayName);
    if (present_displayName)
      list.add(displayName);

    boolean present_statusMessage = true && (isSetStatusMessage());
    list.add(present_statusMessage);
    if (present_statusMessage)
      list.add(statusMessage);

    boolean present_contactCount = true;
    list.add(present_contactCount);
    if (present_contactCount)
      list.add(contactCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuddyProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBuddyId()).compareTo(other.isSetBuddyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuddyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buddyId, other.buddyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSearchId()).compareTo(other.isSetSearchId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchId, other.searchId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayName()).compareTo(other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatusMessage()).compareTo(other.isSetStatusMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusMessage, other.statusMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContactCount()).compareTo(other.isSetContactCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContactCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contactCount, other.contactCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuddyProfile(");
    boolean first = true;

    sb.append("buddyId:");
    if (this.buddyId == null) {
      sb.append("null");
    } else {
      sb.append(this.buddyId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("searchId:");
    if (this.searchId == null) {
      sb.append("null");
    } else {
      sb.append(this.searchId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayName:");
    if (this.displayName == null) {
      sb.append("null");
    } else {
      sb.append(this.displayName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statusMessage:");
    if (this.statusMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.statusMessage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contactCount:");
    sb.append(this.contactCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuddyProfileStandardSchemeFactory implements SchemeFactory {
    public BuddyProfileStandardScheme getScheme() {
      return new BuddyProfileStandardScheme();
    }
  }

  private static class BuddyProfileStandardScheme extends StandardScheme<BuddyProfile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuddyProfile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUDDY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buddyId = iprot.readString();
              struct.setBuddyIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEARCH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.searchId = iprot.readString();
              struct.setSearchIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statusMessage = iprot.readString();
              struct.setStatusMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // CONTACT_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.contactCount = iprot.readI64();
              struct.setContactCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuddyProfile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.buddyId != null) {
        oprot.writeFieldBegin(BUDDY_ID_FIELD_DESC);
        oprot.writeString(struct.buddyId);
        oprot.writeFieldEnd();
      }
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      if (struct.searchId != null) {
        oprot.writeFieldBegin(SEARCH_ID_FIELD_DESC);
        oprot.writeString(struct.searchId);
        oprot.writeFieldEnd();
      }
      if (struct.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.displayName);
        oprot.writeFieldEnd();
      }
      if (struct.statusMessage != null) {
        oprot.writeFieldBegin(STATUS_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.statusMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CONTACT_COUNT_FIELD_DESC);
      oprot.writeI64(struct.contactCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuddyProfileTupleSchemeFactory implements SchemeFactory {
    public BuddyProfileTupleScheme getScheme() {
      return new BuddyProfileTupleScheme();
    }
  }

  private static class BuddyProfileTupleScheme extends TupleScheme<BuddyProfile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuddyProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBuddyId()) {
        optionals.set(0);
      }
      if (struct.isSetMid()) {
        optionals.set(1);
      }
      if (struct.isSetSearchId()) {
        optionals.set(2);
      }
      if (struct.isSetDisplayName()) {
        optionals.set(3);
      }
      if (struct.isSetStatusMessage()) {
        optionals.set(4);
      }
      if (struct.isSetContactCount()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetBuddyId()) {
        oprot.writeString(struct.buddyId);
      }
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetSearchId()) {
        oprot.writeString(struct.searchId);
      }
      if (struct.isSetDisplayName()) {
        oprot.writeString(struct.displayName);
      }
      if (struct.isSetStatusMessage()) {
        oprot.writeString(struct.statusMessage);
      }
      if (struct.isSetContactCount()) {
        oprot.writeI64(struct.contactCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuddyProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.buddyId = iprot.readString();
        struct.setBuddyIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.searchId = iprot.readString();
        struct.setSearchIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.displayName = iprot.readString();
        struct.setDisplayNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.statusMessage = iprot.readString();
        struct.setStatusMessageIsSet(true);
      }
      if (incoming.get(5)) {
        struct.contactCount = iprot.readI64();
        struct.setContactCountIsSet(true);
      }
    }
  }

}

