package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class FunctionTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;

  private JSType NUMBER_TYPE;
  private JSType STRING_TYPE;
  private JSType BOOLEAN_TYPE;
  private JSType VOID_TYPE;
  private JSType UNKNOWN_TYPE;
  private ObjectType OBJECT_TYPE;

  @Before
  public void setUp() {
    errorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {}
      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {}
    };
    registry = new JSTypeRegistry(errorReporter);
    NUMBER_TYPE = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    STRING_TYPE = registry.getNativeType(JSTypeNative.STRING_TYPE);
    BOOLEAN_TYPE = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    VOID_TYPE = registry.getNativeType(JSTypeNative.VOID_TYPE);
    UNKNOWN_TYPE = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    OBJECT_TYPE = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
  }

  private Node createFunctionNode() {
    return new Node(Token.FUNCTION);
  }

  private Node createParamsNode(JSType... paramTypes) {
    Node paramsNode = new Node(Token.LP);
    for (int i = 0; i < paramTypes.length; i++) {
      Node param = Node.newString(Token.NAME, "p" + i);
      param.setJSType(paramTypes[i]);
      paramsNode.addChildToBack(param);
    }
    return paramsNode;
  }

  @Test
  public void testConstructor_ordinaryFunction_initializesCorrectly() {
    Node fnNode = createFunctionNode();
    Node params = createParamsNode(NUMBER_TYPE);
    ArrowType arrow = new ArrowType(registry, params, STRING_TYPE);
    FunctionType fn = new FunctionType(
        registry, "foo", fnNode, arrow, OBJECT_TYPE, "T", false, false);

    assertEquals("foo", fn.getReferenceName());
    assertEquals(fnNode, fn.getSource());
    assertTrue(fn.isOrdinaryFunction());
    assertFalse(fn.isConstructor());
    assertFalse(fn.isInterface());
    assertTrue(fn.isFunctionType());
    assertTrue(fn.canBeCalled());
    assertEquals("T", fn.getTemplateTypeName());
    assertEquals(OBJECT_TYPE, fn.getTypeOfThis());
    assertEquals(STRING_TYPE, fn.getReturnType());
    assertFalse(fn.isReturnTypeInferred());
    assertEquals(arrow, fn.getInternalArrowType());
  }

  @Test
  public void testConstructor_constructorFunction_initializesInstanceType() {
    Node fnNode = createFunctionNode();
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), VOID_TYPE);
    FunctionType ctor = new FunctionType(
        registry, "MyClass", fnNode, arrow, null, null, true, false);

    assertTrue(ctor.isConstructor());
    assertFalse(ctor.isOrdinaryFunction());
    assertFalse(ctor.isInterface());
    assertTrue(ctor.hasInstanceType());
    assertNotNull(ctor.getInstanceType());
    assertEquals(ctor.getInstanceType(), ctor.getTypeOfThis());
  }

  @Test
  public void testConstructor_constructorWithNoObjectTypeThis() {
    ObjectType noObj = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), VOID_TYPE);
    FunctionType ctor = new FunctionType(
        registry, "NoObjClass", null, arrow, noObj, null, true, false);

    assertTrue(ctor.isConstructor());
    assertEquals(noObj, ctor.getInstanceType());
    assertEquals(OBJECT_TYPE, ctor.getTypeOfThis());
  }

  @Test
  public void testConstructor_ordinaryFunctionWithNullTypeOfThis() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), VOID_TYPE);
    FunctionType fn = new FunctionType(
        registry, null, null, arrow, null, null, false, false);

    assertEquals(UNKNOWN_TYPE, fn.getTypeOfThis());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_invalidSourceNode_throwsException() {
    Node invalidSource = new Node(Token.NAME);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), VOID_TYPE);
    new FunctionType(registry, "invalid", invalidSource, arrow, null, null, false, false);
  }

  @Test
  public void testForInterface_initializesCorrectly() {
    Node fnNode = createFunctionNode();
    FunctionType iface = FunctionType.forInterface(registry, "AnInterface", fnNode);

    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());
    assertTrue(iface.hasInstanceType());
    assertEquals("AnInterface", iface.getReferenceName());
    assertEquals(fnNode, iface.getSource());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForInterface_nullName_throwsException() {
    FunctionType.forInterface(registry, null, null);
  }

  @Test
  public void testIsInstanceType() {
    FunctionType u2u = registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());

    FunctionType ordinary = registry.createFunctionType(VOID_TYPE);
    assertFalse(ordinary.isInstanceType());
  }

  @Test
  public void testParametersAndArgumentCounts() {
    Node params = new Node(Token.LP);
    Node req1 = Node.newString(Token.NAME, "req1");
    req1.setJSType(NUMBER_TYPE);
    params.addChildToBack(req1);

    Node opt1 = Node.newString(Token.NAME, "opt1");
    opt1.setJSType(STRING_TYPE);
    opt1.setOptionalArg(true);
    params.addChildToBack(opt1);

    Node req2 = Node.newString(Token.NAME, "req2");
    req2.setJSType(BOOLEAN_TYPE);
    params.addChildToBack(req2);

    FunctionType fn = new FunctionBuilder(registry)
        .withParamsNode(params)
        .withReturnType(VOID_TYPE)
        .build();

    assertEquals(params, fn.getParametersNode());
    assertEquals(3, fn.getMinArguments());
    assertEquals(3, fn.getMaxArguments());

    Iterable<Node> paramIterable = fn.getParameters();
    int count = 0;
    for (Node p : paramIterable) {
      count++;
    }
    assertEquals(3, count);

    Node varArg = Node.newString(Token.NAME, "rest");
    varArg.setJSType(STRING_TYPE);
    varArg.setVarArgs(true);
    params.addChildToBack(varArg);

    assertEquals(4, fn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
  }

  @Test
  public void testParameters_emptyParams() {
    ArrowType arrow = new ArrowType(registry, null, VOID_TYPE);
    FunctionType fn = new FunctionType(
        registry, "noParams", null, arrow, null, null, false, false);

    assertNull(fn.getParametersNode());
    assertFalse(fn.getParameters().iterator().hasNext());
    assertEquals(0, fn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
  }

  @Test
  public void testPrototypeOperations() {
    FunctionType ctor = registry.createConstructorType(
        "Base", null, null, VOID_TYPE);

    FunctionPrototypeType proto = ctor.getPrototype();
    assertNotNull(proto);
    assertTrue(ctor.hasCachedValues());

    assertFalse(ctor.setPrototype(null));
    assertFalse(ctor.setPrototype((FunctionPrototypeType) ctor.getInstanceType()));

    FunctionType subCtor = registry.createConstructorType(
        "Sub", null, null, VOID_TYPE);
    subCtor.setPrototypeBasedOn(ctor.getInstanceType());

    assertEquals(ctor, subCtor.getSuperClassConstructor());
    assertNotNull(ctor.getSubTypes());
    assertTrue(ctor.getSubTypes().contains(subCtor));

    FunctionPrototypeType customProto = new FunctionPrototypeType(registry, subCtor, OBJECT_TYPE);
    assertTrue(subCtor.setPrototype(customProto));
    assertEquals(customProto, subCtor.getPrototype());
  }

  @Test
  public void testSetPrototypeBasedOn_whenPrototypeAlreadyExists() {
    FunctionType ctor = registry.createConstructorType("Foo", null, null, VOID_TYPE);
    assertNotNull(ctor.getPrototype());
    ObjectType baseObj = registry.createAnonymousObjectType();
    ctor.setPrototypeBasedOn(baseObj);
    assertEquals(baseObj, ctor.getPrototype().getImplicitPrototype());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetInstanceType_onOrdinaryFunction_throwsException() {
    FunctionType fn = registry.createFunctionType(VOID_TYPE);
    fn.getInstanceType();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetSuperClassConstructor_onOrdinaryFunction_throwsException() {
    FunctionType fn = registry.createFunctionType(VOID_TYPE);
    fn.getSuperClassConstructor();
  }

  @Test
  public void testInterfaces_hierarchyAndResolution() {
    FunctionType ifaceBase = FunctionType.forInterface(registry, "IBase", null);
    FunctionType ifaceSub = FunctionType.forInterface(registry, "ISub", null);
    ifaceSub.getPrototype().setImplicitPrototype(ifaceBase.getInstanceType());

    FunctionType ctor = registry.createConstructorType("Impl", null, null, VOID_TYPE);
    ctor.setImplementedInterfaces(ImmutableList.of(ifaceSub.getInstanceType()));

    assertEquals(1, ImmutableList.copyOf(ctor.getImplementedInterfaces()).size());
    Set<ObjectType> allInterfaces = (Set<ObjectType>) ctor.getAllImplementedInterfaces();
    assertTrue(allInterfaces.contains(ifaceSub.getInstanceType()));
    assertTrue(allInterfaces.contains(ifaceBase.getInstanceType()));

    FunctionType nonIface = registry.createConstructorType("NonIface", null, null, VOID_TYPE);
    ctor.setImplementedInterfaces(ImmutableList.of(nonIface.getInstanceType()));
    Set<ObjectType> interfacesWithNonIface = (Set<ObjectType>) ctor.getAllImplementedInterfaces();
    assertFalse(interfacesWithNonIface.contains(nonIface.getInstanceType()));

    FunctionType subClass = registry.createConstructorType("SubImpl", null, null, VOID_TYPE);
    subClass.setPrototypeBasedOn(ctor.getInstanceType());
    assertTrue(subClass.getImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void testProperties_prototypeCallApply() {
    Node params = createParamsNode(NUMBER_TYPE);
    FunctionType fn = new FunctionBuilder(registry)
        .withParamsNode(params)
        .withReturnType(STRING_TYPE)
        .withTypeOfThis(OBJECT_TYPE)
        .build();

    assertTrue(fn.hasProperty("prototype"));
    assertTrue(fn.hasOwnProperty("prototype"));
    assertTrue(fn.isPropertyTypeInferred("prototype"));
    assertEquals(fn.getPrototype(), fn.getPropertyType("prototype"));

    JSType callProp = fn.getPropertyType("call");
    assertTrue(callProp.isFunctionType());
    FunctionType callFn = (FunctionType) callProp;
    assertEquals(STRING_TYPE, callFn.getReturnType());

    JSType applyProp = fn.getPropertyType("apply");
    assertTrue(applyProp.isFunctionType());
    FunctionType applyFn = (FunctionType) applyProp;
    assertEquals(STRING_TYPE, applyFn.getReturnType());

    ArrowType arrowNoParams = new ArrowType(registry, null, STRING_TYPE);
    FunctionType fnNoParams = new FunctionType(
        registry, null, null, arrowNoParams, null, null, false, false);
    JSType callPropNoParams = fnNoParams.getPropertyType("call");
    assertTrue(callPropNoParams.isFunctionType());
  }

  @Test
  public void testDefineProperty_prototype() {
    FunctionType fn = registry.createFunctionType(VOID_TYPE);
    ObjectType protoObj = registry.createAnonymousObjectType();

    assertTrue(fn.defineProperty("prototype", protoObj, false, false));
    assertTrue(fn.defineProperty("prototype", fn.getPrototype(), false, false));
    assertFalse(fn.defineProperty("prototype", NUMBER_TYPE, false, false));

    assertTrue(fn.defineProperty("customProp", STRING_TYPE, false, false));
    assertTrue(fn.hasProperty("customProp"));
  }

  @Test
  public void testLeastSupertypeAndGreatestSubtype_piecewiseMerging() {
    Node p1 = createParamsNode(NUMBER_TYPE);
    Node p2 = createParamsNode(NUMBER_TYPE);
    FunctionType fn1 = new FunctionBuilder(registry)
        .withParamsNode(p1)
        .withReturnType(NUMBER_TYPE)
        .withTypeOfThis(OBJECT_TYPE)
        .build();
    FunctionType fn2 = new FunctionBuilder(registry)
        .withParamsNode(p2)
        .withReturnType(STRING_TYPE)
        .withTypeOfThis(OBJECT_TYPE)
        .build();

    JSType sup = fn1.getLeastSupertype(fn2);
    assertTrue(sup.isFunctionType());
    FunctionType supFn = (FunctionType) sup;
    assertTrue(supFn.getReturnType().isUnionType());

    JSType inf = fn1.getGreatestSubtype(fn2);
    assertTrue(inf.isFunctionType());

    Node pDiff = createParamsNode(STRING_TYPE);
    FunctionType fnDiff = new FunctionBuilder(registry)
        .withParamsNode(pDiff)
        .withReturnType(STRING_TYPE)
        .build();
    JSType supDiff = fn1.getLeastSupertype(fnDiff);
    assertEquals(registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), supDiff);
    JSType infDiff = fn1.getGreatestSubtype(fnDiff);
    assertEquals(registry.getNativeFunctionType(JSTypeNative.LEAST_FUNCTION_TYPE), infDiff);

    assertEquals(fn1, fn1.getLeastSupertype(fn1));
    assertEquals(fn1, fn1.getGreatestSubtype(fn1));

    JSType fnInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals(fnInstance, fn1.getLeastSupertype(fnInstance));
    assertEquals(fn1, fn1.getGreatestSubtype(fnInstance));

    JSType supWithNonFn = fn1.getLeastSupertype(NUMBER_TYPE);
    assertTrue(supWithNonFn.isUnionType());
    JSType infWithNonFn = fn1.getGreatestSubtype(NUMBER_TYPE);
    assertTrue(infWithNonFn.isNoType());
  }

  @Test
  public void testSupAndInfHelper_subtypeBranches() {
    Node p1 = createParamsNode(NUMBER_TYPE);
    FunctionType baseFn = new FunctionBuilder(registry)
        .withParamsNode(p1)
        .withReturnType(registry.getNativeType(JSTypeNative.ALL_TYPE))
        .build();
    FunctionType subFn = new FunctionBuilder(registry)
        .withParamsNode(p1)
        .withReturnType(STRING_TYPE)
        .build();

    assertTrue(subFn.isSubtype(baseFn));
    assertFalse(baseFn.isSubtype(subFn));

    assertEquals(baseFn, subFn.getLeastSupertype(baseFn));
    assertEquals(subFn, subFn.getGreatestSubtype(baseFn));
    assertEquals(baseFn, baseFn.getLeastSupertype(subFn));
    assertEquals(subFn, baseFn.getGreatestSubtype(subFn));
  }

  @Test
  public void testHasUnknownSupertype() {
    FunctionType root = registry.createConstructorType("Root", null, null, VOID_TYPE);
    assertFalse(root.hasUnknownSupertype());

    FunctionType derived = registry.createConstructorType("Derived", null, null, VOID_TYPE);
    derived.getPrototype().setImplicitPrototype(root.getInstanceType());
    assertFalse(derived.hasUnknownSupertype());

    FunctionType unknownSuper = registry.createConstructorType("UnknownSuper", null, null, VOID_TYPE);
    unknownSuper.getPrototype().setImplicitPrototype(
        registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE));
    assertTrue(unknownSuper.hasUnknownSupertype());
  }

  @Test
  public void testGetTopMostDefiningType() {
    FunctionType root = registry.createConstructorType("Root", null, null, VOID_TYPE);
    root.getPrototype().defineProperty("propA", NUMBER_TYPE, false, false);
    root.getPrototype().defineProperty("propB", NUMBER_TYPE, false, false);

    FunctionType mid = registry.createConstructorType("Mid", null, null, VOID_TYPE);
    mid.setPrototypeBasedOn(root.getInstanceType());
    mid.getPrototype().defineProperty("propA", STRING_TYPE, false, false);

    FunctionType leaf = registry.createConstructorType("Leaf", null, null, VOID_TYPE);
    leaf.setPrototypeBasedOn(mid.getInstanceType());
    leaf.getPrototype().defineProperty("propA", BOOLEAN_TYPE, false, false);

    assertEquals(root.getInstanceType(), leaf.getTopMostDefiningType("propA"));
    assertEquals(root.getInstanceType(), leaf.getTopMostDefiningType("propB"));
  }

  @Test
  public void testIsEquivalentToAndHashCode() {
    FunctionType ctor1 = registry.createConstructorType("C1", null, null, VOID_TYPE);
    FunctionType ctor2 = registry.createConstructorType("C2", null, null, VOID_TYPE);
    assertTrue(ctor1.isEquivalentTo(ctor1));
    assertFalse(ctor1.isEquivalentTo(ctor2));

    FunctionType iface1 = FunctionType.forInterface(registry, "I1", null);
    FunctionType iface1Dup = FunctionType.forInterface(registry, "I1", null);
    FunctionType iface2 = FunctionType.forInterface(registry, "I2", null);
    assertTrue(iface1.isEquivalentTo(iface1Dup));
    assertFalse(iface1.isEquivalentTo(iface2));
    assertEquals(iface1.hashCode(), iface1Dup.hashCode());

    assertFalse(ctor1.isEquivalentTo(iface1));
    assertFalse(iface1.isEquivalentTo(ctor1));

    FunctionType fn1 = registry.createFunctionType(NUMBER_TYPE, NUMBER_TYPE);
    FunctionType fn2 = registry.createFunctionType(NUMBER_TYPE, NUMBER_TYPE);
    FunctionType fn3 = registry.createFunctionType(STRING_TYPE, NUMBER_TYPE);

    assertTrue(fn1.isEquivalentTo(fn2));
    assertFalse(fn1.isEquivalentTo(fn3));
    assertTrue(fn1.hasEqualCallType(fn2));
    assertFalse(fn1.hasEqualCallType(fn3));
    assertEquals(fn1.hashCode(), fn2.hashCode());

    assertFalse(fn1.isEquivalentTo(NUMBER_TYPE));
    assertFalse(fn1.isEquivalentTo(iface1));
  }

  @Test
  public void testToStringAndDebugHashCode() {
    FunctionType fnInst = registry.getNativeFunctionType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals("Function", fnInst.toString());
    assertNotNull(fnInst.toDebugHashCodeString());

    Node params = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(NUMBER_TYPE);
    params.addChildToBack(p1);

    Node p2 = Node.newString(Token.NAME, "b");
    p2.setVarArgs(true);
    JSType unionWithVoid = registry.createUnionType(STRING_TYPE, VOID_TYPE);
    p2.setJSType(unionWithVoid);
    params.addChildToBack(p2);

    FunctionType fn = new FunctionBuilder(registry)
        .withParamsNode(params)
        .withReturnType(BOOLEAN_TYPE)
        .withTypeOfThis(OBJECT_TYPE)
        .build();

    String str = fn.toString();
    assertTrue(str.startsWith("function (this:"));
    assertTrue(str.contains("number"));
    assertTrue(str.contains("...[string]"));
    assertTrue(str.endsWith(": boolean"));

    String debugStr = fn.toDebugHashCodeString();
    assertTrue(debugStr.startsWith("function (this:"));
    assertTrue(debugStr.endsWith(": boolean"));

    Node pSelf = Node.newString(Token.NAME, "self");
    pSelf.setJSType(fn);
    Node selfParams = new Node(Token.LP);
    selfParams.addChildToBack(pSelf);
    FunctionType fnSelf = new FunctionBuilder(registry)
        .withParamsNode(selfParams)
        .withReturnType(VOID_TYPE)
        .build();
    assertTrue(fnSelf.toDebugHashCodeString().contains("function ("));
  }

  @Test
  public void testIsSubtype() {
    FunctionType iface = FunctionType.forInterface(registry, "TargetIface", null);
    FunctionType fn = registry.createFunctionType(VOID_TYPE);
    assertTrue(fn.isSubtype(iface));

    FunctionType sourceIface = FunctionType.forInterface(registry, "SourceIface", null);
    assertFalse(sourceIface.isSubtype(fn));

    FunctionType ctorA = registry.createConstructorType("A", null, null, VOID_TYPE);
    FunctionType ctorB = registry.createConstructorType("B", null, null, VOID_TYPE);
    assertFalse(ctorA.isSubtype(ctorB));

    FunctionType fnNumberReturn = registry.createFunctionType(NUMBER_TYPE);
    FunctionType fnAllReturn = registry.createFunctionType(registry.getNativeType(JSTypeNative.ALL_TYPE));
    assertTrue(fnNumberReturn.isSubtype(fnAllReturn));

    JSType fnProto = registry.getNativeType(JSTypeNative.FUNCTION_PROTOTYPE);
    assertTrue(fn.isSubtype(fnProto));
    assertFalse(fn.isSubtype(NUMBER_TYPE));
  }

  @Test
  public void testVisit() {
    FunctionType fn = registry.createFunctionType(VOID_TYPE);
    Visitor<String> visitor = new Visitor<String>() {
      @Override public String caseNoType() { return null; }
      @Override public String caseEnumElementType(EnumElementType enumElementType) { return null; }
      @Override public String caseAllType() { return null; }
      @Override public String caseBooleanType() { return null; }
      @Override public String caseNoObjectType() { return null; }
      @Override public String caseFunctionType(FunctionType type) { return "visitedFunctionType"; }
      @Override public String caseObjectType(ObjectType type) { return null; }
      @Override public String caseUnknownType() { return null; }
      @Override public String caseNullType() { return null; }
      @Override public String caseNamedType(NamedType type) { return null; }
      @Override public String caseRecordType(RecordType type) { return null; }
      @Override public String caseStringType() { return null; }
      @Override public String caseVoidType() { return null; }
      @Override public String caseUnionType(UnionType type) { return null; }
      @Override public String caseNumberType() { return null; }
      @Override public String caseParameterizedType(ParameterizedType type) { return null; }
      @Override public String caseTemplateType(TemplateType templateType) { return null; }
    };
    assertEquals("visitedFunctionType", fn.visit(visitor));
  }

  @Test
  public void testSourceNodeAndInstanceTypeSetters() {
    FunctionType fn = registry.createFunctionType(VOID_TYPE);
    assertNull(fn.getSource());

    Node fnNode = createFunctionNode();
    fn.setSource(fnNode);
    assertEquals(fnNode, fn.getSource());

    ObjectType customInst = registry.createAnonymousObjectType();
    fn.setInstanceType(customInst);
    assertEquals(customInst, fn.getTypeOfThis());
  }

  @Test
  public void testResolveInternal() {
    FunctionType iface = FunctionType.forInterface(registry, "ResolvableIface", null);
    FunctionType ctor = registry.createConstructorType("ResolvableCtor", null, null, VOID_TYPE);
    ctor.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    FunctionType subCtor = registry.createConstructorType("ResolvableSub", null, null, VOID_TYPE);
    subCtor.setPrototypeBasedOn(ctor.getInstanceType());

    StaticScope<JSType> scope = new StaticScope<JSType>() {
      @Override public Node getRootNode() { return null; }
      @Override public StaticScope<JSType> getParentScope() { return null; }
      @Override public StaticSlot<JSType> getSlot(String name) { return null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public JSType getTypeOfThis() { return null; }
    };

    JSType resolved = ctor.resolve(errorReporter, scope);
    assertNotNull(resolved);
    assertTrue(resolved.isFunctionType());
    assertNotNull(ctor.getSubTypes());
  }
}
