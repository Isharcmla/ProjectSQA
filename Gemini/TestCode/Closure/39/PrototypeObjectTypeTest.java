package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;
  private SimpleErrorReporter errorReporter;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
  }

  @Test
  public void testConstructor_withNullImplicitPrototype_defaultsToObjectPrototype() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "CustomClass", null);
    assertEquals("CustomClass", type.getClassName());
    assertEquals("CustomClass", type.getReferenceName());
    assertTrue(type.hasReferenceName());
    assertFalse(type.isNativeObjectType());
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), type.getImplicitPrototype());
  }

  @Test
  public void testConstructor_nativeTypeTrue_preservesImplicitPrototype() {
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    PrototypeObjectType type = new PrototypeObjectType(registry, "NativeClass", objectType, true);
    assertTrue(type.isNativeObjectType());
    assertSame(objectType, type.getImplicitPrototype());

    PrototypeObjectType nullProtoNative = new PrototypeObjectType(registry, "NullProtoNative", null, true);
    assertTrue(nullProtoNative.isNativeObjectType());
    assertNull(nullProtoNative.getImplicitPrototype());
  }

  @Test
  public void testDefineProperty_andGetSlot() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "TestType", null);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node node = Node.newString("prop");

    boolean defined = proto.defineProperty("prop", numberType, false, node);
    assertTrue(defined);

    Property slot = proto.getSlot("prop");
    assertNotNull(slot);
    assertEquals("prop", slot.getName());
    assertSame(numberType, slot.getType());
    assertFalse(slot.isTypeInferred());
    assertSame(node, slot.getNode());

    // Defining declared property again when already declared returns false
    boolean reDefined = proto.defineProperty("prop", numberType, false, node);
    assertFalse(reDefined);
  }

  @Test
  public void testDefineProperty_preserveOldJSDocInfo() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "TestType", null);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordDescription("some doc");
    JSDocInfo info = builder.build(null);

    proto.defineProperty("prop", numberType, true, null);
    proto.setPropertyJSDocInfo("prop", info);

    proto.defineProperty("prop", numberType, true, null);
    assertSame(info, proto.getOwnPropertyJSDocInfo("prop"));
  }

  @Test
  public void testGetSlot_fromImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    parent.defineProperty("parentProp", stringType, false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    Property slot = child.getSlot("parentProp");
    assertNotNull(slot);
    assertSame(stringType, slot.getType());
    assertNull(child.getSlot("nonExistent"));
  }

  @Test
  public void testGetSlot_fromExtendedInterfaces() {
    FunctionType ifaceParent = registry.createInterfaceType("IfaceParent", null);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ifaceParent.getPrototype().defineProperty("ifaceProp", numType, false, null);

    FunctionType ifaceChild = registry.createInterfaceType("IfaceChild", null);
    ifaceChild.setExtendedInterfaces(ImmutableList.of(ifaceParent.getInstanceType()));

    PrototypeObjectType childProto = (PrototypeObjectType) ifaceChild.getPrototype();
    Property slot = childProto.getSlot("ifaceProp");
    assertNotNull(slot);
    assertSame(numType, slot.getType());
  }

  @Test
  public void testGetPropertiesCount() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null, true);
    parent.defineProperty("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    parent.defineProperty("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    assertEquals(2, parent.getPropertiesCount());

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("p2", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
    child.defineProperty("p3", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), true, null);

    // Parent has p1, p2 (2). Child has local p3 (1) + overridden p2 (0 increase). Total should be 3 + ObjectType defaults if any.
    assertEquals(parent.getPropertiesCount() + 1, child.getPropertiesCount());

    PrototypeObjectType noProto = new PrototypeObjectType(registry, "NoProto", null, true);
    noProto.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    assertEquals(1, noProto.getPropertiesCount());
  }

  @Test
  public void testHasProperty_andHasOwnProperty() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("parentProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("childProp", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

    assertTrue(child.hasOwnProperty("childProp"));
    assertFalse(child.hasOwnProperty("parentProp"));
    assertFalse(child.hasOwnProperty("nonExistent"));

    assertTrue(child.hasProperty("childProp"));
    assertTrue(child.hasProperty("parentProp"));
    assertFalse(child.hasProperty("nonExistent"));
  }

  @Test
  public void testGetOwnPropertyNames_andCollectPropertyNames() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null, true);
    parent.defineProperty("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("p2", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

    Set<String> ownProps = child.getOwnPropertyNames();
    assertEquals(1, ownProps.size());
    assertTrue(ownProps.contains("p2"));

    Set<String> collected = Sets.newHashSet();
    child.collectPropertyNames(collected);
    assertTrue(collected.contains("p1"));
    assertTrue(collected.contains("p2"));
  }

  @Test
  public void testIsPropertyTypeDeclared_andInferred() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "TestType", null);
    proto.defineProperty("declared", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    proto.defineProperty("inferred", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

    assertTrue(proto.isPropertyTypeDeclared("declared"));
    assertFalse(proto.isPropertyTypeInferred("declared"));

    assertFalse(proto.isPropertyTypeDeclared("inferred"));
    assertTrue(proto.isPropertyTypeInferred("inferred"));

    assertFalse(proto.isPropertyTypeDeclared("missing"));
    assertFalse(proto.isPropertyTypeInferred("missing"));
  }

  @Test
  public void testGetPropertyType_notFoundDefaultsToUnknown() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "TestType", null);
    proto.defineProperty("num", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), proto.getPropertyType("num"));
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), proto.getPropertyType("unknown"));
  }

  @Test
  public void testIsPropertyInExterns() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    Node externNode = Node.newString("p1");
    externNode.putIntProp(Node.SOURCENAME_PROP, 1);
    parent.defineProperty("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, externNode);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("p2", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    assertFalse(child.isPropertyInExterns("p2"));
    assertFalse(child.isPropertyInExterns("missing"));
  }

  @Test
  public void testRemoveProperty() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "TestType", null);
    proto.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

    assertTrue(proto.removeProperty("prop"));
    assertFalse(proto.removeProperty("prop"));
    assertFalse(proto.removeProperty("nonExistent"));
  }

  @Test
  public void testGetPropertyNode() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    Node parentNode = Node.newString("parentProp");
    parent.defineProperty("parentProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, parentNode);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    Node childNode = Node.newString("childProp");
    child.defineProperty("childProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, childNode);

    assertSame(childNode, child.getPropertyNode("childProp"));
    assertSame(parentNode, child.getPropertyNode("parentProp"));
    assertNull(child.getPropertyNode("missing"));
  }

  @Test
  public void testSetPropertyJSDocInfo_createsInferredPropertyWhenMissing() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "TestType", null);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordDescription("desc");
    JSDocInfo info = builder.build(null);

    proto.setPropertyJSDocInfo("autoProp", info);
    assertTrue(proto.hasOwnProperty("autoProp"));
    assertSame(info, proto.getOwnPropertyJSDocInfo("autoProp"));

    proto.setPropertyJSDocInfo("autoProp", null);
    assertSame(info, proto.getOwnPropertyJSDocInfo("autoProp"));
    assertNull(proto.getOwnPropertyJSDocInfo("missing"));
  }

  @Test
  public void testMatchesContexts_andUnboxesTo() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "TestType", null);
    assertTrue(proto.matchesObjectContext());
    assertFalse(proto.canBeCalled());

    ObjectType numberObj = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    assertTrue(numberObj.matchesNumberContext());
    assertTrue(numberObj.matchesStringContext());
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberObj.unboxesTo());

    ObjectType stringObj = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    assertTrue(stringObj.matchesNumberContext());
    assertTrue(stringObj.matchesStringContext());
    assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE), stringObj.unboxesTo());

    ObjectType boolObj = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    assertTrue(boolObj.matchesNumberContext());
    assertTrue(boolObj.matchesStringContext());
    assertSame(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), boolObj.unboxesTo());

    ObjectType dateObj = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    assertTrue(dateObj.matchesNumberContext());
    assertTrue(dateObj.matchesStringContext());

    ObjectType regexpObj = registry.getNativeObjectType(JSTypeNative.REGEXP_TYPE);
    assertTrue(regexpObj.canBeCalled());
    assertTrue(regexpObj.matchesStringContext());

    ObjectType arrayObj = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    assertTrue(arrayObj.matchesStringContext());

    assertNull(proto.unboxesTo());
  }

  @Test
  public void testMatchesContexts_withOverriddenNativeProperty() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    assertFalse(proto.matchesNumberContext());

    proto.defineProperty("valueOf", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(proto.matchesNumberContext());

    proto.defineProperty("toString", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(proto.matchesStringContext());

    FunctionType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    PrototypeObjectType fnProto = new PrototypeObjectType(registry, null, null);
    fnProto.setOwnerFunction(fnType);
    fnProto.defineProperty("toString", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(fnProto.matchesStringContext());
  }

  @Test
  public void testToStringHelper_withReferenceName() {
    PrototypeObjectType named = new PrototypeObjectType(registry, "MyClass", null);
    assertEquals("MyClass", named.toStringHelper(false));
    assertEquals("MyClass", named.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_withoutReferenceName_prettyPrintFalse() {
    PrototypeObjectType anon = new PrototypeObjectType(registry, null, null);
    anon.setPrettyPrint(false);
    assertFalse(anon.isPrettyPrint());
    assertEquals("{...}", anon.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_prettyPrintTrue_underLimit() {
    PrototypeObjectType anon = new PrototypeObjectType(registry, null, null, true);
    anon.setPrettyPrint(true);
    anon.defineProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    anon.defineProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

    String result = anon.toStringHelper(false);
    assertEquals("{a: string, b: number}", result);
    assertTrue(anon.isPrettyPrint());
  }

  @Test
  public void testToStringHelper_prettyPrintTrue_exceedsLimit() {
    PrototypeObjectType anon = new PrototypeObjectType(registry, null, null, true);
    anon.setPrettyPrint(true);
    anon.defineProperty("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    anon.defineProperty("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    anon.defineProperty("p3", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    anon.defineProperty("p4", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    anon.defineProperty("p5", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);

    String result = anon.toStringHelper(false);
    assertEquals("{p1: number, p2: number, p3: number, p4: number, ...}", result);
  }

  @Test
  public void testOwnerFunction_andReferenceName() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    assertNull(proto.getReferenceName());
    assertFalse(proto.hasReferenceName());
    assertNull(proto.getOwnerFunction());

    FunctionType fn = registry.createConstructorType("Foo", null, null, null);
    proto.setOwnerFunction(fn);
    assertSame(fn, proto.getOwnerFunction());
    assertEquals("Foo.prototype", proto.getReferenceName());
    assertTrue(proto.hasReferenceName());

    proto.setOwnerFunction(null);
    assertNull(proto.getOwnerFunction());

    proto.setOwnerFunction(fn);
    try {
      proto.setOwnerFunction(fn);
      fail("Expected IllegalStateException when resetting owner function without nulling");
    } catch (IllegalStateException expected) {
    }
  }

  @Test
  public void testInterfaces_emptyWhenNotFunctionPrototype() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Simple", null);
    assertFalse(proto.getCtorImplementedInterfaces().iterator().hasNext());
    assertFalse(proto.getCtorExtendedInterfaces().iterator().hasNext());
  }

  @Test
  public void testGetConstructor_alwaysNull() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Foo", null);
    assertNull(proto.getConstructor());
  }

  @Test
  public void testSetImplicitPrototype_andHasCachedValues() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(proto.hasCachedValues());

    ObjectType newProto = new PrototypeObjectType(registry, "Bar", null);
    proto.setImplicitPrototype(newProto);
    assertSame(newProto, proto.getImplicitPrototype());
  }

  @Test
  public void testIsSubtype_unionAndRecord() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Foo", null);
    proto.defineProperty("prop", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    UnionType unionType = new UnionType(
        registry,
        ImmutableList.of(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.BOOLEAN_TYPE)));
    assertFalse(proto.isSubtype(unionType));

    RecordTypeBuilder rtb = new RecordTypeBuilder(registry);
    rtb.addProperty("prop", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    RecordType matchingRecord = rtb.build();
    assertTrue(proto.isSubtype(matchingRecord));

    RecordTypeBuilder rtb2 = new RecordTypeBuilder(registry);
    rtb2.addProperty("missing", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType nonMatchingRecord = rtb2.build();
    assertFalse(proto.isSubtype(nonMatchingRecord));
  }

  @Test
  public void testIsSubtype_implementedAndExtendedInterfaces() {
    FunctionType iface = registry.createInterfaceType("MyInterface", null);
    FunctionType ctor = registry.createConstructorType("MyCtor", null, null, null);
    ctor.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    PrototypeObjectType ctorProto = (PrototypeObjectType) ctor.getPrototype();
    assertTrue(ctorProto.isSubtype(iface.getInstanceType()));

    FunctionType extIface = registry.createInterfaceType("ExtInterface", null);
    extIface.setExtendedInterfaces(ImmutableList.of(iface.getInstanceType()));
    PrototypeObjectType extIfaceProto = (PrototypeObjectType) extIface.getPrototype();
    assertTrue(extIfaceProto.isSubtype(iface.getInstanceType()));
  }

  @Test
  public void testIsSubtype_implicitPrototypeChain() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);

    assertTrue(child.isSubtype(parent));
    assertFalse(parent.isSubtype(child));

    PrototypeObjectType unknownProto = new PrototypeObjectType(
        registry, "UnknownHolder", registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE));
    PrototypeObjectType childOfUnknown = new PrototypeObjectType(registry, "ChildOfUnknown", unknownProto);
    assertTrue(childOfUnknown.isSubtype(parent));
  }

  @Test
  public void testResolveInternal() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Resolvable", null);
    proto.defineProperty("p", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    JSType resolved = proto.resolveInternal(errorReporter, null);
    assertSame(proto, resolved);
    assertTrue(proto.isResolved());
  }
}
