package com.google.javascript.jscomp.type;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClosureReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private ClosureReverseAbstractInterpreter interpreter;
  private FlowScope flowScope;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    convention = new GoogleCodingConvention();
    interpreter = new ClosureReverseAbstractInterpreter(convention, registry);
    flowScope = new SimpleFlowScope();
  }

  private JSType getNative(JSTypeNative type) {
    return registry.getNativeType(type);
  }

  private Node createCall(String propName, Node paramNode) {
    Node callee = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, propName));
    return new Node(Token.CALL, callee, paramNode);
  }

  private static class SimpleFlowScope implements FlowScope {
    private final java.util.Map<String, JSType> slotTypes = new java.util.HashMap<String, JSType>();

    public SimpleFlowScope() {}

    private SimpleFlowScope(SimpleFlowScope parent) {
      this.slotTypes.putAll(parent.slotTypes);
    }

    @Override
    public FlowScope createChildFlowScope() {
      return new SimpleFlowScope(this);
    }

    @Override
    public FlowScope optimize() {
      return this;
    }

    @Override
    public Node getRootNode() {
      return null;
    }

    @Override
    public com.google.javascript.rhino.jstype.StaticTypedScope<JSType> getParentScope() {
      return null;
    }

    @Override
    public com.google.javascript.rhino.jstype.StaticTypedSlot<JSType> getSlot(final String name) {
      if (!slotTypes.containsKey(name)) {
        return null;
      }
      return new com.google.javascript.rhino.jstype.StaticTypedSlot<JSType>() {
        @Override
        public String getName() {
          return name;
        }

        @Override
        public JSType getType() {
          return slotTypes.get(name);
        }

        @Override
        public boolean isTypeInferred() {
          return true;
        }

        @Override
        public Node getDeclaration() {
          return null;
        }

        @Override
        public JSType getJSType() {
          return slotTypes.get(name);
        }
      };
    }

    @Override
    public com.google.javascript.rhino.jstype.StaticTypedSlot<JSType> getOwnSlot(String name) {
      return getSlot(name);
    }

    @Override
    public JSType getTypeOfThis() {
      return null;
    }

    @Override
    public void inferSlotType(String symbol, JSType type) {
      slotTypes.put(symbol, type);
    }

    @Override
    public void inferQualifiedSlot(Node node, String qualifiedName, JSType blindType, JSType type) {
      slotTypes.put(qualifiedName, type);
    }

    @Override
    public FlowScope findBestFlowScope(com.google.javascript.rhino.jstype.StaticTypedSlot<JSType> slot) {
      return this;
    }

    @Override
    public FlowScope findBestFlowScope(Node n) {
      return this;
    }

    @Override
    public boolean equals(Object other) {
      return this == other;
    }

    @Override
    public int hashCode() {
      return slotTypes.hashCode();
    }
  }

  @Test
  public void testIsDef_trueOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(NUMBER_TYPE), getNative(VOID_TYPE)));
    Node call = createCall("isDef", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(NUMBER_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsDef_falseOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(NUMBER_TYPE), getNative(VOID_TYPE)));
    Node call = createCall("isDef", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(VOID_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsDef_falseOutcomeWithNullType() {
    Node call = createCall("isDef", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertSame(flowScope, result);
  }

  @Test
  public void testIsNull_trueOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(STRING_TYPE), getNative(NULL_TYPE)));
    Node call = createCall("isNull", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(NULL_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsNull_trueOutcomeWithNullType() {
    Node call = createCall("isNull", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertSame(flowScope, result);
  }

  @Test
  public void testIsNull_falseOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(STRING_TYPE), getNative(NULL_TYPE)));
    Node call = createCall("isNull", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(STRING_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsDefAndNotNull_trueOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(STRING_TYPE), getNative(NULL_TYPE), getNative(VOID_TYPE)));
    Node call = createCall("isDefAndNotNull", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(STRING_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsDefAndNotNull_falseOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(STRING_TYPE), getNative(NULL_TYPE), getNative(VOID_TYPE)));
    Node call = createCall("isDefAndNotNull", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(NULL_VOID), result.getSlot("x").getType());
  }

  @Test
  public void testIsDefAndNotNull_falseOutcomeWithNullType() {
    Node call = createCall("isDefAndNotNull", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertSame(flowScope, result);
  }

  @Test
  public void testIsString_trueAndFalseOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(STRING_TYPE), getNative(NUMBER_TYPE)));
    Node call = createCall("isString", Node.newString(Token.NAME, "x"));
    
    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(STRING_TYPE), resultTrue.getSlot("x").getType());

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertEquals(getNative(NUMBER_TYPE), resultFalse.getSlot("x").getType());
  }

  @Test
  public void testIsBoolean_trueAndFalseOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(BOOLEAN_TYPE), getNative(NUMBER_TYPE)));
    Node call = createCall("isBoolean", Node.newString(Token.NAME, "x"));

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(BOOLEAN_TYPE), resultTrue.getSlot("x").getType());

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertEquals(getNative(NUMBER_TYPE), resultFalse.getSlot("x").getType());
  }

  @Test
  public void testIsNumber_trueAndFalseOutcome() {
    flowScope.inferSlotType("x", registry.createUnionType(getNative(BOOLEAN_TYPE), getNative(NUMBER_TYPE)));
    Node call = createCall("isNumber", Node.newString(Token.NAME, "x"));

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(NUMBER_TYPE), resultTrue.getSlot("x").getType());

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertEquals(getNative(BOOLEAN_TYPE), resultFalse.getSlot("x").getType());
  }

  @Test
  public void testIsFunction_trueAndFalseOutcome() {
    FunctionType funcType = registry.createFunctionType(getNative(VOID_TYPE));
    flowScope.inferSlotType("x", registry.createUnionType(funcType, getNative(NUMBER_TYPE)));
    Node call = createCall("isFunction", Node.newString(Token.NAME, "x"));

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(funcType, resultTrue.getSlot("x").getType());

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertEquals(getNative(NUMBER_TYPE), resultFalse.getSlot("x").getType());
  }

  @Test
  public void testIsArray_nullTypeTrueOutcome() {
    Node call = createCall("isArray", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(ARRAY_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsArray_nullTypeFalseOutcome() {
    Node call = createCall("isArray", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertSame(flowScope, result);
  }

  @Test
  public void testIsArray_topTypesTrueOutcome() {
    flowScope.inferSlotType("x", getNative(UNKNOWN_TYPE));
    Node call = createCall("isArray", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(UNKNOWN_TYPE), result.getSlot("x").getType());

    flowScope.inferSlotType("x", getNative(CHECKED_UNKNOWN_TYPE));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(CHECKED_UNKNOWN_TYPE), result.getSlot("x").getType());

    flowScope.inferSlotType("x", getNative(ALL_TYPE));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(ALL_TYPE), result.getSlot("x").getType());

    flowScope.inferSlotType("x", getNative(NO_TYPE));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(NO_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsArray_objectTypeTrueAndFalseOutcome() {
    ObjectType objectType = registry.getNativeObjectType(OBJECT_TYPE);
    flowScope.inferSlotType("x", objectType);
    Node call = createCall("isArray", Node.newString(Token.NAME, "x"));

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(ARRAY_TYPE), resultTrue.getSlot("x").getType());

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertEquals(objectType, resultFalse.getSlot("x").getType());
  }

  @Test
  public void testIsArray_arrayTypeTrueAndFalseOutcome() {
    ObjectType arrayType = registry.getNativeObjectType(ARRAY_TYPE);
    flowScope.inferSlotType("x", arrayType);
    Node call = createCall("isArray", Node.newString(Token.NAME, "x"));

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(arrayType, resultTrue.getSlot("x").getType());

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertNull(resultFalse.getSlot("x"));
  }

  @Test
  public void testIsObject_nullTypeTrueOutcome() {
    Node call = createCall("isObject", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertNotNull(result.getSlot("x"));
    Assert.assertEquals(getNative(OBJECT_TYPE), result.getSlot("x").getType());
  }

  @Test
  public void testIsObject_nullTypeFalseOutcome() {
    Node call = createCall("isObject", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertSame(flowScope, result);
  }

  @Test
  public void testIsObject_trueOutcome() {
    flowScope.inferSlotType("x", getNative(UNKNOWN_TYPE));
    Node call = createCall("isObject", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(NO_OBJECT_TYPE), result.getSlot("x").getType());

    flowScope.inferSlotType("x", getNative(OBJECT_TYPE));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(getNative(OBJECT_TYPE), result.getSlot("x").getType());

    FunctionType funcType = registry.createFunctionType(getNative(VOID_TYPE));
    flowScope.inferSlotType("x", funcType);
    result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, true);
    Assert.assertEquals(funcType, result.getSlot("x").getType());
  }

  @Test
  public void testIsObject_falseOutcome() {
    flowScope.inferSlotType("x", getNative(ALL_TYPE));
    Node call = createCall("isObject", Node.newString(Token.NAME, "x"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    JSType expected = registry.createUnionType(getNative(NUMBER_STRING_BOOLEAN), getNative(NULL_VOID));
    Assert.assertEquals(expected, result.getSlot("x").getType());

    flowScope.inferSlotType("x", getNative(OBJECT_TYPE));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertNull(result.getSlot("x"));

    FunctionType funcType = registry.createFunctionType(getNative(VOID_TYPE));
    flowScope.inferSlotType("x", funcType);
    result = interpreter.getPreciserScopeKnowingConditionOutcome(call, flowScope, false);
    Assert.assertNull(result.getSlot("x"));
  }

  @Test
  public void testNonMatchingConditionsFallbackToNextInterpreter() {
    Node nonCallNode = Node.newString(Token.NAME, "x");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(nonCallNode, flowScope, true);
    Assert.assertSame(flowScope, result);

    Node callWrongArgs = new Node(Token.CALL, new Node(Token.NAME, "goog"), Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(callWrongArgs, flowScope, true);
    Assert.assertSame(flowScope, result);

    Node calleeNotGetProp = new Node(Token.NAME, "fn");
    Node callNotGetProp = new Node(Token.CALL, calleeNotGetProp, Node.newString(Token.NAME, "x"));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(callNotGetProp, flowScope, true);
    Assert.assertSame(flowScope, result);

    Node calleeOtherNamespace = new Node(Token.GETPROP, Node.newString(Token.NAME, "other"), Node.newString(Token.STRING, "isDef"));
    Node callOtherNamespace = new Node(Token.CALL, calleeOtherNamespace, Node.newString(Token.NAME, "x"));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(callOtherNamespace, flowScope, true);
    Assert.assertSame(flowScope, result);

    Node calleeUnknownFunc = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "unknownFunction"));
    Node callUnknownFunc = new Node(Token.CALL, calleeUnknownFunc, Node.newString(Token.NAME, "x"));
    result = interpreter.getPreciserScopeKnowingConditionOutcome(callUnknownFunc, flowScope, true);
    Assert.assertSame(flowScope, result);
  }
}
