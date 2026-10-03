package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JSTypeRegistryTest {

  private TestErrorReporter errorReporter;
  private JSTypeRegistry registry;

  private static class TestErrorReporter implements ErrorReporter {
    List<String> warnings = new ArrayList<String>();
    List<String> errors = new ArrayList<String>();

    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {
      errors.add(message);
    }
  }

  private static class SimpleScope implements StaticScope<JSType> {
    private final StaticScope<JSType> parent;
    private final Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();

    SimpleScope(StaticScope<JSType> parent) {
      this.parent = parent;
    }

    @Override
    public Node getRootNode() {
      return null;
    }

    @Override
    public StaticScope<JSType> getParentScope() {
      return parent;
    }

    @Override
    public StaticSlot<JSType> getSlot(String name) {
      if (slots.containsKey(name)) {
        return slots.get(name);
      }
      return parent != null ? parent.getSlot(name) : null;
    }

    @Override
    public StaticSlot<JSType> getOwnSlot(String name) {
      return slots.get(name);
    }

    @Override
    public JSType getTypeOfThis() {
      return null;
    }
  }

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
  }

  @Test
  public void testConstructorsAndBasicGetters() {
    JSTypeRegistry reg1 = new JSTypeRegistry(errorReporter);
    assertFalse(reg1.shouldTolerateUndefinedValues());
    assertSame(errorReporter, reg1.getErrorReporter());

    JSTypeRegistry reg2 = new JSTypeRegistry(errorReporter, true);
    assertTrue(reg2.shouldTolerateUndefinedValues());

    assertEquals(ResolveMode.LAZY_NAMES, reg1.getResolveMode());
    reg1.setResolveMode(ResolveMode.IMMEDIATE);
    assertEquals(ResolveMode.IMMEDIATE, reg1.getResolveMode());
    reg1.setResolveMode(ResolveMode.LAZY_EXPRESSIONS);
    assertEquals(ResolveMode.LAZY_EXPRESSIONS, reg1.getResolveMode());
  }

  @Test
  public void testResetForTypeCheck() {
    registry.declareType("CustomType", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertNotNull(registry.getType("CustomType"));
    registry.resetForTypeCheck();
    assertNull(registry.getType("CustomType"));
    assertNotNull(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
  }

  @Test
  public void testDeclareAndOverwriteType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    assertTrue(registry.declareType("foo.bar.Baz", numberType));
    assertFalse(registry.declareType("foo.bar.Baz", stringType));
    assertTrue(registry.hasNamespace("foo.bar"));
    assertTrue(registry.hasNamespace("foo"));
    assertFalse(registry.hasNamespace("baz"));

    registry.overwriteDeclaredType("foo.bar.Baz", stringType);
    assertEquals(stringType, registry.getType("foo.bar.Baz"));

    try {
      registry.overwriteDeclaredType("non.existent.Type", stringType);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test
  public void testForwardDeclareType() {
    assertFalse(registry.isForwardDeclaredType("ForwardType"));
    registry.forwardDeclareType("ForwardType");
    assertTrue(registry.isForwardDeclaredType("ForwardType"));
  }

  @Test
  public void testTemplateTypeName() {
    assertNull(registry.getType("T"));
    registry.setTemplateTypeName("T");
    JSType templateType = registry.getType("T");
    assertNotNull(templateType);
    assertTrue(templateType.isTemplateType());

    registry.clearTemplateTypeName();
    assertNull(registry.getType("T"));
  }

  @Test
  public void testGetNativeTypes() {
    assertNotNull(registry.getNativeType(JSTypeNative.ALL_TYPE));
    assertNotNull(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    assertNotNull(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE));
    assertNotNull(registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE).getConstructor());
  }

  @Test
  public void testRegisterAndUnregisterPropertyOnType() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    registry.registerPropertyOnType("myProp", objType);

    Iterable<JSType> typesWithProp = registry.getTypesWithProperty("myProp");
    assertTrue(typesWithProp.iterator().hasNext());

    Iterable<ObjectType> refTypes = registry.getEachReferenceTypeWithProperty("myProp");
    assertTrue(refTypes.iterator().hasNext());

    assertTrue(registry.canPropertyBeDefined(objType, "myProp"));
    assertFalse(registry.canPropertyBeDefined(objType, "nonExistentProp"));

    JSType greatestSub = registry.getGreatestSubtypeWithProperty(objType, "myProp");
    assertNotNull(greatestSub);

    // Calling twice for greatestSubtypeByProperty cache hit
    JSType greatestSubCached = registry.getGreatestSubtypeWithProperty(objType, "myProp");
    assertSame(greatestSub, greatestSubCached);

    JSType noTypeProp = registry.getGreatestSubtypeWithProperty(objType, "nonExistentProp");
    assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), noTypeProp);

    registry.unregisterPropertyOnType("myProp", objType);
    registry.unregisterPropertyOnType("nonExistentProp", objType);

    assertFalse(registry.getTypesWithProperty("unknownProp").iterator().hasNext());
    assertFalse(registry.getEachReferenceTypeWithProperty("unknownProp").iterator().hasNext());
  }

  @Test
  public void testRegisterPropertyOnUnionAndNamedType() {
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    JSType union = registry.createUnionType(numType, objType);

    registry.registerPropertyOnType("unionProp", union);
    assertTrue(registry.canPropertyBeDefined(objType, "unionProp"));

    NamedType namedType = new NamedType(registry, "Object", "test.js", 1, 0);
    namedType.resolve(errorReporter, new SimpleScope(null));
    registry.registerPropertyOnType("namedProp", namedType);
    assertTrue(registry.getEachReferenceTypeWithProperty("namedProp").iterator().hasNext());
  }

  @Test
  public void testFindCommonSuperObject() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    ObjectType dateType = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);

    ObjectType common1 = registry.findCommonSuperObject(arrayType, dateType);
    assertEquals(objType, common1);

    ObjectType common2 = registry.findCommonSuperObject(arrayType, arrayType);
    assertEquals(arrayType, common2);
  }

  @Test
  public void testGenerations() {
    assertTrue(registry.isLastGeneration());
    registry.setLastGeneration(false);
    assertFalse(registry.isLastGeneration());

    SimpleScope scope = new SimpleScope(null);
    JSType type = registry.getType(scope, "UnresolvedType", "test.js", 1, 0);
    assertTrue(type instanceof NamedType);

    registry.resolveTypesInScope(scope);
    registry.incrementGeneration();
    registry.clearNamedTypes();
  }

  @Test
  public void testInterfaceImplementors() {
    ObjectType iface = registry.createObjectType("CustomInterface", null, null);
    FunctionType ctor = registry.createConstructorType(registry.getNativeType(JSTypeNative.VOID_TYPE));

    registry.registerTypeImplementingInterface(ctor, iface);
    assertTrue(registry.getDirectImplementors(iface).contains(ctor));
  }

  @Test
  public void testCreateOptionalAndNullableTypes() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);

    assertSame(unknown, registry.createOptionalType(unknown));
    assertSame(all, registry.createOptionalType(all));

    JSType optNum = registry.createOptionalType(num);
    assertTrue(optNum.isUnionType());

    JSType nullNum = registry.createNullableType(num);
    assertTrue(nullNum.isUnionType());

    JSType optNullNum = registry.createOptionalNullableType(num);
    assertTrue(optNullNum.isUnionType());

    JSType defObj1 = registry.createDefaultObjectUnion(num);
    assertTrue(defObj1.isUnionType());

    JSTypeRegistry tolerantRegistry = new JSTypeRegistry(errorReporter, true);
    JSType defObj2 = tolerantRegistry.createDefaultObjectUnion(num);
    assertTrue(defObj2.isUnionType());
  }

  @Test
  public void testCreateUnionTypeVariants() {
    JSType u1 = registry.createUnionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    assertTrue(u1.isUnionType());

    JSType u2 = registry.createUnionType(
        JSTypeNative.NUMBER_TYPE,
        JSTypeNative.STRING_TYPE);
    assertTrue(u2.isUnionType());
  }

  @Test
  public void testCreateEnumType() {
    EnumType enumType = registry.createEnumType("MyEnum", null, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertNotNull(enumType);
    assertEquals("MyEnum", enumType.getDisplayName());
  }

  @Test
  public void testCreateFunctionTypeVariations() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);
    ObjectType obj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    FunctionType ft1 = registry.createFunctionType(num, str);
    assertNotNull(ft1);

    FunctionType ft2 = registry.createFunctionType(num, Lists.newArrayList(str));
    assertNotNull(ft2);

    FunctionType ft3 = registry.createFunctionTypeWithVarArgs(num, str);
    assertNotNull(ft3);

    FunctionType ft4 = registry.createFunctionTypeWithVarArgs(num, Lists.newArrayList(str));
    assertNotNull(ft4);

    FunctionType ft5 = registry.createFunctionType(num, true, str);
    assertNotNull(ft5);

    FunctionType ft6 = registry.createFunctionType(num, false, str);
    assertNotNull(ft6);

    FunctionType ft7 = registry.createFunctionType(num, (Node) null);
    assertNotNull(ft7);

    JSType ft8 = registry.createFunctionType(obj, num, Lists.newArrayList(str));
    assertNotNull(ft8);

    JSType ft9 = registry.createFunctionTypeWithVarArgs(obj, num, Lists.newArrayList(str));
    assertNotNull(ft9);

    FunctionType ftNewReturn = registry.createFunctionTypeWithNewReturnType(ft1, str);
    assertEquals(str, ftNewReturn.getReturnType());

    FunctionType ftNewThis = registry.createFunctionTypeWithNewThisType(ft1, obj);
    assertEquals(obj, ftNewThis.getTypeOfThis());
  }

  @Test
  public void testCreateConstructorTypeVariations() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);

    FunctionType ctor1 = registry.createConstructorType(num, str);
    assertTrue(ctor1.isConstructor());

    FunctionType ctor2 = registry.createConstructorTypeWithVarArgs(num, str);
    assertTrue(ctor2.isConstructor());

    FunctionType ctor3 = registry.createConstructorType(num, true, str);
    assertTrue(ctor3.isConstructor());

    FunctionType ctor4 = registry.createConstructorType(num, false, str);
    assertTrue(ctor4.isConstructor());
  }

  @Test
  public void testCreateParametersVariations() {
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);

    Node p1 = registry.createParameters(ImmutableList.of(num, str));
    assertEquals(2, p1.getChildCount());

    Node p2 = registry.createParametersWithVarArgs(ImmutableList.of(num, str));
    assertEquals(2, p2.getChildCount());

    Node p3 = registry.createOptionalParameters(num, str);
    assertEquals(2, p3.getChildCount());

    Node p4 = registry.createParameters(num, str);
    assertEquals(2, p4.getChildCount());

    Node p5 = registry.createParametersWithVarArgs(num, str);
    assertEquals(2, p5.getChildCount());
  }

  @Test
  public void testObjectCreationAndModification() {
    ObjectType proto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ObjectType customObj1 = registry.createObjectType(proto);
    assertNotNull(customObj1);

    ObjectType customObj2 = registry.createObjectType("MyNamedObj", null, proto);
    assertEquals("MyNamedObj", customObj2.getReferenceName());

    ObjectType anonObj = registry.createAnonymousObjectType();
    assertNotNull(anonObj);

    ObjectType nativeAnon = registry.createNativeAnonymousObjectType();
    assertNotNull(nativeAnon);

    assertTrue(registry.resetImplicitPrototype(customObj1, anonObj));
    assertFalse(registry.resetImplicitPrototype(registry.getNativeType(JSTypeNative.NUMBER_TYPE), anonObj));

    FunctionType iface = registry.createInterfaceType("MyInterface", null);
    assertTrue(iface.isInterface());

    ParameterizedType paramType = registry.createParameterizedType(
        registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    assertNotNull(paramType);

    JSType namedType = registry.createNamedType("SomeType", "test.js", 10, 5);
    assertNotNull(namedType);

    Map<String, RecordProperty> propMap = new HashMap<String, RecordProperty>();
    propMap.put("prop1", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
    RecordType recordType = registry.createRecordType(propMap);
    assertNotNull(recordType);
  }

  @Test
  public void testIdentifyNonNullableName() {
    try {
      registry.identifyNonNullableName(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // expected
    }
    registry.identifyNonNullableName("NonNullableCustom");
  }

  @Test
  public void testResolveTypesInScopeGlobalThisWithWindow() {
    SimpleScope rootScope = new SimpleScope(null);
    registry.declareType("Window", registry.createAnonymousObjectType());
    registry.resolveTypesInScope(rootScope);

    SimpleScope childScope = new SimpleScope(rootScope);
    registry.resolveTypesInScope(childScope);
  }

  @Test
  public void testCreateFromTypeNodesLazyExpressions() {
    registry.setResolveMode(ResolveMode.LAZY_EXPRESSIONS);
    Node starNode = new Node(Token.STAR);
    JSType starType = registry.createFromTypeNodes(starNode, "test.js", null);
    assertEquals(registry.getNativeType(JSTypeNative.ALL_TYPE), starType);

    Node stringNode = Node.newString(Token.STRING, "SomeType");
    JSType unresolvedExpr = registry.createFromTypeNodes(stringNode, "test.js", null);
    assertTrue(unresolvedExpr instanceof UnresolvedTypeExpression);
  }

  @Test
  public void testCreateFromTypeNodesAllTokens() {
    registry.setResolveMode(ResolveMode.IMMEDIATE);
    SimpleScope scope = new SimpleScope(null);

    // Token.BANG
    Node bangNode = new Node(Token.BANG, Node.newString(Token.STRING, "Object"));
    JSType bangType = registry.createFromTypeNodes(bangNode, "test.js", scope);
    assertFalse(bangType.isNullable());

    // Token.QMARK (unary & nullary)
    Node qmarkNullary = new Node(Token.QMARK);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE),
        registry.createFromTypeNodes(qmarkNullary, "test.js", scope));

    Node qmarkUnary = new Node(Token.QMARK, Node.newString(Token.STRING, "number"));
    assertTrue(registry.createFromTypeNodes(qmarkUnary, "test.js", scope).isNullable());

    // Token.EQUALS
    Node equalsNode = new Node(Token.EQUALS, Node.newString(Token.STRING, "number"));
    assertTrue(registry.createFromTypeNodes(equalsNode, "test.js", scope).isUnionType());

    // Token.ELLIPSIS
    Node ellipsisNode = new Node(Token.ELLIPSIS, Node.newString(Token.STRING, "number"));
    assertTrue(registry.createFromTypeNodes(ellipsisNode, "test.js", scope).isUnionType());

    // Token.STAR
    Node starNode = new Node(Token.STAR);
    assertEquals(registry.getNativeType(JSTypeNative.ALL_TYPE),
        registry.createFromTypeNodes(starNode, "test.js", scope));

    // Token.LB
    Node lbNode = new Node(Token.LB);
    assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE),
        registry.createFromTypeNodes(lbNode, "test.js", scope));

    // Token.PIPE
    Node pipeNode = new Node(Token.PIPE,
        Node.newString(Token.STRING, "number"),
        Node.newString(Token.STRING, "string"));
    assertTrue(registry.createFromTypeNodes(pipeNode, "test.js", scope).isUnionType());

    // Token.EMPTY
    Node emptyNode = new Node(Token.EMPTY);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE),
        registry.createFromTypeNodes(emptyNode, "test.js", scope));

    // Token.VOID
    Node voidNode = new Node(Token.VOID);
    assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE),
        registry.createFromTypeNodes(voidNode, "test.js", scope));
  }

  @Test
  public void testCreateFromTypeNodesRecords() {
    SimpleScope scope = new SimpleScope(null);

    // Record with colon, without colon, quotes, duplicate fields
    Node colonField = new Node(Token.COLON, Node.newString(Token.NAME, "foo"), Node.newString(Token.STRING, "number"));
    Node quotedField = new Node(Token.COLON, Node.newString(Token.NAME, "'bar'"), Node.newString(Token.STRING, "string"));
    Node dblQuotedField = new Node(Token.COLON, Node.newString(Token.NAME, "\"baz\""), Node.newString(Token.STRING, "boolean"));
    Node noTypeField = Node.newString(Token.NAME, "qux");
    Node duplicateField = new Node(Token.COLON, Node.newString(Token.NAME, "foo"), Node.newString(Token.STRING, "number"));

    Node recordNode = new Node(Token.LC, colonField, quotedField, dblQuotedField, noTypeField, duplicateField);
    JSType recordType = registry.createFromTypeNodes(recordNode, "test.js", scope);
    assertTrue(recordType.isRecordType());
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testCreateFromTypeNodesParameterizedAndIndexedTypes() {
    SimpleScope scope = new SimpleScope(null);

    // Array<number>
    Node arrayNode = Node.newString(Token.STRING, "Array");
    Node arrayParam = new Node(Token.BLOCK, Node.newString(Token.STRING, "number"));
    arrayNode.addChildToFront(arrayParam);
    JSType arrayType = registry.createFromTypeNodes(arrayNode, "test.js", scope);
    assertNotNull(arrayType);

    // Object<string, number>
    Node objNode = Node.newString(Token.STRING, "Object");
    Node objParams = new Node(Token.BLOCK,
        Node.newString(Token.STRING, "string"),
        Node.newString(Token.STRING, "number"));
    objNode.addChildToFront(objParams);
    JSType indexedType = registry.createFromTypeNodes(objNode, "test.js", scope);
    assertNotNull(indexedType);

    // NonNullable identifier check
    registry.identifyNonNullableName("MyNonNullable");
    registry.declareType("MyNonNullable", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    Node nonNullNode = Node.newString(Token.STRING, "MyNonNullable");
    JSType nonNullResult = registry.createFromTypeNodes(nonNullNode, "test.js", scope);
    assertFalse(nonNullResult.isUnionType());
  }

  @Test
  public void testCreateFromTypeNodesFunctionType() {
    SimpleScope scope = new SimpleScope(null);

    // Function with THIS context, param list with varargs, optional param, and regular param
    Node thisNode = new Node(Token.THIS, Node.newString(Token.STRING, "Object"));
    Node ellipsisEmpty = new Node(Token.ELLIPSIS);
    Node ellipsisWithChild = new Node(Token.ELLIPSIS, Node.newString(Token.STRING, "number"));
    Node optionalParam = new Node(Token.EQUALS, Node.newString(Token.STRING, "string"));
    Node regularParam = Node.newString(Token.STRING, "boolean");

    Node paramList = new Node(Token.PARAM_LIST, regularParam, optionalParam, ellipsisWithChild);
    Node returnType = Node.newString(Token.STRING, "void");

    Node fnNode = new Node(Token.FUNCTION, thisNode, paramList, returnType);
    JSType fnType = registry.createFromTypeNodes(fnNode, "test.js", scope);
    assertTrue(fnType.isFunctionType());

    // Function with NEW context (constructor) and empty ellipsis
    Node newNode = new Node(Token.NEW, Node.newString(Token.STRING, "Object"));
    Node paramList2 = new Node(Token.PARAM_LIST, ellipsisEmpty);
    Node fnNode2 = new Node(Token.FUNCTION, newNode, paramList2, new Node(Token.VOID));
    JSType fnType2 = registry.createFromTypeNodes(fnNode2, "test.js", scope);
    assertTrue(fnType2.isConstructor());

    // Function with non-object THIS context triggering warning
    Node invalidThisNode = new Node(Token.THIS, Node.newString(Token.STRING, "number"));
    Node fnNode3 = new Node(Token.FUNCTION, invalidThisNode, new Node(Token.PARAM_LIST), new Node(Token.VOID));
    registry.createFromTypeNodes(fnNode3, "test.js", scope);
    assertFalse(errorReporter.warnings.isEmpty());

    // Function with varargs followed by optional param failure warning
    Node paramList3 = new Node(Token.PARAM_LIST,
        new Node(Token.ELLIPSIS, Node.newString(Token.STRING, "number")),
        new Node(Token.EQUALS, Node.newString(Token.STRING, "string")));
    Node fnNode4 = new Node(Token.FUNCTION, new Node(Token.PARAM_LIST), paramList3, new Node(Token.VOID));
    registry.createFromTypeNodes(fnNode4, "test.js", scope);
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateFromTypeNodesInvalidTokenThrows() {
    Node invalidNode = new Node(Token.NUMBER);
    registry.createFromTypeNodes(invalidNode, "test.js", null);
  }
}
