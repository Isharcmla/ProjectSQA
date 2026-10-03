package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FunctionTypeTest {

  private JSTypeRegistry registry;
  private SimpleErrorReporter errorReporter;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType voidType;
  private ObjectType objectType;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
  }

  private FunctionType createOrdinaryFunction(String name, Node params, JSType returnType, ObjectType typeOfThis) {
    ArrowType arrow = new ArrowType(registry, params, returnType);
    return new FunctionType(registry, name, null, arrow, typeOfThis, null, false, false);
  }

  private FunctionType createConstructor(String name, Node params, JSType returnType) {
    ArrowType arrow = new ArrowType(registry, params, returnType);
    return new FunctionType(registry, name, null, arrow, null, null, true, false);
  }

  @Test
  public void testConstructorCreation_validParameters_success() {
    Node fnNode = new Node(Token.FUNCTION);
    Node params = new Node(Token.LP);
    ArrowType arrow = new ArrowType(registry, params, numberType);

    FunctionType ctor = new FunctionType(registry, "MyClass", fnNode, arrow, null, "T", true, false);
    assertTrue(ctor.isConstructor());
    assertFalse(ctor.isInterface());
    assertFalse(ctor.isOrdinaryFunction());
    assertTrue(ctor.isFunctionType());
    assertTrue(ctor.canBeCalled());
    assertEquals("T", ctor.getTemplateTypeName());
    assertSame(fnNode, ctor.getSource());
    assertNotNull(ctor.getInstanceType());
    assertTrue(ctor.hasInstanceType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorCreation_invalidSourceNodeType_throwsException() {
    Node invalidNode = new Node(Token.NAME);
    Node params = new Node(Token.LP);
    ArrowType arrow = new ArrowType(registry, params, numberType);
    new FunctionType(registry, "Invalid", invalidNode, arrow, null, null, false, false);
  }

  @Test
  public void testConstructorCreation_withNoObjectTypeThis_usesProvidedTypeOfThis() {
    ObjectType noObj = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    Node params = new Node(Token.LP);
    ArrowType arrow = new ArrowType(registry, params, numberType);
    FunctionType ctor = new FunctionType(registry, "NoObjCtor", null, arrow, noObj, null, true, false);

    assertSame(objectType, ctor.getTypeOfThis());
    assertSame(noObj, ctor.getInstanceType());
  }

  @Test
  public void testOrdinaryFunction_withNullTypeOfThis_usesUnknownType() {
    Node params = new Node(Token.LP);
    ArrowType arrow = new ArrowType(registry, params, numberType);
    FunctionType func = new FunctionType(registry, "Ordinary", null, arrow, null, null, false, false);

    assertFalse(func.isConstructor());
    assertFalse(func.isInterface());
    assertTrue(func.isOrdinaryFunction());
    assertFalse(func.hasInstanceType());
    assertEquals(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), func.getTypeOfThis());
  }

  @Test
  public void testForInterface_validArguments_success() {
    Node fnNode = new Node(Token.FUNCTION);
    FunctionType iface = FunctionType.forInterface(registry, "MyInterface", fnNode);

    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());
    assertTrue(iface.hasInstanceType());
    assertSame(fnNode, iface.getSource());
    assertEquals("MyInterface", iface.getReferenceName());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForInterface_nullName_throwsException() {
    FunctionType.forInterface(registry, null, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForInterface_invalidSourceNode_throwsException() {
    Node invalidNode = new Node(Token.VAR);
    FunctionType.forInterface(registry, "MyInterface", invalidNode);
  }

  @Test
  public void testIsInstanceType_universalConstructor_returnsTrue() {
    JSType u2u = registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    if (u2u instanceof FunctionType) {
      assertTrue(((FunctionType) u2u).isInstanceType());
    }

    FunctionType ordinary = createOrdinaryFunction("foo", new Node(Token.LP), numberType, null);
    assertFalse(ordinary.isInstanceType());
  }

  @Test
  public void testGetParametersAndMinMaxArguments_variousCombinations() {
    Node params = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(numberType);
    Node p2 = Node.newString(Token.NAME, "b");
    p2.setJSType(stringType);
    p2.setOptionalArg(true);
    Node p3 = Node.newString(Token.NAME, "c");
    p3.setJSType(booleanType);
    params.addChildToBack(p1);
    params.addChildToBack(p2);
    params.addChildToBack(p3);

    FunctionType func = createOrdinaryFunction("foo", params, numberType, null);

    assertSame(params, func.getParametersNode());
    assertEquals(3, Iterables.size(func.getParameters()));
    assertEquals(3, func.getMinArguments());
    assertEquals(3, func.getMaxArguments());

    Node p4Var = Node.newString(Token.NAME, "d");
    p4Var.setJSType(stringType);
    p4Var.setVarArgs(true);
    params.addChildToBack(p4Var);

    assertEquals(3, func.getMinArguments());
    assertEquals(Integer.MAX_VALUE, func.getMaxArguments());

    Node emptyParams = new Node(Token.LP);
    FunctionType emptyFunc = createOrdinaryFunction("empty", emptyParams, voidType, null);
    assertEquals(0, func.getParametersNode().getChildCount() == 0 ? 0 : emptyFunc.getMinArguments());
    assertEquals(0, emptyFunc.getMaxArguments());
  }

  @Test
  public void testGetParameters_whenParametersNodeEmpty() {
    Node params = new Node(Token.LP);
    FunctionType func = createOrdinaryFunction("none", params, voidType, null);
    assertEquals(0, Iterables.size(func.getParameters()));
  }

  @Test
  public void testGetReturnTypeAndInferred() {
    Node params = new Node(Token.LP);
    ArrowType arrow = new ArrowType(registry, params, numberType, true);
    FunctionType func = new FunctionType(registry, "f", null, arrow, null, null, false, false);

    assertSame(numberType, func.getReturnType());
    assertTrue(func.isReturnTypeInferred());
    assertSame(arrow, func.getInternalArrowType());
  }

  @Test
  public void testPrototypeOperations_lazyInitializationAndSetting() {
    FunctionType ctor = createConstructor("Person", new Node(Token.LP), null);
    assertFalse(ctor.hasCachedValues());

    FunctionPrototypeType proto = ctor.getPrototype();
    assertNotNull(proto);
    assertTrue(ctor.hasCachedValues());
    assertSame(proto, ctor.getPrototype());

    assertFalse(ctor.setPrototype(null));
    assertFalse(ctor.setPrototype((FunctionPrototypeType) ctor.getInstanceType()));

    FunctionPrototypeType customProto = new FunctionPrototypeType(registry, ctor, objectType);
    assertTrue(ctor.setPrototype(customProto));
    assertSame(customProto, ctor.getPrototype());

    FunctionType childCtor = createConstructor("Child", new Node(Token.LP), null);
    childCtor.setPrototypeBasedOn(ctor.getInstanceType());
    assertSame(ctor.getInstanceType(), childCtor.getPrototype().getImplicitPrototype());
    assertSame(ctor, childCtor.getSuperClassConstructor());
    assertTrue(ctor.getSubTypes().contains(childCtor));

    ObjectType newBase = new FunctionPrototypeType(registry, ctor, objectType);
    childCtor.setPrototypeBasedOn(newBase);
    assertSame(newBase, childCtor.getPrototype().getImplicitPrototype());
  }

  @Test
  public void testInterfaceInheritanceAndGetAllImplementedInterfaces() {
    FunctionType ifaceParent = FunctionType.forInterface(registry, "ParentInterface", null);
    FunctionType ifaceChild = FunctionType.forInterface(registry, "ChildInterface", null);
    ifaceChild.getPrototype().setImplicitPrototype(ifaceParent.getInstanceType());

    FunctionType classSuper = createConstructor("SuperClass", new Node(Token.LP), null);
    classSuper.setImplementedInterfaces(ImmutableList.of(ifaceParent.getInstanceType()));

    FunctionType classSub = createConstructor("SubClass", new Node(Token.LP), null);
    classSub.setPrototypeBasedOn(classSuper.getInstanceType());
    classSub.setImplementedInterfaces(ImmutableList.of(ifaceChild.getInstanceType()));

    List<ObjectType> directSubIfaces = Lists.newArrayList(classSub.getImplementedInterfaces());
    assertEquals(2, directSubIfaces.size());

    Set<ObjectType> allIfaces = (Set<ObjectType>) classSub.getAllImplementedInterfaces();
    assertTrue(allIfaces.contains(ifaceChild.getInstanceType()));
    assertTrue(allIfaces.contains(ifaceParent.getInstanceType()));
  }

  @Test
  public void testProperties_prototypeAndCallAndApply() {
    Node params = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "x");
    p1.setJSType(numberType);
    params.addChildToBack(p1);

    FunctionType func = createOrdinaryFunction("testFn", params, stringType, objectType);

    assertTrue(func.hasProperty("prototype"));
    assertTrue(func.hasOwnProperty("prototype"));
    assertTrue(func.isPropertyTypeInferred("prototype"));
    assertSame(func.getPrototype(), func.getPropertyType("prototype"));

    JSType callProp = func.getPropertyType("call");
    assertNotNull(callProp);
    assertTrue(callProp.isFunctionType());

    JSType applyProp = func.getPropertyType("apply");
    assertNotNull(applyProp);
    assertTrue(applyProp.isFunctionType());

    FunctionType nullParamFn = new FunctionType(
        registry, "nullParams", null,
        new ArrowType(registry, null, stringType),
        objectType, null, false, false);
    JSType nullParamCall = nullParamFn.getPropertyType("call");
    assertNotNull(nullParamCall);
  }

  @Test
  public void testDefineProperty_prototypeHandling() {
    FunctionType ctor = createConstructor("TestDefProp", new Node(Token.LP), null);

    assertFalse(ctor.defineProperty("prototype", numberType, false, false));

    FunctionPrototypeType existingProto = ctor.getPrototype();
    assertTrue(ctor.defineProperty("prototype", existingProto, false, false));

    ObjectType newProtoObj = new FunctionPrototypeType(registry, ctor, objectType);
    assertTrue(ctor.defineProperty("prototype", newProtoObj, false, false));
    assertSame(newProtoObj, ctor.getPrototype().getImplicitPrototype());

    assertTrue(ctor.defineProperty("customField", numberType, false, false));
    assertSame(numberType, ctor.getPropertyType("customField"));
  }

  @Test
  public void testLatticeOperations_leastSuperAndGreatestSubtype() {
    Node params1 = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(numberType);
    params1.addChildToBack(p1);

    Node params2 = new Node(Token.LP);
    Node p2 = Node.newString(Token.NAME, "a");
    p2.setJSType(numberType);
    params2.addChildToBack(p2);

    FunctionType fn1 = createOrdinaryFunction("fn1", params1, numberType, objectType);
    FunctionType fn2 = createOrdinaryFunction("fn2", params2, stringType, objectType);

    assertSame(fn1, fn1.getLeastSupertype(fn1));
    assertSame(fn1, fn1.getGreatestSubtype(fn1));

    JSType superType = fn1.getLeastSupertype(fn2);
    assertTrue(superType.isFunctionType());
    FunctionType fnSuper = (FunctionType) superType;
    assertTrue(fnSuper.getReturnType().isUnionType());

    JSType subType = fn1.getGreatestSubtype(fn2);
    assertTrue(subType.isFunctionType());
    FunctionType fnSub = (FunctionType) subType;
    assertTrue(fnSub.getReturnType().isNoType());

    JSType fnInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertSame(fnInstance, fn1.getLeastSupertype(fnInstance));
    assertSame(fn1, fn1.getGreatestSubtype(fnInstance));

    FunctionType fnInstanceFunc = (FunctionType) fnInstance;
    assertSame(fnInstanceFunc, fnInstanceFunc.getLeastSupertype(fn1));
    assertSame(fn1, fnInstanceFunc.getGreatestSubtype(fn1));

    FunctionType ctor1 = createConstructor("Ctor1", new Node(Token.LP), null);
    FunctionType ctor2 = createConstructor("Ctor2", new Node(Token.LP), null);
    assertSame(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), ctor1.getLeastSupertype(ctor2));
    assertSame(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), ctor1.getGreatestSubtype(ctor2));

    JSType nonFnSuper = fn1.getLeastSupertype(numberType);
    assertTrue(nonFnSuper.isUnionType());
    JSType nonFnSub = fn1.getGreatestSubtype(numberType);
    assertTrue(nonFnSub.isNoType());
  }

  @Test
  public void testCloneWithNewReturnType() {
    FunctionType fn = createOrdinaryFunction("f", new Node(Token.LP), numberType, objectType);
    FunctionType cloned = fn.cloneWithNewReturnType(stringType, true);

    assertSame(stringType, cloned.getReturnType());
    assertTrue(cloned.isReturnTypeInferred());
    assertSame(fn.getTypeOfThis(), cloned.getTypeOfThis());
  }

  @Test
  public void testHasUnknownSupertype() {
    FunctionType ctor = createConstructor("Ctor", new Node(Token.LP), null);
    assertFalse(ctor.hasUnknownSupertype());

    ObjectType unknown = (ObjectType) registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    ctor.getPrototype().setImplicitPrototype(unknown);
    assertTrue(ctor.hasUnknownSupertype());
  }

  @Test
  public void testGetTopMostDefiningType() {
    FunctionType baseCtor = createConstructor("Base", new Node(Token.LP), null);
    baseCtor.getPrototype().defineProperty("prop", numberType, false, false);

    FunctionType midCtor = createConstructor("Mid", new Node(Token.LP), null);
    midCtor.setPrototypeBasedOn(baseCtor.getInstanceType());
    midCtor.getPrototype().defineProperty("prop", numberType, false, false);

    FunctionType childCtor = createConstructor("Child", new Node(Token.LP), null);
    childCtor.setPrototypeBasedOn(midCtor.getInstanceType());

    JSType topDefining = childCtor.getTopMostDefiningType("prop");
    assertSame(baseCtor.getInstanceType(), topDefining);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTopMostDefiningType_missingProperty_throwsException() {
    FunctionType ctor = createConstructor("MissingProp", new Node(Token.LP), null);
    ctor.getTopMostDefiningType("nonExistent");
  }

  @Test
  public void testIsEquivalentToAndHashCodeAndCallType() {
    FunctionType fn1 = createOrdinaryFunction("f", new Node(Token.LP), numberType, objectType);
    FunctionType fn2 = createOrdinaryFunction("f", new Node(Token.LP), numberType, objectType);
    FunctionType fn3 = createOrdinaryFunction("f", new Node(Token.LP), stringType, objectType);

    assertTrue(fn1.isEquivalentTo(fn2));
    assertFalse(fn1.isEquivalentTo(fn3));
    assertFalse(fn1.isEquivalentTo(numberType));
    assertEquals(fn1.hashCode(), fn2.hashCode());
    assertTrue(fn1.hasEqualCallType(fn2));
    assertFalse(fn1.hasEqualCallType(fn3));

    FunctionType ctor1 = createConstructor("Ctor", new Node(Token.LP), null);
    FunctionType ctor2 = createConstructor("Ctor", new Node(Token.LP), null);
    assertFalse(ctor1.isEquivalentTo(ctor2));
    assertTrue(ctor1.isEquivalentTo(ctor1));
    assertFalse(ctor1.isEquivalentTo(fn1));

    FunctionType iface1 = FunctionType.forInterface(registry, "Iface", null);
    FunctionType iface2 = FunctionType.forInterface(registry, "Iface", null);
    FunctionType iface3 = FunctionType.forInterface(registry, "OtherIface", null);
    assertTrue(iface1.isEquivalentTo(iface2));
    assertFalse(iface1.isEquivalentTo(iface3));
    assertFalse(iface1.isEquivalentTo(ctor1));
    assertFalse(fn1.isEquivalentTo(iface1));
    assertEquals(iface1.hashCode(), iface2.hashCode());
  }

  @Test
  public void testToStringAndDebugHashCodeString() {
    JSType fnInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals("Function", fnInstance.toString());
    assertNotNull(fnInstance.toDebugHashCodeString());

    Node params = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(numberType);
    Node p2 = Node.newString(Token.NAME, "b");
    UnionType optUnion = (UnionType) registry.createUnionType(stringType, voidType);
    p2.setJSType(optUnion);
    p2.setVarArgs(true);
    params.addChildToBack(p1);
    params.addChildToBack(p2);

    FunctionType fn = createOrdinaryFunction("test", params, booleanType, objectType);
    String str = fn.toString();
    assertTrue(str.contains("this:Object"));
    assertTrue(str.contains("number"));
    assertTrue(str.contains("...[string]"));
    assertTrue(str.contains("boolean"));

    String debugStr = fn.toDebugHashCodeString();
    assertTrue(debugStr.startsWith("function ("));
    assertTrue(debugStr.contains("this:"));
  }

  @Test
  public void testIsSubtype_variousScenarios() {
    FunctionType fn1 = createOrdinaryFunction("f1", new Node(Token.LP), numberType, objectType);
    FunctionType fn2 = createOrdinaryFunction("f2", new Node(Token.LP), numberType, objectType);
    assertTrue(fn1.isSubtype(fn2));

    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    assertTrue(fn1.isSubtype(iface));
    assertFalse(iface.isSubtype(fn1));

    UnionType union = (UnionType) registry.createUnionType(fn1, stringType);
    assertTrue(fn1.isSubtype(union));
    assertFalse(fn1.isSubtype(stringType));

    FunctionType ctorA = createConstructor("CtorA", new Node(Token.LP), null);
    FunctionType ctorB = createConstructor("CtorB", new Node(Token.LP), null);
    assertTrue(ctorA.isSubtype(ctorA));
    assertFalse(ctorA.isSubtype(ctorB));
  }

  @Test
  public void testVisitorPattern() {
    FunctionType fn = createOrdinaryFunction("f", new Node(Token.LP), numberType, null);
    Visitor<String> visitor = new Visitor<String>() {
      @Override public String caseNoType() { return "no"; }
      @Override public String caseEnumElementType(EnumElementType type) { return "enum"; }
      @Override public String caseAllType() { return "all"; }
      @Override public String caseBooleanType() { return "bool"; }
      @Override public String caseNoObjectType() { return "noObj"; }
      @Override public String caseFunctionType(FunctionType type) { return "functionMatched"; }
      @Override public String caseObjectType(ObjectType type) { return "obj"; }
      @Override public String caseUnknownType() { return "unknown"; }
      @Override public String caseNullType() { return "null"; }
      @Override public String caseNamedType(NamedType type) { return "named"; }
      @Override public String caseNumberType() { return "num"; }
      @Override public String caseStringType() { return "str"; }
      @Override public String caseVoidType() { return "void"; }
      @Override public String caseUnionType(UnionType type) { return "union"; }
      @Override public String caseRecordType(RecordType type) { return "record"; }
      @Override public String caseTemplateType(TemplateType templateType) { return "template"; }
    };

    assertEquals("functionMatched", fn.visit(visitor));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetInstanceType_ordinaryFunction_throwsException() {
    FunctionType fn = createOrdinaryFunction("f", new Node(Token.LP), numberType, null);
    fn.getInstanceType();
  }

  @Test
  public void testSetInstanceType_setsInstance() {
    FunctionType ctor = createConstructor("Ctor", new Node(Token.LP), null);
    ObjectType newInstance = new InstanceObjectType(registry, ctor);
    ctor.setInstanceType(newInstance);
    assertSame(newInstance, ctor.getInstanceType());
  }

  @Test
  public void testSourceGetterAndSetter() {
    FunctionType fn = createOrdinaryFunction("f", new Node(Token.LP), numberType, null);
    assertNull(fn.getSource());

    Node fnNode = new Node(Token.FUNCTION);
    fn.setSource(fnNode);
    assertSame(fnNode, fn.getSource());
  }

  @Test
  public void testResolveInternal_resolvesAllComponents() {
    Node fnNode = new Node(Token.FUNCTION);
    FunctionType iface = FunctionType.forInterface(registry, "Iface", fnNode);

    FunctionType superCtor = createConstructor("Super", new Node(Token.LP), null);
    FunctionType subCtor = createConstructor("Sub", new Node(Token.LP), null);
    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());
    subCtor.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    JSType resolved = subCtor.resolve(errorReporter, null);
    assertSame(subCtor, resolved);
    assertNotNull(superCtor.getSubTypes());
    assertEquals(1, superCtor.getSubTypes().size());
  }
}
