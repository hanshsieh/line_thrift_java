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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-09")
public class TMessageBox implements org.apache.thrift.TBase<TMessageBox, TMessageBox._Fields>, java.io.Serializable, Cloneable, Comparable<TMessageBox> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMessageBox");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CHANNEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("channelId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("lastSeq", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField UNREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("unreadCount", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField LAST_MODIFIED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastModifiedTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)8);
  private static final org.apache.thrift.protocol.TField MID_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("midType", org.apache.thrift.protocol.TType.I32, (short)9);
  private static final org.apache.thrift.protocol.TField LAST_MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("lastMessages", org.apache.thrift.protocol.TType.LIST, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TMessageBoxStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TMessageBoxTupleSchemeFactory());
  }

  private String id; // required
  private String channelId; // required
  private long lastSeq; // required
  private long unreadCount; // required
  private long lastModifiedTime; // required
  private int status; // required
  private MIDType midType; // required
  private List<Message> lastMessages; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CHANNEL_ID((short)2, "channelId"),
    LAST_SEQ((short)5, "lastSeq"),
    UNREAD_COUNT((short)6, "unreadCount"),
    LAST_MODIFIED_TIME((short)7, "lastModifiedTime"),
    STATUS((short)8, "status"),
    /**
     * 
     * @see MIDType
     */
    MID_TYPE((short)9, "midType"),
    LAST_MESSAGES((short)10, "lastMessages");

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
        case 1: // ID
          return ID;
        case 2: // CHANNEL_ID
          return CHANNEL_ID;
        case 5: // LAST_SEQ
          return LAST_SEQ;
        case 6: // UNREAD_COUNT
          return UNREAD_COUNT;
        case 7: // LAST_MODIFIED_TIME
          return LAST_MODIFIED_TIME;
        case 8: // STATUS
          return STATUS;
        case 9: // MID_TYPE
          return MID_TYPE;
        case 10: // LAST_MESSAGES
          return LAST_MESSAGES;
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
  private static final int __LASTSEQ_ISSET_ID = 0;
  private static final int __UNREADCOUNT_ISSET_ID = 1;
  private static final int __LASTMODIFIEDTIME_ISSET_ID = 2;
  private static final int __STATUS_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHANNEL_ID, new org.apache.thrift.meta_data.FieldMetaData("channelId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_SEQ, new org.apache.thrift.meta_data.FieldMetaData("lastSeq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UNREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("unreadCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_MODIFIED_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastModifiedTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MID_TYPE, new org.apache.thrift.meta_data.FieldMetaData("midType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MIDType.class)));
    tmpMap.put(_Fields.LAST_MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("lastMessages", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Message.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMessageBox.class, metaDataMap);
  }

  public TMessageBox() {
  }

  public TMessageBox(
    String id,
    String channelId,
    long lastSeq,
    long unreadCount,
    long lastModifiedTime,
    int status,
    MIDType midType,
    List<Message> lastMessages)
  {
    this();
    this.id = id;
    this.channelId = channelId;
    this.lastSeq = lastSeq;
    setLastSeqIsSet(true);
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
    this.lastModifiedTime = lastModifiedTime;
    setLastModifiedTimeIsSet(true);
    this.status = status;
    setStatusIsSet(true);
    this.midType = midType;
    this.lastMessages = lastMessages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageBox(TMessageBox other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetChannelId()) {
      this.channelId = other.channelId;
    }
    this.lastSeq = other.lastSeq;
    this.unreadCount = other.unreadCount;
    this.lastModifiedTime = other.lastModifiedTime;
    this.status = other.status;
    if (other.isSetMidType()) {
      this.midType = other.midType;
    }
    if (other.isSetLastMessages()) {
      List<Message> __this__lastMessages = new ArrayList<Message>(other.lastMessages.size());
      for (Message other_element : other.lastMessages) {
        __this__lastMessages.add(new Message(other_element));
      }
      this.lastMessages = __this__lastMessages;
    }
  }

  public TMessageBox deepCopy() {
    return new TMessageBox(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.channelId = null;
    setLastSeqIsSet(false);
    this.lastSeq = 0;
    setUnreadCountIsSet(false);
    this.unreadCount = 0;
    setLastModifiedTimeIsSet(false);
    this.lastModifiedTime = 0;
    setStatusIsSet(false);
    this.status = 0;
    this.midType = null;
    this.lastMessages = null;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String getChannelId() {
    return this.channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public void unsetChannelId() {
    this.channelId = null;
  }

  /** Returns true if field channelId is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelId() {
    return this.channelId != null;
  }

  public void setChannelIdIsSet(boolean value) {
    if (!value) {
      this.channelId = null;
    }
  }

  public long getLastSeq() {
    return this.lastSeq;
  }

  public void setLastSeq(long lastSeq) {
    this.lastSeq = lastSeq;
    setLastSeqIsSet(true);
  }

  public void unsetLastSeq() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTSEQ_ISSET_ID);
  }

  /** Returns true if field lastSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetLastSeq() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTSEQ_ISSET_ID);
  }

  public void setLastSeqIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTSEQ_ISSET_ID, value);
  }

  public long getUnreadCount() {
    return this.unreadCount;
  }

  public void setUnreadCount(long unreadCount) {
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
  }

  public void unsetUnreadCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID);
  }

  /** Returns true if field unreadCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnreadCount() {
    return EncodingUtils.testBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID);
  }

  public void setUnreadCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID, value);
  }

  public long getLastModifiedTime() {
    return this.lastModifiedTime;
  }

  public void setLastModifiedTime(long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    setLastModifiedTimeIsSet(true);
  }

  public void unsetLastModifiedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID);
  }

  /** Returns true if field lastModifiedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModifiedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID);
  }

  public void setLastModifiedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID, value);
  }

  public int getStatus() {
    return this.status;
  }

  public void setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
  }

  public void unsetStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  /**
   * 
   * @see MIDType
   */
  public MIDType getMidType() {
    return this.midType;
  }

  /**
   * 
   * @see MIDType
   */
  public void setMidType(MIDType midType) {
    this.midType = midType;
  }

  public void unsetMidType() {
    this.midType = null;
  }

  /** Returns true if field midType is set (has been assigned a value) and false otherwise */
  public boolean isSetMidType() {
    return this.midType != null;
  }

  public void setMidTypeIsSet(boolean value) {
    if (!value) {
      this.midType = null;
    }
  }

  public int getLastMessagesSize() {
    return (this.lastMessages == null) ? 0 : this.lastMessages.size();
  }

  public java.util.Iterator<Message> getLastMessagesIterator() {
    return (this.lastMessages == null) ? null : this.lastMessages.iterator();
  }

  public void addToLastMessages(Message elem) {
    if (this.lastMessages == null) {
      this.lastMessages = new ArrayList<Message>();
    }
    this.lastMessages.add(elem);
  }

  public List<Message> getLastMessages() {
    return this.lastMessages;
  }

  public void setLastMessages(List<Message> lastMessages) {
    this.lastMessages = lastMessages;
  }

  public void unsetLastMessages() {
    this.lastMessages = null;
  }

  /** Returns true if field lastMessages is set (has been assigned a value) and false otherwise */
  public boolean isSetLastMessages() {
    return this.lastMessages != null;
  }

  public void setLastMessagesIsSet(boolean value) {
    if (!value) {
      this.lastMessages = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case CHANNEL_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        setChannelId((String)value);
      }
      break;

    case LAST_SEQ:
      if (value == null) {
        unsetLastSeq();
      } else {
        setLastSeq((Long)value);
      }
      break;

    case UNREAD_COUNT:
      if (value == null) {
        unsetUnreadCount();
      } else {
        setUnreadCount((Long)value);
      }
      break;

    case LAST_MODIFIED_TIME:
      if (value == null) {
        unsetLastModifiedTime();
      } else {
        setLastModifiedTime((Long)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;

    case MID_TYPE:
      if (value == null) {
        unsetMidType();
      } else {
        setMidType((MIDType)value);
      }
      break;

    case LAST_MESSAGES:
      if (value == null) {
        unsetLastMessages();
      } else {
        setLastMessages((List<Message>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CHANNEL_ID:
      return getChannelId();

    case LAST_SEQ:
      return getLastSeq();

    case UNREAD_COUNT:
      return getUnreadCount();

    case LAST_MODIFIED_TIME:
      return getLastModifiedTime();

    case STATUS:
      return getStatus();

    case MID_TYPE:
      return getMidType();

    case LAST_MESSAGES:
      return getLastMessages();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case CHANNEL_ID:
      return isSetChannelId();
    case LAST_SEQ:
      return isSetLastSeq();
    case UNREAD_COUNT:
      return isSetUnreadCount();
    case LAST_MODIFIED_TIME:
      return isSetLastModifiedTime();
    case STATUS:
      return isSetStatus();
    case MID_TYPE:
      return isSetMidType();
    case LAST_MESSAGES:
      return isSetLastMessages();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessageBox)
      return this.equals((TMessageBox)that);
    return false;
  }

  public boolean equals(TMessageBox that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (!this.channelId.equals(that.channelId))
        return false;
    }

    boolean this_present_lastSeq = true;
    boolean that_present_lastSeq = true;
    if (this_present_lastSeq || that_present_lastSeq) {
      if (!(this_present_lastSeq && that_present_lastSeq))
        return false;
      if (this.lastSeq != that.lastSeq)
        return false;
    }

    boolean this_present_unreadCount = true;
    boolean that_present_unreadCount = true;
    if (this_present_unreadCount || that_present_unreadCount) {
      if (!(this_present_unreadCount && that_present_unreadCount))
        return false;
      if (this.unreadCount != that.unreadCount)
        return false;
    }

    boolean this_present_lastModifiedTime = true;
    boolean that_present_lastModifiedTime = true;
    if (this_present_lastModifiedTime || that_present_lastModifiedTime) {
      if (!(this_present_lastModifiedTime && that_present_lastModifiedTime))
        return false;
      if (this.lastModifiedTime != that.lastModifiedTime)
        return false;
    }

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_midType = true && this.isSetMidType();
    boolean that_present_midType = true && that.isSetMidType();
    if (this_present_midType || that_present_midType) {
      if (!(this_present_midType && that_present_midType))
        return false;
      if (!this.midType.equals(that.midType))
        return false;
    }

    boolean this_present_lastMessages = true && this.isSetLastMessages();
    boolean that_present_lastMessages = true && that.isSetLastMessages();
    if (this_present_lastMessages || that_present_lastMessages) {
      if (!(this_present_lastMessages && that_present_lastMessages))
        return false;
      if (!this.lastMessages.equals(that.lastMessages))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_channelId = true && (isSetChannelId());
    list.add(present_channelId);
    if (present_channelId)
      list.add(channelId);

    boolean present_lastSeq = true;
    list.add(present_lastSeq);
    if (present_lastSeq)
      list.add(lastSeq);

    boolean present_unreadCount = true;
    list.add(present_unreadCount);
    if (present_unreadCount)
      list.add(unreadCount);

    boolean present_lastModifiedTime = true;
    list.add(present_lastModifiedTime);
    if (present_lastModifiedTime)
      list.add(lastModifiedTime);

    boolean present_status = true;
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_midType = true && (isSetMidType());
    list.add(present_midType);
    if (present_midType)
      list.add(midType.getValue());

    boolean present_lastMessages = true && (isSetLastMessages());
    list.add(present_lastMessages);
    if (present_lastMessages)
      list.add(lastMessages);

    return list.hashCode();
  }

  @Override
  public int compareTo(TMessageBox other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChannelId()).compareTo(other.isSetChannelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelId, other.channelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastSeq()).compareTo(other.isSetLastSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastSeq, other.lastSeq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnreadCount()).compareTo(other.isSetUnreadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnreadCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unreadCount, other.unreadCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastModifiedTime()).compareTo(other.isSetLastModifiedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModifiedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastModifiedTime, other.lastModifiedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMidType()).compareTo(other.isSetMidType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMidType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.midType, other.midType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastMessages()).compareTo(other.isSetLastMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastMessages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastMessages, other.lastMessages);
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
    StringBuilder sb = new StringBuilder("TMessageBox(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channelId:");
    if (this.channelId == null) {
      sb.append("null");
    } else {
      sb.append(this.channelId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastSeq:");
    sb.append(this.lastSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unreadCount:");
    sb.append(this.unreadCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastModifiedTime:");
    sb.append(this.lastModifiedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("midType:");
    if (this.midType == null) {
      sb.append("null");
    } else {
      sb.append(this.midType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastMessages:");
    if (this.lastMessages == null) {
      sb.append("null");
    } else {
      sb.append(this.lastMessages);
    }
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

  private static class TMessageBoxStandardSchemeFactory implements SchemeFactory {
    public TMessageBoxStandardScheme getScheme() {
      return new TMessageBoxStandardScheme();
    }
  }

  private static class TMessageBoxStandardScheme extends StandardScheme<TMessageBox> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMessageBox struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHANNEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.channelId = iprot.readString();
              struct.setChannelIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LAST_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastSeq = iprot.readI64();
              struct.setLastSeqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UNREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.unreadCount = iprot.readI64();
              struct.setUnreadCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // LAST_MODIFIED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastModifiedTime = iprot.readI64();
              struct.setLastModifiedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // MID_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.midType = line.thrift.MIDType.findByValue(iprot.readI32());
              struct.setMidTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // LAST_MESSAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list326 = iprot.readListBegin();
                struct.lastMessages = new ArrayList<Message>(_list326.size);
                Message _elem327;
                for (int _i328 = 0; _i328 < _list326.size; ++_i328)
                {
                  _elem327 = new Message();
                  _elem327.read(iprot);
                  struct.lastMessages.add(_elem327);
                }
                iprot.readListEnd();
              }
              struct.setLastMessagesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMessageBox struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(struct.channelId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_SEQ_FIELD_DESC);
      oprot.writeI64(struct.lastSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNREAD_COUNT_FIELD_DESC);
      oprot.writeI64(struct.unreadCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_MODIFIED_TIME_FIELD_DESC);
      oprot.writeI64(struct.lastModifiedTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(struct.status);
      oprot.writeFieldEnd();
      if (struct.midType != null) {
        oprot.writeFieldBegin(MID_TYPE_FIELD_DESC);
        oprot.writeI32(struct.midType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.lastMessages != null) {
        oprot.writeFieldBegin(LAST_MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.lastMessages.size()));
          for (Message _iter329 : struct.lastMessages)
          {
            _iter329.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMessageBoxTupleSchemeFactory implements SchemeFactory {
    public TMessageBoxTupleScheme getScheme() {
      return new TMessageBoxTupleScheme();
    }
  }

  private static class TMessageBoxTupleScheme extends TupleScheme<TMessageBox> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMessageBox struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetChannelId()) {
        optionals.set(1);
      }
      if (struct.isSetLastSeq()) {
        optionals.set(2);
      }
      if (struct.isSetUnreadCount()) {
        optionals.set(3);
      }
      if (struct.isSetLastModifiedTime()) {
        optionals.set(4);
      }
      if (struct.isSetStatus()) {
        optionals.set(5);
      }
      if (struct.isSetMidType()) {
        optionals.set(6);
      }
      if (struct.isSetLastMessages()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetChannelId()) {
        oprot.writeString(struct.channelId);
      }
      if (struct.isSetLastSeq()) {
        oprot.writeI64(struct.lastSeq);
      }
      if (struct.isSetUnreadCount()) {
        oprot.writeI64(struct.unreadCount);
      }
      if (struct.isSetLastModifiedTime()) {
        oprot.writeI64(struct.lastModifiedTime);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status);
      }
      if (struct.isSetMidType()) {
        oprot.writeI32(struct.midType.getValue());
      }
      if (struct.isSetLastMessages()) {
        {
          oprot.writeI32(struct.lastMessages.size());
          for (Message _iter330 : struct.lastMessages)
          {
            _iter330.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMessageBox struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.channelId = iprot.readString();
        struct.setChannelIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastSeq = iprot.readI64();
        struct.setLastSeqIsSet(true);
      }
      if (incoming.get(3)) {
        struct.unreadCount = iprot.readI64();
        struct.setUnreadCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.lastModifiedTime = iprot.readI64();
        struct.setLastModifiedTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.status = iprot.readI32();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(6)) {
        struct.midType = line.thrift.MIDType.findByValue(iprot.readI32());
        struct.setMidTypeIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TList _list331 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.lastMessages = new ArrayList<Message>(_list331.size);
          Message _elem332;
          for (int _i333 = 0; _i333 < _list331.size; ++_i333)
          {
            _elem332 = new Message();
            _elem332.read(iprot);
            struct.lastMessages.add(_elem332);
          }
        }
        struct.setLastMessagesIsSet(true);
      }
    }
  }

}

