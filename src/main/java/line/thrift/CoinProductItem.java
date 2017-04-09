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
public class CoinProductItem implements org.apache.thrift.TBase<CoinProductItem, CoinProductItem._Fields>, java.io.Serializable, Cloneable, Comparable<CoinProductItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CoinProductItem");

  private static final org.apache.thrift.protocol.TField ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("itemId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COIN_FIELD_DESC = new org.apache.thrift.protocol.TField("coin", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FREE_COIN_FIELD_DESC = new org.apache.thrift.protocol.TField("freeCoin", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("currency", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DISPLAY_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("displayPrice", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CoinProductItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CoinProductItemTupleSchemeFactory());
  }

  private String itemId; // required
  private int coin; // required
  private int freeCoin; // required
  private String currency; // required
  private String price; // required
  private String displayPrice; // required
  private String name; // required
  private String desc; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM_ID((short)1, "itemId"),
    COIN((short)2, "coin"),
    FREE_COIN((short)3, "freeCoin"),
    CURRENCY((short)5, "currency"),
    PRICE((short)6, "price"),
    DISPLAY_PRICE((short)7, "displayPrice"),
    NAME((short)8, "name"),
    DESC((short)9, "desc");

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
        case 1: // ITEM_ID
          return ITEM_ID;
        case 2: // COIN
          return COIN;
        case 3: // FREE_COIN
          return FREE_COIN;
        case 5: // CURRENCY
          return CURRENCY;
        case 6: // PRICE
          return PRICE;
        case 7: // DISPLAY_PRICE
          return DISPLAY_PRICE;
        case 8: // NAME
          return NAME;
        case 9: // DESC
          return DESC;
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
  private static final int __COIN_ISSET_ID = 0;
  private static final int __FREECOIN_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("itemId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COIN, new org.apache.thrift.meta_data.FieldMetaData("coin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_COIN, new org.apache.thrift.meta_data.FieldMetaData("freeCoin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("currency", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_PRICE, new org.apache.thrift.meta_data.FieldMetaData("displayPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CoinProductItem.class, metaDataMap);
  }

  public CoinProductItem() {
  }

  public CoinProductItem(
    String itemId,
    int coin,
    int freeCoin,
    String currency,
    String price,
    String displayPrice,
    String name,
    String desc)
  {
    this();
    this.itemId = itemId;
    this.coin = coin;
    setCoinIsSet(true);
    this.freeCoin = freeCoin;
    setFreeCoinIsSet(true);
    this.currency = currency;
    this.price = price;
    this.displayPrice = displayPrice;
    this.name = name;
    this.desc = desc;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CoinProductItem(CoinProductItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetItemId()) {
      this.itemId = other.itemId;
    }
    this.coin = other.coin;
    this.freeCoin = other.freeCoin;
    if (other.isSetCurrency()) {
      this.currency = other.currency;
    }
    if (other.isSetPrice()) {
      this.price = other.price;
    }
    if (other.isSetDisplayPrice()) {
      this.displayPrice = other.displayPrice;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
  }

  public CoinProductItem deepCopy() {
    return new CoinProductItem(this);
  }

  @Override
  public void clear() {
    this.itemId = null;
    setCoinIsSet(false);
    this.coin = 0;
    setFreeCoinIsSet(false);
    this.freeCoin = 0;
    this.currency = null;
    this.price = null;
    this.displayPrice = null;
    this.name = null;
    this.desc = null;
  }

  public String getItemId() {
    return this.itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public void unsetItemId() {
    this.itemId = null;
  }

  /** Returns true if field itemId is set (has been assigned a value) and false otherwise */
  public boolean isSetItemId() {
    return this.itemId != null;
  }

  public void setItemIdIsSet(boolean value) {
    if (!value) {
      this.itemId = null;
    }
  }

  public int getCoin() {
    return this.coin;
  }

  public void setCoin(int coin) {
    this.coin = coin;
    setCoinIsSet(true);
  }

  public void unsetCoin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COIN_ISSET_ID);
  }

  /** Returns true if field coin is set (has been assigned a value) and false otherwise */
  public boolean isSetCoin() {
    return EncodingUtils.testBit(__isset_bitfield, __COIN_ISSET_ID);
  }

  public void setCoinIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COIN_ISSET_ID, value);
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

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void unsetCurrency() {
    this.currency = null;
  }

  /** Returns true if field currency is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrency() {
    return this.currency != null;
  }

  public void setCurrencyIsSet(boolean value) {
    if (!value) {
      this.currency = null;
    }
  }

  public String getPrice() {
    return this.price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public void unsetPrice() {
    this.price = null;
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return this.price != null;
  }

  public void setPriceIsSet(boolean value) {
    if (!value) {
      this.price = null;
    }
  }

  public String getDisplayPrice() {
    return this.displayPrice;
  }

  public void setDisplayPrice(String displayPrice) {
    this.displayPrice = displayPrice;
  }

  public void unsetDisplayPrice() {
    this.displayPrice = null;
  }

  /** Returns true if field displayPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayPrice() {
    return this.displayPrice != null;
  }

  public void setDisplayPriceIsSet(boolean value) {
    if (!value) {
      this.displayPrice = null;
    }
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

  public String getDesc() {
    return this.desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM_ID:
      if (value == null) {
        unsetItemId();
      } else {
        setItemId((String)value);
      }
      break;

    case COIN:
      if (value == null) {
        unsetCoin();
      } else {
        setCoin((Integer)value);
      }
      break;

    case FREE_COIN:
      if (value == null) {
        unsetFreeCoin();
      } else {
        setFreeCoin((Integer)value);
      }
      break;

    case CURRENCY:
      if (value == null) {
        unsetCurrency();
      } else {
        setCurrency((String)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((String)value);
      }
      break;

    case DISPLAY_PRICE:
      if (value == null) {
        unsetDisplayPrice();
      } else {
        setDisplayPrice((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM_ID:
      return getItemId();

    case COIN:
      return getCoin();

    case FREE_COIN:
      return getFreeCoin();

    case CURRENCY:
      return getCurrency();

    case PRICE:
      return getPrice();

    case DISPLAY_PRICE:
      return getDisplayPrice();

    case NAME:
      return getName();

    case DESC:
      return getDesc();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM_ID:
      return isSetItemId();
    case COIN:
      return isSetCoin();
    case FREE_COIN:
      return isSetFreeCoin();
    case CURRENCY:
      return isSetCurrency();
    case PRICE:
      return isSetPrice();
    case DISPLAY_PRICE:
      return isSetDisplayPrice();
    case NAME:
      return isSetName();
    case DESC:
      return isSetDesc();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CoinProductItem)
      return this.equals((CoinProductItem)that);
    return false;
  }

  public boolean equals(CoinProductItem that) {
    if (that == null)
      return false;

    boolean this_present_itemId = true && this.isSetItemId();
    boolean that_present_itemId = true && that.isSetItemId();
    if (this_present_itemId || that_present_itemId) {
      if (!(this_present_itemId && that_present_itemId))
        return false;
      if (!this.itemId.equals(that.itemId))
        return false;
    }

    boolean this_present_coin = true;
    boolean that_present_coin = true;
    if (this_present_coin || that_present_coin) {
      if (!(this_present_coin && that_present_coin))
        return false;
      if (this.coin != that.coin)
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

    boolean this_present_currency = true && this.isSetCurrency();
    boolean that_present_currency = true && that.isSetCurrency();
    if (this_present_currency || that_present_currency) {
      if (!(this_present_currency && that_present_currency))
        return false;
      if (!this.currency.equals(that.currency))
        return false;
    }

    boolean this_present_price = true && this.isSetPrice();
    boolean that_present_price = true && that.isSetPrice();
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (!this.price.equals(that.price))
        return false;
    }

    boolean this_present_displayPrice = true && this.isSetDisplayPrice();
    boolean that_present_displayPrice = true && that.isSetDisplayPrice();
    if (this_present_displayPrice || that_present_displayPrice) {
      if (!(this_present_displayPrice && that_present_displayPrice))
        return false;
      if (!this.displayPrice.equals(that.displayPrice))
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

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_itemId = true && (isSetItemId());
    list.add(present_itemId);
    if (present_itemId)
      list.add(itemId);

    boolean present_coin = true;
    list.add(present_coin);
    if (present_coin)
      list.add(coin);

    boolean present_freeCoin = true;
    list.add(present_freeCoin);
    if (present_freeCoin)
      list.add(freeCoin);

    boolean present_currency = true && (isSetCurrency());
    list.add(present_currency);
    if (present_currency)
      list.add(currency);

    boolean present_price = true && (isSetPrice());
    list.add(present_price);
    if (present_price)
      list.add(price);

    boolean present_displayPrice = true && (isSetDisplayPrice());
    list.add(present_displayPrice);
    if (present_displayPrice)
      list.add(displayPrice);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_desc = true && (isSetDesc());
    list.add(present_desc);
    if (present_desc)
      list.add(desc);

    return list.hashCode();
  }

  @Override
  public int compareTo(CoinProductItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetItemId()).compareTo(other.isSetItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemId, other.itemId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoin()).compareTo(other.isSetCoin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coin, other.coin);
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
    lastComparison = Boolean.valueOf(isSetCurrency()).compareTo(other.isSetCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currency, other.currency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrice()).compareTo(other.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayPrice()).compareTo(other.isSetDisplayPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayPrice, other.displayPrice);
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
    lastComparison = Boolean.valueOf(isSetDesc()).compareTo(other.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
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
    StringBuilder sb = new StringBuilder("CoinProductItem(");
    boolean first = true;

    sb.append("itemId:");
    if (this.itemId == null) {
      sb.append("null");
    } else {
      sb.append(this.itemId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("coin:");
    sb.append(this.coin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("freeCoin:");
    sb.append(this.freeCoin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("currency:");
    if (this.currency == null) {
      sb.append("null");
    } else {
      sb.append(this.currency);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    if (this.price == null) {
      sb.append("null");
    } else {
      sb.append(this.price);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayPrice:");
    if (this.displayPrice == null) {
      sb.append("null");
    } else {
      sb.append(this.displayPrice);
    }
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
    sb.append("desc:");
    if (this.desc == null) {
      sb.append("null");
    } else {
      sb.append(this.desc);
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

  private static class CoinProductItemStandardSchemeFactory implements SchemeFactory {
    public CoinProductItemStandardScheme getScheme() {
      return new CoinProductItemStandardScheme();
    }
  }

  private static class CoinProductItemStandardScheme extends StandardScheme<CoinProductItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CoinProductItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.itemId = iprot.readString();
              struct.setItemIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.coin = iprot.readI32();
              struct.setCoinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FREE_COIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeCoin = iprot.readI32();
              struct.setFreeCoinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currency = iprot.readString();
              struct.setCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.price = iprot.readString();
              struct.setPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DISPLAY_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayPrice = iprot.readString();
              struct.setDisplayPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CoinProductItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.itemId != null) {
        oprot.writeFieldBegin(ITEM_ID_FIELD_DESC);
        oprot.writeString(struct.itemId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COIN_FIELD_DESC);
      oprot.writeI32(struct.coin);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FREE_COIN_FIELD_DESC);
      oprot.writeI32(struct.freeCoin);
      oprot.writeFieldEnd();
      if (struct.currency != null) {
        oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
        oprot.writeString(struct.currency);
        oprot.writeFieldEnd();
      }
      if (struct.price != null) {
        oprot.writeFieldBegin(PRICE_FIELD_DESC);
        oprot.writeString(struct.price);
        oprot.writeFieldEnd();
      }
      if (struct.displayPrice != null) {
        oprot.writeFieldBegin(DISPLAY_PRICE_FIELD_DESC);
        oprot.writeString(struct.displayPrice);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.desc != null) {
        oprot.writeFieldBegin(DESC_FIELD_DESC);
        oprot.writeString(struct.desc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CoinProductItemTupleSchemeFactory implements SchemeFactory {
    public CoinProductItemTupleScheme getScheme() {
      return new CoinProductItemTupleScheme();
    }
  }

  private static class CoinProductItemTupleScheme extends TupleScheme<CoinProductItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CoinProductItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItemId()) {
        optionals.set(0);
      }
      if (struct.isSetCoin()) {
        optionals.set(1);
      }
      if (struct.isSetFreeCoin()) {
        optionals.set(2);
      }
      if (struct.isSetCurrency()) {
        optionals.set(3);
      }
      if (struct.isSetPrice()) {
        optionals.set(4);
      }
      if (struct.isSetDisplayPrice()) {
        optionals.set(5);
      }
      if (struct.isSetName()) {
        optionals.set(6);
      }
      if (struct.isSetDesc()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetItemId()) {
        oprot.writeString(struct.itemId);
      }
      if (struct.isSetCoin()) {
        oprot.writeI32(struct.coin);
      }
      if (struct.isSetFreeCoin()) {
        oprot.writeI32(struct.freeCoin);
      }
      if (struct.isSetCurrency()) {
        oprot.writeString(struct.currency);
      }
      if (struct.isSetPrice()) {
        oprot.writeString(struct.price);
      }
      if (struct.isSetDisplayPrice()) {
        oprot.writeString(struct.displayPrice);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CoinProductItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.itemId = iprot.readString();
        struct.setItemIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.coin = iprot.readI32();
        struct.setCoinIsSet(true);
      }
      if (incoming.get(2)) {
        struct.freeCoin = iprot.readI32();
        struct.setFreeCoinIsSet(true);
      }
      if (incoming.get(3)) {
        struct.currency = iprot.readString();
        struct.setCurrencyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.price = iprot.readString();
        struct.setPriceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.displayPrice = iprot.readString();
        struct.setDisplayPriceIsSet(true);
      }
      if (incoming.get(6)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(7)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
    }
  }

}

