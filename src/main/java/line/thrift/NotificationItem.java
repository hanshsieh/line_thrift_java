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
import org.apache.thrift.EncodingUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-08")
public class NotificationItem implements org.apache.thrift.TBase<NotificationItem, NotificationItem._Fields>, java.io.Serializable, Cloneable, Comparable<NotificationItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NotificationItem");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FROM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fromId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TO_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("toId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FROM_CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("fromChannel", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TO_CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("toChannel", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.MAP, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NotificationItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NotificationItemTupleSchemeFactory());
  }

  private String id; // required
  private String fromId; // required
  private String toId; // required
  private String fromChannel; // required
  private String toChannel; // required
  private long revision; // required
  private long createdTime; // required
  private Map<String,String> content; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    FROM_ID((short)2, "fromId"),
    TO_ID((short)3, "toId"),
    FROM_CHANNEL((short)4, "fromChannel"),
    TO_CHANNEL((short)5, "toChannel"),
    REVISION((short)7, "revision"),
    CREATED_TIME((short)8, "createdTime"),
    CONTENT((short)9, "content");

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
        case 2: // FROM_ID
          return FROM_ID;
        case 3: // TO_ID
          return TO_ID;
        case 4: // FROM_CHANNEL
          return FROM_CHANNEL;
        case 5: // TO_CHANNEL
          return TO_CHANNEL;
        case 7: // REVISION
          return REVISION;
        case 8: // CREATED_TIME
          return CREATED_TIME;
        case 9: // CONTENT
          return CONTENT;
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
  private static final int __REVISION_ISSET_ID = 0;
  private static final int __CREATEDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FROM_ID, new org.apache.thrift.meta_data.FieldMetaData("fromId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_ID, new org.apache.thrift.meta_data.FieldMetaData("toId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FROM_CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("fromChannel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("toChannel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NotificationItem.class, metaDataMap);
  }

  public NotificationItem() {
  }

  public NotificationItem(
    String id,
    String fromId,
    String toId,
    String fromChannel,
    String toChannel,
    long revision,
    long createdTime,
    Map<String,String> content)
  {
    this();
    this.id = id;
    this.fromId = fromId;
    this.toId = toId;
    this.fromChannel = fromChannel;
    this.toChannel = toChannel;
    this.revision = revision;
    setRevisionIsSet(true);
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.content = content;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotificationItem(NotificationItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetFromId()) {
      this.fromId = other.fromId;
    }
    if (other.isSetToId()) {
      this.toId = other.toId;
    }
    if (other.isSetFromChannel()) {
      this.fromChannel = other.fromChannel;
    }
    if (other.isSetToChannel()) {
      this.toChannel = other.toChannel;
    }
    this.revision = other.revision;
    this.createdTime = other.createdTime;
    if (other.isSetContent()) {
      Map<String,String> __this__content = new HashMap<String,String>(other.content);
      this.content = __this__content;
    }
  }

  public NotificationItem deepCopy() {
    return new NotificationItem(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.fromId = null;
    this.toId = null;
    this.fromChannel = null;
    this.toChannel = null;
    setRevisionIsSet(false);
    this.revision = 0;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.content = null;
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

  public String getFromId() {
    return this.fromId;
  }

  public void setFromId(String fromId) {
    this.fromId = fromId;
  }

  public void unsetFromId() {
    this.fromId = null;
  }

  /** Returns true if field fromId is set (has been assigned a value) and false otherwise */
  public boolean isSetFromId() {
    return this.fromId != null;
  }

  public void setFromIdIsSet(boolean value) {
    if (!value) {
      this.fromId = null;
    }
  }

  public String getToId() {
    return this.toId;
  }

  public void setToId(String toId) {
    this.toId = toId;
  }

  public void unsetToId() {
    this.toId = null;
  }

  /** Returns true if field toId is set (has been assigned a value) and false otherwise */
  public boolean isSetToId() {
    return this.toId != null;
  }

  public void setToIdIsSet(boolean value) {
    if (!value) {
      this.toId = null;
    }
  }

  public String getFromChannel() {
    return this.fromChannel;
  }

  public void setFromChannel(String fromChannel) {
    this.fromChannel = fromChannel;
  }

  public void unsetFromChannel() {
    this.fromChannel = null;
  }

  /** Returns true if field fromChannel is set (has been assigned a value) and false otherwise */
  public boolean isSetFromChannel() {
    return this.fromChannel != null;
  }

  public void setFromChannelIsSet(boolean value) {
    if (!value) {
      this.fromChannel = null;
    }
  }

  public String getToChannel() {
    return this.toChannel;
  }

  public void setToChannel(String toChannel) {
    this.toChannel = toChannel;
  }

  public void unsetToChannel() {
    this.toChannel = null;
  }

  /** Returns true if field toChannel is set (has been assigned a value) and false otherwise */
  public boolean isSetToChannel() {
    return this.toChannel != null;
  }

  public void setToChannelIsSet(boolean value) {
    if (!value) {
      this.toChannel = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public void setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
  }

  public void unsetRevision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public void setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
  }

  public void unsetCreatedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  public int getContentSize() {
    return (this.content == null) ? 0 : this.content.size();
  }

  public void putToContent(String key, String val) {
    if (this.content == null) {
      this.content = new HashMap<String,String>();
    }
    this.content.put(key, val);
  }

  public Map<String,String> getContent() {
    return this.content;
  }

  public void setContent(Map<String,String> content) {
    this.content = content;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
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

    case FROM_ID:
      if (value == null) {
        unsetFromId();
      } else {
        setFromId((String)value);
      }
      break;

    case TO_ID:
      if (value == null) {
        unsetToId();
      } else {
        setToId((String)value);
      }
      break;

    case FROM_CHANNEL:
      if (value == null) {
        unsetFromChannel();
      } else {
        setFromChannel((String)value);
      }
      break;

    case TO_CHANNEL:
      if (value == null) {
        unsetToChannel();
      } else {
        setToChannel((String)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((Long)value);
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((Long)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case FROM_ID:
      return getFromId();

    case TO_ID:
      return getToId();

    case FROM_CHANNEL:
      return getFromChannel();

    case TO_CHANNEL:
      return getToChannel();

    case REVISION:
      return getRevision();

    case CREATED_TIME:
      return getCreatedTime();

    case CONTENT:
      return getContent();

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
    case FROM_ID:
      return isSetFromId();
    case TO_ID:
      return isSetToId();
    case FROM_CHANNEL:
      return isSetFromChannel();
    case TO_CHANNEL:
      return isSetToChannel();
    case REVISION:
      return isSetRevision();
    case CREATED_TIME:
      return isSetCreatedTime();
    case CONTENT:
      return isSetContent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NotificationItem)
      return this.equals((NotificationItem)that);
    return false;
  }

  public boolean equals(NotificationItem that) {
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

    boolean this_present_fromId = true && this.isSetFromId();
    boolean that_present_fromId = true && that.isSetFromId();
    if (this_present_fromId || that_present_fromId) {
      if (!(this_present_fromId && that_present_fromId))
        return false;
      if (!this.fromId.equals(that.fromId))
        return false;
    }

    boolean this_present_toId = true && this.isSetToId();
    boolean that_present_toId = true && that.isSetToId();
    if (this_present_toId || that_present_toId) {
      if (!(this_present_toId && that_present_toId))
        return false;
      if (!this.toId.equals(that.toId))
        return false;
    }

    boolean this_present_fromChannel = true && this.isSetFromChannel();
    boolean that_present_fromChannel = true && that.isSetFromChannel();
    if (this_present_fromChannel || that_present_fromChannel) {
      if (!(this_present_fromChannel && that_present_fromChannel))
        return false;
      if (!this.fromChannel.equals(that.fromChannel))
        return false;
    }

    boolean this_present_toChannel = true && this.isSetToChannel();
    boolean that_present_toChannel = true && that.isSetToChannel();
    if (this_present_toChannel || that_present_toChannel) {
      if (!(this_present_toChannel && that_present_toChannel))
        return false;
      if (!this.toChannel.equals(that.toChannel))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
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

    boolean present_fromId = true && (isSetFromId());
    list.add(present_fromId);
    if (present_fromId)
      list.add(fromId);

    boolean present_toId = true && (isSetToId());
    list.add(present_toId);
    if (present_toId)
      list.add(toId);

    boolean present_fromChannel = true && (isSetFromChannel());
    list.add(present_fromChannel);
    if (present_fromChannel)
      list.add(fromChannel);

    boolean present_toChannel = true && (isSetToChannel());
    list.add(present_toChannel);
    if (present_toChannel)
      list.add(toChannel);

    boolean present_revision = true;
    list.add(present_revision);
    if (present_revision)
      list.add(revision);

    boolean present_createdTime = true;
    list.add(present_createdTime);
    if (present_createdTime)
      list.add(createdTime);

    boolean present_content = true && (isSetContent());
    list.add(present_content);
    if (present_content)
      list.add(content);

    return list.hashCode();
  }

  @Override
  public int compareTo(NotificationItem other) {
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
    lastComparison = Boolean.valueOf(isSetFromId()).compareTo(other.isSetFromId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromId, other.fromId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToId()).compareTo(other.isSetToId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toId, other.toId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFromChannel()).compareTo(other.isSetFromChannel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromChannel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromChannel, other.fromChannel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToChannel()).compareTo(other.isSetToChannel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToChannel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toChannel, other.toChannel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
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
    StringBuilder sb = new StringBuilder("NotificationItem(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fromId:");
    if (this.fromId == null) {
      sb.append("null");
    } else {
      sb.append(this.fromId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toId:");
    if (this.toId == null) {
      sb.append("null");
    } else {
      sb.append(this.toId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fromChannel:");
    if (this.fromChannel == null) {
      sb.append("null");
    } else {
      sb.append(this.fromChannel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toChannel:");
    if (this.toChannel == null) {
      sb.append("null");
    } else {
      sb.append(this.toChannel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
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

  private static class NotificationItemStandardSchemeFactory implements SchemeFactory {
    public NotificationItemStandardScheme getScheme() {
      return new NotificationItemStandardScheme();
    }
  }

  private static class NotificationItemStandardScheme extends StandardScheme<NotificationItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NotificationItem struct) throws org.apache.thrift.TException {
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
          case 2: // FROM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fromId = iprot.readString();
              struct.setFromIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TO_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.toId = iprot.readString();
              struct.setToIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FROM_CHANNEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fromChannel = iprot.readString();
              struct.setFromChannelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TO_CHANNEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.toChannel = iprot.readString();
              struct.setToChannelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map220 = iprot.readMapBegin();
                struct.content = new HashMap<String,String>(2*_map220.size);
                String _key221;
                String _val222;
                for (int _i223 = 0; _i223 < _map220.size; ++_i223)
                {
                  _key221 = iprot.readString();
                  _val222 = iprot.readString();
                  struct.content.put(_key221, _val222);
                }
                iprot.readMapEnd();
              }
              struct.setContentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NotificationItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.fromId != null) {
        oprot.writeFieldBegin(FROM_ID_FIELD_DESC);
        oprot.writeString(struct.fromId);
        oprot.writeFieldEnd();
      }
      if (struct.toId != null) {
        oprot.writeFieldBegin(TO_ID_FIELD_DESC);
        oprot.writeString(struct.toId);
        oprot.writeFieldEnd();
      }
      if (struct.fromChannel != null) {
        oprot.writeFieldBegin(FROM_CHANNEL_FIELD_DESC);
        oprot.writeString(struct.fromChannel);
        oprot.writeFieldEnd();
      }
      if (struct.toChannel != null) {
        oprot.writeFieldBegin(TO_CHANNEL_FIELD_DESC);
        oprot.writeString(struct.toChannel);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.content.size()));
          for (Map.Entry<String, String> _iter224 : struct.content.entrySet())
          {
            oprot.writeString(_iter224.getKey());
            oprot.writeString(_iter224.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NotificationItemTupleSchemeFactory implements SchemeFactory {
    public NotificationItemTupleScheme getScheme() {
      return new NotificationItemTupleScheme();
    }
  }

  private static class NotificationItemTupleScheme extends TupleScheme<NotificationItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NotificationItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetFromId()) {
        optionals.set(1);
      }
      if (struct.isSetToId()) {
        optionals.set(2);
      }
      if (struct.isSetFromChannel()) {
        optionals.set(3);
      }
      if (struct.isSetToChannel()) {
        optionals.set(4);
      }
      if (struct.isSetRevision()) {
        optionals.set(5);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(6);
      }
      if (struct.isSetContent()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetFromId()) {
        oprot.writeString(struct.fromId);
      }
      if (struct.isSetToId()) {
        oprot.writeString(struct.toId);
      }
      if (struct.isSetFromChannel()) {
        oprot.writeString(struct.fromChannel);
      }
      if (struct.isSetToChannel()) {
        oprot.writeString(struct.toChannel);
      }
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetContent()) {
        {
          oprot.writeI32(struct.content.size());
          for (Map.Entry<String, String> _iter225 : struct.content.entrySet())
          {
            oprot.writeString(_iter225.getKey());
            oprot.writeString(_iter225.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NotificationItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.fromId = iprot.readString();
        struct.setFromIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.toId = iprot.readString();
        struct.setToIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.fromChannel = iprot.readString();
        struct.setFromChannelIsSet(true);
      }
      if (incoming.get(4)) {
        struct.toChannel = iprot.readString();
        struct.setToChannelIsSet(true);
      }
      if (incoming.get(5)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
      if (incoming.get(6)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TMap _map226 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.content = new HashMap<String,String>(2*_map226.size);
          String _key227;
          String _val228;
          for (int _i229 = 0; _i229 < _map226.size; ++_i229)
          {
            _key227 = iprot.readString();
            _val228 = iprot.readString();
            struct.content.put(_key227, _val228);
          }
        }
        struct.setContentIsSet(true);
      }
    }
  }

}
