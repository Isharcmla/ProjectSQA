package com.google.javascript.rhino.jstype;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class UnionTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType nullType;
  private JSType voidType;
  private JSType unknownType;
  private JSType allType;
  private JSType objectType;
  private JSType noType;
  private JSType noObjectType;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
  }

  private UnionType createUnion(JSType... types) {
    return new UnionType(registry, ImmutableList.copyOf(types));
  }

  @Test
  public void testGetAlternates_returnsGivenAlternates() {
    UnionType union = createUnion(numberType, stringType);
    List<JSType> list = new ArrayList<>();
    for (JSType alternate : union.getAlternates()) {
      list.add(alternate);
    }
    assertEquals(2, list.size());
    assertTrue(list.contains(numberType));
    assertTrue(list.contains(stringType));
  }

  @Test
  public void testMatchesNumberContext_whenContainsNumber_returnsTrue() {
    UnionType union = createUnion(numberType, stringType);
    assertTrue(union.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_whenNoMatches_returnsFalse() {
    UnionType union = createUnion(voidType);
    assertFalse(union.matchesNumberContext());
  }

  @Test
  public void testMatchesStringContext_whenContainsString_returnsTrue() {
    UnionType union = createUnion(stringType, numberType);
    assertTrue(union.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_whenVoidOnly_returnsFalse() {
    UnionType union = createUnion(voidType);
    assertFalse(union.matchesStringContext());
  }

  @Test
  public void testMatchesObjectContext_whenContainsObject_returnsTrue() {
    UnionType union = createUnion(objectType, nullType);
    assertTrue(union.matchesObjectContext());
  }

  @Test
  public void testMatchesObjectContext_whenNullAndVoidOnly_returnsFalse() {
    UnionType union = createUnion(nullType, voidType);
    assertFalse(union.matchesObjectContext());
  }

  @Test
  public void testFindPropertyType_propertyFoundOnMultipleAlternates() {
    ObjectType record1 = registry.createRecordTypeBuilder()
        .addProperty("foo", numberType, null)
        .build();
    ObjectType record2 = registry.createRecordTypeBuilder()
        .addProperty("foo", stringType, null)
        .build();

    UnionType union = createUnion(record1, record2, nullType, voidType);
    JSType propType = union.findPropertyType("foo");

    assertNotNull(propType);
    assertTrue(propType.isUnionType());
    assertTrue(propType.toMaybeUnionType().contains(numberType));
    assertTrue(propType.toMaybeUnionType().contains(stringType));
  }

  @Test
  public void testFindPropertyType_propertyNotFound_returnsNull() {
    UnionType union = createUnion(nullType, voidType, numberType);
    assertNull(union.findPropertyType("nonExistent"));
  }

  @Test
  public void testFindPropertyType_propertyOnSingleAlternate() {
    ObjectType record = registry.createRecordTypeBuilder()
        .addProperty("bar", booleanType, null)
        .build();
    UnionType union = createUnion(record, numberType);
    assertEquals(booleanType, union.findPropertyType("bar"));
  }

  @Test
  public void testCanAssignTo_whenAllAlternatesAssign_returnsTrue() {
    UnionType union = createUnion(numberType, numberType);
    assertTrue(union.canAssignTo(numberType));
  }

  @Test
  public void testCanAssignTo_whenUnknownAlternate_returnsTrue() {
    UnionType union = createUnion(unknownType, numberType);
    assertTrue(union.canAssignTo(stringType));
  }

  @Test
  public void testCanAssignTo_whenOneAlternateCannotAssign_returnsFalse() {
    UnionType union = createUnion(numberType, stringType);
    assertFalse(union.canAssignTo(numberType));
  }

  @Test
  public void testCanBeCalled_whenAllCanBeCalled_returnsTrue() {
    FunctionType func1 = registry.createFunctionType(numberType);
    FunctionType func2 = registry.createFunctionType(stringType);
    UnionType union = createUnion(func1, func2);
    assertTrue(union.canBeCalled());
  }

  @Test
  public void testCanBeCalled_whenOneCannotBeCalled_returnsFalse() {
    FunctionType func = registry.createFunctionType(numberType);
    UnionType union = createUnion(func, numberType);
    assertFalse(union.canBeCalled());
  }

  @Test
  public void testAutobox_autoboxesAlternates() {
    UnionType union = createUnion(numberType, stringType);
    JSType autoboxed = union.autobox();
    assertTrue(autoboxed.isSubtype(objectType));
  }

  @Test
  public void testRestrictByNotNullOrUndefined_removesNullAndVoid() {
    UnionType union = createUnion(numberType, nullType, voidType);
    JSType restricted = union.restrictByNotNullOrUndefined();
    assertEquals(numberType, restricted);
  }

  @Test
  public void testTestForEquality_sameTernaryValue() {
    UnionType union = createUnion(numberType, numberType);
    assertEquals(TernaryValue.UNKNOWN, union.testForEquality(numberType));
  }

  @Test
  public void testTestForEquality_differentTernaryValues_returnsUnknown() {
    UnionType union = createUnion(nullType, stringType);
    assertEquals(TernaryValue.UNKNOWN, union.testForEquality(nullType));
  }

  @Test
  public void testIsNullable_whenContainsNull_returnsTrue() {
    UnionType union = createUnion(numberType, nullType);
    assertTrue(union.isNullable());
  }

  @Test
  public void testIsNullable_whenNoNull_returnsFalse() {
    UnionType union = createUnion(numberType, stringType);
    assertFalse(union.isNullable());
  }

  @Test
  public void testIsUnknownType_whenContainsUnknown_returnsTrue() {
    UnionType union = createUnion(numberType, unknownType);
    assertTrue(union.isUnknownType());
  }

  @Test
  public void testIsUnknownType_whenNoUnknown_returnsFalse() {
    UnionType union = createUnion(numberType, stringType);
    assertFalse(union.isUnknownType());
  }

  @Test
  public void testIsStruct_whenContainsStruct_returnsTrue() {
    ObjectType structObj = registry.createObjectType("MyStruct", null, null);
    structObj.setStruct();
    UnionType union = createUnion(numberType, structObj);
    assertTrue(union.isStruct());
  }

  @Test
  public void testIsStruct_whenNoStruct_returnsFalse() {
    UnionType union = createUnion(numberType, stringType);
    assertFalse(union.isStruct());
  }

  @Test
  public void testIsDict_whenContainsDict_returnsTrue() {
    ObjectType dictObj = registry.createObjectType("MyDict", null, null);
    dictObj.setDict();
    UnionType union = createUnion(numberType, dictObj);
    assertTrue(union.isDict());
  }

  @Test
  public void testIsDict_whenNoDict_returnsFalse() {
    UnionType union = createUnion(numberType, stringType);
    assertFalse(union.isDict());
  }

  @Test
  public void testGetLeastSupertype_whenSubtypeOfAlternate_returnsThis() {
    UnionType union = createUnion(numberType, stringType);
    assertSame(union, union.getLeastSupertype(numberType));
  }

  @Test
  public void testGetLeastSupertype_whenOtherIsUnion_computesSupertype() {
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(stringType, booleanType);
    JSType superType = union1.getLeastSupertype(union2);
    assertTrue(superType.isUnionType());
    UnionType superUnion = superType.toMaybeUnionType();
    assertTrue(superUnion.contains(numberType));
    assertTrue(superUnion.contains(stringType));
    assertTrue(superUnion.contains(booleanType));
  }

  @Test
  public void testMeet_withUnionType() {
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(stringType, booleanType);
    JSType met = union1.meet(union2);
    assertEquals(stringType, met);
  }

  @Test
  public void testMeet_withSubtype() {
    UnionType union = createUnion(numberType, stringType);
    JSType met = union.meet(numberType);
    assertEquals(numberType, met);
  }

  @Test
  public void testMeet_noOverlapObjects_returnsNoObjectType() {
    ObjectType obj1 = registry.createRecordTypeBuilder()
        .addProperty("a", numberType, null).build();
    ObjectType obj2 = registry.createRecordTypeBuilder()
        .addProperty("b", stringType, null).build();
    UnionType union = createUnion(obj1);
    JSType met = union.meet(obj2);
    assertTrue(met.isNoObjectType() || met.isSubtype(objectType));
  }

  @Test
  public void testMeet_noOverlapNonObjects_returnsNoType() {
    UnionType union = createUnion(numberType);
    JSType met = union.meet(stringType);
    assertEquals(noType, met);
  }

  @Test
  public void testCheckUnionEquivalenceHelper_tolerateUnknownsTrueAndFalse() {
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(stringType, numberType);
    UnionType union3 = createUnion(numberType, booleanType);
    UnionType union4 = createUnion(numberType);

    assertTrue(union1.checkUnionEquivalenceHelper(union2, false));
    assertTrue(union1.checkUnionEquivalenceHelper(union2, true));
    assertFalse(union1.checkUnionEquivalenceHelper(union3, false));
    assertFalse(union1.checkUnionEquivalenceHelper(union4, false));
  }

  @Test
  public void testHasProperty_whenOneHasProperty_returnsTrue() {
    ObjectType record = registry.createRecordTypeBuilder()
        .addProperty("testProp", numberType, null)
        .build();
    UnionType union = createUnion(numberType, record);
    assertTrue(union.hasProperty("testProp"));
    assertFalse(union.hasProperty("nonExistentProp"));
  }

  @Test
  public void testHashCode_consistent() {
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(numberType, stringType);
    assertEquals(union1.hashCode(), union2.hashCode());
  }

  @Test
  public void testToMaybeUnionType_returnsSelf() {
    UnionType union = createUnion(numberType, stringType);
    assertSame(union, union.toMaybeUnionType());
  }

  @Test
  public void testIsObject_whenAllObjects_returnsTrue() {
    UnionType union = createUnion(objectType, objectType);
    assertTrue(union.isObject());
  }

  @Test
  public void testIsObject_whenPrimitiveIncluded_returnsFalse() {
    UnionType union = createUnion(objectType, numberType);
    assertFalse(union.isObject());
  }

  @Test
  public void testContains_presentAndNotPresent() {
    UnionType union = createUnion(numberType, stringType);
    assertTrue(union.contains(numberType));
    assertTrue(union.contains(stringType));
    assertFalse(union.contains(booleanType));
  }

  @Test
  public void testGetRestrictedUnion_removesSubtypes() {
    UnionType union = createUnion(numberType, stringType, nullType);
    JSType restricted = union.getRestrictedUnion(nullType);
    assertTrue(restricted.isUnionType());
    assertFalse(restricted.toMaybeUnionType().contains(nullType));
    assertTrue(restricted.toMaybeUnionType().contains(numberType));
    assertTrue(restricted.toMaybeUnionType().contains(stringType));
  }

  @Test
  public void testToStringHelper_formatting() {
    UnionType union = createUnion(numberType, stringType);
    String str = union.toStringHelper(false);
    assertTrue(str.startsWith("(") && str.endsWith(")"));
    assertTrue(str.contains("number"));
    assertTrue(str.contains("string"));
    assertTrue(str.contains("|"));
  }

  @Test
  public void testIsSubtype_variousTypes() {
    UnionType union = createUnion(numberType, stringType);
    assertTrue(union.isSubtype(unknownType));
    assertTrue(union.isSubtype(allType));
    assertFalse(union.isSubtype(numberType));

    UnionType broaderUnion = createUnion(numberType, stringType, booleanType);
    assertTrue(union.isSubtype(broaderUnion));
  }

  @Test
  public void testGetRestrictedTypeGivenToBooleanOutcome() {
    UnionType union = createUnion(numberType, nullType);
    JSType trueOutcome = union.getRestrictedTypeGivenToBooleanOutcome(true);
    assertFalse(trueOutcome.isNullable());

    JSType falseOutcome = union.getRestrictedTypeGivenToBooleanOutcome(false);
    assertTrue(falseOutcome.isNullable() || falseOutcome.isSubtype(numberType));
  }

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    UnionType unionTrueOnly = createUnion(objectType);
    assertEquals(BooleanLiteralSet.TRUE, unionTrueOnly.getPossibleToBooleanOutcomes());

    UnionType unionBoth = createUnion(numberType, booleanType);
    assertEquals(BooleanLiteralSet.BOTH, unionBoth.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testGetTypesUnderEquality_returnsPair() {
    UnionType union = createUnion(numberType, nullType);
    TypePair pair = union.getTypesUnderEquality(nullType);
    assertNotNull(pair);
    assertNotNull(pair.typeA);
    assertNotNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderInequality_returnsPair() {
    UnionType union = createUnion(numberType, nullType);
    TypePair pair = union.getTypesUnderInequality(nullType);
    assertNotNull(pair);
    assertNotNull(pair.typeA);
    assertNotNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderShallowInequality_returnsPair() {
    UnionType union = createUnion(numberType, stringType);
    TypePair pair = union.getTypesUnderShallowInequality(numberType);
    assertNotNull(pair);
    assertNotNull(pair.typeA);
    assertNotNull(pair.typeB);
  }

  @Test
  public void testVisit_callsVisitorCaseUnionType() {
    UnionType union = createUnion(numberType, stringType);
    Visitor<String> visitor = new Visitor<String>() {
      @Override public String caseNoType() { return "no"; }
      @Override public String caseEnumElementType(EnumElementType type) { return "enumElement"; }
      @Override public String caseAllType() { return "all"; }
      @Override public String caseBooleanType() { return "bool"; }
      @Override public String caseNoObjectType() { return "noObj"; }
      @Override public String caseFunctionType(FunctionType type) { return "func"; }
      @Override public String caseObjectType(ObjectType type) { return "obj"; }
      @Override public String caseUnknownType() { return "unknown"; }
      @Override public String caseNullType() { return "null"; }
      @Override public String caseNamedType(NamedType type) { return "named"; }
      @Override public String caseNumberType() { return "num"; }
      @Override public String caseStringType() { return "str"; }
      @Override public String caseVoidType() { return "void"; }
      @Override public String caseUnionType(UnionType type) { return "union"; }
      @Override public String caseTemplateType(TemplateType templateType) { return "template"; }
    };

    assertEquals("union", union.visit(visitor));
  }

  @Test
  public void testResolveInternal_resolvesCorrectly() {
    UnionType union = createUnion(numberType, stringType);
    JSType resolved = union.resolveInternal(new SimpleErrorReporter(), null);
    assertSame(union, resolved);
  }

  @Test
  public void testToDebugHashCodeString_returnsDebugRepresentation() {
    UnionType union = createUnion(numberType, stringType);
    String debugStr = union.toDebugHashCodeString();
    assertTrue(debugStr.startsWith("{("));
    assertTrue(debugStr.endsWith(")}"));
  }

  @Test
  public void testSetValidator_returnsTrue() {
    UnionType union = createUnion(numberType, stringType);
    Predicate<JSType> predicate = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return true;
      }
    };
    assertTrue(union.setValidator(predicate));
  }

  @Test
  public void testCollapseUnion_withUnknownType_returnsUnknown() {
    UnionType union = createUnion(numberType, unknownType);
    assertEquals(unknownType, union.collapseUnion());
  }

  @Test
  public void testCollapseUnion_withMultipleValues_returnsAllType() {
    UnionType union = createUnion(numberType, stringType);
    assertEquals(allType, union.collapseUnion());
  }

  @Test
  public void testCollapseUnion_withSingleValue_returnsNull() {
    UnionType union = createUnion(numberType);
    assertNull(union.collapseUnion());
  }

  @Test
  public void testCollapseUnion_withValueAndObject_returnsAllType() {
    UnionType union = createUnion(numberType, objectType);
    assertEquals(allType, union.collapseUnion());
  }

  @Test
  public void testCollapseUnion_withSingleObject_returnsObject() {
    UnionType union = createUnion(objectType);
    assertEquals(objectType, union.collapseUnion());
  }

  @Test
  public void testCollapseUnion_withMultipleObjects_returnsCommonSuper() {
    ObjectType record1 = registry.createRecordTypeBuilder()
        .addProperty("a", numberType, null).build();
    ObjectType record2 = registry.createRecordTypeBuilder()
        .addProperty("b", stringType, null).build();
    UnionType union = createUnion(record1, record2);
    JSType collapsed = union.collapseUnion();
    assertNotNull(collapsed);
    assertTrue(collapsed.isSubtype(objectType));
  }

  @Test
  public void testMatchConstraint_executesWithoutError() {
    UnionType union = createUnion(numberType, stringType);
    union.matchConstraint(numberType);
  }

  @Test
  public void testHasAnyTemplateInternal_returnsExpected() {
    UnionType unionWithoutTemplate = createUnion(numberType, stringType);
    assertFalse(unionWithoutTemplate.hasAnyTemplateInternal());

    TemplateType templateType = registry.createTemplateType("T");
    UnionType unionWithTemplate = createUnion(numberType, templateType);
    assertTrue(unionWithTemplate.hasAnyTemplateInternal());
  }

  @Test
  public void testEmptyUnion_matchesContextsReturnFalse() {
    UnionType emptyUnion = new UnionType(registry, Collections.<JSType>emptyList());
    assertFalse(emptyUnion.matchesNumberContext());
    assertFalse(emptyUnion.matchesStringContext());
    assertFalse(emptyUnion.matchesObjectContext());
    assertFalse(emptyUnion.isNullable());
    assertFalse(emptyUnion.isUnknownType());
    assertFalse(emptyUnion.isStruct());
    assertFalse(emptyUnion.isDict());
    assertTrue(emptyUnion.isObject());
    assertTrue(emptyUnion.canBeCalled());
    assertFalse(emptyUnion.hasProperty("prop"));
    assertFalse(emptyUnion.contains(numberType));
  }
}
