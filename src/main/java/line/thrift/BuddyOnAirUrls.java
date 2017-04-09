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
public class BuddyOnAirUrls implements org.apache.thrift.TBase<BuddyOnAirUrls, BuddyOnAirUrls._Fields>, java.io.Serializable, Cloneable, Comparable<BuddyOnAirUrls> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuddyOnAirUrls");

  private static final org.apache.thrift.protocol.TField HLS_FIELD_DESC = new org.apache.thrift.protocol.TField("hls", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField SMOOTH_STREAMING_FIELD_DESC = new org.apache.thrift.protocol.TField("smoothStreaming", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuddyOnAirUrlsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuddyOnAirUrlsTupleSchemeFactory());
  }

  private Map<String,String> hls; // required
  private Map<String,String> smoothStreaming; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HLS((short)1, "hls"),
    SMOOTH_STREAMING((short)2, "smoothStreaming");

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
        case 1: // HLS
          return HLS;
        case 2: // SMOOTH_STREAMING
          return SMOOTH_STREAMING;
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
    tmpMap.put(_Fields.HLS, new org.apache.thrift.meta_data.FieldMetaData("hls", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SMOOTH_STREAMING, new org.apache.thrift.meta_data.FieldMetaData("smoothStreaming", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuddyOnAirUrls.class, metaDataMap);
  }

  public BuddyOnAirUrls() {
  }

  public BuddyOnAirUrls(
    Map<String,String> hls,
    Map<String,String> smoothStreaming)
  {
    this();
    this.hls = hls;
    this.smoothStreaming = smoothStreaming;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyOnAirUrls(BuddyOnAirUrls other) {
    if (other.isSetHls()) {
      Map<String,String> __this__hls = new HashMap<String,String>(other.hls);
      this.hls = __this__hls;
    }
    if (other.isSetSmoothStreaming()) {
      Map<String,String> __this__smoothStreaming = new HashMap<String,String>(other.smoothStreaming);
      this.smoothStreaming = __this__smoothStreaming;
    }
  }

  public BuddyOnAirUrls deepCopy() {
    return new BuddyOnAirUrls(this);
  }

  @Override
  public void clear() {
    this.hls = null;
    this.smoothStreaming = null;
  }

  public int getHlsSize() {
    return (this.hls == null) ? 0 : this.hls.size();
  }

  public void putToHls(String key, String val) {
    if (this.hls == null) {
      this.hls = new HashMap<String,String>();
    }
    this.hls.put(key, val);
  }

  public Map<String,String> getHls() {
    return this.hls;
  }

  public void setHls(Map<String,String> hls) {
    this.hls = hls;
  }

  public void unsetHls() {
    this.hls = null;
  }

  /** Returns true if field hls is set (has been assigned a value) and false otherwise */
  public boolean isSetHls() {
    return this.hls != null;
  }

  public void setHlsIsSet(boolean value) {
    if (!value) {
      this.hls = null;
    }
  }

  public int getSmoothStreamingSize() {
    return (this.smoothStreaming == null) ? 0 : this.smoothStreaming.size();
  }

  public void putToSmoothStreaming(String key, String val) {
    if (this.smoothStreaming == null) {
      this.smoothStreaming = new HashMap<String,String>();
    }
    this.smoothStreaming.put(key, val);
  }

  public Map<String,String> getSmoothStreaming() {
    return this.smoothStreaming;
  }

  public void setSmoothStreaming(Map<String,String> smoothStreaming) {
    this.smoothStreaming = smoothStreaming;
  }

  public void unsetSmoothStreaming() {
    this.smoothStreaming = null;
  }

  /** Returns true if field smoothStreaming is set (has been assigned a value) and false otherwise */
  public boolean isSetSmoothStreaming() {
    return this.smoothStreaming != null;
  }

  public void setSmoothStreamingIsSet(boolean value) {
    if (!value) {
      this.smoothStreaming = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HLS:
      if (value == null) {
        unsetHls();
      } else {
        setHls((Map<String,String>)value);
      }
      break;

    case SMOOTH_STREAMING:
      if (value == null) {
        unsetSmoothStreaming();
      } else {
        setSmoothStreaming((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HLS:
      return getHls();

    case SMOOTH_STREAMING:
      return getSmoothStreaming();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HLS:
      return isSetHls();
    case SMOOTH_STREAMING:
      return isSetSmoothStreaming();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyOnAirUrls)
      return this.equals((BuddyOnAirUrls)that);
    return false;
  }

  public boolean equals(BuddyOnAirUrls that) {
    if (that == null)
      return false;

    boolean this_present_hls = true && this.isSetHls();
    boolean that_present_hls = true && that.isSetHls();
    if (this_present_hls || that_present_hls) {
      if (!(this_present_hls && that_present_hls))
        return false;
      if (!this.hls.equals(that.hls))
        return false;
    }

    boolean this_present_smoothStreaming = true && this.isSetSmoothStreaming();
    boolean that_present_smoothStreaming = true && that.isSetSmoothStreaming();
    if (this_present_smoothStreaming || that_present_smoothStreaming) {
      if (!(this_present_smoothStreaming && that_present_smoothStreaming))
        return false;
      if (!this.smoothStreaming.equals(that.smoothStreaming))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_hls = true && (isSetHls());
    list.add(present_hls);
    if (present_hls)
      list.add(hls);

    boolean present_smoothStreaming = true && (isSetSmoothStreaming());
    list.add(present_smoothStreaming);
    if (present_smoothStreaming)
      list.add(smoothStreaming);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuddyOnAirUrls other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHls()).compareTo(other.isSetHls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hls, other.hls);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSmoothStreaming()).compareTo(other.isSetSmoothStreaming());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSmoothStreaming()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.smoothStreaming, other.smoothStreaming);
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
    StringBuilder sb = new StringBuilder("BuddyOnAirUrls(");
    boolean first = true;

    sb.append("hls:");
    if (this.hls == null) {
      sb.append("null");
    } else {
      sb.append(this.hls);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("smoothStreaming:");
    if (this.smoothStreaming == null) {
      sb.append("null");
    } else {
      sb.append(this.smoothStreaming);
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

  private static class BuddyOnAirUrlsStandardSchemeFactory implements SchemeFactory {
    public BuddyOnAirUrlsStandardScheme getScheme() {
      return new BuddyOnAirUrlsStandardScheme();
    }
  }

  private static class BuddyOnAirUrlsStandardScheme extends StandardScheme<BuddyOnAirUrls> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuddyOnAirUrls struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HLS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map50 = iprot.readMapBegin();
                struct.hls = new HashMap<String,String>(2*_map50.size);
                String _key51;
                String _val52;
                for (int _i53 = 0; _i53 < _map50.size; ++_i53)
                {
                  _key51 = iprot.readString();
                  _val52 = iprot.readString();
                  struct.hls.put(_key51, _val52);
                }
                iprot.readMapEnd();
              }
              struct.setHlsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SMOOTH_STREAMING
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map54 = iprot.readMapBegin();
                struct.smoothStreaming = new HashMap<String,String>(2*_map54.size);
                String _key55;
                String _val56;
                for (int _i57 = 0; _i57 < _map54.size; ++_i57)
                {
                  _key55 = iprot.readString();
                  _val56 = iprot.readString();
                  struct.smoothStreaming.put(_key55, _val56);
                }
                iprot.readMapEnd();
              }
              struct.setSmoothStreamingIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuddyOnAirUrls struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hls != null) {
        oprot.writeFieldBegin(HLS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.hls.size()));
          for (Map.Entry<String, String> _iter58 : struct.hls.entrySet())
          {
            oprot.writeString(_iter58.getKey());
            oprot.writeString(_iter58.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.smoothStreaming != null) {
        oprot.writeFieldBegin(SMOOTH_STREAMING_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.smoothStreaming.size()));
          for (Map.Entry<String, String> _iter59 : struct.smoothStreaming.entrySet())
          {
            oprot.writeString(_iter59.getKey());
            oprot.writeString(_iter59.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuddyOnAirUrlsTupleSchemeFactory implements SchemeFactory {
    public BuddyOnAirUrlsTupleScheme getScheme() {
      return new BuddyOnAirUrlsTupleScheme();
    }
  }

  private static class BuddyOnAirUrlsTupleScheme extends TupleScheme<BuddyOnAirUrls> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuddyOnAirUrls struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHls()) {
        optionals.set(0);
      }
      if (struct.isSetSmoothStreaming()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHls()) {
        {
          oprot.writeI32(struct.hls.size());
          for (Map.Entry<String, String> _iter60 : struct.hls.entrySet())
          {
            oprot.writeString(_iter60.getKey());
            oprot.writeString(_iter60.getValue());
          }
        }
      }
      if (struct.isSetSmoothStreaming()) {
        {
          oprot.writeI32(struct.smoothStreaming.size());
          for (Map.Entry<String, String> _iter61 : struct.smoothStreaming.entrySet())
          {
            oprot.writeString(_iter61.getKey());
            oprot.writeString(_iter61.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuddyOnAirUrls struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map62 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.hls = new HashMap<String,String>(2*_map62.size);
          String _key63;
          String _val64;
          for (int _i65 = 0; _i65 < _map62.size; ++_i65)
          {
            _key63 = iprot.readString();
            _val64 = iprot.readString();
            struct.hls.put(_key63, _val64);
          }
        }
        struct.setHlsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map66 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.smoothStreaming = new HashMap<String,String>(2*_map66.size);
          String _key67;
          String _val68;
          for (int _i69 = 0; _i69 < _map66.size; ++_i69)
          {
            _key67 = iprot.readString();
            _val68 = iprot.readString();
            struct.smoothStreaming.put(_key67, _val68);
          }
        }
        struct.setSmoothStreamingIsSet(true);
      }
    }
  }

}

