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
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;
  private ObjectType objectPrototype;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    objectPrototype = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
  }

  @Test
  public void testConstructor_defaultImplicitPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertEquals("Foo", obj.getReferenceName());
    assertTrue(obj.hasReferenceName());
    assertSame(objectPrototype, obj.getImplicitPrototype());
    assertFalse(obj.isNativeObjectType());
  }

  @Test
  public void testConstructor_customImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent, false);
    assertSame(parent, child.getImplicitPrototype());
    assertFalse(child.isNativeObjectType());
    assertEquals("Child", child.getReferenceName());
  }

  @Test
  public void testConstructor_nativeTypeWithNullImplicitPrototype() {
    PrototypeObjectType nativeObj = new PrototypeObjectType(registry, "NativeFoo", null, true);
    assertNull(nativeObj.getImplicitPrototype());
    assertTrue(nativeObj.isNativeObjectType());
  }

  @Test
  public void testGetSlot_ownProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null);
    Node node = Node.newString("prop");
    obj.defineProperty("prop", numberType, false, node);

    Property slot = obj.getSlot("prop");
    assertNotNull(slot);
    assertEquals("prop", slot.getName());
    assertSame(numberType, slot.getType());
    assertSame(node, slot.getNode());
  }

  @Test
  public void testGetSlot_inheritedFromImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("parentProp", stringType, false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    Property slot = child.getSlot("parentProp");
    assertNotNull(slot);
    assertSame(stringType, slot.getType());
  }

  @Test
  public void testGetSlot_inheritedFromInterface() {
    FunctionType ifaceCtor = registry.createInterfaceType("MyInterface", null);
    Node ifacePropNode = Node.newString("ifaceProp");
    ifaceCtor.getPrototype().defineProperty("ifaceProp", numberType, false, ifacePropNode);

    FunctionType subIfaceCtor = registry.createInterfaceType("SubInterface", null);
    subIfaceCtor.setExtendedInterfaces(ImmutableList.of(ifaceCtor.getInstanceType()));

    ObjectType subIfaceProto = subIfaceCtor.getPrototype();
    Property slot = subIfaceProto.getSlot("ifaceProp");
    assertNotNull(slot);
    assertSame(numberType, slot.getType());
  }

  @Test
  public void testGetSlot_notFound() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null);
    assertNull(obj.getSlot("nonExistent"));
  }

  @Test
  public void testGetPropertiesCount_withAndWithoutImplicitPrototype() {
    PrototypeObjectType objWithoutProto = new PrototypeObjectType(registry, "ObjNoProto", null, true);
    assertEquals(0, objWithoutProto.getPropertiesCount());

    objWithoutProto.defineProperty("a", numberType, false, null);
    objWithoutProto.defineProperty("b", stringType, false, null);
    assertEquals(2, objWithoutProto.getPropertiesCount());

    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null, true);
    parent.defineProperty("p1", numberType, false, null);
    parent.defineProperty("shared", stringType, false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent, false);
    child.defineProperty("c1", booleanType, false, null);
    child.defineProperty("shared", numberType, false, null);

    // parent count = 2, child adds 1 non-shared (c1), so total = 3
    assertEquals(3, child.getPropertiesCount());
  }

  @Test
  public void testHasProperty_andHasOwnProperty() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null, true);
    parent.defineProperty("inherited", numberType, false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent, false);
    child.defineProperty("own", stringType, false, null);

    assertTrue(child.hasOwnProperty("own"));
    assertFalse(child.hasOwnProperty("inherited"));
    assertFalse(child.hasOwnProperty("missing"));

    assertTrue(child.hasProperty("own"));
    assertTrue(child.hasProperty("inherited"));
    assertFalse(child.hasProperty("missing"));
  }

  @Test
  public void testGetOwnPropertyNames() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null, true);
    obj.defineProperty("z", numberType, false, null);
    obj.defineProperty("a", stringType, false, null);

    Set<String> names = obj.getOwnPropertyNames();
    assertEquals(2, names.size());
    assertTrue(names.contains("a"));
    assertTrue(names.contains("z"));
  }

  @Test
  public void testIsPropertyTypeDeclared_andInferred() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null, true);
    obj.defineProperty("declared", numberType, false, null);
    obj.defineProperty("inferred", stringType, true, null);

    assertTrue(obj.isPropertyTypeDeclared("declared"));
    assertFalse(obj.isPropertyTypeInferred("declared"));

    assertFalse(obj.isPropertyTypeDeclared("inferred"));
    assertTrue(obj.isPropertyTypeInferred("inferred"));

    assertFalse(obj.isPropertyTypeDeclared("notFound"));
    assertFalse(obj.isPropertyTypeInferred("notFound"));
  }

  @Test
  public void testCollectPropertyNames() {
    PrototypeObjectType grandparent = new PrototypeObjectType(registry, "GP", null, true);
    grandparent.defineProperty("gpProp", numberType, false, null);

    PrototypeObjectType parent = new PrototypeObjectType(registry, "P", grandparent, false);
    parent.defineProperty("pProp", stringType, false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "C", parent, false);
    child.defineProperty("cProp", booleanType, false, null);

    Set<String> props = new HashSet<String>();
    child.collectPropertyNames(props);

    assertEquals(Sets.newHashSet("gpProp", "pProp", "cProp"), props);
  }

  @Test
  public void testGetPropertyType() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null, true);
    obj.defineProperty("x", numberType, false, null);

    assertSame(numberType, obj.getPropertyType("x"));
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), obj.getPropertyType("nonExistent"));
  }

  @Test
  public void testIsPropertyInExterns() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null, true);
    Node externNode = Node.newString("extProp");
    externNode.setStaticSourceFile(new com.google.javascript.rhino.jstype.SimpleSourceFile("externs.js", true));
    parent.defineProperty("extProp", numberType, false, externNode);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent, false);
    Node nonExternNode = Node.newString("localProp");
    nonExternNode.setStaticSourceFile(new com.google.javascript.rhino.jstype.SimpleSourceFile("code.js", false));
    child.defineProperty("localProp", stringType, false, nonExternNode);

    assertTrue(parent.isPropertyInExterns("extProp"));
    assertTrue(child.isPropertyInExterns("extProp"));
    assertFalse(child.isPropertyInExterns("localProp"));
    assertFalse(child.isPropertyInExterns("unknown"));
  }

  @Test
  public void testDefineProperty_preventsDuplicateDeclaredProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null, true);
    assertTrue(obj.defineProperty("x", numberType, false, null));
    assertFalse(obj.defineProperty("x", stringType, false, null));
    assertSame(numberType, obj.getPropertyType("x"));
  }

  @Test
  public void testDefineProperty_preservesOldJSDocInfoOnOverwrite() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null, true);
    obj.defineProperty("y", numberType, true, null);

    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordBlockDescription("test description");
    JSDocInfo info = docBuilder.build(null);
    obj.setPropertyJSDocInfo("y", info);

    assertTrue(obj.defineProperty("y", stringType, true, null));
    assertSame(info, obj.getOwnPropertyJSDocInfo("y"));
  }

  @Test
  public void testRemoveProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null, true);
    obj.defineProperty("a", numberType, false, null);

    assertTrue(obj.removeProperty("a"));
    assertFalse(obj.removeProperty("a"));
    assertFalse(obj.hasOwnProperty("a"));
  }

  @Test
  public void testGetPropertyNode() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null, true);
    Node pNode = Node.newString("parentProp");
    parent.defineProperty("parentProp", numberType, false, pNode);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent, false);
    Node cNode = Node.newString("childProp");
    child.defineProperty("childProp", stringType, false, cNode);

    assertSame(cNode, child.getPropertyNode("childProp"));
    assertSame(pNode, child.getPropertyNode("parentProp"));
    assertNull(child.getPropertyNode("unknown"));
  }

  @Test
  public void testSetPropertyJSDocInfo_whenPropertyDoesNotExist() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null, true);
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordBlockDescription("inferred prop doc");
    JSDocInfo info = docBuilder.build(null);

    obj.setPropertyJSDocInfo("newProp", info);
    assertTrue(obj.hasOwnProperty("newProp"));
    assertSame(info, obj.getOwnPropertyJSDocInfo("newProp"));

    // Null info should do nothing
    obj.setPropertyJSDocInfo("nullDocProp", null);
    assertFalse(obj.hasOwnProperty("nullDocProp"));
  }

  @Test
  public void testMatchesNumberAndStringContext() {
    PrototypeObjectType numberObj = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    assertTrue(numberObj.matchesNumberContext());
    assertTrue(numberObj.matchesStringContext());

    PrototypeObjectType dateObj = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    assertTrue(dateObj.matchesNumberContext());
    assertTrue(dateObj.matchesStringContext());

    PrototypeObjectType boolObj = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    assertTrue(boolObj.matchesNumberContext());
    assertTrue(boolObj.matchesStringContext());

    PrototypeObjectType strObj = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    assertTrue(strObj.matchesNumberContext());
    assertTrue(strObj.matchesStringContext());

    PrototypeObjectType regexpObj = registry.getNativeObjectType(JSTypeNative.REGEXP_TYPE);
    assertFalse(regexpObj.matchesNumberContext());
    assertTrue(regexpObj.matchesStringContext());
    assertTrue(regexpObj.canBeCalled());

    PrototypeObjectType customObj = new PrototypeObjectType(registry, "Custom", objectPrototype);
    assertFalse(customObj.matchesNumberContext());
    assertFalse(customObj.canBeCalled());

    // Override valueOf and toString
    customObj.defineProperty("valueOf", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(customObj.matchesNumberContext());

    customObj.defineProperty("toString", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(customObj.matchesStringContext());

    assertTrue(customObj.matchesObjectContext());
  }

  @Test
  public void testUnboxesTo() {
    PrototypeObjectType strObj = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    assertSame(stringType, strObj.unboxesTo());

    PrototypeObjectType boolObj = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    assertSame(booleanType, boolObj.unboxesTo());

    PrototypeObjectType numObj = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    assertSame(numberType, numObj.unboxesTo());

    PrototypeObjectType customObj = new PrototypeObjectType(registry, "Custom", null);
    assertNull(customObj.unboxesTo());
  }

  @Test
  public void testToStringHelper_withReferenceName() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "NamedType", null);
    assertEquals("NamedType", obj.toStringHelper(false));
    assertEquals("NamedType", obj.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_anonymousWithoutPrettyPrint() {
    PrototypeObjectType anon = new PrototypeObjectType(registry, null, null, true);
    assertEquals("{...}", anon.toStringHelper(false));
    assertEquals("?", anon.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_prettyPrint() {
    PrototypeObjectType anon = new PrototypeObjectType(registry, null, null, true);
    anon.defineProperty("p1", numberType, false, null);
    anon.defineProperty("p2", stringType, false, null);
    anon.setPrettyPrint(true);
    assertTrue(anon.isPrettyPrint());

    String str = anon.toStringHelper(false);
    assertEquals("{p1: number, p2: string}", str);

    // Over MAX_PRETTY_PRINTED_PROPERTIES (4 properties)
    anon.defineProperty("p3", booleanType, false, null);
    anon.defineProperty("p4", numberType, false, null);
    anon.defineProperty("p5", stringType, false, null);

    anon.setPrettyPrint(true);
    String truncated = anon.toStringHelper(false);
    assertEquals("{p1: number, p2: string, p3: boolean, p4: number, ...}", truncated);

    anon.setPrettyPrint(true);
    String forAnnotations = anon.toStringHelper(true);
    assertEquals("{p1: number, p2: string, p3: boolean, p4: number, p5: string}", forAnnotations);
  }

  @Test
  public void testOwnerFunction_andReferenceNameFromOwner() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null, true);
    assertNull(proto.getConstructor());
    assertNull(proto.getOwnerFunction());
    assertFalse(proto.hasReferenceName());
    assertNull(proto.getReferenceName());

    FunctionType fn = registry.createFunctionType(numberType);
    proto.setOwnerFunction(fn);
    assertSame(fn, proto.getOwnerFunction());
    assertEquals(fn.getReferenceName() + ".prototype", proto.getReferenceName());
    assertTrue(proto.hasReferenceName());

    // Setting same or null owner function allowed
    proto.setOwnerFunction(null);
    assertNull(proto.getOwnerFunction());

    // Setting twice when non-null throws IllegalStateException
    proto.setOwnerFunction(fn);
    try {
      proto.setOwnerFunction(fn);
      fail("Expected IllegalStateException on second owner assignment without resetting");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test
  public void testGetCtorImplementedAndExtendedInterfaces() {
    PrototypeObjectType regularObj = new PrototypeObjectType(registry, "Regular", null);
    assertFalse(regularObj.getCtorImplementedInterfaces().iterator().hasNext());
    assertFalse(regularObj.getCtorExtendedInterfaces().iterator().hasNext());

    FunctionType ifaceType = registry.createInterfaceType("IFoo", null);
    FunctionType ctor = registry.createConstructorType("MyClass", null, null, null, null);
    ctor.setImplementedInterfaces(ImmutableList.of(ifaceType.getInstanceType()));

    ObjectType proto = ctor.getPrototype();
    assertEquals(1, ImmutableList.copyOf(proto.getCtorImplementedInterfaces()).size());
  }

  @Test
  public void testIsSubtype_unionAndRecord() {
    PrototypeObjectType objA = new PrototypeObjectType(registry, "A", null);
    PrototypeObjectType objB = new PrototypeObjectType(registry, "B", null);

    JSType union = registry.createUnionType(objA, objB);
    assertFalse(objA.isSubtype(union)); // Subtype check with UnionType on right handled by decomposition or returns false

    RecordTypeBuilder rtb = new RecordTypeBuilder(registry);
    rtb.addProperty("prop", numberType, null);
    RecordType recordType = rtb.build();

    assertFalse(objA.isSubtype(recordType));

    objA.defineProperty("prop", numberType, false, null);
    assertTrue(objA.isSubtype(recordType));
  }

  @Test
  public void testIsSubtype_interfaceAndImplicitPrototypeChain() {
    FunctionType iface = registry.createInterfaceType("ITestInterface", null);
    FunctionType ctor = registry.createConstructorType("Impl", null, null, null, null);
    ctor.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    ObjectType implInstance = ctor.getInstanceType();
    assertTrue(implInstance.isSubtype(iface.getInstanceType()));

    PrototypeObjectType parent = new PrototypeObjectType(registry, "ParentType", null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "ChildType", parent);

    assertTrue(child.isSubtype(parent));
    assertFalse(parent.isSubtype(child));
  }

  @Test
  public void testIsSubtype_unknownPrototypeChain() {
    PrototypeObjectType unknownParent = new PrototypeObjectType(registry, "UnknownParent", registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE));
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", unknownParent);

    PrototypeObjectType target = new PrototypeObjectType(registry, "Target", null);
    assertTrue(child.isSubtype(target));
  }

  @Test
  public void testResolveInternal() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("prop", numberType, false, null);

    JSType resolved = child.resolve(errorReporter, null);
    assertSame(child, resolved);
    assertTrue(child.isResolved());
  }

  @Test
  public void testMatchConstraint() {
    PrototypeObjectType namedObj = new PrototypeObjectType(registry, "Named", null);
    RecordTypeBuilder rtb = new RecordTypeBuilder(registry);
    rtb.addProperty("foo", numberType, null);
    RecordType record = rtb.build();

    namedObj.matchConstraint(record);
    assertFalse(namedObj.hasOwnProperty("foo"));

    PrototypeObjectType anonObj = new PrototypeObjectType(registry, null, null, true);
    anonObj.matchConstraint(record);
    assertTrue(anonObj.hasOwnProperty("foo"));
    assertTrue(anonObj.isPropertyTypeInferred("foo"));

    // Matching non-record constraint does nothing
    anonObj.matchConstraint(numberType);
  }

  @Test
  public void testMatchRecordTypeConstraint_existingDeclaredPropertyNotOverwritten() {
    PrototypeObjectType anonObj = new PrototypeObjectType(registry, null, null, true);
    anonObj.defineProperty("bar", stringType, false, null);

    RecordTypeBuilder rtb = new RecordTypeBuilder(registry);
    rtb.addProperty("bar", numberType, null);
    RecordType record = rtb.build();

    anonObj.matchRecordTypeConstraint(record);
    assertSame(stringType, anonObj.getPropertyType("bar"));
  }

  @Test
  public void testSetImplicitPrototype_checksCachedValues() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "A", null);
    PrototypeObjectType newProto = new PrototypeObjectType(registry, "B", null);
    obj.setImplicitPrototype(newProto);
    assertSame(newProto, obj.getImplicitPrototype());
  }
}
