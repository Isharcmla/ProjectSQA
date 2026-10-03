package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FunctionTypeTest {

  private JSTypeRegistry registry;
  private SimpleErrorReporter reporter;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private ObjectType objectType;
  private ObjectType unknownType;

  @Before
  public void setUp() {
    reporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(reporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    unknownType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
  }

  @Test
  public void testConstructors_allVariants() {
    Node fnNode = new Node(Token.FUNCTION);

    FunctionType fn1 = new FunctionType(registry, "f1", fnNode, null, numberType);
    assertEquals("f1", fn1.getReferenceName());
    assertTrue(fn1.isOrdinaryFunction());
    assertFalse(fn1.isConstructor());
    assertFalse(fn1.isInterface());
    assertEquals(numberType, fn1.getReturnType());
    assertEquals(unknownType, fn1.getTypeOfThis());
    assertNull(fn1.getTemplateTypeName());

    FunctionType fn2 = new FunctionType(registry, "f2", fnNode, null, stringType, objectType);
    assertEquals("f2", fn2.getReferenceName());
    assertEquals(objectType, fn2.getTypeOfThis());
    assertNull(fn2.getTemplateTypeName());

    FunctionType fn3 = new FunctionType(registry, "f3", fnNode, null, booleanType, objectType, "T");
    assertEquals("f3", fn3.getReferenceName());
    assertEquals("T", fn3.getTemplateTypeName());
    assertEquals(booleanType, fn3.getReturnType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_invalidSourceNode_throwsException() {
    Node invalidNode = new Node(Token.NAME);
    new FunctionType(registry, "invalid", invalidNode, null, numberType);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInterfaceConstructor_nullName_throwsException() {
    registry.createInterfaceType(null, new Node(Token.FUNCTION));
  }

  @Test
  public void testIsInstanceType() {
    FunctionType ctor = registry.createConstructorType("MyClass", null, null, null);
    assertFalse(ctor.isInstanceType());

    JSType u2u = registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());
  }

  @Test
  public void testKindsAndCanBeCalled() {
    FunctionType ordinary = registry.createFunctionType(numberType, new JSType[0]);
    assertTrue(ordinary.isOrdinaryFunction());
    assertFalse(ordinary.isConstructor());
    assertFalse(ordinary.isInterface());
    assertTrue(ordinary.isFunctionType());
    assertTrue(ordinary.canBeCalled());

    FunctionType ctor = registry.createConstructorType("Ctor", null, null, null);
    assertFalse(ctor.isOrdinaryFunction());
    assertTrue(ctor.isConstructor());
    assertFalse(ctor.isInterface());
    assertTrue(ctor.isFunctionType());
    assertTrue(ctor.canBeCalled());

    FunctionType iface = registry.createInterfaceType("Iface", new Node(Token.FUNCTION));
    assertFalse(iface.isOrdinaryFunction());
    assertFalse(iface.isConstructor());
    assertTrue(iface.isInterface());
    assertTrue(iface.isFunctionType());
    assertTrue(iface.canBeCalled());
  }

  @Test
  public void testParametersAndArgumentCounts() {
    FunctionType nullParams = new FunctionType(registry, "noParams", null, null, numberType);
    assertNull(nullParams.getParametersNode());
    assertFalse(nullParams.getParameters().iterator().hasNext());
    assertEquals(0, nullParams.getMinArguments());
    assertEquals(Integer.MAX_VALUE, nullParams.getMaxArguments());

    FunctionParamBuilder builder = new FunctionParamBuilder(registry);
    builder.addRequiredParams(numberType, stringType);
    builder.addOptionalParams(booleanType);
    Node paramsNode = builder.build();

    FunctionType fn = new FunctionType(registry, "fn", null, paramsNode, numberType);
    assertNotNull(fn.getParametersNode());
    assertEquals(3, fn.getParametersNode().getChildCount());

    int count = 0;
    for (Node p : fn.getParameters()) {
      count++;
    }
    assertEquals(3, count);
    assertEquals(2, fn.getMinArguments());
    assertEquals(3, fn.getMaxArguments());

    FunctionParamBuilder varArgsBuilder = new FunctionParamBuilder(registry);
    varArgsBuilder.addRequiredParams(numberType);
    varArgsBuilder.addVarArgs(stringType);
    FunctionType varArgsFn = new FunctionType(registry, "vFn", null, varArgsBuilder.build(), numberType);
    assertEquals(1, varArgsFn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, varArgsFn.getMaxArguments());

    Node emptyParams = new Node(Token.LP);
    FunctionType emptyParamsFn = new FunctionType(registry, "eFn", null, emptyParams, numberType);
    assertEquals(0, emptyParamsFn.getMinArguments());
    assertEquals(0, emptyParamsFn.getMaxArguments());
  }

  @Test
  public void testGetReturnType_andNullCall() {
    FunctionType fn = new FunctionType(registry, "f", null, null, numberType);
    assertEquals(numberType, fn.getReturnType());

    FunctionType iface = registry.createInterfaceType("Iface", new Node(Token.FUNCTION));
    assertNull(iface.getReturnType());
  }

  @Test
  public void testPrototypeOperations() {
    FunctionType ctor = registry.createConstructorType("Foo", null, null, null);
    assertNotNull(ctor.getPrototype());
    assertTrue(ctor.hasCachedValues());

    assertFalse(ctor.setPrototype(null));
    assertFalse(ctor.setPrototype((FunctionPrototypeType) ctor.getInstanceType()));

    ObjectType baseType = registry.createAnonymousObjectType();
    ctor.setPrototypeBasedOn(baseType);
    assertEquals(baseType, ctor.getPrototype().getImplicitPrototype());

    ObjectType baseType2 = registry.createAnonymousObjectType();
    ctor.setPrototypeBasedOn(baseType2);
    assertEquals(baseType2, ctor.getPrototype().getImplicitPrototype());

    FunctionType subCtor = registry.createConstructorType("SubFoo", null, null, null);
    subCtor.setPrototypeBasedOn(ctor.getInstanceType());
    assertEquals(ctor, subCtor.getSuperClassConstructor());
    assertNotNull(ctor.getSubTypes());
    assertTrue(ctor.getSubTypes().contains(subCtor));
  }

  @Test
  public void testImplementedInterfaces() {
    FunctionType ifaceA = registry.createInterfaceType("IfaceA", new Node(Token.FUNCTION));
    FunctionType ifaceB = registry.createInterfaceType("IfaceB", new Node(Token.FUNCTION));
    ifaceB.setPrototypeBasedOn(ifaceA.getInstanceType());

    FunctionType ifaceC = registry.createInterfaceType("IfaceC", new Node(Token.FUNCTION));

    FunctionType superCtor = registry.createConstructorType("Super", null, null, null);
    superCtor.setImplementedInterfaces(ImmutableList.of(ifaceC.getInstanceType()));

    FunctionType subCtor = registry.createConstructorType("Sub", null, null, null);
    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());
    subCtor.setImplementedInterfaces(ImmutableList.of(ifaceB.getInstanceType()));

    List<ObjectType> direct = ImmutableList.copyOf(subCtor.getImplementedInterfaces());
    assertEquals(2, direct.size());
    assertTrue(direct.contains(ifaceB.getInstanceType()));
    assertTrue(direct.contains(ifaceC.getInstanceType()));

    Iterable<ObjectType> all = subCtor.getAllImplementedInterfaces();
    List<ObjectType> allList = ImmutableList.copyOf(all);
    assertEquals(3, allList.size());
    assertTrue(allList.contains(ifaceA.getInstanceType()));
    assertTrue(allList.contains(ifaceB.getInstanceType()));
    assertTrue(allList.contains(ifaceC.getInstanceType()));

    FunctionType ordinary = registry.createFunctionType(numberType, new JSType[0]);
    assertFalse(ordinary.getImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void testProperties_prototypeCallApply() {
    FunctionType fnWithoutParams = new FunctionType(registry, "f", null, null, numberType);
    assertTrue(fnWithoutParams.hasProperty("prototype"));
    assertTrue(fnWithoutParams.hasProperty("call"));
    assertTrue(fnWithoutParams.hasProperty("apply"));
    assertTrue(fnWithoutParams.isPropertyTypeInferred("prototype"));

    JSType callProp1 = fnWithoutParams.getPropertyType("call");
    assertTrue(callProp1.isFunctionType());

    FunctionParamBuilder builder = new FunctionParamBuilder(registry);
    builder.addRequiredParams(numberType);
    FunctionType fnWithParams = new FunctionType(registry, "f2", null, builder.build(), stringType);
    JSType callProp2 = fnWithParams.getPropertyType("call");
    assertTrue(callProp2.isFunctionType());
    FunctionType callFn2 = (FunctionType) callProp2;
    assertEquals(stringType, callFn2.getReturnType());

    JSType applyProp = fnWithParams.getPropertyType("apply");
    assertTrue(applyProp.isFunctionType());

    assertTrue(fnWithParams.defineProperty("prototype", objectType, false, false));
    assertFalse(fnWithParams.defineProperty("prototype", numberType, false, false));
    assertTrue(fnWithParams.defineProperty("customProp", numberType, false, false));
    assertEquals(numberType, fnWithParams.getPropertyType("customProp"));
  }

  @Test
  public void testLeastSupertype() {
    FunctionType f1 = registry.createFunctionType(numberType, new JSType[0]);
    FunctionType f2 = registry.createFunctionType(stringType, new JSType[0]);
    JSType fnInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    JSType u2u = registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);

    assertSame(f1, f1.getLeastSupertype(f1));
    assertSame(fnInstance, f1.getLeastSupertype(fnInstance));
    assertSame(fnInstance, ((FunctionType) fnInstance).getLeastSupertype(f1));
    assertSame(u2u, f1.getLeastSupertype(f2));

    JSType stringLUB = f1.getLeastSupertype(stringType);
    assertNotNull(stringLUB);
  }

  @Test
  public void testGreatestSubtype() {
    FunctionType f1 = registry.createFunctionType(numberType, new JSType[0]);
    FunctionType f2 = registry.createFunctionType(stringType, new JSType[0]);
    JSType fnInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    JSType noObj = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);

    assertSame(f1, f1.getGreatestSubtype(f1));
    assertSame(f1, f1.getGreatestSubtype(fnInstance));
    assertSame(f1, ((FunctionType) fnInstance).getGreatestSubtype(f1));
    assertSame(noObj, f1.getGreatestSubtype(f2));

    JSType stringGLB = f1.getGreatestSubtype(stringType);
    assertNotNull(stringGLB);
  }

  @Test
  public void testGetSuperClassConstructor_andUnknownSupertype() {
    FunctionType parent = registry.createConstructorType("Parent", null, null, null);
    FunctionType child = registry.createConstructorType("Child", null, null, null);
    child.setPrototypeBasedOn(parent.getInstanceType());

    assertEquals(parent, child.getSuperClassConstructor());
    assertFalse(child.hasUnknownSupertype());

    FunctionType childWithUnknown = registry.createConstructorType("ChildUnknown", null, null, null);
    childWithUnknown.setPrototypeBasedOn(unknownType);
    assertTrue(childWithUnknown.hasUnknownSupertype());

    try {
      FunctionType ordinary = registry.createFunctionType(numberType, new JSType[0]);
      ordinary.getSuperClassConstructor();
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
    }
  }

  @Test
  public void testGetTopMostDefiningType() {
    FunctionType grandParent = registry.createConstructorType("GP", null, null, null);
    grandParent.getPrototype().defineProperty("prop", stringType, false, false);

    FunctionType parent = registry.createConstructorType("Parent", null, null, null);
    parent.setPrototypeBasedOn(grandParent.getInstanceType());
    parent.getPrototype().defineProperty("prop", stringType, false, false);

    FunctionType child = registry.createConstructorType("Child", null, null, null);
    child.setPrototypeBasedOn(parent.getInstanceType());
    child.getPrototype().defineProperty("prop", stringType, false, false);

    JSType top = child.getTopMostDefiningType("prop");
    assertEquals(grandParent.getInstanceType(), top);
  }

  @Test
  public void testEqualsAndHashCode_andHasEqualCallType() {
    FunctionType f1 = registry.createFunctionType(numberType, new JSType[0]);
    FunctionType f2 = registry.createFunctionType(numberType, new JSType[0]);
    FunctionType f3 = registry.createFunctionType(stringType, new JSType[0]);

    assertTrue(f1.equals(f2));
    assertFalse(f1.equals(f3));
    assertFalse(f1.equals(null));
    assertFalse(f1.equals("string"));
    assertEquals(f1.hashCode(), f2.hashCode());
    assertTrue(f1.hasEqualCallType(f2));

    FunctionType c1 = registry.createConstructorType("C1", null, null, null);
    FunctionType c2 = registry.createConstructorType("C1", null, null, null);
    assertFalse(c1.equals(c2));
    assertTrue(c1.equals(c1));
    assertFalse(c1.equals(f1));

    FunctionType i1 = registry.createInterfaceType("I1", new Node(Token.FUNCTION));
    FunctionType i2 = registry.createInterfaceType("I1", new Node(Token.FUNCTION));
    FunctionType i3 = registry.createInterfaceType("I2", new Node(Token.FUNCTION));
    assertTrue(i1.equals(i2));
    assertFalse(i1.equals(i3));
    assertFalse(i1.equals(c1));
    assertFalse(i1.equals(f1));
    assertFalse(f1.equals(i1));
    assertEquals(i1.hashCode(), i2.hashCode());
  }

  @Test
  public void testToString() {
    FunctionType fnInstance = (FunctionType) registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals("Function", fnInstance.toString());

    FunctionType simple = registry.createFunctionType(numberType, new JSType[0]);
    assertEquals("function (): number", simple.toString());

    FunctionParamBuilder builder = new FunctionParamBuilder(registry);
    builder.addRequiredParams(numberType, stringType);
    JSType union = registry.createUnionType(booleanType, registry.getNativeType(JSTypeNative.VOID_TYPE));
    builder.addVarArgs(union);
    FunctionType complex = new FunctionType(registry, "myFn", null, builder.build(), numberType, objectType);
    assertEquals("function (this:Object, number, string, ...[boolean]): number", complex.toString());
  }

  @Test
  public void testIsSubtype() {
    FunctionType fn1 = registry.createFunctionType(numberType, new JSType[0]);
    FunctionType fn2 = registry.createFunctionType(numberType, new JSType[0]);
    assertTrue(fn1.isSubtype(fn1));
    assertTrue(fn1.isSubtype(fn2));

    FunctionType iface = registry.createInterfaceType("Iface", new Node(Token.FUNCTION));
    assertTrue(fn1.isSubtype(iface));
    assertFalse(iface.isSubtype(fn1));

    JSType union = registry.createUnionType(fn1, stringType);
    assertTrue(fn1.isSubtype(union));

    assertFalse(fn1.isSubtype(numberType));
  }

  @Test
  public void testVisitor() {
    FunctionType fn = registry.createFunctionType(numberType, new JSType[0]);
    Visitor<String> visitor = new Visitor<String>() {
      @Override
      public String caseNoType() { return null; }
      @Override
      public String caseEnumElementType(EnumElementType type) { return null; }
      @Override
      public String caseAllType() { return null; }
      @Override
      public String caseBooleanType() { return null; }
      @Override
      public String caseNoObjectType() { return null; }
      @Override
      public String caseFunctionType(FunctionType type) { return "visited-function"; }
      @Override
      public String caseObjectType(ObjectType type) { return null; }
      @Override
      public String caseUnknownType() { return null; }
      @Override
      public String caseNullType() { return null; }
      @Override
      public String caseNamedType(NamedType type) { return null; }
      @Override
      public String caseRecordType(RecordType type) { return null; }
      @Override
      public String caseStringType() { return null; }
      @Override
      public String caseVoidType() { return null; }
      @Override
      public String caseUnionType(UnionType type) { return null; }
      @Override
      public String caseNumberType() { return null; }
      @Override
      public String caseTemplateType(TemplateType templateType) { return null; }
    };
    assertEquals("visited-function", fn.visit(visitor));
  }

  @Test
  public void testInstanceType_andSource_andNoObjectType() {
    FunctionType ctor = registry.createConstructorType("Foo", null, null, null);
    assertTrue(ctor.hasInstanceType());
    assertNotNull(ctor.getInstanceType());

    ObjectType anon = registry.createAnonymousObjectType();
    ctor.setInstanceType(anon);
    assertSame(anon, ctor.getInstanceType());

    FunctionType ordinary = registry.createFunctionType(numberType, new JSType[0]);
    assertFalse(ordinary.hasInstanceType());
    try {
      ordinary.getInstanceType();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
    }

    Node fnNode = new Node(Token.FUNCTION);
    ordinary.setSource(fnNode);
    assertSame(fnNode, ordinary.getSource());

    FunctionType noObjCtor = registry.createConstructorType(
        "NoObjCtor", null, null, null, registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE));
    assertEquals(objectType, noObjCtor.getTypeOfThis());
  }

  @Test
  public void testResolveInternal() {
    FunctionType iface = registry.createInterfaceType("Iface", new Node(Token.FUNCTION));
    FunctionType parent = registry.createConstructorType("Parent", null, null, null);
    FunctionType child = registry.createConstructorType("Child", null, null, null);
    child.setPrototypeBasedOn(parent.getInstanceType());
    child.setImplementedInterfaces(Collections.singletonList(iface.getInstanceType()));

    JSType resolved = child.resolve(reporter, null);
    assertNotNull(resolved);
    assertTrue(resolved.isFunctionType());
  }
}
