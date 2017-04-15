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
public class CoinUseReservation implements org.apache.thrift.TBase<CoinUseReservation, CoinUseReservation._Fields>, java.io.Serializable, Cloneable, Comparable<CoinUseReservation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CoinUseReservation");

  private static final org.apache.thrift.protocol.TField CHANNEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("channelId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SHOP_ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("shopOrderId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField APP_STORE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("appStoreCode", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("items", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField COUNTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("country", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CoinUseReservationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CoinUseReservationTupleSchemeFactory());
  }

  private String channelId; // required
  private String shopOrderId; // required
  private PaymentType appStoreCode; // required
  private List<CoinUseReservationItem> items; // required
  private String country; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHANNEL_ID((short)1, "channelId"),
    SHOP_ORDER_ID((short)2, "shopOrderId"),
    /**
     * 
     * @see PaymentType
     */
    APP_STORE_CODE((short)3, "appStoreCode"),
    ITEMS((short)4, "items"),
    COUNTRY((short)5, "country");

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
        case 1: // CHANNEL_ID
          return CHANNEL_ID;
        case 2: // SHOP_ORDER_ID
          return SHOP_ORDER_ID;
        case 3: // APP_STORE_CODE
          return APP_STORE_CODE;
        case 4: // ITEMS
          return ITEMS;
        case 5: // COUNTRY
          return COUNTRY;
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
    tmpMap.put(_Fields.CHANNEL_ID, new org.apache.thrift.meta_data.FieldMetaData("channelId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHOP_ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("shopOrderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_STORE_CODE, new org.apache.thrift.meta_data.FieldMetaData("appStoreCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PaymentType.class)));
    tmpMap.put(_Fields.ITEMS, new org.apache.thrift.meta_data.FieldMetaData("items", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CoinUseReservationItem.class))));
    tmpMap.put(_Fields.COUNTRY, new org.apache.thrift.meta_data.FieldMetaData("country", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CoinUseReservation.class, metaDataMap);
  }

  public CoinUseReservation() {
  }

  public CoinUseReservation(
    String channelId,
    String shopOrderId,
    PaymentType appStoreCode,
    List<CoinUseReservationItem> items,
    String country)
  {
    this();
    this.channelId = channelId;
    this.shopOrderId = shopOrderId;
    this.appStoreCode = appStoreCode;
    this.items = items;
    this.country = country;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CoinUseReservation(CoinUseReservation other) {
    if (other.isSetChannelId()) {
      this.channelId = other.channelId;
    }
    if (other.isSetShopOrderId()) {
      this.shopOrderId = other.shopOrderId;
    }
    if (other.isSetAppStoreCode()) {
      this.appStoreCode = other.appStoreCode;
    }
    if (other.isSetItems()) {
      List<CoinUseReservationItem> __this__items = new ArrayList<CoinUseReservationItem>(other.items.size());
      for (CoinUseReservationItem other_element : other.items) {
        __this__items.add(new CoinUseReservationItem(other_element));
      }
      this.items = __this__items;
    }
    if (other.isSetCountry()) {
      this.country = other.country;
    }
  }

  public CoinUseReservation deepCopy() {
    return new CoinUseReservation(this);
  }

  @Override
  public void clear() {
    this.channelId = null;
    this.shopOrderId = null;
    this.appStoreCode = null;
    this.items = null;
    this.country = null;
  }

  public String getChannelId() {
    return this.channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public void unsetChannelId() {
    this.channelId = null;
  }

  /** Returns true if field channelId is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelId() {
    return this.channelId != null;
  }

  public void setChannelIdIsSet(boolean value) {
    if (!value) {
      this.channelId = null;
    }
  }

  public String getShopOrderId() {
    return this.shopOrderId;
  }

  public void setShopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
  }

  public void unsetShopOrderId() {
    this.shopOrderId = null;
  }

  /** Returns true if field shopOrderId is set (has been assigned a value) and false otherwise */
  public boolean isSetShopOrderId() {
    return this.shopOrderId != null;
  }

  public void setShopOrderIdIsSet(boolean value) {
    if (!value) {
      this.shopOrderId = null;
    }
  }

  /**
   * 
   * @see PaymentType
   */
  public PaymentType getAppStoreCode() {
    return this.appStoreCode;
  }

  /**
   * 
   * @see PaymentType
   */
  public void setAppStoreCode(PaymentType appStoreCode) {
    this.appStoreCode = appStoreCode;
  }

  public void unsetAppStoreCode() {
    this.appStoreCode = null;
  }

  /** Returns true if field appStoreCode is set (has been assigned a value) and false otherwise */
  public boolean isSetAppStoreCode() {
    return this.appStoreCode != null;
  }

  public void setAppStoreCodeIsSet(boolean value) {
    if (!value) {
      this.appStoreCode = null;
    }
  }

  public int getItemsSize() {
    return (this.items == null) ? 0 : this.items.size();
  }

  public java.util.Iterator<CoinUseReservationItem> getItemsIterator() {
    return (this.items == null) ? null : this.items.iterator();
  }

  public void addToItems(CoinUseReservationItem elem) {
    if (this.items == null) {
      this.items = new ArrayList<CoinUseReservationItem>();
    }
    this.items.add(elem);
  }

  public List<CoinUseReservationItem> getItems() {
    return this.items;
  }

  public void setItems(List<CoinUseReservationItem> items) {
    this.items = items;
  }

  public void unsetItems() {
    this.items = null;
  }

  /** Returns true if field items is set (has been assigned a value) and false otherwise */
  public boolean isSetItems() {
    return this.items != null;
  }

  public void setItemsIsSet(boolean value) {
    if (!value) {
      this.items = null;
    }
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void unsetCountry() {
    this.country = null;
  }

  /** Returns true if field country is set (has been assigned a value) and false otherwise */
  public boolean isSetCountry() {
    return this.country != null;
  }

  public void setCountryIsSet(boolean value) {
    if (!value) {
      this.country = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHANNEL_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        setChannelId((String)value);
      }
      break;

    case SHOP_ORDER_ID:
      if (value == null) {
        unsetShopOrderId();
      } else {
        setShopOrderId((String)value);
      }
      break;

    case APP_STORE_CODE:
      if (value == null) {
        unsetAppStoreCode();
      } else {
        setAppStoreCode((PaymentType)value);
      }
      break;

    case ITEMS:
      if (value == null) {
        unsetItems();
      } else {
        setItems((List<CoinUseReservationItem>)value);
      }
      break;

    case COUNTRY:
      if (value == null) {
        unsetCountry();
      } else {
        setCountry((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANNEL_ID:
      return getChannelId();

    case SHOP_ORDER_ID:
      return getShopOrderId();

    case APP_STORE_CODE:
      return getAppStoreCode();

    case ITEMS:
      return getItems();

    case COUNTRY:
      return getCountry();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHANNEL_ID:
      return isSetChannelId();
    case SHOP_ORDER_ID:
      return isSetShopOrderId();
    case APP_STORE_CODE:
      return isSetAppStoreCode();
    case ITEMS:
      return isSetItems();
    case COUNTRY:
      return isSetCountry();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CoinUseReservation)
      return this.equals((CoinUseReservation)that);
    return false;
  }

  public boolean equals(CoinUseReservation that) {
    if (that == null)
      return false;

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (!this.channelId.equals(that.channelId))
        return false;
    }

    boolean this_present_shopOrderId = true && this.isSetShopOrderId();
    boolean that_present_shopOrderId = true && that.isSetShopOrderId();
    if (this_present_shopOrderId || that_present_shopOrderId) {
      if (!(this_present_shopOrderId && that_present_shopOrderId))
        return false;
      if (!this.shopOrderId.equals(that.shopOrderId))
        return false;
    }

    boolean this_present_appStoreCode = true && this.isSetAppStoreCode();
    boolean that_present_appStoreCode = true && that.isSetAppStoreCode();
    if (this_present_appStoreCode || that_present_appStoreCode) {
      if (!(this_present_appStoreCode && that_present_appStoreCode))
        return false;
      if (!this.appStoreCode.equals(that.appStoreCode))
        return false;
    }

    boolean this_present_items = true && this.isSetItems();
    boolean that_present_items = true && that.isSetItems();
    if (this_present_items || that_present_items) {
      if (!(this_present_items && that_present_items))
        return false;
      if (!this.items.equals(that.items))
        return false;
    }

    boolean this_present_country = true && this.isSetCountry();
    boolean that_present_country = true && that.isSetCountry();
    if (this_present_country || that_present_country) {
      if (!(this_present_country && that_present_country))
        return false;
      if (!this.country.equals(that.country))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_channelId = true && (isSetChannelId());
    list.add(present_channelId);
    if (present_channelId)
      list.add(channelId);

    boolean present_shopOrderId = true && (isSetShopOrderId());
    list.add(present_shopOrderId);
    if (present_shopOrderId)
      list.add(shopOrderId);

    boolean present_appStoreCode = true && (isSetAppStoreCode());
    list.add(present_appStoreCode);
    if (present_appStoreCode)
      list.add(appStoreCode.getValue());

    boolean present_items = true && (isSetItems());
    list.add(present_items);
    if (present_items)
      list.add(items);

    boolean present_country = true && (isSetCountry());
    list.add(present_country);
    if (present_country)
      list.add(country);

    return list.hashCode();
  }

  @Override
  public int compareTo(CoinUseReservation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChannelId()).compareTo(other.isSetChannelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelId, other.channelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShopOrderId()).compareTo(other.isSetShopOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShopOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shopOrderId, other.shopOrderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppStoreCode()).compareTo(other.isSetAppStoreCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppStoreCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appStoreCode, other.appStoreCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItems()).compareTo(other.isSetItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.items, other.items);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCountry()).compareTo(other.isSetCountry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.country, other.country);
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
    StringBuilder sb = new StringBuilder("CoinUseReservation(");
    boolean first = true;

    sb.append("channelId:");
    if (this.channelId == null) {
      sb.append("null");
    } else {
      sb.append(this.channelId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shopOrderId:");
    if (this.shopOrderId == null) {
      sb.append("null");
    } else {
      sb.append(this.shopOrderId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("appStoreCode:");
    if (this.appStoreCode == null) {
      sb.append("null");
    } else {
      sb.append(this.appStoreCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("items:");
    if (this.items == null) {
      sb.append("null");
    } else {
      sb.append(this.items);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("country:");
    if (this.country == null) {
      sb.append("null");
    } else {
      sb.append(this.country);
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

  private static class CoinUseReservationStandardSchemeFactory implements SchemeFactory {
    public CoinUseReservationStandardScheme getScheme() {
      return new CoinUseReservationStandardScheme();
    }
  }

  private static class CoinUseReservationStandardScheme extends StandardScheme<CoinUseReservation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CoinUseReservation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANNEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.channelId = iprot.readString();
              struct.setChannelIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SHOP_ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.shopOrderId = iprot.readString();
              struct.setShopOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APP_STORE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appStoreCode = line.thrift.PaymentType.findByValue(iprot.readI32());
              struct.setAppStoreCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list120 = iprot.readListBegin();
                struct.items = new ArrayList<CoinUseReservationItem>(_list120.size);
                CoinUseReservationItem _elem121;
                for (int _i122 = 0; _i122 < _list120.size; ++_i122)
                {
                  _elem121 = new CoinUseReservationItem();
                  _elem121.read(iprot);
                  struct.items.add(_elem121);
                }
                iprot.readListEnd();
              }
              struct.setItemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COUNTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.country = iprot.readString();
              struct.setCountryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CoinUseReservation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(struct.channelId);
        oprot.writeFieldEnd();
      }
      if (struct.shopOrderId != null) {
        oprot.writeFieldBegin(SHOP_ORDER_ID_FIELD_DESC);
        oprot.writeString(struct.shopOrderId);
        oprot.writeFieldEnd();
      }
      if (struct.appStoreCode != null) {
        oprot.writeFieldBegin(APP_STORE_CODE_FIELD_DESC);
        oprot.writeI32(struct.appStoreCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.items != null) {
        oprot.writeFieldBegin(ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.items.size()));
          for (CoinUseReservationItem _iter123 : struct.items)
          {
            _iter123.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(struct.country);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CoinUseReservationTupleSchemeFactory implements SchemeFactory {
    public CoinUseReservationTupleScheme getScheme() {
      return new CoinUseReservationTupleScheme();
    }
  }

  private static class CoinUseReservationTupleScheme extends TupleScheme<CoinUseReservation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CoinUseReservation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetChannelId()) {
        optionals.set(0);
      }
      if (struct.isSetShopOrderId()) {
        optionals.set(1);
      }
      if (struct.isSetAppStoreCode()) {
        optionals.set(2);
      }
      if (struct.isSetItems()) {
        optionals.set(3);
      }
      if (struct.isSetCountry()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetChannelId()) {
        oprot.writeString(struct.channelId);
      }
      if (struct.isSetShopOrderId()) {
        oprot.writeString(struct.shopOrderId);
      }
      if (struct.isSetAppStoreCode()) {
        oprot.writeI32(struct.appStoreCode.getValue());
      }
      if (struct.isSetItems()) {
        {
          oprot.writeI32(struct.items.size());
          for (CoinUseReservationItem _iter124 : struct.items)
          {
            _iter124.write(oprot);
          }
        }
      }
      if (struct.isSetCountry()) {
        oprot.writeString(struct.country);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CoinUseReservation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.channelId = iprot.readString();
        struct.setChannelIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.shopOrderId = iprot.readString();
        struct.setShopOrderIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.appStoreCode = line.thrift.PaymentType.findByValue(iprot.readI32());
        struct.setAppStoreCodeIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list125 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.items = new ArrayList<CoinUseReservationItem>(_list125.size);
          CoinUseReservationItem _elem126;
          for (int _i127 = 0; _i127 < _list125.size; ++_i127)
          {
            _elem126 = new CoinUseReservationItem();
            _elem126.read(iprot);
            struct.items.add(_elem126);
          }
        }
        struct.setItemsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.country = iprot.readString();
        struct.setCountryIsSet(true);
      }
    }
  }

}

