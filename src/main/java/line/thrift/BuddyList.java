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
public class BuddyList implements org.apache.thrift.TBase<BuddyList, BuddyList._Fields>, java.io.Serializable, Cloneable, Comparable<BuddyList> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuddyList");

  private static final org.apache.thrift.protocol.TField CLASSIFICATION_FIELD_DESC = new org.apache.thrift.protocol.TField("classification", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_BUDDY_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalBuddyCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField POPULAR_CONTACTS_FIELD_DESC = new org.apache.thrift.protocol.TField("popularContacts", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuddyListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuddyListTupleSchemeFactory());
  }

  private String classification; // required
  private String displayName; // required
  private int totalBuddyCount; // required
  private List<Contact> popularContacts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLASSIFICATION((short)1, "classification"),
    DISPLAY_NAME((short)2, "displayName"),
    TOTAL_BUDDY_COUNT((short)3, "totalBuddyCount"),
    POPULAR_CONTACTS((short)4, "popularContacts");

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
        case 1: // CLASSIFICATION
          return CLASSIFICATION;
        case 2: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 3: // TOTAL_BUDDY_COUNT
          return TOTAL_BUDDY_COUNT;
        case 4: // POPULAR_CONTACTS
          return POPULAR_CONTACTS;
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
  private static final int __TOTALBUDDYCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLASSIFICATION, new org.apache.thrift.meta_data.FieldMetaData("classification", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOTAL_BUDDY_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalBuddyCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POPULAR_CONTACTS, new org.apache.thrift.meta_data.FieldMetaData("popularContacts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuddyList.class, metaDataMap);
  }

  public BuddyList() {
  }

  public BuddyList(
    String classification,
    String displayName,
    int totalBuddyCount,
    List<Contact> popularContacts)
  {
    this();
    this.classification = classification;
    this.displayName = displayName;
    this.totalBuddyCount = totalBuddyCount;
    setTotalBuddyCountIsSet(true);
    this.popularContacts = popularContacts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyList(BuddyList other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetClassification()) {
      this.classification = other.classification;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    this.totalBuddyCount = other.totalBuddyCount;
    if (other.isSetPopularContacts()) {
      List<Contact> __this__popularContacts = new ArrayList<Contact>(other.popularContacts.size());
      for (Contact other_element : other.popularContacts) {
        __this__popularContacts.add(new Contact(other_element));
      }
      this.popularContacts = __this__popularContacts;
    }
  }

  public BuddyList deepCopy() {
    return new BuddyList(this);
  }

  @Override
  public void clear() {
    this.classification = null;
    this.displayName = null;
    setTotalBuddyCountIsSet(false);
    this.totalBuddyCount = 0;
    this.popularContacts = null;
  }

  public String getClassification() {
    return this.classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public void unsetClassification() {
    this.classification = null;
  }

  /** Returns true if field classification is set (has been assigned a value) and false otherwise */
  public boolean isSetClassification() {
    return this.classification != null;
  }

  public void setClassificationIsSet(boolean value) {
    if (!value) {
      this.classification = null;
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

  public int getTotalBuddyCount() {
    return this.totalBuddyCount;
  }

  public void setTotalBuddyCount(int totalBuddyCount) {
    this.totalBuddyCount = totalBuddyCount;
    setTotalBuddyCountIsSet(true);
  }

  public void unsetTotalBuddyCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALBUDDYCOUNT_ISSET_ID);
  }

  /** Returns true if field totalBuddyCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalBuddyCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALBUDDYCOUNT_ISSET_ID);
  }

  public void setTotalBuddyCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALBUDDYCOUNT_ISSET_ID, value);
  }

  public int getPopularContactsSize() {
    return (this.popularContacts == null) ? 0 : this.popularContacts.size();
  }

  public java.util.Iterator<Contact> getPopularContactsIterator() {
    return (this.popularContacts == null) ? null : this.popularContacts.iterator();
  }

  public void addToPopularContacts(Contact elem) {
    if (this.popularContacts == null) {
      this.popularContacts = new ArrayList<Contact>();
    }
    this.popularContacts.add(elem);
  }

  public List<Contact> getPopularContacts() {
    return this.popularContacts;
  }

  public void setPopularContacts(List<Contact> popularContacts) {
    this.popularContacts = popularContacts;
  }

  public void unsetPopularContacts() {
    this.popularContacts = null;
  }

  /** Returns true if field popularContacts is set (has been assigned a value) and false otherwise */
  public boolean isSetPopularContacts() {
    return this.popularContacts != null;
  }

  public void setPopularContactsIsSet(boolean value) {
    if (!value) {
      this.popularContacts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLASSIFICATION:
      if (value == null) {
        unsetClassification();
      } else {
        setClassification((String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((String)value);
      }
      break;

    case TOTAL_BUDDY_COUNT:
      if (value == null) {
        unsetTotalBuddyCount();
      } else {
        setTotalBuddyCount((Integer)value);
      }
      break;

    case POPULAR_CONTACTS:
      if (value == null) {
        unsetPopularContacts();
      } else {
        setPopularContacts((List<Contact>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLASSIFICATION:
      return getClassification();

    case DISPLAY_NAME:
      return getDisplayName();

    case TOTAL_BUDDY_COUNT:
      return getTotalBuddyCount();

    case POPULAR_CONTACTS:
      return getPopularContacts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLASSIFICATION:
      return isSetClassification();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case TOTAL_BUDDY_COUNT:
      return isSetTotalBuddyCount();
    case POPULAR_CONTACTS:
      return isSetPopularContacts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyList)
      return this.equals((BuddyList)that);
    return false;
  }

  public boolean equals(BuddyList that) {
    if (that == null)
      return false;

    boolean this_present_classification = true && this.isSetClassification();
    boolean that_present_classification = true && that.isSetClassification();
    if (this_present_classification || that_present_classification) {
      if (!(this_present_classification && that_present_classification))
        return false;
      if (!this.classification.equals(that.classification))
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

    boolean this_present_totalBuddyCount = true;
    boolean that_present_totalBuddyCount = true;
    if (this_present_totalBuddyCount || that_present_totalBuddyCount) {
      if (!(this_present_totalBuddyCount && that_present_totalBuddyCount))
        return false;
      if (this.totalBuddyCount != that.totalBuddyCount)
        return false;
    }

    boolean this_present_popularContacts = true && this.isSetPopularContacts();
    boolean that_present_popularContacts = true && that.isSetPopularContacts();
    if (this_present_popularContacts || that_present_popularContacts) {
      if (!(this_present_popularContacts && that_present_popularContacts))
        return false;
      if (!this.popularContacts.equals(that.popularContacts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_classification = true && (isSetClassification());
    list.add(present_classification);
    if (present_classification)
      list.add(classification);

    boolean present_displayName = true && (isSetDisplayName());
    list.add(present_displayName);
    if (present_displayName)
      list.add(displayName);

    boolean present_totalBuddyCount = true;
    list.add(present_totalBuddyCount);
    if (present_totalBuddyCount)
      list.add(totalBuddyCount);

    boolean present_popularContacts = true && (isSetPopularContacts());
    list.add(present_popularContacts);
    if (present_popularContacts)
      list.add(popularContacts);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuddyList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClassification()).compareTo(other.isSetClassification());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClassification()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.classification, other.classification);
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
    lastComparison = Boolean.valueOf(isSetTotalBuddyCount()).compareTo(other.isSetTotalBuddyCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalBuddyCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalBuddyCount, other.totalBuddyCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPopularContacts()).compareTo(other.isSetPopularContacts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPopularContacts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.popularContacts, other.popularContacts);
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
    StringBuilder sb = new StringBuilder("BuddyList(");
    boolean first = true;

    sb.append("classification:");
    if (this.classification == null) {
      sb.append("null");
    } else {
      sb.append(this.classification);
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
    sb.append("totalBuddyCount:");
    sb.append(this.totalBuddyCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("popularContacts:");
    if (this.popularContacts == null) {
      sb.append("null");
    } else {
      sb.append(this.popularContacts);
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

  private static class BuddyListStandardSchemeFactory implements SchemeFactory {
    public BuddyListStandardScheme getScheme() {
      return new BuddyListStandardScheme();
    }
  }

  private static class BuddyListStandardScheme extends StandardScheme<BuddyList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuddyList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLASSIFICATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.classification = iprot.readString();
              struct.setClassificationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_BUDDY_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalBuddyCount = iprot.readI32();
              struct.setTotalBuddyCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // POPULAR_CONTACTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.popularContacts = new ArrayList<Contact>(_list32.size);
                Contact _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new Contact();
                  _elem33.read(iprot);
                  struct.popularContacts.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setPopularContactsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuddyList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.classification != null) {
        oprot.writeFieldBegin(CLASSIFICATION_FIELD_DESC);
        oprot.writeString(struct.classification);
        oprot.writeFieldEnd();
      }
      if (struct.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.displayName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_BUDDY_COUNT_FIELD_DESC);
      oprot.writeI32(struct.totalBuddyCount);
      oprot.writeFieldEnd();
      if (struct.popularContacts != null) {
        oprot.writeFieldBegin(POPULAR_CONTACTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.popularContacts.size()));
          for (Contact _iter35 : struct.popularContacts)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuddyListTupleSchemeFactory implements SchemeFactory {
    public BuddyListTupleScheme getScheme() {
      return new BuddyListTupleScheme();
    }
  }

  private static class BuddyListTupleScheme extends TupleScheme<BuddyList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuddyList struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClassification()) {
        optionals.set(0);
      }
      if (struct.isSetDisplayName()) {
        optionals.set(1);
      }
      if (struct.isSetTotalBuddyCount()) {
        optionals.set(2);
      }
      if (struct.isSetPopularContacts()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetClassification()) {
        oprot.writeString(struct.classification);
      }
      if (struct.isSetDisplayName()) {
        oprot.writeString(struct.displayName);
      }
      if (struct.isSetTotalBuddyCount()) {
        oprot.writeI32(struct.totalBuddyCount);
      }
      if (struct.isSetPopularContacts()) {
        {
          oprot.writeI32(struct.popularContacts.size());
          for (Contact _iter36 : struct.popularContacts)
          {
            _iter36.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuddyList struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.classification = iprot.readString();
        struct.setClassificationIsSet(true);
      }
      if (incoming.get(1)) {
        struct.displayName = iprot.readString();
        struct.setDisplayNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.totalBuddyCount = iprot.readI32();
        struct.setTotalBuddyCountIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.popularContacts = new ArrayList<Contact>(_list37.size);
          Contact _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = new Contact();
            _elem38.read(iprot);
            struct.popularContacts.add(_elem38);
          }
        }
        struct.setPopularContactsIsSet(true);
      }
    }
  }

}
