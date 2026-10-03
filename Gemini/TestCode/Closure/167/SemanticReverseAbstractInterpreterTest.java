package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

public class SemanticReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private SemanticReverseAbstractInterpreter interpreter;
  private Scope globalScope;
  private FlowScope blindScope;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
    convention = new DefaultCodingConvention();
    interpreter = new SemanticReverseAbstractInterpreter(convention, registry);

    Node root = new Node(Token.BLOCK);
    globalScope = new Scope(root, (ObjectType) null);
    blindScope = LinkedFlowScope.createEntryLattice(globalScope);
  }

  private void declareVar(String name, JSType type) {
    globalScope.declare(name, null, type, null);
    blindScope = LinkedFlowScope.createEntryLattice(globalScope);
  }

  @Test
  public void testTypeOf_eq_outcomeTrue() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    declareVar("a", unionType);

    Node nameNode = Node.newString(Token.NAME, "a");
    nameNode.setJSType(unionType);
    Node typeOfNode = new Node(Token.TYPEOF, nameNode);
    Node strNode = Node.newString("string");
    Node eqNode = new Node(Token.EQ, typeOfNode, strNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(eqNode, blindScope, true);
    assertNotNull(scope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), scope.getSlot("a").getType());
  }

  @Test
  public void testTypeOf_sheq_swappedNodes_outcomeFalse() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    declareVar("a", unionType);

    Node nameNode = Node.newString(Token.NAME, "a");
    nameNode.setJSType(unionType);
    Node typeOfNode = new Node(Token.TYPEOF, nameNode);
    Node strNode = Node.newString("string");
    Node sheqNode = new Node(Token.SHEQ, strNode, typeOfNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(sheqNode, blindScope, false);
    assertNotNull(scope);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), scope.getSlot("a").getType());
  }

  @Test
  public void testTypeOf_inCaseStatement_outcomeTrue() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    declareVar("a", unionType);

    Node nameNode = Node.newString(Token.NAME, "a");
    nameNode.setJSType(unionType);
    Node typeOfNode = new Node(Token.TYPEOF, nameNode);

    Node switchCond = typeOfNode;
    Node caseExpr = Node.newString("number");
    Node caseNode = new Node(Token.CASE, caseExpr);
    Node switchNode = new Node(Token.SWITCH, switchCond, caseNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, blindScope, true);
    assertNotNull(scope);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), scope.getSlot("a").getType());
  }

  @Test
  public void testTypeOf_nonRefinableOperand_fallsThrough() {
    Node numberNode = Node.newNumber(42);
    numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node typeOfNode = new Node(Token.TYPEOF, numberNode);
    Node strNode = Node.newString("number");
    Node eqNode = new Node(Token.EQ, typeOfNode, strNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(eqNode, blindScope, true);
    assertSame(blindScope, scope);
  }

  @Test
  public void testAnd_outcomeTrue_refinesBothOperands() {
    JSType nullableString = registry.createNullableType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    declareVar("a", nullableString);
    declareVar("b", nullableString);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(nullableString);
    Node bNode = Node.newString(Token.NAME, "b");
    bNode.setJSType(nullableString);

    Node andNode = new Node(Token.AND, aNode, bNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(andNode, blindScope, true);
    assertNotNull(scope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), scope.getSlot("a").getType());
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), scope.getSlot("b").getType());
  }

  @Test
  public void testAnd_outcomeTrue_leftNonRefinable_restrictedNull() {
    Node nullNode = new Node(Token.NULL);
    nullNode.setJSType(registry.getNativeType(JSTypeNative.NULL_TYPE));

    JSType nullableString = registry.createNullableType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    declareVar("b", nullableString);
    Node bNode = Node.newString(Token.NAME, "b");
    bNode.setJSType(nullableString);

    Node andNode = new Node(Token.AND, nullNode, bNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(andNode, blindScope, true);
    assertNotNull(scope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), scope.getSlot("b").getType());
  }

  @Test
  public void testAnd_outcomeFalse_shortCircuitMerge() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.NULL_TYPE));
    declareVar("a", unionType);

    Node aNode1 = Node.newString(Token.NAME, "a");
    aNode1.setJSType(unionType);
    Node aNode2 = Node.newString(Token.NAME, "a");
    aNode2.setJSType(unionType);

    Node andNode = new Node(Token.AND, aNode1, aNode2);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(andNode, blindScope, false);
    assertNotNull(scope);
  }

  @Test
  public void testAnd_outcomeFalse_unmatchedRefinedSlot_returnsBlindScope() {
    declareVar("a", registry.getNativeType(JSTypeNative.ALL_TYPE));
    declareVar("b", registry.getNativeType(JSTypeNative.ALL_TYPE));

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node bNode = Node.newString(Token.NAME, "b");
    bNode.setJSType(registry.getNativeType(JSTypeNative.ALL_TYPE));

    Node andNode = new Node(Token.AND, aNode, bNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(andNode, blindScope, false);
    assertNotNull(scope);
  }

  @Test
  public void testAnd_outcomeFalse_noRefinedSlot_returnsBlindScope() {
    Node num1 = Node.newNumber(1.0);
    num1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node num2 = Node.newNumber(2.0);
    num2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node andNode = new Node(Token.AND, num1, num2);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(andNode, blindScope, false);
    assertSame(blindScope, scope);
  }

  @Test
  public void testOr_outcomeFalse_refinesBoth() {
    JSType nullableString = registry.createNullableType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    declareVar("a", nullableString);
    declareVar("b", nullableString);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(nullableString);
    Node bNode = Node.newString(Token.NAME, "b");
    bNode.setJSType(nullableString);

    Node orNode = new Node(Token.OR, aNode, bNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(orNode, blindScope, false);
    assertNotNull(scope);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), scope.getSlot("a").getType());
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), scope.getSlot("b").getType());
  }

  @Test
  public void testOr_outcomeTrue_maybeShortCircuiting() {
    declareVar("a", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node aNode1 = Node.newString(Token.NAME, "a");
    aNode1.setJSType(registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node aNode2 = Node.newString(Token.NAME, "a");
    aNode2.setJSType(registry.getNativeType(JSTypeNative.ALL_TYPE));

    Node orNode = new Node(Token.OR, aNode1, aNode2);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(orNode, blindScope, true);
    assertNotNull(scope);
  }

  @Test
  public void testEquality_EQ_NE_SHEQ_SHNE() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NULL_TYPE));
    declareVar("a", unionType);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(unionType);
    Node nullNode = new Node(Token.NULL);
    nullNode.setJSType(registry.getNativeType(JSTypeNative.NULL_TYPE));

    // EQ outcome true
    Node eqNode = new Node(Token.EQ, aNode, nullNode);
    FlowScope eqTrue = interpreter.getPreciserScopeKnowingConditionOutcome(eqNode, blindScope, true);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), eqTrue.getSlot("a").getType());

    // EQ outcome false
    FlowScope eqFalse = interpreter.getPreciserScopeKnowingConditionOutcome(eqNode, blindScope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), eqFalse.getSlot("a").getType());

    // NE outcome true
    Node neNode = new Node(Token.NE, aNode, nullNode);
    FlowScope neTrue = interpreter.getPreciserScopeKnowingConditionOutcome(neNode, blindScope, true);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), neTrue.getSlot("a").getType());

    // NE outcome false
    FlowScope neFalse = interpreter.getPreciserScopeKnowingConditionOutcome(neNode, blindScope, false);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), neFalse.getSlot("a").getType());

    // SHEQ outcome true
    Node sheqNode = new Node(Token.SHEQ, aNode, nullNode);
    FlowScope sheqTrue = interpreter.getPreciserScopeKnowingConditionOutcome(sheqNode, blindScope, true);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), sheqTrue.getSlot("a").getType());

    // SHEQ outcome false
    FlowScope sheqFalse = interpreter.getPreciserScopeKnowingConditionOutcome(sheqNode, blindScope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), sheqFalse.getSlot("a").getType());

    // SHNE outcome true
    Node shneNode = new Node(Token.SHNE, aNode, nullNode);
    FlowScope shneTrue = interpreter.getPreciserScopeKnowingConditionOutcome(shneNode, blindScope, true);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), shneTrue.getSlot("a").getType());

    // SHNE outcome false
    FlowScope shneFalse = interpreter.getPreciserScopeKnowingConditionOutcome(shneNode, blindScope, false);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), shneFalse.getSlot("a").getType());
  }

  @Test
  public void testEquality_unrefinableNodes_returnsBlindScope() {
    Node n1 = Node.newNumber(1.0);
    n1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node n2 = Node.newNumber(2.0);
    n2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node eqNode = new Node(Token.EQ, n1, n2);
    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(eqNode, blindScope, true);
    assertSame(blindScope, scope);
  }

  @Test
  public void testNameAndGetProp() {
    JSType nullableString = registry.createNullableType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    declareVar("a", nullableString);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(nullableString);

    // NAME outcome true
    FlowScope nameTrue = interpreter.getPreciserScopeKnowingConditionOutcome(aNode, blindScope, true);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), nameTrue.getSlot("a").getType());

    // NAME outcome false
    FlowScope nameFalse = interpreter.getPreciserScopeKnowingConditionOutcome(aNode, blindScope, false);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), nameFalse.getSlot("a").getType());

    // Non refinable NAME
    Node unrefinableName = Node.newString(Token.NAME, "unrefinable");
    FlowScope unrefScope = interpreter.getPreciserScopeKnowingConditionOutcome(unrefinableName, blindScope, true);
    assertSame(blindScope, unrefScope);

    // GETPROP refinable
    declareVar("a.b", nullableString);
    Node getPropNode = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("b"));
    getPropNode.setJSType(nullableString);
    FlowScope getPropTrue = interpreter.getPreciserScopeKnowingConditionOutcome(getPropNode, blindScope, true);
    assertNotNull(getPropTrue.getSlot("a.b"));
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), getPropTrue.getSlot("a.b").getType());
  }

  @Test
  public void testAssign() {
    JSType nullableString = registry.createNullableType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    declareVar("a", nullableString);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(nullableString);
    Node rightNode = Node.newString(Token.NAME, "a");
    rightNode.setJSType(nullableString);

    Node assignNode = new Node(Token.ASSIGN, aNode, rightNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(assignNode, blindScope, true);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), scope.getSlot("a").getType());
  }

  @Test
  public void testNot() {
    JSType nullableString = registry.createNullableType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    declareVar("a", nullableString);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(nullableString);

    Node notNode = new Node(Token.NOT, aNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(notNode, blindScope, true);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), scope.getSlot("a").getType());

    FlowScope scopeFalse = interpreter.getPreciserScopeKnowingConditionOutcome(notNode, blindScope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), scopeFalse.getSlot("a").getType());
  }

  @Test
  public void testRelationalOperators_LE_LT_GE_GT() {
    JSType undefNumber = registry.createUnionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.VOID_TYPE));
    declareVar("a", undefNumber);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(undefNumber);
    Node numNode = Node.newNumber(0.0);
    numNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    int[] tokens = new int[]{Token.LE, Token.LT, Token.GE, Token.GT};
    for (int token : tokens) {
      Node relNode = new Node(token, aNode, numNode);
      FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(relNode, blindScope, true);
      assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), trueScope.getSlot("a").getType());

      FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(relNode, blindScope, false);
      assertNotNull(falseScope);
    }
  }

  @Test
  public void testInstanceOf_functionTarget_outcomeTrueAndFalse() {
    FunctionType constructorType = registry.getNativeFunctionType(JSTypeNative.REGEXP_FUNCTION_TYPE);
    ObjectType instanceType = constructorType.getInstanceType();
    JSType unionType = registry.createUnionType(
        instanceType,
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    declareVar("a", unionType);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(unionType);

    Node funcNode = Node.newString(Token.NAME, "RegExp");
    funcNode.setJSType(constructorType);

    Node instNode = new Node(Token.INSTANCEOF, aNode, funcNode);

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(instNode, blindScope, true);
    assertEquals(instanceType, trueScope.getSlot("a").getType());

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(instNode, blindScope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), falseScope.getSlot("a").getType());
  }

  @Test
  public void testInstanceOf_unknownTarget_outcomeTrueAndFalse() {
    JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    declareVar("a", allType);

    Node aNode = Node.newString(Token.NAME, "a");
    aNode.setJSType(allType);

    Node unknownFuncNode = Node.newString(Token.NAME, "UnknownFn");
    unknownFuncNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

    Node instNode = new Node(Token.INSTANCEOF, aNode, unknownFuncNode);

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(instNode, blindScope, true);
    assertNotNull(trueScope);

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(instNode, blindScope, false);
    assertNotNull(falseScope);
  }

  @Test
  public void testInstanceOf_nonRefinableLeft_returnsBlindScope() {
    Node numberNode = Node.newNumber(42);
    numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node funcNode = Node.newString(Token.NAME, "RegExp");
    funcNode.setJSType(registry.getNativeFunctionType(JSTypeNative.REGEXP_FUNCTION_TYPE));

    Node instNode = new Node(Token.INSTANCEOF, numberNode, funcNode);
    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(instNode, blindScope, true);
    assertSame(blindScope, scope);
  }

  @Test
  public void testIn_operator_outcomeTrue() {
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    declareVar("obj", objectType);

    Node strProp = Node.newString("foo");
    Node objNode = Node.newString(Token.NAME, "obj");
    objNode.setJSType(objectType);

    Node inNode = new Node(Token.IN, strProp, objNode);

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(inNode, blindScope, true);
    assertNotNull(trueScope);
    assertNotNull(trueScope.getSlot("obj.foo"));

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(inNode, blindScope, false);
    assertSame(blindScope, falseScope);
  }

  @Test
  public void testIn_operator_nonStringLeftOrExistingProp() {
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    declareVar("obj", objectType);

    // Left is not string
    Node numProp = Node.newNumber(1.0);
    Node objNode = Node.newString(Token.NAME, "obj");
    objNode.setJSType(objectType);
    Node inNode1 = new Node(Token.IN, numProp, objNode);
    FlowScope scope1 = interpreter.getPreciserScopeKnowingConditionOutcome(inNode1, blindScope, true);
    assertSame(blindScope, scope1);

    // Left is string, but obj already has property in slot
    declareVar("obj.foo", registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node strProp = Node.newString("foo");
    Node inNode2 = new Node(Token.IN, strProp, objNode);
    FlowScope scope2 = interpreter.getPreciserScopeKnowingConditionOutcome(inNode2, blindScope, true);
    assertSame(blindScope, scope2);
  }

  @Test
  public void testCaseNode_outcomeTrueAndFalse() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    declareVar("a", unionType);

    Node switchCond = Node.newString(Token.NAME, "a");
    switchCond.setJSType(unionType);

    Node caseExpr = Node.newString("hello");
    caseExpr.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

    Node caseNode = new Node(Token.CASE, caseExpr);
    Node switchNode = new Node(Token.SWITCH, switchCond, caseNode);

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, blindScope, true);
    assertNotNull(trueScope);

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, blindScope, false);
    assertNotNull(falseScope);
  }

  @Test
  public void testFallthroughDefaultToken() {
    Node addNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(addNode, blindScope, true);
    assertSame(blindScope, scope);
  }
}
