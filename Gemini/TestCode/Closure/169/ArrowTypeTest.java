package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
  private JSType noType;
  private JSType voidType;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
    numberType = registry.getNativeType(NUMBER_TYPE);
    stringType = registry.getNativeType(STRING_TYPE);
    booleanType = registry.getNativeType(BOOLEAN_TYPE);
    unknownType = registry.getNativeType(UNKNOWN_TYPE);
    allType = registry.getNativeType(ALL_TYPE);
    noType = registry.getNativeType(NO_TYPE);
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
  public void testConstructor_withParametersAndReturnTypeInferred() {
    Node params = registry.createParameters(numberType, stringType);
    ArrowType arrow = new ArrowType(registry, params, booleanType, true);
    assertEquals(params, arrow.parameters);
    assertEquals(booleanType, arrow.returnType);
    assertTrue(arrow.returnTypeInferred);
  }

  @Test
  public void testIsSubtype_notArrowType_returnsFalse() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertFalse(arrow.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_differentReturnType_returnsFalse() {
    ArrowType arrow1 = new ArrowType(registry, null, numberType);
    ArrowType arrow2 = new ArrowType(registry, null, stringType);
    assertFalse(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_contravariantParameters_success() {
    // sub param type must be supertype of super param type: thatParam <: thisParam
    Node params1 = registry.createParameters(allType); // supertype param
    Node params2 = registry.createParameters(numberType); // subtype param
    ArrowType arrow1 = new ArrowType(registry, params1, numberType);
    ArrowType arrow2 = new ArrowType(registry, params2, numberType);

    assertTrue(arrow1.isSubtype(arrow2));
    assertFalse(arrow2.isSubtype(arrow1));
  }

  @Test
  public void testIsSubtype_parameterTypeIncompatible_returnsFalse() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(stringType);
    ArrowType arrow1 = new ArrowType(registry, params1, numberType);
    ArrowType arrow2 = new ArrowType(registry, params2, numberType);

    assertFalse(arrow1.isSubtype(arrow2));
  }

  @Test
  public void testIsSubtype_paramWithoutJSType_handledGracefully() {
    Node paramNode = Node.newString(1, "a");
    paramNode.setJSType(null);
    Node paramList = new Node(1, paramNode);

    ArrowType arrowNoParamType = new ArrowType(registry, paramList, numberType);
    ArrowType arrowWithParamType = new ArrowType(
        registry, registry.createParameters(numberType), numberType);

    assertFalse(arrowWithParamType.isSubtype(arrowNoParamType));
    assertTrue(arrowNoParamType.isSubtype(arrowWithParamType));
  }

  @Test
  public void testIsSubtype_optionalAndVarArgs_topFunction() {
    Node requiredParam = registry.createParameters(numberType);
    Node varArgsUnknown = registry.createParametersWithVarArgs(unknownType);
    Node varArgsNoType = registry.createParametersWithVarArgs(noType);

    ArrowType requiredArrow = new ArrowType(registry, requiredParam, numberType);
    ArrowType topArrowUnknown = new ArrowType(registry, varArgsUnknown, numberType);
    ArrowType topArrowNoType = new ArrowType(registry, varArgsNoType, numberType);

    assertTrue(requiredArrow.isSubtype(topArrowUnknown));
    assertTrue(requiredArrow.isSubtype(topArrowNoType));
  }

  @Test
  public void testIsSubtype_optionalAndVarArgs_notTopFunction() {
    Node requiredParam = registry.createParameters(numberType);
    Node optionalParam = registry.createOptionalParameters(numberType);

    ArrowType requiredArrow = new ArrowType(registry, requiredParam, numberType);
    ArrowType optionalArrow = new ArrowType(registry, optionalParam, numberType);

    assertFalse(requiredArrow.isSubtype(optionalArrow));
  }

  @Test
  public void testIsSubtype_varArgsAdvancement() {
    Node thisVarArgs = registry.createParametersWithVarArgs(allType);
    Node thatTwoParams = registry.createParameters(numberType, stringType);

    ArrowType thisArrow = new ArrowType(registry, thisVarArgs, numberType);
    ArrowType thatArrow = new ArrowType(registry, thatTwoParams, numberType);

    assertTrue(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_thatVarArgsAdvancement() {
    Node thisTwoParams = registry.createParameters(allType, allType);
    Node thatVarArgs = registry.createParametersWithVarArgs(numberType);

    ArrowType thisArrow = new ArrowType(registry, thisTwoParams, numberType);
    ArrowType thatArrow = new ArrowType(registry, thatVarArgs, numberType);

    assertTrue(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_bothVarArgs() {
    Node thisVarArgs = registry.createParametersWithVarArgs(allType);
    Node thatVarArgs = registry.createParametersWithVarArgs(numberType);

    ArrowType thisArrow = new ArrowType(registry, thisVarArgs, numberType);
    ArrowType thatArrow = new ArrowType(registry, thatVarArgs, numberType);

    assertTrue(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_extraRequiredParamInThis_returnsFalse() {
    Node twoRequired = registry.createParameters(numberType, numberType);
    Node oneRequired = registry.createParameters(numberType);

    ArrowType arrowTwo = new ArrowType(registry, twoRequired, numberType);
    ArrowType arrowOne = new ArrowType(registry, oneRequired, numberType);

    assertFalse(arrowTwo.isSubtype(arrowOne));
    assertTrue(arrowOne.isSubtype(arrowTwo));
  }

  @Test
  public void testIsSubtype_extraOptionalParamInThis_returnsTrue() {
    Node oneReqOneOpt = registry.createParameters(numberType);
    Node optParam = Node.newString(1, "opt");
    optParam.setJSType(numberType);
    optParam.putBooleanProp(Node.OPT_ARG_NAME, true);
    oneReqOneOpt.addChildToBack(optParam);

    Node oneReq = registry.createParameters(numberType);

    ArrowType arrowOpt = new ArrowType(registry, oneReqOneOpt, numberType);
    ArrowType arrowReq = new ArrowType(registry, oneReq, numberType);

    assertTrue(arrowOpt.isSubtype(arrowReq));
  }

  @Test
  public void testHasEqualParameters_matchingTypes() {
    Node params1 = registry.createParameters(numberType, stringType);
    Node params2 = registry.createParameters(numberType, stringType);

    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);

    assertTrue(arrow1.hasEqualParameters(arrow2, false));
    assertTrue(arrow1.hasEqualParameters(arrow2, true));
  }

  @Test
  public void testHasEqualParameters_differentLength() {
    Node params1 = registry.createParameters(numberType, stringType);
    Node params2 = registry.createParameters(numberType);

    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);

    assertFalse(arrow1.hasEqualParameters(arrow2, false));
    assertFalse(arrow2.hasEqualParameters(arrow1, false));
  }

  @Test
  public void testHasEqualParameters_differentTypes() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(stringType);

    ArrowType arrow1 = new ArrowType(registry, params1, voidType);
    ArrowType arrow2 = new ArrowType(registry, params2, voidType);

    assertFalse(arrow1.hasEqualParameters(arrow2, false));
  }

  @Test
  public void testHasEqualParameters_nullParamTypes() {
    Node p1 = Node.newString(1, "p1");
    p1.setJSType(null);
    Node list1 = new Node(1, p1);

    Node p2 = Node.newString(1, "p2");
    p2.setJSType(null);
    Node list2 = new Node(1, p2);

    Node p3 = Node.newString(1, "p3");
    p3.setJSType(numberType);
    Node list3 = new Node(1, p3);

    ArrowType arrow1 = new ArrowType(registry, list1, voidType);
    ArrowType arrow2 = new ArrowType(registry, list2, voidType);
    ArrowType arrow3 = new ArrowType(registry, list3, voidType);

    assertTrue(arrow1.hasEqualParameters(arrow2, false));
    assertFalse(arrow1.hasEqualParameters(arrow3, false));
    assertFalse(arrow3.hasEqualParameters(arrow1, false));
  }

  @Test
  public void testCheckArrowEquivalenceHelper() {
    Node params1 = registry.createParameters(numberType);
    Node params2 = registry.createParameters(numberType);

    ArrowType arrow1 = new ArrowType(registry, params1, stringType);
    ArrowType arrow2 = new ArrowType(registry, params2, stringType);
    ArrowType arrowDiffReturn = new ArrowType(registry, params1, booleanType);

    assertTrue(arrow1.checkArrowEquivalenceHelper(arrow2, false));
    assertFalse(arrow1.checkArrowEquivalenceHelper(arrowDiffReturn, false));
  }

  @Test
  public void testHashCode_coverage() {
    Node params = registry.createParameters(numberType, stringType);
    ArrowType arrow1 = new ArrowType(registry, params, booleanType, true);
    ArrowType arrow2 = new ArrowType(registry, params, booleanType, false);
    ArrowType arrow3 = new ArrowType(registry, null, null, false);

    assertFalse(arrow1.hashCode() == arrow2.hashCode());
    assertTrue(arrow1.hashCode() != 0);
    assertTrue(arrow3.hashCode() != 0);

    Node paramNullType = Node.newString(1, "p");
    paramNullType.setJSType(null);
    ArrowType arrowNullParamType = new ArrowType(registry, new Node(1, paramNullType), numberType);
    assertTrue(arrowNullParamType.hashCode() != 0);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetLeastSupertype_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.getLeastSupertype(stringType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetGreatestSubtype_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.getGreatestSubtype(stringType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testTestForEquality_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.testForEquality(stringType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testVisit_throwsException() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.visit(new Visitor<Object>() {
      @Override
      public Object caseNoType() { return null; }
      @Override
      public Object caseEnumElementType(EnumElementType type) { return null; }
      @Override
      public Object caseAllType() { return null; }
      @Override
      public Object caseBooleanType() { return null; }
      @Override
      public Object caseNoObjectType() { return null; }
      @Override
      public Object caseFunctionType(FunctionType type) { return null; }
      @Override
      public Object caseObjectType(ObjectType type) { return null; }
      @Override
      public Object caseUnknownType() { return null; }
      @Override
      public Object caseNullType() { return null; }
      @Override
      public Object caseNamedType(NamedType type) { return null; }
      @Override
      public Object caseNumberType() { return null; }
      @Override
      public Object caseStringType() { return null; }
      @Override
      public Object caseVoidType() { return null; }
      @Override
      public Object caseUnionType(UnionType type) { return null; }
      @Override
      public Object caseTemplateType(TemplateType templateType) { return null; }
    });
  }

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testResolveInternal() {
    SimpleErrorReporter reporter = new SimpleErrorReporter();
    Node params = registry.createParameters(numberType);
    ArrowType arrow = new ArrowType(registry, params, stringType);

    JSType resolved = arrow.resolveInternal(reporter, null);
    assertEquals(arrow, resolved);
    assertEquals(stringType, arrow.returnType);
  }

  @Test
  public void testHasUnknownParamsOrReturn() {
    ArrowType arrowKnown = new ArrowType(
        registry, registry.createParameters(numberType), stringType);
    assertFalse(arrowKnown.hasUnknownParamsOrReturn());

    ArrowType arrowUnknownReturn = new ArrowType(
        registry, registry.createParameters(numberType), unknownType);
    assertTrue(arrowUnknownReturn.hasUnknownParamsOrReturn());

    ArrowType arrowUnknownParam = new ArrowType(
        registry, registry.createParameters(unknownType), stringType);
    assertTrue(arrowUnknownParam.hasUnknownParamsOrReturn());

    Node paramNull = Node.newString(1, "p");
    paramNull.setJSType(null);
    ArrowType arrowNullParam = new ArrowType(
        registry, new Node(1, paramNull), stringType);
    assertTrue(arrowNullParam.hasUnknownParamsOrReturn());
  }

  @Test
  public void testToStringHelper() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertEquals("[ArrowType]", arrow.toStringHelper(true));
    assertEquals("[ArrowType]", arrow.toStringHelper(false));
  }

  @Test
  public void testHasAnyTemplateInternal() {
    TemplateType template = registry.createTemplateType("T");

    ArrowType arrowNoTemplate = new ArrowType(
        registry, registry.createParameters(numberType), stringType);
    assertFalse(arrowNoTemplate.hasAnyTemplateInternal());

    ArrowType arrowReturnTemplate = new ArrowType(
        registry, registry.createParameters(numberType), template);
    assertTrue(arrowReturnTemplate.hasAnyTemplateInternal());

    ArrowType arrowParamTemplate = new ArrowType(
        registry, registry.createParameters(template), stringType);
    assertTrue(arrowParamTemplate.hasAnyTemplateInternal());

    Node paramNull = Node.newString(1, "p");
    paramNull.setJSType(null);
    ArrowType arrowNullParam = new ArrowType(
        registry, new Node(1, paramNull), stringType);
    assertFalse(arrowNullParam.hasAnyTemplateInternal());
  }
}
