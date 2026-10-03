package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class ObjectTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;

  @Before
  public void setUp() {
    ErrorReporter reporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(reporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
  }

  private static class StubObjectType extends ObjectType {
    private ObjectType implicitPrototype;
    private final Map<String, Property> properties = new HashMap<String, Property>();
    private String refName;
    private boolean nativeType = false;
    private Iterable<ObjectType> extendedInterfaces = ImmutableSet.of();
    private FunctionType ownerFunction;

    StubObjectType(JSTypeRegistry registry) {
      super(registry);
    }

    void setImplicitPrototype(ObjectType proto) {
      this.implicitPrototype = proto;
    }

    void setRefName(String refName) {
      this.refName = refName;
    }

    void setNativeType(boolean nativeType) {
      this.nativeType = nativeType;
    }

    void setExtendedInterfaces(Iterable<ObjectType> interfaces) {
      this.extendedInterfaces = interfaces;
    }

    @Override
    public Property getSlot(String name) {
      return properties.get(name);
    }

    @Override
    public String getReferenceName() {
      return refName;
    }

    @Override
    public FunctionType getConstructor() {
      return null;
    }

    @Override
    public ObjectType getImplicitPrototype() {
      return implicitPrototype;
    }

    @Override
    boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) {
      Property prop = new Property(propertyName, type, inferred, propertyNode);
      properties.put(propertyName, prop);
      return true;
    }

    @Override
    public JSType getPropertyType(String propertyName) {
      Property p = properties.get(propertyName);
      return p == null ? registry.getNativeType(JSTypeNative.UNKNOWN_TYPE) : p.getType();
    }

    @Override
    public boolean hasProperty(String propertyName) {
      return properties.containsKey(propertyName);
    }

    @Override
    public boolean isPropertyTypeInferred(String propertyName) {
      Property p = properties.get(propertyName);
      return p != null && p.isTypeInferred();
    }

    @Override
    public boolean isPropertyTypeDeclared(String propertyName) {
      Property p = properties.get(propertyName);
      return p != null && !p.isTypeInferred();
    }

    @Override
    public int getPropertiesCount() {
      return properties.size();
    }

    @Override
    void collectPropertyNames(Set<String> props) {
      props.addAll(properties.keySet());
      if (implicitPrototype != null) {
        implicitPrototype.collectPropertyNames(props);
      }
    }

    @Override
    public boolean isNativeObjectType() {
      return nativeType;
    }

    @Override
    public Iterable<ObjectType> getCtorExtendedInterfaces() {
      return extendedInterfaces;
    }

    @Override
    public FunctionType getOwnerFunction() {
      return ownerFunction;
    }

    @Override
    void setOwnerFunction(FunctionType type) {
      this.ownerFunction = type;
    }
  }

  @Test
  public void testDefaultAndTrivialMethods() {
    StubObjectType obj = new StubObjectType(registry);

    assertNull(obj.getRootNode());
    assertNull(obj.getParentScope());
    assertNull(obj.getTypeOfThis());
    assertNull(obj.getParameterType());
    assertNull(obj.getIndexType());
    assertFalse(obj.hasReferenceName());
    assertFalse(obj.removeProperty("foo"));
    assertNull(obj.getPropertyNode("foo"));
    assertNull(obj.getOwnPropertyJSDocInfo("foo"));
    obj.setPropertyJSDocInfo("foo", new JSDocInfo()); // no-op
    assertFalse(obj.isPropertyInExterns("foo"));
    assertTrue(obj.getOwnPropertyNames().isEmpty());
    assertTrue(obj.isObject());
    assertFalse(obj.isNativeObjectType());
    assertEquals(BooleanLiteralSet.TRUE, obj.getPossibleToBooleanOutcomes());
    assertTrue(obj.getCtorImplementedInterfaces().iterator().hasNext() == false);
    assertTrue(obj.getCtorExtendedInterfaces().iterator().hasNext() == false);

    StubObjectType parent = new StubObjectType(registry);
    obj.setImplicitPrototype(parent);
    assertSame(parent, obj.getParentScope());
  }

  @Test
  public void testSlotsAndOwnSlots() {
    StubObjectType obj = new StubObjectType(registry);
    Node node = new Node(0);
    obj.defineDeclaredProperty("declaredProp", numberType, node);

    assertNotNull(obj.getSlot("declaredProp"));
    assertNotNull(obj.getOwnSlot("declaredProp"));
    assertNull(obj.getOwnSlot("nonExistent"));
    assertTrue(obj.hasOwnProperty("declaredProp"));
    assertFalse(obj.hasOwnProperty("nonExistent"));
    assertEquals(1, obj.getPropertiesCount());
    assertTrue(obj.hasOwnDeclaredProperty("declaredProp"));
    assertFalse(obj.hasOwnDeclaredProperty("nonExistent"));

    obj.defineInferredProperty("inferredProp", stringType, node);
    assertTrue(obj.isPropertyTypeInferred("inferredProp"));
    assertFalse(obj.isPropertyTypeDeclared("inferredProp"));
    assertFalse(obj.hasOwnDeclaredProperty("inferredProp"));
  }

  @Test
  public void testFindPropertyType() {
    StubObjectType obj = new StubObjectType(registry);
    obj.defineDeclaredProperty("propA", numberType, null);

    assertSame(numberType, obj.findPropertyType("propA"));
    assertNull(obj.findPropertyType("nonExistent"));
  }

  @Test
  public void testDefineInferredProperty_mergesWithExistingType() {
    StubObjectType obj = new StubObjectType(registry);
    obj.defineInferredProperty("prop", numberType, null);
    assertEquals(numberType, obj.getPropertyType("prop"));

    obj.defineInferredProperty("prop", stringType, null);
    JSType expectedUnion = registry.createUnionType(numberType, stringType);
    assertEquals(expectedUnion, obj.getPropertyType("prop"));
  }

  @Test
  public void testGetPropertyNames() {
    StubObjectType proto = new StubObjectType(registry);
    proto.defineDeclaredProperty("protoProp", numberType, null);

    StubObjectType child = new StubObjectType(registry);
    child.setImplicitPrototype(proto);
    child.defineDeclaredProperty("childProp", stringType, null);

    Set<String> names = child.getPropertyNames();
    assertEquals(2, names.size());
    assertTrue(names.contains("protoProp"));
    assertTrue(names.contains("childProp"));
  }

  @Test
  public void testJSDocInfoHierarchy() {
    StubObjectType proto = new StubObjectType(registry);
    StubObjectType child = new StubObjectType(registry);
    child.setImplicitPrototype(proto);

    assertNull(child.getJSDocInfo());

    JSDocInfo protoDoc = new JSDocInfo();
    proto.setJSDocInfo(protoDoc);
    assertSame(protoDoc, child.getJSDocInfo());

    JSDocInfo childDoc = new JSDocInfo();
    child.setJSDocInfo(childDoc);
    assertSame(childDoc, child.getJSDocInfo());

    child.setJSDocInfo(null);
    assertSame(protoDoc, child.getJSDocInfo());
  }

  @Test
  public void testReferenceNameNormalizationAndDisplay() {
    StubObjectType obj = new StubObjectType(registry);
    assertNull(obj.getReferenceName());
    assertNull(obj.getNormalizedReferenceName());
    assertNull(obj.getDisplayName());

    obj.setRefName("MyClass");
    assertEquals("MyClass", obj.getReferenceName());
    assertEquals("MyClass", obj.getNormalizedReferenceName());
    assertEquals("MyClass", obj.getDisplayName());

    obj.setRefName("MyClass(proxy)");
    assertEquals("MyClass(proxy)", obj.getReferenceName());
    assertEquals("MyClass", obj.getNormalizedReferenceName());
    assertEquals("MyClass", obj.getDisplayName());

    assertEquals("(delegate)", ObjectType.createDelegateSuffix("delegate"));
  }

  @Test
  public void testDetectImplicitPrototypeCycle_noCycle() {
    StubObjectType a = new StubObjectType(registry);
    StubObjectType b = new StubObjectType(registry);
    StubObjectType c = new StubObjectType(registry);

    a.setImplicitPrototype(b);
    b.setImplicitPrototype(c);

    assertFalse(a.detectImplicitPrototypeCycle());
    assertFalse(b.detectImplicitPrototypeCycle());
    assertFalse(c.detectImplicitPrototypeCycle());
  }

  @Test
  public void testDetectImplicitPrototypeCycle_withCycle() {
    StubObjectType a = new StubObjectType(registry);
    StubObjectType b = new StubObjectType(registry);

    a.setImplicitPrototype(b);
    b.setImplicitPrototype(a);

    assertTrue(a.detectImplicitPrototypeCycle());
  }

  @Test
  public void testIsImplicitPrototype() {
    StubObjectType a = new StubObjectType(registry);
    StubObjectType b = new StubObjectType(registry);
    StubObjectType c = new StubObjectType(registry);
    StubObjectType other = new StubObjectType(registry);

    a.setImplicitPrototype(b);
    b.setImplicitPrototype(c);

    assertTrue(a.isImplicitPrototype(a));
    assertTrue(a.isImplicitPrototype(b));
    assertTrue(a.isImplicitPrototype(c));
    assertFalse(a.isImplicitPrototype(other));
  }

  @Test
  public void testTestForEquality() {
    StubObjectType a = new StubObjectType(registry);
    StubObjectType b = new StubObjectType(registry);

    assertEquals(TernaryValue.TRUE, a.testForEquality(a));
    assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));

    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    assertEquals(TernaryValue.FALSE, a.testForEquality(nullType));
  }

  @Test
  public void testVisit() {
    StubObjectType obj = new StubObjectType(registry);
    Visitor<String> visitor = new Visitor<String>() {
      @Override
      public String caseNoType() { return "no"; }
      @Override
      public String caseEnumElementType(EnumElementType type) { return "enumElem"; }
      @Override
      public String caseAllType() { return "all"; }
      @Override
      public String caseBooleanType() { return "bool"; }
      @Override
      public String caseNoObjectType() { return "noObj"; }
      @Override
      public String caseFunctionType(FunctionType type) { return "func"; }
      @Override
      public String caseObjectType(ObjectType type) { return "object"; }
      @Override
      public String caseUnknownType() { return "unknown"; }
      @Override
      public String caseNullType() { return "null"; }
      @Override
      public String caseNamedType(NamedType type) { return "named"; }
      @Override
      public String caseNumberType() { return "number"; }
      @Override
      public String caseStringType() { return "string"; }
      @Override
      public String caseVoidType() { return "void"; }
      @Override
      public String caseUnionType(UnionType type) { return "union"; }
      @Override
      public String caseParameterizedType(ParameterizedType type) { return "param"; }
      @Override
      public String caseTemplateType(TemplateType type) { return "template"; }
    };

    assertEquals("object", obj.visit(visitor));
  }

  @Test
  public void testIsUnknownTypeAndCaching() {
    StubObjectType obj = new StubObjectType(registry);
    assertFalse(obj.hasCachedValues());

    assertFalse(obj.isUnknownType());
    assertTrue(obj.hasCachedValues());

    // Ctor Extended Interfaces with unknown type
    StubObjectType iface = new StubObjectType(registry) {
      @Override
      public boolean isUnknownType() {
        return true;
      }
    };
    StubObjectType objWithIface = new StubObjectType(registry);
    objWithIface.setExtendedInterfaces(ImmutableList.<ObjectType>of(iface));
    assertTrue(objWithIface.isUnknownType());

    // With implicit prototype that is unknown
    StubObjectType unknownProto = new StubObjectType(registry) {
      @Override
      public boolean isUnknownType() {
        return true;
      }
    };
    StubObjectType child = new StubObjectType(registry);
    child.setImplicitPrototype(unknownProto);
    assertTrue(child.isUnknownType());

    // Clear cached values
    child.clearCachedValues();
    assertFalse(child.hasCachedValues());
  }

  @Test
  public void testCast() {
    assertNull(ObjectType.cast(null));
    StubObjectType obj = new StubObjectType(registry);
    assertSame(obj, ObjectType.cast(obj));
    assertNull(ObjectType.cast(numberType));
  }

  @Test
  public void testFunctionPrototypeOwner() {
    StubObjectType obj = new StubObjectType(registry);
    assertFalse(obj.isFunctionPrototypeType());
    assertNull(obj.getOwnerFunction());

    FunctionType fn = registry.createFunctionType(numberType);
    obj.setOwnerFunction(fn);
    assertTrue(obj.isFunctionPrototypeType());
    assertSame(fn, obj.getOwnerFunction());
  }

  @Test
  public void testPropertyClassMethods() {
    Node node = new Node(0);
    Property prop = new Property("age", numberType, false, node);

    assertEquals("age", prop.getName());
    assertSame(numberType, prop.getType());
    assertFalse(prop.isTypeInferred());
    assertSame(node, prop.getNode());
    assertSame(prop, prop.getSymbol());
    assertSame(prop, prop.getDeclaration());
    assertNull(prop.getSourceFile());
    assertFalse(prop.isFromExterns());
    assertNull(prop.getJSDocInfo());

    JSDocInfo doc = new JSDocInfo();
    prop.setJSDocInfo(doc);
    assertSame(doc, prop.getJSDocInfo());

    prop.setType(stringType);
    assertSame(stringType, prop.getType());

    Node newNode = new Node(1);
    prop.setNode(newNode);
    assertSame(newNode, prop.getNode());

    Property propNullNode = new Property("name", stringType, true, null);
    assertNull(propNullNode.getNode());
    assertNull(propNullNode.getSourceFile());
    assertNull(propNullNode.getDeclaration());
    assertFalse(propNullNode.isFromExterns());
    assertTrue(propNullNode.isTypeInferred());
  }
}
