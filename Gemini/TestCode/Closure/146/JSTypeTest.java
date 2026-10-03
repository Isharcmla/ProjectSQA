package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Before;
import org.junit.Test;

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
  private ObjectType objectType;
  private ObjectType dateType;
  private ObjectType regexpType;
  private ObjectType arrayType;

  private static class DummyErrorReporter implements ErrorReporter {
    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {}

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {}
  }

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new DummyErrorReporter());
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    objectType = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    dateType = (ObjectType) registry.getNativeType(JSTypeNative.DATE_TYPE);
    regexpType = (ObjectType) registry.getNativeType(JSTypeNative.REGEXP_TYPE);
    arrayType = (ObjectType) registry.getNativeType(JSTypeNative.ARRAY_TYPE);
  }

  @Test
  public void testConstants() {
    assertEquals("Unknown class name", JSType.UNKNOWN_NAME);
    assertEquals("Not declared as a constructor", JSType.NOT_A_CLASS);
    assertEquals("Not declared as a type name", JSType.NOT_A_TYPE);
    assertEquals("Named type with empty name component", JSType.EMPTY_TYPE_COMPONENT);
    assertEquals(1, JSType.ENUMDECL);
    assertEquals(0, JSType.NOT_ENUMDECL);
    assertNotNull(JSType.ALPHA);
  }

  @Test
  public void testAlphaComparator() {
    assertTrue(JSType.ALPHA.compare(numberType, stringType) < 0 || JSType.ALPHA.compare(numberType, stringType) > 0);
    assertEquals(0, JSType.ALPHA.compare(numberType, numberType));
  }

  @Test
  public void testDefaultTypePredicates() {
    JSType customType = new JSType(registry) {
      @Override
      public BooleanLiteralSet getPossibleToBooleanOutcomes() {
        return BooleanLiteralSet.BOTH;
      }

      @Override
      public boolean isSubtype(JSType that) {
        return JSType.isSubtype(this, that);
      }

      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }

      @Override
      JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }
    };

    assertNull(customType.getJSDocInfo());
    customType.forgiveUnknownNames();

    assertFalse(customType.isNoType());
    assertFalse(customType.isNoObjectType());
    assertFalse(customType.isEmptyType());
    assertFalse(customType.isNumberObjectType());
    assertFalse(customType.isNumberValueType());
    assertFalse(customType.isFunctionPrototypeType());
    assertFalse(customType.isStringObjectType());
    assertFalse(customType.isTheObjectType());
    assertFalse(customType.isStringValueType());
    assertFalse(customType.isArrayType());
    assertFalse(customType.isBooleanObjectType());
    assertFalse(customType.isBooleanValueType());
    assertFalse(customType.isRegexpType());
    assertFalse(customType.isDateType());
    assertFalse(customType.isNullType());
    assertFalse(customType.isVoidType());
    assertFalse(customType.isAllType());
    assertFalse(customType.isUnknownType());
    assertFalse(customType.isCheckedUnknownType());
    assertFalse(customType.isUnionType());
    assertFalse(customType.isFunctionType());
    assertFalse(customType.isEnumElementType());
    assertFalse(customType.isEnumType());
    assertFalse(customType.isNamedType());
    assertFalse(customType.isRecordType());
    assertFalse(customType.isTemplateType());
    assertFalse(customType.isObject());
    assertFalse(customType.isConstructor());
    assertFalse(customType.isNominalType());
    assertFalse(customType.isInstanceType());
    assertFalse(customType.isInterface());
    assertFalse(customType.isOrdinaryFunction());
    assertFalse(customType.matchesNumberContext());
    assertFalse(customType.matchesStringContext());
    assertFalse(customType.matchesObjectContext());
    assertFalse(customType.matchesInt32Context());
    assertFalse(customType.matchesUint32Context());
    assertFalse(customType.canBeCalled());
    assertNull(customType.autoboxesTo());
    assertNull(customType.unboxesTo());
    assertNull(customType.toObjectType());
    assertNull(customType.findPropertyType("foo"));
    assertSame(customType, customType.restrictByNotNullOrUndefined());
  }

  @Test
  public void testNativeTypePredicates() {
    assertTrue(noType.isNoType());
    assertTrue(noType.isEmptyType());
    assertTrue(noObjectType.isNoObjectType());
    assertTrue(noObjectType.isEmptyType());

    assertTrue(numberType.isNumberValueType());
    assertTrue(numberType.isNumber());
    assertFalse(numberType.isNumberObjectType());

    assertTrue(stringType.isStringValueType());
    assertTrue(stringType.isString());
    assertFalse(stringType.isStringObjectType());

    assertTrue(booleanType.isBooleanValueType());
    assertFalse(booleanType.isBooleanObjectType());

    assertTrue(nullType.isNullType());
    assertTrue(nullType.isNullable());

    assertTrue(voidType.isVoidType());
    assertTrue(allType.isAllType());
    assertTrue(unknownType.isUnknownType());

    assertTrue(objectType.isObject());
    assertTrue(dateType.isDateType());
    assertTrue(regexpType.isRegexpType());
    assertTrue(arrayType.isArrayType());
  }

  @Test
  public void testIsEquivalent() {
    assertTrue(JSType.isEquivalent(null, null));
    assertFalse(JSType.isEquivalent(numberType, null));
    assertFalse(JSType.isEquivalent(null, numberType));
    assertTrue(JSType.isEquivalent(numberType, numberType));
    assertFalse(JSType.isEquivalent(numberType, stringType));
  }

  @Test
  public void testEqualsAndHashCode() {
    assertTrue(numberType.equals(numberType));
    assertFalse(numberType.equals(stringType));
    assertFalse(numberType.equals(null));
    assertFalse(numberType.equals("string"));
    assertEquals(numberType.hashCode(), numberType.hashCode());
    assertNotNull(numberType.toDebugHashCodeString());
    assertTrue(numberType.toDebugHashCodeString().startsWith("{"));
    assertTrue(numberType.toDebugHashCodeString().endsWith("}"));
  }

  @Test
  public void testProxyObjectTypeEquivalence() {
    ProxyObjectType proxy = new ProxyObjectType(registry, numberType);
    assertTrue(numberType.isEquivalentTo(proxy));
    assertTrue(proxy.isEquivalentTo(numberType));
    assertTrue(numberType.equals(proxy));
  }

  @Test
  public void testDereferenceAndAutoboxing() {
    ObjectType derefNumber = numberType.dereference();
    assertNotNull(derefNumber);
    assertTrue(derefNumber.isObject());

    ObjectType derefObj = objectType.dereference();
    assertSame(objectType, derefObj);

    assertNull(nullType.dereference());
    assertNull(voidType.dereference());
  }

  @Test
  public void testFindPropertyType() {
    assertNotNull(numberType.findPropertyType("toString"));
    assertNull(numberType.findPropertyType("nonExistentProperty123456"));
    assertNull(nullType.findPropertyType("toString"));
  }

  @Test
  public void testCanAssignTo() {
    assertTrue(numberType.canAssignTo(numberType));
    assertTrue(numberType.canAssignTo(allType));
    assertFalse(numberType.canAssignTo(stringType));
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
  public void testEqualityComparisons() {
    assertTrue(numberType.canTestForEqualityWith(numberType));
    assertTrue(numberType.canTestForEqualityWith(unknownType));
    assertTrue(numberType.canTestForEqualityWith(allType));
    assertTrue(numberType.canTestForEqualityWith(noType));

    assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(allType));
    assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(noType));
    assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(unknownType));

    JSType union = registry.createUnionType(numberType, stringType);
    assertNotNull(union.testForEquality(numberType));

    assertTrue(numberType.canTestForShallowEqualityWith(numberType));
    assertTrue(numberType.canTestForShallowEqualityWith(allType));
    assertFalse(numberType.canTestForShallowEqualityWith(stringType));
  }

  @Test
  public void testLeastSupertype() {
    JSType union = numberType.getLeastSupertype(stringType);
    assertTrue(union.isUnionType());

    assertSame(allType, numberType.getLeastSupertype(allType));
    assertSame(allType, allType.getLeastSupertype(numberType));
    assertSame(numberType, numberType.getLeastSupertype(noType));
    assertSame(numberType, noType.getLeastSupertype(numberType));

    JSType union2 = union.getLeastSupertype(booleanType);
    assertTrue(union2.isUnionType());
    assertSame(union2, booleanType.getLeastSupertype(union));
  }

  @Test
  public void testGreatestSubtype() {
    assertSame(numberType, numberType.getGreatestSubtype(numberType));
    assertSame(numberType, numberType.getGreatestSubtype(allType));
    assertSame(numberType, allType.getGreatestSubtype(numberType));
    assertSame(noType, numberType.getGreatestSubtype(noType));
    assertSame(noType, noType.getGreatestSubtype(numberType));

    assertSame(unknownType, numberType.getGreatestSubtype(unknownType));
    assertSame(unknownType, unknownType.getGreatestSubtype(numberType));
    assertSame(unknownType, unknownType.getGreatestSubtype(unknownType));

    assertSame(noType, numberType.getGreatestSubtype(stringType));

    EnumType enumType = registry.createEnumType("MyEnum", null, numberType);
    EnumElementType enumElem = enumType.getElementsType();
    assertSame(enumElem, enumElem.getGreatestSubtype(numberType));
    assertSame(enumElem, numberType.getGreatestSubtype(enumElem));

    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("prop", numberType, null);
    RecordType recordType = (RecordType) builder.build();
    assertNotNull(recordType.getGreatestSubtype(objectType));
    assertNotNull(objectType.getGreatestSubtype(recordType));

    JSType union = registry.createUnionType(numberType, stringType);
    assertSame(numberType, union.getGreatestSubtype(numberType));
    assertSame(numberType, numberType.getGreatestSubtype(union));

    assertSame(noObjectType, objectType.getGreatestSubtype(dateType));
  }

  @Test
  public void testGetRestrictedTypeGivenToBooleanOutcome() {
    JSType restrictedTrue = objectType.getRestrictedTypeGivenToBooleanOutcome(true);
    assertSame(objectType, restrictedTrue);

    JSType restrictedFalse = objectType.getRestrictedTypeGivenToBooleanOutcome(false);
    assertSame(noType, restrictedFalse);

    JSType nullRestrictedTrue = nullType.getRestrictedTypeGivenToBooleanOutcome(true);
    assertSame(noType, nullRestrictedTrue);

    JSType nullRestrictedFalse = nullType.getRestrictedTypeGivenToBooleanOutcome(false);
    assertSame(nullType, nullRestrictedFalse);
  }

  @Test
  public void testTypesUnderEqualityAndInequality() {
    TypePair eqPair = nullType.getTypesUnderEquality(voidType);
    assertEquals(nullType, eqPair.typeA);
    assertEquals(voidType, eqPair.typeB);

    TypePair ineqPair = nullType.getTypesUnderInequality(voidType);
    assertNull(ineqPair.typeA);
    assertNull(ineqPair.typeB);

    TypePair numStrEq = numberType.getTypesUnderEquality(stringType);
    assertNull(numStrEq.typeA);
    assertNull(numStrEq.typeB);

    TypePair numStrIneq = numberType.getTypesUnderInequality(stringType);
    assertEquals(numberType, numStrIneq.typeA);
    assertEquals(stringType, numStrIneq.typeB);

    JSType union = registry.createUnionType(nullType, numberType);
    TypePair unionEq = union.getTypesUnderEquality(voidType);
    assertNotNull(unionEq);
    TypePair unionEqRev = voidType.getTypesUnderEquality(union);
    assertNotNull(unionEqRev);

    TypePair unionIneq = union.getTypesUnderInequality(voidType);
    assertNotNull(unionIneq);
    TypePair unionIneqRev = voidType.getTypesUnderInequality(union);
    assertNotNull(unionIneqRev);
  }

  @Test
  public void testTypesUnderShallowEqualityAndInequality() {
    TypePair shallowEq = numberType.getTypesUnderShallowEquality(numberType);
    assertEquals(numberType, shallowEq.typeA);
    assertEquals(numberType, shallowEq.typeB);

    TypePair shallowIneqNullNull = nullType.getTypesUnderShallowInequality(nullType);
    assertNull(shallowIneqNullNull.typeA);
    assertNull(shallowIneqNullNull.typeB);

    TypePair shallowIneqVoidVoid = voidType.getTypesUnderShallowInequality(voidType);
    assertNull(shallowIneqVoidVoid.typeA);
    assertNull(shallowIneqVoidVoid.typeB);

    TypePair shallowIneqNumStr = numberType.getTypesUnderShallowInequality(stringType);
    assertEquals(numberType, shallowIneqNumStr.typeA);
    assertEquals(stringType, shallowIneqNumStr.typeB);

    JSType union = registry.createUnionType(nullType, voidType);
    TypePair unionIneq = union.getTypesUnderShallowInequality(nullType);
    assertNotNull(unionIneq);
    TypePair unionIneqRev = nullType.getTypesUnderShallowInequality(union);
    assertNotNull(unionIneqRev);
  }

  @Test
  public void testStaticIsSubtypeHelper() {
    assertTrue(JSType.isSubtype(numberType, unknownType));
    assertTrue(JSType.isSubtype(numberType, numberType));
    assertTrue(JSType.isSubtype(numberType, allType));

    JSType union = registry.createUnionType(numberType, stringType);
    assertTrue(JSType.isSubtype(numberType, union));
    assertFalse(JSType.isSubtype(booleanType, union));

    NamedType namedType = new NamedType(registry, "Foo", "foo.js", 1, 1);
    namedType.setReferencedTypeForTesting(numberType);
    assertTrue(JSType.isSubtype(numberType, namedType));
    assertFalse(JSType.isSubtype(booleanType, namedType));
  }

  @Test
  public void testResolution() {
    ErrorReporter reporter = new DummyErrorReporter();
    StaticScope<JSType> scope = null;

    assertNull(JSType.safeResolve(null, reporter, scope));

    assertFalse(numberType.isResolved());
    JSType resolved = numberType.resolve(reporter, scope);
    assertTrue(numberType.isResolved());
    assertSame(numberType, resolved);

    JSType reResolved = numberType.resolve(reporter, scope);
    assertSame(resolved, reResolved);

    numberType.clearResolved();
    assertFalse(numberType.isResolved());

    JSType forceResolved = numberType.forceResolve(reporter, scope);
    assertTrue(numberType.isResolved());
    assertSame(numberType, forceResolved);

    JSType safeResolved = JSType.safeResolve(numberType, reporter, scope);
    assertSame(numberType, safeResolved);
  }

  @Test
  public void testResolveLoopBackFallback() {
    JSType loopType = new JSType(registry) {
      @Override
      public BooleanLiteralSet getPossibleToBooleanOutcomes() {
        return BooleanLiteralSet.BOTH;
      }

      @Override
      public boolean isSubtype(JSType that) {
        return false;
      }

      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }

      @Override
      JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }
    };

    loopType.setResolvedTypeInternal(null);
    assertTrue(loopType.isResolved());
    JSType fallback = loopType.resolve(new DummyErrorReporter(), null);
    assertSame(unknownType, fallback);
  }

  @Test
  public void testVisitorPattern() {
    Visitor<String> visitor = new Visitor<String>() {
      @Override
      public String caseNoType() {
        return "NoType";
      }

      @Override
      public String caseEnumElementType(EnumElementType type) {
        return "EnumElementType";
      }

      @Override
      public String caseAllType() {
        return "AllType";
      }

      @Override
      public String caseBooleanType() {
        return "BooleanType";
      }

      @Override
      public String caseNoObjectType() {
        return "NoObjectType";
      }

      @Override
      public String caseFunctionType(FunctionType type) {
        return "FunctionType";
      }

      @Override
      public String caseObjectType(ObjectType type) {
        return "ObjectType";
      }

      @Override
      public String caseUnknownType() {
        return "UnknownType";
      }

      @Override
      public String caseNullType() {
        return "NullType";
      }

      @Override
      public String caseNamedType(NamedType type) {
        return "NamedType";
      }

      @Override
      public String caseNumberType() {
        return "NumberType";
      }

      @Override
      public String caseStringType() {
        return "StringType";
      }

      @Override
      public String caseVoidType() {
        return "VoidType";
      }

      @Override
      public String caseUnionType(UnionType type) {
        return "UnionType";
      }

      @Override
      public String caseRecordType(RecordType type) {
        return "RecordType";
      }

      @Override
      public String caseTemplateType(TemplateType templateType) {
        return "TemplateType";
      }
    };

    assertEquals("NumberType", numberType.visit(visitor));
    assertEquals("StringType", stringType.visit(visitor));
    assertEquals("BooleanType", booleanType.visit(visitor));
    assertEquals("NullType", nullType.visit(visitor));
    assertEquals("VoidType", voidType.visit(visitor));
    assertEquals("AllType", allType.visit(visitor));
    assertEquals("UnknownType", unknownType.visit(visitor));
    assertEquals("NoType", noType.visit(visitor));
    assertEquals("NoObjectType", noObjectType.visit(visitor));
    assertEquals("ObjectType", objectType.visit(visitor));
  }
}
