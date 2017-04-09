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
public class DeviceInfo implements org.apache.thrift.TBase<DeviceInfo, DeviceInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DeviceInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeviceInfo");

  private static final org.apache.thrift.protocol.TField DEVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("deviceName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SYSTEM_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("systemName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SYSTEM_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("systemVersion", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MODEL_FIELD_DESC = new org.apache.thrift.protocol.TField("model", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CARRIER_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("carrierCode", org.apache.thrift.protocol.TType.I32, (short)10);
  private static final org.apache.thrift.protocol.TField CARRIER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("carrierName", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField APPLICATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationType", org.apache.thrift.protocol.TType.I32, (short)20);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeviceInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeviceInfoTupleSchemeFactory());
  }

  private String deviceName; // required
  private String systemName; // required
  private String systemVersion; // required
  private String model; // required
  private CarrierCode carrierCode; // required
  private String carrierName; // required
  private ApplicationType applicationType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEVICE_NAME((short)1, "deviceName"),
    SYSTEM_NAME((short)2, "systemName"),
    SYSTEM_VERSION((short)3, "systemVersion"),
    MODEL((short)4, "model"),
    /**
     * 
     * @see CarrierCode
     */
    CARRIER_CODE((short)10, "carrierCode"),
    CARRIER_NAME((short)11, "carrierName"),
    /**
     * 
     * @see ApplicationType
     */
    APPLICATION_TYPE((short)20, "applicationType");

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
        case 1: // DEVICE_NAME
          return DEVICE_NAME;
        case 2: // SYSTEM_NAME
          return SYSTEM_NAME;
        case 3: // SYSTEM_VERSION
          return SYSTEM_VERSION;
        case 4: // MODEL
          return MODEL;
        case 10: // CARRIER_CODE
          return CARRIER_CODE;
        case 11: // CARRIER_NAME
          return CARRIER_NAME;
        case 20: // APPLICATION_TYPE
          return APPLICATION_TYPE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("deviceName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SYSTEM_NAME, new org.apache.thrift.meta_data.FieldMetaData("systemName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SYSTEM_VERSION, new org.apache.thrift.meta_data.FieldMetaData("systemVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MODEL, new org.apache.thrift.meta_data.FieldMetaData("model", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CARRIER_CODE, new org.apache.thrift.meta_data.FieldMetaData("carrierCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CarrierCode.class)));
    tmpMap.put(_Fields.CARRIER_NAME, new org.apache.thrift.meta_data.FieldMetaData("carrierName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLICATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("applicationType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ApplicationType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeviceInfo.class, metaDataMap);
  }

  public DeviceInfo() {
  }

  public DeviceInfo(
    String deviceName,
    String systemName,
    String systemVersion,
    String model,
    CarrierCode carrierCode,
    String carrierName,
    ApplicationType applicationType)
  {
    this();
    this.deviceName = deviceName;
    this.systemName = systemName;
    this.systemVersion = systemVersion;
    this.model = model;
    this.carrierCode = carrierCode;
    this.carrierName = carrierName;
    this.applicationType = applicationType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeviceInfo(DeviceInfo other) {
    if (other.isSetDeviceName()) {
      this.deviceName = other.deviceName;
    }
    if (other.isSetSystemName()) {
      this.systemName = other.systemName;
    }
    if (other.isSetSystemVersion()) {
      this.systemVersion = other.systemVersion;
    }
    if (other.isSetModel()) {
      this.model = other.model;
    }
    if (other.isSetCarrierCode()) {
      this.carrierCode = other.carrierCode;
    }
    if (other.isSetCarrierName()) {
      this.carrierName = other.carrierName;
    }
    if (other.isSetApplicationType()) {
      this.applicationType = other.applicationType;
    }
  }

  public DeviceInfo deepCopy() {
    return new DeviceInfo(this);
  }

  @Override
  public void clear() {
    this.deviceName = null;
    this.systemName = null;
    this.systemVersion = null;
    this.model = null;
    this.carrierCode = null;
    this.carrierName = null;
    this.applicationType = null;
  }

  public String getDeviceName() {
    return this.deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public void unsetDeviceName() {
    this.deviceName = null;
  }

  /** Returns true if field deviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetDeviceName() {
    return this.deviceName != null;
  }

  public void setDeviceNameIsSet(boolean value) {
    if (!value) {
      this.deviceName = null;
    }
  }

  public String getSystemName() {
    return this.systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public void unsetSystemName() {
    this.systemName = null;
  }

  /** Returns true if field systemName is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemName() {
    return this.systemName != null;
  }

  public void setSystemNameIsSet(boolean value) {
    if (!value) {
      this.systemName = null;
    }
  }

  public String getSystemVersion() {
    return this.systemVersion;
  }

  public void setSystemVersion(String systemVersion) {
    this.systemVersion = systemVersion;
  }

  public void unsetSystemVersion() {
    this.systemVersion = null;
  }

  /** Returns true if field systemVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemVersion() {
    return this.systemVersion != null;
  }

  public void setSystemVersionIsSet(boolean value) {
    if (!value) {
      this.systemVersion = null;
    }
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void unsetModel() {
    this.model = null;
  }

  /** Returns true if field model is set (has been assigned a value) and false otherwise */
  public boolean isSetModel() {
    return this.model != null;
  }

  public void setModelIsSet(boolean value) {
    if (!value) {
      this.model = null;
    }
  }

  /**
   * 
   * @see CarrierCode
   */
  public CarrierCode getCarrierCode() {
    return this.carrierCode;
  }

  /**
   * 
   * @see CarrierCode
   */
  public void setCarrierCode(CarrierCode carrierCode) {
    this.carrierCode = carrierCode;
  }

  public void unsetCarrierCode() {
    this.carrierCode = null;
  }

  /** Returns true if field carrierCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCarrierCode() {
    return this.carrierCode != null;
  }

  public void setCarrierCodeIsSet(boolean value) {
    if (!value) {
      this.carrierCode = null;
    }
  }

  public String getCarrierName() {
    return this.carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public void unsetCarrierName() {
    this.carrierName = null;
  }

  /** Returns true if field carrierName is set (has been assigned a value) and false otherwise */
  public boolean isSetCarrierName() {
    return this.carrierName != null;
  }

  public void setCarrierNameIsSet(boolean value) {
    if (!value) {
      this.carrierName = null;
    }
  }

  /**
   * 
   * @see ApplicationType
   */
  public ApplicationType getApplicationType() {
    return this.applicationType;
  }

  /**
   * 
   * @see ApplicationType
   */
  public void setApplicationType(ApplicationType applicationType) {
    this.applicationType = applicationType;
  }

  public void unsetApplicationType() {
    this.applicationType = null;
  }

  /** Returns true if field applicationType is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationType() {
    return this.applicationType != null;
  }

  public void setApplicationTypeIsSet(boolean value) {
    if (!value) {
      this.applicationType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVICE_NAME:
      if (value == null) {
        unsetDeviceName();
      } else {
        setDeviceName((String)value);
      }
      break;

    case SYSTEM_NAME:
      if (value == null) {
        unsetSystemName();
      } else {
        setSystemName((String)value);
      }
      break;

    case SYSTEM_VERSION:
      if (value == null) {
        unsetSystemVersion();
      } else {
        setSystemVersion((String)value);
      }
      break;

    case MODEL:
      if (value == null) {
        unsetModel();
      } else {
        setModel((String)value);
      }
      break;

    case CARRIER_CODE:
      if (value == null) {
        unsetCarrierCode();
      } else {
        setCarrierCode((CarrierCode)value);
      }
      break;

    case CARRIER_NAME:
      if (value == null) {
        unsetCarrierName();
      } else {
        setCarrierName((String)value);
      }
      break;

    case APPLICATION_TYPE:
      if (value == null) {
        unsetApplicationType();
      } else {
        setApplicationType((ApplicationType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVICE_NAME:
      return getDeviceName();

    case SYSTEM_NAME:
      return getSystemName();

    case SYSTEM_VERSION:
      return getSystemVersion();

    case MODEL:
      return getModel();

    case CARRIER_CODE:
      return getCarrierCode();

    case CARRIER_NAME:
      return getCarrierName();

    case APPLICATION_TYPE:
      return getApplicationType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVICE_NAME:
      return isSetDeviceName();
    case SYSTEM_NAME:
      return isSetSystemName();
    case SYSTEM_VERSION:
      return isSetSystemVersion();
    case MODEL:
      return isSetModel();
    case CARRIER_CODE:
      return isSetCarrierCode();
    case CARRIER_NAME:
      return isSetCarrierName();
    case APPLICATION_TYPE:
      return isSetApplicationType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeviceInfo)
      return this.equals((DeviceInfo)that);
    return false;
  }

  public boolean equals(DeviceInfo that) {
    if (that == null)
      return false;

    boolean this_present_deviceName = true && this.isSetDeviceName();
    boolean that_present_deviceName = true && that.isSetDeviceName();
    if (this_present_deviceName || that_present_deviceName) {
      if (!(this_present_deviceName && that_present_deviceName))
        return false;
      if (!this.deviceName.equals(that.deviceName))
        return false;
    }

    boolean this_present_systemName = true && this.isSetSystemName();
    boolean that_present_systemName = true && that.isSetSystemName();
    if (this_present_systemName || that_present_systemName) {
      if (!(this_present_systemName && that_present_systemName))
        return false;
      if (!this.systemName.equals(that.systemName))
        return false;
    }

    boolean this_present_systemVersion = true && this.isSetSystemVersion();
    boolean that_present_systemVersion = true && that.isSetSystemVersion();
    if (this_present_systemVersion || that_present_systemVersion) {
      if (!(this_present_systemVersion && that_present_systemVersion))
        return false;
      if (!this.systemVersion.equals(that.systemVersion))
        return false;
    }

    boolean this_present_model = true && this.isSetModel();
    boolean that_present_model = true && that.isSetModel();
    if (this_present_model || that_present_model) {
      if (!(this_present_model && that_present_model))
        return false;
      if (!this.model.equals(that.model))
        return false;
    }

    boolean this_present_carrierCode = true && this.isSetCarrierCode();
    boolean that_present_carrierCode = true && that.isSetCarrierCode();
    if (this_present_carrierCode || that_present_carrierCode) {
      if (!(this_present_carrierCode && that_present_carrierCode))
        return false;
      if (!this.carrierCode.equals(that.carrierCode))
        return false;
    }

    boolean this_present_carrierName = true && this.isSetCarrierName();
    boolean that_present_carrierName = true && that.isSetCarrierName();
    if (this_present_carrierName || that_present_carrierName) {
      if (!(this_present_carrierName && that_present_carrierName))
        return false;
      if (!this.carrierName.equals(that.carrierName))
        return false;
    }

    boolean this_present_applicationType = true && this.isSetApplicationType();
    boolean that_present_applicationType = true && that.isSetApplicationType();
    if (this_present_applicationType || that_present_applicationType) {
      if (!(this_present_applicationType && that_present_applicationType))
        return false;
      if (!this.applicationType.equals(that.applicationType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_deviceName = true && (isSetDeviceName());
    list.add(present_deviceName);
    if (present_deviceName)
      list.add(deviceName);

    boolean present_systemName = true && (isSetSystemName());
    list.add(present_systemName);
    if (present_systemName)
      list.add(systemName);

    boolean present_systemVersion = true && (isSetSystemVersion());
    list.add(present_systemVersion);
    if (present_systemVersion)
      list.add(systemVersion);

    boolean present_model = true && (isSetModel());
    list.add(present_model);
    if (present_model)
      list.add(model);

    boolean present_carrierCode = true && (isSetCarrierCode());
    list.add(present_carrierCode);
    if (present_carrierCode)
      list.add(carrierCode.getValue());

    boolean present_carrierName = true && (isSetCarrierName());
    list.add(present_carrierName);
    if (present_carrierName)
      list.add(carrierName);

    boolean present_applicationType = true && (isSetApplicationType());
    list.add(present_applicationType);
    if (present_applicationType)
      list.add(applicationType.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(DeviceInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDeviceName()).compareTo(other.isSetDeviceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeviceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deviceName, other.deviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSystemName()).compareTo(other.isSetSystemName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.systemName, other.systemName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSystemVersion()).compareTo(other.isSetSystemVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.systemVersion, other.systemVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetModel()).compareTo(other.isSetModel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.model, other.model);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCarrierCode()).compareTo(other.isSetCarrierCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCarrierCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.carrierCode, other.carrierCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCarrierName()).compareTo(other.isSetCarrierName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCarrierName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.carrierName, other.carrierName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationType()).compareTo(other.isSetApplicationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationType, other.applicationType);
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
    StringBuilder sb = new StringBuilder("DeviceInfo(");
    boolean first = true;

    sb.append("deviceName:");
    if (this.deviceName == null) {
      sb.append("null");
    } else {
      sb.append(this.deviceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("systemName:");
    if (this.systemName == null) {
      sb.append("null");
    } else {
      sb.append(this.systemName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("systemVersion:");
    if (this.systemVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.systemVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("model:");
    if (this.model == null) {
      sb.append("null");
    } else {
      sb.append(this.model);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("carrierCode:");
    if (this.carrierCode == null) {
      sb.append("null");
    } else {
      sb.append(this.carrierCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("carrierName:");
    if (this.carrierName == null) {
      sb.append("null");
    } else {
      sb.append(this.carrierName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationType:");
    if (this.applicationType == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationType);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeviceInfoStandardSchemeFactory implements SchemeFactory {
    public DeviceInfoStandardScheme getScheme() {
      return new DeviceInfoStandardScheme();
    }
  }

  private static class DeviceInfoStandardScheme extends StandardScheme<DeviceInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeviceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deviceName = iprot.readString();
              struct.setDeviceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SYSTEM_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.systemName = iprot.readString();
              struct.setSystemNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SYSTEM_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.systemVersion = iprot.readString();
              struct.setSystemVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MODEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.model = iprot.readString();
              struct.setModelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // CARRIER_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.carrierCode = line.thrift.CarrierCode.findByValue(iprot.readI32());
              struct.setCarrierCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // CARRIER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.carrierName = iprot.readString();
              struct.setCarrierNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // APPLICATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.applicationType = line.thrift.ApplicationType.findByValue(iprot.readI32());
              struct.setApplicationTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeviceInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.deviceName != null) {
        oprot.writeFieldBegin(DEVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.deviceName);
        oprot.writeFieldEnd();
      }
      if (struct.systemName != null) {
        oprot.writeFieldBegin(SYSTEM_NAME_FIELD_DESC);
        oprot.writeString(struct.systemName);
        oprot.writeFieldEnd();
      }
      if (struct.systemVersion != null) {
        oprot.writeFieldBegin(SYSTEM_VERSION_FIELD_DESC);
        oprot.writeString(struct.systemVersion);
        oprot.writeFieldEnd();
      }
      if (struct.model != null) {
        oprot.writeFieldBegin(MODEL_FIELD_DESC);
        oprot.writeString(struct.model);
        oprot.writeFieldEnd();
      }
      if (struct.carrierCode != null) {
        oprot.writeFieldBegin(CARRIER_CODE_FIELD_DESC);
        oprot.writeI32(struct.carrierCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.carrierName != null) {
        oprot.writeFieldBegin(CARRIER_NAME_FIELD_DESC);
        oprot.writeString(struct.carrierName);
        oprot.writeFieldEnd();
      }
      if (struct.applicationType != null) {
        oprot.writeFieldBegin(APPLICATION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.applicationType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeviceInfoTupleSchemeFactory implements SchemeFactory {
    public DeviceInfoTupleScheme getScheme() {
      return new DeviceInfoTupleScheme();
    }
  }

  private static class DeviceInfoTupleScheme extends TupleScheme<DeviceInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeviceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDeviceName()) {
        optionals.set(0);
      }
      if (struct.isSetSystemName()) {
        optionals.set(1);
      }
      if (struct.isSetSystemVersion()) {
        optionals.set(2);
      }
      if (struct.isSetModel()) {
        optionals.set(3);
      }
      if (struct.isSetCarrierCode()) {
        optionals.set(4);
      }
      if (struct.isSetCarrierName()) {
        optionals.set(5);
      }
      if (struct.isSetApplicationType()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetDeviceName()) {
        oprot.writeString(struct.deviceName);
      }
      if (struct.isSetSystemName()) {
        oprot.writeString(struct.systemName);
      }
      if (struct.isSetSystemVersion()) {
        oprot.writeString(struct.systemVersion);
      }
      if (struct.isSetModel()) {
        oprot.writeString(struct.model);
      }
      if (struct.isSetCarrierCode()) {
        oprot.writeI32(struct.carrierCode.getValue());
      }
      if (struct.isSetCarrierName()) {
        oprot.writeString(struct.carrierName);
      }
      if (struct.isSetApplicationType()) {
        oprot.writeI32(struct.applicationType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeviceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.deviceName = iprot.readString();
        struct.setDeviceNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.systemName = iprot.readString();
        struct.setSystemNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.systemVersion = iprot.readString();
        struct.setSystemVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.model = iprot.readString();
        struct.setModelIsSet(true);
      }
      if (incoming.get(4)) {
        struct.carrierCode = line.thrift.CarrierCode.findByValue(iprot.readI32());
        struct.setCarrierCodeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.carrierName = iprot.readString();
        struct.setCarrierNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.applicationType = line.thrift.ApplicationType.findByValue(iprot.readI32());
        struct.setApplicationTypeIsSet(true);
      }
    }
  }

}

