package org.mockito.internal.creation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class DelegatingMethodTest {

    private interface SampleInterface {
        String abstractVarArgsMethod(int count, String... names) throws IOException, IllegalArgumentException;
        void concreteLikeMethod();
    }

    private static class SampleClass implements SampleInterface {
        @Override
        public String abstractVarArgsMethod(int count, String... names) throws IOException, IllegalArgumentException {
            return "test";
        }

        @Override
        public void concreteLikeMethod() {
        }
    }

    private Method abstractMethod;
    private Method concreteMethod;
    private DelegatingMethod delegatingAbstractMethod;
    private DelegatingMethod delegatingConcreteMethod;

    @Before
    public void setUp() throws Exception {
        abstractMethod = SampleInterface.class.getMethod("abstractVarArgsMethod", int.class, String[].class);
        concreteMethod = SampleClass.class.getMethod("concreteLikeMethod");
        delegatingAbstractMethod = new DelegatingMethod(abstractMethod);
        delegatingConcreteMethod = new DelegatingMethod(concreteMethod);
    }

    @Test
    public void testConstructor_withValidMethod_initializesSuccessfully() {
        DelegatingMethod method = new DelegatingMethod(concreteMethod);
        Assert.assertNotNull(method);
        Assert.assertEquals(concreteMethod, method.getJavaMethod());
    }

    @Test
    public void testGetExceptionTypes_methodWithDeclaredExceptions_returnsExceptionArray() {
        Class<?>[] exceptions = delegatingAbstractMethod.getExceptionTypes();
        Assert.assertEquals(2, exceptions.length);
        Assert.assertEquals(IOException.class, exceptions[0]);
        Assert.assertEquals(IllegalArgumentException.class, exceptions[1]);
    }

    @Test
    public void testGetExceptionTypes_methodWithoutExceptions_returnsEmptyArray() {
        Class<?>[] exceptions = delegatingConcreteMethod.getExceptionTypes();
        Assert.assertEquals(0, exceptions.length);
    }

    @Test
    public void testGetJavaMethod_returnsUnderlyingMethodInstance() {
        Assert.assertSame(abstractMethod, delegatingAbstractMethod.getJavaMethod());
        Assert.assertSame(concreteMethod, delegatingConcreteMethod.getJavaMethod());
    }

    @Test
    public void testGetName_returnsCorrectMethodName() {
        Assert.assertEquals("abstractVarArgsMethod", delegatingAbstractMethod.getName());
        Assert.assertEquals("concreteLikeMethod", delegatingConcreteMethod.getName());
    }

    @Test
    public void testGetParameterTypes_methodWithParameters_returnsCorrectTypes() {
        Class<?>[] params = delegatingAbstractMethod.getParameterTypes();
        Assert.assertEquals(2, params.length);
        Assert.assertEquals(int.class, params[0]);
        Assert.assertEquals(String[].class, params[1]);
    }

    @Test
    public void testGetParameterTypes_methodWithoutParameters_returnsEmptyArray() {
        Class<?>[] params = delegatingConcreteMethod.getParameterTypes();
        Assert.assertEquals(0, params.length);
    }

    @Test
    public void testGetReturnType_returnsCorrectReturnType() {
        Assert.assertEquals(String.class, delegatingAbstractMethod.getReturnType());
        Assert.assertEquals(void.class, delegatingConcreteMethod.getReturnType());
    }

    @Test
    public void testIsVarArgs_varArgsMethod_returnsTrue() {
        Assert.assertTrue(delegatingAbstractMethod.isVarArgs());
    }

    @Test
    public void testIsVarArgs_nonVarArgsMethod_returnsFalse() {
        Assert.assertFalse(delegatingConcreteMethod.isVarArgs());
    }

    @Test
    public void testIsAbstract_abstractMethod_returnsTrue() {
        Assert.assertTrue(delegatingAbstractMethod.isAbstract());
    }

    @Test
    public void testIsAbstract_concreteMethod_returnsFalse() {
        Assert.assertFalse(delegatingConcreteMethod.isAbstract());
    }

    @Test
    public void testEquals_sameMethodObject_returnsTrue() {
        Assert.assertTrue(delegatingAbstractMethod.equals(abstractMethod));
    }

    @Test
    public void testEquals_differentMethodObject_returnsFalse() {
        Assert.assertFalse(delegatingAbstractMethod.equals(concreteMethod));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        Assert.assertFalse(delegatingAbstractMethod.equals(null));
    }

    @Test
    public void testEquals_differentObjectType_returnsFalse() {
        Assert.assertFalse(delegatingAbstractMethod.equals("notAMethod"));
    }

    @Test
    public void testEquals_anotherDelegatingMethod_returnsFalseBecauseMethodEqualsDoesNotUnwrap() {
        DelegatingMethod another = new DelegatingMethod(abstractMethod);
        Assert.assertFalse(delegatingAbstractMethod.equals(another));
    }

    @Test
    public void testHashCode_alwaysReturnsOne() {
        Assert.assertEquals(1, delegatingAbstractMethod.hashCode());
        Assert.assertEquals(1, delegatingConcreteMethod.hashCode());
    }
}
