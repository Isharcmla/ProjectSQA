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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class FunctionTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private ObjectType objectType;
  private FunctionType fnInstanceType;

  @Before
  public void setUp() {
    errorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {}

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {}
    };
    registry = new JSTypeRegistry(errorReporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    fnInstanceType = registry.getNativeFunctionType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
  }

  private Node createFunctionNode() {
    return new Node(Token.FUNCTION, Node.newString(Token.NAME, "fn"), new Node(Token.LP), new Node(Token.BLOCK));
  }

  private Node createParamsNode(JSType... types) {
    Node lp = new Node(Token.LP);
    int i = 0;
    for (JSType type : types) {
      Node name = Node.newString(Token.NAME, "arg" + (i++));
      name.setJSType(type);
      lp.addChildToBack(name);
    }
    return lp;
  }

  @Test
  public void testConstructorAndKindPredicates_ordinaryFunction() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), numberType);
    FunctionType fn = new FunctionType(registry, "myFn", null, arrow, null, null, false, false);

    assertTrue(fn.isOrdinaryFunction());
    assertFalse(fn.isConstructor());
    assertFalse(fn.isInterface());
    assertFalse(fn.hasInstanceType());
    assertTrue(fn.canBeCalled());
    assertSame(fn, fn.toMaybeFunctionType());
    assertNull(fn.getSource());
    assertNull(fn.getTemplateTypeName());
    assertEquals(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), fn.getTypeOfThis());
  }

  @Test
  public void testConstructorAndKindPredicates_constructorFunction() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), null);
    Node source = createFunctionNode();
    FunctionType ctor = new FunctionType(registry, "MyClass", source, arrow, null, "T", true, false);

    assertFalse(ctor.isOrdinaryFunction());
    assertTrue(ctor.isConstructor());
    assertFalse(ctor.isInterface());
    assertTrue(ctor.hasInstanceType());
    assertEquals("T", ctor.getTemplateTypeName());
    assertSame(source, ctor.getSource());
    assertNotNull(ctor.getInstanceType());
    assertSame(ctor.getInstanceType(), ctor.getTypeOfThis());
  }

  @Test
  public void testInterfaceFunctionCreationAndPredicates() {
    Node source = createFunctionNode();
    FunctionType iface = FunctionType.forInterface(registry, "MyInterface", source);

    assertFalse(iface.isOrdinaryFunction());
    assertFalse(iface.isConstructor());
    assertTrue(iface.isInterface());
    assertTrue(iface.hasInstanceType());
    assertSame(source, iface.getSource());
    assertNotNull(iface.getInstanceType());
    assertSame(iface.getInstanceType(), iface.getTypeOfThis());
  }

  @Test
  public void testIsInstanceType_universalConstructor() {
    FunctionType u2u = registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());

    FunctionType normalFn = registry.createFunctionType(numberType);
    assertFalse(normalFn.isInstanceType());
  }

  @Test
  public void testSetSourceAndGetSource() {
    FunctionType fn = registry.createFunctionType(numberType);
    assertNull(fn.getSource());
    Node src = createFunctionNode();
    fn.setSource(src);
    assertSame(src, fn.getSource());
  }

  @Test
  public void testGetParameters_andMinMaxArguments() {
    // Ordinary function with 2 required params, 1 optional, 1 varargs
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "p1");
    p1.setJSType(numberType);
    Node p2 = Node.newString(Token.NAME, "p2");
    p2.setJSType(stringType);
    Node p3 = Node.newString(Token.NAME, "p3");
    p3.setJSType(booleanType);
    p3.setOptionalArg(true);
    Node p4 = Node.newString(Token.NAME, "p4");
    p4.setJSType(objectType);
    p4.setVarArgs(true);

    lp.addChildToBack(p1);
    lp.addChildToBack(p2);
    lp.addChildToBack(p3);
    lp.addChildToBack(p4);

    ArrowType arrow = new ArrowType(registry, lp, numberType);
    FunctionType fn = new FunctionType(registry, "f", null, arrow, null, null, false, false);

    assertSame(lp, fn.getParametersNode());
    assertEquals(2, fn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());

    Iterator<Node> it = fn.getParameters().iterator();
    assertTrue(it.hasNext());
    assertSame(p1, it.next());
    assertSame(p2, it.next());
    assertSame(p3, it.next());
    assertSame(p4, it.next());
    assertFalse(it.hasNext());
  }

  @Test
  public void testGetParameters_emptyAndNullParamsNode() {
    ArrowType arrowNoParams = new ArrowType(registry, null, numberType);
    FunctionType fnNoParams = new FunctionType(registry, "f", null, arrowNoParams, null, null, false, false);

    assertNull(fnNoParams.getParametersNode());
    assertFalse(fnNoParams.getParameters().iterator().hasNext());
    assertEquals(0, fnNoParams.getMinArguments());
    assertEquals(Integer.MAX_VALUE, fnNoParams.getMaxArguments());

    ArrowType arrowEmptyParams = new ArrowType(registry, new Node(Token.LP), numberType);
    FunctionType fnEmptyParams = new FunctionType(registry, "f2", null, arrowEmptyParams, null, null, false, false);
    assertEquals(0, fnEmptyParams.getMinArguments());
    assertEquals(0, fnEmptyParams.getMaxArguments());
  }

  @Test
  public void testGetReturnTypeAndIsInferred() {
    ArrowType arrow1 = new ArrowType(registry, new Node(Token.LP), numberType, true);
    FunctionType fn1 = new FunctionType(registry, "f1", null, arrow1, null, null, false, false);
    assertSame(numberType, fn1.getReturnType());
    assertTrue(fn1.isReturnTypeInferred());
    assertSame(arrow1, fn1.getInternalArrowType());

    ArrowType arrow2 = new ArrowType(registry, new Node(Token.LP), stringType, false);
    FunctionType fn2 = new FunctionType(registry, "f2", null, arrow2, null, null, false, false);
    assertSame(stringType, fn2.getReturnType());
    assertFalse(fn2.isReturnTypeInferred());
  }

  @Test
  public void testPrototypeHandlingAndLazyInitialization() {
    FunctionType ctor = registry.createConstructorType("Foo", null, null, null);
    assertFalse(ctor.getOwnPropertyNames().contains("prototype"));

    ObjectType proto = ctor.getPrototype();
    assertNotNull(proto);
    assertEquals("Foo.prototype", proto.getReferenceName());
    assertTrue(ctor.getOwnPropertyNames().contains("prototype"));

    StaticSlot<JSType> slot = ctor.getSlot("prototype");
    assertNotNull(slot);
    assertSame(proto, slot.getType());

    // setPrototype with null
    assertFalse(ctor.setPrototype(null));

    // setPrototype with same instance type on constructor
    assertFalse(ctor.setPrototype((PrototypeObjectType) ctor.getInstanceType()));

    // setPrototype valid
    PrototypeObjectType customProto = new PrototypeObjectType(registry, "CustomProto", objectType);
    assertTrue(ctor.setPrototype(customProto));
    assertSame(customProto, ctor.getPrototype());
    assertSame(customProto, ctor.getSlot("prototype").getType());
  }

  @Test
  public void testSetPrototypeBasedOn_variousBaseTypes() {
    FunctionType ctor = registry.createConstructorType("Bar", null, null, null);

    // Named prototype object
    ObjectType namedObj = new PrototypeObjectType(registry, "NamedProto", objectType);
    ctor.setPrototypeBasedOn(namedObj);
    assertEquals("Bar.prototype", ctor.getPrototype().getReferenceName());
    assertSame(namedObj, ctor.getPrototype().getImplicitPrototype());

    // Unknown type
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    ctor.setPrototypeBasedOn((ObjectType) unknown);
    assertEquals("Bar.prototype", ctor.getPrototype().getReferenceName());

    // Anonymous prototype object
    PrototypeObjectType anonObj = new PrototypeObjectType(registry, null, objectType);
    ctor.setPrototypeBasedOn(anonObj);
    assertSame(anonObj, ctor.getPrototype());
  }

  @Test
  public void testDefineProperty_prototype() {
    FunctionType ctor = registry.createConstructorType("Baz", null, null, null);
    ObjectType proto = ctor.getPrototype();

    // Re-defining same prototype object returns true
    assertTrue(ctor.defineProperty("prototype", proto, false, null));

    // Defining non-object returns false
    assertFalse(ctor.defineProperty("prototype", numberType, false, null));

    // Defining new object prototype
    ObjectType newProto = new PrototypeObjectType(registry, "Other", objectType);
    assertTrue(ctor.defineProperty("prototype", newProto, false, null));
    assertEquals("Baz.prototype", ctor.getPrototype().getReferenceName());

    // Normal property
    assertTrue(ctor.defineProperty("customProp", numberType, false, null));
    assertSame(numberType, ctor.getPropertyType("customProp"));
  }

  @Test
  public void testGetPropertyType_callAndApplyLazyDefinition() {
    Node lp = createParamsNode(numberType, stringType);
    ArrowType arrow = new ArrowType(registry, lp, booleanType);
    FunctionType fn = new FunctionType(registry, "testFn", null, arrow, objectType, null, false, false);

    JSType callProp = fn.getPropertyType("call");
    assertNotNull(callProp);
    assertTrue(callProp.isFunctionType());
    FunctionType callFn = callProp.toMaybeFunctionType();
    assertSame(booleanType, callFn.getReturnType());
    assertEquals(3, callFn.getParametersNode().getChildCount()); // thisType + 2 args

    JSType applyProp = fn.getPropertyType("apply");
    assertNotNull(applyProp);
    assertTrue(applyProp.isFunctionType());
    FunctionType applyFn = applyProp.toMaybeFunctionType();
    assertSame(booleanType, applyFn.getReturnType());
    assertEquals(2, applyFn.getParametersNode().getChildCount());

    // Call property when getParametersNode is null
    ArrowType arrowNoParams = new ArrowType(registry, null, booleanType);
    FunctionType fnNoParams = new FunctionType(registry, "testFn2", null, arrowNoParams, objectType, null, false, false);
    JSType callPropNoParams = fnNoParams.getPropertyType("call");
    assertNotNull(callPropNoParams);
  }

  @Test
  public void testSuperClassConstructorAndSubTypes() {
    FunctionType superCtor = registry.createConstructorType("Super", null, null, null);
    FunctionType subCtor = registry.createConstructorType("Sub", null, null, null);

    subCtor.getPrototype().setImplicitPrototype(superCtor.getInstanceType());
    assertTrue(subCtor.setPrototype(subCtor.getPrototype()));

    assertSame(superCtor, subCtor.getSuperClassConstructor());
    assertNotNull(superCtor.getSubTypes());
    assertTrue(superCtor.getSubTypes().contains(subCtor));
  }

  @Test
  public void testImplementedInterfaces_singleAndInherited() {
    FunctionType iface1 = FunctionType.forInterface(registry, "I1", createFunctionNode());
    FunctionType iface2 = FunctionType.forInterface(registry, "I2", createFunctionNode());

    FunctionType superCtor = registry.createConstructorType("SuperClass", null, null, null);
    superCtor.setImplementedInterfaces(ImmutableList.of(iface1.getInstanceType()));

    FunctionType subCtor = registry.createConstructorType("SubClass", null, null, null);
    subCtor.getPrototype().setImplicitPrototype(superCtor.getInstanceType());
    subCtor.setPrototype(subCtor.getPrototype());
    subCtor.setImplementedInterfaces(ImmutableList.of(iface2.getInstanceType()));

    assertTrue(subCtor.hasImplementedInterfaces());

    List<ObjectType> direct = Lists.newArrayList(subCtor.getImplementedInterfaces());
    assertEquals(2, direct.size());
    assertTrue(direct.contains(iface1.getInstanceType()));
    assertTrue(direct.contains(iface2.getInstanceType()));

    List<ObjectType> all = Lists.newArrayList(subCtor.getAllImplementedInterfaces());
    assertEquals(2, all.size());
    assertTrue(all.contains(iface1.getInstanceType()));
    assertTrue(all.contains(iface2.getInstanceType()));
  }

  @Test
  public void testExtendedInterfaces_interfaceHierarchy() {
    FunctionType baseIface = FunctionType.forInterface(registry, "BaseIface", createFunctionNode());
    FunctionType subIface = FunctionType.forInterface(registry, "SubIface", createFunctionNode());

    subIface.setExtendedInterfaces(ImmutableList.of(baseIface.getInstanceType()));
    assertEquals(1, subIface.getExtendedInterfacesCount());

    List<ObjectType> direct = Lists.newArrayList(subIface.getExtendedInterfaces());
    assertEquals(1, direct.size());
    assertTrue(direct.contains(baseIface.getInstanceType()));

    List<ObjectType> all = Lists.newArrayList(subIface.getAllExtendedInterfaces());
    assertEquals(1, all.size());
    assertTrue(all.contains(baseIface.getInstanceType()));

    // Exception when setExtendedInterfaces on non-interface
    FunctionType normalFn = registry.createFunctionType(numberType);
    try {
      normalFn.setExtendedInterfaces(ImmutableList.<ObjectType>of());
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {}
  }

  @Test
  public void testGetTopDefiningInterface_andGetTopMostDefiningType() {
    FunctionType ifaceBase = FunctionType.forInterface(registry, "IBase", createFunctionNode());
    ifaceBase.getPrototype().defineProperty("prop", stringType, false, null);
    ifaceBase.getInstanceType().defineProperty("prop", stringType, false, null);

    FunctionType ifaceSub = FunctionType.forInterface(registry, "ISub", createFunctionNode());
    ifaceSub.getInstanceType().defineProperty("prop", stringType, false, null);
    ifaceSub.setExtendedInterfaces(ImmutableList.of(ifaceBase.getInstanceType()));
    ifaceSub.getInstanceType().setCtorExtendedInterfaces(ImmutableList.of(ifaceBase.getInstanceType()));

    ObjectType topIface = FunctionType.getTopDefiningInterface(ifaceSub.getInstanceType(), "prop");
    assertSame(ifaceBase.getInstanceType(), topIface);

    // Test on constructor hierarchy
    FunctionType superCtor = registry.createConstructorType("Super", null, null, null);
    superCtor.getPrototype().defineProperty("foo", numberType, false, null);

    FunctionType subCtor = registry.createConstructorType("Sub", null, null, null);
    subCtor.getPrototype().setImplicitPrototype(superCtor.getInstanceType());
    subCtor.setPrototype(subCtor.getPrototype());
    subCtor.getPrototype().defineProperty("foo", numberType, false, null);

    ObjectType topType = subCtor.getTopMostDefiningType("foo");
    assertSame(superCtor.getInstanceType(), topType);

    // Test top defining type on interface
    ObjectType topIfaceType = ifaceSub.getTopMostDefiningType("prop");
    assertSame(ifaceBase.getInstanceType(), topIfaceType);
  }

  @Test
  public void testIsEquivalentTo_andHashCode() {
    FunctionType fn1 = registry.createFunctionType(numberType, numberType);
    FunctionType fn2 = registry.createFunctionType(numberType, numberType);
    FunctionType fn3 = registry.createFunctionType(stringType, numberType);

    assertTrue(fn1.isEquivalentTo(fn2));
    assertFalse(fn1.isEquivalentTo(fn3));
    assertFalse(fn1.isEquivalentTo(numberType));
    assertFalse(fn1.isEquivalentTo(null));
    assertEquals(fn1.hashCode(), fn2.hashCode());
    assertTrue(fn1.hasEqualCallType(fn2));

    FunctionType ctor1 = registry.createConstructorType("C1", null, null, null);
    FunctionType ctor2 = registry.createConstructorType("C2", null, null, null);
    assertTrue(ctor1.isEquivalentTo(ctor1));
    assertFalse(ctor1.isEquivalentTo(ctor2));
    assertFalse(ctor1.isEquivalentTo(fn1));

    FunctionType iface1 = FunctionType.forInterface(registry, "I1", createFunctionNode());
    FunctionType iface2 = FunctionType.forInterface(registry, "I1", createFunctionNode());
    FunctionType iface3 = FunctionType.forInterface(registry, "I3", createFunctionNode());
    assertTrue(iface1.isEquivalentTo(iface2));
    assertFalse(iface1.isEquivalentTo(iface3));
    assertFalse(iface1.isEquivalentTo(fn1));
    assertFalse(fn1.isEquivalentTo(iface1));
    assertEquals(iface1.hashCode(), iface2.hashCode());
  }

  @Test
  public void testToString_andToDebugHashCodeString() {
    assertEquals("Function", fnInstanceType.toString());
    assertNotNull(fnInstanceType.toDebugHashCodeString());

    Node lp = createParamsNode(numberType);
    Node varArg = Node.newString(Token.NAME, "rest");
    varArg.setJSType(registry.createUnionType(stringType, registry.getNativeType(JSTypeNative.VOID_TYPE)));
    varArg.setVarArgs(true);
    lp.addChildToBack(varArg);

    ArrowType arrow = new ArrowType(registry, lp, booleanType);
    FunctionType fn = new FunctionType(registry, "myFn", null, arrow, objectType, null, false, false);

    String str = fn.toString();
    assertTrue(str.startsWith("function (this:Object, number, ...[string]): boolean"));

    String debugStr = fn.toDebugHashCodeString();
    assertTrue(debugStr.startsWith("function (this:"));

    // Constructor toString
    FunctionType ctor = new FunctionType(registry, "Ctor", null, arrow, objectType, null, true, false);
    assertTrue(ctor.toString().startsWith("function (new:Object"));
  }

  @Test
  public void testIsSubtype_variousScenarios() {
    FunctionType fn1 = registry.createFunctionType(numberType, numberType);
    FunctionType fn2 = registry.createFunctionType(numberType, numberType);
    assertTrue(fn1.isSubtype(fn2));

    // Any function is subtype of interface function
    FunctionType iface = FunctionType.forInterface(registry, "I", createFunctionNode());
    assertTrue(fn1.isSubtype(iface));
    // Interface function cannot be assigned to anything except itself/super
    assertFalse(iface.isSubtype(fn1));

    // Subtype against native FUNCTION_PROTOTYPE
    ObjectType fnProto = registry.getNativeObjectType(JSTypeNative.FUNCTION_PROTOTYPE);
    assertTrue(fn1.isSubtype(fnProto));
    assertFalse(fn1.isSubtype(numberType));
  }

  @Test
  public void testGetLeastSupertype_andGreatestSubtype() {
    FunctionType fn1 = registry.createFunctionType(numberType, numberType);
    FunctionType fn2 = registry.createFunctionType(numberType, numberType);

    assertSame(fn1, fn1.getLeastSupertype(fn2));
    assertSame(fn1, fn1.getGreatestSubtype(fn2));

    // Between ordinary functions with same params and different return
    FunctionType fnNumRet = registry.createFunctionType(numberType, numberType);
    FunctionType fnStrRet = registry.createFunctionType(stringType, numberType);

    JSType sup = fnNumRet.getLeastSupertype(fnStrRet);
    assertTrue(sup.isFunctionType());
    assertTrue(sup.toMaybeFunctionType().getReturnType().isUnionType());

    JSType inf = fnNumRet.getGreatestSubtype(fnStrRet);
    assertTrue(inf.isFunctionType());
    assertTrue(inf.toMaybeFunctionType().getReturnType().isNoType());

    // Function instance comparison
    assertSame(fnInstanceType, fn1.getLeastSupertype(fnInstanceType));
    assertSame(fn1, fn1.getGreatestSubtype(fnInstanceType));
    assertSame(fnInstanceType, fnInstanceType.getLeastSupertype(fn1));
    assertSame(fn1, fnInstanceType.getGreatestSubtype(fn1));

    // Least supertype with non-function
    JSType supWithNum = fn1.getLeastSupertype(numberType);
    assertTrue(supWithNum.isUnionType());
  }

  @Test
  public void testTryMergeFunctionPiecewise_differentParamsReturnsNull() {
    FunctionType fn1 = registry.createFunctionType(numberType, numberType);
    FunctionType fn2 = registry.createFunctionType(numberType, stringType);

    // Unequal params should fallback to lattice top / bottom
    JSType sup = fn1.getLeastSupertype(fn2);
    assertEquals(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), sup);

    JSType inf = fn1.getGreatestSubtype(fn2);
    assertEquals(registry.getNativeType(JSTypeNative.LEAST_FUNCTION_TYPE), inf);
  }

  @Test
  public void testVisitorPattern() {
    FunctionType fn = registry.createFunctionType(numberType);
    Visitor<String> visitor = new Visitor<String>() {
      @Override public String caseNoType() { return "no"; }
      @Override public String caseEnumElementType(EnumElementType type) { return "enum"; }
      @Override public String caseAllType() { return "all"; }
      @Override public String caseBooleanType() { return "bool"; }
      @Override public String caseNoObjectType() { return "noObj"; }
      @Override public String caseFunctionType(FunctionType type) { return "function"; }
      @Override public String caseObjectType(ObjectType type) { return "object"; }
      @Override public String caseUnknownType() { return "unknown"; }
      @Override public String caseNullType() { return "null"; }
      @Override public String caseNamedType(NamedType type) { return "named"; }
      @Override public String caseNumberType() { return "number"; }
      @Override public String caseStringType() { return "string"; }
      @Override public String caseVoidType() { return "void"; }
      @Override public String caseUnionType(UnionType type) { return "union"; }
      @Override public String caseTemplateType(TemplateType templateType) { return "template"; }
    };
    assertEquals("function", fn.visit(visitor));
  }

  @Test
  public void testSetInstanceType_andTypeOfThisNoObjectType() {
    FunctionType ctor = registry.createConstructorType("Foo", null, null, null);
    ObjectType customInstance = new InstanceObjectType(registry, ctor, false);
    ctor.setInstanceType(customInstance);
    assertSame(customInstance, ctor.getInstanceType());

    FunctionType fnNoObjThis = new FunctionType(
        registry, "fn", null,
        new ArrowType(registry, new Node(Token.LP), numberType),
        registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE),
        null, false, false);
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), fnNoObjThis.getTypeOfThis());
  }

  @Test
  public void testClearCachedValuesAndHasCachedValues() {
    FunctionType ctor = registry.createConstructorType("Parent", null, null, null);
    FunctionType sub = registry.createConstructorType("Child", null, null, null);
    sub.getPrototype().setImplicitPrototype(ctor.getInstanceType());
    sub.setPrototype(sub.getPrototype());

    assertTrue(ctor.hasCachedValues());
    ctor.clearCachedValues();
    assertNotNull(ctor.getPrototype());
  }

  @Test
  public void testResolveInternal() {
    FunctionType iface = FunctionType.forInterface(registry, "Iface", createFunctionNode());
    FunctionType ctor = registry.createConstructorType("ClassA", null, null, null);
    ctor.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    FunctionType subCtor = registry.createConstructorType("ClassB", null, null, null);
    subCtor.getPrototype().setImplicitPrototype(ctor.getInstanceType());
    subCtor.setPrototype(subCtor.getPrototype());

    JSType resolved = ctor.resolve(errorReporter, null);
    assertNotNull(resolved);
    assertTrue(resolved.isFunctionType());
  }

  @Test
  public void testExceptionOnGetInstanceTypeWhenNotConstructorOrInterface() {
    FunctionType fn = registry.createFunctionType(numberType);
    try {
      fn.getInstanceType();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {}
  }

  @Test
  public void testExceptionOnGetSuperClassConstructorWhenOrdinaryFunction() {
    FunctionType fn = registry.createFunctionType(numberType);
    try {
      fn.getSuperClassConstructor();
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }
}
