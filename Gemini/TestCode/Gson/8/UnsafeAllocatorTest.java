package com.google.gson.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class UnsafeAllocatorTest {

  private UnsafeAllocator allocator;

  @Before
  public void setUp() {
    allocator = UnsafeAllocator.create();
  }

  @Test
  public void testCreate_returnsNonNullInstance() {
    UnsafeAllocator instance = UnsafeAllocator.create();
    assertNotNull("UnsafeAllocator instance should not be null", instance);
  }

  @Test
  public void testNewInstance_simpleClass_allocatesWithoutCallingConstructor() throws Exception {
    SimpleClass instance = allocator.newInstance(SimpleClass.class);
    assertNotNull(instance);
    assertTrue(instance instanceof SimpleClass);
    assertEquals("Constructor should not be executed; field should have default value 0", 0, instance.value);
  }

  @Test
  public void testNewInstance_classWithFailingConstructor_success() throws Exception {
    ClassWithFailingConstructor instance = allocator.newInstance(ClassWithFailingConstructor.class);
    assertNotNull(instance);
    assertTrue(instance instanceof ClassWithFailingConstructor);
  }

  @Test
  public void testNewInstance_classWithPrivateConstructor_success() throws Exception {
    ClassWithPrivateConstructor instance = allocator.newInstance(ClassWithPrivateConstructor.class);
    assertNotNull(instance);
    assertTrue(instance instanceof ClassWithPrivateConstructor);
  }

  @Test
  public void testNewInstance_classWithoutNoArgConstructor_success() throws Exception {
    ClassWithoutNoArgConstructor instance = allocator.newInstance(ClassWithoutNoArgConstructor.class);
    assertNotNull(instance);
    assertTrue(instance instanceof ClassWithoutNoArgConstructor);
    assertEquals(0, instance.number);
  }

  @Test
  public void testNewInstance_abstractClass_throwsException() {
    try {
      allocator.newInstance(AbstractClass.class);
      fail("Expected exception when allocating abstract class");
    } catch (Exception expected) {
      // Expected behavior on standard JVMs (InstantiationException) or fallback (UnsupportedOperationException)
      assertNotNull(expected);
    }
  }

  @Test
  public void testNewInstance_interface_throwsException() {
    try {
      allocator.newInstance(TestInterface.class);
      fail("Expected exception when allocating interface");
    } catch (Exception expected) {
      // Expected behavior on standard JVMs (InstantiationException) or fallback (UnsupportedOperationException)
      assertNotNull(expected);
    }
  }

  @Test
  public void testNewInstance_nullClass_throwsException() {
    try {
      allocator.newInstance(null);
      fail("Expected exception when passing null class");
    } catch (Exception expected) {
      assertNotNull(expected);
    }
  }

  // Helper classes for testing instantiation behavior

  static class SimpleClass {
    int value = 100;

    public SimpleClass() {
      this.value = 200;
    }
  }

  static class ClassWithFailingConstructor {
    public ClassWithFailingConstructor() {
      throw new AssertionError("Constructor must not be invoked by UnsafeAllocator");
    }
  }

  static class ClassWithPrivateConstructor {
    private ClassWithPrivateConstructor() {
      throw new AssertionError("Private constructor must not be invoked");
    }
  }

  static class ClassWithoutNoArgConstructor {
    final int number;

    public ClassWithoutNoArgConstructor(int number) {
      this.number = number;
    }
  }

  static abstract class AbstractClass {
    public abstract void doSomething();
  }

  interface TestInterface {
    void doSomething();
  }
}
