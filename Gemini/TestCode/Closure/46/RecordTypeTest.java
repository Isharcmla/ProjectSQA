package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableMap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class RecordTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType unknownType;
  private JSType objectType;
  private SimpleErrorReporter errorReporter;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
  }

  private RecordType createRecordType(Map<String, JSType> props) {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    for (Map.Entry<String, JSType> entry : props.entrySet()) {
      builder.addProperty(entry.getKey(), entry.getValue(), null);
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
  public void testConstructor_emptyProperties_createsEmptyRecordType() {
    Map<String, RecordProperty> map = new HashMap<String, RecordProperty>();
    RecordType record = new RecordType(registry, map);
    assertNotNull(record);
    assertTrue(record.isRecordType());
    assertFalse(record.hasProperty("any"));
  }

  @Test
  public void testGetImplicitPrototype_returnsNativeObjectType() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    ObjectType proto = record.getImplicitPrototype();
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), proto);
  }

  @Test
  public void testDefineProperty_whenFrozen_returnsFalse() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    boolean added = record.defineProperty("b", stringType, false, null);
    assertFalse(added);
    assertFalse(record.hasProperty("b"));
  }

  @Test
  public void testToMaybeRecordType_returnsThis() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    assertSame(record, record.toMaybeRecordType());
  }

  @Test
  public void testIsEquivalentTo_sameInstance_returnsTrue() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    assertTrue(record.isEquivalentTo(record));
  }

  @Test
  public void testIsEquivalentTo_nonRecordType_returnsFalse() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    assertFalse(record.isEquivalentTo(numberType));
    assertFalse(record.isEquivalentTo(null));
  }

  @Test
  public void testIsEquivalentTo_differentPropertyKeys_returnsFalse() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecordType(ImmutableMap.of("b", numberType));
    RecordType record3 = createRecordType(ImmutableMap.of("a", numberType, "b", stringType));

    assertFalse(record1.isEquivalentTo(record2));
    assertFalse(record1.isEquivalentTo(record3));
  }

  @Test
  public void testIsEquivalentTo_sameKeysDifferentTypes_returnsFalse() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecordType(ImmutableMap.of("a", stringType));

    assertFalse(record1.isEquivalentTo(record2));
  }

  @Test
  public void testIsEquivalentTo_identicalRecords_returnsTrue() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType record2 = createRecordType(ImmutableMap.of("a", numberType, "b", stringType));

    assertTrue(record1.isEquivalentTo(record2));
    assertTrue(record2.isEquivalentTo(record1));
  }

  @Test
  public void testGetLeastSupertype_withNonRecordType_delegatesToSuper() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    JSType result = record.getLeastSupertype(numberType);
    assertTrue(result.isUnionType() || result.isObject());
  }

  @Test
  public void testGetLeastSupertype_withMatchingRecordProperties_retainsCommonProperties() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType record2 = createRecordType(ImmutableMap.of("a", numberType, "c", booleanType));

    JSType superType = record1.getLeastSupertype(record2);
    assertTrue(superType.isRecordType());
    RecordType resultRecord = superType.toMaybeRecordType();
    assertTrue(resultRecord.hasProperty("a"));
    assertFalse(resultRecord.hasProperty("b"));
    assertFalse(resultRecord.hasProperty("c"));
    assertTrue(resultRecord.getPropertyType("a").isEquivalentTo(numberType));
  }

  @Test
  public void testGetLeastSupertype_withConflictingRecordProperties_excludesConflictingProperties() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType, "b", stringType));
    RecordType record2 = createRecordType(ImmutableMap.of("a", stringType, "b", stringType));

    JSType superType = record1.getLeastSupertype(record2);
    assertTrue(superType.isRecordType());
    RecordType resultRecord = superType.toMaybeRecordType();
    assertFalse(resultRecord.hasProperty("a"));
    assertTrue(resultRecord.hasProperty("b"));
  }

  @Test
  public void testGetLeastSupertype_withDisjointRecords_returnsEmptyRecord() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecordType(ImmutableMap.of("b", stringType));

    JSType superType = record1.getLeastSupertype(record2);
    assertTrue(superType.isRecordType());
    RecordType resultRecord = superType.toMaybeRecordType();
    assertFalse(resultRecord.hasProperty("a"));
    assertFalse(resultRecord.hasProperty("b"));
  }

  @Test
  public void testGetGreatestSubtypeHelper_withRecordType_noConflict_mergesProperties() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecordType(ImmutableMap.of("b", stringType));

    JSType subType = record1.getGreatestSubtypeHelper(record2);
    assertTrue(subType.isRecordType());
    RecordType resultRecord = subType.toMaybeRecordType();
    assertTrue(resultRecord.hasProperty("a"));
    assertTrue(resultRecord.hasProperty("b"));
  }

  @Test
  public void testGetGreatestSubtypeHelper_withRecordType_conflict_returnsNoType() {
    RecordType record1 = createRecordType(ImmutableMap.of("a", numberType));
    RecordType record2 = createRecordType(ImmutableMap.of("a", stringType));

    JSType subType = record1.getGreatestSubtypeHelper(record2);
    assertTrue(subType.isNoType());
  }

  @Test
  public void testGetGreatestSubtypeHelper_withNonRecordNonObjectType_returnsNoObjectType() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    JSType subType = record.getGreatestSubtypeHelper(numberType);
    assertTrue(subType.isNoObjectType());
  }

  @Test
  public void testGetGreatestSubtypeHelper_withObjectTypeTarget() {
    RecordType record = createRecordType(ImmutableMap.of("a", unknownType));
    JSType subType = record.getGreatestSubtypeHelper(objectType);
    assertNotNull(subType);
  }

  @Test
  public void testIsSubtype_viaIsSubtypeHelper_returnsTrue() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    assertTrue(record.isSubtype(registry.getNativeType(JSTypeNative.ALL_TYPE)));
    assertTrue(record.isSubtype(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)));
  }

  @Test
  public void testIsSubtype_toObjectType_returnsTrue() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    assertTrue(record.isSubtype(objectType));
  }

  @Test
  public void testIsSubtype_toNonRecordType_returnsFalse() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    assertFalse(record.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_toAnotherRecordType_supersetIsSubtype() {
    RecordType parent = createRecordType(ImmutableMap.of("a", numberType));
    RecordType child = createRecordType(ImmutableMap.of("a", numberType, "b", stringType));

    assertTrue(child.isSubtype(parent));
    assertFalse(parent.isSubtype(child));
  }

  @Test
  public void testIsSubtype_toAnotherRecordType_differentPropertyType_returnsFalse() {
    RecordType rec1 = createRecordType(ImmutableMap.of("a", numberType));
    RecordType rec2 = createRecordType(ImmutableMap.of("a", stringType));

    assertFalse(rec1.isSubtype(rec2));
  }

  @Test
  public void testStaticIsSubtype_declaredPropertyMismatch_returnsFalse() {
    RecordType target = createRecordType(ImmutableMap.of("a", numberType));
    ObjectType source = registry.createAnonymousObjectType(null);
    source.defineDeclaredProperty("a", stringType, null);

    assertFalse(RecordType.isSubtype(source, target));
  }

  @Test
  public void testStaticIsSubtype_declaredPropertyMatch_returnsTrue() {
    RecordType target = createRecordType(ImmutableMap.of("a", numberType));
    ObjectType source = registry.createAnonymousObjectType(null);
    source.defineDeclaredProperty("a", numberType, null);

    assertTrue(RecordType.isSubtype(source, target));
  }

  @Test
  public void testStaticIsSubtype_missingProperty_returnsFalse() {
    RecordType target = createRecordType(ImmutableMap.of("a", numberType));
    ObjectType source = registry.createAnonymousObjectType(null);

    assertFalse(RecordType.isSubtype(source, target));
  }

  @Test
  public void testStaticIsSubtype_inferredPropertySubtypeCheck() {
    RecordType target = createRecordType(ImmutableMap.of("a", objectType));
    ObjectType source = registry.createAnonymousObjectType(null);
    ObjectType nonNullObject = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    source.defineInferredProperty("a", nonNullObject, null);

    assertTrue(RecordType.isSubtype(source, target));

    ObjectType sourceIncompatible = registry.createAnonymousObjectType(null);
    sourceIncompatible.defineInferredProperty("a", stringType, null);
    assertFalse(RecordType.isSubtype(sourceIncompatible, target));
  }

  @Test
  public void testStaticIsSubtype_unknownProperties_returnsTrue() {
    RecordType target = createRecordType(ImmutableMap.of("a", unknownType));
    ObjectType source = registry.createAnonymousObjectType(null);
    source.defineDeclaredProperty("a", numberType, null);

    assertTrue(RecordType.isSubtype(source, target));

    RecordType targetSpecific = createRecordType(ImmutableMap.of("a", numberType));
    ObjectType sourceUnknown = registry.createAnonymousObjectType(null);
    sourceUnknown.defineDeclaredProperty("a", unknownType, null);

    assertTrue(RecordType.isSubtype(sourceUnknown, targetSpecific));
  }

  @Test
  public void testResolveInternal_resolvesContainedTypes() {
    NamedType unresType = new NamedType(registry, "SomeType", "source.js", 1, 1);
    RecordType record = createRecordType(ImmutableMap.of("prop", (JSType) unresType));

    StaticScope<JSType> scope = registry.getTopScope();
    JSType resolved = record.resolve(errorReporter, scope);
    assertNotNull(resolved);
    assertTrue(resolved.isRecordType());
  }

  @Test
  public void testResolveInternal_propertyNotChanged_remainsIntact() {
    RecordType record = createRecordType(ImmutableMap.of("a", numberType));
    StaticScope<JSType> scope = registry.getTopScope();
    JSType resolved = record.resolve(errorReporter, scope);
    assertSame(record, resolved);
  }
}
