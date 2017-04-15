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
public class BuddyOnAir implements org.apache.thrift.TBase<BuddyOnAir, BuddyOnAir._Fields>, java.io.Serializable, Cloneable, Comparable<BuddyOnAir> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuddyOnAir");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FRESHNESS_LIFETIME_FIELD_DESC = new org.apache.thrift.protocol.TField("freshnessLifetime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ON_AIR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("onAirId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ON_AIR_FIELD_DESC = new org.apache.thrift.protocol.TField("onAir", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField VIEWER_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("viewerCount", org.apache.thrift.protocol.TType.I64, (short)12);
  private static final org.apache.thrift.protocol.TField TARGET_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("targetCount", org.apache.thrift.protocol.TType.I64, (short)13);
  private static final org.apache.thrift.protocol.TField ON_AIR_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("onAirType", org.apache.thrift.protocol.TType.I32, (short)31);
  private static final org.apache.thrift.protocol.TField ON_AIR_URLS_FIELD_DESC = new org.apache.thrift.protocol.TField("onAirUrls", org.apache.thrift.protocol.TType.STRUCT, (short)32);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuddyOnAirStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuddyOnAirTupleSchemeFactory());
  }

  private String mid; // required
  private long freshnessLifetime; // required
  private String onAirId; // required
  private boolean onAir; // required
  private String text; // required
  private long viewerCount; // required
  private long targetCount; // required
  private BuddyOnAirType onAirType; // required
  private BuddyOnAirUrls onAirUrls; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    FRESHNESS_LIFETIME((short)3, "freshnessLifetime"),
    ON_AIR_ID((short)4, "onAirId"),
    ON_AIR((short)5, "onAir"),
    TEXT((short)11, "text"),
    VIEWER_COUNT((short)12, "viewerCount"),
    TARGET_COUNT((short)13, "targetCount"),
    /**
     * 
     * @see BuddyOnAirType
     */
    ON_AIR_TYPE((short)31, "onAirType"),
    ON_AIR_URLS((short)32, "onAirUrls");

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
        case 1: // MID
          return MID;
        case 3: // FRESHNESS_LIFETIME
          return FRESHNESS_LIFETIME;
        case 4: // ON_AIR_ID
          return ON_AIR_ID;
        case 5: // ON_AIR
          return ON_AIR;
        case 11: // TEXT
          return TEXT;
        case 12: // VIEWER_COUNT
          return VIEWER_COUNT;
        case 13: // TARGET_COUNT
          return TARGET_COUNT;
        case 31: // ON_AIR_TYPE
          return ON_AIR_TYPE;
        case 32: // ON_AIR_URLS
          return ON_AIR_URLS;
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
  private static final int __FRESHNESSLIFETIME_ISSET_ID = 0;
  private static final int __ONAIR_ISSET_ID = 1;
  private static final int __VIEWERCOUNT_ISSET_ID = 2;
  private static final int __TARGETCOUNT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FRESHNESS_LIFETIME, new org.apache.thrift.meta_data.FieldMetaData("freshnessLifetime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ON_AIR_ID, new org.apache.thrift.meta_data.FieldMetaData("onAirId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ON_AIR, new org.apache.thrift.meta_data.FieldMetaData("onAir", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIEWER_COUNT, new org.apache.thrift.meta_data.FieldMetaData("viewerCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TARGET_COUNT, new org.apache.thrift.meta_data.FieldMetaData("targetCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ON_AIR_TYPE, new org.apache.thrift.meta_data.FieldMetaData("onAirType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuddyOnAirType.class)));
    tmpMap.put(_Fields.ON_AIR_URLS, new org.apache.thrift.meta_data.FieldMetaData("onAirUrls", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuddyOnAirUrls.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuddyOnAir.class, metaDataMap);
  }

  public BuddyOnAir() {
  }

  public BuddyOnAir(
    String mid,
    long freshnessLifetime,
    String onAirId,
    boolean onAir,
    String text,
    long viewerCount,
    long targetCount,
    BuddyOnAirType onAirType,
    BuddyOnAirUrls onAirUrls)
  {
    this();
    this.mid = mid;
    this.freshnessLifetime = freshnessLifetime;
    setFreshnessLifetimeIsSet(true);
    this.onAirId = onAirId;
    this.onAir = onAir;
    setOnAirIsSet(true);
    this.text = text;
    this.viewerCount = viewerCount;
    setViewerCountIsSet(true);
    this.targetCount = targetCount;
    setTargetCountIsSet(true);
    this.onAirType = onAirType;
    this.onAirUrls = onAirUrls;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyOnAir(BuddyOnAir other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.freshnessLifetime = other.freshnessLifetime;
    if (other.isSetOnAirId()) {
      this.onAirId = other.onAirId;
    }
    this.onAir = other.onAir;
    if (other.isSetText()) {
      this.text = other.text;
    }
    this.viewerCount = other.viewerCount;
    this.targetCount = other.targetCount;
    if (other.isSetOnAirType()) {
      this.onAirType = other.onAirType;
    }
    if (other.isSetOnAirUrls()) {
      this.onAirUrls = new BuddyOnAirUrls(other.onAirUrls);
    }
  }

  public BuddyOnAir deepCopy() {
    return new BuddyOnAir(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    setFreshnessLifetimeIsSet(false);
    this.freshnessLifetime = 0;
    this.onAirId = null;
    setOnAirIsSet(false);
    this.onAir = false;
    this.text = null;
    setViewerCountIsSet(false);
    this.viewerCount = 0;
    setTargetCountIsSet(false);
    this.targetCount = 0;
    this.onAirType = null;
    this.onAirUrls = null;
  }

  public String getMid() {
    return this.mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public long getFreshnessLifetime() {
    return this.freshnessLifetime;
  }

  public void setFreshnessLifetime(long freshnessLifetime) {
    this.freshnessLifetime = freshnessLifetime;
    setFreshnessLifetimeIsSet(true);
  }

  public void unsetFreshnessLifetime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FRESHNESSLIFETIME_ISSET_ID);
  }

  /** Returns true if field freshnessLifetime is set (has been assigned a value) and false otherwise */
  public boolean isSetFreshnessLifetime() {
    return EncodingUtils.testBit(__isset_bitfield, __FRESHNESSLIFETIME_ISSET_ID);
  }

  public void setFreshnessLifetimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FRESHNESSLIFETIME_ISSET_ID, value);
  }

  public String getOnAirId() {
    return this.onAirId;
  }

  public void setOnAirId(String onAirId) {
    this.onAirId = onAirId;
  }

  public void unsetOnAirId() {
    this.onAirId = null;
  }

  /** Returns true if field onAirId is set (has been assigned a value) and false otherwise */
  public boolean isSetOnAirId() {
    return this.onAirId != null;
  }

  public void setOnAirIdIsSet(boolean value) {
    if (!value) {
      this.onAirId = null;
    }
  }

  public boolean isOnAir() {
    return this.onAir;
  }

  public void setOnAir(boolean onAir) {
    this.onAir = onAir;
    setOnAirIsSet(true);
  }

  public void unsetOnAir() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ONAIR_ISSET_ID);
  }

  /** Returns true if field onAir is set (has been assigned a value) and false otherwise */
  public boolean isSetOnAir() {
    return EncodingUtils.testBit(__isset_bitfield, __ONAIR_ISSET_ID);
  }

  public void setOnAirIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ONAIR_ISSET_ID, value);
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public long getViewerCount() {
    return this.viewerCount;
  }

  public void setViewerCount(long viewerCount) {
    this.viewerCount = viewerCount;
    setViewerCountIsSet(true);
  }

  public void unsetViewerCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIEWERCOUNT_ISSET_ID);
  }

  /** Returns true if field viewerCount is set (has been assigned a value) and false otherwise */
  public boolean isSetViewerCount() {
    return EncodingUtils.testBit(__isset_bitfield, __VIEWERCOUNT_ISSET_ID);
  }

  public void setViewerCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIEWERCOUNT_ISSET_ID, value);
  }

  public long getTargetCount() {
    return this.targetCount;
  }

  public void setTargetCount(long targetCount) {
    this.targetCount = targetCount;
    setTargetCountIsSet(true);
  }

  public void unsetTargetCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TARGETCOUNT_ISSET_ID);
  }

  /** Returns true if field targetCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TARGETCOUNT_ISSET_ID);
  }

  public void setTargetCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TARGETCOUNT_ISSET_ID, value);
  }

  /**
   * 
   * @see BuddyOnAirType
   */
  public BuddyOnAirType getOnAirType() {
    return this.onAirType;
  }

  /**
   * 
   * @see BuddyOnAirType
   */
  public void setOnAirType(BuddyOnAirType onAirType) {
    this.onAirType = onAirType;
  }

  public void unsetOnAirType() {
    this.onAirType = null;
  }

  /** Returns true if field onAirType is set (has been assigned a value) and false otherwise */
  public boolean isSetOnAirType() {
    return this.onAirType != null;
  }

  public void setOnAirTypeIsSet(boolean value) {
    if (!value) {
      this.onAirType = null;
    }
  }

  public BuddyOnAirUrls getOnAirUrls() {
    return this.onAirUrls;
  }

  public void setOnAirUrls(BuddyOnAirUrls onAirUrls) {
    this.onAirUrls = onAirUrls;
  }

  public void unsetOnAirUrls() {
    this.onAirUrls = null;
  }

  /** Returns true if field onAirUrls is set (has been assigned a value) and false otherwise */
  public boolean isSetOnAirUrls() {
    return this.onAirUrls != null;
  }

  public void setOnAirUrlsIsSet(boolean value) {
    if (!value) {
      this.onAirUrls = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((String)value);
      }
      break;

    case FRESHNESS_LIFETIME:
      if (value == null) {
        unsetFreshnessLifetime();
      } else {
        setFreshnessLifetime((Long)value);
      }
      break;

    case ON_AIR_ID:
      if (value == null) {
        unsetOnAirId();
      } else {
        setOnAirId((String)value);
      }
      break;

    case ON_AIR:
      if (value == null) {
        unsetOnAir();
      } else {
        setOnAir((Boolean)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

    case VIEWER_COUNT:
      if (value == null) {
        unsetViewerCount();
      } else {
        setViewerCount((Long)value);
      }
      break;

    case TARGET_COUNT:
      if (value == null) {
        unsetTargetCount();
      } else {
        setTargetCount((Long)value);
      }
      break;

    case ON_AIR_TYPE:
      if (value == null) {
        unsetOnAirType();
      } else {
        setOnAirType((BuddyOnAirType)value);
      }
      break;

    case ON_AIR_URLS:
      if (value == null) {
        unsetOnAirUrls();
      } else {
        setOnAirUrls((BuddyOnAirUrls)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case FRESHNESS_LIFETIME:
      return getFreshnessLifetime();

    case ON_AIR_ID:
      return getOnAirId();

    case ON_AIR:
      return isOnAir();

    case TEXT:
      return getText();

    case VIEWER_COUNT:
      return getViewerCount();

    case TARGET_COUNT:
      return getTargetCount();

    case ON_AIR_TYPE:
      return getOnAirType();

    case ON_AIR_URLS:
      return getOnAirUrls();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case FRESHNESS_LIFETIME:
      return isSetFreshnessLifetime();
    case ON_AIR_ID:
      return isSetOnAirId();
    case ON_AIR:
      return isSetOnAir();
    case TEXT:
      return isSetText();
    case VIEWER_COUNT:
      return isSetViewerCount();
    case TARGET_COUNT:
      return isSetTargetCount();
    case ON_AIR_TYPE:
      return isSetOnAirType();
    case ON_AIR_URLS:
      return isSetOnAirUrls();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyOnAir)
      return this.equals((BuddyOnAir)that);
    return false;
  }

  public boolean equals(BuddyOnAir that) {
    if (that == null)
      return false;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_freshnessLifetime = true;
    boolean that_present_freshnessLifetime = true;
    if (this_present_freshnessLifetime || that_present_freshnessLifetime) {
      if (!(this_present_freshnessLifetime && that_present_freshnessLifetime))
        return false;
      if (this.freshnessLifetime != that.freshnessLifetime)
        return false;
    }

    boolean this_present_onAirId = true && this.isSetOnAirId();
    boolean that_present_onAirId = true && that.isSetOnAirId();
    if (this_present_onAirId || that_present_onAirId) {
      if (!(this_present_onAirId && that_present_onAirId))
        return false;
      if (!this.onAirId.equals(that.onAirId))
        return false;
    }

    boolean this_present_onAir = true;
    boolean that_present_onAir = true;
    if (this_present_onAir || that_present_onAir) {
      if (!(this_present_onAir && that_present_onAir))
        return false;
      if (this.onAir != that.onAir)
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    boolean this_present_viewerCount = true;
    boolean that_present_viewerCount = true;
    if (this_present_viewerCount || that_present_viewerCount) {
      if (!(this_present_viewerCount && that_present_viewerCount))
        return false;
      if (this.viewerCount != that.viewerCount)
        return false;
    }

    boolean this_present_targetCount = true;
    boolean that_present_targetCount = true;
    if (this_present_targetCount || that_present_targetCount) {
      if (!(this_present_targetCount && that_present_targetCount))
        return false;
      if (this.targetCount != that.targetCount)
        return false;
    }

    boolean this_present_onAirType = true && this.isSetOnAirType();
    boolean that_present_onAirType = true && that.isSetOnAirType();
    if (this_present_onAirType || that_present_onAirType) {
      if (!(this_present_onAirType && that_present_onAirType))
        return false;
      if (!this.onAirType.equals(that.onAirType))
        return false;
    }

    boolean this_present_onAirUrls = true && this.isSetOnAirUrls();
    boolean that_present_onAirUrls = true && that.isSetOnAirUrls();
    if (this_present_onAirUrls || that_present_onAirUrls) {
      if (!(this_present_onAirUrls && that_present_onAirUrls))
        return false;
      if (!this.onAirUrls.equals(that.onAirUrls))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_mid = true && (isSetMid());
    list.add(present_mid);
    if (present_mid)
      list.add(mid);

    boolean present_freshnessLifetime = true;
    list.add(present_freshnessLifetime);
    if (present_freshnessLifetime)
      list.add(freshnessLifetime);

    boolean present_onAirId = true && (isSetOnAirId());
    list.add(present_onAirId);
    if (present_onAirId)
      list.add(onAirId);

    boolean present_onAir = true;
    list.add(present_onAir);
    if (present_onAir)
      list.add(onAir);

    boolean present_text = true && (isSetText());
    list.add(present_text);
    if (present_text)
      list.add(text);

    boolean present_viewerCount = true;
    list.add(present_viewerCount);
    if (present_viewerCount)
      list.add(viewerCount);

    boolean present_targetCount = true;
    list.add(present_targetCount);
    if (present_targetCount)
      list.add(targetCount);

    boolean present_onAirType = true && (isSetOnAirType());
    list.add(present_onAirType);
    if (present_onAirType)
      list.add(onAirType.getValue());

    boolean present_onAirUrls = true && (isSetOnAirUrls());
    list.add(present_onAirUrls);
    if (present_onAirUrls)
      list.add(onAirUrls);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuddyOnAir other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFreshnessLifetime()).compareTo(other.isSetFreshnessLifetime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreshnessLifetime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freshnessLifetime, other.freshnessLifetime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOnAirId()).compareTo(other.isSetOnAirId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnAirId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onAirId, other.onAirId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOnAir()).compareTo(other.isSetOnAir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnAir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onAir, other.onAir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetText()).compareTo(other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViewerCount()).compareTo(other.isSetViewerCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewerCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.viewerCount, other.viewerCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargetCount()).compareTo(other.isSetTargetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetCount, other.targetCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOnAirType()).compareTo(other.isSetOnAirType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnAirType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onAirType, other.onAirType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOnAirUrls()).compareTo(other.isSetOnAirUrls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnAirUrls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onAirUrls, other.onAirUrls);
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
    StringBuilder sb = new StringBuilder("BuddyOnAir(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("freshnessLifetime:");
    sb.append(this.freshnessLifetime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("onAirId:");
    if (this.onAirId == null) {
      sb.append("null");
    } else {
      sb.append(this.onAirId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("onAir:");
    sb.append(this.onAir);
    first = false;
    if (!first) sb.append(", ");
    sb.append("text:");
    if (this.text == null) {
      sb.append("null");
    } else {
      sb.append(this.text);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("viewerCount:");
    sb.append(this.viewerCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetCount:");
    sb.append(this.targetCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("onAirType:");
    if (this.onAirType == null) {
      sb.append("null");
    } else {
      sb.append(this.onAirType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("onAirUrls:");
    if (this.onAirUrls == null) {
      sb.append("null");
    } else {
      sb.append(this.onAirUrls);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (onAirUrls != null) {
      onAirUrls.validate();
    }
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

  private static class BuddyOnAirStandardSchemeFactory implements SchemeFactory {
    public BuddyOnAirStandardScheme getScheme() {
      return new BuddyOnAirStandardScheme();
    }
  }

  private static class BuddyOnAirStandardScheme extends StandardScheme<BuddyOnAir> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuddyOnAir struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FRESHNESS_LIFETIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.freshnessLifetime = iprot.readI64();
              struct.setFreshnessLifetimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ON_AIR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.onAirId = iprot.readString();
              struct.setOnAirIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ON_AIR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.onAir = iprot.readBool();
              struct.setOnAirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // VIEWER_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.viewerCount = iprot.readI64();
              struct.setViewerCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 13: // TARGET_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.targetCount = iprot.readI64();
              struct.setTargetCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 31: // ON_AIR_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.onAirType = line.thrift.BuddyOnAirType.findByValue(iprot.readI32());
              struct.setOnAirTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 32: // ON_AIR_URLS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.onAirUrls = new BuddyOnAirUrls();
              struct.onAirUrls.read(iprot);
              struct.setOnAirUrlsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuddyOnAir struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FRESHNESS_LIFETIME_FIELD_DESC);
      oprot.writeI64(struct.freshnessLifetime);
      oprot.writeFieldEnd();
      if (struct.onAirId != null) {
        oprot.writeFieldBegin(ON_AIR_ID_FIELD_DESC);
        oprot.writeString(struct.onAirId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ON_AIR_FIELD_DESC);
      oprot.writeBool(struct.onAir);
      oprot.writeFieldEnd();
      if (struct.text != null) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeString(struct.text);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VIEWER_COUNT_FIELD_DESC);
      oprot.writeI64(struct.viewerCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TARGET_COUNT_FIELD_DESC);
      oprot.writeI64(struct.targetCount);
      oprot.writeFieldEnd();
      if (struct.onAirType != null) {
        oprot.writeFieldBegin(ON_AIR_TYPE_FIELD_DESC);
        oprot.writeI32(struct.onAirType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.onAirUrls != null) {
        oprot.writeFieldBegin(ON_AIR_URLS_FIELD_DESC);
        struct.onAirUrls.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuddyOnAirTupleSchemeFactory implements SchemeFactory {
    public BuddyOnAirTupleScheme getScheme() {
      return new BuddyOnAirTupleScheme();
    }
  }

  private static class BuddyOnAirTupleScheme extends TupleScheme<BuddyOnAir> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuddyOnAir struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetFreshnessLifetime()) {
        optionals.set(1);
      }
      if (struct.isSetOnAirId()) {
        optionals.set(2);
      }
      if (struct.isSetOnAir()) {
        optionals.set(3);
      }
      if (struct.isSetText()) {
        optionals.set(4);
      }
      if (struct.isSetViewerCount()) {
        optionals.set(5);
      }
      if (struct.isSetTargetCount()) {
        optionals.set(6);
      }
      if (struct.isSetOnAirType()) {
        optionals.set(7);
      }
      if (struct.isSetOnAirUrls()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetFreshnessLifetime()) {
        oprot.writeI64(struct.freshnessLifetime);
      }
      if (struct.isSetOnAirId()) {
        oprot.writeString(struct.onAirId);
      }
      if (struct.isSetOnAir()) {
        oprot.writeBool(struct.onAir);
      }
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
      if (struct.isSetViewerCount()) {
        oprot.writeI64(struct.viewerCount);
      }
      if (struct.isSetTargetCount()) {
        oprot.writeI64(struct.targetCount);
      }
      if (struct.isSetOnAirType()) {
        oprot.writeI32(struct.onAirType.getValue());
      }
      if (struct.isSetOnAirUrls()) {
        struct.onAirUrls.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuddyOnAir struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.freshnessLifetime = iprot.readI64();
        struct.setFreshnessLifetimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.onAirId = iprot.readString();
        struct.setOnAirIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.onAir = iprot.readBool();
        struct.setOnAirIsSet(true);
      }
      if (incoming.get(4)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
      if (incoming.get(5)) {
        struct.viewerCount = iprot.readI64();
        struct.setViewerCountIsSet(true);
      }
      if (incoming.get(6)) {
        struct.targetCount = iprot.readI64();
        struct.setTargetCountIsSet(true);
      }
      if (incoming.get(7)) {
        struct.onAirType = line.thrift.BuddyOnAirType.findByValue(iprot.readI32());
        struct.setOnAirTypeIsSet(true);
      }
      if (incoming.get(8)) {
        struct.onAirUrls = new BuddyOnAirUrls();
        struct.onAirUrls.read(iprot);
        struct.setOnAirUrlsIsSet(true);
      }
    }
  }

}

