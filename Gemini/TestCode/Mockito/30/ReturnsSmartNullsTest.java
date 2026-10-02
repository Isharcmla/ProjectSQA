package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.invocation.InvocationOnMock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ReturnsSmartNullsTest {

    interface SampleInterface {
        String getString();
        int getPrimitiveInt();
        FinalClass getFinalClass();
        NonFinalClass getNonFinalClass();
        NonFinalClass getNonFinalClassWithArgs(String text, int number);
        NonFinalClass getNonFinalClassWithNullArg(String text);
    }

    static final class FinalClass {
    }

    static class NonFinalClass {
        public void execute() {
        }

        public String getValue() {
            return "value";
        }
    }

    static class DummyInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] args;

        public DummyInvocation(Object mock, Method method, Object[] args) {
            this.mock = mock;
            this.method = method;
            this.args = args == null ? new Object[0] : args;
        }

        public Object getMock() {
            return mock;
        }

        public Method getMethod() {
            return method;
        }

        public Object[] getArguments() {
            return args;
        }

        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    @Test
    public void testAnswer_returnsDefaultEmptyValueForString() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getString");
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = answer.answer(invocation);

        assertEquals("", result);
    }

    @Test
    public void testAnswer_returnsDefaultPrimitiveValueForInt() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getPrimitiveInt");
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = answer.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testAnswer_returnsNull_whenReturnTypeIsFinalClass() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getFinalClass");
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = answer.answer(invocation);

        assertNull(result);
    }

    @Test
    public void testAnswer_returnsSmartNullProxy_whenReturnTypeIsMockable() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getNonFinalClass");
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = answer.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof NonFinalClass);
    }

    @Test
    public void testSmartNull_toString_returnsFormattedString_withoutArgs() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getNonFinalClass");
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[0]);

        NonFinalClass smartNull = (NonFinalClass) answer.answer(invocation);
        String toStringResult = smartNull.toString();

        assertEquals("SmartNull returned by unstubbed getNonFinalClass() method on mock", toStringResult);
    }

    @Test
    public void testSmartNull_toString_returnsFormattedString_withArgs() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getNonFinalClassWithArgs", String.class, int.class);
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[]{"example", 100});

        NonFinalClass smartNull = (NonFinalClass) answer.answer(invocation);
        String toStringResult = smartNull.toString();

        assertEquals("SmartNull returned by unstubbed getNonFinalClassWithArgs(example, 100) method on mock", toStringResult);
    }

    @Test
    public void testSmartNull_toString_returnsFormattedString_withNullArg() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getNonFinalClassWithNullArg", String.class);
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[]{null});

        NonFinalClass smartNull = (NonFinalClass) answer.answer(invocation);
        String toStringResult = smartNull.toString();

        assertEquals("SmartNull returned by unstubbed getNonFinalClassWithNullArg(null) method on mock", toStringResult);
    }

    @Test(expected = SmartNullPointerException.class)
    public void testSmartNull_methodInvocation_throwsSmartNullPointerException() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getNonFinalClass");
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[0]);

        NonFinalClass smartNull = (NonFinalClass) answer.answer(invocation);
        smartNull.execute();
    }

    @Test(expected = SmartNullPointerException.class)
    public void testSmartNull_methodWithReturnValue_throwsSmartNullPointerException() throws Throwable {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();
        Method method = SampleInterface.class.getMethod("getNonFinalClass");
        InvocationOnMock invocation = new DummyInvocation(new Object(), method, new Object[0]);

        NonFinalClass smartNull = (NonFinalClass) answer.answer(invocation);
        smartNull.getValue();
    }

    @Test
    public void testReturnsSmartNulls_isSerializable() throws Exception {
        ReturnsSmartNulls answer = new ReturnsSmartNulls();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(answer);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object deserialized = ois.readObject();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsSmartNulls);
    }
}
