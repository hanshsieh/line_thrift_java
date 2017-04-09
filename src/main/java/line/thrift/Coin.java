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
public class Coin implements org.apache.thrift.TBase<Coin, Coin._Fields>, java.io.Serializable, Cloneable, Comparable<Coin> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Coin");

  private static final org.apache.thrift.protocol.TField FREE_COIN_BALANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("freeCoinBalance", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PAYED_COIN_BALANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("payedCoinBalance", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_COIN_BALANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("totalCoinBalance", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField REWARD_COIN_BALANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("rewardCoinBalance", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CoinStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CoinTupleSchemeFactory());
  }

  private int freeCoinBalance; // required
  private int payedCoinBalance; // required
  private int totalCoinBalance; // required
  private int rewardCoinBalance; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FREE_COIN_BALANCE((short)1, "freeCoinBalance"),
    PAYED_COIN_BALANCE((short)2, "payedCoinBalance"),
    TOTAL_COIN_BALANCE((short)3, "totalCoinBalance"),
    REWARD_COIN_BALANCE((short)4, "rewardCoinBalance");

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
        case 1: // FREE_COIN_BALANCE
          return FREE_COIN_BALANCE;
        case 2: // PAYED_COIN_BALANCE
          return PAYED_COIN_BALANCE;
        case 3: // TOTAL_COIN_BALANCE
          return TOTAL_COIN_BALANCE;
        case 4: // REWARD_COIN_BALANCE
          return REWARD_COIN_BALANCE;
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
  private static final int __FREECOINBALANCE_ISSET_ID = 0;
  private static final int __PAYEDCOINBALANCE_ISSET_ID = 1;
  private static final int __TOTALCOINBALANCE_ISSET_ID = 2;
  private static final int __REWARDCOINBALANCE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FREE_COIN_BALANCE, new org.apache.thrift.meta_data.FieldMetaData("freeCoinBalance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAYED_COIN_BALANCE, new org.apache.thrift.meta_data.FieldMetaData("payedCoinBalance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_COIN_BALANCE, new org.apache.thrift.meta_data.FieldMetaData("totalCoinBalance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REWARD_COIN_BALANCE, new org.apache.thrift.meta_data.FieldMetaData("rewardCoinBalance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Coin.class, metaDataMap);
  }

  public Coin() {
  }

  public Coin(
    int freeCoinBalance,
    int payedCoinBalance,
    int totalCoinBalance,
    int rewardCoinBalance)
  {
    this();
    this.freeCoinBalance = freeCoinBalance;
    setFreeCoinBalanceIsSet(true);
    this.payedCoinBalance = payedCoinBalance;
    setPayedCoinBalanceIsSet(true);
    this.totalCoinBalance = totalCoinBalance;
    setTotalCoinBalanceIsSet(true);
    this.rewardCoinBalance = rewardCoinBalance;
    setRewardCoinBalanceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Coin(Coin other) {
    __isset_bitfield = other.__isset_bitfield;
    this.freeCoinBalance = other.freeCoinBalance;
    this.payedCoinBalance = other.payedCoinBalance;
    this.totalCoinBalance = other.totalCoinBalance;
    this.rewardCoinBalance = other.rewardCoinBalance;
  }

  public Coin deepCopy() {
    return new Coin(this);
  }

  @Override
  public void clear() {
    setFreeCoinBalanceIsSet(false);
    this.freeCoinBalance = 0;
    setPayedCoinBalanceIsSet(false);
    this.payedCoinBalance = 0;
    setTotalCoinBalanceIsSet(false);
    this.totalCoinBalance = 0;
    setRewardCoinBalanceIsSet(false);
    this.rewardCoinBalance = 0;
  }

  public int getFreeCoinBalance() {
    return this.freeCoinBalance;
  }

  public void setFreeCoinBalance(int freeCoinBalance) {
    this.freeCoinBalance = freeCoinBalance;
    setFreeCoinBalanceIsSet(true);
  }

  public void unsetFreeCoinBalance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREECOINBALANCE_ISSET_ID);
  }

  /** Returns true if field freeCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeCoinBalance() {
    return EncodingUtils.testBit(__isset_bitfield, __FREECOINBALANCE_ISSET_ID);
  }

  public void setFreeCoinBalanceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREECOINBALANCE_ISSET_ID, value);
  }

  public int getPayedCoinBalance() {
    return this.payedCoinBalance;
  }

  public void setPayedCoinBalance(int payedCoinBalance) {
    this.payedCoinBalance = payedCoinBalance;
    setPayedCoinBalanceIsSet(true);
  }

  public void unsetPayedCoinBalance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAYEDCOINBALANCE_ISSET_ID);
  }

  /** Returns true if field payedCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetPayedCoinBalance() {
    return EncodingUtils.testBit(__isset_bitfield, __PAYEDCOINBALANCE_ISSET_ID);
  }

  public void setPayedCoinBalanceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAYEDCOINBALANCE_ISSET_ID, value);
  }

  public int getTotalCoinBalance() {
    return this.totalCoinBalance;
  }

  public void setTotalCoinBalance(int totalCoinBalance) {
    this.totalCoinBalance = totalCoinBalance;
    setTotalCoinBalanceIsSet(true);
  }

  public void unsetTotalCoinBalance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALCOINBALANCE_ISSET_ID);
  }

  /** Returns true if field totalCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalCoinBalance() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALCOINBALANCE_ISSET_ID);
  }

  public void setTotalCoinBalanceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALCOINBALANCE_ISSET_ID, value);
  }

  public int getRewardCoinBalance() {
    return this.rewardCoinBalance;
  }

  public void setRewardCoinBalance(int rewardCoinBalance) {
    this.rewardCoinBalance = rewardCoinBalance;
    setRewardCoinBalanceIsSet(true);
  }

  public void unsetRewardCoinBalance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REWARDCOINBALANCE_ISSET_ID);
  }

  /** Returns true if field rewardCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetRewardCoinBalance() {
    return EncodingUtils.testBit(__isset_bitfield, __REWARDCOINBALANCE_ISSET_ID);
  }

  public void setRewardCoinBalanceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REWARDCOINBALANCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FREE_COIN_BALANCE:
      if (value == null) {
        unsetFreeCoinBalance();
      } else {
        setFreeCoinBalance((Integer)value);
      }
      break;

    case PAYED_COIN_BALANCE:
      if (value == null) {
        unsetPayedCoinBalance();
      } else {
        setPayedCoinBalance((Integer)value);
      }
      break;

    case TOTAL_COIN_BALANCE:
      if (value == null) {
        unsetTotalCoinBalance();
      } else {
        setTotalCoinBalance((Integer)value);
      }
      break;

    case REWARD_COIN_BALANCE:
      if (value == null) {
        unsetRewardCoinBalance();
      } else {
        setRewardCoinBalance((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FREE_COIN_BALANCE:
      return getFreeCoinBalance();

    case PAYED_COIN_BALANCE:
      return getPayedCoinBalance();

    case TOTAL_COIN_BALANCE:
      return getTotalCoinBalance();

    case REWARD_COIN_BALANCE:
      return getRewardCoinBalance();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FREE_COIN_BALANCE:
      return isSetFreeCoinBalance();
    case PAYED_COIN_BALANCE:
      return isSetPayedCoinBalance();
    case TOTAL_COIN_BALANCE:
      return isSetTotalCoinBalance();
    case REWARD_COIN_BALANCE:
      return isSetRewardCoinBalance();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Coin)
      return this.equals((Coin)that);
    return false;
  }

  public boolean equals(Coin that) {
    if (that == null)
      return false;

    boolean this_present_freeCoinBalance = true;
    boolean that_present_freeCoinBalance = true;
    if (this_present_freeCoinBalance || that_present_freeCoinBalance) {
      if (!(this_present_freeCoinBalance && that_present_freeCoinBalance))
        return false;
      if (this.freeCoinBalance != that.freeCoinBalance)
        return false;
    }

    boolean this_present_payedCoinBalance = true;
    boolean that_present_payedCoinBalance = true;
    if (this_present_payedCoinBalance || that_present_payedCoinBalance) {
      if (!(this_present_payedCoinBalance && that_present_payedCoinBalance))
        return false;
      if (this.payedCoinBalance != that.payedCoinBalance)
        return false;
    }

    boolean this_present_totalCoinBalance = true;
    boolean that_present_totalCoinBalance = true;
    if (this_present_totalCoinBalance || that_present_totalCoinBalance) {
      if (!(this_present_totalCoinBalance && that_present_totalCoinBalance))
        return false;
      if (this.totalCoinBalance != that.totalCoinBalance)
        return false;
    }

    boolean this_present_rewardCoinBalance = true;
    boolean that_present_rewardCoinBalance = true;
    if (this_present_rewardCoinBalance || that_present_rewardCoinBalance) {
      if (!(this_present_rewardCoinBalance && that_present_rewardCoinBalance))
        return false;
      if (this.rewardCoinBalance != that.rewardCoinBalance)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_freeCoinBalance = true;
    list.add(present_freeCoinBalance);
    if (present_freeCoinBalance)
      list.add(freeCoinBalance);

    boolean present_payedCoinBalance = true;
    list.add(present_payedCoinBalance);
    if (present_payedCoinBalance)
      list.add(payedCoinBalance);

    boolean present_totalCoinBalance = true;
    list.add(present_totalCoinBalance);
    if (present_totalCoinBalance)
      list.add(totalCoinBalance);

    boolean present_rewardCoinBalance = true;
    list.add(present_rewardCoinBalance);
    if (present_rewardCoinBalance)
      list.add(rewardCoinBalance);

    return list.hashCode();
  }

  @Override
  public int compareTo(Coin other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFreeCoinBalance()).compareTo(other.isSetFreeCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeCoinBalance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeCoinBalance, other.freeCoinBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPayedCoinBalance()).compareTo(other.isSetPayedCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayedCoinBalance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payedCoinBalance, other.payedCoinBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalCoinBalance()).compareTo(other.isSetTotalCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalCoinBalance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalCoinBalance, other.totalCoinBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRewardCoinBalance()).compareTo(other.isSetRewardCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRewardCoinBalance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rewardCoinBalance, other.rewardCoinBalance);
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
    StringBuilder sb = new StringBuilder("Coin(");
    boolean first = true;

    sb.append("freeCoinBalance:");
    sb.append(this.freeCoinBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("payedCoinBalance:");
    sb.append(this.payedCoinBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalCoinBalance:");
    sb.append(this.totalCoinBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rewardCoinBalance:");
    sb.append(this.rewardCoinBalance);
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

  private static class CoinStandardSchemeFactory implements SchemeFactory {
    public CoinStandardScheme getScheme() {
      return new CoinStandardScheme();
    }
  }

  private static class CoinStandardScheme extends StandardScheme<Coin> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Coin struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FREE_COIN_BALANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeCoinBalance = iprot.readI32();
              struct.setFreeCoinBalanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PAYED_COIN_BALANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.payedCoinBalance = iprot.readI32();
              struct.setPayedCoinBalanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_COIN_BALANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalCoinBalance = iprot.readI32();
              struct.setTotalCoinBalanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REWARD_COIN_BALANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rewardCoinBalance = iprot.readI32();
              struct.setRewardCoinBalanceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Coin struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FREE_COIN_BALANCE_FIELD_DESC);
      oprot.writeI32(struct.freeCoinBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAYED_COIN_BALANCE_FIELD_DESC);
      oprot.writeI32(struct.payedCoinBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_COIN_BALANCE_FIELD_DESC);
      oprot.writeI32(struct.totalCoinBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REWARD_COIN_BALANCE_FIELD_DESC);
      oprot.writeI32(struct.rewardCoinBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CoinTupleSchemeFactory implements SchemeFactory {
    public CoinTupleScheme getScheme() {
      return new CoinTupleScheme();
    }
  }

  private static class CoinTupleScheme extends TupleScheme<Coin> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Coin struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFreeCoinBalance()) {
        optionals.set(0);
      }
      if (struct.isSetPayedCoinBalance()) {
        optionals.set(1);
      }
      if (struct.isSetTotalCoinBalance()) {
        optionals.set(2);
      }
      if (struct.isSetRewardCoinBalance()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetFreeCoinBalance()) {
        oprot.writeI32(struct.freeCoinBalance);
      }
      if (struct.isSetPayedCoinBalance()) {
        oprot.writeI32(struct.payedCoinBalance);
      }
      if (struct.isSetTotalCoinBalance()) {
        oprot.writeI32(struct.totalCoinBalance);
      }
      if (struct.isSetRewardCoinBalance()) {
        oprot.writeI32(struct.rewardCoinBalance);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Coin struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.freeCoinBalance = iprot.readI32();
        struct.setFreeCoinBalanceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.payedCoinBalance = iprot.readI32();
        struct.setPayedCoinBalanceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.totalCoinBalance = iprot.readI32();
        struct.setTotalCoinBalanceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rewardCoinBalance = iprot.readI32();
        struct.setRewardCoinBalanceIsSet(true);
      }
    }
  }

}

