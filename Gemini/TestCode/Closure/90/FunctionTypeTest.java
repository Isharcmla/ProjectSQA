package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class FunctionTypeTest {

  private JSTypeRegistry registry;
  private SimpleErrorReporter errorReporter;
  private JSType NUMBER_TYPE;
  private JSType STRING_TYPE;
  private JSType BOOLEAN_TYPE;
  private JSType OBJECT_TYPE;
  private JSType NO_OBJECT_TYPE;
  private JSType UNKNOWN_TYPE;
  private JSType VOID_TYPE;
  private JSType FUNCTION_INSTANCE_TYPE;
  private JSType U2U_CONSTRUCTOR_TYPE;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    NUMBER_TYPE = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    STRING_TYPE = registry.getNativeType(JSTypeNative.STRING_TYPE);
    BOOLEAN_TYPE = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    OBJECT_TYPE = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    NO_OBJECT_TYPE = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    UNKNOWN_TYPE = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    VOID_TYPE = registry.getNativeType(JSTypeNative.VOID_TYPE);
    FUNCTION_INSTANCE_TYPE = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    U2U_CONSTRUCTOR_TYPE = registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
  }

  private FunctionType createFunction(JSType returnType, JSType... paramTypes) {
    Node paramsNode = new Node(Token.LP);
    for (int i = 0; i < paramTypes.length; i++) {
      Node param = Node.newString(Token.NAME, "arg" + i);
      param.setJSType(paramTypes[i]);
      paramsNode.addChildToBack(param);
    }
    ArrowType arrow = new ArrowType(registry, paramsNode, returnType);
    return new FunctionType(registry, "fn", null, arrow, null, null, false, false);
  }

  private FunctionType createConstructor(String name, JSType returnType, JSType... paramTypes) {
    Node paramsNode = new Node(Token.LP);
    for (int i = 0; i < paramTypes.length; i++) {
      Node param = Node.newString(Token.NAME, "arg" + i);
      param.setJSType(paramTypes[i]);
      paramsNode.addChildToBack(param);
    }
    ArrowType arrow = new ArrowType(registry, paramsNode, returnType);
    return new FunctionType(registry, name, null, arrow, null, null, true, false);
  }

  @Test
  public void testConstructor_normalAndInvalidSource() {
    Node funcNode = new Node(Token.FUNCTION);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), NUMBER_TYPE);
    FunctionType fn = new FunctionType(registry, "testFn", funcNode, arrow, null, "T", false, false);
    assertEquals("testFn", fn.getName());
    assertEquals("T", fn.getTemplateTypeName());
    assertEquals(funcNode, fn.getSource());
    assertTrue(fn.isOrdinaryFunction());
    assertFalse(fn.isConstructor());
    assertFalse(fn.isInterface());
    assertTrue(fn.isFunctionType());
    assertTrue(fn.canBeCalled());

    try {
      Node invalidNode = new Node(Token.VAR);
      new FunctionType(registry, "bad", invalidNode, arrow, null, null, false, false);
      fail("Expected IllegalArgumentException for invalid source node type");
    } catch (IllegalArgumentException e) {
      // Expected
    }
  }

  @Test
  public void testConstructor_withNoObjectTypeThis() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), NUMBER_TYPE);
    FunctionType ctor = new FunctionType(
        registry, "Ctor", null, arrow, (ObjectType) NO_OBJECT_TYPE, null, true, false);
    assertEquals(OBJECT_TYPE, ctor.getTypeOfThis());
  }

  @Test
  public void testForInterface_creationAndValidation() {
    Node funcNode = new Node(Token.FUNCTION);
    FunctionType iface = FunctionType.forInterface(registry, "MyInterface", funcNode);
    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());
    assertEquals("MyInterface", iface.getName());
    assertEquals(funcNode, iface.getSource());
    assertTrue(iface.hasInstanceType());
    assertNotNull(iface.getInstanceType());

    try {
      FunctionType.forInterface(registry, null, funcNode);
      fail("Expected IllegalArgumentException for null interface name");
    } catch (IllegalArgumentException e) {
      // Expected
    }

    try {
      Node invalidNode = new Node(Token.EXPR_RESULT);
      FunctionType.forInterface(registry, "MyInterface2", invalidNode);
      fail("Expected IllegalArgumentException for non-function source node");
    } catch (IllegalArgumentException e) {
      // Expected
    }
  }

  @Test
  public void testIsInstanceType() {
    FunctionType normalFn = createFunction(NUMBER_TYPE);
    assertFalse(normalFn.isInstanceType());

    FunctionType u2u = registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());
  }

  @Test
  public void testParametersAndArgumentCounts() {
    Node paramsNode = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(NUMBER_TYPE);
    Node p2 = Node.newString(Token.NAME, "b");
    p2.setJSType(STRING_TYPE);
    p2.setOptionalArg(true);
    Node p3 = Node.newString(Token.NAME, "c");
    p3.setJSType(BOOLEAN_TYPE);
    p3.setVarArgs(true);

    paramsNode.addChildToBack(p1);
    paramsNode.addChildToBack(p2);
    paramsNode.addChildToBack(p3);

    ArrowType arrow = new ArrowType(registry, paramsNode, VOID_TYPE);
    FunctionType fn = new FunctionType(registry, "fn", null, arrow, null, null, false, false);

    assertEquals(paramsNode, fn.getParametersNode());
    int count = 0;
    for (Node p : fn.getParameters()) {
      count++;
    }
    assertEquals(3, count);
    assertEquals(1, fn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());

    // Test with no varargs and non-optional params
    FunctionType fn2 = createFunction(VOID_TYPE, NUMBER_TYPE, STRING_TYPE);
    assertEquals(2, fn2.getMinArguments());
    assertEquals(2, fn2.getMaxArguments());

    // Test with null parameters node in arrow
    ArrowType nullArrow = new ArrowType(registry, null, VOID_TYPE);
    FunctionType fnNullParams = new FunctionType(registry, "nullParams", null, nullArrow, null, null, false, false);
    assertFalse(fnNullParams.getParameters().iterator().hasNext());
    assertEquals(Integer.MAX_VALUE, fnNullParams.getMaxArguments());
  }

  @Test
  public void testReturnTypeAndInferred() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), NUMBER_TYPE, true);
    FunctionType fn = new FunctionType(registry, "fn", null, arrow, null, null, false, false);
    assertEquals(NUMBER_TYPE, fn.getReturnType());
    assertTrue(fn.isReturnTypeInferred());
    assertEquals(arrow, fn.getInternalArrowType());
  }

  @Test
  public void testPrototypeOperations() {
    FunctionType ctor = createConstructor("Ctor", VOID_TYPE);
    FunctionPrototypeType proto = ctor.getPrototype();
    assertNotNull(proto);
    assertTrue(ctor.hasCachedValues());

    // Setting prototype to null should return false
    assertFalse(ctor.setPrototype(null));

    // Setting prototype to its instance type should return false
    assertFalse(ctor.setPrototype((FunctionPrototypeType) (ObjectType) ctor.getInstanceType()));

    // Setting prototype based on base type when proto already exists vs null
    FunctionType ctor2 = createConstructor("Ctor2", VOID_TYPE);
    ObjectType baseObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ctor2.setPrototypeBasedOn(baseObj);
    assertNotNull(ctor2.getPrototype());
    ctor2.setPrototypeBasedOn(baseObj); // already initialized branch

    // Super class linkage upon setting prototype
    FunctionType subCtor = createConstructor("SubCtor", VOID_TYPE);
    FunctionPrototypeType subProto = new FunctionPrototypeType(registry, subCtor, ctor.getInstanceType());
    assertTrue(subCtor.setPrototype(subProto));
    assertEquals(ctor, subCtor.getSuperClassConstructor());
    assertNotNull(ctor.getSubTypes());
    assertTrue(ctor.getSubTypes().contains(subCtor));
  }

  @Test
  public void testImplementedInterfacesAndRelated() {
    FunctionType ifaceParent = FunctionType.forInterface(registry, "ParentInterface", null);
    FunctionType ifaceChild = FunctionType.forInterface(registry, "ChildInterface", null);
    ifaceChild.setPrototypeBasedOn(ifaceParent.getInstanceType());

    FunctionType ctorParent = createConstructor("ParentClass", VOID_TYPE);
    ctorParent.setImplementedInterfaces(ImmutableList.of(ifaceParent.getInstanceType()));

    FunctionType ctorChild = createConstructor("ChildClass", VOID_TYPE);
    ctorChild.setPrototypeBasedOn(ctorParent.getInstanceType());
    ctorChild.setImplementedInterfaces(ImmutableList.of(ifaceChild.getInstanceType()));

    Iterable<ObjectType> directInterfaces = ctorChild.getImplementedInterfaces();
    List<ObjectType> directList = Lists.newArrayList(directInterfaces);
    assertEquals(2, directList.size());

    Iterable<ObjectType> allInterfaces = ctorChild.getAllImplementedInterfaces();
    List<ObjectType> allList = Lists.newArrayList(allInterfaces);
    assertTrue(allList.contains(ifaceParent.getInstanceType()));
    assertTrue(allList.contains(ifaceChild.getInstanceType()));

    // Interface with non-interface constructor in prototype chain check
    FunctionType dummyCtor = createConstructor("Dummy", VOID_TYPE);
    FunctionType ifaceWithNormalSuper = FunctionType.forInterface(registry, "IfaceNormal", null);
    ifaceWithNormalSuper.setPrototypeBasedOn(dummyCtor.getInstanceType());
    FunctionType ctorUsingIt = createConstructor("CtorUsingIt", VOID_TYPE);
    ctorUsingIt.setImplementedInterfaces(ImmutableList.of(ifaceWithNormalSuper.getInstanceType()));
    List<ObjectType> list = Lists.newArrayList(ctorUsingIt.getAllImplementedInterfaces());
    assertTrue(list.contains(ifaceWithNormalSuper.getInstanceType()));
  }

  @Test
  public void testProperties_prototypeCallApply() {
    FunctionType fn = createFunction(NUMBER_TYPE, STRING_TYPE);
    assertTrue(fn.hasProperty("prototype"));
    assertTrue(fn.hasOwnProperty("prototype"));
    assertTrue(fn.isPropertyTypeInferred("prototype"));
    assertNotNull(fn.getPropertyType("prototype"));

    // Lazy definition of "call" and "apply"
    assertTrue(fn.hasProperty("call"));
    JSType callProp = fn.getPropertyType("call");
    assertTrue(callProp.isFunctionType());

    assertTrue(fn.hasProperty("apply"));
    JSType applyProp = fn.getPropertyType("apply");
    assertTrue(applyProp.isFunctionType());

    // Lazy definition of "call" when parameters are null
    FunctionType fnNoParams = new FunctionType(
        registry, "noParams", null, new ArrowType(registry, null, VOID_TYPE), null, null, false, false);
    JSType callPropNoParams = fnNoParams.getPropertyType("call");
    assertTrue(callPropNoParams.isFunctionType());

    // Define property on "prototype"
    FunctionType ctor = createConstructor("Ctor", VOID_TYPE);
    ObjectType protoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertTrue(ctor.defineProperty("prototype", protoObj, false, false));
    assertTrue(ctor.defineProperty("prototype", ctor.getPrototype(), false, false)); // equivalent branch
    assertFalse(ctor.defineProperty("prototype", NUMBER_TYPE, false, false)); // non-object type branch

    // Normal property definition
    assertTrue(ctor.defineProperty("customProp", NUMBER_TYPE, true, false));
    assertTrue(ctor.isPropertyTypeInferred("customProp"));
  }

  @Test
  public void testLeastSupertypeAndGreatestSubtype() {
    FunctionType fn1 = createFunction(NUMBER_TYPE, STRING_TYPE);
    FunctionType fn2 = createFunction(NUMBER_TYPE, STRING_TYPE);

    // Equivalent functions
    assertEquals(fn1, fn1.getLeastSupertype(fn2));
    assertEquals(fn1, fn1.getGreatestSubtype(fn2));

    // Different return types
    FunctionType fn3 = createFunction(OBJECT_TYPE, STRING_TYPE);
    JSType sup = fn1.getLeastSupertype(fn3);
    assertTrue(sup.isFunctionType());
    JSType inf = fn1.getGreatestSubtype(fn3);
    assertTrue(inf.isFunctionType());

    // Functions with different parameters that cannot be merged piecewise
    FunctionType fnDiffParams = createFunction(NUMBER_TYPE, NUMBER_TYPE);
    JSType supDiff = fn1.getLeastSupertype(fnDiffParams);
    assertEquals(U2U_CONSTRUCTOR_TYPE, supDiff);
    JSType infDiff = fn1.getGreatestSubtype(fnDiffParams);
    assertEquals(registry.getNativeFunctionType(JSTypeNative.LEAST_FUNCTION_TYPE), infDiff);

    // Function instance type special cases
    assertEquals(FUNCTION_INSTANCE_TYPE, fn1.getLeastSupertype(FUNCTION_INSTANCE_TYPE));
    assertEquals(fn1, fn1.getGreatestSubtype(FUNCTION_INSTANCE_TYPE));
    assertEquals(FUNCTION_INSTANCE_TYPE, FUNCTION_INSTANCE_TYPE.getLeastSupertype(fn1));
    assertEquals(fn1, FUNCTION_INSTANCE_TYPE.getGreatestSubtype(fn1));

    // Non-function type comparison delegation
    JSType nonFuncSup = fn1.getLeastSupertype(NUMBER_TYPE);
    assertTrue(nonFuncSup.isUnionType());
    JSType nonFuncInf = fn1.getGreatestSubtype(NUMBER_TYPE);
    assertTrue(nonFuncInf.isNoType() || nonFuncInf.isNoObjectType());
  }

  @Test
  public void testHasUnknownSupertypeAndTopMostDefiningType() {
    FunctionType grandParent = createConstructor("GrandParent", VOID_TYPE);
    grandParent.getPrototype().defineProperty("inheritedProp", NUMBER_TYPE, false, false);

    FunctionType parent = createConstructor("Parent", VOID_TYPE);
    parent.setPrototypeBasedOn(grandParent.getInstanceType());

    FunctionType child = createConstructor("Child", VOID_TYPE);
    child.setPrototypeBasedOn(parent.getInstanceType());

    assertFalse(child.hasUnknownSupertype());
    assertEquals(grandParent.getInstanceType(), child.getTopMostDefiningType("inheritedProp"));

    // Constructor with unknown supertype
    FunctionType unknownSuper = createConstructor("UnknownSuper", VOID_TYPE);
    unknownSuper.setPrototypeBasedOn((ObjectType) UNKNOWN_TYPE);
    assertTrue(unknownSuper.hasUnknownSupertype());

    // Constructor with no superclass
    assertFalse(grandParent.hasUnknownSupertype());
  }

  @Test
  public void testIsEquivalentToAndHashCode() {
    FunctionType fn1 = createFunction(NUMBER_TYPE, STRING_TYPE);
    FunctionType fn2 = createFunction(NUMBER_TYPE, STRING_TYPE);
    FunctionType fn3 = createFunction(BOOLEAN_TYPE, STRING_TYPE);

    assertTrue(fn1.isEquivalentTo(fn2));
    assertFalse(fn1.isEquivalentTo(fn3));
    assertFalse(fn1.isEquivalentTo(NUMBER_TYPE));
    assertEquals(fn1.hashCode(), fn2.hashCode());
    assertTrue(fn1.hasEqualCallType(fn2));

    FunctionType ctor1 = createConstructor("Ctor1", VOID_TYPE);
    FunctionType ctor2 = createConstructor("Ctor2", VOID_TYPE);
    assertFalse(ctor1.isEquivalentTo(ctor2));
    assertTrue(ctor1.isEquivalentTo(ctor1));
    assertFalse(ctor1.isEquivalentTo(fn1));

    FunctionType iface1 = FunctionType.forInterface(registry, "Iface", null);
    FunctionType iface2 = FunctionType.forInterface(registry, "Iface", null);
    FunctionType iface3 = FunctionType.forInterface(registry, "OtherIface", null);
    assertTrue(iface1.isEquivalentTo(iface2));
    assertFalse(iface1.isEquivalentTo(iface3));
    assertFalse(iface1.isEquivalentTo(ctor1));
    assertFalse(ctor1.isEquivalentTo(iface1));
    assertFalse(fn1.isEquivalentTo(iface1));
    assertEquals(iface1.hashCode(), iface2.hashCode());
  }

  @Test
  public void testToStringAndDebugHashCode() {
    // Function instance type
    assertEquals("Function", FUNCTION_INSTANCE_TYPE.toString());
    assertNotNull(FUNCTION_INSTANCE_TYPE.toDebugHashCodeString());

    // Function with explicit this and normal params
    Node paramsNode = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "p1");
    p1.setJSType(STRING_TYPE);
    Node p2 = Node.newString(Token.NAME, "p2");
    p2.setJSType(registry.createUnionType(NUMBER_TYPE, VOID_TYPE));
    p2.setVarArgs(true);
    paramsNode.addChildToBack(p1);
    paramsNode.addChildToBack(p2);

    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ArrowType arrow = new ArrowType(registry, paramsNode, BOOLEAN_TYPE);
    FunctionType fn = new FunctionType(registry, "custom", null, arrow, thisType, null, false, false);

    String str = fn.toString();
    assertTrue(str.startsWith("function (this:Object, string, ...[number]): boolean"));

    String debugStr = fn.toDebugHashCodeString();
    assertTrue(debugStr.contains("function (this:"));
  }

  @Test
  public void testIsSubtype() {
    FunctionType fn1 = createFunction(NUMBER_TYPE, STRING_TYPE);
    FunctionType fn2 = createFunction(NUMBER_TYPE, STRING_TYPE);
    assertTrue(fn1.isSubtype(fn2));

    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    assertTrue(fn1.isSubtype(iface));
    assertFalse(iface.isSubtype(fn1));

    FunctionType ctor = createConstructor("Ctor", VOID_TYPE);
    assertTrue(ctor.isSubtype(FUNCTION_INSTANCE_TYPE));
    assertFalse(ctor.isSubtype(NUMBER_TYPE));
  }

  @Test
  public void testVisit() {
    FunctionType fn = createFunction(NUMBER_TYPE);
    String result = fn.visit(new Visitor<String>() {
      @Override
      public String caseNoType() { return "no"; }
      @Override
      public String caseEnumElementType(EnumElementType type) { return "enum"; }
      @Override
      public String caseAllType() { return "all"; }
      @Override
      public String caseBooleanType() { return "bool"; }
      @Override
      public String caseNoObjectType() { return "no_obj"; }
      @Override
      public String caseFunctionType(FunctionType type) { return "function_visited"; }
      @Override
      public String caseObjectType(ObjectType type) { return "obj"; }
      @Override
      public String caseUnknownType() { return "unknown"; }
      @Override
      public String caseNullType() { return "null"; }
      @Override
      public String caseNamedType(NamedType type) { return "named"; }
      @Override
      public String caseNumberType() { return "num"; }
      @Override
      public String caseStringType() { return "str"; }
      @Override
      public String caseVoidType() { return "void"; }
      @Override
      public String caseUnionType(UnionType type) { return "union"; }
      @Override
      public String caseTemplateType(TemplateType templateType) { return "template"; }
    });
    assertEquals("function_visited", result);
  }

  @Test
  public void testResolveInternal() {
    FunctionType parent = createConstructor("Parent", VOID_TYPE);
    FunctionType child = createConstructor("Child", VOID_TYPE);
    child.setPrototypeBasedOn(parent.getInstanceType());

    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    child.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    StaticScope<JSType> scope = registry.createScope();
    JSType resolved = child.resolve(errorReporter, scope);
    assertNotNull(resolved);
    assertTrue(resolved.isFunctionType());
  }

  @Test
  public void testSourceGetterSetterAndInstanceTypeExceptions() {
    FunctionType fn = createFunction(NUMBER_TYPE);
    assertNull(fn.getSource());

    Node src = new Node(Token.FUNCTION);
    fn.setSource(src);
    assertEquals(src, fn.getSource());

    assertFalse(fn.hasInstanceType());
    try {
      fn.getInstanceType();
      fail("Expected IllegalStateException calling getInstanceType on ordinary function");
    } catch (IllegalStateException e) {
      // Expected
    }

    FunctionType ctor = createConstructor("Ctor", VOID_TYPE);
    assertTrue(ctor.hasInstanceType());
    assertNotNull(ctor.getInstanceType());

    ObjectType customInstance = new InstanceObjectType(registry, ctor, false);
    ctor.setInstanceType(customInstance);
    assertEquals(customInstance, ctor.getInstanceType());
  }
}
