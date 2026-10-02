package org.mockito.internal.creation.instance;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ConstructorInstantiatorTest {

    static class SimpleNoArgClass {
        public SimpleNoArgClass() {
        }
    }

    static class ClassWithoutNoArgConstructor {
        public ClassWithoutNoArgConstructor(String param) {
        }
    }

    static class ClassThrowingExceptionInNoArgConstructor {
        public ClassThrowingExceptionInNoArgConstructor() {
            throw new RuntimeException("Simulated error in no-arg constructor");
        }
    }

    static abstract class AbstractClass {
    }

    static class OuterClass {
        class InnerClass {
            public InnerClass() {
            }
        }
    }

    static class ClassThrowingExceptionInOuterConstructor {
        public ClassThrowingExceptionInOuterConstructor(OuterClass outer) {
            throw new RuntimeException("Simulated error in outer class constructor");
        }
    }

    @Test
    public void testNewInstance_nullOuterClassInstance_createsInstanceSuccessfully() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        SimpleNoArgClass instance = instantiator.newInstance(SimpleNoArgClass.class);

        assertNotNull(instance);
    }

    @Test
    public void testNewInstance_nullOuterClassInstance_missingNoArgConstructor_throwsInstantationException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(ClassWithoutNoArgConstructor.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("ClassWithoutNoArgConstructor"));
            assertTrue(e.getMessage().contains("parameter-less constructor"));
        }
    }

    @Test
    public void testNewInstance_nullOuterClassInstance_constructorThrowsException_throwsInstantationException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(ClassThrowingExceptionInNoArgConstructor.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("ClassThrowingExceptionInNoArgConstructor"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testNewInstance_nullOuterClassInstance_abstractClass_throwsInstantationException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(AbstractClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("AbstractClass"));
        }
    }

    @Test
    public void testNewInstance_withOuterClassInstance_createsInnerClassInstanceSuccessfully() {
        OuterClass outerInstance = new OuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);

        OuterClass.InnerClass innerInstance = instantiator.newInstance(OuterClass.InnerClass.class);

        assertNotNull(innerInstance);
    }

    @Test
    public void testNewInstance_withOuterClassInstance_mismatchedOuterType_throwsInstantationException() {
        String wrongOuterInstance = "invalidOuterInstance";
        ConstructorInstantiator instantiator = new ConstructorInstantiator(wrongOuterInstance);

        try {
            instantiator.newInstance(OuterClass.InnerClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("InnerClass"));
            assertTrue(e.getMessage().contains("ensure that the outer instance has correct type"));
        }
    }

    @Test
    public void testNewInstance_withOuterClassInstance_constructorThrowsException_throwsInstantationException() {
        OuterClass outerInstance = new OuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);

        try {
            instantiator.newInstance(ClassThrowingExceptionInOuterConstructor.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("ClassThrowingExceptionInOuterConstructor"));
            assertNotNull(e.getCause());
        }
    }
}
