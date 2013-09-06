/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.twitter.service.snowflake.gen;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuditLogEntry implements org.apache.thrift.TBase<AuditLogEntry, AuditLogEntry._Fields>, java.io.Serializable, Cloneable, Comparable<AuditLogEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuditLogEntry");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField USERAGENT_FIELD_DESC = new org.apache.thrift.protocol.TField("useragent", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuditLogEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuditLogEntryTupleSchemeFactory());
  }

  public long id; // required
  public String useragent; // required
  public long tag; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    USERAGENT((short)2, "useragent"),
    TAG((short)3, "tag");

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
        case 1: // ID
          return ID;
        case 2: // USERAGENT
          return USERAGENT;
        case 3: // TAG
          return TAG;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __TAG_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USERAGENT, new org.apache.thrift.meta_data.FieldMetaData("useragent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuditLogEntry.class, metaDataMap);
  }

  public AuditLogEntry() {
  }

  public AuditLogEntry(
    long id,
    String useragent,
    long tag)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.useragent = useragent;
    this.tag = tag;
    setTagIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuditLogEntry(AuditLogEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetUseragent()) {
      this.useragent = other.useragent;
    }
    this.tag = other.tag;
  }

  public AuditLogEntry deepCopy() {
    return new AuditLogEntry(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.useragent = null;
    setTagIsSet(false);
    this.tag = 0;
  }

  public long getId() {
    return this.id;
  }

  public AuditLogEntry setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getUseragent() {
    return this.useragent;
  }

  public AuditLogEntry setUseragent(String useragent) {
    this.useragent = useragent;
    return this;
  }

  public void unsetUseragent() {
    this.useragent = null;
  }

  /** Returns true if field useragent is set (has been assigned a value) and false otherwise */
  public boolean isSetUseragent() {
    return this.useragent != null;
  }

  public void setUseragentIsSet(boolean value) {
    if (!value) {
      this.useragent = null;
    }
  }

  public long getTag() {
    return this.tag;
  }

  public AuditLogEntry setTag(long tag) {
    this.tag = tag;
    setTagIsSet(true);
    return this;
  }

  public void unsetTag() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TAG_ISSET_ID);
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return EncodingUtils.testBit(__isset_bitfield, __TAG_ISSET_ID);
  }

  public void setTagIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TAG_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case USERAGENT:
      if (value == null) {
        unsetUseragent();
      } else {
        setUseragent((String)value);
      }
      break;

    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Long.valueOf(getId());

    case USERAGENT:
      return getUseragent();

    case TAG:
      return Long.valueOf(getTag());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case USERAGENT:
      return isSetUseragent();
    case TAG:
      return isSetTag();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuditLogEntry)
      return this.equals((AuditLogEntry)that);
    return false;
  }

  public boolean equals(AuditLogEntry that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_useragent = true && this.isSetUseragent();
    boolean that_present_useragent = true && that.isSetUseragent();
    if (this_present_useragent || that_present_useragent) {
      if (!(this_present_useragent && that_present_useragent))
        return false;
      if (!this.useragent.equals(that.useragent))
        return false;
    }

    boolean this_present_tag = true;
    boolean that_present_tag = true;
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (this.tag != that.tag)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(AuditLogEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUseragent()).compareTo(other.isSetUseragent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseragent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.useragent, other.useragent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTag()).compareTo(other.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, other.tag);
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
    StringBuilder sb = new StringBuilder("AuditLogEntry(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("useragent:");
    if (this.useragent == null) {
      sb.append("null");
    } else {
      sb.append(this.useragent);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tag:");
    sb.append(this.tag);
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

  private static class AuditLogEntryStandardSchemeFactory implements SchemeFactory {
    public AuditLogEntryStandardScheme getScheme() {
      return new AuditLogEntryStandardScheme();
    }
  }

  private static class AuditLogEntryStandardScheme extends StandardScheme<AuditLogEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuditLogEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USERAGENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.useragent = iprot.readString();
              struct.setUseragentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tag = iprot.readI64();
              struct.setTagIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuditLogEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.useragent != null) {
        oprot.writeFieldBegin(USERAGENT_FIELD_DESC);
        oprot.writeString(struct.useragent);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TAG_FIELD_DESC);
      oprot.writeI64(struct.tag);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuditLogEntryTupleSchemeFactory implements SchemeFactory {
    public AuditLogEntryTupleScheme getScheme() {
      return new AuditLogEntryTupleScheme();
    }
  }

  private static class AuditLogEntryTupleScheme extends TupleScheme<AuditLogEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuditLogEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetUseragent()) {
        optionals.set(1);
      }
      if (struct.isSetTag()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetUseragent()) {
        oprot.writeString(struct.useragent);
      }
      if (struct.isSetTag()) {
        oprot.writeI64(struct.tag);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuditLogEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.useragent = iprot.readString();
        struct.setUseragentIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tag = iprot.readI64();
        struct.setTagIsSet(true);
      }
    }
  }

}

