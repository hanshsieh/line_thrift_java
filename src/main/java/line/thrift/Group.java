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
public class Group implements org.apache.thrift.TBase<Group, Group._Fields>, java.io.Serializable, Cloneable, Comparable<Group> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Group");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField PICTURE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("pictureStatus", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField MEMBERS_FIELD_DESC = new org.apache.thrift.protocol.TField("members", org.apache.thrift.protocol.TType.LIST, (short)20);
  private static final org.apache.thrift.protocol.TField CREATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("creator", org.apache.thrift.protocol.TType.STRUCT, (short)21);
  private static final org.apache.thrift.protocol.TField INVITEE_FIELD_DESC = new org.apache.thrift.protocol.TField("invitee", org.apache.thrift.protocol.TType.LIST, (short)22);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_DISABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationDisabled", org.apache.thrift.protocol.TType.BOOL, (short)31);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GroupTupleSchemeFactory());
  }

  private String id; // required
  private long createdTime; // required
  private String name; // required
  private String pictureStatus; // required
  private List<Contact> members; // required
  private Contact creator; // required
  private List<Contact> invitee; // required
  private boolean notificationDisabled; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CREATED_TIME((short)2, "createdTime"),
    NAME((short)10, "name"),
    PICTURE_STATUS((short)11, "pictureStatus"),
    MEMBERS((short)20, "members"),
    CREATOR((short)21, "creator"),
    INVITEE((short)22, "invitee"),
    NOTIFICATION_DISABLED((short)31, "notificationDisabled");

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
        case 2: // CREATED_TIME
          return CREATED_TIME;
        case 10: // NAME
          return NAME;
        case 11: // PICTURE_STATUS
          return PICTURE_STATUS;
        case 20: // MEMBERS
          return MEMBERS;
        case 21: // CREATOR
          return CREATOR;
        case 22: // INVITEE
          return INVITEE;
        case 31: // NOTIFICATION_DISABLED
          return NOTIFICATION_DISABLED;
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
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __NOTIFICATIONDISABLED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("pictureStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MEMBERS, new org.apache.thrift.meta_data.FieldMetaData("members", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class))));
    tmpMap.put(_Fields.CREATOR, new org.apache.thrift.meta_data.FieldMetaData("creator", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class)));
    tmpMap.put(_Fields.INVITEE, new org.apache.thrift.meta_data.FieldMetaData("invitee", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class))));
    tmpMap.put(_Fields.NOTIFICATION_DISABLED, new org.apache.thrift.meta_data.FieldMetaData("notificationDisabled", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Group.class, metaDataMap);
  }

  public Group() {
  }

  public Group(
    String id,
    long createdTime,
    String name,
    String pictureStatus,
    List<Contact> members,
    Contact creator,
    List<Contact> invitee,
    boolean notificationDisabled)
  {
    this();
    this.id = id;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.name = name;
    this.pictureStatus = pictureStatus;
    this.members = members;
    this.creator = creator;
    this.invitee = invitee;
    this.notificationDisabled = notificationDisabled;
    setNotificationDisabledIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Group(Group other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.createdTime = other.createdTime;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetPictureStatus()) {
      this.pictureStatus = other.pictureStatus;
    }
    if (other.isSetMembers()) {
      List<Contact> __this__members = new ArrayList<Contact>(other.members.size());
      for (Contact other_element : other.members) {
        __this__members.add(new Contact(other_element));
      }
      this.members = __this__members;
    }
    if (other.isSetCreator()) {
      this.creator = new Contact(other.creator);
    }
    if (other.isSetInvitee()) {
      List<Contact> __this__invitee = new ArrayList<Contact>(other.invitee.size());
      for (Contact other_element : other.invitee) {
        __this__invitee.add(new Contact(other_element));
      }
      this.invitee = __this__invitee;
    }
    this.notificationDisabled = other.notificationDisabled;
  }

  public Group deepCopy() {
    return new Group(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.name = null;
    this.pictureStatus = null;
    this.members = null;
    this.creator = null;
    this.invitee = null;
    setNotificationDisabledIsSet(false);
    this.notificationDisabled = false;
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getPictureStatus() {
    return this.pictureStatus;
  }

  public void setPictureStatus(String pictureStatus) {
    this.pictureStatus = pictureStatus;
  }

  public void unsetPictureStatus() {
    this.pictureStatus = null;
  }

  /** Returns true if field pictureStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetPictureStatus() {
    return this.pictureStatus != null;
  }

  public void setPictureStatusIsSet(boolean value) {
    if (!value) {
      this.pictureStatus = null;
    }
  }

  public int getMembersSize() {
    return (this.members == null) ? 0 : this.members.size();
  }

  public java.util.Iterator<Contact> getMembersIterator() {
    return (this.members == null) ? null : this.members.iterator();
  }

  public void addToMembers(Contact elem) {
    if (this.members == null) {
      this.members = new ArrayList<Contact>();
    }
    this.members.add(elem);
  }

  public List<Contact> getMembers() {
    return this.members;
  }

  public void setMembers(List<Contact> members) {
    this.members = members;
  }

  public void unsetMembers() {
    this.members = null;
  }

  /** Returns true if field members is set (has been assigned a value) and false otherwise */
  public boolean isSetMembers() {
    return this.members != null;
  }

  public void setMembersIsSet(boolean value) {
    if (!value) {
      this.members = null;
    }
  }

  public Contact getCreator() {
    return this.creator;
  }

  public void setCreator(Contact creator) {
    this.creator = creator;
  }

  public void unsetCreator() {
    this.creator = null;
  }

  /** Returns true if field creator is set (has been assigned a value) and false otherwise */
  public boolean isSetCreator() {
    return this.creator != null;
  }

  public void setCreatorIsSet(boolean value) {
    if (!value) {
      this.creator = null;
    }
  }

  public int getInviteeSize() {
    return (this.invitee == null) ? 0 : this.invitee.size();
  }

  public java.util.Iterator<Contact> getInviteeIterator() {
    return (this.invitee == null) ? null : this.invitee.iterator();
  }

  public void addToInvitee(Contact elem) {
    if (this.invitee == null) {
      this.invitee = new ArrayList<Contact>();
    }
    this.invitee.add(elem);
  }

  public List<Contact> getInvitee() {
    return this.invitee;
  }

  public void setInvitee(List<Contact> invitee) {
    this.invitee = invitee;
  }

  public void unsetInvitee() {
    this.invitee = null;
  }

  /** Returns true if field invitee is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitee() {
    return this.invitee != null;
  }

  public void setInviteeIsSet(boolean value) {
    if (!value) {
      this.invitee = null;
    }
  }

  public boolean isNotificationDisabled() {
    return this.notificationDisabled;
  }

  public void setNotificationDisabled(boolean notificationDisabled) {
    this.notificationDisabled = notificationDisabled;
    setNotificationDisabledIsSet(true);
  }

  public void unsetNotificationDisabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NOTIFICATIONDISABLED_ISSET_ID);
  }

  /** Returns true if field notificationDisabled is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationDisabled() {
    return EncodingUtils.testBit(__isset_bitfield, __NOTIFICATIONDISABLED_ISSET_ID);
  }

  public void setNotificationDisabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NOTIFICATIONDISABLED_ISSET_ID, value);
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

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case PICTURE_STATUS:
      if (value == null) {
        unsetPictureStatus();
      } else {
        setPictureStatus((String)value);
      }
      break;

    case MEMBERS:
      if (value == null) {
        unsetMembers();
      } else {
        setMembers((List<Contact>)value);
      }
      break;

    case CREATOR:
      if (value == null) {
        unsetCreator();
      } else {
        setCreator((Contact)value);
      }
      break;

    case INVITEE:
      if (value == null) {
        unsetInvitee();
      } else {
        setInvitee((List<Contact>)value);
      }
      break;

    case NOTIFICATION_DISABLED:
      if (value == null) {
        unsetNotificationDisabled();
      } else {
        setNotificationDisabled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CREATED_TIME:
      return getCreatedTime();

    case NAME:
      return getName();

    case PICTURE_STATUS:
      return getPictureStatus();

    case MEMBERS:
      return getMembers();

    case CREATOR:
      return getCreator();

    case INVITEE:
      return getInvitee();

    case NOTIFICATION_DISABLED:
      return isNotificationDisabled();

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
    case CREATED_TIME:
      return isSetCreatedTime();
    case NAME:
      return isSetName();
    case PICTURE_STATUS:
      return isSetPictureStatus();
    case MEMBERS:
      return isSetMembers();
    case CREATOR:
      return isSetCreator();
    case INVITEE:
      return isSetInvitee();
    case NOTIFICATION_DISABLED:
      return isSetNotificationDisabled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Group)
      return this.equals((Group)that);
    return false;
  }

  public boolean equals(Group that) {
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

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_pictureStatus = true && this.isSetPictureStatus();
    boolean that_present_pictureStatus = true && that.isSetPictureStatus();
    if (this_present_pictureStatus || that_present_pictureStatus) {
      if (!(this_present_pictureStatus && that_present_pictureStatus))
        return false;
      if (!this.pictureStatus.equals(that.pictureStatus))
        return false;
    }

    boolean this_present_members = true && this.isSetMembers();
    boolean that_present_members = true && that.isSetMembers();
    if (this_present_members || that_present_members) {
      if (!(this_present_members && that_present_members))
        return false;
      if (!this.members.equals(that.members))
        return false;
    }

    boolean this_present_creator = true && this.isSetCreator();
    boolean that_present_creator = true && that.isSetCreator();
    if (this_present_creator || that_present_creator) {
      if (!(this_present_creator && that_present_creator))
        return false;
      if (!this.creator.equals(that.creator))
        return false;
    }

    boolean this_present_invitee = true && this.isSetInvitee();
    boolean that_present_invitee = true && that.isSetInvitee();
    if (this_present_invitee || that_present_invitee) {
      if (!(this_present_invitee && that_present_invitee))
        return false;
      if (!this.invitee.equals(that.invitee))
        return false;
    }

    boolean this_present_notificationDisabled = true;
    boolean that_present_notificationDisabled = true;
    if (this_present_notificationDisabled || that_present_notificationDisabled) {
      if (!(this_present_notificationDisabled && that_present_notificationDisabled))
        return false;
      if (this.notificationDisabled != that.notificationDisabled)
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

    boolean present_createdTime = true;
    list.add(present_createdTime);
    if (present_createdTime)
      list.add(createdTime);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_pictureStatus = true && (isSetPictureStatus());
    list.add(present_pictureStatus);
    if (present_pictureStatus)
      list.add(pictureStatus);

    boolean present_members = true && (isSetMembers());
    list.add(present_members);
    if (present_members)
      list.add(members);

    boolean present_creator = true && (isSetCreator());
    list.add(present_creator);
    if (present_creator)
      list.add(creator);

    boolean present_invitee = true && (isSetInvitee());
    list.add(present_invitee);
    if (present_invitee)
      list.add(invitee);

    boolean present_notificationDisabled = true;
    list.add(present_notificationDisabled);
    if (present_notificationDisabled)
      list.add(notificationDisabled);

    return list.hashCode();
  }

  @Override
  public int compareTo(Group other) {
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
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPictureStatus()).compareTo(other.isSetPictureStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPictureStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pictureStatus, other.pictureStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMembers()).compareTo(other.isSetMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.members, other.members);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreator()).compareTo(other.isSetCreator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creator, other.creator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvitee()).compareTo(other.isSetInvitee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invitee, other.invitee);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotificationDisabled()).compareTo(other.isSetNotificationDisabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationDisabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationDisabled, other.notificationDisabled);
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
    StringBuilder sb = new StringBuilder("Group(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pictureStatus:");
    if (this.pictureStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.pictureStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("members:");
    if (this.members == null) {
      sb.append("null");
    } else {
      sb.append(this.members);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creator:");
    if (this.creator == null) {
      sb.append("null");
    } else {
      sb.append(this.creator);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invitee:");
    if (this.invitee == null) {
      sb.append("null");
    } else {
      sb.append(this.invitee);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationDisabled:");
    sb.append(this.notificationDisabled);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (creator != null) {
      creator.validate();
    }
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

  private static class GroupStandardSchemeFactory implements SchemeFactory {
    public GroupStandardScheme getScheme() {
      return new GroupStandardScheme();
    }
  }

  private static class GroupStandardScheme extends StandardScheme<Group> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Group struct) throws org.apache.thrift.TException {
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
          case 2: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // PICTURE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pictureStatus = iprot.readString();
              struct.setPictureStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // MEMBERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list168 = iprot.readListBegin();
                struct.members = new ArrayList<Contact>(_list168.size);
                Contact _elem169;
                for (int _i170 = 0; _i170 < _list168.size; ++_i170)
                {
                  _elem169 = new Contact();
                  _elem169.read(iprot);
                  struct.members.add(_elem169);
                }
                iprot.readListEnd();
              }
              struct.setMembersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // CREATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.creator = new Contact();
              struct.creator.read(iprot);
              struct.setCreatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 22: // INVITEE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list171 = iprot.readListBegin();
                struct.invitee = new ArrayList<Contact>(_list171.size);
                Contact _elem172;
                for (int _i173 = 0; _i173 < _list171.size; ++_i173)
                {
                  _elem172 = new Contact();
                  _elem172.read(iprot);
                  struct.invitee.add(_elem172);
                }
                iprot.readListEnd();
              }
              struct.setInviteeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 31: // NOTIFICATION_DISABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.notificationDisabled = iprot.readBool();
              struct.setNotificationDisabledIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Group struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.pictureStatus != null) {
        oprot.writeFieldBegin(PICTURE_STATUS_FIELD_DESC);
        oprot.writeString(struct.pictureStatus);
        oprot.writeFieldEnd();
      }
      if (struct.members != null) {
        oprot.writeFieldBegin(MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.members.size()));
          for (Contact _iter174 : struct.members)
          {
            _iter174.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.creator != null) {
        oprot.writeFieldBegin(CREATOR_FIELD_DESC);
        struct.creator.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.invitee != null) {
        oprot.writeFieldBegin(INVITEE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.invitee.size()));
          for (Contact _iter175 : struct.invitee)
          {
            _iter175.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NOTIFICATION_DISABLED_FIELD_DESC);
      oprot.writeBool(struct.notificationDisabled);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupTupleSchemeFactory implements SchemeFactory {
    public GroupTupleScheme getScheme() {
      return new GroupTupleScheme();
    }
  }

  private static class GroupTupleScheme extends TupleScheme<Group> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Group struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetPictureStatus()) {
        optionals.set(3);
      }
      if (struct.isSetMembers()) {
        optionals.set(4);
      }
      if (struct.isSetCreator()) {
        optionals.set(5);
      }
      if (struct.isSetInvitee()) {
        optionals.set(6);
      }
      if (struct.isSetNotificationDisabled()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetPictureStatus()) {
        oprot.writeString(struct.pictureStatus);
      }
      if (struct.isSetMembers()) {
        {
          oprot.writeI32(struct.members.size());
          for (Contact _iter176 : struct.members)
          {
            _iter176.write(oprot);
          }
        }
      }
      if (struct.isSetCreator()) {
        struct.creator.write(oprot);
      }
      if (struct.isSetInvitee()) {
        {
          oprot.writeI32(struct.invitee.size());
          for (Contact _iter177 : struct.invitee)
          {
            _iter177.write(oprot);
          }
        }
      }
      if (struct.isSetNotificationDisabled()) {
        oprot.writeBool(struct.notificationDisabled);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Group struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pictureStatus = iprot.readString();
        struct.setPictureStatusIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list178 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.members = new ArrayList<Contact>(_list178.size);
          Contact _elem179;
          for (int _i180 = 0; _i180 < _list178.size; ++_i180)
          {
            _elem179 = new Contact();
            _elem179.read(iprot);
            struct.members.add(_elem179);
          }
        }
        struct.setMembersIsSet(true);
      }
      if (incoming.get(5)) {
        struct.creator = new Contact();
        struct.creator.read(iprot);
        struct.setCreatorIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list181 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.invitee = new ArrayList<Contact>(_list181.size);
          Contact _elem182;
          for (int _i183 = 0; _i183 < _list181.size; ++_i183)
          {
            _elem182 = new Contact();
            _elem182.read(iprot);
            struct.invitee.add(_elem182);
          }
        }
        struct.setInviteeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.notificationDisabled = iprot.readBool();
        struct.setNotificationDisabledIsSet(true);
      }
    }
  }

}

