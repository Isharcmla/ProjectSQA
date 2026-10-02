package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    private interface SampleService {
        String getString();
        int getInt();
        SampleInterface getSampleInterface();
        FinalClass getFinalClass();
    }

    private interface SampleInterface {
        void doAction();
    }

    private static final class FinalClass {
    }

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    private InvocationOnMock createInvocation(final Method method) {
        return new InvocationOnMock() {
            @Override
            public Object getMock() {
                return null;
            }

            @Override
            public Method getMethod() {
                return method;
            }

            @Override
            public Object[] getArguments() {
                return new Object[0];
            }

            @Override
            public Object callRealMethod() throws Throwable {
                return null;
            }
        };
    }

    @Test
    public void testAnswer_primitiveReturnType_returnsDefaultPrimitive() throws Throwable {
        Method method = SampleService.class.getMethod("getInt");
        InvocationOnMock invocation = createInvocation(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testAnswer_stringReturnType_returnsEmptyStringFromDelegate() throws Throwable {
        Method method = SampleService.class.getMethod("getString");
        InvocationOnMock invocation = createInvocation(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertEquals("", result);
    }

    @Test
    public void testAnswer_nonMockableFinalClass_returnsNull() throws Throwable {
        Method method = SampleService.class.getMethod("getFinalClass");
        InvocationOnMock invocation = createInvocation(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    @Test
    public void testAnswer_mockableInterface_returnsSmartNullProxy() throws Throwable {
        Method method = SampleService.class.getMethod("getSampleInterface");
        InvocationOnMock invocation = createInvocation(method);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof SampleInterface);
    }

    @Test
    public void testSmartNull_toStringCall_returnsInformativeMessage() throws Throwable {
        Method method = SampleService.class.getMethod("getSampleInterface");
        InvocationOnMock invocation = createInvocation(method);

        SampleInterface smartNull = (SampleInterface) returnsSmartNulls.answer(invocation);

        String toStringResult = smartNull.toString();
        assertEquals("SmartNull returned by unstubbed getSampleInterface() method on mock", toStringResult);
    }

    @Test(expected = SmartNullPointerException.class)
    public void testSmartNull_methodInvocation_throwsSmartNullPointerException() throws Throwable {
        Method method = SampleService.class.getMethod("getSampleInterface");
        InvocationOnMock invocation = createInvocation(method);

        SampleInterface smartNull = (SampleInterface) returnsSmartNulls.answer(invocation);

        smartNull.doAction();
    }

    @Test
    public void testSerialization_returnsSmartNullsIsSerializable() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsSmartNulls);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsSmartNulls);
    }
}
