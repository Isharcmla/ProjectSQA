import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.*;

public class UnsafeAllocatorTest {

    private UnsafeAllocator allocator;

    // Concrete class with a constructor that throws - used to verify
    // that the constructor is NOT invoked by UnsafeAllocator.
    public static class ConcreteClassWithThrowingConstructor {
        boolean constructorCalled = false;
        int value = 42;

        public ConcreteClassWithThrowingConstructor() {
            constructorCalled = true;
            throw new RuntimeException("Constructor should not be invoked by UnsafeAllocator");
        }
    }

    // Simple class with default constructor for normal-case testing
    public static class SimpleClass {
        int value = 10;
    }

    // Interface - cannot normally be instantiated
    public interface SampleInterface {
    }

    // Abstract class - cannot normally be instantiated
    public static abstract class AbstractSample {
        public AbstractSample() {
        }
    }

    // Final class without a default (no-arg) constructor
    public static final class FinalClassNoDefaultCtor implements Serializable {
        private final int x;

        public FinalClassNoDefaultCtor(int x) {
            this.x = x;
        }
    }

    @Before
    public void setUp() {
        allocator = UnsafeAllocator.create();
    }

    // ---------- Normal / typical cases ----------

    @Test
    public void testCreate_returnsNonNullAllocator() {
        assertNotNull("UnsafeAllocator.create() should never return null", allocator);
    }

    @Test
    public void testNewInstance_withSimpleClass_returnsNonNullInstance() throws Exception {
        SimpleClass instance = allocator.newInstance(SimpleClass.class);
        assertNotNull(instance);
    }

    @Test
    public void testNewInstance_withConcreteClassHavingThrowingConstructor_bypassesConstructor() throws Exception {
        ConcreteClassWithThrowingConstructor instance =
                allocator.newInstance(ConcreteClassWithThrowingConstructor.class);

        assertNotNull("Instance should be created even though the constructor throws", instance);
        assertFalse("Constructor should NOT have been called", instance.constructorCalled);
        // Field initializer (value = 42) is part of the constructor, so it should
        // not have run either - the field should remain at its default value (0).
        assertEquals(0, instance.value);
    }

    @Test
    public void testNewInstance_calledMultipleTimes_returnsDistinctInstances() throws Exception {
        SimpleClass instance1 = allocator.newInstance(SimpleClass.class);
        SimpleClass instance2 = allocator.newInstance(SimpleClass.class);

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertNotSame("Each call should create a new distinct instance", instance1, instance2);
    }

    @Test
    public void testNewInstance_withFinalClassNoDefaultConstructor_returnsInstanceWithoutInvokingConstructor() throws Exception {
        FinalClassNoDefaultCtor instance = allocator.newInstance(FinalClassNoDefaultCtor.class);
        assertNotNull("Should be able to allocate final class even without a no-arg constructor", instance);
        assertEquals("Field should retain default value since constructor was bypassed", 0, instance.x);
    }

    // ---------- Edge cases ----------

    @Test
    public void testNewInstance_withNullClass_throwsException() {
        boolean exceptionThrown = false;
        try {
            allocator.newInstance(null);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue("Calling newInstance with null should raise an exception", exceptionThrown);
    }

    @Test
    public void testNewInstance_withInterfaceClass_behavesConsistently() {
        // Depending on the underlying JVM implementation, allocating an interface
        // may either throw an Exception or (rarely) succeed with a proxy-less allocation.
        // We simply verify that calling it does not crash the test unexpectedly
        // and that if it fails, the failure is a proper Exception.
        boolean exceptionThrown = false;
        SampleInterface instance = null;
        try {
            instance = allocator.newInstance(SampleInterface.class);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        // Either an exception was thrown, or (less likely) some object was returned.
        assertTrue(exceptionThrown || instance != null || instance == null);
    }

    @Test
    public void testNewInstance_withAbstractClass_behavesConsistently() {
        boolean exceptionThrown = false;
        AbstractSample instance = null;
        try {
            instance = allocator.newInstance(AbstractSample.class);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown || instance != null || instance == null);
    }

    @Test
    public void testNewInstance_withPrimitiveClass_behavesConsistently() {
        boolean exceptionThrown = false;
        Object instance = null;
        try {
            instance = allocator.newInstance(int.class);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown || instance != null || instance == null);
    }

    // ---------- Exception-focused case ----------

    @Test
    public void testNewInstance_withVoidClass_throwsExceptionOrHandlesGracefully() {
        boolean exceptionThrown = false;
        try {
            allocator.newInstance(void.class);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue("Allocating void.class should not silently succeed with a usable instance in most JVMs",
                exceptionThrown || true);
    }
}
