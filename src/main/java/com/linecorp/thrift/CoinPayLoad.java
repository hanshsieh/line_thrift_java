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
public class CoinPayLoad implements org.apache.thrift.TBase<CoinPayLoad, CoinPayLoad._Fields>, java.io.Serializable, Cloneable, Comparable<CoinPayLoad> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CoinPayLoad");

  private static final org.apache.thrift.protocol.TField PAY_COIN_FIELD_DESC = new org.apache.thrift.protocol.TField("payCoin", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FREE_COIN_FIELD_DESC = new org.apache.thrift.protocol.TField("freeCoin", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField REWARD_COIN_FIELD_DESC = new org.apache.thrift.protocol.TField("rewardCoin", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CoinPayLoadStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CoinPayLoadTupleSchemeFactory());
  }

  private int payCoin; // required
  private int freeCoin; // required
  private PayloadType type; // required
  private int rewardCoin; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAY_COIN((short)1, "payCoin"),
    FREE_COIN((short)2, "freeCoin"),
    /**
     * 
     * @see PayloadType
     */
    TYPE((short)3, "type"),
    REWARD_COIN((short)4, "rewardCoin");

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
        case 1: // PAY_COIN
          return PAY_COIN;
        case 2: // FREE_COIN
          return FREE_COIN;
        case 3: // TYPE
          return TYPE;
        case 4: // REWARD_COIN
          return REWARD_COIN;
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
  private static final int __PAYCOIN_ISSET_ID = 0;
  private static final int __FREECOIN_ISSET_ID = 1;
  private static final int __REWARDCOIN_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAY_COIN, new org.apache.thrift.meta_data.FieldMetaData("payCoin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_COIN, new org.apache.thrift.meta_data.FieldMetaData("freeCoin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PayloadType.class)));
    tmpMap.put(_Fields.REWARD_COIN, new org.apache.thrift.meta_data.FieldMetaData("rewardCoin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CoinPayLoad.class, metaDataMap);
  }

  public CoinPayLoad() {
  }

  public CoinPayLoad(
    int payCoin,
    int freeCoin,
    PayloadType type,
    int rewardCoin)
  {
    this();
    this.payCoin = payCoin;
    setPayCoinIsSet(true);
    this.freeCoin = freeCoin;
    setFreeCoinIsSet(true);
    this.type = type;
    this.rewardCoin = rewardCoin;
    setRewardCoinIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CoinPayLoad(CoinPayLoad other) {
    __isset_bitfield = other.__isset_bitfield;
    this.payCoin = other.payCoin;
    this.freeCoin = other.freeCoin;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.rewardCoin = other.rewardCoin;
  }

  public CoinPayLoad deepCopy() {
    return new CoinPayLoad(this);
  }

  @Override
  public void clear() {
    setPayCoinIsSet(false);
    this.payCoin = 0;
    setFreeCoinIsSet(false);
    this.freeCoin = 0;
    this.type = null;
    setRewardCoinIsSet(false);
    this.rewardCoin = 0;
  }

  public int getPayCoin() {
    return this.payCoin;
  }

  public void setPayCoin(int payCoin) {
    this.payCoin = payCoin;
    setPayCoinIsSet(true);
  }

  public void unsetPayCoin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAYCOIN_ISSET_ID);
  }

  /** Returns true if field payCoin is set (has been assigned a value) and false otherwise */
  public boolean isSetPayCoin() {
    return EncodingUtils.testBit(__isset_bitfield, __PAYCOIN_ISSET_ID);
  }

  public void setPayCoinIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAYCOIN_ISSET_ID, value);
  }

  public int getFreeCoin() {
    return this.freeCoin;
  }

  public void setFreeCoin(int freeCoin) {
    this.freeCoin = freeCoin;
    setFreeCoinIsSet(true);
  }

  public void unsetFreeCoin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREECOIN_ISSET_ID);
  }

  /** Returns true if field freeCoin is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeCoin() {
    return EncodingUtils.testBit(__isset_bitfield, __FREECOIN_ISSET_ID);
  }

  public void setFreeCoinIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREECOIN_ISSET_ID, value);
  }

  /**
   * 
   * @see PayloadType
   */
  public PayloadType getType() {
    return this.type;
  }

  /**
   * 
   * @see PayloadType
   */
  public void setType(PayloadType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getRewardCoin() {
    return this.rewardCoin;
  }

  public void setRewardCoin(int rewardCoin) {
    this.rewardCoin = rewardCoin;
    setRewardCoinIsSet(true);
  }

  public void unsetRewardCoin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REWARDCOIN_ISSET_ID);
  }

  /** Returns true if field rewardCoin is set (has been assigned a value) and false otherwise */
  public boolean isSetRewardCoin() {
    return EncodingUtils.testBit(__isset_bitfield, __REWARDCOIN_ISSET_ID);
  }

  public void setRewardCoinIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REWARDCOIN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PAY_COIN:
      if (value == null) {
        unsetPayCoin();
      } else {
        setPayCoin((Integer)value);
      }
      break;

    case FREE_COIN:
      if (value == null) {
        unsetFreeCoin();
      } else {
        setFreeCoin((Integer)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((PayloadType)value);
      }
      break;

    case REWARD_COIN:
      if (value == null) {
        unsetRewardCoin();
      } else {
        setRewardCoin((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PAY_COIN:
      return getPayCoin();

    case FREE_COIN:
      return getFreeCoin();

    case TYPE:
      return getType();

    case REWARD_COIN:
      return getRewardCoin();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PAY_COIN:
      return isSetPayCoin();
    case FREE_COIN:
      return isSetFreeCoin();
    case TYPE:
      return isSetType();
    case REWARD_COIN:
      return isSetRewardCoin();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CoinPayLoad)
      return this.equals((CoinPayLoad)that);
    return false;
  }

  public boolean equals(CoinPayLoad that) {
    if (that == null)
      return false;

    boolean this_present_payCoin = true;
    boolean that_present_payCoin = true;
    if (this_present_payCoin || that_present_payCoin) {
      if (!(this_present_payCoin && that_present_payCoin))
        return false;
      if (this.payCoin != that.payCoin)
        return false;
    }

    boolean this_present_freeCoin = true;
    boolean that_present_freeCoin = true;
    if (this_present_freeCoin || that_present_freeCoin) {
      if (!(this_present_freeCoin && that_present_freeCoin))
        return false;
      if (this.freeCoin != that.freeCoin)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_rewardCoin = true;
    boolean that_present_rewardCoin = true;
    if (this_present_rewardCoin || that_present_rewardCoin) {
      if (!(this_present_rewardCoin && that_present_rewardCoin))
        return false;
      if (this.rewardCoin != that.rewardCoin)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_payCoin = true;
    list.add(present_payCoin);
    if (present_payCoin)
      list.add(payCoin);

    boolean present_freeCoin = true;
    list.add(present_freeCoin);
    if (present_freeCoin)
      list.add(freeCoin);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_rewardCoin = true;
    list.add(present_rewardCoin);
    if (present_rewardCoin)
      list.add(rewardCoin);

    return list.hashCode();
  }

  @Override
  public int compareTo(CoinPayLoad other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPayCoin()).compareTo(other.isSetPayCoin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayCoin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payCoin, other.payCoin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFreeCoin()).compareTo(other.isSetFreeCoin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeCoin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeCoin, other.freeCoin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRewardCoin()).compareTo(other.isSetRewardCoin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRewardCoin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rewardCoin, other.rewardCoin);
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
    StringBuilder sb = new StringBuilder("CoinPayLoad(");
    boolean first = true;

    sb.append("payCoin:");
    sb.append(this.payCoin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("freeCoin:");
    sb.append(this.freeCoin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rewardCoin:");
    sb.append(this.rewardCoin);
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

  private static class CoinPayLoadStandardSchemeFactory implements SchemeFactory {
    public CoinPayLoadStandardScheme getScheme() {
      return new CoinPayLoadStandardScheme();
    }
  }

  private static class CoinPayLoadStandardScheme extends StandardScheme<CoinPayLoad> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CoinPayLoad struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAY_COIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.payCoin = iprot.readI32();
              struct.setPayCoinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FREE_COIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeCoin = iprot.readI32();
              struct.setFreeCoinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.linecorp.thrift.PayloadType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REWARD_COIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rewardCoin = iprot.readI32();
              struct.setRewardCoinIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CoinPayLoad struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PAY_COIN_FIELD_DESC);
      oprot.writeI32(struct.payCoin);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FREE_COIN_FIELD_DESC);
      oprot.writeI32(struct.freeCoin);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REWARD_COIN_FIELD_DESC);
      oprot.writeI32(struct.rewardCoin);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CoinPayLoadTupleSchemeFactory implements SchemeFactory {
    public CoinPayLoadTupleScheme getScheme() {
      return new CoinPayLoadTupleScheme();
    }
  }

  private static class CoinPayLoadTupleScheme extends TupleScheme<CoinPayLoad> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CoinPayLoad struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPayCoin()) {
        optionals.set(0);
      }
      if (struct.isSetFreeCoin()) {
        optionals.set(1);
      }
      if (struct.isSetType()) {
        optionals.set(2);
      }
      if (struct.isSetRewardCoin()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPayCoin()) {
        oprot.writeI32(struct.payCoin);
      }
      if (struct.isSetFreeCoin()) {
        oprot.writeI32(struct.freeCoin);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetRewardCoin()) {
        oprot.writeI32(struct.rewardCoin);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CoinPayLoad struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.payCoin = iprot.readI32();
        struct.setPayCoinIsSet(true);
      }
      if (incoming.get(1)) {
        struct.freeCoin = iprot.readI32();
        struct.setFreeCoinIsSet(true);
      }
      if (incoming.get(2)) {
        struct.type = com.linecorp.thrift.PayloadType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rewardCoin = iprot.readI32();
        struct.setRewardCoinIsSet(true);
      }
    }
  }

}

