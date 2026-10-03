package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RecordTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType unknownType;
  private ObjectType objectType;
  private SimpleErrorReporter errorReporter;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
  }

  private RecordType createRecord(Map<String, JSType> props) {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    for (Map.Entry<String, JSType> entry : props.entrySet()) {
      builder.addProperty(entry.getKey(), entry.getValue(), new Node(1));
    }
    return (RecordType) builder.build();
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructor_nullRecordProperty_throwsIllegalStateException() {
    Map<String, RecordProperty> map = new HashMap<String, RecordProperty>();
    map.put("prop", null);
    new RecordType(registry, map);
  }

  @Test
  public void testConstructor_emptyProperties_createsEmptyRecord() {
    RecordType emptyRecord = new RecordType(registry, Collections.<String, RecordProperty>emptyMap());
    Assert.assertNotNull(emptyRecord);
    Assert.assertTrue(emptyRecord.isRecordType());
    Assert.assertEquals(emptyRecord, emptyRecord.toMaybeRecordType());
  }

  @Test
  public void testGetImplicitPrototype() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    ObjectType proto = record.getImplicitPrototype();
    Assert.assertEquals(objectType, proto);
  }

  @Test
  public void testDefineProperty_whenFrozen_returnsFalse() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    boolean resultInferred = record.defineProperty("b", stringType, true, new Node(1));
    Assert.assertFalse(resultInferred);
    boolean resultDeclared = record.defineProperty("c", stringType, false, new Node(1));
    Assert.assertFalse(resultDeclared);
  }

  @Test
  public void testIsEquivalentTo_sameInstance_returnsTrue() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    Assert.assertTrue(record.isEquivalentTo(record));
  }

  @Test
  public void testIsEquivalentTo_nonRecordType_returnsFalse() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    Assert.assertFalse(record.isEquivalentTo(numberType));
    Assert.assertFalse(record.isEquivalentTo(objectType));
  }

  @Test
  public void testIsEquivalentTo_differentKeys_returnsFalse() {
    RecordType record1 = createRecord(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecord(ImmutableMap.of("b", numberType));
    RecordType record3 = createRecord(ImmutableMap.of("a", numberType, "b", stringType));

    Assert.assertFalse(record1.isEquivalentTo(record2));
    Assert.assertFalse(record1.isEquivalentTo(record3));
    Assert.assertFalse(record3.isEquivalentTo(record1));
  }

  @Test
  public void testIsEquivalentTo_differentTypesForSameKeys_returnsFalse() {
    RecordType record1 = createRecord(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecord(ImmutableMap.of("a", stringType));
    Assert.assertFalse(record1.isEquivalentTo(record2));
  }

  @Test
  public void testIsEquivalentTo_sameKeysAndTypes_returnsTrue() {
    RecordType record1 = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType record2 = createRecord(ImmutableMap.of("b", stringType, "a", numberType));
    Assert.assertTrue(record1.isEquivalentTo(record2));
    Assert.assertTrue(record2.isEquivalentTo(record1));
  }

  @Test
  public void testToMaybeRecordType() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    Assert.assertSame(record, record.toMaybeRecordType());
  }

  @Test
  public void testIsSubtype_recordToRecord() {
    RecordType recordSuper = createRecord(ImmutableMap.of("a", numberType));
    RecordType recordSub = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType recordIncompatible = createRecord(ImmutableMap.of("a", stringType));

    Assert.assertTrue(recordSub.isSubtype(recordSuper));
    Assert.assertFalse(recordSuper.isSubtype(recordSub));
    Assert.assertFalse(recordIncompatible.isSubtype(recordSuper));
  }

  @Test
  public void testIsSubtype_toObjectType() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    Assert.assertTrue(record.isSubtype(objectType));
    Assert.assertTrue(record.isSubtype(registry.getNativeType(JSTypeNative.ALL_TYPE)));
    Assert.assertTrue(record.isSubtype(unknownType));
  }

  @Test
  public void testIsSubtype_toPrimitive_returnsFalse() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    Assert.assertFalse(record.isSubtype(numberType));
    Assert.assertFalse(record.isSubtype(stringType));
  }

  @Test
  public void testStaticIsSubtype_inferredProperties() {
    RecordType targetRecord = createRecord(ImmutableMap.of("a", numberType));

    ObjectType customObjType = new PrototypeObjectType(registry, "Custom", objectType);
    customObjType.defineProperty("a", numberType, true, null);

    Assert.assertTrue(RecordType.isSubtype(customObjType, targetRecord));

    ObjectType missingPropObjType = new PrototypeObjectType(registry, "Missing", objectType);
    Assert.assertFalse(RecordType.isSubtype(missingPropObjType, targetRecord));

    ObjectType incompatiblePropObjType = new PrototypeObjectType(registry, "Incompatible", objectType);
    incompatiblePropObjType.defineProperty("a", stringType, true, null);
    Assert.assertFalse(RecordType.isSubtype(incompatiblePropObjType, targetRecord));
  }

  @Test
  public void testStaticIsSubtype_unknownProperties() {
    RecordType recordWithUnknown = createRecord(ImmutableMap.of("a", unknownType));
    RecordType recordWithNumber = createRecord(ImmutableMap.of("a", numberType));

    Assert.assertTrue(RecordType.isSubtype(recordWithUnknown, recordWithNumber));
    Assert.assertTrue(RecordType.isSubtype(recordWithNumber, recordWithUnknown));
  }

  @Test
  public void testGetGreatestSubtypeHelper_recordWithRecord_disjointAndIntersecting() {
    RecordType record1 = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType record2 = createRecord(ImmutableMap.of("b", stringType, "c", booleanType));

    JSType greatestSubtype = record1.getGreatestSubtypeHelper(record2);
    Assert.assertTrue(greatestSubtype.isRecordType());
    RecordType resultRecord = greatestSubtype.toMaybeRecordType();
    Assert.assertTrue(resultRecord.hasProperty("a"));
    Assert.assertTrue(resultRecord.hasProperty("b"));
    Assert.assertTrue(resultRecord.hasProperty("c"));
  }

  @Test
  public void testGetGreatestSubtypeHelper_recordWithRecord_conflictReturnsNoType() {
    RecordType record1 = createRecord(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecord(ImmutableMap.of("a", stringType));

    JSType greatestSubtype = record1.getGreatestSubtypeHelper(record2);
    Assert.assertTrue(greatestSubtype.isNoType() || greatestSubtype.isEmptyType());
  }

  @Test
  public void testGetGreatestSubtypeHelper_withNonObjectType() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    JSType result = record.getGreatestSubtypeHelper(numberType);
    Assert.assertTrue(result.isNoObjectType() || result.isEmptyType());
  }

  @Test
  public void testGetGreatestSubtypeHelper_withObjectTypeHavingProperty() {
    ObjectType functionType = registry.getNativeObjectType(JSTypeNative.FUNCTION_PROTOTYPE);
    RecordType record = createRecord(ImmutableMap.of("apply", unknownType));
    JSType result = record.getGreatestSubtypeHelper(functionType);
    Assert.assertNotNull(result);
  }

  @Test
  public void testResolveInternal() {
    ProxyObjectType proxyType = new ProxyObjectType(registry, numberType);
    Map<String, RecordProperty> propMap = Maps.newHashMap();
    propMap.put("a", new RecordProperty(proxyType, new Node(1)));
    RecordType record = new RecordType(registry, propMap);

    JSType resolved = record.resolveInternal(errorReporter, null);
    Assert.assertNotNull(resolved);
    Assert.assertTrue(resolved.isRecordType());
  }
}
