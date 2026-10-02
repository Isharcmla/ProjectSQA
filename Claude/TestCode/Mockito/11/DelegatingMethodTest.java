package org.mockito.internal.creation;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class DelegatingMethodTest {

    // Helper class with various method signatures for testing
    static class SampleClass {
        public void simpleMethod() {
        }

        public int methodWithParams(String s, int i) {
            return i;
        }

        public void methodWithVarArgs(String... args) {
        }

        public void methodThrowsException() throws IOException {
        }

        public String methodReturnsString() {
            return "hello";
        }
    }

    interface SampleInterface {
        void abstractMethod();
    }

    private Method simpleMethod;
    private Method methodWithParams;
    private Method methodWithVarArgs;
    private Method methodThrowsException;
    private Method methodReturnsString;
    private Method abstractMethod;

    @Before
    public void setUp() throws Exception {
        simpleMethod = SampleClass.class.getMethod("simpleMethod");
        methodWithParams = SampleClass.class.getMethod("methodWithParams", String.class, int.class);
        methodWithVarArgs = SampleClass.class.getMethod("methodWithVarArgs", String[].class);
        methodThrowsException = SampleClass.class.getMethod("methodThrowsException");
        methodReturnsString = SampleClass.class.getMethod("methodReturnsString");
        abstractMethod = SampleInterface.class.getMethod("abstractMethod");
    }

    @Test
    public void testConstructor_validMethod_createsInstance() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertNotNull(delegatingMethod);
    }

    @Test
    public void testGetJavaMethod_returnsOriginalMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertEquals(simpleMethod, delegatingMethod.getJavaMethod());
    }

    @Test
    public void testGetName_returnsCorrectName() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertEquals("simpleMethod", delegatingMethod.getName());
    }

    @Test
    public void testGetName_methodWithParams_returnsCorrectName() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodWithParams);
        assertEquals("methodWithParams", delegatingMethod.getName());
    }

    @Test
    public void testGetParameterTypes_noParams_returnsEmptyArray() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        Class<?>[] paramTypes = delegatingMethod.getParameterTypes();
        assertNotNull(paramTypes);
        assertEquals(0, paramTypes.length);
    }

    @Test
    public void testGetParameterTypes_withParams_returnsCorrectTypes() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodWithParams);
        Class<?>[] paramTypes = delegatingMethod.getParameterTypes();
        assertEquals(2, paramTypes.length);
        assertEquals(String.class, paramTypes[0]);
        assertEquals(int.class, paramTypes[1]);
    }

    @Test
    public void testGetReturnType_voidMethod_returnsVoidType() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertEquals(void.class, delegatingMethod.getReturnType());
    }

    @Test
    public void testGetReturnType_nonVoidMethod_returnsCorrectType() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodReturnsString);
        assertEquals(String.class, delegatingMethod.getReturnType());
    }

    @Test
    public void testGetExceptionTypes_noExceptions_returnsEmptyArray() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        Class<?>[] exceptionTypes = delegatingMethod.getExceptionTypes();
        assertNotNull(exceptionTypes);
        assertEquals(0, exceptionTypes.length);
    }

    @Test
    public void testGetExceptionTypes_withException_returnsCorrectTypes() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodThrowsException);
        Class<?>[] exceptionTypes = delegatingMethod.getExceptionTypes();
        assertEquals(1, exceptionTypes.length);
        assertEquals(IOException.class, exceptionTypes[0]);
    }

    @Test
    public void testIsVarArgs_nonVarArgsMethod_returnsFalse() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.isVarArgs());
    }

    @Test
    public void testIsVarArgs_varArgsMethod_returnsTrue() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(methodWithVarArgs);
        assertTrue(delegatingMethod.isVarArgs());
    }

    @Test
    public void testIsAbstract_concreteMethod_returnsFalse() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.isAbstract());
    }

    @Test
    public void testIsAbstract_abstractMethod_returnsTrue() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethod);
        assertTrue(delegatingMethod.isAbstract());
    }

    @Test
    public void testEquals_sameMethodObject_returnsTrue() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertTrue(delegatingMethod.equals(simpleMethod));
    }

    @Test
    public void testEquals_differentMethodObject_returnsFalse() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.equals(methodWithParams));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.equals(null));
    }

    @Test
    public void testEquals_nonMethodObject_returnsFalse() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertFalse(delegatingMethod.equals("not a method"));
    }

    @Test
    public void testEquals_delegatingMethodWithSameInternalMethod_methodEqualsIsCalledDirectly() {
        // equals() delegates directly to method.equals(o), not comparing DelegatingMethod wrappers
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(simpleMethod);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(simpleMethod);
        // Since method.equals(delegatingMethod2) will be false (Method vs DelegatingMethod)
        assertFalse(delegatingMethod1.equals(delegatingMethod2));
    }

    @Test
    public void testHashCode_alwaysReturnsOne() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(simpleMethod);
        assertEquals(1, delegatingMethod.hashCode());
    }

    @Test
    public void testHashCode_differentInstances_sameHashCode() {
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(simpleMethod);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(methodWithParams);
        assertEquals(delegatingMethod1.hashCode(), delegatingMethod2.hashCode());
    }
}
