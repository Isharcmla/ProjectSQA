package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType.TypePair;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class JSTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType nullType;
  private JSType voidType;
  private JSType allType;
  private JSType unknownType;
  private JSType noType;
  private JSType noObjectType;
  private JSType noResolvedType;
  private ObjectType objectType;
  private ObjectType numberObjectType;
  private ObjectType stringObjectType;
  private ObjectType booleanObjectType;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    numberObjectType = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    stringObjectType = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    booleanObjectType = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
  }

  @Test
  public void testAlphaComparator() {
    int cmp = JSType.ALPHA.compare(numberType, stringType);
    assertTrue(cmp != 0);
    assertEquals(0, JSType.ALPHA.compare(numberType, numberType));
  }

  @Test
  public void testGetJSDocInfo_defaultNull() {
    assertNull(numberType.getJSDocInfo());
  }

  @Test
  public void testDisplayNameAndForgiveUnknownNames() {
    assertNull(numberType.getDisplayName());
    assertFalse(numberType.hasDisplayName());
    numberType.forgiveUnknownNames();

    FunctionType fnType = registry.createFunctionType(numberType);
    assertNull(fnType.getDisplayName());
    assertFalse(fnType.hasDisplayName());

    ObjectType namedInstance = registry.createObjectType("CustomType", null, null);
    assertNotNull(namedInstance.getDisplayName());
    assertTrue(namedInstance.hasDisplayName());
  }

  @Test
  public void testTypePredicates_nativeTypes() {
    assertTrue(noType.isNoType());
    assertFalse(numberType.isNoType());

    assertTrue(noResolvedType.isNoResolvedType());
    assertFalse(numberType.isNoResolvedType());

    assertTrue(noObjectType.isNoObjectType());
    assertFalse(numberType.isNoObjectType());

    assertTrue(noType.isEmptyType());
    assertTrue(noResolvedType.isEmptyType());
    assertTrue(noObjectType.isEmptyType());
    assertFalse(numberType.isEmptyType());

    assertTrue(numberObjectType.isNumberObjectType());
    assertFalse(numberType.isNumberObjectType());

    assertTrue(numberType.isNumberValueType());
    assertFalse(numberObjectType.isNumberValueType());

    assertTrue(stringObjectType.isStringObjectType());
    assertFalse(stringType.isStringObjectType());

    assertTrue(stringType.isStringValueType());
    assertFalse(stringObjectType.isStringValueType());

    assertTrue(stringType.isString());
    assertTrue(stringObjectType.isString());
    assertFalse(numberType.isString());

    assertTrue(numberType.isNumber());
    assertTrue(numberObjectType.isNumber());
    assertFalse(stringType.isNumber());

    assertTrue(booleanObjectType.isBooleanObjectType());
    assertFalse(booleanType.isBooleanObjectType());

    assertTrue(booleanType.isBooleanValueType());
    assertFalse(booleanObjectType.isBooleanValueType());

    assertTrue(nullType.isNullType());
    assertFalse(voidType.isNullType());

    assertTrue(voidType.isVoidType());
    assertFalse(nullType.isVoidType());

    assertTrue(allType.isAllType());
    assertFalse(numberType.isAllType());

    assertTrue(unknownType.isUnknownType());
    assertFalse(numberType.isUnknownType());

    JSType checkedUnknown = registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE);
    assertTrue(checkedUnknown.isCheckedUnknownType());
    assertFalse(unknownType.isCheckedUnknownType());

    JSType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
    assertTrue(arrayType.isArrayType());
    assertFalse(numberType.isArrayType());

    JSType regexpType = registry.getNativeType(JSTypeNative.REGEXP_TYPE);
    assertTrue(regexpType.isRegexpType());
    assertFalse(numberType.isRegexpType());

    JSType dateType = registry.getNativeType(JSTypeNative.DATE_TYPE);
    assertTrue(dateType.isDateType());
    assertFalse(numberType.isDateType());

    assertTrue(objectType.isObject());
    assertFalse(numberType.isObject());

    assertTrue(objectType.isTheObjectType());
    assertFalse(numberType.isTheObjectType());
  }

  @Test
  public void testCompositeTypePredicates() {
    UnionType union = (UnionType) registry.createUnionType(numberType, stringType);
    assertTrue(union.isUnionType());
    assertFalse(numberType.isUnionType());

    FunctionType ctor = registry.createConstructorType("Foo", null, null, null);
    assertTrue(ctor.isFunctionType());
    assertTrue(ctor.isConstructor());
    assertFalse(ctor.isInterface());
    assertFalse(ctor.isOrdinaryFunction());

    FunctionType fn = registry.createFunctionType(numberType);
    assertTrue(fn.isOrdinaryFunction());
    assertFalse(fn.isConstructor());

    FunctionType iface = registry.createInterfaceType("IFoo", null);
    assertTrue(iface.isInterface());

    ObjectType proto = ctor.getPropertyType("prototype").toObjectType();
    if (proto != null) {
      assertTrue(proto.isFunctionPrototypeType());
    }

    EnumType enumType = registry.createEnumType("MyEnum", null, numberType);
    assertTrue(enumType.isEnumType());
    assertTrue(enumType.getElementsType().isEnumElementType());
    assertFalse(numberType.isEnumType());
    assertFalse(numberType.isEnumElementType());

    NamedType namedType = new NamedType(registry, "Foo", "test.js", 1, 1);
    assertTrue(namedType.isNamedType());
    assertFalse(numberType.isNamedType());

    RecordType recordType = registry.createRecordType(Collections.<String, JSType>emptyMap());
    assertTrue(recordType.isRecordType());
    assertFalse(numberType.isRecordType());

    TemplateType templateType = new TemplateType(registry, "T");
    assertTrue(templateType.isTemplateType());
    assertFalse(numberType.isTemplateType());

    assertTrue(namedInstanceType().isNominalType());
    assertTrue(namedInstanceType().isInstanceType());
    assertFalse(numberType.isNominalType());
    assertFalse(numberType.isInstanceType());
  }

  private ObjectType namedInstanceType() {
    FunctionType ctor = registry.createConstructorType("NamedClass", null, null, null);
    return ctor.getInstanceType();
  }

  @Test
  public void testEquivalenceAndEqualsAndHashCode() {
    assertTrue(numberType.isEquivalentTo(numberType));
    assertFalse(numberType.isEquivalentTo(stringType));

    assertTrue(JSType.isEquivalent(null, null));
    assertFalse(JSType.isEquivalent(numberType, null));
    assertFalse(JSType.isEquivalent(null, numberType));
    assertTrue(JSType.isEquivalent(numberType, numberType));
    assertFalse(JSType.isEquivalent(numberType, stringType));

    assertTrue(numberType.equals(numberType));
    assertFalse(numberType.equals(stringType));
    assertFalse(numberType.equals("not a jstype"));
    assertFalse(numberType.equals(null));

    assertEquals(System.identityHashCode(numberType), numberType.hashCode());
    assertEquals("{" + numberType.hashCode() + "}", numberType.toDebugHashCodeString());

    NamedType namedType = new NamedType(registry, "Number", "test.js", 1, 1);
    namedType.resolveInternal(new SimpleErrorReporter(), registry.getGlobalScope());
    assertTrue(numberType.isEquivalentTo(namedType) || !numberType.isEquivalentTo(namedType));
  }

  @Test
  public void testContextMatching() {
    assertTrue(numberType.matchesNumberContext());
    assertTrue(numberType.matchesInt32Context());
    assertTrue(numberType.matchesUint32Context());

    assertFalse(stringType.matchesNumberContext());
    assertTrue(stringType.matchesStringContext());
    assertFalse(numberType.matchesStringContext());

    assertTrue(objectType.matchesObjectContext());
    assertFalse(nullType.matchesObjectContext());
  }

  @Test
  public void testBoxingAndDereferencing() {
    assertSame(numberObjectType, numberType.autoboxesTo());
    assertNull(objectType.autoboxesTo());

    assertSame(numberType, numberObjectType.unboxesTo());
    assertNull(numberType.unboxesTo());

    assertSame(objectType, objectType.toObjectType());
    assertNull(numberType.toObjectType());

    ObjectType deref = numberType.dereference();
    assertNotNull(deref);
    assertTrue(deref.isObject());

    assertNull(nullType.dereference());
    assertNull(voidType.dereference());
  }

  @Test
  public void testFindPropertyType() {
    assertNull(numberType.findPropertyType("nonExistentProp"));
    assertNull(nullType.findPropertyType("foo"));

    numberObjectType.defineDeclaredProperty("foo", stringType, null);
    assertSame(stringType, numberType.findPropertyType("foo"));
  }

  @Test
  public void testCanBeCalledAndCanAssignTo() {
    FunctionType fn = registry.createFunctionType(numberType);
    assertTrue(fn.canBeCalled());
    assertFalse(numberType.canBeCalled());

    assertTrue(numberType.canAssignTo(numberType));
    assertTrue(numberType.canAssignTo(allType));
    assertFalse(numberType.canAssignTo(stringType));
  }

  @Test
  public void testEqualityAndShallowEquality() {
    assertTrue(numberType.canTestForEqualityWith(stringType));
    assertTrue(numberType.canTestForEqualityWith(numberType));

    assertEquals(TernaryValue.TRUE, nullType.testForEquality(voidType));
    assertEquals(TernaryValue.TRUE, voidType.testForEquality(nullType));
    assertEquals(TernaryValue.FALSE, numberType.testForEquality(stringType));
    assertEquals(TernaryValue.UNKNOWN, allType.testForEquality(numberType));
    assertEquals(TernaryValue.UNKNOWN, unknownType.testForEquality(numberType));
    assertEquals(TernaryValue.UNKNOWN, noResolvedType.testForEquality(numberType));
    assertEquals(TernaryValue.TRUE, noType.testForEquality(noType));
    assertEquals(TernaryValue.UNKNOWN, noType.testForEquality(numberType));

    FunctionType fn = registry.createFunctionType(numberType);
    assertEquals(TernaryValue.FALSE, fn.testForEquality(nullType));
    assertEquals(TernaryValue.UNKNOWN, fn.testForEquality(objectType));
    assertEquals(TernaryValue.FALSE, nullType.testForEquality(fn));

    EnumType enumType = registry.createEnumType("MyEnum", null, numberType);
    assertNotNull(numberType.testForEquality(enumType.getElementsType()));

    assertTrue(numberType.canTestForShallowEqualityWith(numberType));
    assertTrue(numberType.canTestForShallowEqualityWith(allType));
    assertFalse(numberType.canTestForShallowEqualityWith(stringType));
  }

  @Test
  public void testGetTypesUnderEqualityAndInequality() {
    TypePair eqPair = numberType.getTypesUnderEquality(stringType);
    assertNull(eqPair.typeA);
    assertNull(eqPair.typeB);

    TypePair sameEq = numberType.getTypesUnderEquality(numberType);
    assertSame(numberType, sameEq.typeA);
    assertSame(numberType, sameEq.typeB);

    UnionType union = (UnionType) registry.createUnionType(numberType, stringType);
    TypePair unionEq = numberType.getTypesUnderEquality(union);
    assertNotNull(unionEq.typeA);
    assertNotNull(unionEq.typeB);

    TypePair ineqPair = nullType.getTypesUnderInequality(voidType);
    assertSame(noType, ineqPair.typeA);
    assertSame(noType, ineqPair.typeB);

    TypePair diffIneq = numberType.getTypesUnderInequality(stringType);
    assertSame(numberType, diffIneq.typeA);
    assertSame(stringType, diffIneq.typeB);

    TypePair unionIneq = numberType.getTypesUnderInequality(union);
    assertNotNull(unionIneq.typeA);
    assertNotNull(unionIneq.typeB);
  }

  @Test
  public void testGetTypesUnderShallowEqualityAndInequality() {
    TypePair shallowEq = numberType.getTypesUnderShallowEquality(numberType);
    assertSame(numberType, shallowEq.typeA);
    assertSame(numberType, shallowEq.typeB);

    TypePair nullIneq = nullType.getTypesUnderShallowInequality(nullType);
    assertNull(nullIneq.typeA);
    assertNull(nullIneq.typeB);

    TypePair voidIneq = voidType.getTypesUnderShallowInequality(voidType);
    assertNull(voidIneq.typeA);
    assertNull(voidIneq.typeB);

    TypePair numIneq = numberType.getTypesUnderShallowInequality(stringType);
    assertSame(numberType, numIneq.typeA);
    assertSame(stringType, numIneq.typeB);

    UnionType union = (UnionType) registry.createUnionType(nullType, numberType);
    TypePair unionShallowIneq = nullType.getTypesUnderShallowInequality(union);
    assertNotNull(unionShallowIneq);
  }

  @Test
  public void testLeastSupertypeAndGreatestSubtype() {
    assertSame(numberType, numberType.getLeastSupertype(numberType));
    JSType numOrStr = numberType.getLeastSupertype(stringType);
    assertTrue(numOrStr.isUnionType());

    UnionType union = (UnionType) registry.createUnionType(numberType, stringType);
    assertSame(union, numberType.getLeastSupertype(union));

    assertSame(numberType, numberType.getGreatestSubtype(numberType));
    assertSame(unknownType, numberType.getGreatestSubtype(unknownType));
    assertSame(unknownType, unknownType.getGreatestSubtype(numberType));
    assertSame(numberType, numberType.getGreatestSubtype(allType));
    assertSame(numberType, allType.getGreatestSubtype(numberType));
    assertSame(noType, numberType.getGreatestSubtype(stringType));

    assertSame(noObjectType, objectType.getGreatestSubtype(numberObjectType));

    RecordType record = registry.createRecordType(Collections.<String, JSType>emptyMap());
    assertNotNull(numberType.getGreatestSubtype(record));

    assertSame(numberType, union.getGreatestSubtype(numberType));
    assertSame(numberType, numberType.getGreatestSubtype(union));
  }

  @Test
  public void testFilterNoResolvedType() {
    assertSame(noResolvedType, JSType.filterNoResolvedType(noResolvedType));
    assertSame(numberType, JSType.filterNoResolvedType(numberType));

    UnionType unionWithUnresolved = (UnionType) registry.createUnionType(numberType, noResolvedType);
    JSType filtered = JSType.filterNoResolvedType(unionWithUnresolved);
    assertFalse(filtered.isNoResolvedType());
  }

  @Test
  public void testToBooleanAndRestrictedType() {
    assertSame(numberType, numberType.getRestrictedTypeGivenToBooleanOutcome(true));
    assertSame(numberType, numberType.getRestrictedTypeGivenToBooleanOutcome(false));
    assertSame(noType, nullType.getRestrictedTypeGivenToBooleanOutcome(true));
    assertSame(nullType, nullType.getRestrictedTypeGivenToBooleanOutcome(false));
  }

  @Test
  public void testNullableAndRestrictNotNull() {
    assertTrue(nullType.isNullable());
    assertFalse(numberType.isNullable());

    UnionType union = (UnionType) registry.createUnionType(nullType, numberType);
    assertTrue(union.isNullable());
    assertSame(numberType, union.restrictByNotNullOrUndefined());
    assertSame(numberType, numberType.restrictByNotNullOrUndefined());
  }

  @Test
  public void testDiffersFrom() {
    assertFalse(numberType.differsFrom(numberType));
    assertTrue(numberType.differsFrom(stringType));
    assertTrue(numberType.differsFrom(unknownType));
    assertTrue(unknownType.differsFrom(numberType));
    assertFalse(unknownType.differsFrom(unknownType));
  }

  @Test
  public void testStaticIsSubtype() {
    assertTrue(JSType.isSubtype(numberType, unknownType));
    assertTrue(JSType.isSubtype(numberType, numberType));
    assertTrue(JSType.isSubtype(numberType, allType));
    assertFalse(JSType.isSubtype(numberType, stringType));

    UnionType union = (UnionType) registry.createUnionType(numberType, stringType);
    assertTrue(JSType.isSubtype(numberType, union));

    NamedType namedType = new NamedType(registry, "Number", "test.js", 1, 1);
    namedType.resolveInternal(new SimpleErrorReporter(), registry.getGlobalScope());
    assertTrue(JSType.isSubtype(numberType, namedType));
  }

  @Test
  public void testResolveLifecycle() {
    ErrorReporter reporter = new SimpleErrorReporter();
    StaticScope<JSType> scope = registry.getGlobalScope();

    NamedType namedType = new NamedType(registry, "Number", "test.js", 1, 1);
    assertFalse(namedType.isResolved());

    JSType resolved = namedType.resolve(reporter, scope);
    assertTrue(namedType.isResolved());
    assertSame(resolved, namedType.resolve(reporter, scope));

    namedType.clearResolved();
    assertFalse(namedType.isResolved());

    JSType forced = namedType.forceResolve(reporter, scope);
    assertTrue(namedType.isResolved());
    assertNotNull(forced);

    assertNull(JSType.safeResolve(null, reporter, scope));
    assertSame(forced, JSType.safeResolve(namedType, reporter, scope));
  }

  @Test
  public void testResolveLoopBackUnknownFallback() {
    NamedType loopingType = new NamedType(registry, "Loop", "test.js", 1, 1) {
      @Override
      JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
        return null;
      }
    };
    loopingType.resolve(new SimpleErrorReporter(), registry.getGlobalScope());
    loopingType.setResolvedTypeInternal(null);
    assertSame(unknownType, loopingType.resolve(new SimpleErrorReporter(), registry.getGlobalScope()));
  }

  @Test
  public void testSetValidator() {
    Predicate<JSType> alwaysTrue = Predicates.alwaysTrue();
    Predicate<JSType> alwaysFalse = Predicates.alwaysFalse();

    assertTrue(numberType.setValidator(alwaysTrue));
    assertFalse(numberType.setValidator(alwaysFalse));
  }

  @Test
  public void testTypePairCreation() {
    TypePair pair = new TypePair(numberType, stringType);
    assertSame(numberType, pair.typeA);
    assertSame(stringType, pair.typeB);
  }

  @Test
  public void testVisitor() {
    Visitor<String> visitor = new Visitor<String>() {
      @Override public String caseNoType() { return "NoType"; }
      @Override public String caseEnumElementType(EnumElementType type) { return "EnumElement"; }
      @Override public String caseAllType() { return "AllType"; }
      @Override public String caseValueType(ValueType type) { return "ValueType"; }
      @Override public String caseNoObjectType() { return "NoObjectType"; }
      @Override public String caseFunctionType(FunctionType type) { return "FunctionType"; }
      @Override public String caseObjectType(ObjectType type) { return "ObjectType"; }
      @Override public String caseUnknownType() { return "UnknownType"; }
      @Override public String caseUnionType(UnionType type) { return "UnionType"; }
      @Override public String caseTemplateType(TemplateType templateType) { return "TemplateType"; }
    };

    assertEquals("ValueType", numberType.visit(visitor));
    assertEquals("AllType", allType.visit(visitor));
    assertEquals("UnknownType", unknownType.visit(visitor));
    assertEquals("NoType", noType.visit(visitor));
    assertEquals("NoObjectType", noObjectType.visit(visitor));
  }
}
