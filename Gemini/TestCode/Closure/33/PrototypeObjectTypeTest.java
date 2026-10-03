package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.testing.MapBasedScope;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;
  private ObjectType objectPrototype;
  private ObjectType numberPrototype;
  private ObjectType stringPrototype;
  private ObjectType booleanPrototype;
  private ObjectType datePrototype;
  private ObjectType regexpPrototype;
  private ObjectType arrayPrototype;

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    objectPrototype = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
    numberPrototype = registry.getNativeObjectType(JSTypeNative.NUMBER_PROTOTYPE);
    stringPrototype = registry.getNativeObjectType(JSTypeNative.STRING_PROTOTYPE);
    booleanPrototype = registry.getNativeObjectType(JSTypeNative.BOOLEAN_PROTOTYPE);
    datePrototype = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    regexpPrototype = registry.getNativeObjectType(JSTypeNative.REGEXP_TYPE);
    arrayPrototype = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
  }

  @Test
  public void testConstructor_defaultImplicitPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "MyClass", null);
    assertEquals("MyClass", obj.getReferenceName());
    assertTrue(obj.hasReferenceName());
    assertFalse(obj.isNativeObjectType());
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), obj.getImplicitPrototype());
  }

  @Test
  public void testConstructor_nativeTypeExplicitPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, objectPrototype, true);
    assertNull(obj.getReferenceName());
    assertFalse(obj.hasReferenceName());
    assertTrue(obj.isNativeObjectType());
    assertEquals(objectPrototype, obj.getImplicitPrototype());
  }

  @Test
  public void testGetSlot_localAndImplicitChain() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", objectPrototype);
    parent.defineProperty("parentProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("childProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);

    assertNotNull(child.getSlot("childProp"));
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), child.getSlot("childProp").getType());

    assertNotNull(child.getSlot("parentProp"));
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), child.getSlot("parentProp").getType());

    assertNull(child.getSlot("nonExistent"));
  }

  @Test
  public void testGetSlot_fromExtendedInterfaces() {
    FunctionType ifaceParent = registry.createInterfaceType("IInterfaceParent", null);
    ifaceParent.getPrototype().defineProperty("ifaceProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    FunctionType ifaceChild = registry.createInterfaceType("IInterfaceChild", null);
    ifaceChild.setExtendedInterfaces(Collections.singletonList(ifaceParent.getInstanceType()));

    ObjectType childInstance = ifaceChild.getPrototype();
    assertNotNull(childInstance.getSlot("ifaceProp"));
  }

  @Test
  public void testGetPropertiesCount_withAndWithoutShadowing() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("p1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    parent.defineProperty("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("p2", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null); // shadows p2
    child.defineProperty("p3", registry.getNativeType(JSTypeNative.VOID_TYPE), false, null);

    assertEquals(2, parent.getPropertiesCount());
    assertEquals(3, child.getPropertiesCount());

    PrototypeObjectType orphan = new PrototypeObjectType(registry, "Orphan", null, true);
    orphan.setImplicitPrototype(null);
    orphan.defineProperty("o1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertEquals(1, orphan.getPropertiesCount());
  }

  @Test
  public void testHasProperty_andHasOwnProperty() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", objectPrototype);
    parent.defineProperty("parentProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("childProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

    assertTrue(child.hasProperty("childProp"));
    assertTrue(child.hasProperty("parentProp"));
    assertFalse(child.hasProperty("none"));

    assertTrue(child.hasOwnProperty("childProp"));
    assertFalse(child.hasOwnProperty("parentProp"));
    assertFalse(child.hasOwnProperty("none"));

    Set<String> ownNames = child.getOwnPropertyNames();
    assertEquals(1, ownNames.size());
    assertTrue(ownNames.contains("childProp"));
  }

  @Test
  public void testIsPropertyTypeDeclaredAndInferred() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", objectPrototype);
    obj.defineProperty("inferredProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    obj.defineProperty("declaredProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    assertTrue(obj.isPropertyTypeInferred("inferredProp"));
    assertFalse(obj.isPropertyTypeDeclared("inferredProp"));

    assertFalse(obj.isPropertyTypeInferred("declaredProp"));
    assertTrue(obj.isPropertyTypeDeclared("declaredProp"));

    assertFalse(obj.isPropertyTypeInferred("nonExistent"));
    assertFalse(obj.isPropertyTypeDeclared("nonExistent"));
  }

  @Test
  public void testGetPropertyType() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", objectPrototype);
    obj.defineProperty("str", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), obj.getPropertyType("str"));
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), obj.getPropertyType("unknown"));
  }

  @Test
  public void testCollectPropertyNames() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("p1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("c1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

    Set<String> props = new HashSet<String>();
    child.collectPropertyNames(props);

    assertTrue(props.contains("p1"));
    assertTrue(props.contains("c1"));
  }

  @Test
  public void testIsPropertyInExterns() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    Node externNode = new Node(1);
    externNode.putIntProp(Node.SOURCENAME_PROP, 1);
    parent.defineProperty("externProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, externNode);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("normalProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, new Node(1));

    assertTrue(parent.isPropertyInExterns("externProp"));
    assertTrue(child.isPropertyInExterns("externProp"));
    assertFalse(child.isPropertyInExterns("normalProp"));
    assertFalse(child.isPropertyInExterns("noProp"));
  }

  @Test
  public void testDefineProperty_andRemoveProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null);
    Node node = new Node(1);
    assertTrue(obj.defineProperty("prop", registry.getNativeType(JSTypeNative.STRING_TYPE), false, node));
    assertEquals(node, obj.getPropertyNode("prop"));

    // Redefining a declared property fails
    assertFalse(obj.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null));

    // Remove property
    assertTrue(obj.removeProperty("prop"));
    assertFalse(obj.removeProperty("prop"));
    assertNull(obj.getPropertyNode("prop"));
  }

  @Test
  public void testPropertyNode_fromImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    Node node = new Node(1);
    parent.defineProperty("pProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, node);

    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    assertEquals(node, child.getPropertyNode("pProp"));
    assertNull(child.getPropertyNode("nonExistent"));
  }

  @Test
  public void testJSDocInfoGetAndSet() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", null);
    JSDocInfo info = new JSDocInfo();
    obj.defineProperty("prop1", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

    obj.setPropertyJSDocInfo("prop1", info);
    assertEquals(info, obj.getOwnPropertyJSDocInfo("prop1"));

    // Overwrite property retaining jsdoc
    obj.defineProperty("prop1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    assertEquals(info, obj.getOwnPropertyJSDocInfo("prop1"));

    // Set JSDoc info for undeclared property should define inferred property
    JSDocInfo info2 = new JSDocInfo();
    obj.setPropertyJSDocInfo("prop2", info2);
    assertTrue(obj.hasProperty("prop2"));
    assertEquals(info2, obj.getOwnPropertyJSDocInfo("prop2"));

    obj.setPropertyJSDocInfo("prop3", null);
    assertNull(obj.getOwnPropertyJSDocInfo("prop3"));
    assertNull(obj.getOwnPropertyJSDocInfo("unknown"));
  }

  @Test
  public void testMatchesContexts() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", objectPrototype);
    assertTrue(obj.matchesObjectContext());
    assertFalse(obj.canBeCalled());

    // Matches Number/String contexts with default vs overridden native properties
    assertFalse(obj.matchesNumberContext());
    assertFalse(obj.matchesStringContext());

    obj.defineProperty("valueOf", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(obj.matchesNumberContext());

    obj.defineProperty("toString", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(obj.matchesStringContext());
  }

  @Test
  public void testMatchesContexts_nativeTypes() {
    ObjectType numberObj = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    ObjectType stringObj = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    ObjectType boolObj = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    ObjectType dateObj = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    ObjectType regObj = registry.getNativeObjectType(JSTypeNative.REGEXP_TYPE);
    ObjectType arrObj = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);

    assertTrue(numberObj.matchesNumberContext());
    assertTrue(numberObj.matchesStringContext());

    assertTrue(stringObj.matchesNumberContext());
    assertTrue(stringObj.matchesStringContext());

    assertTrue(boolObj.matchesNumberContext());
    assertTrue(boolObj.matchesStringContext());

    assertTrue(dateObj.matchesNumberContext());
    assertTrue(dateObj.matchesStringContext());

    assertTrue(regObj.matchesStringContext());
    assertTrue(regObj.canBeCalled());

    assertTrue(arrObj.matchesStringContext());
  }

  @Test
  public void testUnboxesTo() {
    ObjectType numberObj = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberObj.unboxesTo());

    ObjectType stringObj = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringObj.unboxesTo());

    ObjectType boolObj = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), boolObj.unboxesTo());

    PrototypeObjectType custom = new PrototypeObjectType(registry, "Custom", objectPrototype);
    assertNull(custom.unboxesTo());
  }

  @Test
  public void testToStringHelper() {
    PrototypeObjectType named = new PrototypeObjectType(registry, "NamedClass", null);
    assertEquals("NamedClass", named.toStringHelper(false));
    assertEquals("NamedClass", named.toStringHelper(true));

    PrototypeObjectType anon = new PrototypeObjectType(registry, null, null, true);
    assertEquals("{...}", anon.toStringHelper(false));
    assertEquals("?", anon.toStringHelper(true));

    anon.setPrettyPrint(true);
    assertTrue(anon.isPrettyPrint());
    anon.defineProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    anon.defineProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertEquals("{a: string, b: number}", anon.toStringHelper(false));

    anon.defineProperty("c", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
    anon.defineProperty("d", registry.getNativeType(JSTypeNative.VOID_TYPE), false, null);
    anon.defineProperty("e", registry.getNativeType(JSTypeNative.NULL_TYPE), false, null);

    // Limit exceeded in pretty print without annotations
    String pretty = anon.toStringHelper(false);
    assertTrue(pretty.contains("..."));

    // With annotations
    String prettyAnnotated = anon.toStringHelper(true);
    assertFalse(prettyAnnotated.contains("..."));
  }

  @Test
  public void testOwnerFunctionAndReferenceName() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, objectPrototype);
    assertNull(proto.getOwnerFunction());
    assertNull(proto.getReferenceName());
    assertFalse(proto.hasReferenceName());

    FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    proto.setOwnerFunction(fn);
    assertEquals(fn, proto.getOwnerFunction());
    assertNotNull(proto.getReferenceName());
    assertTrue(proto.hasReferenceName());

    proto.setOwnerFunction(null);
    assertNull(proto.getOwnerFunction());
  }

  @Test(expected = IllegalStateException.class)
  public void testSetOwnerFunction_throwsWhenAlreadySet() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, objectPrototype);
    FunctionType fn1 = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType fn2 = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    proto.setOwnerFunction(fn1);
    proto.setOwnerFunction(fn2); // Throws exception
  }

  @Test
  public void testIsSubtype_unionAndRecord() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "MyObj", objectPrototype);
    JSType unionType = registry.createUnionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    assertFalse(obj.isSubtype(unionType));

    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    JSType recordType = builder.build();

    assertFalse(obj.isSubtype(recordType));
    obj.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(obj.isSubtype(recordType));
  }

  @Test
  public void testIsSubtype_interfaceAndConstructor() {
    FunctionType ifaceType = registry.createInterfaceType("MyInterface", null);
    FunctionType ctor = registry.createConstructorType("MyClass", null, null, null);
    ctor.getPrototype().defineProperty("ctorProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    assertFalse(ctor.getPrototype().isSubtype(ifaceType.getInstanceType()));
  }

  @Test
  public void testResolveInternal() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", objectPrototype);
    proto.defineProperty("prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), false, null);

    MapBasedScope scope = new MapBasedScope(new HashMap<String, StaticSlot<JSType>>());
    JSType resolved = proto.resolveInternal(errorReporter, scope);

    assertEquals(proto, resolved);
    assertTrue(proto.isResolved());
  }

  @Test
  public void testMatchConstraint() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null, true);

    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("p1", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    builder.addProperty("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    ObjectType recordType = (ObjectType) builder.build();

    obj.defineProperty("p1", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
    obj.matchConstraint(recordType);

    assertTrue(obj.hasProperty("p1"));
    assertTrue(obj.hasProperty("p2"));
    assertTrue(obj.isPropertyTypeInferred("p2"));
  }

  @Test
  public void testGetConstructor_returnsNull() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", objectPrototype);
    assertNull(obj.getConstructor());
  }

  @Test
  public void testGetCtorImplementedAndExtendedInterfaces_nonFunctionPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Obj", objectPrototype);
    assertFalse(obj.getCtorImplementedInterfaces().iterator().hasNext());
    assertFalse(obj.getCtorExtendedInterfaces().iterator().hasNext());
  }
}
