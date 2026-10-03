package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import org.junit.Before;
import org.junit.Test;

public class JSTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
  }

  @Test
  public void testGetNativeType_validType_returnsType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertNotNull(numberType);
    assertSame(numberType, numberType.getNativeType(JSTypeNative.NUMBER_TYPE));
  }

  @Test
  public void testGetJSDocInfo_default_returnsNull() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertNull(numberType.getJSDocInfo());
  }

  @Test
  public void testGetDisplayName_andHasDisplayName() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertNull(numberType.getDisplayName());
    assertFalse(numberType.hasDisplayName());

    ObjectType namedType = registry.createNamedType("MyCustomType", null, 0, 0);
    assertTrue(namedType.hasDisplayName());
    assertEquals("MyCustomType", namedType.getDisplayName());
  }

  @Test
  public void testHasDisplayName_customTypeWithEmptyName() {
    JSType customType = new JSType(registry) {
      @Override
      public String getDisplayName() {
        return "";
      }

      @Override
      public BooleanLiteralSet getPossibleToBooleanOutcomes() {
        return BooleanLiteralSet.BOTH;
      }

      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }

      @Override
      JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }

      @Override
      String toStringHelper(boolean forAnnotations) {
        return "emptyName";
      }
    };
    assertFalse(customType.hasDisplayName());
  }

  @Test
  public void testHasProperty_default_returnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertFalse(numberType.hasProperty("length"));
  }

  @Test
  public void testTypePredicates_basicChecks() {
    JSType numberVal = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringVal = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType booleanVal = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    JSType nullVal = registry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType voidVal = registry.getNativeType(JSTypeNative.VOID_TYPE);
    JSType allVal = registry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType unknownVal = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType checkedUnknown = registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE);
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    JSType noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    JSType noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);

    JSType numberObj = registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE);
    JSType stringObj = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
    JSType booleanObj = registry.getNativeType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    JSType dateObj = registry.getNativeType(JSTypeNative.DATE_TYPE);
    JSType regexpObj = registry.getNativeType(JSTypeNative.REGEXP_TYPE);
    JSType arrayObj = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
    JSType globalThis = registry.getNativeType(JSTypeNative.GLOBAL_THIS);

    assertTrue(noType.isNoType());
    assertTrue(noObjectType.isNoObjectType());
    assertTrue(noResolvedType.isNoResolvedType());

    assertTrue(noType.isEmptyType());
    assertTrue(noObjectType.isEmptyType());
    assertTrue(noResolvedType.isEmptyType());
    assertTrue(registry.getNativeFunctionType(JSTypeNative.LEAST_FUNCTION_TYPE).isEmptyType());
    assertFalse(numberVal.isEmptyType());

    assertTrue(numberVal.isNumberValueType());
    assertFalse(numberObj.isNumberValueType());
    assertTrue(numberObj.isNumberObjectType());
    assertFalse(numberVal.isNumberObjectType());
    assertTrue(numberVal.isNumber());
    assertTrue(numberObj.isNumber());
    assertFalse(stringVal.isNumber());

    assertTrue(stringVal.isStringValueType());
    assertFalse(stringObj.isStringValueType());
    assertTrue(stringObj.isStringObjectType());
    assertFalse(stringVal.isStringObjectType());
    assertTrue(stringVal.isString());
    assertTrue(stringObj.isString());
    assertFalse(numberVal.isString());

    assertTrue(booleanVal.isBooleanValueType());
    assertFalse(booleanObj.isBooleanValueType());
    assertTrue(booleanObj.isBooleanObjectType());
    assertFalse(booleanVal.isBooleanObjectType());

    assertTrue(dateObj.isDateType());
    assertFalse(numberVal.isDateType());

    assertTrue(regexpObj.isRegexpType());
    assertFalse(numberVal.isRegexpType());

    assertTrue(arrayObj.isArrayType());
    assertFalse(numberVal.isArrayType());

    assertTrue(nullVal.isNullType());
    assertFalse(voidVal.isNullType());

    assertTrue(voidVal.isVoidType());
    assertFalse(nullVal.isVoidType());

    assertTrue(allVal.isAllType());
    assertFalse(numberVal.isAllType());

    assertTrue(unknownVal.isUnknownType());
    assertFalse(numberVal.isUnknownType());

    assertTrue(checkedUnknown.isCheckedUnknownType());
    assertFalse(unknownVal.isCheckedUnknownType());

    assertTrue(globalThis.isGlobalThisType());
    assertFalse(numberVal.isGlobalThisType());

    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertTrue(objectType.isTheObjectType());
    assertFalse(numberVal.isTheObjectType());
  }

  @Test
  public void testFunctionPredicates() {
    FunctionType fnType = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertTrue(fnType.isFunctionType());
    assertNotNull(fnType.toMaybeFunctionType());
    assertNotNull(JSType.toMaybeFunctionType(fnType));
    assertNull(JSType.toMaybeFunctionType(null));
    assertNull(registry.getNativeType(JSTypeNative.NUMBER_TYPE).toMaybeFunctionType());

    ObjectType prototype = fnType.getPrototype();
    assertTrue(prototype.isFunctionPrototypeType());
    assertFalse(fnType.isFunctionPrototypeType());

    FunctionType ctor = registry.createConstructorType("CustomCtor", null, null, null);
    assertTrue(ctor.isConstructor());
    assertTrue(ctor.isNominalConstructor());
    assertFalse(ctor.isOrdinaryFunction());

    FunctionType nativeCtor = registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
    assertTrue(nativeCtor.isConstructor());
    assertTrue(nativeCtor.isNominalConstructor());

    FunctionType interfaceType = registry.createInterfaceType("CustomInterface", null);
    assertTrue(interfaceType.isInterface());
    assertTrue(interfaceType.isNominalConstructor());

    FunctionType structuralFn = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.VOID_TYPE));
    assertFalse(structuralFn.isNominalConstructor());

    FunctionType ordinaryFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertTrue(ordinaryFn.isOrdinaryFunction());
    assertFalse(ordinaryFn.isConstructor());

    ObjectType instanceType = ctor.getInstanceType();
    assertTrue(instanceType.isInstanceType());
    assertTrue(instanceType.isNominalType());
    assertFalse(instanceType.isConstructor());

    assertFalse(registry.getNativeType(JSTypeNative.NUMBER_TYPE).isNominalConstructor());
  }

  @Test
  public void testUnionAndEnumAndRecordAndTemplateType() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType unionType = registry.createUnionType(numType, strType);

    assertTrue(unionType.isUnionType());
    assertNotNull(unionType.toMaybeUnionType());
    assertNull(numType.toMaybeUnionType());

    EnumType enumType = registry.createEnumType("MyEnum", null, numType);
    assertTrue(enumType.isEnumType());
    assertNotNull(enumType.toMaybeEnumType());
    assertNull(numType.toMaybeEnumType());

    EnumElementType enumElemType = enumType.getElementsType();
    assertTrue(enumElemType.isEnumElementType());
    assertNotNull(enumElemType.toMaybeEnumElementType());
    assertNull(numType.toMaybeEnumElementType());

    RecordType recordType = registry.createRecordTypeBuilder().build();
    assertTrue(recordType.isRecordType());
    assertNotNull(recordType.toMaybeRecordType());
    assertNull(numType.toMaybeRecordType());

    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    ParameterizedType paramType = registry.createParameterizedType(arrayType, numType);
    assertTrue(paramType.isParameterizedType());
    assertNotNull(paramType.toMaybeParameterizedType());
    assertNotNull(JSType.toMaybeParameterizedType(paramType));
    assertNull(JSType.toMaybeParameterizedType(null));
    assertNull(numType.toMaybeParameterizedType());

    TemplateType templateType = registry.createTemplateType("T");
    assertTrue(templateType.isTemplateType());
    assertNotNull(templateType.toMaybeTemplateType());
    assertNotNull(JSType.toMaybeTemplateType(templateType));
    assertNull(JSType.toMaybeTemplateType(null));
    assertNull(numType.toMaybeTemplateType());

    assertTrue(templateType.hasAnyTemplate());
    assertFalse(numType.hasAnyTemplate());
  }

  @Test
  public void testNamedTypePredicate() {
    NamedType namedType = new NamedType(registry, "Foo", "source", 1, 1);
    assertTrue(namedType.isNamedType());
    assertFalse(registry.getNativeType(JSTypeNative.NUMBER_TYPE).isNamedType());
  }

  @Test
  public void testIsStruct_andIsDict() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertFalse(numType.isStruct());
    assertFalse(numType.isDict());

    FunctionType structCtor = registry.createConstructorType(
        "StructClass", null, null, null);
    structCtor.setStruct();
    ObjectType structInstance = structCtor.getInstanceType();
    assertTrue(structInstance.isStruct());
    assertFalse(structInstance.isDict());

    FunctionType dictCtor = registry.createConstructorType(
        "DictClass", null, null, null);
    dictCtor.setDict();
    ObjectType dictInstance = dictCtor.getInstanceType();
    assertTrue(dictInstance.isDict());
    assertFalse(dictInstance.isStruct());

    ObjectType plainObject = registry.createAnonymousObjectType();
    assertFalse(plainObject.isStruct());
    assertFalse(plainObject.isDict());
  }

  @Test
  public void testContextMatching() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType fnType = registry.createFunctionType(numType);

    assertTrue(numType.matchesNumberContext());
    assertTrue(numType.matchesInt32Context());
    assertTrue(numType.matchesUint32Context());
    assertFalse(strType.matchesNumberContext());

    assertTrue(strType.matchesStringContext());
    assertFalse(numType.matchesStringContext());

    assertTrue(objType.matchesObjectContext());
    assertFalse(numType.matchesObjectContext());

    assertTrue(fnType.canBeCalled());
    assertFalse(numType.canBeCalled());
  }

  @Test
  public void testAutoboxAndUnboxAndDereference() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType numObjType = registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE);
    JSType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    assertEquals(numObjType, numType.autoboxesTo());
    assertEquals(numType, numObjType.unboxesTo());
    assertNull(objType.autoboxesTo());
    assertNull(numType.unboxesTo());

    assertEquals(numObjType, numType.autobox());
    assertEquals(numObjType, numType.dereference());
    assertNull(numType.toObjectType());
    assertNotNull(numObjType.toObjectType());

    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    assertNull(nullType.dereference());

    assertNull(numType.findPropertyType("nonExistent"));
    assertNotNull(numType.findPropertyType("toString"));
    assertNull(registry.getNativeType(JSTypeNative.NULL_TYPE).findPropertyType("foo"));
  }

  @Test
  public void testCanAssignTo() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    assertTrue(numType.canAssignTo(allType));
    assertTrue(numType.canAssignTo(numType));
    assertFalse(numType.canAssignTo(strType));
  }

  @Test
  public void testEqualityAndDiffersFrom() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType checkedUnknown = registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE);

    assertTrue(numType.isEquivalentTo(numType));
    assertTrue(numType.isInvariant(numType));
    assertFalse(numType.isEquivalentTo(strType));
    assertFalse(numType.differsFrom(numType));
    assertTrue(numType.differsFrom(strType));
    assertTrue(JSType.isEquivalent(numType, numType));
    assertFalse(JSType.isEquivalent(numType, strType));
    assertTrue(JSType.isEquivalent(null, null));
    assertFalse(JSType.isEquivalent(numType, null));
    assertFalse(JSType.isEquivalent(null, numType));

    assertTrue(numType.equals((Object) numType));
    assertFalse(numType.equals((Object) strType));
    assertFalse(numType.equals("string_object"));

    assertNotEquals(0, numType.hashCode());

    assertTrue(unknownType.isInvariant(unknownType));
    assertTrue(checkedUnknown.isInvariant(checkedUnknown));

    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    ParameterizedType param1 = registry.createParameterizedType(arrayType, numType);
    ParameterizedType param2 = registry.createParameterizedType(arrayType, numType);
    ParameterizedType param3 = registry.createParameterizedType(arrayType, strType);
    assertTrue(param1.isEquivalentTo(param2));
    assertFalse(param1.isEquivalentTo(param3));
    assertFalse(param1.isEquivalentTo(arrayType));
    assertTrue(param1.differsFrom(param3));

    FunctionType fn1 = registry.createFunctionType(numType);
    FunctionType fn2 = registry.createFunctionType(numType);
    assertTrue(fn1.isEquivalentTo(fn2));

    RecordType rec1 = registry.createRecordTypeBuilder().addProperty("a", numType, null).build();
    RecordType rec2 = registry.createRecordTypeBuilder().addProperty("a", numType, null).build();
    assertTrue(rec1.isEquivalentTo(rec2));

    ProxyObjectType proxy1 = new ProxyObjectType(registry, numType);
    assertTrue(proxy1.isEquivalentTo(numType));
    assertTrue(numType.isEquivalentTo(proxy1));
  }

  @Test
  public void testTestForEqualityAndHelpers() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType fnType = registry.createFunctionType(numType);

    assertEquals(TernaryValue.UNKNOWN, numType.testForEquality(allType));
    assertEquals(TernaryValue.UNKNOWN, numType.testForEquality(unknownType));
    assertEquals(TernaryValue.UNKNOWN, numType.testForEquality(noResolvedType));
    assertEquals(TernaryValue.UNKNOWN, allType.testForEquality(numType));

    assertEquals(TernaryValue.TRUE, noType.testForEquality(noType));
    assertEquals(TernaryValue.UNKNOWN, noType.testForEquality(numType));

    assertEquals(TernaryValue.FALSE, fnType.testForEquality(nullType));
    assertEquals(TernaryValue.UNKNOWN, fnType.testForEquality(objType));
    assertEquals(TernaryValue.FALSE, nullType.testForEquality(fnType));

    EnumType enumType = registry.createEnumType("MyEnum", null, numType);
    EnumElementType enumElem = enumType.getElementsType();
    assertNotNull(numType.testForEquality(enumElem));

    JSType unionType = registry.createUnionType(numType, strType);
    assertNotNull(numType.testForEquality(unionType));

    assertTrue(numType.canTestForEqualityWith(unknownType));
    assertTrue(numType.canTestForShallowEqualityWith(numType));
    assertTrue(noType.canTestForShallowEqualityWith(numType));
    assertTrue(fnType.canTestForShallowEqualityWith(fnType));
  }

  @Test
  public void testIsNullableAndCollapseUnion() {
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType unionType = registry.createUnionType(nullType, numType);

    assertTrue(nullType.isNullable());
    assertFalse(numType.isNullable());
    assertTrue(unionType.isNullable());

    assertSame(numType, numType.collapseUnion());
  }

  @Test
  public void testGetLeastSupertypeAndGetGreatestSubtype() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    JSType unionType = registry.createUnionType(numType, strType);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);

    JSType sup1 = numType.getLeastSupertype(strType);
    assertTrue(sup1.isUnionType());
    assertSame(numType, numType.getLeastSupertype(numType));
    assertTrue(numType.getLeastSupertype(unionType).isUnionType());

    FunctionType fn1 = registry.createFunctionType(numType);
    FunctionType fn2 = registry.createFunctionType(strType);
    assertNotNull(fn1.getGreatestSubtype(fn2));
    assertSame(numType, numType.getGreatestSubtype(numType));
    assertEquals(unknownType, numType.getGreatestSubtype(unknownType));
    assertEquals(unknownType, unknownType.getGreatestSubtype(numType));

    JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    assertEquals(numType, numType.getGreatestSubtype(allType));
    assertEquals(numType, allType.getGreatestSubtype(numType));

    assertNotNull(unionType.getGreatestSubtype(numType));
    assertNotNull(numType.getGreatestSubtype(unionType));

    RecordType recType = registry.createRecordTypeBuilder().addProperty("a", numType, null).build();
    assertNotNull(recType.getGreatestSubtype(recType));
    assertNotNull(recType.getGreatestSubtype(objType));
    assertNotNull(objType.getGreatestSubtype(recType));

    EnumType enumType = registry.createEnumType("MyEnum", null, numType);
    EnumElementType enumElem = enumType.getElementsType();
    assertNotNull(enumElem.getGreatestSubtype(numType));
    assertNotNull(numType.getGreatestSubtype(enumElem));

    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    assertEquals(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE),
        arrayType.getGreatestSubtype(objType));
    assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE),
        numType.getGreatestSubtype(strType));

    assertSame(noResolvedType, JSType.filterNoResolvedType(noResolvedType));
    JSType unionWithNoResolved = registry.createUnionType(numType, noResolvedType);
    assertNotNull(JSType.filterNoResolvedType(unionWithNoResolved));
  }

  @Test
  public void testGetRestrictedTypeGivenToBooleanOutcome() {
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType checkedUnknown = registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE);
    assertEquals(checkedUnknown, unknownType.getRestrictedTypeGivenToBooleanOutcome(true));

    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertEquals(numType, numType.getRestrictedTypeGivenToBooleanOutcome(true));
    assertEquals(numType, numType.getRestrictedTypeGivenToBooleanOutcome(false));

    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    assertEquals(nullType, nullType.getRestrictedTypeGivenToBooleanOutcome(false));
    assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE),
        nullType.getRestrictedTypeGivenToBooleanOutcome(true));
  }

  @Test
  public void testGetTypesUnderEqualityAndInequality() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType unionType = registry.createUnionType(numType, strType);
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    FunctionType fnType = registry.createFunctionType(numType);

    JSType.TypePair pairEqUnion = numType.getTypesUnderEquality(unionType);
    assertNotNull(pairEqUnion);
    assertNotNull(pairEqUnion.typeA);
    assertNotNull(pairEqUnion.typeB);

    JSType.TypePair pairEqFnNull = fnType.getTypesUnderEquality(nullType);
    assertNull(pairEqFnNull.typeA);
    assertNull(pairEqFnNull.typeB);

    JSType.TypePair pairEqSame = numType.getTypesUnderEquality(numType);
    assertEquals(numType, pairEqSame.typeA);
    assertEquals(numType, pairEqSame.typeB);

    JSType.TypePair pairIneqUnion = numType.getTypesUnderInequality(unionType);
    assertNotNull(pairIneqUnion);

    JSType.TypePair pairIneqNoType = nullType.getTypesUnderInequality(nullType);
    assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), pairIneqNoType.typeA);

    JSType.TypePair pairIneqDiff = numType.getTypesUnderInequality(strType);
    assertEquals(numType, pairIneqDiff.typeA);
    assertEquals(strType, pairIneqDiff.typeB);

    JSType.TypePair shallowEq = numType.getTypesUnderShallowEquality(numType);
    assertEquals(numType, shallowEq.typeA);
    assertEquals(numType, shallowEq.typeB);

    JSType.TypePair shallowIneqUnion = numType.getTypesUnderShallowInequality(unionType);
    assertNotNull(shallowIneqUnion);

    JSType.TypePair shallowIneqNull = nullType.getTypesUnderShallowInequality(nullType);
    assertNull(shallowIneqNull.typeA);
    assertNull(shallowIneqNull.typeB);

    JSType.TypePair shallowIneqVoid = voidType.getTypesUnderShallowInequality(voidType);
    assertNull(shallowIneqVoid.typeA);
    assertNull(shallowIneqVoid.typeB);

    JSType.TypePair shallowIneqDiff = numType.getTypesUnderShallowInequality(strType);
    assertEquals(numType, shallowIneqDiff.typeA);
    assertEquals(strType, shallowIneqDiff.typeB);
  }

  @Test
  public void testRestrictByNotNullOrUndefined() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertSame(numType, numType.restrictByNotNullOrUndefined());

    JSType unionType = registry.createUnionType(
        numType, registry.getNativeType(JSTypeNative.NULL_TYPE));
    JSType restricted = unionType.restrictByNotNullOrUndefined();
    assertFalse(restricted.isNullable());
  }

  @Test
  public void testIsSubtypeAndSubtypeHelper() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    JSType unionType = registry.createUnionType(numType, registry.getNativeType(JSTypeNative.STRING_TYPE));

    assertTrue(numType.isSubtype(unknownType));
    assertTrue(numType.isSubtype(allType));
    assertTrue(numType.isSubtype(numType));
    assertTrue(noType.isSubtype(numType));
    assertTrue(numType.isSubtype(unionType));

    ProxyObjectType proxy = new ProxyObjectType(registry, numType);
    assertTrue(numType.isSubtype(proxy));
    assertFalse(registry.getNativeType(JSTypeNative.STRING_TYPE).isSubtype(numType));
  }

  @Test
  public void testResolveAndForceResolveAndClearResolved() {
    NamedType namedType = new NamedType(registry, "String", "source", 1, 1);
    assertFalse(namedType.isResolved());

    JSType resolved = namedType.resolve(null, null);
    assertTrue(namedType.isResolved());
    assertNotNull(resolved);

    // Call resolve again when already resolved
    assertSame(resolved, namedType.resolve(null, null));

    namedType.clearResolved();
    assertFalse(namedType.isResolved());

    JSType forceResolved = namedType.forceResolve(null, null);
    assertTrue(namedType.isResolved());
    assertNotNull(forceResolved);

    assertNull(JSType.safeResolve(null, null, null));
    assertNotNull(JSType.safeResolve(namedType, null, null));
  }

  @Test
  public void testSetValidator() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Predicate<JSType> alwaysTrue = Predicates.alwaysTrue();
    Predicate<JSType> alwaysFalse = Predicates.alwaysFalse();

    assertTrue(numType.setValidator(alwaysTrue));
    assertFalse(numType.setValidator(alwaysFalse));
  }

  @Test
  public void testToStringAndAnnotationStringAndDebugHashCode() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertEquals("number", numType.toString());
    assertEquals("number", numType.toAnnotationString());
    assertTrue(numType.toDebugHashCodeString().startsWith("{"));
    assertTrue(numType.toDebugHashCodeString().endsWith("}"));
  }

  @Test
  public void testComparatorAlpha() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    int cmp = JSType.ALPHA.compare(numType, strType);
    assertTrue(cmp < 0);
    int cmpEqual = JSType.ALPHA.compare(numType, numType);
    assertEquals(0, cmpEqual);
  }

  @Test
  public void testMatchConstraint() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    numType.matchConstraint(registry.getNativeType(JSTypeNative.ALL_TYPE));
  }
}
