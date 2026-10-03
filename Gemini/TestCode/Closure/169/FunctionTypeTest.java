package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class FunctionTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;
  private Node fnNode;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    fnNode = new Node(Token.FUNCTION);
  }

  @Test
  public void testConstructorCreation_andKindChecks() {
    Node params = new Node(Token.PARAM_LIST);
    ArrowType arrow = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType ctor = new FunctionType(
        registry, "MyClass", fnNode, arrow, null, null, true, false);

    assertTrue(ctor.isConstructor());
    assertFalse(ctor.isInterface());
    assertFalse(ctor.isOrdinaryFunction());
    assertTrue(ctor.hasInstanceType());
    assertNotNull(ctor.getInstanceType());
    assertEquals(ctor.getInstanceType(), ctor.getTypeOfThis());
    assertSame(ctor, ctor.toMaybeFunctionType());
    assertTrue(ctor.canBeCalled());
    assertSame(fnNode, ctor.getSource());
    assertTrue(ctor.getTemplateTypeNames().isEmpty());
  }

  @Test
  public void testOrdinaryFunctionCreation_andTypeOfThisFallback() {
    Node params = new Node(Token.PARAM_LIST);
    ArrowType arrow = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.STRING_TYPE));
    FunctionType fn = new FunctionType(
        registry, "myFunc", null, arrow, null, ImmutableList.of("T"), false, false);

    assertFalse(fn.isConstructor());
    assertFalse(fn.isInterface());
    assertTrue(fn.isOrdinaryFunction());
    assertFalse(fn.hasInstanceType());
    assertTrue(fn.getTypeOfThis().isUnknownType());
    assertEquals(1, fn.getTemplateTypeNames().size());
    assertEquals("T", fn.getTemplateTypeNames().get(0));
    assertTrue(fn.hasAnyTemplateInternal());
  }

  @Test
  public void testInterfaceCreation_viaForInterface() {
    FunctionType iface = FunctionType.forInterface(registry, "MyInterface", fnNode);

    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());
    assertTrue(iface.hasInstanceType());
    assertEquals("MyInterface", iface.getReferenceName());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInterfaceCreation_nullName_throwsException() {
    FunctionType.forInterface(registry, null, fnNode);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFunctionCreation_invalidSourceNode_throwsException() {
    Node invalidNode = new Node(Token.VAR);
    ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
    new FunctionType(registry, "fn", invalidNode, arrow, null, null, false, false);
  }

  @Test
  public void testIsInstanceType() {
    FunctionType u2u = registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());

    FunctionType ordinary = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertFalse(ordinary.isInstanceType());
  }

  @Test
  public void testStructAndDictProperties() {
    FunctionType ordinary = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    assertFalse(ordinary.makesStructs());
    assertFalse(ordinary.makesDicts());

    FunctionType parentCtor = registry.createConstructorType(
        "Parent", null, new Node(Token.PARAM_LIST), null);
    FunctionType childCtor = registry.createConstructorType(
        "Child", null, new Node(Token.PARAM_LIST), null);

    assertFalse(parentCtor.makesStructs());
    assertFalse(parentCtor.makesDicts());

    parentCtor.setStruct();
    assertTrue(parentCtor.makesStructs());
    assertFalse(parentCtor.makesDicts());

    childCtor.setPrototypeBasedOn(parentCtor.getInstanceType());
    assertTrue(childCtor.makesStructs());

    parentCtor.setDict();
    assertTrue(parentCtor.makesDicts());

    FunctionType childDictCtor = registry.createConstructorType(
        "ChildDict", null, new Node(Token.PARAM_LIST), null);
    childDictCtor.setPrototypeBasedOn(parentCtor.getInstanceType());
    assertTrue(childDictCtor.makesDicts());
  }

  @Test
  public void testParameters_andArgumentCounts() {
    Node param1 = Node.newString(Token.NAME, "a");
    param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node param2 = Node.newString(Token.NAME, "b");
    param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    param2.setOptionalArg(true);

    Node param3 = Node.newString(Token.NAME, "c");
    param3.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
    param3.setVarArgs(true);

    Node paramsNode = new Node(Token.PARAM_LIST, param1, param2, param3);
    ArrowType arrow = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType fn = new FunctionType(registry, "f", null, arrow, null, null, false, false);

    assertEquals(1, fn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());

    int count = 0;
    for (Node p : fn.getParameters()) {
      count++;
    }
    assertEquals(3, count);
    assertSame(paramsNode, fn.getParametersNode());
    assertSame(arrow, fn.getInternalArrowType());
    assertSame(registry.getNativeType(JSTypeNative.VOID_TYPE), fn.getReturnType());
    assertFalse(fn.isReturnTypeInferred());
  }

  @Test
  public void testParameters_emptyAndFixedCount() {
    Node param1 = Node.newString(Token.NAME, "a");
    Node paramsNode = new Node(Token.PARAM_LIST, param1);
    ArrowType arrow = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType fn = new FunctionType(registry, "f", null, arrow, null, null, false, false);

    assertEquals(1, fn.getMinArguments());
    assertEquals(1, fn.getMaxArguments());

    ArrowType emptyArrow = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType emptyFn = new FunctionType(registry, "f2", null, emptyArrow, null, null, false, false);
    assertFalse(emptyFn.getParameters().iterator().hasNext());
    assertEquals(0, emptyFn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, emptyFn.getMaxArguments());
  }

  @Test
  public void testPrototypeLazyInitialization_andSlots() {
    FunctionType ctor = registry.createConstructorType(
        "Foo", null, new Node(Token.PARAM_LIST), null);

    assertNotNull(ctor.getPrototype());
    assertNotNull(ctor.getSlot("prototype"));
    assertNull(ctor.getSlot("nonExistent"));

    Set<String> ownProps = ctor.getOwnPropertyNames();
    assertTrue(ownProps.contains("prototype"));

    ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
    FunctionType structuralFn = new FunctionType(registry, null, null, arrow, null, null, false, false);
    assertNotNull(structuralFn.getPrototype());
  }

  @Test
  public void testSetPrototype_validations() {
    FunctionType ctor = registry.createConstructorType(
        "Foo", null, new Node(Token.PARAM_LIST), null);

    assertFalse(ctor.setPrototype(null, null));
    assertFalse(ctor.setPrototype(ctor.getInstanceType(), null));

    ObjectType customProto = registry.createAnonymousObjectType();
    assertTrue(ctor.setPrototype(customProto, null));
    assertEquals(customProto, ctor.getPrototype());
  }

  @Test
  public void testSetPrototypeBasedOn_variousTypes() {
    FunctionType ctor = registry.createConstructorType("Foo", null, new Node(Token.PARAM_LIST), null);

    ObjectType baseNamed = registry.createConstructorType("Bar", null, new Node(Token.PARAM_LIST), null).getInstanceType();
    ctor.setPrototypeBasedOn(baseNamed);
    assertNotNull(ctor.getPrototype());

    ObjectType anonymous = registry.createAnonymousObjectType();
    ctor.setPrototypeBasedOn(anonymous);
    assertEquals(anonymous, ctor.getPrototype());
  }

  @Test
  public void testDefineProperty_prototype() {
    FunctionType ctor = registry.createConstructorType("Foo", null, new Node(Token.PARAM_LIST), null);
    ObjectType protoObj = registry.createAnonymousObjectType();

    assertTrue(ctor.defineProperty("prototype", protoObj, false, null));
    assertTrue(ctor.defineProperty("prototype", protoObj, false, null));

    assertFalse(ctor.defineProperty("prototype", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null));
  }

  @Test
  public void testInterfaces_implementationAndHierarchy() {
    FunctionType iface1 = FunctionType.forInterface(registry, "I1", null);
    FunctionType iface2 = FunctionType.forInterface(registry, "I2", null);

    iface2.setExtendedInterfaces(ImmutableList.of(iface1.getInstanceType()));
    assertEquals(1, iface2.getExtendedInterfacesCount());
    assertTrue(Iterables.contains(iface2.getExtendedInterfaces(), iface1.getInstanceType()));

    Iterable<ObjectType> allExt = iface2.getAllExtendedInterfaces();
    assertTrue(Iterables.contains(allExt, iface1.getInstanceType()));

    FunctionType superCtor = registry.createConstructorType("Super", null, new Node(Token.PARAM_LIST), null);
    superCtor.setImplementedInterfaces(ImmutableList.of(iface1.getInstanceType()));

    FunctionType subCtor = registry.createConstructorType("Sub", null, new Node(Token.PARAM_LIST), null);
    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());
    subCtor.setImplementedInterfaces(ImmutableList.of(iface2.getInstanceType()));

    assertTrue(subCtor.hasImplementedInterfaces());
    assertEquals(1, Lists.newArrayList(subCtor.getOwnImplementedInterfaces()).size());
    assertEquals(2, Lists.newArrayList(subCtor.getImplementedInterfaces()).size());

    Iterable<ObjectType> allImpl = subCtor.getAllImplementedInterfaces();
    assertTrue(Iterables.contains(allImpl, iface1.getInstanceType()));
    assertTrue(Iterables.contains(allImpl, iface2.getInstanceType()));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testSetImplementedInterfaces_onOrdinaryFunction_throwsException() {
    FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    fn.setImplementedInterfaces(ImmutableList.<ObjectType>of());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testSetExtendedInterfaces_onConstructor_throwsException() {
    FunctionType ctor = registry.createConstructorType("C", null, new Node(Token.PARAM_LIST), null);
    ctor.setExtendedInterfaces(ImmutableList.<ObjectType>of());
  }

  @Test
  public void testGetSuperClassConstructor() {
    FunctionType superCtor = registry.createConstructorType("Super", null, new Node(Token.PARAM_LIST), null);
    FunctionType subCtor = registry.createConstructorType("Sub", null, new Node(Token.PARAM_LIST), null);
    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());

    assertEquals(superCtor, subCtor.getSuperClassConstructor());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetSuperClassConstructor_onOrdinaryFunction_throwsException() {
    FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    fn.getSuperClassConstructor();
  }

  @Test
  public void testGetTopDefiningInterface_andGetTopMostDefiningType() {
    FunctionType iface1 = FunctionType.forInterface(registry, "I1", null);
    iface1.getInstanceType().defineDeclaredProperty("propA", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    FunctionType iface2 = FunctionType.forInterface(registry, "I2", null);
    iface2.setExtendedInterfaces(ImmutableList.of(iface1.getInstanceType()));

    assertEquals(iface1.getInstanceType(), FunctionType.getTopDefiningInterface(iface2.getInstanceType(), "propA"));
    assertNull(FunctionType.getTopDefiningInterface(iface2.getInstanceType(), "unknownProp"));

    assertEquals(iface1.getInstanceType(), iface2.getTopMostDefiningType("propA"));

    FunctionType superCtor = registry.createConstructorType("Super", null, new Node(Token.PARAM_LIST), null);
    superCtor.getPrototype().defineDeclaredProperty("methodX", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    superCtor.getInstanceType().defineDeclaredProperty("methodX", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    FunctionType subCtor = registry.createConstructorType("Sub", null, new Node(Token.PARAM_LIST), null);
    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());
    subCtor.getInstanceType().defineDeclaredProperty("methodX", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    assertEquals(superCtor.getInstanceType(), subCtor.getTopMostDefiningType("methodX"));
  }

  @Test
  public void testSpecialProperties_callApplyBind() {
    FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    JSType callProp = fn.getPropertyType("call");
    assertTrue(callProp.isFunctionType());

    JSType applyProp = fn.getPropertyType("apply");
    assertTrue(applyProp.isFunctionType());

    JSType bindProp = fn.getPropertyType("bind");
    assertTrue(bindProp.isFunctionType());
  }

  @Test
  public void testGetBindReturnType() {
    Node param1 = Node.newString(Token.NAME, "p1");
    param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node param2 = Node.newString(Token.NAME, "p2");
    param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node param3 = Node.newString(Token.NAME, "p3");
    param3.setVarArgs(true);
    param3.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

    Node params = new Node(Token.PARAM_LIST, param1, param2, param3);
    FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), params);

    FunctionType bound0 = fn.getBindReturnType(0);
    assertNotNull(bound0);

    FunctionType bound2 = fn.getBindReturnType(2);
    assertNotNull(bound2);

    FunctionType boundAll = fn.getBindReturnType(-1);
    assertNotNull(boundAll);
  }

  @Test
  public void testCheckFunctionEquivalenceHelper_andHashCode() {
    FunctionType ctor1 = registry.createConstructorType("C", null, new Node(Token.PARAM_LIST), null);
    FunctionType ctor2 = registry.createConstructorType("C", null, new Node(Token.PARAM_LIST), null);
    assertFalse(ctor1.checkFunctionEquivalenceHelper(ctor2, false));
    assertTrue(ctor1.checkFunctionEquivalenceHelper(ctor1, false));

    FunctionType iface1 = FunctionType.forInterface(registry, "I", null);
    FunctionType iface2 = FunctionType.forInterface(registry, "I", null);
    FunctionType iface3 = FunctionType.forInterface(registry, "OtherI", null);
    assertTrue(iface1.checkFunctionEquivalenceHelper(iface2, false));
    assertFalse(iface1.checkFunctionEquivalenceHelper(iface3, false));
    assertFalse(iface1.checkFunctionEquivalenceHelper(ctor1, false));
    assertFalse(ctor1.checkFunctionEquivalenceHelper(iface1, false));
    assertEquals(iface1.hashCode(), iface2.hashCode());

    FunctionType fn1 = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType fn2 = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertTrue(fn1.checkFunctionEquivalenceHelper(fn2, false));
    assertFalse(fn1.checkFunctionEquivalenceHelper(iface1, false));
    assertTrue(fn1.hasEqualCallType(fn2));
    assertEquals(fn1.hashCode(), fn2.hashCode());
  }

  @Test
  public void testSubtyping() {
    FunctionType iface = FunctionType.forInterface(registry, "I", null);
    FunctionType ctor = registry.createConstructorType("C", null, new Node(Token.PARAM_LIST), null);
    FunctionType ordinary = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    assertTrue(ordinary.isSubtype(iface));
    assertFalse(iface.isSubtype(ordinary));
    assertTrue(ordinary.isSubtype(ordinary));
    assertFalse(ordinary.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
  }

  @Test
  public void testSupAndInfHelper() {
    FunctionType fn1 = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType fn2 = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    FunctionType supSame = fn1.supAndInfHelper(fn1, true);
    assertSame(fn1, supSame);

    FunctionType supMerged = fn1.supAndInfHelper(fn2, true);
    assertNotNull(supMerged);

    FunctionType infMerged = fn1.supAndInfHelper(fn2, false);
    assertNotNull(infMerged);

    FunctionType fnInstance = registry.getNativeFunctionType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertSame(fnInstance, fn1.supAndInfHelper(fnInstance, true));
    assertSame(fn1, fn1.supAndInfHelper(fnInstance, false));
    assertSame(fnInstance, fnInstance.supAndInfHelper(fn1, true));
    assertSame(fn1, fnInstance.supAndInfHelper(fn1, false));

    FunctionType ctor = registry.createConstructorType("C", null, new Node(Token.PARAM_LIST), null);
    FunctionType supCtor = ctor.supAndInfHelper(fn1, true);
    assertEquals(registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), supCtor);
    FunctionType infCtor = ctor.supAndInfHelper(fn1, false);
    assertEquals(registry.getNativeFunctionType(JSTypeNative.LEAST_FUNCTION_TYPE), infCtor);
  }

  @Test
  public void testToStringHelper_andDebugHashCodeString() {
    FunctionType fnInstance = registry.getNativeFunctionType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals("Function", fnInstance.toStringHelper(false));
    assertNotNull(fnInstance.toDebugHashCodeString());

    Node paramVar = Node.newString(Token.NAME, "var");
    paramVar.setVarArgs(true);
    UnionType unionVar = registry.createUnionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.VOID_TYPE)).toMaybeUnionType();
    paramVar.setJSType(unionVar);

    Node paramOpt = Node.newString(Token.NAME, "opt");
    paramOpt.setOptionalArg(true);
    UnionType unionOpt = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.VOID_TYPE)).toMaybeUnionType();
    paramOpt.setJSType(unionOpt);

    Node paramReq = Node.newString(Token.NAME, "req");
    paramReq.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

    Node params = new Node(Token.PARAM_LIST, paramReq, paramOpt, paramVar);
    FunctionType ctor = registry.createConstructorType("MyCtor", null, params, registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    String str = ctor.toStringHelper(false);
    assertTrue(str.startsWith("function (new:MyCtor, boolean, string=, ...[number]): number"));

    String debugStr = ctor.toDebugHashCodeString();
    assertTrue(debugStr.contains("function ("));
  }

  @Test
  public void testSource_andPrototypeSlotNode() {
    FunctionType ctor = registry.createConstructorType("Foo", fnNode, new Node(Token.PARAM_LIST), null);
    ctor.getPrototype(); // initialize prototypeSlot

    Node newFnNode = new Node(Token.FUNCTION);
    ctor.setSource(newFnNode);
    assertSame(newFnNode, ctor.getSource());

    ctor.setSource(null);
    assertNull(ctor.getSource());
  }

  @Test
  public void testInstanceType_getterAndSetter() {
    FunctionType ctor = registry.createConstructorType("Foo", null, new Node(Token.PARAM_LIST), null);
    ObjectType newInst = registry.createAnonymousObjectType();
    ctor.setInstanceType(newInst);
    assertSame(newInst, ctor.getInstanceType());

    FunctionType ordinary = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    try {
      ordinary.getInstanceType();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // Expected
    }

    FunctionType noObjThisFn = new FunctionType(
        registry, "fn", null,
        new ArrowType(registry, new Node(Token.PARAM_LIST), null),
        registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE),
        null, false, false);
    assertTrue(noObjThisFn.getTypeOfThis().isUnknownType());
  }

  @Test
  public void testClearCachedValues_andSubTypes() {
    FunctionType superCtor = registry.createConstructorType("Super", null, new Node(Token.PARAM_LIST), null);
    FunctionType subCtor = registry.createConstructorType("Sub", null, new Node(Token.PARAM_LIST), null);
    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());

    assertNotNull(superCtor.getSubTypes());
    assertEquals(1, superCtor.getSubTypes().size());
    assertSame(subCtor, superCtor.getSubTypes().get(0));

    assertTrue(subCtor.hasCachedValues());
    superCtor.clearCachedValues();
  }

  @Test
  public void testVisitor() {
    FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Visitor<String> visitor = new Visitor<String>() {
      @Override public String caseNoType() { return null; }
      @Override public String caseEnumElementType(EnumElementType type) { return null; }
      @Override public String caseAllType() { return null; }
      @Override public String caseBooleanType() { return null; }
      @Override public String caseNoObjectType() { return null; }
      @Override public String caseFunctionType(FunctionType type) { return "FunctionTypeVisited"; }
      @Override public String caseObjectType(ObjectType type) { return null; }
      @Override public String caseUnknownType() { return null; }
      @Override public String caseNullType() { return null; }
      @Override public String caseNamedType(NamedType type) { return null; }
      @Override public String caseProxyObjectType(ProxyObjectType type) { return null; }
      @Override public String caseNumberType() { return null; }
      @Override public String caseStringType() { return null; }
      @Override public String caseVoidType() { return null; }
      @Override public String caseUnionType(UnionType type) { return null; }
      @Override public String caseTemplatizedType(TemplatizedType type) { return null; }
      @Override public String caseTemplateType(TemplateType templateType) { return null; }
    };
    assertEquals("FunctionTypeVisited", fn.visit(visitor));
  }

  @Test
  public void testCloneWithoutArrowType() {
    FunctionType ctor = registry.createConstructorType("Foo", null, new Node(Token.PARAM_LIST), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType cloned = ctor.cloneWithoutArrowType();

    assertTrue(cloned.isConstructor());
    assertEquals("Foo", cloned.getReferenceName());
    assertTrue(cloned.getReturnType().isUnknownType());
  }

  @Test
  public void testResolveInternal() {
    FunctionType iface = FunctionType.forInterface(registry, "I", null);
    FunctionType superCtor = registry.createConstructorType("Super", null, new Node(Token.PARAM_LIST), null);
    FunctionType subCtor = registry.createConstructorType("Sub", null, new Node(Token.PARAM_LIST), null);

    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());
    subCtor.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));
    subCtor.getPrototype();

    JSType resolved = subCtor.resolve(errorReporter, null);
    assertNotNull(resolved);
    assertTrue(resolved.isFunctionType());
  }
}
