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
public class EmailConfirmationSession implements org.apache.thrift.TBase<EmailConfirmationSession, EmailConfirmationSession._Fields>, java.io.Serializable, Cloneable, Comparable<EmailConfirmationSession> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EmailConfirmationSession");

  private static final org.apache.thrift.protocol.TField EMAIL_CONFIRMATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("emailConfirmationType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VERIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("verifier", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TARGET_EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("targetEmail", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EmailConfirmationSessionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EmailConfirmationSessionTupleSchemeFactory());
  }

  private EmailConfirmationType emailConfirmationType; // required
  private String verifier; // required
  private String targetEmail; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see EmailConfirmationType
     */
    EMAIL_CONFIRMATION_TYPE((short)1, "emailConfirmationType"),
    VERIFIER((short)2, "verifier"),
    TARGET_EMAIL((short)3, "targetEmail");

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
        case 1: // EMAIL_CONFIRMATION_TYPE
          return EMAIL_CONFIRMATION_TYPE;
        case 2: // VERIFIER
          return VERIFIER;
        case 3: // TARGET_EMAIL
          return TARGET_EMAIL;
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
    tmpMap.put(_Fields.EMAIL_CONFIRMATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("emailConfirmationType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, EmailConfirmationType.class)));
    tmpMap.put(_Fields.VERIFIER, new org.apache.thrift.meta_data.FieldMetaData("verifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TARGET_EMAIL, new org.apache.thrift.meta_data.FieldMetaData("targetEmail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EmailConfirmationSession.class, metaDataMap);
  }

  public EmailConfirmationSession() {
  }

  public EmailConfirmationSession(
    EmailConfirmationType emailConfirmationType,
    String verifier,
    String targetEmail)
  {
    this();
    this.emailConfirmationType = emailConfirmationType;
    this.verifier = verifier;
    this.targetEmail = targetEmail;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EmailConfirmationSession(EmailConfirmationSession other) {
    if (other.isSetEmailConfirmationType()) {
      this.emailConfirmationType = other.emailConfirmationType;
    }
    if (other.isSetVerifier()) {
      this.verifier = other.verifier;
    }
    if (other.isSetTargetEmail()) {
      this.targetEmail = other.targetEmail;
    }
  }

  public EmailConfirmationSession deepCopy() {
    return new EmailConfirmationSession(this);
  }

  @Override
  public void clear() {
    this.emailConfirmationType = null;
    this.verifier = null;
    this.targetEmail = null;
  }

  /**
   * 
   * @see EmailConfirmationType
   */
  public EmailConfirmationType getEmailConfirmationType() {
    return this.emailConfirmationType;
  }

  /**
   * 
   * @see EmailConfirmationType
   */
  public void setEmailConfirmationType(EmailConfirmationType emailConfirmationType) {
    this.emailConfirmationType = emailConfirmationType;
  }

  public void unsetEmailConfirmationType() {
    this.emailConfirmationType = null;
  }

  /** Returns true if field emailConfirmationType is set (has been assigned a value) and false otherwise */
  public boolean isSetEmailConfirmationType() {
    return this.emailConfirmationType != null;
  }

  public void setEmailConfirmationTypeIsSet(boolean value) {
    if (!value) {
      this.emailConfirmationType = null;
    }
  }

  public String getVerifier() {
    return this.verifier;
  }

  public void setVerifier(String verifier) {
    this.verifier = verifier;
  }

  public void unsetVerifier() {
    this.verifier = null;
  }

  /** Returns true if field verifier is set (has been assigned a value) and false otherwise */
  public boolean isSetVerifier() {
    return this.verifier != null;
  }

  public void setVerifierIsSet(boolean value) {
    if (!value) {
      this.verifier = null;
    }
  }

  public String getTargetEmail() {
    return this.targetEmail;
  }

  public void setTargetEmail(String targetEmail) {
    this.targetEmail = targetEmail;
  }

  public void unsetTargetEmail() {
    this.targetEmail = null;
  }

  /** Returns true if field targetEmail is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetEmail() {
    return this.targetEmail != null;
  }

  public void setTargetEmailIsSet(boolean value) {
    if (!value) {
      this.targetEmail = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EMAIL_CONFIRMATION_TYPE:
      if (value == null) {
        unsetEmailConfirmationType();
      } else {
        setEmailConfirmationType((EmailConfirmationType)value);
      }
      break;

    case VERIFIER:
      if (value == null) {
        unsetVerifier();
      } else {
        setVerifier((String)value);
      }
      break;

    case TARGET_EMAIL:
      if (value == null) {
        unsetTargetEmail();
      } else {
        setTargetEmail((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EMAIL_CONFIRMATION_TYPE:
      return getEmailConfirmationType();

    case VERIFIER:
      return getVerifier();

    case TARGET_EMAIL:
      return getTargetEmail();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EMAIL_CONFIRMATION_TYPE:
      return isSetEmailConfirmationType();
    case VERIFIER:
      return isSetVerifier();
    case TARGET_EMAIL:
      return isSetTargetEmail();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EmailConfirmationSession)
      return this.equals((EmailConfirmationSession)that);
    return false;
  }

  public boolean equals(EmailConfirmationSession that) {
    if (that == null)
      return false;

    boolean this_present_emailConfirmationType = true && this.isSetEmailConfirmationType();
    boolean that_present_emailConfirmationType = true && that.isSetEmailConfirmationType();
    if (this_present_emailConfirmationType || that_present_emailConfirmationType) {
      if (!(this_present_emailConfirmationType && that_present_emailConfirmationType))
        return false;
      if (!this.emailConfirmationType.equals(that.emailConfirmationType))
        return false;
    }

    boolean this_present_verifier = true && this.isSetVerifier();
    boolean that_present_verifier = true && that.isSetVerifier();
    if (this_present_verifier || that_present_verifier) {
      if (!(this_present_verifier && that_present_verifier))
        return false;
      if (!this.verifier.equals(that.verifier))
        return false;
    }

    boolean this_present_targetEmail = true && this.isSetTargetEmail();
    boolean that_present_targetEmail = true && that.isSetTargetEmail();
    if (this_present_targetEmail || that_present_targetEmail) {
      if (!(this_present_targetEmail && that_present_targetEmail))
        return false;
      if (!this.targetEmail.equals(that.targetEmail))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_emailConfirmationType = true && (isSetEmailConfirmationType());
    list.add(present_emailConfirmationType);
    if (present_emailConfirmationType)
      list.add(emailConfirmationType.getValue());

    boolean present_verifier = true && (isSetVerifier());
    list.add(present_verifier);
    if (present_verifier)
      list.add(verifier);

    boolean present_targetEmail = true && (isSetTargetEmail());
    list.add(present_targetEmail);
    if (present_targetEmail)
      list.add(targetEmail);

    return list.hashCode();
  }

  @Override
  public int compareTo(EmailConfirmationSession other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEmailConfirmationType()).compareTo(other.isSetEmailConfirmationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmailConfirmationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emailConfirmationType, other.emailConfirmationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVerifier()).compareTo(other.isSetVerifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVerifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.verifier, other.verifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargetEmail()).compareTo(other.isSetTargetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetEmail, other.targetEmail);
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
    StringBuilder sb = new StringBuilder("EmailConfirmationSession(");
    boolean first = true;

    sb.append("emailConfirmationType:");
    if (this.emailConfirmationType == null) {
      sb.append("null");
    } else {
      sb.append(this.emailConfirmationType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("verifier:");
    if (this.verifier == null) {
      sb.append("null");
    } else {
      sb.append(this.verifier);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetEmail:");
    if (this.targetEmail == null) {
      sb.append("null");
    } else {
      sb.append(this.targetEmail);
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

  private static class EmailConfirmationSessionStandardSchemeFactory implements SchemeFactory {
    public EmailConfirmationSessionStandardScheme getScheme() {
      return new EmailConfirmationSessionStandardScheme();
    }
  }

  private static class EmailConfirmationSessionStandardScheme extends StandardScheme<EmailConfirmationSession> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EmailConfirmationSession struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EMAIL_CONFIRMATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.emailConfirmationType = line.thrift.EmailConfirmationType.findByValue(iprot.readI32());
              struct.setEmailConfirmationTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.verifier = iprot.readString();
              struct.setVerifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TARGET_EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.targetEmail = iprot.readString();
              struct.setTargetEmailIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EmailConfirmationSession struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.emailConfirmationType != null) {
        oprot.writeFieldBegin(EMAIL_CONFIRMATION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.emailConfirmationType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.verifier != null) {
        oprot.writeFieldBegin(VERIFIER_FIELD_DESC);
        oprot.writeString(struct.verifier);
        oprot.writeFieldEnd();
      }
      if (struct.targetEmail != null) {
        oprot.writeFieldBegin(TARGET_EMAIL_FIELD_DESC);
        oprot.writeString(struct.targetEmail);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EmailConfirmationSessionTupleSchemeFactory implements SchemeFactory {
    public EmailConfirmationSessionTupleScheme getScheme() {
      return new EmailConfirmationSessionTupleScheme();
    }
  }

  private static class EmailConfirmationSessionTupleScheme extends TupleScheme<EmailConfirmationSession> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EmailConfirmationSession struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEmailConfirmationType()) {
        optionals.set(0);
      }
      if (struct.isSetVerifier()) {
        optionals.set(1);
      }
      if (struct.isSetTargetEmail()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEmailConfirmationType()) {
        oprot.writeI32(struct.emailConfirmationType.getValue());
      }
      if (struct.isSetVerifier()) {
        oprot.writeString(struct.verifier);
      }
      if (struct.isSetTargetEmail()) {
        oprot.writeString(struct.targetEmail);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EmailConfirmationSession struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.emailConfirmationType = line.thrift.EmailConfirmationType.findByValue(iprot.readI32());
        struct.setEmailConfirmationTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.verifier = iprot.readString();
        struct.setVerifierIsSet(true);
      }
      if (incoming.get(2)) {
        struct.targetEmail = iprot.readString();
        struct.setTargetEmailIsSet(true);
      }
    }
  }

}

