package com.google.javascript.jscomp.type;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class ChainableReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private TestInterpreter interpreter1;
  private TestInterpreter interpreter2;
  private TestInterpreter interpreter3;

  private static class SimpleSlot implements StaticSlot<JSType> {
    private final String name;
    private final JSType type;

    SimpleSlot(String name, JSType type) {
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
    public StaticSlot<JSType> getDeclaration() {
      return null;
    }

    @Override
    public JSType getJSType() {
      return type;
    }
  }

  private static class SimpleFlowScope implements FlowScope {
    private final Map<String, StaticSlot<JSType>> slots = new HashMap<>();
    String lastInferredSlot;
    JSType lastInferredType;
    Node lastInferredNode;
    JSType lastInferredOrigType;

    @Override
    public StaticSlot<JSType> getSlot(String name) {
      return slots.get(name);
    }

    @Override
    public StaticSlot<JSType> getOwnSlot(String name) {
      return slots.get(name);
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
    public StaticScope<JSType> getParentScope() {
      return null;
    }

    @Override
    public FlowScope createChildFlowScope() {
      return this;
    }

    @Override
    public FlowScope optimize() {
      return this;
    }

    @Override
    public void inferSlotType(String symbol, JSType type) {
      slots.put(symbol, new SimpleSlot(symbol, type));
      lastInferredSlot = symbol;
      lastInferredType = type;
    }

    @Override
    public void inferQualifiedSlot(
        Node node, String symbol, JSType bottomType, JSType inferredType) {
      slots.put(symbol, new SimpleSlot(symbol, inferredType));
      lastInferredNode = node;
      lastInferredSlot = symbol;
      lastInferredOrigType = bottomType;
      lastInferredType = inferredType;
    }

    @Override
    public StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope) {
      return null;
    }

    @Override
    public void completeScope(StaticScope<JSType> parentScope) {}
  }

  private static class TestInterpreter
      extends ChainableReverseAbstractInterpreter {
    FlowScope preciserScopeResult;

    TestInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry) {
      super(convention, typeRegistry);
    }

    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(
        Node condition, FlowScope blindScope, boolean outcome) {
      return preciserScopeResult != null ? preciserScopeResult : blindScope;
    }
  }

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
    convention = new DefaultCodingConvention();
    interpreter1 = new TestInterpreter(convention, registry);
    interpreter2 = new TestInterpreter(convention, registry);
    interpreter3 = new TestInterpreter(convention, registry);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullConvention_throwsNpe() {
    new TestInterpreter(null, registry);
  }

  @Test
  public void testAppendAndGetFirst_chainingCorrectly() {
    assertSame(interpreter1, interpreter1.getFirst());

    ChainableReverseAbstractInterpreter returned2 = interpreter1.append(interpreter2);
    assertSame(interpreter2, returned2);
    assertSame(interpreter1, interpreter1.getFirst());
    assertSame(interpreter1, interpreter2.getFirst());

    ChainableReverseAbstractInterpreter returned3 = interpreter2.append(interpreter3);
    assertSame(interpreter3, returned3);
    assertSame(interpreter1, interpreter3.getFirst());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAppend_alreadyLinked_throwsException() {
    interpreter1.append(interpreter2);
    // interpreter2 already has a link, appending it to interpreter3 should throw
    interpreter3.append(interpreter2);
  }

  @Test
  public void testFirstPreciserScopeKnowingConditionOutcome_delegatesToFirst() {
    interpreter1.append(interpreter2);
    SimpleFlowScope expectedScope = new SimpleFlowScope();
    interpreter1.preciserScopeResult = expectedScope;

    Node cond = Node.newString(Token.NAME, "x");
    SimpleFlowScope blind = new SimpleFlowScope();

    FlowScope result =
        interpreter2.firstPreciserScopeKnowingConditionOutcome(cond, blind, true);
    assertSame(expectedScope, result);
  }

  @Test
  public void testNextPreciserScopeKnowingConditionOutcome_noNextLink_returnsBlindScope() {
    Node cond = Node.newString(Token.NAME, "x");
    SimpleFlowScope blind = new SimpleFlowScope();

    FlowScope result =
        interpreter1.nextPreciserScopeKnowingConditionOutcome(cond, blind, true);
    assertSame(blind, result);
  }

  @Test
  public void testNextPreciserScopeKnowingConditionOutcome_hasNextLink_delegates() {
    interpreter1.append(interpreter2);
    SimpleFlowScope expectedScope = new SimpleFlowScope();
    interpreter2.preciserScopeResult = expectedScope;

    Node cond = Node.newString(Token.NAME, "x");
    SimpleFlowScope blind = new SimpleFlowScope();

    FlowScope result =
        interpreter1.nextPreciserScopeKnowingConditionOutcome(cond, blind, true);
    assertSame(expectedScope, result);
  }

  @Test
  public void testGetTypeIfRefinable_nameNodeCases() {
    SimpleFlowScope scope = new SimpleFlowScope();
    Node nameNode = Node.newString(Token.NAME, "varName");

    // Case 1: Slot does not exist in scope
    assertNull(interpreter1.getTypeIfRefinable(nameNode, scope));

    // Case 2: Slot exists with type
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    scope.slots.put("varName", new SimpleSlot("varName", numType));
    assertEquals(numType, interpreter1.getTypeIfRefinable(nameNode, scope));

    // Case 3: Slot exists with null type, node has JSType
    scope.slots.put("varName", new SimpleSlot("varName", null));
    nameNode.setJSType(registry.getNativeType(STRING_TYPE));
    assertEquals(
        registry.getNativeType(STRING_TYPE),
        interpreter1.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetTypeIfRefinable_getPropNodeCases() {
    SimpleFlowScope scope = new SimpleFlowScope();

    // GETPROP with non-qualified name (e.g. [1 + 2].b)
    Node nonQualGetProp =
        new Node(Token.GETPROP, new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2)),
            Node.newString("b"));
    assertNull(interpreter1.getTypeIfRefinable(nonQualGetProp, scope));

    // GETPROP with qualified name (a.b)
    Node getPropNode =
        new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("b"));

    // Case 1: Slot exists with type
    JSType strType = registry.getNativeType(STRING_TYPE);
    scope.slots.put("a.b", new SimpleSlot("a.b", strType));
    assertEquals(strType, interpreter1.getTypeIfRefinable(getPropNode, scope));

    // Case 2: Slot exists with null type, node has type
    scope.slots.put("a.b", new SimpleSlot("a.b", null));
    getPropNode.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    assertEquals(
        registry.getNativeType(BOOLEAN_TYPE),
        interpreter1.getTypeIfRefinable(getPropNode, scope));

    // Case 3: Slot does not exist, node has type
    scope.slots.remove("a.b");
    getPropNode.setJSType(registry.getNativeType(NUMBER_TYPE));
    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getTypeIfRefinable(getPropNode, scope));

    // Case 4: Slot does not exist, node has null type -> UNKNOWN_TYPE
    getPropNode.setJSType(null);
    assertEquals(
        registry.getNativeType(UNKNOWN_TYPE),
        interpreter1.getTypeIfRefinable(getPropNode, scope));

    // Case 5: Other token node
    Node otherNode = Node.newNumber(42);
    assertNull(interpreter1.getTypeIfRefinable(otherNode, scope));
  }

  @Test
  public void testDeclareNameInScope_nameNode() {
    SimpleFlowScope scope = new SimpleFlowScope();
    Node nameNode = Node.newString(Token.NAME, "foo");
    JSType strType = registry.getNativeType(STRING_TYPE);

    interpreter1.declareNameInScope(scope, nameNode, strType);
    assertEquals("foo", scope.lastInferredSlot);
    assertEquals(strType, scope.lastInferredType);
  }

  @Test
  public void testDeclareNameInScope_getPropNode() {
    SimpleFlowScope scope = new SimpleFlowScope();
    Node getPropNode =
        new Node(Token.GETPROP, Node.newString(Token.NAME, "foo"), Node.newString("bar"));
    JSType numType = registry.getNativeType(NUMBER_TYPE);

    // Case 1: Node has JSType
    JSType origType = registry.getNativeType(BOOLEAN_TYPE);
    getPropNode.setJSType(origType);
    interpreter1.declareNameInScope(scope, getPropNode, numType);
    assertEquals("foo.bar", scope.lastInferredSlot);
    assertEquals(origType, scope.lastInferredOrigType);
    assertEquals(numType, scope.lastInferredType);

    // Case 2: Node has null JSType -> defaults to UNKNOWN_TYPE
    getPropNode.setJSType(null);
    interpreter1.declareNameInScope(scope, getPropNode, numType);
    assertEquals(
        registry.getNativeType(UNKNOWN_TYPE), scope.lastInferredOrigType);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDeclareNameInScope_invalidNode_throwsException() {
    SimpleFlowScope scope = new SimpleFlowScope();
    Node numberNode = Node.newNumber(123);
    interpreter1.declareNameInScope(
        scope, numberNode, registry.getNativeType(NUMBER_TYPE));
  }

  @Test
  public void testGetRestrictedWithoutUndefined() {
    assertNull(interpreter1.getRestrictedWithoutUndefined(null));
    assertNull(
        interpreter1.getRestrictedWithoutUndefined(registry.getNativeType(VOID_TYPE)));

    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getRestrictedWithoutUndefined(
            registry.getNativeType(NUMBER_TYPE)));
    assertEquals(
        registry.getNativeType(STRING_TYPE),
        interpreter1.getRestrictedWithoutUndefined(
            registry.getNativeType(STRING_TYPE)));
    assertEquals(
        registry.getNativeType(BOOLEAN_TYPE),
        interpreter1.getRestrictedWithoutUndefined(
            registry.getNativeType(BOOLEAN_TYPE)));
    assertEquals(
        registry.getNativeType(NULL_TYPE),
        interpreter1.getRestrictedWithoutUndefined(
            registry.getNativeType(NULL_TYPE)));
    assertEquals(
        registry.getNativeType(NO_OBJECT_TYPE),
        interpreter1.getRestrictedWithoutUndefined(
            registry.getNativeType(NO_OBJECT_TYPE)));
    assertEquals(
        registry.getNativeType(NO_TYPE),
        interpreter1.getRestrictedWithoutUndefined(
            registry.getNativeType(NO_TYPE)));
    assertEquals(
        registry.getNativeType(UNKNOWN_TYPE),
        interpreter1.getRestrictedWithoutUndefined(
            registry.getNativeType(UNKNOWN_TYPE)));

    FunctionType fnType =
        registry.createFunctionType(registry.getNativeType(NUMBER_TYPE));
    assertSame(fnType, interpreter1.getRestrictedWithoutUndefined(fnType));

    ObjectType objType = registry.getNativeType(OBJECT_TYPE).toObjectType();
    assertSame(objType, interpreter1.getRestrictedWithoutUndefined(objType));

    // AllType
    JSType restrictedAll =
        interpreter1.getRestrictedWithoutUndefined(registry.getNativeType(ALL_TYPE));
    assertNotNull(restrictedAll);

    // Union with void
    UnionType unionWithVoid =
        (UnionType)
            registry.createUnionType(
                registry.getNativeType(NUMBER_TYPE), registry.getNativeType(VOID_TYPE));
    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getRestrictedWithoutUndefined(unionWithVoid));

    // ParameterizedType
    ParameterizedType paramType =
        registry.createParameterizedType(objType, registry.getNativeType(NUMBER_TYPE));
    assertEquals(paramType, interpreter1.getRestrictedWithoutUndefined(paramType));

    // TemplateType
    TemplateType templateType = registry.createTemplateType("T");
    assertEquals(templateType, interpreter1.getRestrictedWithoutUndefined(templateType));

    // EnumElementType
    EnumType enumType =
        registry.createEnumType("MyEnum", null, registry.getNativeType(NUMBER_TYPE));
    EnumElementType enumElem = enumType.getElementsType();
    assertEquals(enumElem, interpreter1.getRestrictedWithoutUndefined(enumElem));

    EnumType voidEnumType =
        registry.createEnumType("VoidEnum", null, registry.getNativeType(VOID_TYPE));
    EnumElementType voidEnumElem = voidEnumType.getElementsType();
    assertNull(interpreter1.getRestrictedWithoutUndefined(voidEnumElem));
  }

  @Test
  public void testGetRestrictedWithoutNull() {
    assertNull(interpreter1.getRestrictedWithoutNull(null));
    assertNull(
        interpreter1.getRestrictedWithoutNull(registry.getNativeType(NULL_TYPE)));

    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getRestrictedWithoutNull(
            registry.getNativeType(NUMBER_TYPE)));
    assertEquals(
        registry.getNativeType(STRING_TYPE),
        interpreter1.getRestrictedWithoutNull(
            registry.getNativeType(STRING_TYPE)));
    assertEquals(
        registry.getNativeType(BOOLEAN_TYPE),
        interpreter1.getRestrictedWithoutNull(
            registry.getNativeType(BOOLEAN_TYPE)));
    assertEquals(
        registry.getNativeType(VOID_TYPE),
        interpreter1.getRestrictedWithoutNull(
            registry.getNativeType(VOID_TYPE)));
    assertEquals(
        registry.getNativeType(NO_OBJECT_TYPE),
        interpreter1.getRestrictedWithoutNull(
            registry.getNativeType(NO_OBJECT_TYPE)));
    assertEquals(
        registry.getNativeType(NO_TYPE),
        interpreter1.getRestrictedWithoutNull(
            registry.getNativeType(NO_TYPE)));
    assertEquals(
        registry.getNativeType(UNKNOWN_TYPE),
        interpreter1.getRestrictedWithoutNull(
            registry.getNativeType(UNKNOWN_TYPE)));

    FunctionType fnType =
        registry.createFunctionType(registry.getNativeType(NUMBER_TYPE));
    assertSame(fnType, interpreter1.getRestrictedWithoutNull(fnType));

    ObjectType objType = registry.getNativeType(OBJECT_TYPE).toObjectType();
    assertSame(objType, interpreter1.getRestrictedWithoutNull(objType));

    // AllType
    JSType restrictedAll =
        interpreter1.getRestrictedWithoutNull(registry.getNativeType(ALL_TYPE));
    assertNotNull(restrictedAll);

    // Union with null
    UnionType unionWithNull =
        (UnionType)
            registry.createUnionType(
                registry.getNativeType(NUMBER_TYPE), registry.getNativeType(NULL_TYPE));
    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getRestrictedWithoutNull(unionWithNull));

    // ParameterizedType
    ParameterizedType paramType =
        registry.createParameterizedType(objType, registry.getNativeType(NUMBER_TYPE));
    assertEquals(paramType, interpreter1.getRestrictedWithoutNull(paramType));

    // TemplateType
    TemplateType templateType = registry.createTemplateType("T2");
    assertEquals(templateType, interpreter1.getRestrictedWithoutNull(templateType));

    // EnumElementType
    EnumType enumType =
        registry.createEnumType("MyEnum2", null, registry.getNativeType(NUMBER_TYPE));
    EnumElementType enumElem = enumType.getElementsType();
    assertEquals(enumElem, interpreter1.getRestrictedWithoutNull(enumElem));

    EnumType nullEnumType =
        registry.createEnumType("NullEnum", null, registry.getNativeType(NULL_TYPE));
    EnumElementType nullEnumElem = nullEnumType.getElementsType();
    assertNull(interpreter1.getRestrictedWithoutNull(nullEnumElem));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_nullType() {
    // resultEqualsValue == true
    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getRestrictedByTypeOfResult(null, "number", true));
    assertEquals(
        registry.getNativeType(BOOLEAN_TYPE),
        interpreter1.getRestrictedByTypeOfResult(null, "boolean", true));
    assertEquals(
        registry.getNativeType(STRING_TYPE),
        interpreter1.getRestrictedByTypeOfResult(null, "string", true));
    assertEquals(
        registry.getNativeType(VOID_TYPE),
        interpreter1.getRestrictedByTypeOfResult(null, "undefined", true));
    assertEquals(
        registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        interpreter1.getRestrictedByTypeOfResult(null, "function", true));
    assertEquals(
        registry.getNativeType(UNKNOWN_TYPE),
        interpreter1.getRestrictedByTypeOfResult(null, "other", true));

    // resultEqualsValue == false
    assertNull(interpreter1.getRestrictedByTypeOfResult(null, "number", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_primitives() {
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    assertEquals(
        numType, interpreter1.getRestrictedByTypeOfResult(numType, "number", true));
    assertNull(interpreter1.getRestrictedByTypeOfResult(numType, "number", false));
    assertNull(interpreter1.getRestrictedByTypeOfResult(numType, "string", true));
    assertEquals(
        numType, interpreter1.getRestrictedByTypeOfResult(numType, "string", false));

    JSType strType = registry.getNativeType(STRING_TYPE);
    assertEquals(
        strType, interpreter1.getRestrictedByTypeOfResult(strType, "string", true));
    assertNull(interpreter1.getRestrictedByTypeOfResult(strType, "string", false));

    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);
    assertEquals(
        boolType, interpreter1.getRestrictedByTypeOfResult(boolType, "boolean", true));
    assertNull(interpreter1.getRestrictedByTypeOfResult(boolType, "boolean", false));

    JSType voidType = registry.getNativeType(VOID_TYPE);
    assertEquals(
        voidType, interpreter1.getRestrictedByTypeOfResult(voidType, "undefined", true));
    assertNull(interpreter1.getRestrictedByTypeOfResult(voidType, "undefined", false));

    JSType nullType = registry.getNativeType(NULL_TYPE);
    assertEquals(
        nullType, interpreter1.getRestrictedByTypeOfResult(nullType, "object", true));
    assertNull(interpreter1.getRestrictedByTypeOfResult(nullType, "object", false));
    assertNull(interpreter1.getRestrictedByTypeOfResult(nullType, "number", true));

    JSType noType = registry.getNativeType(NO_TYPE);
    assertEquals(
        noType, interpreter1.getRestrictedByTypeOfResult(noType, "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_objectsAndFunctions() {
    FunctionType fnType =
        registry.createFunctionType(registry.getNativeType(NUMBER_TYPE));
    assertEquals(
        fnType, interpreter1.getRestrictedByTypeOfResult(fnType, "function", true));
    assertNull(interpreter1.getRestrictedByTypeOfResult(fnType, "function", false));
    assertNull(interpreter1.getRestrictedByTypeOfResult(fnType, "object", true));
    assertEquals(
        fnType, interpreter1.getRestrictedByTypeOfResult(fnType, "object", false));

    ObjectType objType = registry.getNativeType(OBJECT_TYPE).toObjectType();
    assertEquals(
        objType, interpreter1.getRestrictedByTypeOfResult(objType, "object", true));
    assertNull(interpreter1.getRestrictedByTypeOfResult(objType, "object", false));

    // Object restricted by "function"
    assertEquals(
        registry.getNativeType(U2U_CONSTRUCTOR_TYPE),
        interpreter1.getRestrictedByTypeOfResult(objType, "function", true));
    assertNull(
        interpreter1.getRestrictedByTypeOfResult(objType, "function", false));

    // Non-subtypable object restricted by "function"
    ObjectType nonSubtypeObj =
        registry.createAnonymousObjectType();
    // Anonymous object is not a supertype of constructor type in some cases or is; test both
    JSType fnRestrict =
        interpreter1.getRestrictedByTypeOfResult(nonSubtypeObj, "function", true);
    assertTrue(fnRestrict == null || fnRestrict.isConstructor());

    // NoObjectType
    JSType noObjType = registry.getNativeType(NO_OBJECT_TYPE);
    assertEquals(
        noObjType,
        interpreter1.getRestrictedByTypeOfResult(noObjType, "object", true));
    assertEquals(
        noObjType,
        interpreter1.getRestrictedByTypeOfResult(noObjType, "function", true));
    assertNull(
        interpreter1.getRestrictedByTypeOfResult(noObjType, "string", true));
    assertNull(
        interpreter1.getRestrictedByTypeOfResult(noObjType, "object", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_allAndUnknown() {
    JSType allType = registry.getNativeType(ALL_TYPE);
    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getRestrictedByTypeOfResult(allType, "number", true));
    assertEquals(
        allType, interpreter1.getRestrictedByTypeOfResult(allType, "number", false));
    assertEquals(
        allType, interpreter1.getRestrictedByTypeOfResult(allType, "unknownVal", true));

    JSType unknownType = registry.getNativeType(UNKNOWN_TYPE);
    assertEquals(
        registry.getNativeType(STRING_TYPE),
        interpreter1.getRestrictedByTypeOfResult(unknownType, "string", true));
    assertEquals(
        unknownType,
        interpreter1.getRestrictedByTypeOfResult(unknownType, "string", false));
    assertEquals(
        unknownType,
        interpreter1.getRestrictedByTypeOfResult(unknownType, "custom", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_unionAndEnumAndGenericTypes() {
    JSType union =
        registry.createUnionType(
            registry.getNativeType(NUMBER_TYPE), registry.getNativeType(STRING_TYPE));
    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        interpreter1.getRestrictedByTypeOfResult(union, "number", true));
    assertEquals(
        registry.getNativeType(STRING_TYPE),
        interpreter1.getRestrictedByTypeOfResult(union, "number", false));
    assertNull(interpreter1.getRestrictedByTypeOfResult(union, "boolean", true));

    // EnumElementType
    EnumType enumType =
        registry.createEnumType("NumEnum", null, registry.getNativeType(NUMBER_TYPE));
    EnumElementType enumElem = enumType.getElementsType();
    assertEquals(
        enumElem, interpreter1.getRestrictedByTypeOfResult(enumElem, "number", true));
    assertNull(
        interpreter1.getRestrictedByTypeOfResult(enumElem, "string", true));

    // ParameterizedType & TemplateType
    ObjectType objType = registry.getNativeType(OBJECT_TYPE).toObjectType();
    ParameterizedType paramType =
        registry.createParameterizedType(objType, registry.getNativeType(NUMBER_TYPE));
    assertEquals(
        paramType, interpreter1.getRestrictedByTypeOfResult(paramType, "object", true));

    TemplateType templateType = registry.createTemplateType("T3");
    assertEquals(
        templateType,
        interpreter1.getRestrictedByTypeOfResult(templateType, "object", true));
  }

  @Test
  public void testRestrictByTrueTypeOfResultVisitor_coverage() {
    ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor visitor =
        interpreter1.new RestrictByTrueTypeOfResultVisitor() {
          @Override
          protected JSType caseTopType(JSType topType) {
            return topType;
          }
        };

    assertNull(visitor.caseNoObjectType());
    assertNull(visitor.caseBooleanType());
    assertNull(visitor.caseFunctionType(
        registry.createFunctionType(registry.getNativeType(NUMBER_TYPE))));
    assertNull(visitor.caseNullType());
    assertNull(visitor.caseNumberType());
    assertNull(visitor.caseObjectType(
        registry.getNativeType(OBJECT_TYPE).toObjectType()));
    assertNull(visitor.caseStringType());
    assertNull(visitor.caseVoidType());

    assertEquals(
        registry.getNativeType(ALL_TYPE), visitor.caseAllType());
    assertEquals(
        registry.getNativeType(UNKNOWN_TYPE), visitor.caseUnknownType());
    assertEquals(
        registry.getNativeType(NO_TYPE), visitor.caseNoType());

    ObjectType objType = registry.getNativeType(OBJECT_TYPE).toObjectType();
    ParameterizedType paramType =
        registry.createParameterizedType(objType, registry.getNativeType(NUMBER_TYPE));
    assertNull(visitor.caseParameterizedType(paramType));

    TemplateType templateType = registry.createTemplateType("T4");
    assertNull(visitor.caseTemplateType(templateType));
  }

  @Test
  public void testRestrictByFalseTypeOfResultVisitor_coverage() {
    ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor visitor =
        interpreter1.new RestrictByFalseTypeOfResultVisitor() {};

    assertEquals(
        registry.getNativeType(NO_OBJECT_TYPE), visitor.caseNoObjectType());
    assertEquals(
        registry.getNativeType(BOOLEAN_TYPE), visitor.caseBooleanType());

    FunctionType fnType =
        registry.createFunctionType(registry.getNativeType(NUMBER_TYPE));
    assertSame(fnType, visitor.caseFunctionType(fnType));

    assertEquals(registry.getNativeType(NULL_TYPE), visitor.caseNullType());
    assertEquals(registry.getNativeType(NUMBER_TYPE), visitor.caseNumberType());

    ObjectType objType = registry.getNativeType(OBJECT_TYPE).toObjectType();
    assertSame(objType, visitor.caseObjectType(objType));

    assertEquals(registry.getNativeType(STRING_TYPE), visitor.caseStringType());
    assertEquals(registry.getNativeType(VOID_TYPE), visitor.caseVoidType());

    assertEquals(registry.getNativeType(ALL_TYPE), visitor.caseAllType());
    assertEquals(registry.getNativeType(UNKNOWN_TYPE), visitor.caseUnknownType());
    assertEquals(registry.getNativeType(NO_TYPE), visitor.caseNoType());

    ParameterizedType paramType =
        registry.createParameterizedType(objType, registry.getNativeType(NUMBER_TYPE));
    assertSame(paramType, visitor.caseParameterizedType(paramType));

    TemplateType templateType = registry.createTemplateType("T5");
    assertSame(templateType, visitor.caseTemplateType(templateType));

    assertEquals(
        registry.getNativeType(NUMBER_TYPE),
        visitor.caseTopType(registry.getNativeType(NUMBER_TYPE)));
  }
}
