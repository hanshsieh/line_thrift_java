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
public class VerificationSessionData implements org.apache.thrift.TBase<VerificationSessionData, VerificationSessionData._Fields>, java.io.Serializable, Cloneable, Comparable<VerificationSessionData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VerificationSessionData");

  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("method", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CALLBACK_FIELD_DESC = new org.apache.thrift.protocol.TField("callback", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NORMALIZED_PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("normalizedPhone", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField COUNTRY_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("countryCode", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField NATIONAL_SIGNIFICANT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("nationalSignificantNumber", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField AVAILABLE_VERIFICATION_METHODS_FIELD_DESC = new org.apache.thrift.protocol.TField("availableVerificationMethods", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VerificationSessionDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VerificationSessionDataTupleSchemeFactory());
  }

  private String sessionId; // required
  private VerificationMethod method; // required
  private String callback; // required
  private String normalizedPhone; // required
  private String countryCode; // required
  private String nationalSignificantNumber; // required
  private List<VerificationMethod> availableVerificationMethods; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_ID((short)1, "sessionId"),
    /**
     * 
     * @see VerificationMethod
     */
    METHOD((short)2, "method"),
    CALLBACK((short)3, "callback"),
    NORMALIZED_PHONE((short)4, "normalizedPhone"),
    COUNTRY_CODE((short)5, "countryCode"),
    NATIONAL_SIGNIFICANT_NUMBER((short)6, "nationalSignificantNumber"),
    AVAILABLE_VERIFICATION_METHODS((short)7, "availableVerificationMethods");

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
        case 1: // SESSION_ID
          return SESSION_ID;
        case 2: // METHOD
          return METHOD;
        case 3: // CALLBACK
          return CALLBACK;
        case 4: // NORMALIZED_PHONE
          return NORMALIZED_PHONE;
        case 5: // COUNTRY_CODE
          return COUNTRY_CODE;
        case 6: // NATIONAL_SIGNIFICANT_NUMBER
          return NATIONAL_SIGNIFICANT_NUMBER;
        case 7: // AVAILABLE_VERIFICATION_METHODS
          return AVAILABLE_VERIFICATION_METHODS;
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
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.METHOD, new org.apache.thrift.meta_data.FieldMetaData("method", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, VerificationMethod.class)));
    tmpMap.put(_Fields.CALLBACK, new org.apache.thrift.meta_data.FieldMetaData("callback", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NORMALIZED_PHONE, new org.apache.thrift.meta_data.FieldMetaData("normalizedPhone", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY_CODE, new org.apache.thrift.meta_data.FieldMetaData("countryCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NATIONAL_SIGNIFICANT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("nationalSignificantNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AVAILABLE_VERIFICATION_METHODS, new org.apache.thrift.meta_data.FieldMetaData("availableVerificationMethods", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, VerificationMethod.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VerificationSessionData.class, metaDataMap);
  }

  public VerificationSessionData() {
  }

  public VerificationSessionData(
    String sessionId,
    VerificationMethod method,
    String callback,
    String normalizedPhone,
    String countryCode,
    String nationalSignificantNumber,
    List<VerificationMethod> availableVerificationMethods)
  {
    this();
    this.sessionId = sessionId;
    this.method = method;
    this.callback = callback;
    this.normalizedPhone = normalizedPhone;
    this.countryCode = countryCode;
    this.nationalSignificantNumber = nationalSignificantNumber;
    this.availableVerificationMethods = availableVerificationMethods;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VerificationSessionData(VerificationSessionData other) {
    if (other.isSetSessionId()) {
      this.sessionId = other.sessionId;
    }
    if (other.isSetMethod()) {
      this.method = other.method;
    }
    if (other.isSetCallback()) {
      this.callback = other.callback;
    }
    if (other.isSetNormalizedPhone()) {
      this.normalizedPhone = other.normalizedPhone;
    }
    if (other.isSetCountryCode()) {
      this.countryCode = other.countryCode;
    }
    if (other.isSetNationalSignificantNumber()) {
      this.nationalSignificantNumber = other.nationalSignificantNumber;
    }
    if (other.isSetAvailableVerificationMethods()) {
      List<VerificationMethod> __this__availableVerificationMethods = new ArrayList<VerificationMethod>(other.availableVerificationMethods.size());
      for (VerificationMethod other_element : other.availableVerificationMethods) {
        __this__availableVerificationMethods.add(other_element);
      }
      this.availableVerificationMethods = __this__availableVerificationMethods;
    }
  }

  public VerificationSessionData deepCopy() {
    return new VerificationSessionData(this);
  }

  @Override
  public void clear() {
    this.sessionId = null;
    this.method = null;
    this.callback = null;
    this.normalizedPhone = null;
    this.countryCode = null;
    this.nationalSignificantNumber = null;
    this.availableVerificationMethods = null;
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

  /**
   * 
   * @see VerificationMethod
   */
  public VerificationMethod getMethod() {
    return this.method;
  }

  /**
   * 
   * @see VerificationMethod
   */
  public void setMethod(VerificationMethod method) {
    this.method = method;
  }

  public void unsetMethod() {
    this.method = null;
  }

  /** Returns true if field method is set (has been assigned a value) and false otherwise */
  public boolean isSetMethod() {
    return this.method != null;
  }

  public void setMethodIsSet(boolean value) {
    if (!value) {
      this.method = null;
    }
  }

  public String getCallback() {
    return this.callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }

  public void unsetCallback() {
    this.callback = null;
  }

  /** Returns true if field callback is set (has been assigned a value) and false otherwise */
  public boolean isSetCallback() {
    return this.callback != null;
  }

  public void setCallbackIsSet(boolean value) {
    if (!value) {
      this.callback = null;
    }
  }

  public String getNormalizedPhone() {
    return this.normalizedPhone;
  }

  public void setNormalizedPhone(String normalizedPhone) {
    this.normalizedPhone = normalizedPhone;
  }

  public void unsetNormalizedPhone() {
    this.normalizedPhone = null;
  }

  /** Returns true if field normalizedPhone is set (has been assigned a value) and false otherwise */
  public boolean isSetNormalizedPhone() {
    return this.normalizedPhone != null;
  }

  public void setNormalizedPhoneIsSet(boolean value) {
    if (!value) {
      this.normalizedPhone = null;
    }
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public void unsetCountryCode() {
    this.countryCode = null;
  }

  /** Returns true if field countryCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCountryCode() {
    return this.countryCode != null;
  }

  public void setCountryCodeIsSet(boolean value) {
    if (!value) {
      this.countryCode = null;
    }
  }

  public String getNationalSignificantNumber() {
    return this.nationalSignificantNumber;
  }

  public void setNationalSignificantNumber(String nationalSignificantNumber) {
    this.nationalSignificantNumber = nationalSignificantNumber;
  }

  public void unsetNationalSignificantNumber() {
    this.nationalSignificantNumber = null;
  }

  /** Returns true if field nationalSignificantNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetNationalSignificantNumber() {
    return this.nationalSignificantNumber != null;
  }

  public void setNationalSignificantNumberIsSet(boolean value) {
    if (!value) {
      this.nationalSignificantNumber = null;
    }
  }

  public int getAvailableVerificationMethodsSize() {
    return (this.availableVerificationMethods == null) ? 0 : this.availableVerificationMethods.size();
  }

  public java.util.Iterator<VerificationMethod> getAvailableVerificationMethodsIterator() {
    return (this.availableVerificationMethods == null) ? null : this.availableVerificationMethods.iterator();
  }

  public void addToAvailableVerificationMethods(VerificationMethod elem) {
    if (this.availableVerificationMethods == null) {
      this.availableVerificationMethods = new ArrayList<VerificationMethod>();
    }
    this.availableVerificationMethods.add(elem);
  }

  public List<VerificationMethod> getAvailableVerificationMethods() {
    return this.availableVerificationMethods;
  }

  public void setAvailableVerificationMethods(List<VerificationMethod> availableVerificationMethods) {
    this.availableVerificationMethods = availableVerificationMethods;
  }

  public void unsetAvailableVerificationMethods() {
    this.availableVerificationMethods = null;
  }

  /** Returns true if field availableVerificationMethods is set (has been assigned a value) and false otherwise */
  public boolean isSetAvailableVerificationMethods() {
    return this.availableVerificationMethods != null;
  }

  public void setAvailableVerificationMethodsIsSet(boolean value) {
    if (!value) {
      this.availableVerificationMethods = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((String)value);
      }
      break;

    case METHOD:
      if (value == null) {
        unsetMethod();
      } else {
        setMethod((VerificationMethod)value);
      }
      break;

    case CALLBACK:
      if (value == null) {
        unsetCallback();
      } else {
        setCallback((String)value);
      }
      break;

    case NORMALIZED_PHONE:
      if (value == null) {
        unsetNormalizedPhone();
      } else {
        setNormalizedPhone((String)value);
      }
      break;

    case COUNTRY_CODE:
      if (value == null) {
        unsetCountryCode();
      } else {
        setCountryCode((String)value);
      }
      break;

    case NATIONAL_SIGNIFICANT_NUMBER:
      if (value == null) {
        unsetNationalSignificantNumber();
      } else {
        setNationalSignificantNumber((String)value);
      }
      break;

    case AVAILABLE_VERIFICATION_METHODS:
      if (value == null) {
        unsetAvailableVerificationMethods();
      } else {
        setAvailableVerificationMethods((List<VerificationMethod>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_ID:
      return getSessionId();

    case METHOD:
      return getMethod();

    case CALLBACK:
      return getCallback();

    case NORMALIZED_PHONE:
      return getNormalizedPhone();

    case COUNTRY_CODE:
      return getCountryCode();

    case NATIONAL_SIGNIFICANT_NUMBER:
      return getNationalSignificantNumber();

    case AVAILABLE_VERIFICATION_METHODS:
      return getAvailableVerificationMethods();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SESSION_ID:
      return isSetSessionId();
    case METHOD:
      return isSetMethod();
    case CALLBACK:
      return isSetCallback();
    case NORMALIZED_PHONE:
      return isSetNormalizedPhone();
    case COUNTRY_CODE:
      return isSetCountryCode();
    case NATIONAL_SIGNIFICANT_NUMBER:
      return isSetNationalSignificantNumber();
    case AVAILABLE_VERIFICATION_METHODS:
      return isSetAvailableVerificationMethods();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VerificationSessionData)
      return this.equals((VerificationSessionData)that);
    return false;
  }

  public boolean equals(VerificationSessionData that) {
    if (that == null)
      return false;

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (!this.sessionId.equals(that.sessionId))
        return false;
    }

    boolean this_present_method = true && this.isSetMethod();
    boolean that_present_method = true && that.isSetMethod();
    if (this_present_method || that_present_method) {
      if (!(this_present_method && that_present_method))
        return false;
      if (!this.method.equals(that.method))
        return false;
    }

    boolean this_present_callback = true && this.isSetCallback();
    boolean that_present_callback = true && that.isSetCallback();
    if (this_present_callback || that_present_callback) {
      if (!(this_present_callback && that_present_callback))
        return false;
      if (!this.callback.equals(that.callback))
        return false;
    }

    boolean this_present_normalizedPhone = true && this.isSetNormalizedPhone();
    boolean that_present_normalizedPhone = true && that.isSetNormalizedPhone();
    if (this_present_normalizedPhone || that_present_normalizedPhone) {
      if (!(this_present_normalizedPhone && that_present_normalizedPhone))
        return false;
      if (!this.normalizedPhone.equals(that.normalizedPhone))
        return false;
    }

    boolean this_present_countryCode = true && this.isSetCountryCode();
    boolean that_present_countryCode = true && that.isSetCountryCode();
    if (this_present_countryCode || that_present_countryCode) {
      if (!(this_present_countryCode && that_present_countryCode))
        return false;
      if (!this.countryCode.equals(that.countryCode))
        return false;
    }

    boolean this_present_nationalSignificantNumber = true && this.isSetNationalSignificantNumber();
    boolean that_present_nationalSignificantNumber = true && that.isSetNationalSignificantNumber();
    if (this_present_nationalSignificantNumber || that_present_nationalSignificantNumber) {
      if (!(this_present_nationalSignificantNumber && that_present_nationalSignificantNumber))
        return false;
      if (!this.nationalSignificantNumber.equals(that.nationalSignificantNumber))
        return false;
    }

    boolean this_present_availableVerificationMethods = true && this.isSetAvailableVerificationMethods();
    boolean that_present_availableVerificationMethods = true && that.isSetAvailableVerificationMethods();
    if (this_present_availableVerificationMethods || that_present_availableVerificationMethods) {
      if (!(this_present_availableVerificationMethods && that_present_availableVerificationMethods))
        return false;
      if (!this.availableVerificationMethods.equals(that.availableVerificationMethods))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_sessionId = true && (isSetSessionId());
    list.add(present_sessionId);
    if (present_sessionId)
      list.add(sessionId);

    boolean present_method = true && (isSetMethod());
    list.add(present_method);
    if (present_method)
      list.add(method.getValue());

    boolean present_callback = true && (isSetCallback());
    list.add(present_callback);
    if (present_callback)
      list.add(callback);

    boolean present_normalizedPhone = true && (isSetNormalizedPhone());
    list.add(present_normalizedPhone);
    if (present_normalizedPhone)
      list.add(normalizedPhone);

    boolean present_countryCode = true && (isSetCountryCode());
    list.add(present_countryCode);
    if (present_countryCode)
      list.add(countryCode);

    boolean present_nationalSignificantNumber = true && (isSetNationalSignificantNumber());
    list.add(present_nationalSignificantNumber);
    if (present_nationalSignificantNumber)
      list.add(nationalSignificantNumber);

    boolean present_availableVerificationMethods = true && (isSetAvailableVerificationMethods());
    list.add(present_availableVerificationMethods);
    if (present_availableVerificationMethods)
      list.add(availableVerificationMethods);

    return list.hashCode();
  }

  @Override
  public int compareTo(VerificationSessionData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetMethod()).compareTo(other.isSetMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.method, other.method);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCallback()).compareTo(other.isSetCallback());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCallback()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.callback, other.callback);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNormalizedPhone()).compareTo(other.isSetNormalizedPhone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNormalizedPhone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.normalizedPhone, other.normalizedPhone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCountryCode()).compareTo(other.isSetCountryCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountryCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.countryCode, other.countryCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNationalSignificantNumber()).compareTo(other.isSetNationalSignificantNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNationalSignificantNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nationalSignificantNumber, other.nationalSignificantNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAvailableVerificationMethods()).compareTo(other.isSetAvailableVerificationMethods());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvailableVerificationMethods()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.availableVerificationMethods, other.availableVerificationMethods);
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
    StringBuilder sb = new StringBuilder("VerificationSessionData(");
    boolean first = true;

    sb.append("sessionId:");
    if (this.sessionId == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("method:");
    if (this.method == null) {
      sb.append("null");
    } else {
      sb.append(this.method);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("callback:");
    if (this.callback == null) {
      sb.append("null");
    } else {
      sb.append(this.callback);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("normalizedPhone:");
    if (this.normalizedPhone == null) {
      sb.append("null");
    } else {
      sb.append(this.normalizedPhone);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("countryCode:");
    if (this.countryCode == null) {
      sb.append("null");
    } else {
      sb.append(this.countryCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nationalSignificantNumber:");
    if (this.nationalSignificantNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.nationalSignificantNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("availableVerificationMethods:");
    if (this.availableVerificationMethods == null) {
      sb.append("null");
    } else {
      sb.append(this.availableVerificationMethods);
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

  private static class VerificationSessionDataStandardSchemeFactory implements SchemeFactory {
    public VerificationSessionDataStandardScheme getScheme() {
      return new VerificationSessionDataStandardScheme();
    }
  }

  private static class VerificationSessionDataStandardScheme extends StandardScheme<VerificationSessionData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VerificationSessionData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionId = iprot.readString();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.method = line.thrift.VerificationMethod.findByValue(iprot.readI32());
              struct.setMethodIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CALLBACK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.callback = iprot.readString();
              struct.setCallbackIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NORMALIZED_PHONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.normalizedPhone = iprot.readString();
              struct.setNormalizedPhoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COUNTRY_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.countryCode = iprot.readString();
              struct.setCountryCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NATIONAL_SIGNIFICANT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nationalSignificantNumber = iprot.readString();
              struct.setNationalSignificantNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // AVAILABLE_VERIFICATION_METHODS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list368 = iprot.readListBegin();
                struct.availableVerificationMethods = new ArrayList<VerificationMethod>(_list368.size);
                VerificationMethod _elem369;
                for (int _i370 = 0; _i370 < _list368.size; ++_i370)
                {
                  _elem369 = line.thrift.VerificationMethod.findByValue(iprot.readI32());
                  struct.availableVerificationMethods.add(_elem369);
                }
                iprot.readListEnd();
              }
              struct.setAvailableVerificationMethodsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, VerificationSessionData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sessionId != null) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeString(struct.sessionId);
        oprot.writeFieldEnd();
      }
      if (struct.method != null) {
        oprot.writeFieldBegin(METHOD_FIELD_DESC);
        oprot.writeI32(struct.method.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.callback != null) {
        oprot.writeFieldBegin(CALLBACK_FIELD_DESC);
        oprot.writeString(struct.callback);
        oprot.writeFieldEnd();
      }
      if (struct.normalizedPhone != null) {
        oprot.writeFieldBegin(NORMALIZED_PHONE_FIELD_DESC);
        oprot.writeString(struct.normalizedPhone);
        oprot.writeFieldEnd();
      }
      if (struct.countryCode != null) {
        oprot.writeFieldBegin(COUNTRY_CODE_FIELD_DESC);
        oprot.writeString(struct.countryCode);
        oprot.writeFieldEnd();
      }
      if (struct.nationalSignificantNumber != null) {
        oprot.writeFieldBegin(NATIONAL_SIGNIFICANT_NUMBER_FIELD_DESC);
        oprot.writeString(struct.nationalSignificantNumber);
        oprot.writeFieldEnd();
      }
      if (struct.availableVerificationMethods != null) {
        oprot.writeFieldBegin(AVAILABLE_VERIFICATION_METHODS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.availableVerificationMethods.size()));
          for (VerificationMethod _iter371 : struct.availableVerificationMethods)
          {
            oprot.writeI32(_iter371.getValue());
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VerificationSessionDataTupleSchemeFactory implements SchemeFactory {
    public VerificationSessionDataTupleScheme getScheme() {
      return new VerificationSessionDataTupleScheme();
    }
  }

  private static class VerificationSessionDataTupleScheme extends TupleScheme<VerificationSessionData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VerificationSessionData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSessionId()) {
        optionals.set(0);
      }
      if (struct.isSetMethod()) {
        optionals.set(1);
      }
      if (struct.isSetCallback()) {
        optionals.set(2);
      }
      if (struct.isSetNormalizedPhone()) {
        optionals.set(3);
      }
      if (struct.isSetCountryCode()) {
        optionals.set(4);
      }
      if (struct.isSetNationalSignificantNumber()) {
        optionals.set(5);
      }
      if (struct.isSetAvailableVerificationMethods()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetSessionId()) {
        oprot.writeString(struct.sessionId);
      }
      if (struct.isSetMethod()) {
        oprot.writeI32(struct.method.getValue());
      }
      if (struct.isSetCallback()) {
        oprot.writeString(struct.callback);
      }
      if (struct.isSetNormalizedPhone()) {
        oprot.writeString(struct.normalizedPhone);
      }
      if (struct.isSetCountryCode()) {
        oprot.writeString(struct.countryCode);
      }
      if (struct.isSetNationalSignificantNumber()) {
        oprot.writeString(struct.nationalSignificantNumber);
      }
      if (struct.isSetAvailableVerificationMethods()) {
        {
          oprot.writeI32(struct.availableVerificationMethods.size());
          for (VerificationMethod _iter372 : struct.availableVerificationMethods)
          {
            oprot.writeI32(_iter372.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VerificationSessionData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.sessionId = iprot.readString();
        struct.setSessionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.method = line.thrift.VerificationMethod.findByValue(iprot.readI32());
        struct.setMethodIsSet(true);
      }
      if (incoming.get(2)) {
        struct.callback = iprot.readString();
        struct.setCallbackIsSet(true);
      }
      if (incoming.get(3)) {
        struct.normalizedPhone = iprot.readString();
        struct.setNormalizedPhoneIsSet(true);
      }
      if (incoming.get(4)) {
        struct.countryCode = iprot.readString();
        struct.setCountryCodeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.nationalSignificantNumber = iprot.readString();
        struct.setNationalSignificantNumberIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list373 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.availableVerificationMethods = new ArrayList<VerificationMethod>(_list373.size);
          VerificationMethod _elem374;
          for (int _i375 = 0; _i375 < _list373.size; ++_i375)
          {
            _elem374 = line.thrift.VerificationMethod.findByValue(iprot.readI32());
            struct.availableVerificationMethods.add(_elem374);
          }
        }
        struct.setAvailableVerificationMethodsIsSet(true);
      }
    }
  }

}

