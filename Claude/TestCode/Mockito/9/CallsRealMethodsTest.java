import org.junit.Test;
import org.junit.Assert;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.internal.stubbing.answers.CallsRealMethods;

import java.lang.reflect.Method;
import java.io.Serializable;

public class CallsRealMethodsTest {

    /**
     * Fake implementation of InvocationOnMock used to test CallsRealMethods
     * without relying on any mocking framework.
     * The behavior of callRealMethod() is configurable per test case.
     */
    private static class FakeInvocationOnMock implements InvocationOnMock, Serializable {

        private final Object returnValue;
        private final Throwable throwable;

        FakeInvocationOnMock(Object returnValue) {
            this.returnValue = returnValue;
            this.throwable = null;
        }

        FakeInvocationOnMock(Throwable throwable) {
            this.returnValue = null;
            this.throwable = throwable;
        }

        @Override
        public Method getMethod() {
            throw new UnsupportedOperationException("Not needed for this test");
        }

        @Override
        public Object[] getArguments() {
            return new Object[0];
        }

        @Override
        public <T> T getArgument(int index) {
            throw new UnsupportedOperationException("Not needed for this test");
        }

        @Override
        public <T> T getArgument(int index, Class<T> clazz) {
            throw new UnsupportedOperationException("Not needed for this test");
        }

        @Override
        public Object getMock() {
            return null;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            if (throwable != null) {
                throw throwable;
            }
            return returnValue;
        }
    }

    @Test
    public void testAnswer_normalInput_returnsRealMethodResult() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock("real value");

        Object result = callsRealMethods.answer(invocation);

        Assert.assertEquals("real value", result);
    }

    @Test
    public void testAnswer_nullReturnValue_returnsNull() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock((Object) null);

        Object result = callsRealMethods.answer(invocation);

        Assert.assertNull(result);
    }

    @Test
    public void testAnswer_emptyStringReturnValue_returnsEmptyString() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock("");

        Object result = callsRealMethods.answer(invocation);

        Assert.assertEquals("", result);
    }

    @Test
    public void testAnswer_integerReturnValue_returnsSameInteger() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock(Integer.valueOf(0));

        Object result = callsRealMethods.answer(invocation);

        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void testAnswer_negativeIntegerReturnValue_returnsSameNegativeInteger() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock(Integer.valueOf(-1));

        Object result = callsRealMethods.answer(invocation);

        Assert.assertEquals(Integer.valueOf(-1), result);
    }

    @Test(expected = RuntimeException.class)
    public void testAnswer_realMethodThrowsRuntimeException_propagatesException() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock(new RuntimeException("boom"));

        callsRealMethods.answer(invocation);
    }

    @Test(expected = Exception.class)
    public void testAnswer_realMethodThrowsCheckedException_propagatesException() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock(new Exception("checked exception"));

        callsRealMethods.answer(invocation);
    }

    @Test(expected = Error.class)
    public void testAnswer_realMethodThrowsError_propagatesError() throws Throwable {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationOnMock invocation = new FakeInvocationOnMock(new Error("fatal error"));

        callsRealMethods.answer(invocation);
    }
}
