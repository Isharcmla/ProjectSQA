package org.mockito.internal.stubbing.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class CallsRealMethodsTest {

    private CallsRealMethods callsRealMethods;

    @Before
    public void setUp() {
        callsRealMethods = new CallsRealMethods();
    }

    @Test
    public void testAnswer_whenCallRealMethodReturnsObject_returnsExpectedObject() throws Throwable {
        final Object expectedResult = "realMethodValue";
        InvocationOnMock invocation = new BaseDummyInvocationOnMock() {
            @Override
            public Object callRealMethod() throws Throwable {
                return expectedResult;
            }
        };

        Object actualResult = callsRealMethods.answer(invocation);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAnswer_whenCallRealMethodReturnsNull_returnsNull() throws Throwable {
        InvocationOnMock invocation = new BaseDummyInvocationOnMock() {
            @Override
            public Object callRealMethod() throws Throwable {
                return null;
            }
        };

        Object actualResult = callsRealMethods.answer(invocation);

        assertNull(actualResult);
    }

    @Test
    public void testAnswer_whenCallRealMethodReturnsPrimitiveWrapper_returnsValue() throws Throwable {
        final Integer expectedResult = 42;
        InvocationOnMock invocation = new BaseDummyInvocationOnMock() {
            @Override
            public Object callRealMethod() throws Throwable {
                return expectedResult;
            }
        };

        Object actualResult = callsRealMethods.answer(invocation);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = RuntimeException.class)
    public void testAnswer_whenCallRealMethodThrowsRuntimeException_propagatesException() throws Throwable {
        InvocationOnMock invocation = new BaseDummyInvocationOnMock() {
            @Override
            public Object callRealMethod() throws Throwable {
                throw new RuntimeException("Invocation error");
            }
        };

        callsRealMethods.answer(invocation);
    }

    @Test(expected = Exception.class)
    public void testAnswer_whenCallRealMethodThrowsCheckedException_propagatesException() throws Throwable {
        InvocationOnMock invocation = new BaseDummyInvocationOnMock() {
            @Override
            public Object callRealMethod() throws Throwable {
                throw new Exception("Checked exception");
            }
        };

        callsRealMethods.answer(invocation);
    }

    @Test(expected = Error.class)
    public void testAnswer_whenCallRealMethodThrowsError_propagatesError() throws Throwable {
        InvocationOnMock invocation = new BaseDummyInvocationOnMock() {
            @Override
            public Object callRealMethod() throws Throwable {
                throw new AssertionError("Assertion error");
            }
        };

        callsRealMethods.answer(invocation);
    }

    @Test(expected = NullPointerException.class)
    public void testAnswer_whenInvocationIsNull_throwsNullPointerException() throws Throwable {
        callsRealMethods.answer(null);
    }

    @Test
    public void testSerialization_whenSerializedAndDeserialized_retainsFunctionality() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(callsRealMethods);
        objectOutputStream.flush();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object deserialized = objectInputStream.readObject();

        assertNotNull(deserialized);
        assertEquals(CallsRealMethods.class, deserialized.getClass());

        CallsRealMethods deserializedAnswer = (CallsRealMethods) deserialized;
        InvocationOnMock invocation = new BaseDummyInvocationOnMock() {
            @Override
            public Object callRealMethod() throws Throwable {
                return "afterDeserialization";
            }
        };

        Object result;
        try {
            result = deserializedAnswer.answer(invocation);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
        assertEquals("afterDeserialization", result);
    }

    private static class BaseDummyInvocationOnMock implements InvocationOnMock {
        public Object getMock() {
            return null;
        }

        public Method getMethod() {
            return null;
        }

        public Object[] getArguments() {
            return new Object[0];
        }

        public <T> T getArgument(int index) {
            return null;
        }

        public <T> T getArgument(int index, Class<T> clazz) {
            return null;
        }

        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return null;
        }

        public Object callRealMethod() throws Throwable {
            return null;
        }
    }
}
