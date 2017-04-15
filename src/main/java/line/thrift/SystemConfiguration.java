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
public class SystemConfiguration implements org.apache.thrift.TBase<SystemConfiguration, SystemConfiguration._Fields>, java.io.Serializable, Cloneable, Comparable<SystemConfiguration> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SystemConfiguration");

  private static final org.apache.thrift.protocol.TField ENDPOINT_FIELD_DESC = new org.apache.thrift.protocol.TField("endpoint", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ENDPOINT_SSL_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointSsl", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATE_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("updateUrl", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField C2DM_ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("c2dmAccount", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField NNI_SERVER_FIELD_DESC = new org.apache.thrift.protocol.TField("nniServer", org.apache.thrift.protocol.TType.STRING, (short)12);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SystemConfigurationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SystemConfigurationTupleSchemeFactory());
  }

  private String endpoint; // required
  private String endpointSsl; // required
  private String updateUrl; // required
  private String c2dmAccount; // required
  private String nniServer; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENDPOINT((short)1, "endpoint"),
    ENDPOINT_SSL((short)2, "endpointSsl"),
    UPDATE_URL((short)3, "updateUrl"),
    C2DM_ACCOUNT((short)11, "c2dmAccount"),
    NNI_SERVER((short)12, "nniServer");

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
        case 1: // ENDPOINT
          return ENDPOINT;
        case 2: // ENDPOINT_SSL
          return ENDPOINT_SSL;
        case 3: // UPDATE_URL
          return UPDATE_URL;
        case 11: // C2DM_ACCOUNT
          return C2DM_ACCOUNT;
        case 12: // NNI_SERVER
          return NNI_SERVER;
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
    tmpMap.put(_Fields.ENDPOINT, new org.apache.thrift.meta_data.FieldMetaData("endpoint", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENDPOINT_SSL, new org.apache.thrift.meta_data.FieldMetaData("endpointSsl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_URL, new org.apache.thrift.meta_data.FieldMetaData("updateUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.C2DM_ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("c2dmAccount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NNI_SERVER, new org.apache.thrift.meta_data.FieldMetaData("nniServer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SystemConfiguration.class, metaDataMap);
  }

  public SystemConfiguration() {
  }

  public SystemConfiguration(
    String endpoint,
    String endpointSsl,
    String updateUrl,
    String c2dmAccount,
    String nniServer)
  {
    this();
    this.endpoint = endpoint;
    this.endpointSsl = endpointSsl;
    this.updateUrl = updateUrl;
    this.c2dmAccount = c2dmAccount;
    this.nniServer = nniServer;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SystemConfiguration(SystemConfiguration other) {
    if (other.isSetEndpoint()) {
      this.endpoint = other.endpoint;
    }
    if (other.isSetEndpointSsl()) {
      this.endpointSsl = other.endpointSsl;
    }
    if (other.isSetUpdateUrl()) {
      this.updateUrl = other.updateUrl;
    }
    if (other.isSetC2dmAccount()) {
      this.c2dmAccount = other.c2dmAccount;
    }
    if (other.isSetNniServer()) {
      this.nniServer = other.nniServer;
    }
  }

  public SystemConfiguration deepCopy() {
    return new SystemConfiguration(this);
  }

  @Override
  public void clear() {
    this.endpoint = null;
    this.endpointSsl = null;
    this.updateUrl = null;
    this.c2dmAccount = null;
    this.nniServer = null;
  }

  public String getEndpoint() {
    return this.endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public void unsetEndpoint() {
    this.endpoint = null;
  }

  /** Returns true if field endpoint is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpoint() {
    return this.endpoint != null;
  }

  public void setEndpointIsSet(boolean value) {
    if (!value) {
      this.endpoint = null;
    }
  }

  public String getEndpointSsl() {
    return this.endpointSsl;
  }

  public void setEndpointSsl(String endpointSsl) {
    this.endpointSsl = endpointSsl;
  }

  public void unsetEndpointSsl() {
    this.endpointSsl = null;
  }

  /** Returns true if field endpointSsl is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointSsl() {
    return this.endpointSsl != null;
  }

  public void setEndpointSslIsSet(boolean value) {
    if (!value) {
      this.endpointSsl = null;
    }
  }

  public String getUpdateUrl() {
    return this.updateUrl;
  }

  public void setUpdateUrl(String updateUrl) {
    this.updateUrl = updateUrl;
  }

  public void unsetUpdateUrl() {
    this.updateUrl = null;
  }

  /** Returns true if field updateUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateUrl() {
    return this.updateUrl != null;
  }

  public void setUpdateUrlIsSet(boolean value) {
    if (!value) {
      this.updateUrl = null;
    }
  }

  public String getC2dmAccount() {
    return this.c2dmAccount;
  }

  public void setC2dmAccount(String c2dmAccount) {
    this.c2dmAccount = c2dmAccount;
  }

  public void unsetC2dmAccount() {
    this.c2dmAccount = null;
  }

  /** Returns true if field c2dmAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetC2dmAccount() {
    return this.c2dmAccount != null;
  }

  public void setC2dmAccountIsSet(boolean value) {
    if (!value) {
      this.c2dmAccount = null;
    }
  }

  public String getNniServer() {
    return this.nniServer;
  }

  public void setNniServer(String nniServer) {
    this.nniServer = nniServer;
  }

  public void unsetNniServer() {
    this.nniServer = null;
  }

  /** Returns true if field nniServer is set (has been assigned a value) and false otherwise */
  public boolean isSetNniServer() {
    return this.nniServer != null;
  }

  public void setNniServerIsSet(boolean value) {
    if (!value) {
      this.nniServer = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENDPOINT:
      if (value == null) {
        unsetEndpoint();
      } else {
        setEndpoint((String)value);
      }
      break;

    case ENDPOINT_SSL:
      if (value == null) {
        unsetEndpointSsl();
      } else {
        setEndpointSsl((String)value);
      }
      break;

    case UPDATE_URL:
      if (value == null) {
        unsetUpdateUrl();
      } else {
        setUpdateUrl((String)value);
      }
      break;

    case C2DM_ACCOUNT:
      if (value == null) {
        unsetC2dmAccount();
      } else {
        setC2dmAccount((String)value);
      }
      break;

    case NNI_SERVER:
      if (value == null) {
        unsetNniServer();
      } else {
        setNniServer((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENDPOINT:
      return getEndpoint();

    case ENDPOINT_SSL:
      return getEndpointSsl();

    case UPDATE_URL:
      return getUpdateUrl();

    case C2DM_ACCOUNT:
      return getC2dmAccount();

    case NNI_SERVER:
      return getNniServer();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENDPOINT:
      return isSetEndpoint();
    case ENDPOINT_SSL:
      return isSetEndpointSsl();
    case UPDATE_URL:
      return isSetUpdateUrl();
    case C2DM_ACCOUNT:
      return isSetC2dmAccount();
    case NNI_SERVER:
      return isSetNniServer();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SystemConfiguration)
      return this.equals((SystemConfiguration)that);
    return false;
  }

  public boolean equals(SystemConfiguration that) {
    if (that == null)
      return false;

    boolean this_present_endpoint = true && this.isSetEndpoint();
    boolean that_present_endpoint = true && that.isSetEndpoint();
    if (this_present_endpoint || that_present_endpoint) {
      if (!(this_present_endpoint && that_present_endpoint))
        return false;
      if (!this.endpoint.equals(that.endpoint))
        return false;
    }

    boolean this_present_endpointSsl = true && this.isSetEndpointSsl();
    boolean that_present_endpointSsl = true && that.isSetEndpointSsl();
    if (this_present_endpointSsl || that_present_endpointSsl) {
      if (!(this_present_endpointSsl && that_present_endpointSsl))
        return false;
      if (!this.endpointSsl.equals(that.endpointSsl))
        return false;
    }

    boolean this_present_updateUrl = true && this.isSetUpdateUrl();
    boolean that_present_updateUrl = true && that.isSetUpdateUrl();
    if (this_present_updateUrl || that_present_updateUrl) {
      if (!(this_present_updateUrl && that_present_updateUrl))
        return false;
      if (!this.updateUrl.equals(that.updateUrl))
        return false;
    }

    boolean this_present_c2dmAccount = true && this.isSetC2dmAccount();
    boolean that_present_c2dmAccount = true && that.isSetC2dmAccount();
    if (this_present_c2dmAccount || that_present_c2dmAccount) {
      if (!(this_present_c2dmAccount && that_present_c2dmAccount))
        return false;
      if (!this.c2dmAccount.equals(that.c2dmAccount))
        return false;
    }

    boolean this_present_nniServer = true && this.isSetNniServer();
    boolean that_present_nniServer = true && that.isSetNniServer();
    if (this_present_nniServer || that_present_nniServer) {
      if (!(this_present_nniServer && that_present_nniServer))
        return false;
      if (!this.nniServer.equals(that.nniServer))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_endpoint = true && (isSetEndpoint());
    list.add(present_endpoint);
    if (present_endpoint)
      list.add(endpoint);

    boolean present_endpointSsl = true && (isSetEndpointSsl());
    list.add(present_endpointSsl);
    if (present_endpointSsl)
      list.add(endpointSsl);

    boolean present_updateUrl = true && (isSetUpdateUrl());
    list.add(present_updateUrl);
    if (present_updateUrl)
      list.add(updateUrl);

    boolean present_c2dmAccount = true && (isSetC2dmAccount());
    list.add(present_c2dmAccount);
    if (present_c2dmAccount)
      list.add(c2dmAccount);

    boolean present_nniServer = true && (isSetNniServer());
    list.add(present_nniServer);
    if (present_nniServer)
      list.add(nniServer);

    return list.hashCode();
  }

  @Override
  public int compareTo(SystemConfiguration other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEndpoint()).compareTo(other.isSetEndpoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpoint, other.endpoint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpointSsl()).compareTo(other.isSetEndpointSsl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointSsl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointSsl, other.endpointSsl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateUrl()).compareTo(other.isSetUpdateUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateUrl, other.updateUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetC2dmAccount()).compareTo(other.isSetC2dmAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetC2dmAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.c2dmAccount, other.c2dmAccount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNniServer()).compareTo(other.isSetNniServer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNniServer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nniServer, other.nniServer);
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
    StringBuilder sb = new StringBuilder("SystemConfiguration(");
    boolean first = true;

    sb.append("endpoint:");
    if (this.endpoint == null) {
      sb.append("null");
    } else {
      sb.append(this.endpoint);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpointSsl:");
    if (this.endpointSsl == null) {
      sb.append("null");
    } else {
      sb.append(this.endpointSsl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateUrl:");
    if (this.updateUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.updateUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("c2dmAccount:");
    if (this.c2dmAccount == null) {
      sb.append("null");
    } else {
      sb.append(this.c2dmAccount);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nniServer:");
    if (this.nniServer == null) {
      sb.append("null");
    } else {
      sb.append(this.nniServer);
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

  private static class SystemConfigurationStandardSchemeFactory implements SchemeFactory {
    public SystemConfigurationStandardScheme getScheme() {
      return new SystemConfigurationStandardScheme();
    }
  }

  private static class SystemConfigurationStandardScheme extends StandardScheme<SystemConfiguration> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SystemConfiguration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENDPOINT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endpoint = iprot.readString();
              struct.setEndpointIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENDPOINT_SSL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endpointSsl = iprot.readString();
              struct.setEndpointSslIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATE_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateUrl = iprot.readString();
              struct.setUpdateUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // C2DM_ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.c2dmAccount = iprot.readString();
              struct.setC2dmAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // NNI_SERVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nniServer = iprot.readString();
              struct.setNniServerIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SystemConfiguration struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.endpoint != null) {
        oprot.writeFieldBegin(ENDPOINT_FIELD_DESC);
        oprot.writeString(struct.endpoint);
        oprot.writeFieldEnd();
      }
      if (struct.endpointSsl != null) {
        oprot.writeFieldBegin(ENDPOINT_SSL_FIELD_DESC);
        oprot.writeString(struct.endpointSsl);
        oprot.writeFieldEnd();
      }
      if (struct.updateUrl != null) {
        oprot.writeFieldBegin(UPDATE_URL_FIELD_DESC);
        oprot.writeString(struct.updateUrl);
        oprot.writeFieldEnd();
      }
      if (struct.c2dmAccount != null) {
        oprot.writeFieldBegin(C2DM_ACCOUNT_FIELD_DESC);
        oprot.writeString(struct.c2dmAccount);
        oprot.writeFieldEnd();
      }
      if (struct.nniServer != null) {
        oprot.writeFieldBegin(NNI_SERVER_FIELD_DESC);
        oprot.writeString(struct.nniServer);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SystemConfigurationTupleSchemeFactory implements SchemeFactory {
    public SystemConfigurationTupleScheme getScheme() {
      return new SystemConfigurationTupleScheme();
    }
  }

  private static class SystemConfigurationTupleScheme extends TupleScheme<SystemConfiguration> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SystemConfiguration struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEndpoint()) {
        optionals.set(0);
      }
      if (struct.isSetEndpointSsl()) {
        optionals.set(1);
      }
      if (struct.isSetUpdateUrl()) {
        optionals.set(2);
      }
      if (struct.isSetC2dmAccount()) {
        optionals.set(3);
      }
      if (struct.isSetNniServer()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetEndpoint()) {
        oprot.writeString(struct.endpoint);
      }
      if (struct.isSetEndpointSsl()) {
        oprot.writeString(struct.endpointSsl);
      }
      if (struct.isSetUpdateUrl()) {
        oprot.writeString(struct.updateUrl);
      }
      if (struct.isSetC2dmAccount()) {
        oprot.writeString(struct.c2dmAccount);
      }
      if (struct.isSetNniServer()) {
        oprot.writeString(struct.nniServer);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SystemConfiguration struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.endpoint = iprot.readString();
        struct.setEndpointIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endpointSsl = iprot.readString();
        struct.setEndpointSslIsSet(true);
      }
      if (incoming.get(2)) {
        struct.updateUrl = iprot.readString();
        struct.setUpdateUrlIsSet(true);
      }
      if (incoming.get(3)) {
        struct.c2dmAccount = iprot.readString();
        struct.setC2dmAccountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.nniServer = iprot.readString();
        struct.setNniServerIsSet(true);
      }
    }
  }

}

