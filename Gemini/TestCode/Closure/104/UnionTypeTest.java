package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ERROR_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType nullType;
  private JSType voidType;
  private JSType unknownType;
  private JSType objectType;
  private JSType errorType;
  private JSType evalErrorType;
  private JSType uriErrorType;
  private JSType allType;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    numberType = registry.getNativeType(NUMBER_TYPE);
    stringType = registry.getNativeType(STRING_TYPE);
    booleanType = registry.getNativeType(BOOLEAN_TYPE);
    nullType = registry.getNativeType(NULL_TYPE);
    voidType = registry.getNativeType(VOID_TYPE);
    unknownType = registry.getNativeType(UNKNOWN_TYPE);
    objectType = registry.getNativeType(OBJECT_TYPE);
    errorType = registry.getNativeType(ERROR_TYPE);
    evalErrorType = registry.getNativeType(EVAL_ERROR_TYPE);
    uriErrorType = registry.getNativeType(URI_ERROR_TYPE);
    allType = registry.getNativeType(ALL_TYPE);
  }

  private UnionType createUnion(JSType... types) {
    Set<JSType> set = new HashSet<JSType>();
    Collections.addAll(set, types);
    return new UnionType(registry, set);
  }

  @Test
  public void testGetAlternates_returnsGivenAlternates() {
    Set<JSType> set = Sets.newHashSet(numberType, stringType);
    UnionType union = new UnionType(registry, set);
    assertEquals(set, Sets.newHashSet(union.getAlternates()));
  }

  @Test
  public void testForgiveUnknownNames_delegatesToAlternates() {
    UnionType union = createUnion(numberType, stringType);
    union.forgiveUnknownNames();
    assertTrue(union.isUnionType());
  }

  @Test
  public void testMatchesNumberContext_withNumberAndNonNumberAlternates() {
    UnionType unionWithNumber = createUnion(numberType, stringType);
    assertTrue(unionWithNumber.matchesNumberContext());

    UnionType unionWithoutNumber = createUnion(voidType);
    assertFalse(unionWithoutNumber.matchesNumberContext());
  }

  @Test
  public void testMatchesStringContext_withValidAndVoidAlternates() {
    UnionType unionWithString = createUnion(stringType, numberType);
    assertTrue(unionWithString.matchesStringContext());

    UnionType unionWithVoidOnly = createUnion(voidType);
    assertFalse(unionWithVoidOnly.matchesStringContext());
  }

  @Test
  public void testMatchesObjectContext_withObjectAndPrimitiveAlternates() {
    UnionType unionWithObject = createUnion(objectType, numberType);
    assertTrue(unionWithObject.matchesObjectContext());

    UnionType unionWithNullVoid = createUnion(nullType, voidType);
    assertFalse(unionWithNullVoid.matchesObjectContext());
  }

  @Test
  public void testFindPropertyType_propertyExistsOnAlternates() {
    ObjectType obj1 = registry.createAnonymousObjectType();
    obj1.defineDeclaredProperty("foo", numberType, null);
    ObjectType obj2 = registry.createAnonymousObjectType();
    obj2.defineDeclaredProperty("foo", stringType, null);

    UnionType union = createUnion(obj1, obj2, nullType, voidType);
    JSType propType = union.findPropertyType("foo");
    assertNotNull(propType);
    assertTrue(propType.isUnionType());
    assertTrue(((UnionType) propType).contains(numberType));
    assertTrue(((UnionType) propType).contains(stringType));

    assertNull(union.findPropertyType("nonExistent"));
  }

  @Test
  public void testCanAssignTo_behaviorWithUnknownAndAlternates() {
    UnionType unionUnknown = createUnion(unknownType, numberType);
    assertTrue(unionUnknown.canAssignTo(stringType));

    UnionType unionNumbers = createUnion(numberType, numberType);
    assertTrue(unionNumbers.canAssignTo(numberType));
    assertFalse(unionNumbers.canAssignTo(stringType));
  }

  @Test
  public void testCanBeCalled_allCallablesVsNonCallable() {
    FunctionType func1 = registry.createFunctionType(numberType);
    FunctionType func2 = registry.createFunctionType(stringType);

    UnionType callableUnion = createUnion(func1, func2);
    assertTrue(callableUnion.canBeCalled());

    UnionType nonCallableUnion = createUnion(func1, numberType);
    assertFalse(nonCallableUnion.canBeCalled());
  }

  @Test
  public void testRestrictByNotNullOrUndefined_removesNullAndUndefined() {
    UnionType union = createUnion(numberType, nullType, voidType);
    JSType restricted = union.restrictByNotNullOrUndefined();
    assertEquals(numberType, restricted);
  }

  @Test
  public void testTestForEquality_returnsExpectedTernaryValue() {
    UnionType numString = createUnion(numberType, stringType);
    assertEquals(TernaryValue.UNKNOWN, numString.testForEquality(numberType));

    UnionType nullUnion = createUnion(nullType);
    assertEquals(TernaryValue.TRUE, nullUnion.testForEquality(nullType));
  }

  @Test
  public void testIsNullable_trueWhenContainingNullFalseOtherwise() {
    UnionType nullable = createUnion(numberType, nullType);
    assertTrue(nullable.isNullable());

    UnionType notNullable = createUnion(numberType, booleanType);
    assertFalse(notNullable.isNullable());
  }

  @Test
  public void testIsUnknownType_trueWhenContainingUnknownFalseOtherwise() {
    UnionType withUnknown = createUnion(numberType, unknownType);
    assertTrue(withUnknown.isUnknownType());

    UnionType withoutUnknown = createUnion(numberType, stringType);
    assertFalse(withoutUnknown.isUnknownType());
  }

  @Test
  public void testGetLeastSupertype_withSubtypeAndNonSubtype() {
    UnionType numStr = createUnion(numberType, stringType);
    assertSame(numStr, numStr.getLeastSupertype(numberType));
    assertEquals(allType, numStr.getLeastSupertype(unknownType));

    JSType superType = numStr.getLeastSupertype(booleanType);
    assertTrue(superType.isUnionType());
    assertTrue(((UnionType) superType).contains(booleanType));
  }

  @Test
  public void testMeet_unionAndOtherTypes() {
    UnionType numStr = createUnion(numberType, stringType);
    assertEquals(numberType, numStr.meet(numberType));

    UnionType strBool = createUnion(stringType, booleanType);
    assertEquals(stringType, numStr.meet(strBool));

    UnionType obj1 = createUnion(evalErrorType, uriErrorType);
    assertEquals(evalErrorType, obj1.meet(evalErrorType));

    UnionType obj2 = createUnion(registry.getNativeType(NO_OBJECT_TYPE));
    UnionType obj3 = createUnion(registry.getNativeType(NO_OBJECT_TYPE));
    assertNotNull(obj2.meet(obj3));

    UnionType noIntersection = createUnion(numberType);
    assertEquals(registry.getNativeType(NO_TYPE), noIntersection.meet(stringType));
  }

  @Test
  public void testEqualsAndHashCode_sameAndDifferentAlternates() {
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(stringType, numberType);
    UnionType union3 = createUnion(numberType, booleanType);

    assertEquals(union1, union2);
    assertEquals(union1.hashCode(), union2.hashCode());
    assertNotEquals(union1, union3);
    assertFalse(union1.equals(numberType));
    assertFalse(union1.equals(null));
  }

  @Test
  public void testIsUnionType_alwaysReturnsTrue() {
    UnionType union = createUnion(numberType, stringType);
    assertTrue(union.isUnionType());
  }

  @Test
  public void testIsObject_onlyWhenAllAlternatesAreObjects() {
    UnionType objects = createUnion(evalErrorType, uriErrorType);
    assertTrue(objects.isObject());

    UnionType mixed = createUnion(objectType, numberType);
    assertFalse(mixed.isObject());
  }

  @Test
  public void testContains_checksAlternateMembership() {
    UnionType union = createUnion(numberType, stringType);
    assertTrue(union.contains(numberType));
    assertTrue(union.contains(stringType));
    assertFalse(union.contains(booleanType));
  }

  @Test
  public void testGetRestrictedUnion_removesSubtypes() {
    UnionType union = createUnion(nullType, evalErrorType, uriErrorType, unknownType);
    JSType restricted = union.getRestrictedUnion(errorType);
    assertTrue(restricted.isUnionType());
    UnionType rUnion = (UnionType) restricted;
    assertTrue(rUnion.contains(nullType));
    assertTrue(rUnion.contains(unknownType));
    assertFalse(rUnion.contains(evalErrorType));
    assertFalse(rUnion.contains(uriErrorType));
  }

  @Test
  public void testToString_formatsSortedAlternates() {
    UnionType union = createUnion(stringType, numberType);
    assertEquals("(number|string)", union.toString());
  }

  @Test
  public void testIsSubtype_verifiesAllAlternatesSubtype() {
    UnionType errorUnion = createUnion(evalErrorType, uriErrorType);
    assertTrue(errorUnion.isSubtype(errorType));

    UnionType mixedUnion = createUnion(evalErrorType, numberType);
    assertFalse(mixedUnion.isSubtype(errorType));
  }

  @Test
  public void testGetRestrictedTypeGivenToBooleanOutcome_restrictsAllAlternates() {
    UnionType union = createUnion(numberType, nullType);
    JSType trueOutcome = union.getRestrictedTypeGivenToBooleanOutcome(true);
    assertEquals(numberType, trueOutcome);

    JSType falseOutcome = union.getRestrictedTypeGivenToBooleanOutcome(false);
    assertTrue(falseOutcome.isUnionType());
  }

  @Test
  public void testGetPossibleToBooleanOutcomes_combinesOutcomes() {
    UnionType trueAndFalse = createUnion(booleanType, nullType);
    assertEquals(BooleanLiteralSet.BOTH, trueAndFalse.getPossibleToBooleanOutcomes());

    UnionType nullOnly = createUnion(nullType);
    assertEquals(BooleanLiteralSet.FALSE, nullOnly.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testGetTypesUnderEquality_evaluatesAlternates() {
    UnionType union = createUnion(numberType, stringType);
    JSType.TypePair pair = union.getTypesUnderEquality(numberType);
    assertNotNull(pair.typeA);
    assertNotNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderInequality_evaluatesAlternates() {
    UnionType union = createUnion(numberType, stringType);
    JSType.TypePair pair = union.getTypesUnderInequality(numberType);
    assertNotNull(pair.typeA);
    assertNotNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderShallowInequality_evaluatesAlternates() {
    UnionType union = createUnion(numberType, stringType);
    JSType.TypePair pair = union.getTypesUnderShallowInequality(numberType);
    assertNotNull(pair.typeA);
    assertNotNull(pair.typeB);
  }

  @Test
  public void testVisit_callsCaseUnionType() {
    UnionType union = createUnion(numberType, stringType);
    String result = union.visit(new Visitor<String>() {
      @Override public String caseNoType() { return null; }
      @Override public String caseEnumElementType(EnumElementType type) { return null; }
      @Override public String caseAllType() { return null; }
      @Override public String caseBooleanType() { return null; }
      @Override public String caseNoObjectType() { return null; }
      @Override public String caseFunctionType(FunctionType type) { return null; }
      @Override public String caseObjectType(ObjectType type) { return null; }
      @Override public String caseUnknownType() { return null; }
      @Override public String caseNullType() { return null; }
      @Override public String caseNamedType(NamedType type) { return null; }
      @Override public String caseNumberType() { return null; }
      @Override public String caseStringType() { return null; }
      @Override public String caseVoidType() { return null; }
      @Override public String caseUnionType(UnionType type) { return "visited"; }
      @Override public String caseTemplateType(TemplateType templateType) { return null; }
    });
    assertEquals("visited", result);
  }

  @Test
  public void testResolveInternal_resolvesContainedTypes() {
    NamedType namedType = new NamedType(registry, "Foo", "source", 1, 1);
    UnionType union = createUnion(namedType, numberType);
    ErrorReporter reporter = registry.getErrorReporter();
    StaticScope<JSType> scope = registry.getTopScope();
    JSType resolved = union.resolveInternal(reporter, scope);
    assertSame(union, resolved);

    UnionType standardUnion = createUnion(numberType, stringType);
    assertSame(standardUnion, standardUnion.resolveInternal(reporter, scope));
  }
}
