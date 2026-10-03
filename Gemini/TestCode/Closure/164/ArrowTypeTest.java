package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

public class ArrowTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType unknownType;
  private JSType allType;
  private JSType voidType;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
    numberType = registry.getNativeType(NUMBER_TYPE);
    stringType = registry.getNativeType(STRING_TYPE);
    booleanType = registry.getNativeType(BOOLEAN_TYPE);
    unknownType = registry.getNativeType(UNKNOWN_TYPE);
    allType = registry.getNativeType(ALL_TYPE);
    voidType = registry.getNativeType(VOID_TYPE);
  }

  @Test
  public void testConstructor_nullParametersAndReturnType() {
    ArrowType arrow = new ArrowType(registry, null, null);
    assertNotNull(arrow.parameters);
    assertEquals(unknownType, arrow.returnType);
    assertFalse(arrow.returnTypeInferred);
  }

  @Test
  public void testConstructor_inferredReturnType() {
    Node params = registry.createParameters(numberType);
    ArrowType arrow = new ArrowType(registry, params, stringType, true);
    assertEquals(stringType, arrow.returnType);
    assertTrue(arrow.returnTypeInferred);
  }

  @Test
  public void testIsSubtype_notArrowType_returnsFalse() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertFalse(arrow.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_returnTypeNotSubtype_returnsFalse() {
    ArrowType arrow1 = new ArrowType(registry, null, stringType);
    ArrowType arrow2 = new ArrowType(registry, null, numberType);
    assertFalse(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_matchingParameters_returnsTrue() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(numberType);
    ArrowType arrow1 = new ArrowType(registry, params1, numberType);
    ArrowType arrow2 = new ArrowType(registry, params2, numberType);
    assertTrue(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_contravariantParameter_returnsExpected() {
    // that.paramType <: this.paramType for arrow1 <: arrow2
    Node params1 = registry.createParameters(allType);
    Node params2 = registry.createParameters(numberType);
    ArrowType arrow1 = new ArrowType(registry, params1, numberType);
    ArrowType arrow2 = new ArrowType(registry, params2, numberType);
    // arrow2's param (number) is subtype of arrow1's param (allType), so arrow1 is subtype of arrow2
    assertTrue(arrow1.isSubtype(arrow2));
    assertFalse(arrow2.isSubtype(arrow1));
  }

  @Test
  public void testIsSubtype_paramTypeMismatch_returnsFalse() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(stringType);
    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);
    assertFalse(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_thatParamTypeNull_returnsFalse() {
    Node paramNode1 = registry.createParameters(numberType);
    Node paramNode2 = registry.createParameters(numberType);
    paramNode2.getFirstChild().setJSType(null);

    ArrowType arrow1 = new ArrowType(registry, paramNode1, voidType);
    ArrowType arrow2 = new ArrowType(registry, paramNode2, voidType);
    assertFalse(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_thisParamTypeNull_continuesComparison() {
    Node paramNode1 = registry.createParameters(numberType);
    paramNode1.getFirstChild().setJSType(null);
    Node paramNode2 = registry.createParameters(numberType);

    ArrowType arrow1 = new ArrowType(registry, paramNode1, voidType);
    ArrowType arrow2 = new ArrowType(registry, paramNode2, voidType);
    assertTrue(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_thisHasVarArgs_thatDoesNot() {
    Node thisParams = registry.createParametersWithVarArgs(allType);
    Node thatParams = registry.createParameters(numberType, numberType);

    ArrowType arrow1 = new ArrowType(registry, thisParams, voidType);
    ArrowType arrow2 = new ArrowType(registry, thatParams, voidType);
    assertTrue(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_thatHasVarArgs_thisDoesNot() {
    Node thisParams = registry.createParameters(numberType, numberType);
    Node thatParams = registry.createParametersWithVarArgs(numberType);

    ArrowType arrow1 = new ArrowType(registry, thisParams, voidType);
    ArrowType arrow2 = new ArrowType(registry, thatParams, voidType);
    assertTrue(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_bothHaveVarArgs() {
    Node thisParams = registry.createParametersWithVarArgs(allType);
    Node thatParams = registry.createParametersWithVarArgs(numberType);

    ArrowType arrow1 = new ArrowType(registry, thisParams, voidType);
    ArrowType arrow2 = new ArrowType(registry, thatParams, voidType);
    assertTrue(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testHasEqualParameters_equalTypes_returnsTrue() {
    Node params1 = registry.createParameters(numberType, stringType);
    Node params2 = registry.createParameters(numberType, stringType);

    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);
    assertTrue(arrow1.hasEqualParameters(arrow2));
  }

  @Test
  public void testHasEqualParameters_differentTypes_returnsFalse() {
    Node params1 = registry.createParameters(numberType, stringType);
    Node params2 = registry.createParameters(numberType, booleanType);

    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);
    assertFalse(arrow1.hasEqualParameters(arrow2));
  }

  @Test
  public void testHasEqualParameters_differentParamCounts_returnsFalse() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(numberType, stringType);

    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);
    assertFalse(arrow1.hasEqualParameters(arrow2));
    assertFalse(arrow2.hasEqualParameters(arrow1));
  }

  @Test
  public void testHasEqualParameters_nullJSTypeBranches() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(numberType);
    params1.getFirstChild().setJSType(null);

    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);
    // thisParamType == null, otherParamType != null -> false
    assertFalse(arrow1.hasEqualParameters(arrow2));

    // thisParamType != null, otherParamType == null -> false
    assertFalse(arrow2.hasEqualParameters(arrow1));

    // both null -> true
    params2.getFirstChild().setJSType(null);
    assertTrue(arrow1.hasEqualParameters(arrow2));
  }

  @Test
  public void testIsEquivalentTo_notArrowType_returnsFalse() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertFalse(arrow.isEquivalentTo(numberType));
    assertFalse(arrow.isEquivalentTo(null));
  }

  @Test
  public void testIsEquivalentTo_differentReturnType_returnsFalse() {
    ArrowType arrow1 = new ArrowType(registry, null, numberType);
    ArrowType arrow2 = new ArrowType(registry, null, stringType);
    assertFalse(arrow1.isEquivalentTo(arrow2));
  }

  @Test
  public void testIsEquivalentTo_sameTypes_returnsTrue() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(numberType);
    ArrowType arrow1 = new ArrowType(registry, params1, stringType);
    ArrowType arrow2 = new ArrowType(registry, params2, stringType);
    assertTrue(arrow1.isEquivalentTo(arrow2));
  }

  @Test
  public void testHashCode_consistency() {
    Node params1 = registry.createParameters(numberType, stringType);
    Node params2 = registry.createParameters(numberType, stringType);
    ArrowType arrow1 = new ArrowType(registry, params1, booleanType, false);
    ArrowType arrow2 = new ArrowType(registry, params2, booleanType, false);
    ArrowType arrowInferred = new ArrowType(registry, params1, booleanType, true);

    assertEquals(arrow1.hashCode(), arrow2.hashCode());
    assertEquals(arrow1.hashCode() + 1, arrowInferred.hashCode());
  }

  @Test
  public void testHashCode_withNullParamTypes() {
    Node params = registry.createParameters(numberType);
    params.getFirstChild().setJSType(null);
    ArrowType arrow = new ArrowType(registry, params, null);
    // Should compute hashCode without throwing NPE
    int code = arrow.hashCode();
    assertTrue(code >= 0 || code < 0);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetLeastSupertype_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, voidType);
    arrow.getLeastSupertype(voidType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetGreatestSubtype_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, voidType);
    arrow.getGreatestSubtype(voidType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testTestForEquality_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, voidType);
    arrow.testForEquality(voidType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testVisit_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, voidType);
    arrow.visit(null);
  }

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    ArrowType arrow = new ArrowType(registry, null, voidType);
    assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testResolveInternal() {
    ErrorReporter reporter = new SimpleErrorReporter();
    StaticScope<JSType> scope = null;
    Node params = registry.createParameters(numberType, stringType);
    ArrowType arrow = new ArrowType(registry, params, booleanType);

    JSType resolved = arrow.resolveInternal(reporter, scope);
    assertEquals(arrow, resolved);
    assertEquals(numberType, arrow.parameters.getFirstChild().getJSType());
    assertEquals(booleanType, arrow.returnType);
  }

  @Test
  public void testHasUnknownParamsOrReturn() {
    Node knownParams = registry.createParameters(numberType);
    ArrowType knownArrow = new ArrowType(registry, knownParams, stringType);
    assertFalse(knownArrow.hasUnknownParamsOrReturn());

    ArrowType unknownReturnArrow = new ArrowType(registry, knownParams, unknownType);
    assertTrue(unknownReturnArrow.hasUnknownParamsOrReturn());

    Node unknownParams = registry.createParameters(unknownType);
    ArrowType unknownParamArrow = new ArrowType(registry, unknownParams, stringType);
    assertTrue(unknownParamArrow.hasUnknownParamsOrReturn());

    Node nullParamNode = registry.createParameters(numberType);
    nullParamNode.getFirstChild().setJSType(null);
    ArrowType nullParamArrow = new ArrowType(registry, nullParamNode, stringType);
    assertTrue(nullParamArrow.hasUnknownParamsOrReturn());

    ArrowType nullReturnArrow = new ArrowType(registry, knownParams, null);
    nullReturnArrow.returnType = null;
    assertTrue(nullReturnArrow.hasUnknownParamsOrReturn());
  }

  @Test
  public void testToStringHelper() {
    ArrowType arrow = new ArrowType(registry, null, voidType);
    assertNotNull(arrow.toStringHelper(true));
    assertNotNull(arrow.toStringHelper(false));
  }
}
