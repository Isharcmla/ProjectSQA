package com.google.javascript.rhino.jstype;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NamedTypeTest {

  private JSTypeRegistry registry;
  private SimpleErrorReporter errorReporter;
  private TestScope scope;

  private static class SimpleSlotImpl implements StaticSlot<JSType> {
    private final String name;
    private final JSType type;
    private final boolean inferred;

    SimpleSlotImpl(String name, JSType type, boolean inferred) {
      this.name = name;
      this.type = type;
      this.inferred = inferred;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public JSType getType() {
      return type;
    }

    @Override
    public boolean isTypeInferred() {
      return inferred;
    }

    @Override
    public StaticReference<JSType> getDeclaration() {
      return null;
    }

    @Override
    public JSType getJSType() {
      return type;
    }
  }

  private static class TestScope implements StaticScope<JSType> {
    private final Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();

    void addSlot(String name, JSType type) {
      slots.put(name, new SimpleSlotImpl(name, type, false));
    }

    void addNullTypeSlot(String name) {
      slots.put(name, new SimpleSlotImpl(name, null, false));
    }

    @Override
    public Node getRootNode() {
      return null;
    }

    @Override
    public StaticScope<JSType> getParentScope() {
      return null;
    }

    @Override
    public StaticSlot<JSType> getSlot(String name) {
      return slots.get(name);
    }

    @Override
    public StaticSlot<JSType> getOwnSlot(String name) {
      return slots.get(name);
    }

    @Override
    public JSType getTypeOfThis() {
      return null;
    }
  }

  @Before
  public void setUp() {
    errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    scope = new TestScope();
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullReference_throwsException() {
    new NamedType(registry, null, "source.js", 1, 0);
  }

  @Test
  public void testBasicProperties() {
    NamedType namedType = new NamedType(registry, "Foo", "source.js", 10, 5);
    Assert.assertEquals("Foo", namedType.getReferenceName());
    Assert.assertEquals("Foo", namedType.toStringHelper(true));
    Assert.assertEquals("Foo", namedType.toStringHelper(false));
    Assert.assertTrue(namedType.hasReferenceName());
    Assert.assertTrue(namedType.isNamedType());
    Assert.assertTrue(namedType.isNominalType());
    Assert.assertEquals("Foo".hashCode(), namedType.hashCode());
    Assert.assertEquals(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), namedType.getReferencedType());
  }

  @Test
  public void testDefineProperty_unresolved_queuesContinuation() {
    NamedType namedType = new NamedType(registry, "MyType", "source.js", 1, 0);
    Node node = new Node(0);
    boolean defined = namedType.defineProperty("prop1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, node);
    Assert.assertTrue(defined);
    Assert.assertFalse(namedType.isResolved());
  }

  @Test
  public void testDefineProperty_resolved_definesDirectly() {
    ObjectType objectType = registry.createAnonymousObjectType();
    registry.register("MyResolvedType", objectType);
    NamedType namedType = new NamedType(registry, "MyResolvedType", "source.js", 1, 0);

    namedType.resolve(errorReporter, scope);
    Assert.assertTrue(namedType.isResolved());

    Node node = new Node(0);
    boolean defined = namedType.defineProperty("prop1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, node);
    Assert.assertTrue(defined);
    Assert.assertTrue(namedType.hasProperty("prop1"));
  }

  @Test
  public void testSetValidator_beforeAndAfterResolution() {
    final boolean[] validatorCalled = new boolean[]{false};
    Predicate<JSType> validator = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        validatorCalled[0] = true;
        return true;
      }
    };

    ObjectType targetType = registry.createAnonymousObjectType();
    registry.register("ValidatedType", targetType);

    NamedType namedType = new NamedType(registry, "ValidatedType", "source.js", 1, 0);
    Assert.assertTrue(namedType.setValidator(validator));
    Assert.assertFalse(validatorCalled[0]);

    namedType.resolve(errorReporter, scope);
    Assert.assertTrue(validatorCalled[0]);

    boolean validatorResultAfter = namedType.setValidator(validator);
    Assert.assertTrue(validatorResultAfter);
  }

  @Test
  public void testResolveViaRegistry_success() {
    ObjectType targetType = registry.createAnonymousObjectType();
    registry.register("RegisteredType", targetType);

    NamedType namedType = new NamedType(registry, "RegisteredType", "source.js", 1, 0);
    namedType.defineProperty("delayedProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    JSType resolved = namedType.resolve(errorReporter, scope);
    Assert.assertNotNull(resolved);
    Assert.assertEquals(targetType, namedType.getReferencedType());
    Assert.assertTrue(targetType.hasProperty("delayedProp"));
  }

  @Test
  public void testResolveViaRegistry_lastGeneration() {
    ObjectType targetType = registry.createAnonymousObjectType();
    registry.register("RegisteredType", targetType);

    NamedType namedType = new NamedType(registry, "RegisteredType", "source.js", 1, 0);
    registry.setLastGeneration(true);
    JSType resolved = namedType.resolve(errorReporter, scope);
    Assert.assertEquals(targetType, resolved);
  }

  @Test
  public void testResolveViaProperties_constructorFunction() {
    FunctionType ctor = registry.createConstructorType("Ctor", null, null, null);
    scope.addSlot("Ctor", ctor);

    NamedType namedType = new NamedType(registry, "Ctor", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);

    Assert.assertTrue(namedType.isResolved());
    Assert.assertEquals(ctor.getInstanceType(), namedType.getReferencedType());
  }

  @Test
  public void testResolveViaProperties_interfaceFunction() {
    FunctionType iface = registry.createInterfaceType("Iface", null);
    scope.addSlot("Iface", iface);

    NamedType namedType = new NamedType(registry, "Iface", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);

    Assert.assertTrue(namedType.isResolved());
    Assert.assertEquals(iface.getInstanceType(), namedType.getReferencedType());
  }

  @Test
  public void testResolveViaProperties_noObjectType() {
    JSType noObjType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    scope.addSlot("NoObj", noObjType);

    NamedType namedType = new NamedType(registry, "NoObj", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);

    Assert.assertTrue(namedType.isResolved());
    Assert.assertEquals(
        registry.getNativeFunctionType(JSTypeNative.NO_OBJECT_TYPE).getInstanceType(),
        namedType.getReferencedType());
  }

  @Test
  public void testResolveViaProperties_enumType() {
    EnumType enumType = registry.createEnumType("MyEnum", null, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    scope.addSlot("MyEnum", enumType);

    NamedType namedType = new NamedType(registry, "MyEnum", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);

    Assert.assertTrue(namedType.isResolved());
    Assert.assertEquals(enumType.getElementsType(), namedType.getReferencedType());
  }

  @Test
  public void testResolveViaProperties_nestedPropertyPath() {
    ObjectType rootObj = registry.createAnonymousObjectType();
    ObjectType childObj = registry.createAnonymousObjectType();
    FunctionType ctor = registry.createConstructorType("ChildCtor", null, null, null);

    childObj.defineDeclaredProperty("NestedCtor", ctor, null);
    rootObj.defineDeclaredProperty("child", childObj, null);
    scope.addSlot("root", rootObj);

    NamedType namedType = new NamedType(registry, "root.child.NestedCtor", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);

    Assert.assertTrue(namedType.isResolved());
    Assert.assertEquals(ctor.getInstanceType(), namedType.getReferencedType());
  }

  @Test
  public void testResolveViaProperties_emptyComponent_returnsNull() {
    NamedType namedType = new NamedType(registry, "", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);
    Assert.assertTrue(namedType.isResolved());
  }

  @Test
  public void testResolveViaProperties_emptySubComponent_returnsNull() {
    ObjectType rootObj = registry.createAnonymousObjectType();
    scope.addSlot("root", rootObj);

    NamedType namedType = new NamedType(registry, "root..child", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);
    Assert.assertTrue(namedType.isResolved());
  }

  @Test
  public void testResolveViaProperties_slotNotFound_returnsNull() {
    NamedType namedType = new NamedType(registry, "UnknownSymbol", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);
    Assert.assertTrue(namedType.isResolved());
  }

  @Test
  public void testResolveViaProperties_slotTypeNull() {
    scope.addNullTypeSlot("NullSlot");
    NamedType namedType = new NamedType(registry, "NullSlot", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);
    Assert.assertTrue(namedType.isResolved());
  }

  @Test
  public void testResolveViaProperties_slotTypeAllOrNoType() {
    scope.addSlot("AllSlot", registry.getNativeType(JSTypeNative.ALL_TYPE));
    NamedType namedTypeAll = new NamedType(registry, "AllSlot", "source.js", 1, 0);
    namedTypeAll.resolve(errorReporter, scope);
    Assert.assertTrue(namedTypeAll.isResolved());

    scope.addSlot("NoSlot", registry.getNativeType(JSTypeNative.NO_TYPE));
    NamedType namedTypeNo = new NamedType(registry, "NoSlot", "source.js", 1, 0);
    namedTypeNo.resolve(errorReporter, scope);
    Assert.assertTrue(namedTypeNo.isResolved());
  }

  @Test
  public void testResolveViaProperties_parentClassNotAnObject() {
    scope.addSlot("primitiveSlot", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    NamedType namedType = new NamedType(registry, "primitiveSlot.subProp", "source.js", 1, 0);
    namedType.resolve(errorReporter, scope);
    Assert.assertTrue(namedType.isResolved());
  }

  @Test
  public void testResolve_unresolvedLastGeneration_notForwardDeclared() {
    registry.setLastGeneration(true);
    NamedType namedType = new NamedType(registry, "UnresolvedType", "test.js", 10, 2);
    JSType result = namedType.resolve(errorReporter, scope);
    Assert.assertEquals(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), result);
    Assert.assertEquals(1, errorReporter.getWarnings().size());
  }

  @Test
  public void testResolve_unresolvedLastGeneration_forwardDeclared() {
    registry.forwardDeclareType("ForwardDeclaredType");
    registry.setLastGeneration(true);

    final boolean[] validatorCalled = new boolean[]{false};
    Predicate<JSType> validator = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        validatorCalled[0] = true;
        return true;
      }
    };

    NamedType namedType = new NamedType(registry, "ForwardDeclaredType", "test.js", 10, 2);
    namedType.setValidator(validator);
    JSType result = namedType.resolve(errorReporter, scope);

    Assert.assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), result);
    Assert.assertTrue(validatorCalled[0]);
    Assert.assertEquals(0, errorReporter.getWarnings().size());
  }

  @Test
  public void testResolve_unresolvedNotLastGeneration() {
    registry.setLastGeneration(false);
    NamedType namedType = new NamedType(registry, "UnresolvedType", "test.js", 10, 2);
    JSType result = namedType.resolve(errorReporter, scope);
    Assert.assertEquals(namedType, result);
  }

  @Test
  public void testGetTypedefType_withType() {
    NamedType namedType = new NamedType(registry, "Foo", "test.js", 1, 0);
    StaticSlot<JSType> slot = new SimpleSlotImpl("x", registry.getNativeType(JSTypeNative.STRING_TYPE), false);
    JSType type = namedType.getTypedefType(errorReporter, slot, "x");
    Assert.assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), type);
  }

  @Test
  public void testGetTypedefType_withNullType() {
    NamedType namedType = new NamedType(registry, "Foo", "test.js", 1, 0);
    StaticSlot<JSType> slot = new SimpleSlotImpl("x", null, false);
    JSType type = namedType.getTypedefType(errorReporter, slot, "x");
    Assert.assertNull(type);
  }

  @Test
  public void testResolve_enumElementCycle() {
    NamedType namedType = new NamedType(registry, "CycleEnum", "test.js", 1, 0);
    EnumType enumType = registry.createEnumType("CycleEnum", null, namedType);
    EnumElementType enumElementType = enumType.getElementsType();

    registry.register("CycleEnum", enumElementType);

    namedType.resolve(errorReporter, scope);
    Assert.assertEquals(1, errorReporter.getWarnings().size());
  }
}
