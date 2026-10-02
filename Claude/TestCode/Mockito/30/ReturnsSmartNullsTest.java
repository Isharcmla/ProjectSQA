package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;

import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    // ---- Helper classes used as mock targets ----

    public static class SampleClass {
        public int getInt() {
            return 0;
        }

        public String getString() {
            return "real";
        }

        public List<String> getList() {
            return null;
        }

        public CustomType getCustomType() {
            return null;
        }

        public CustomType getCustomTypeWithArgs(String name, int number) {
            return null;
        }
    }

    // Non-final, public, has accessible no-arg constructor -> imposterisable
    public static class CustomType implements Serializable {
        public CustomType() {
        }

        public String someMethod() {
            return "real";
        }
    }

    // ---- Fake InvocationOnMock implementation (no mocking framework used) ----

    private static class FakeInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        FakeInvocation(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments;
        }

        public Object getMock() {
            return mock;
        }

        public Method getMethod() {
            return method;
        }

        public Object[] getArguments() {
            return arguments;
        }

        public Object callRealMethod() throws Throwable {
            throw new UnsupportedOperationException("callRealMethod not supported in this test fake");
        }
    }

    private final ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();

    // ---------------- Normal / typical input cases ----------------

    @Test
    public void testAnswer_listReturnType_returnsEmptyListFromDelegate() throws Throwable {
        SampleClass sample = new SampleClass();
        Method method = SampleClass.class.getMethod("getList");
        InvocationOnMock invocation = new FakeInvocation(sample, method, new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull("Delegate should provide a non-null empty collection", result);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_customReturnType_toStringReturnsSmartNullMessage() throws Throwable {
        SampleClass sample = new SampleClass();
        Method method = SampleClass.class.getMethod("getCustomType");
        InvocationOnMock invocation = new FakeInvocation(sample, method, new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull("Expected a SmartNull proxy instead of null", result);
        String toStringResult = result.toString();
        assertTrue(toStringResult.contains("SmartNull returned by unstubbed"));
        assertTrue(toStringResult.contains("getCustomType"));
    }

    @Test
    public void testAnswer_customReturnTypeWithArguments_toStringIncludesArguments() throws Throwable {
        SampleClass sample = new SampleClass();
        Method method = SampleClass.class.getMethod("getCustomTypeWithArgs", String.class, int.class);
        Object[] args = new Object[] { "hello", 42 };
        InvocationOnMock invocation = new FakeInvocation(sample, method, args);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        String toStringResult = result.toString();
        assertTrue(toStringResult.contains("getCustomTypeWithArgs"));
        assertTrue(toStringResult.contains("hello"));
        assertTrue(toStringResult.contains("42"));
    }

    // ---------------- Edge cases ----------------

    @Test
    public void testAnswer_intReturnType_returnsZeroDefaultValue() throws Throwable {
        SampleClass sample = new SampleClass();
        Method method = SampleClass.class.getMethod("getInt");
        InvocationOnMock invocation = new FakeInvocation(sample, method, new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertEquals(0, result);
    }

    @Test
    public void testAnswer_finalClassStringReturnType_returnsNullWhenNotImposterisable() throws Throwable {
        // String is a final class, so delegate returning null leads to
        // ClassImposterizer.canImposterise(String.class) == false,
        // and the overall answer() should return plain null.
        SampleClass sample = new SampleClass();
        Method method = SampleClass.class.getMethod("getString");

        // simulate the scenario where the underlying method would normally
        // return something, but we force the "empty value" path by using
        // a method whose declared return type is String and no stub set up;
        // ReturnsMoreEmptyValues does not provide a default for String,
        // so defaultReturnValue is expected to be null, and because
        // String is final, the final result must also be null.
        InvocationOnMock invocation = new FakeInvocation(sample, method, new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull("String is final and must not be imposterised; null expected", result);
    }

    @Test(expected = NullPointerException.class)
    public void testAnswer_nullInvocation_throwsNullPointerException() throws Throwable {
        returnsSmartNulls.answer(null);
    }

    // ---------------- Exception-expected case ----------------

    @Test
    public void testAnswer_customReturnType_callingNonToStringMethodThrowsSmartNullException() throws Throwable {
        SampleClass sample = new SampleClass();
        Method method = SampleClass.class.getMethod("getCustomType");
        InvocationOnMock invocation = new FakeInvocation(sample, method, new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);
        assertNotNull(result);
        assertTrue(result instanceof CustomType);

        CustomType smartNullProxy = (CustomType) result;

        boolean exceptionThrown = false;
        try {
            smartNullProxy.someMethod();
        } catch (Throwable t) {
            exceptionThrown = true;
            assertNotNull(t.getMessage());
        }

        assertTrue("Calling a non-toString method on the SmartNull proxy must throw an exception", exceptionThrown);
    }
}
