/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.linecorp.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-08")
public class AgeCheckRequestResult implements org.apache.thrift.TBase<AgeCheckRequestResult, AgeCheckRequestResult._Fields>, java.io.Serializable, Cloneable, Comparable<AgeCheckRequestResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AgeCheckRequestResult");

  private static final org.apache.thrift.protocol.TField AUTH_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("authUrl", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AgeCheckRequestResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AgeCheckRequestResultTupleSchemeFactory());
  }

  private String authUrl; // required
  private String sessionId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AUTH_URL((short)1, "authUrl"),
    SESSION_ID((short)2, "sessionId");

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
        case 1: // AUTH_URL
          return AUTH_URL;
        case 2: // SESSION_ID
          return SESSION_ID;
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
    tmpMap.put(_Fields.AUTH_URL, new org.apache.thrift.meta_data.FieldMetaData("authUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AgeCheckRequestResult.class, metaDataMap);
  }

  public AgeCheckRequestResult() {
  }

  public AgeCheckRequestResult(
    String authUrl,
    String sessionId)
  {
    this();
    this.authUrl = authUrl;
    this.sessionId = sessionId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AgeCheckRequestResult(AgeCheckRequestResult other) {
    if (other.isSetAuthUrl()) {
      this.authUrl = other.authUrl;
    }
    if (other.isSetSessionId()) {
      this.sessionId = other.sessionId;
    }
  }

  public AgeCheckRequestResult deepCopy() {
    return new AgeCheckRequestResult(this);
  }

  @Override
  public void clear() {
    this.authUrl = null;
    this.sessionId = null;
  }

  public String getAuthUrl() {
    return this.authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  public void unsetAuthUrl() {
    this.authUrl = null;
  }

  /** Returns true if field authUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthUrl() {
    return this.authUrl != null;
  }

  public void setAuthUrlIsSet(boolean value) {
    if (!value) {
      this.authUrl = null;
    }
  }

  public String getSessionId() {
    return this.sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public void unsetSessionId() {
    this.sessionId = null;
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return this.sessionId != null;
  }

  public void setSessionIdIsSet(boolean value) {
    if (!value) {
      this.sessionId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AUTH_URL:
      if (value == null) {
        unsetAuthUrl();
      } else {
        setAuthUrl((String)value);
      }
      break;

    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AUTH_URL:
      return getAuthUrl();

    case SESSION_ID:
      return getSessionId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AUTH_URL:
      return isSetAuthUrl();
    case SESSION_ID:
      return isSetSessionId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AgeCheckRequestResult)
      return this.equals((AgeCheckRequestResult)that);
    return false;
  }

  public boolean equals(AgeCheckRequestResult that) {
    if (that == null)
      return false;

    boolean this_present_authUrl = true && this.isSetAuthUrl();
    boolean that_present_authUrl = true && that.isSetAuthUrl();
    if (this_present_authUrl || that_present_authUrl) {
      if (!(this_present_authUrl && that_present_authUrl))
        return false;
      if (!this.authUrl.equals(that.authUrl))
        return false;
    }

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (!this.sessionId.equals(that.sessionId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_authUrl = true && (isSetAuthUrl());
    list.add(present_authUrl);
    if (present_authUrl)
      list.add(authUrl);

    boolean present_sessionId = true && (isSetSessionId());
    list.add(present_sessionId);
    if (present_sessionId)
      list.add(sessionId);

    return list.hashCode();
  }

  @Override
  public int compareTo(AgeCheckRequestResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAuthUrl()).compareTo(other.isSetAuthUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authUrl, other.authUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
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
    StringBuilder sb = new StringBuilder("AgeCheckRequestResult(");
    boolean first = true;

    sb.append("authUrl:");
    if (this.authUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.authUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionId:");
    if (this.sessionId == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionId);
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

  private static class AgeCheckRequestResultStandardSchemeFactory implements SchemeFactory {
    public AgeCheckRequestResultStandardScheme getScheme() {
      return new AgeCheckRequestResultStandardScheme();
    }
  }

  private static class AgeCheckRequestResultStandardScheme extends StandardScheme<AgeCheckRequestResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AUTH_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authUrl = iprot.readString();
              struct.setAuthUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionId = iprot.readString();
              struct.setSessionIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.authUrl != null) {
        oprot.writeFieldBegin(AUTH_URL_FIELD_DESC);
        oprot.writeString(struct.authUrl);
        oprot.writeFieldEnd();
      }
      if (struct.sessionId != null) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeString(struct.sessionId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AgeCheckRequestResultTupleSchemeFactory implements SchemeFactory {
    public AgeCheckRequestResultTupleScheme getScheme() {
      return new AgeCheckRequestResultTupleScheme();
    }
  }

  private static class AgeCheckRequestResultTupleScheme extends TupleScheme<AgeCheckRequestResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAuthUrl()) {
        optionals.set(0);
      }
      if (struct.isSetSessionId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAuthUrl()) {
        oprot.writeString(struct.authUrl);
      }
      if (struct.isSetSessionId()) {
        oprot.writeString(struct.sessionId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.authUrl = iprot.readString();
        struct.setAuthUrlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sessionId = iprot.readString();
        struct.setSessionIdIsSet(true);
      }
    }
  }

}

