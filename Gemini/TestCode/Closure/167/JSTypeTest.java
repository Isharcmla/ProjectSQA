package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import org.junit.Before;
import org.junit.Test;

public class JSTypeTest {

  private JSTypeRegistry registry;
  private SimpleErrorReporter errorReporter;

  private static class StubType extends JSType {
    private String name;
    private BooleanLiteralSet booleanOutcomes = BooleanLiteralSet.BOTH;
    private boolean isConstructorFlag = false;
    private boolean isInterfaceFlag = false;
    private FunctionType functionType = null;
    private JSType autoboxType = null;
    private boolean isObjectType = false;

    StubType(JSTypeRegistry registry) {
      super(registry);
    }

    StubType(JSTypeRegistry registry, String name) {
      super(registry);
      this.name = name;
    }

    @Override
    public String getDisplayName() {
      return name;
    }

    @Override
    public BooleanLiteralSet getPossibleToBooleanOutcomes() {
      return booleanOutcomes;
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
      return name == null ? "StubType" : name;
    }

    @Override
    public boolean isConstructor() {
      return isConstructorFlag;
    }

    @Override
    public boolean isInterface() {
      return isInterfaceFlag;
    }

    @Override
    public FunctionType toMaybeFunctionType() {
      return functionType;
    }

    @Override
    public JSType autoboxesTo() {
      return autoboxType;
    }

    @Override
    public boolean isObject() {
      return isObjectType;
    }

    @Override
    boolean hasAnyTemplateInternal() {
      return "templated".equals(name);
    }
  }

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
  }

  @Test
  public void testConstants() {
    assertEquals("Unknown class name", JSType.UNKNOWN_NAME);
    assertEquals("Not declared as a constructor", JSType.NOT_A_CLASS);
    assertEquals("Not declared as a type name", JSType.NOT_A_TYPE);
    assertEquals("Named type with empty name component", JSType.EMPTY_TYPE_COMPONENT);
    assertEquals(1, JSType.ENUMDECL);
    assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test
  public void testAlphaComparator() {
    StubType a = new StubType(registry, "A");
    StubType b = new StubType(registry, "B");
    assertTrue(JSType.ALPHA.compare(a, b) < 0);
    assertTrue(JSType.ALPHA.compare(b, a) > 0);
    assertEquals(0, JSType.ALPHA.compare(a, a));
  }

  @Test
  public void testGetNativeType() {
    StubType stub = new StubType(registry);
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        stub.getNativeType(JSTypeNative.NUMBER_TYPE));
  }

  @Test
  public void testJSDocInfoAndDisplayName() {
    StubType stub = new StubType(registry, null);
    assertNull(stub.getJSDocInfo());
    assertNull(stub.getDisplayName());
    assertFalse(stub.hasDisplayName());

    StubType emptyName = new StubType(registry, "");
    assertEquals("", emptyName.getDisplayName());
    assertFalse(emptyName.hasDisplayName());

    StubType named = new StubType(registry, "MyType");
    assertEquals("MyType", named.getDisplayName());
    assertTrue(named.hasDisplayName());
  }

  @Test
  public void testDefaultTypePredicates() {
    StubType stub = new StubType(registry);
    assertFalse(stub.isNoType());
    assertFalse(stub.isNoResolvedType());
    assertFalse(stub.isNoObjectType());
    assertFalse(stub.isEmptyType());
    assertFalse(stub.isNumberObjectType());
    assertFalse(stub.isNumberValueType());
    assertFalse(stub.isFunctionPrototypeType());
    assertFalse(stub.isStringObjectType());
    assertFalse(stub.isTheObjectType());
    assertFalse(stub.isStringValueType());
    assertFalse(stub.isArrayType());
    assertFalse(stub.isBooleanObjectType());
    assertFalse(stub.isBooleanValueType());
    assertFalse(stub.isRegexpType());
    assertFalse(stub.isDateType());
    assertFalse(stub.isNullType());
    assertFalse(stub.isVoidType());
    assertFalse(stub.isAllType());
    assertFalse(stub.isUnknownType());
    assertFalse(stub.isCheckedUnknownType());
    assertFalse(stub.isUnionType());
    assertNull(stub.toMaybeUnionType());
    assertFalse(stub.isGlobalThisType());
    assertFalse(stub.isFunctionType());
    assertNull(stub.toMaybeFunctionType());
    assertFalse(stub.isEnumElementType());
    assertNull(stub.toMaybeEnumElementType());
    assertFalse(stub.isEnumType());
    assertNull(stub.toMaybeEnumType());
    assertFalse(stub.isNamedType());
    assertFalse(stub.isRecordType());
    assertNull(stub.toMaybeRecordType());
    assertFalse(stub.isParameterizedType());
    assertNull(stub.toMaybeParameterizedType());
    assertFalse(stub.isTemplateType());
    assertNull(stub.toMaybeTemplateType());
    assertFalse(stub.isObject());
    assertFalse(stub.isConstructor());
    assertFalse(stub.isNominalType());
    assertFalse(stub.isInstanceType());
    assertFalse(stub.isInterface());
    assertFalse(stub.isOrdinaryFunction());
    assertFalse(stub.matchesNumberContext());
    assertFalse(stub.matchesStringContext());
    assertFalse(stub.matchesObjectContext());
    assertFalse(stub.canBeCalled());
    assertNull(stub.autoboxesTo());
    assertNull(stub.unboxesTo());
    assertNull(stub.toObjectType());
  }

  @Test
  public void testEmptyTypeChecks() {
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    JSType noObj = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    JSType noResolved = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    JSType leastFn = registry.getNativeType(JSTypeNative.LEAST_FUNCTION_TYPE);

    assertTrue(noType.isEmptyType());
    assertTrue(noObj.isEmptyType());
    assertTrue(noResolved.isEmptyType());
    assertTrue(leastFn.isEmptyType());
  }

  @Test
  public void testIsStringAndIsNumber() {
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

    assertTrue(stringType.isString());
    assertFalse(numberType.isString());
    assertTrue(numberType.isNumber());
    assertFalse(stringType.isNumber());
    assertFalse(booleanType.isString());
    assertFalse(booleanType.isNumber());
  }

  @Test
  public void testNullSafeDowncasts() {
    assertNull(JSType.toMaybeFunctionType(null));
    assertNull(JSType.toMaybeParameterizedType(null));
    assertNull(JSType.toMaybeTemplateType(null));

    FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertSame(fn, JSType.toMaybeFunctionType(fn));
  }

  @Test
  public void testGlobalThisType() {
    JSType globalThis = registry.getNativeType(JSTypeNative.GLOBAL_THIS);
    assertTrue(globalThis.isGlobalThisType());
    assertFalse(registry.getNativeType(JSTypeNative.OBJECT_TYPE).isGlobalThisType());
  }

  @Test
  public void testNominalConstructor() {
    StubType stub = new StubType(registry);
    assertFalse(stub.isNominalConstructor());

    stub.isConstructorFlag = true;
    assertFalse(stub.isNominalConstructor());

    FunctionType nativeFn = (FunctionType) registry.getNativeType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
    assertTrue(nativeFn.isNominalConstructor());

    stub.functionType = nativeFn;
    assertTrue(stub.isNominalConstructor());
  }

  @Test
  public void testEquivalenceAndEquals() {
    StubType stub1 = new StubType(registry, "A");
    StubType stub2 = new StubType(registry, "A");

    assertTrue(stub1.isEquivalentTo(stub1));
    assertFalse(stub1.isEquivalentTo(stub2));
    assertTrue(stub1.equals(stub1));
    assertFalse(stub1.equals(stub2));
    assertFalse(stub1.equals("NotAJSType"));
    assertFalse(stub1.equals(null));
    assertEquals(System.identityHashCode(stub1), stub1.hashCode());

    assertTrue(JSType.isEquivalent(null, null));
    assertFalse(JSType.isEquivalent(stub1, null));
    assertFalse(JSType.isEquivalent(null, stub1));
    assertTrue(JSType.isEquivalent(stub1, stub1));
    assertFalse(JSType.isEquivalent(stub1, stub2));
  }

  @Test
  public void testContextMatching() {
    StubType stub = new StubType(registry);
    assertFalse(stub.matchesInt32Context());
    assertFalse(stub.matchesUint32Context());
    assertFalse(stub.matchesNumberContext());

    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertTrue(num.matchesInt32Context());
    assertTrue(num.matchesUint32Context());
    assertTrue(num.matchesNumberContext());
  }

  @Test
  public void testFindPropertyType() {
    StubType stub = new StubType(registry);
    assertNull(stub.findPropertyType("foo"));

    JSType stringObj = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
    stub.autoboxType = stringObj;
    assertNotNull(stub.findPropertyType("length"));
    assertNull(stub.findPropertyType("nonExistentPropXYZ"));
  }

  @Test
  public void testCanAssignTo() {
    JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
    assertTrue(number.canAssignTo(all));
    assertFalse(all.canAssignTo(number));
  }

  @Test
  public void testAutoboxAndDereference() {
    StubType stub = new StubType(registry);
    assertSame(stub, stub.autobox());
    assertNull(stub.dereference());

    ObjectType strObj = (ObjectType) registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
    stub.autoboxType = strObj;
    assertSame(strObj, stub.autobox());
    assertSame(strObj, stub.dereference());
  }

  @Test
  public void testHasAnyTemplateRecursionProtection() {
    StubType stub = new StubType(registry, "templated");
    assertTrue(stub.hasAnyTemplate());

    StubType nonTemplated = new StubType(registry, "plain");
    assertFalse(nonTemplated.hasAnyTemplate());
  }

  @Test
  public void testEqualityTesting() {
    JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);

    assertEquals(TernaryValue.UNKNOWN, number.testForEquality(all));
    assertEquals(TernaryValue.UNKNOWN, all.testForEquality(number));
    assertEquals(TernaryValue.UNKNOWN, number.testForEquality(unknown));

    assertEquals(TernaryValue.TRUE, noType.testForEquality(noType));
    assertEquals(TernaryValue.UNKNOWN, noType.testForEquality(number));

    assertTrue(number.canTestForEqualityWith(str));

    FunctionType fn = registry.createFunctionType(number);
    assertEquals(TernaryValue.FALSE, fn.testForEquality(registry.getNativeType(JSTypeNative.NULL_TYPE)));
    assertEquals(TernaryValue.UNKNOWN, fn.testForEquality(registry.getNativeType(JSTypeNative.OBJECT_TYPE)));
  }

  @Test
  public void testCanTestForShallowEqualityWith() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);

    assertTrue(num.canTestForShallowEqualityWith(num));
    assertFalse(num.canTestForShallowEqualityWith(str));
    assertTrue(noType.canTestForShallowEqualityWith(num));
    assertTrue(num.canTestForShallowEqualityWith(noType));

    FunctionType fn1 = registry.createFunctionType(num);
    FunctionType fn2 = registry.createFunctionType(str);
    assertTrue(fn1.canTestForShallowEqualityWith(fn2));
  }

  @Test
  public void testIsNullableAndCollapseUnion() {
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertTrue(nullType.isNullable());
    assertFalse(num.isNullable());

    StubType stub = new StubType(registry);
    assertSame(stub, stub.collapseUnion());
  }

  @Test
  public void testLeastSupertype() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType union = registry.createUnionType(num, str);

    assertSame(num, num.getLeastSupertype(num));
    assertEquals(union, num.getLeastSupertype(str));
    assertEquals(union, num.getLeastSupertype(union));
  }

  @Test
  public void testGreatestSubtype() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    JSType noObj = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    JSType obj = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType dateObj = registry.getNativeType(JSTypeNative.DATE_TYPE);

    assertSame(num, num.getGreatestSubtype(num));
    assertSame(unknown, num.getGreatestSubtype(unknown));
    assertSame(unknown, unknown.getGreatestSubtype(num));
    assertSame(num, num.getGreatestSubtype(all));
    assertSame(num, all.getGreatestSubtype(num));
    assertSame(noType, num.getGreatestSubtype(registry.getNativeType(JSTypeNative.STRING_TYPE)));
    assertSame(dateObj, obj.getGreatestSubtype(dateObj));
    assertSame(noObj, dateObj.getGreatestSubtype(registry.getNativeType(JSTypeNative.REGEXP_TYPE)));

    FunctionType fn1 = registry.createFunctionType(num);
    FunctionType fn2 = registry.createFunctionType(num);
    assertNotNull(fn1.getGreatestSubtype(fn2));
  }

  @Test
  public void testFilterNoResolvedType() {
    JSType noResolved = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    assertSame(noResolved, JSType.filterNoResolvedType(noResolved));

    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertSame(num, JSType.filterNoResolvedType(num));

    JSType unionWithNoResolved = registry.createUnionType(num, noResolved);
    JSType filtered = JSType.filterNoResolvedType(unionWithNoResolved);
    assertSame(num, filtered);
  }

  @Test
  public void testGetRestrictedTypeGivenToBooleanOutcome() {
    StubType stub = new StubType(registry);
    stub.booleanOutcomes = BooleanLiteralSet.TRUE;
    assertSame(stub, stub.getRestrictedTypeGivenToBooleanOutcome(true));
    assertSame(registry.getNativeType(JSTypeNative.NO_TYPE),
        stub.getRestrictedTypeGivenToBooleanOutcome(false));
  }

  @Test
  public void testGetTypesUnderEqualityAndInequality() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    JSType union = registry.createUnionType(num, str);

    TypePair eqPair = num.getTypesUnderEquality(union);
    assertNotNull(eqPair.typeA);
    assertNotNull(eqPair.typeB);

    TypePair ineqPair = num.getTypesUnderInequality(union);
    assertNotNull(ineqPair.typeA);
    assertNotNull(ineqPair.typeB);

    TypePair shallowEq = num.getTypesUnderShallowEquality(str);
    assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), shallowEq.typeA);

    TypePair shallowIneqUnion = num.getTypesUnderShallowInequality(union);
    assertNotNull(shallowIneqUnion.typeA);

    TypePair nullIneq = nullType.getTypesUnderShallowInequality(nullType);
    assertNull(nullIneq.typeA);
    assertNull(nullIneq.typeB);

    TypePair voidIneq = voidType.getTypesUnderShallowInequality(voidType);
    assertNull(voidIneq.typeA);
    assertNull(voidIneq.typeB);

    TypePair diffIneq = num.getTypesUnderShallowInequality(str);
    assertSame(num, diffIneq.typeA);
    assertSame(str, diffIneq.typeB);
  }

  @Test
  public void testDiffersFrom() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

    assertFalse(num.differsFrom(num));
    assertTrue(num.differsFrom(str));
    assertTrue(num.differsFrom(unknown));
    assertTrue(unknown.differsFrom(num));
    assertFalse(unknown.differsFrom(unknown));
  }

  @Test
  public void testSubtypeHelperWithProxyAndUnion() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType union = registry.createUnionType(num, str);
    JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

    assertTrue(num.isSubtype(union));
    assertTrue(num.isSubtype(all));
    assertTrue(num.isSubtype(unknown));
    assertFalse(union.isSubtype(num));
  }

  @Test
  public void testResolutionLifecycle() {
    StubType stub = new StubType(registry);
    assertFalse(stub.isResolved());

    JSType resolved = stub.resolve(errorReporter, null);
    assertSame(stub, resolved);
    assertTrue(stub.isResolved());

    assertSame(stub, stub.resolve(errorReporter, null));

    stub.clearResolved();
    assertFalse(stub.isResolved());

    stub.setResolvedTypeInternal(null);
    assertTrue(stub.isResolved());
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE),
        stub.resolve(errorReporter, null));

    stub.clearResolved();
    JSType forced = stub.forceResolve(errorReporter, null);
    assertSame(stub, forced);

    assertNull(JSType.safeResolve(null, errorReporter, null));
    assertSame(stub, JSType.safeResolve(stub, errorReporter, null));
  }

  @Test
  public void testSetValidator() {
    StubType stub = new StubType(registry);
    Predicate<JSType> truePredicate = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return true;
      }
    };
    Predicate<JSType> falsePredicate = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return false;
      }
    };

    assertTrue(stub.setValidator(truePredicate));
    assertFalse(stub.setValidator(falsePredicate));
  }

  @Test
  public void testTypePairConstructor() {
    StubType a = new StubType(registry, "A");
    StubType b = new StubType(registry, "B");
    TypePair pair = new TypePair(a, b);
    assertSame(a, pair.typeA);
    assertSame(b, pair.typeB);
  }

  @Test
  public void testToStringAndAnnotation() {
    StubType stub = new StubType(registry, "CustomName");
    assertEquals("CustomName", stub.toString());
    assertEquals("CustomName", stub.toAnnotationString());
    assertEquals("{" + stub.hashCode() + "}", stub.toDebugHashCodeString());
  }

  @Test
  public void testMatchConstraintAndRestrictByNotNullOrUndefined() {
    StubType stub = new StubType(registry);
    stub.matchConstraint(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertSame(stub, stub.restrictByNotNullOrUndefined());
  }
}
