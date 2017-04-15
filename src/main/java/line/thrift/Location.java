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
public class Location implements org.apache.thrift.TBase<Location, Location._Fields>, java.io.Serializable, Cloneable, Comparable<Location> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Location");

  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LATITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("latitude", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField LONGITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("longitude", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("phone", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LocationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LocationTupleSchemeFactory());
  }

  private String title; // required
  private String address; // required
  private double latitude; // required
  private double longitude; // required
  private String phone; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "title"),
    ADDRESS((short)2, "address"),
    LATITUDE((short)3, "latitude"),
    LONGITUDE((short)4, "longitude"),
    PHONE((short)5, "phone");

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
        case 1: // TITLE
          return TITLE;
        case 2: // ADDRESS
          return ADDRESS;
        case 3: // LATITUDE
          return LATITUDE;
        case 4: // LONGITUDE
          return LONGITUDE;
        case 5: // PHONE
          return PHONE;
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
  private static final int __LATITUDE_ISSET_ID = 0;
  private static final int __LONGITUDE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LATITUDE, new org.apache.thrift.meta_data.FieldMetaData("latitude", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LONGITUDE, new org.apache.thrift.meta_data.FieldMetaData("longitude", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PHONE, new org.apache.thrift.meta_data.FieldMetaData("phone", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Location.class, metaDataMap);
  }

  public Location() {
  }

  public Location(
    String title,
    String address,
    double latitude,
    double longitude,
    String phone)
  {
    this();
    this.title = title;
    this.address = address;
    this.latitude = latitude;
    setLatitudeIsSet(true);
    this.longitude = longitude;
    setLongitudeIsSet(true);
    this.phone = phone;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Location(Location other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetAddress()) {
      this.address = other.address;
    }
    this.latitude = other.latitude;
    this.longitude = other.longitude;
    if (other.isSetPhone()) {
      this.phone = other.phone;
    }
  }

  public Location deepCopy() {
    return new Location(this);
  }

  @Override
  public void clear() {
    this.title = null;
    this.address = null;
    setLatitudeIsSet(false);
    this.latitude = 0.0;
    setLongitudeIsSet(false);
    this.longitude = 0.0;
    this.phone = null;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
    setLatitudeIsSet(true);
  }

  public void unsetLatitude() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  /** Returns true if field latitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLatitude() {
    return EncodingUtils.testBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  public void setLatitudeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LATITUDE_ISSET_ID, value);
  }

  public double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
    setLongitudeIsSet(true);
  }

  public void unsetLongitude() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  /** Returns true if field longitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLongitude() {
    return EncodingUtils.testBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  public void setLongitudeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LONGITUDE_ISSET_ID, value);
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void unsetPhone() {
    this.phone = null;
  }

  /** Returns true if field phone is set (has been assigned a value) and false otherwise */
  public boolean isSetPhone() {
    return this.phone != null;
  }

  public void setPhoneIsSet(boolean value) {
    if (!value) {
      this.phone = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((String)value);
      }
      break;

    case LATITUDE:
      if (value == null) {
        unsetLatitude();
      } else {
        setLatitude((Double)value);
      }
      break;

    case LONGITUDE:
      if (value == null) {
        unsetLongitude();
      } else {
        setLongitude((Double)value);
      }
      break;

    case PHONE:
      if (value == null) {
        unsetPhone();
      } else {
        setPhone((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TITLE:
      return getTitle();

    case ADDRESS:
      return getAddress();

    case LATITUDE:
      return getLatitude();

    case LONGITUDE:
      return getLongitude();

    case PHONE:
      return getPhone();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TITLE:
      return isSetTitle();
    case ADDRESS:
      return isSetAddress();
    case LATITUDE:
      return isSetLatitude();
    case LONGITUDE:
      return isSetLongitude();
    case PHONE:
      return isSetPhone();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Location)
      return this.equals((Location)that);
    return false;
  }

  public boolean equals(Location that) {
    if (that == null)
      return false;

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_latitude = true;
    boolean that_present_latitude = true;
    if (this_present_latitude || that_present_latitude) {
      if (!(this_present_latitude && that_present_latitude))
        return false;
      if (this.latitude != that.latitude)
        return false;
    }

    boolean this_present_longitude = true;
    boolean that_present_longitude = true;
    if (this_present_longitude || that_present_longitude) {
      if (!(this_present_longitude && that_present_longitude))
        return false;
      if (this.longitude != that.longitude)
        return false;
    }

    boolean this_present_phone = true && this.isSetPhone();
    boolean that_present_phone = true && that.isSetPhone();
    if (this_present_phone || that_present_phone) {
      if (!(this_present_phone && that_present_phone))
        return false;
      if (!this.phone.equals(that.phone))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_address = true && (isSetAddress());
    list.add(present_address);
    if (present_address)
      list.add(address);

    boolean present_latitude = true;
    list.add(present_latitude);
    if (present_latitude)
      list.add(latitude);

    boolean present_longitude = true;
    list.add(present_longitude);
    if (present_longitude)
      list.add(longitude);

    boolean present_phone = true && (isSetPhone());
    list.add(present_phone);
    if (present_phone)
      list.add(phone);

    return list.hashCode();
  }

  @Override
  public int compareTo(Location other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatitude()).compareTo(other.isSetLatitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latitude, other.latitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLongitude()).compareTo(other.isSetLongitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longitude, other.longitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhone()).compareTo(other.isSetPhone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phone, other.phone);
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
    StringBuilder sb = new StringBuilder("Location(");
    boolean first = true;

    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("latitude:");
    sb.append(this.latitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("longitude:");
    sb.append(this.longitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("phone:");
    if (this.phone == null) {
      sb.append("null");
    } else {
      sb.append(this.phone);
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

  private static class LocationStandardSchemeFactory implements SchemeFactory {
    public LocationStandardScheme getScheme() {
      return new LocationStandardScheme();
    }
  }

  private static class LocationStandardScheme extends StandardScheme<Location> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.address = iprot.readString();
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LATITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.latitude = iprot.readDouble();
              struct.setLatitudeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LONGITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.longitude = iprot.readDouble();
              struct.setLongitudeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PHONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.phone = iprot.readString();
              struct.setPhoneIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Location struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        oprot.writeString(struct.address);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
      oprot.writeDouble(struct.latitude);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
      oprot.writeDouble(struct.longitude);
      oprot.writeFieldEnd();
      if (struct.phone != null) {
        oprot.writeFieldBegin(PHONE_FIELD_DESC);
        oprot.writeString(struct.phone);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocationTupleSchemeFactory implements SchemeFactory {
    public LocationTupleScheme getScheme() {
      return new LocationTupleScheme();
    }
  }

  private static class LocationTupleScheme extends TupleScheme<Location> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTitle()) {
        optionals.set(0);
      }
      if (struct.isSetAddress()) {
        optionals.set(1);
      }
      if (struct.isSetLatitude()) {
        optionals.set(2);
      }
      if (struct.isSetLongitude()) {
        optionals.set(3);
      }
      if (struct.isSetPhone()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetAddress()) {
        oprot.writeString(struct.address);
      }
      if (struct.isSetLatitude()) {
        oprot.writeDouble(struct.latitude);
      }
      if (struct.isSetLongitude()) {
        oprot.writeDouble(struct.longitude);
      }
      if (struct.isSetPhone()) {
        oprot.writeString(struct.phone);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.address = iprot.readString();
        struct.setAddressIsSet(true);
      }
      if (incoming.get(2)) {
        struct.latitude = iprot.readDouble();
        struct.setLatitudeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.longitude = iprot.readDouble();
        struct.setLongitudeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.phone = iprot.readString();
        struct.setPhoneIsSet(true);
      }
    }
  }

}

