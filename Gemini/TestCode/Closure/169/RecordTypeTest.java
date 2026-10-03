package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class RecordTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType unknownType;
  private JSType allType;
  private ObjectType objectType;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
  }

  private RecordType createRecord(Map<String, JSType> propMap, boolean declared) {
    Map<String, RecordProperty> map = Maps.newHashMap();
    for (Map.Entry<String, JSType> entry : propMap.entrySet()) {
      map.put(entry.getKey(), new RecordProperty(entry.getValue(), null));
    }
    return new RecordType(registry, map, declared);
  }

  private RecordType createRecord(Map<String, JSType> propMap) {
    return createRecord(propMap, true);
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructor_nullProperty_throwsException() {
    Map<String, RecordProperty> map = new HashMap<String, RecordProperty>();
    map.put("a", null);
    new RecordType(registry, map);
  }

  @Test
  public void testConstructor_emptyProperties_success() {
    RecordType record = new RecordType(registry, Collections.<String, RecordProperty>emptyMap());
    assertFalse(record.isSynthetic());
    assertNotNull(record.getImplicitPrototype());
    assertSame(objectType, record.getImplicitPrototype());
  }

  @Test
  public void testConstructor_synthesized_isSyntheticTrue() {
    RecordType record = new RecordType(registry, Collections.<String, RecordProperty>emptyMap(), false);
    assertTrue(record.isSynthetic());
  }

  @Test
  public void testToMaybeRecordType_returnsSelf() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    assertSame(record, record.toMaybeRecordType());
  }

  @Test
  public void testDefineProperty_whenFrozen_returnsFalse() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType));
    boolean result = record.defineProperty("b", stringType, false, null);
    assertFalse(result);
    assertFalse(record.hasProperty("b"));
  }

  @Test
  public void testCheckRecordEquivalenceHelper_equalRecords_returnsTrue() {
    RecordType rec1 = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType rec2 = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    assertTrue(rec1.checkRecordEquivalenceHelper(rec2, false));
    assertTrue(rec1.checkRecordEquivalenceHelper(rec2, true));
  }

  @Test
  public void testCheckRecordEquivalenceHelper_differentKeys_returnsFalse() {
    RecordType rec1 = createRecord(ImmutableMap.of("a", numberType));
    RecordType rec2 = createRecord(ImmutableMap.of("b", numberType));
    assertFalse(rec1.checkRecordEquivalenceHelper(rec2, false));

    RecordType rec3 = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    assertFalse(rec1.checkRecordEquivalenceHelper(rec3, false));
  }

  @Test
  public void testCheckRecordEquivalenceHelper_differentTypes_returnsFalse() {
    RecordType rec1 = createRecord(ImmutableMap.of("a", numberType));
    RecordType rec2 = createRecord(ImmutableMap.of("a", stringType));
    assertFalse(rec1.checkRecordEquivalenceHelper(rec2, false));
  }

  @Test
  public void testCheckRecordEquivalenceHelper_withUnknownType() {
    RecordType rec1 = createRecord(ImmutableMap.of("a", unknownType));
    RecordType rec2 = createRecord(ImmutableMap.of("a", numberType));
    assertFalse(rec1.checkRecordEquivalenceHelper(rec2, false));
    assertTrue(rec1.checkRecordEquivalenceHelper(rec2, true));
  }

  @Test
  public void testIsSubtype_toAllType_returnsTrue() {
    RecordType rec = createRecord(ImmutableMap.of("a", numberType));
    assertTrue(rec.isSubtype(allType));
  }

  @Test
  public void testIsSubtype_toObjectType_returnsTrue() {
    RecordType rec = createRecord(ImmutableMap.of("a", numberType));
    assertTrue(rec.isSubtype(objectType));
  }

  @Test
  public void testIsSubtype_toNonRecordNonObject_returnsFalse() {
    RecordType rec = createRecord(ImmutableMap.of("a", numberType));
    assertFalse(rec.isSubtype(numberType));
    assertFalse(rec.isSubtype(stringType));
  }

  @Test
  public void testIsSubtype_recordToRecord_successAndFailure() {
    RecordType superType = createRecord(ImmutableMap.of("a", numberType));
    RecordType subType = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType mismatchType = createRecord(ImmutableMap.of("a", stringType, "b", numberType));
    RecordType missingType = createRecord(ImmutableMap.of("b", stringType));

    assertTrue(subType.isSubtype(superType));
    assertFalse(superType.isSubtype(subType));
    assertFalse(mismatchType.isSubtype(superType));
    assertFalse(missingType.isSubtype(superType));
  }

  @Test
  public void testIsSubtype_staticHelper_inferredProperties() {
    RecordType targetRecord = createRecord(ImmutableMap.of("a", numberType));

    ObjectType sourceObj = new PrototypeObjectType(registry, "Custom", objectType);
    sourceObj.defineProperty("a", numberType, true, null);
    assertTrue(RecordType.isSubtype(sourceObj, targetRecord));

    ObjectType sourceObjBad = new PrototypeObjectType(registry, "CustomBad", objectType);
    sourceObjBad.defineProperty("a", stringType, true, null);
    assertFalse(RecordType.isSubtype(sourceObjBad, targetRecord));
  }

  @Test
  public void testIsSubtype_staticHelper_unknownProperties() {
    RecordType targetUnknown = createRecord(ImmutableMap.of("a", unknownType));
    RecordType sourceNumber = createRecord(ImmutableMap.of("a", numberType));
    assertTrue(RecordType.isSubtype(sourceNumber, targetUnknown));

    RecordType targetNumber = createRecord(ImmutableMap.of("a", numberType));
    RecordType sourceUnknown = createRecord(ImmutableMap.of("a", unknownType));
    assertTrue(RecordType.isSubtype(sourceUnknown, targetNumber));
  }

  @Test
  public void testGetGreatestSubtypeHelper_withAnotherRecordType_disjointProperties() {
    RecordType rec1 = createRecord(ImmutableMap.of("a", numberType));
    RecordType rec2 = createRecord(ImmutableMap.of("b", stringType));

    JSType greatest = rec1.getGreatestSubtypeHelper(rec2);
    assertTrue(greatest.isRecordType());
    RecordType res = greatest.toMaybeRecordType();
    assertTrue(res.hasProperty("a"));
    assertTrue(res.hasProperty("b"));
    assertEquals(numberType, res.getPropertyType("a"));
    assertEquals(stringType, res.getPropertyType("b"));
  }

  @Test
  public void testGetGreatestSubtypeHelper_withAnotherRecordType_conflictingProperties() {
    RecordType rec1 = createRecord(ImmutableMap.of("a", numberType));
    RecordType rec2 = createRecord(ImmutableMap.of("a", stringType));

    JSType greatest = rec1.getGreatestSubtypeHelper(rec2);
    assertTrue(greatest.isNoType());
  }

  @Test
  public void testGetGreatestSubtypeHelper_withAnotherRecordType_matchingOverlappingProperties() {
    Node nodeA = Node.newString("a");
    Map<String, RecordProperty> map1 = Maps.newHashMap();
    map1.put("a", new RecordProperty(numberType, nodeA));
    map1.put("b", new RecordProperty(stringType, null));
    RecordType rec1 = new RecordType(registry, map1);

    Map<String, RecordProperty> map2 = Maps.newHashMap();
    map2.put("a", new RecordProperty(numberType, nodeA));
    map2.put("c", new RecordProperty(booleanType, null));
    RecordType rec2 = new RecordType(registry, map2);

    JSType greatest = rec1.getGreatestSubtypeHelper(rec2);
    assertTrue(greatest.isRecordType());
    RecordType res = greatest.toMaybeRecordType();
    assertTrue(res.hasProperty("a"));
    assertTrue(res.hasProperty("b"));
    assertTrue(res.hasProperty("c"));
  }

  @Test
  public void testGetGreatestSubtypeHelper_withNonRecordType() {
    RecordType rec = createRecord(ImmutableMap.of("a", numberType));
    JSType greatestNumber = rec.getGreatestSubtypeHelper(numberType);
    assertTrue(greatestNumber.isNoObjectType());

    JSType greatestObj = rec.getGreatestSubtypeHelper(objectType);
    assertNotNull(greatestObj);
  }

  @Test
  public void testResolveInternal_resolvesContainedTypes() {
    NamedType unresType = new NamedType(registry, "NamedFoo", "source.js", 1, 1);
    RecordType record = createRecord(ImmutableMap.<String, JSType>of("foo", unresType));

    StaticScope<JSType> scope = new Scope(null, null);
    ObjectType resolvedFooObj = new PrototypeObjectType(registry, "NamedFoo", objectType);
    registry.declareType("NamedFoo", resolvedFooObj);

    record.resolveInternal(null, scope);
    assertEquals(resolvedFooObj, record.getPropertyType("foo"));
  }

  @Test
  public void testResolveInternal_withoutModifications() {
    RecordType record = createRecord(ImmutableMap.of("a", numberType, "b", stringType));
    StaticScope<JSType> scope = new Scope(null, null);
    JSType resolved = record.resolveInternal(null, scope);
    assertSame(record, resolved);
    assertEquals(numberType, record.getPropertyType("a"));
  }
}
