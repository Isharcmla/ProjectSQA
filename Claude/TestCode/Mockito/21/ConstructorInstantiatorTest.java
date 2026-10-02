package org.mockito.internal.creation.instance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConstructorInstantiatorTest {

    // -------- Helper classes for testing --------

    public static class NoArgClass {
        public NoArgClass() {
        }
    }

    public static abstract class AbstractClass {
        public AbstractClass() {
        }
    }

    public static class PrivateConstructorClass {
        private PrivateConstructorClass() {
        }
    }

    public class OuterClass {
        public class InnerClass {
            public InnerClass() {
            }
        }
    }

    // -------- Tests for no-arg constructor path (outerClassInstance == null) --------

    @Test
    public void testNewInstance_noArgConstructor_normalInput_returnsInstance() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        NoArgClass instance = instantiator.newInstance(NoArgClass.class);
        assertNotNull(instance);
        assertTrue(instance instanceof NoArgClass);
    }

    @Test
    public void testNewInstance_noArgConstructor_nullOuterInstance_usesNoArgConstructorPath() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        NoArgClass instance = instantiator.newInstance(NoArgClass.class);
        assertNotNull(instance);
    }

    @Test(expected = InstantationException.class)
    public void testNewInstance_noArgConstructor_abstractClass_throwsInstantationException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        instantiator.newInstance(AbstractClass.class);
    }

    @Test(expected = InstantationException.class)
    public void testNewInstance_noArgConstructor_privateConstructor_throwsInstantationException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        instantiator.newInstance(PrivateConstructorClass.class);
    }

    @Test
    public void testNewInstance_noArgConstructor_exceptionMessage_containsClassName() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        try {
            instantiator.newInstance(AbstractClass.class);
            fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("AbstractClass"));
            assertTrue(e.getMessage().contains("parameter-less constructor"));
        }
    }

    // -------- Tests for with-outer-class constructor path (outerClassInstance != null) --------

    @Test
    public void testNewInstance_withOuterClass_normalInput_returnsInstance() {
        OuterClass outer = new OuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);
        OuterClass.InnerClass instance = instantiator.newInstance(OuterClass.InnerClass.class);
        assertNotNull(instance);
        assertTrue(instance instanceof OuterClass.InnerClass);
    }

    @Test(expected = InstantationException.class)
    public void testNewInstance_withOuterClass_wrongOuterType_throwsInstantationException() {
        // Passing a String as outer instance, which does not match InnerClass's required outer type
        ConstructorInstantiator instantiator = new ConstructorInstantiator("wrongOuterInstance");
        instantiator.newInstance(OuterClass.InnerClass.class);
    }

    @Test
    public void testNewInstance_withOuterClass_exceptionMessage_containsClassName() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator("wrongOuterInstance");
        try {
            instantiator.newInstance(OuterClass.InnerClass.class);
            fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("InnerClass"));
            assertTrue(e.getMessage().contains("outer instance"));
        }
    }

    @Test(expected = InstantationException.class)
    public void testNewInstance_withOuterClass_classHasNoMatchingConstructor_throwsInstantationException() {
        // NoArgClass does not have a constructor accepting an OuterClass parameter
        OuterClass outer = new OuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);
        instantiator.newInstance(NoArgClass.class);
    }

    // -------- Constructor test --------

    @Test
    public void testConstructor_withNullOuterInstance_doesNotThrow() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        assertNotNull(instantiator);
    }

    @Test
    public void testConstructor_withNonNullOuterInstance_doesNotThrow() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(new Object());
        assertNotNull(instantiator);
    }
}
