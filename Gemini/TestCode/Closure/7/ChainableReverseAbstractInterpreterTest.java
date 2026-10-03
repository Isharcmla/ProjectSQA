package com.google.javascript.jscomp.type;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ChainableReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;

  private static class SimpleStaticSlot implements StaticSlot<JSType> {
    private final String name;
    private final JSType type;

    SimpleStaticSlot(String name, JSType type) {
      this.name = name;
      this.type = type;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public JSType getType() {
      return type;
    }

    @Override
    public boolean isTypeInferred() {
      return false;
    }

    @Override
    public Object getDeclaration() {
      return null;
    }

    @Override
    public JSType getJSType() {
      return type;
    }
  }

  private static class TestFlowScope implements FlowScope {
    private final Map<String, JSType> slots = new HashMap<>();

    @Override
    public StaticSlot<JSType> getSlot(String name) {
      if (slots.containsKey(name)) {
        return new SimpleStaticSlot(name, slots.get(name));
      }
      return null;
    }

    @Override
    public void inferSlotType(String symbol, JSType type) {
      slots.put(symbol, type);
    }

    @Override
    public void inferQualifiedSlot(Node node, String symbol, JSType bottomType, JSType inferredType) {
      slots.put(symbol, inferredType);
    }

    @Override
    public FlowScope optimize() {
      return this;
    }

    @Override
    public FlowScope createChildFlowScope() {
      TestFlowScope child = new TestFlowScope();
      child.slots.putAll(this.slots);
      return child;
    }

    @Override
    public StaticSlot<JSType> getOwnSlot(String name) {
      return getSlot(name);
    }

    @Override
    public JSType getTypeOfThis() {
      return null;
    }

    @Override
    public Node getRootNode() {
      return null;
    }

    @Override
    public FlowScope findBestScope() {
      return this;
    }
  }

  private static class ConcreteInterpreter extends ChainableReverseAbstractInterpreter {
    private boolean preciserScopeCalled = false;

    public ConcreteInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry) {
      super(convention, typeRegistry);
    }

    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome) {
      preciserScopeCalled = true;
      return blindScope;
    }
  }

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    convention = new ClosureCodingConvention();
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullConvention_throwsException() {
    new ConcreteInterpreter(null, registry);
  }

  @Test
  public void testConstructor_validArguments_success() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    Assert.assertSame(interpreter, interpreter.getFirst());
    Assert.assertSame(registry, interpreter.typeRegistry);
  }

  @Test
  public void testAppend_validChain_returnsLastAndMaintainsFirst() {
    ConcreteInterpreter first = new ConcreteInterpreter(convention, registry);
    ConcreteInterpreter second = new ConcreteInterpreter(convention, registry);
    ConcreteInterpreter third = new ConcreteInterpreter(convention, registry);

    ChainableReverseAbstractInterpreter returnedSecond = first.append(second);
    Assert.assertSame(second, returnedSecond);
    Assert.assertSame(first, second.getFirst());

    ChainableReverseAbstractInterpreter returnedThird = second.append(third);
    Assert.assertSame(third, returnedThird);
    Assert.assertSame(first, third.getFirst());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAppend_invalidLinkWithExistingNext_throwsException() {
    ConcreteInterpreter first = new ConcreteInterpreter(convention, registry);
    ConcreteInterpreter second = new ConcreteInterpreter(convention, registry);
    ConcreteInterpreter third = new ConcreteInterpreter(convention, registry);

    second.append(third);
    first.append(second);
  }

  @Test
  public void testFirstPreciserScopeKnowingConditionOutcome_invokesFirstLink() {
    ConcreteInterpreter first = new ConcreteInterpreter(convention, registry);
    ConcreteInterpreter second = new ConcreteInterpreter(convention, registry);
    first.append(second);

    Node condition = Node.newString("test");
    FlowScope scope = new TestFlowScope();

    FlowScope result = second.firstPreciserScopeKnowingConditionOutcome(condition, scope, true);
    Assert.assertSame(scope, result);
    Assert.assertTrue(first.preciserScopeCalled);
    Assert.assertFalse(second.preciserScopeCalled);
  }

  @Test
  public void testNextPreciserScopeKnowingConditionOutcome_withNextLink() {
    ConcreteInterpreter first = new ConcreteInterpreter(convention, registry);
    ConcreteInterpreter second = new ConcreteInterpreter(convention, registry);
    first.append(second);

    Node condition = Node.newString("test");
    FlowScope scope = new TestFlowScope();

    FlowScope result = first.nextPreciserScopeKnowingConditionOutcome(condition, scope, true);
    Assert.assertSame(scope, result);
    Assert.assertTrue(second.preciserScopeCalled);
  }

  @Test
  public void testNextPreciserScopeKnowingConditionOutcome_noNextLink_returnsBlindScope() {
    ConcreteInterpreter first = new ConcreteInterpreter(convention, registry);
    Node condition = Node.newString("test");
    FlowScope scope = new TestFlowScope();

    FlowScope result = first.nextPreciserScopeKnowingConditionOutcome(condition, scope, true);
    Assert.assertSame(scope, result);
    Assert.assertFalse(first.preciserScopeCalled);
  }

  @Test
  public void testGetTypeIfRefinable_nameNode() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    TestFlowScope scope = new TestFlowScope();
    Node nameNode = Node.newString(Token.NAME, "varName");

    Assert.assertNull(interpreter.getTypeIfRefinable(nameNode, scope));

    scope.inferSlotType("varName", registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE), interpreter.getTypeIfRefinable(nameNode, scope));

    scope.slots.put("varName", null);
    nameNode.setJSType(registry.getNativeType(STRING_TYPE));
    Assert.assertEquals(registry.getNativeType(STRING_TYPE), interpreter.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetTypeIfRefinable_getPropNode() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    TestFlowScope scope = new TestFlowScope();

    Node target = Node.newString(Token.NAME, "a");
    Node prop = Node.newString(Token.STRING, "b");
    Node getPropNode = new Node(Token.GETPROP, target, prop);

    Assert.assertEquals(registry.getNativeType(UNKNOWN_TYPE), interpreter.getTypeIfRefinable(getPropNode, scope));

    getPropNode.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Assert.assertEquals(registry.getNativeType(BOOLEAN_TYPE), interpreter.getTypeIfRefinable(getPropNode, scope));

    scope.inferSlotType("a.b", registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE), interpreter.getTypeIfRefinable(getPropNode, scope));

    Node invalidGetProp = new Node(Token.GETPROP, new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2)), Node.newString("c"));
    Assert.assertNull(interpreter.getTypeIfRefinable(invalidGetProp, scope));
  }

  @Test
  public void testGetTypeIfRefinable_otherNodeType_returnsNull() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    TestFlowScope scope = new TestFlowScope();
    Node numberNode = Node.newNumber(42);

    Assert.assertNull(interpreter.getTypeIfRefinable(numberNode, scope));
  }

  @Test
  public void testDeclareNameInScope_nameNode() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    TestFlowScope scope = new TestFlowScope();
    Node nameNode = Node.newString(Token.NAME, "foo");

    interpreter.declareNameInScope(scope, nameNode, registry.getNativeType(STRING_TYPE));
    Assert.assertEquals(registry.getNativeType(STRING_TYPE), scope.getSlot("foo").getType());
  }

  @Test
  public void testDeclareNameInScope_getPropNode() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    TestFlowScope scope = new TestFlowScope();
    Node target = Node.newString(Token.NAME, "foo");
    Node prop = Node.newString(Token.STRING, "bar");
    Node getPropNode = new Node(Token.GETPROP, target, prop);

    interpreter.declareNameInScope(scope, getPropNode, registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE), scope.getSlot("foo.bar").getType());

    getPropNode.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    interpreter.declareNameInScope(scope, getPropNode, registry.getNativeType(STRING_TYPE));
    Assert.assertEquals(registry.getNativeType(STRING_TYPE), scope.getSlot("foo.bar").getType());
  }

  @Test
  public void testDeclareNameInScope_thisNode_doesNothing() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    TestFlowScope scope = new TestFlowScope();
    Node thisNode = new Node(Token.THIS);

    interpreter.declareNameInScope(scope, thisNode, registry.getNativeType(NUMBER_TYPE));
    Assert.assertNull(scope.getSlot("this"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDeclareNameInScope_unsupportedNode_throwsException() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);
    TestFlowScope scope = new TestFlowScope();
    Node numberNode = Node.newNumber(123);

    interpreter.declareNameInScope(scope, numberNode, registry.getNativeType(NUMBER_TYPE));
  }

  @Test
  public void testGetRestrictedWithoutUndefined() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    Assert.assertNull(interpreter.getRestrictedWithoutUndefined(null));
    Assert.assertNull(interpreter.getRestrictedWithoutUndefined(registry.getNativeType(VOID_TYPE)));

    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(NUMBER_TYPE)));
    Assert.assertEquals(registry.getNativeType(STRING_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(STRING_TYPE)));
    Assert.assertEquals(registry.getNativeType(BOOLEAN_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(BOOLEAN_TYPE)));
    Assert.assertEquals(registry.getNativeType(NULL_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(NULL_TYPE)));
    Assert.assertEquals(registry.getNativeType(NO_OBJECT_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(NO_OBJECT_TYPE)));
    Assert.assertEquals(registry.getNativeType(NO_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(NO_TYPE)));
    Assert.assertEquals(registry.getNativeType(UNKNOWN_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(UNKNOWN_TYPE)));
    Assert.assertEquals(registry.getNativeType(OBJECT_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(OBJECT_TYPE)));
    Assert.assertEquals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        interpreter.getRestrictedWithoutUndefined(registry.getNativeType(U2U_CONSTRUCTOR_TYPE)));

    JSType allTypeRestricted = interpreter.getRestrictedWithoutUndefined(registry.getNativeType(ALL_TYPE));
    Assert.assertNotNull(allTypeRestricted);
    Assert.assertTrue(allTypeRestricted.isUnionType());

    JSType unionWithVoid = registry.createUnionType(NUMBER_TYPE, VOID_TYPE);
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedWithoutUndefined(unionWithVoid));

    EnumType enumType = registry.createEnumType("MyEnum", null, registry.getNativeType(NUMBER_TYPE));
    EnumElementType enumElementType = enumType.getElementsType();
    Assert.assertEquals(enumElementType, interpreter.getRestrictedWithoutUndefined(enumElementType));

    EnumType enumTypeVoid = registry.createEnumType("VoidEnum", null, registry.getNativeType(VOID_TYPE));
    EnumElementType enumElementVoid = enumTypeVoid.getElementsType();
    Assert.assertNull(interpreter.getRestrictedWithoutUndefined(enumElementVoid));

    ParameterizedType paramType = registry.createParameterizedType(
        registry.getNativeObjectType(OBJECT_TYPE), registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(paramType, interpreter.getRestrictedWithoutUndefined(paramType));

    TemplateType templateType = registry.createTemplateType("T");
    Assert.assertEquals(templateType, interpreter.getRestrictedWithoutUndefined(templateType));
  }

  @Test
  public void testGetRestrictedWithoutNull() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    Assert.assertNull(interpreter.getRestrictedWithoutNull(null));
    Assert.assertNull(interpreter.getRestrictedWithoutNull(registry.getNativeType(NULL_TYPE)));

    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(NUMBER_TYPE)));
    Assert.assertEquals(registry.getNativeType(STRING_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(STRING_TYPE)));
    Assert.assertEquals(registry.getNativeType(BOOLEAN_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(BOOLEAN_TYPE)));
    Assert.assertEquals(registry.getNativeType(VOID_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(VOID_TYPE)));
    Assert.assertEquals(registry.getNativeType(NO_OBJECT_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(NO_OBJECT_TYPE)));
    Assert.assertEquals(registry.getNativeType(NO_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(NO_TYPE)));
    Assert.assertEquals(registry.getNativeType(UNKNOWN_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(UNKNOWN_TYPE)));
    Assert.assertEquals(registry.getNativeType(OBJECT_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(OBJECT_TYPE)));
    Assert.assertEquals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        interpreter.getRestrictedWithoutNull(registry.getNativeType(U2U_CONSTRUCTOR_TYPE)));

    JSType allTypeRestricted = interpreter.getRestrictedWithoutNull(registry.getNativeType(ALL_TYPE));
    Assert.assertNotNull(allTypeRestricted);
    Assert.assertTrue(allTypeRestricted.isUnionType());

    JSType unionWithNull = registry.createUnionType(NUMBER_TYPE, NULL_TYPE);
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedWithoutNull(unionWithNull));

    EnumType enumType = registry.createEnumType("MyEnum", null, registry.getNativeType(NUMBER_TYPE));
    EnumElementType enumElementType = enumType.getElementsType();
    Assert.assertEquals(enumElementType, interpreter.getRestrictedWithoutNull(enumElementType));

    EnumType enumTypeNull = registry.createEnumType("NullEnum", null, registry.getNativeType(NULL_TYPE));
    EnumElementType enumElementNull = enumTypeNull.getElementsType();
    Assert.assertNull(interpreter.getRestrictedWithoutNull(enumElementNull));

    ParameterizedType paramType = registry.createParameterizedType(
        registry.getNativeObjectType(OBJECT_TYPE), registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(paramType, interpreter.getRestrictedWithoutNull(paramType));

    TemplateType templateType = registry.createTemplateType("T");
    Assert.assertEquals(templateType, interpreter.getRestrictedWithoutNull(templateType));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_nullType() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "number", true));
    Assert.assertEquals(registry.getNativeType(BOOLEAN_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "boolean", true));
    Assert.assertEquals(registry.getNativeType(STRING_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "string", true));
    Assert.assertEquals(registry.getNativeType(VOID_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "undefined", true));
    Assert.assertEquals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "function", true));
    Assert.assertEquals(registry.getNativeType(CHECKED_UNKNOWN_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "unknown_custom", true));

    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(null, "number", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_primitivesAndObjects_equalsTrue() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NUMBER_TYPE), "number", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NUMBER_TYPE), "string", true));

    Assert.assertEquals(registry.getNativeType(STRING_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(STRING_TYPE), "string", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(STRING_TYPE), "number", true));

    Assert.assertEquals(registry.getNativeType(BOOLEAN_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(BOOLEAN_TYPE), "boolean", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(BOOLEAN_TYPE), "number", true));

    Assert.assertEquals(registry.getNativeType(VOID_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(VOID_TYPE), "undefined", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(VOID_TYPE), "number", true));

    Assert.assertEquals(registry.getNativeType(NULL_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NULL_TYPE), "object", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NULL_TYPE), "number", true));

    Assert.assertEquals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(U2U_CONSTRUCTOR_TYPE), "function", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(U2U_CONSTRUCTOR_TYPE), "object", true));

    Assert.assertEquals(registry.getNativeType(OBJECT_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(OBJECT_TYPE), "object", true));
    Assert.assertEquals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(OBJECT_TYPE), "function", true));

    ObjectType nonFunctionObj = registry.getNativeObjectType(OBJECT_TYPE);
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NUMBER_TYPE), "function", true));

    Assert.assertEquals(registry.getNativeType(NO_OBJECT_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NO_OBJECT_TYPE), "object", true));
    Assert.assertEquals(registry.getNativeType(NO_OBJECT_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NO_OBJECT_TYPE), "function", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NO_OBJECT_TYPE), "number", true));

    Assert.assertEquals(registry.getNativeType(NO_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NO_TYPE), "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_primitivesAndObjects_equalsFalse() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NUMBER_TYPE), "number", false));
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NUMBER_TYPE), "string", false));

    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NULL_TYPE), "object", false));
    Assert.assertEquals(registry.getNativeType(NULL_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NULL_TYPE), "number", false));

    Assert.assertEquals(registry.getNativeType(NO_OBJECT_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NO_OBJECT_TYPE), "number", false));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(registry.getNativeType(NO_OBJECT_TYPE), "object", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_allAndUnknown() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(ALL_TYPE), "number", true));
    Assert.assertEquals(registry.getNativeType(ALL_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(ALL_TYPE), "custom", true));
    Assert.assertEquals(registry.getNativeType(ALL_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(ALL_TYPE), "number", false));

    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(UNKNOWN_TYPE), "number", true));
    Assert.assertEquals(registry.getNativeType(CHECKED_UNKNOWN_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(UNKNOWN_TYPE), "custom", true));
    Assert.assertEquals(registry.getNativeType(CHECKED_UNKNOWN_TYPE),
        interpreter.getRestrictedByTypeOfResult(registry.getNativeType(UNKNOWN_TYPE), "number", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_unionAndEnumAndParameterized() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    JSType union = registry.createUnionType(NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE);
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(union, "number", true));

    JSType multiMatch = interpreter.getRestrictedByTypeOfResult(union, "number", false);
    Assert.assertTrue(multiMatch.isUnionType());

    EnumType enumType = registry.createEnumType("MyEnum", null, registry.getNativeType(NUMBER_TYPE));
    EnumElementType enumElementType = enumType.getElementsType();
    Assert.assertEquals(enumElementType,
        interpreter.getRestrictedByTypeOfResult(enumElementType, "number", true));
    Assert.assertNull(interpreter.getRestrictedByTypeOfResult(enumElementType, "string", true));

    ParameterizedType paramType = registry.createParameterizedType(
        registry.getNativeObjectType(OBJECT_TYPE), registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(paramType,
        interpreter.getRestrictedByTypeOfResult(paramType, "object", true));

    TemplateType templateType = registry.createTemplateType("T");
    Assert.assertEquals(templateType,
        interpreter.getRestrictedByTypeOfResult(templateType, "object", true));
  }

  @Test
  public void testRestrictByVisitorsDirectly() {
    ConcreteInterpreter interpreter = new ConcreteInterpreter(convention, registry);

    ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor trueVisitor =
        interpreter.new RestrictByTrueTypeOfResultVisitor() {
          @Override
          protected JSType caseTopType(JSType topType) {
            return topType;
          }
        };

    Assert.assertNull(trueVisitor.caseNoObjectType());
    Assert.assertNull(trueVisitor.caseBooleanType());
    Assert.assertNull(trueVisitor.caseFunctionType(registry.getNativeFunctionType(U2U_CONSTRUCTOR_TYPE)));
    Assert.assertNull(trueVisitor.caseNullType());
    Assert.assertNull(trueVisitor.caseNumberType());
    Assert.assertNull(trueVisitor.caseObjectType(registry.getNativeObjectType(OBJECT_TYPE)));
    Assert.assertNull(trueVisitor.caseStringType());
    Assert.assertNull(trueVisitor.caseVoidType());

    ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor falseVisitor =
        interpreter.new RestrictByFalseTypeOfResultVisitor() {};

    Assert.assertEquals(registry.getNativeType(NO_OBJECT_TYPE), falseVisitor.caseNoObjectType());
    Assert.assertEquals(registry.getNativeType(BOOLEAN_TYPE), falseVisitor.caseBooleanType());
    Assert.assertEquals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        falseVisitor.caseFunctionType(registry.getNativeFunctionType(U2U_CONSTRUCTOR_TYPE)));
    Assert.assertEquals(registry.getNativeType(NULL_TYPE), falseVisitor.caseNullType());
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE), falseVisitor.caseNumberType());
    Assert.assertEquals(registry.getNativeType(OBJECT_TYPE),
        falseVisitor.caseObjectType(registry.getNativeObjectType(OBJECT_TYPE)));
    Assert.assertEquals(registry.getNativeType(STRING_TYPE), falseVisitor.caseStringType());
    Assert.assertEquals(registry.getNativeType(VOID_TYPE), falseVisitor.caseVoidType());
    Assert.assertEquals(registry.getNativeType(ALL_TYPE), falseVisitor.caseAllType());
    Assert.assertEquals(registry.getNativeType(CHECKED_UNKNOWN_TYPE), falseVisitor.caseUnknownType());
    Assert.assertEquals(registry.getNativeType(NO_TYPE), falseVisitor.caseNoType());

    ParameterizedType paramType = registry.createParameterizedType(
        registry.getNativeObjectType(OBJECT_TYPE), registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(paramType, falseVisitor.caseParameterizedType(paramType));

    TemplateType templateType = registry.createTemplateType("T");
    Assert.assertEquals(templateType, falseVisitor.caseTemplateType(templateType));

    EnumType enumType = registry.createEnumType("MyEnum", null, registry.getNativeType(NUMBER_TYPE));
    EnumElementType enumElementType = enumType.getElementsType();
    Assert.assertEquals(enumElementType, falseVisitor.caseEnumElementType(enumElementType));
  }
}
