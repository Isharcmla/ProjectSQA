package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

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

public class ClosureReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private ClosureReverseAbstractInterpreter interpreter;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
    convention = new GoogleCodingConvention();
    interpreter = new ClosureReverseAbstractInterpreter(convention, registry);
  }

  private FlowScope createScope(String varName, JSType type) {
    Node root = new Node(Token.SCRIPT);
    Scope globalScope = Scope.createGlobalScope(root);
    if (varName != null) {
      globalScope.declare(varName, new Node(Token.NAME, varName), type, null);
    }
    return LinkedFlowScope.createEntryLattice(globalScope);
  }

  private Node createCallNode(String receiver, String method, Node param) {
    Node call = new Node(Token.CALL);
    Node getprop = new Node(Token.GETPROP);
    getprop.addChildToBack(Node.newString(Token.NAME, receiver));
    getprop.addChildToBack(Node.newString(Token.STRING, method));
    call.addChildToBack(getprop);
    call.addChildToBack(param);
    return call;
  }

  private Node createGoogCall(String method, String varName) {
    return createCallNode("goog", method, Node.newString(Token.NAME, varName));
  }

  @Test
  public void testConditionNotCall_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = Node.newString(Token.NAME, "x");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionCallWithSingleChild_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionCallWithThreeChildren_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = new Node(Token.CALL,
        Node.newString(Token.NAME, "foo"),
        Node.newString(Token.NAME, "x"),
        Node.newString(Token.NAME, "y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionCalleeNotGetprop_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = new Node(Token.CALL,
        Node.newString(Token.NAME, "isDef"),
        Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionParamNotQualifiedName_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node add = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    Node condition = createCallNode("goog", "isDef", add);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionParamNotInScope_returnsBlindScope() {
    FlowScope scope = createScope("other", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = createGoogCall("isDef", "unboundVar");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionReceiverNotGoog_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = createCallNode("other", "isDef", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionReceiverNotNameNode_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node getpropReceiver = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString(Token.STRING, "goog"));
    Node call = new Node(Token.CALL,
        new Node(Token.GETPROP, getpropReceiver, Node.newString(Token.STRING, "isDef")),
        Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testConditionUnknownMethod_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = createGoogCall("unknownMethod", "x");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, result);
  }

  @Test
  public void testIsDef_outcomeTrue_removesUndefined() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.VOID_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isDef", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsDef_outcomeFalse_returnsBlindScope() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.VOID_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isDef", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertSame(scope, falseScope);
  }

  @Test
  public void testIsNull_outcomeTrue_restrictsToNull() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NULL_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isNull", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsNull_outcomeFalse_removesNull() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NULL_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isNull", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), falseScope.getSlot("x").getType());
  }

  @Test
  public void testIsDefAndNotNull_outcomeTrue_removesNullAndUndefined() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NULL_TYPE),
        registry.getNativeType(JSTypeNative.VOID_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isDefAndNotNull", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsDefAndNotNull_outcomeFalse_returnsBlindScope() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = createGoogCall("isDefAndNotNull", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertSame(scope, falseScope);
  }

  @Test
  public void testIsString_outcomeTrueAndFalse() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isString", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), trueScope.getSlot("x").getType());

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), falseScope.getSlot("x").getType());
  }

  @Test
  public void testIsBoolean_outcomeTrueAndFalse() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.BOOLEAN_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isBoolean", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), trueScope.getSlot("x").getType());

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), falseScope.getSlot("x").getType());
  }

  @Test
  public void testIsNumber_outcomeTrueAndFalse() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isNumber", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), trueScope.getSlot("x").getType());

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), falseScope.getSlot("x").getType());
  }

  @Test
  public void testIsFunction_outcomeTrueAndFalse() {
    FunctionType funcType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    JSType unionType = registry.createUnionType(funcType, registry.getNativeType(JSTypeNative.STRING_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isFunction", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(funcType, trueScope.getSlot("x").getType());

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), falseScope.getSlot("x").getType());
  }

  @Test
  public void testIsArray_topType_returnsTopTypeWhenTrue() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = createGoogCall("isArray", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.ALL_TYPE), trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsArray_objectType_restrictedToArrayWhenTrue() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    Node condition = createGoogCall("isArray", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsArray_nonArrayObjectType_returnsBlindScopeWhenTrue() {
    ObjectType dateType = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    FlowScope scope = createScope("x", dateType);
    Node condition = createGoogCall("isArray", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertSame(scope, trueScope);
  }

  @Test
  public void testIsArray_arrayType_returnsBlindScopeWhenFalse() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ARRAY_TYPE));
    Node condition = createGoogCall("isArray", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertSame(scope, falseScope);
  }

  @Test
  public void testIsArray_nonArrayObjectType_returnsTypeWhenFalse() {
    ObjectType dateType = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    FlowScope scope = createScope("x", dateType);
    Node condition = createGoogCall("isArray", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertEquals(dateType, falseScope.getSlot("x").getType());
  }

  @Test
  public void testIsObject_topType_restrictedToNoObjectTypeWhenTrue() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.ALL_TYPE));
    Node condition = createGoogCall("isObject", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsObject_objectType_returnsTypeWhenTrue() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    Node condition = createGoogCall("isObject", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsObject_functionType_returnsTypeWhenTrue() {
    FunctionType funcType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    FlowScope scope = createScope("x", funcType);
    Node condition = createGoogCall("isObject", "x");

    FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
    assertEquals(funcType, trueScope.getSlot("x").getType());
  }

  @Test
  public void testIsObject_objectType_returnsBlindScopeWhenFalse() {
    FlowScope scope = createScope("x", registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    Node condition = createGoogCall("isObject", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertSame(scope, falseScope);
  }

  @Test
  public void testIsObject_functionType_returnsBlindScopeWhenFalse() {
    FunctionType funcType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    FlowScope scope = createScope("x", funcType);
    Node condition = createGoogCall("isObject", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertSame(scope, falseScope);
  }

  @Test
  public void testIsObject_unionWithPrimitive_outcomeFalseKeepsPrimitive() {
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.OBJECT_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    FlowScope scope = createScope("x", unionType);
    Node condition = createGoogCall("isObject", "x");

    FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), falseScope.getSlot("x").getType());
  }
}
