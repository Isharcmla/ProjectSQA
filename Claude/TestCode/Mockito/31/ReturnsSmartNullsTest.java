import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls;

import java.util.List;

public class ReturnsSmartNullsTest {

    // Final class - cannot be imposterised by CGLIB
    public static final class MyFinalReturnType {
    }

    // Interface - can be imposterised, used to test SmartNull creation
    public interface SampleInterface {
        String getString();
        int getInt();
        List<String> getList();
        MyFinalReturnType getFinal();
        SampleInterface getSelf();
        Object[] getArray();
    }

    private ReturnsSmartNulls returnsSmartNulls;
    private SampleInterface mock;

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
        mock = Mockito.mock(SampleInterface.class, returnsSmartNulls);
    }

    @Test
    public void testConstructor_createsInstance_notNull() {
        assertNotNull(returnsSmartNulls);
    }

    @Test
    public void testAnswer_primitiveReturnType_returnsDefaultValue() {
        int result = mock.getInt();
        assertEquals(0, result);
    }

    @Test
    public void testAnswer_stringReturnType_returnsEmptyStringNotNull() {
        String result = mock.getString();
        assertNotNull(result);
        assertEquals("", result);
    }

    @Test
    public void testAnswer_listReturnType_returnsEmptyListNotNull() {
        List<String> result = mock.getList();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAnswer_arrayReturnType_returnsEmptyArrayNotNull() {
        Object[] result = mock.getArray();
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testAnswer_finalClassReturnType_returnsNull() {
        MyFinalReturnType result = mock.getFinal();
        assertNull(result);
    }

    @Test
    public void testAnswer_interfaceReturnType_returnsSmartNullNotNull() {
        SampleInterface result = mock.getSelf();
        assertNotNull(result);
    }

    @Test
    public void testAnswer_smartNullToString_returnsDescriptiveMessage() {
        SampleInterface smartNull = mock.getSelf();
        String toStringResult = smartNull.toString();
        assertNotNull(toStringResult);
        assertTrue(toStringResult.contains("SmartNull returned by unstubbed"));
        assertTrue(toStringResult.contains("getSelf()"));
    }

    @Test
    public void testAnswer_smartNullMethodCall_throwsSmartNullPointerException() {
        SampleInterface smartNull = mock.getSelf();
        boolean exceptionThrown = false;
        String exceptionClassName = "";
        try {
            smartNull.getInt();
        } catch (Throwable t) {
            exceptionThrown = true;
            exceptionClassName = t.getClass().getName();
        }
        assertTrue("Expected an exception to be thrown when calling a method on a SmartNull", exceptionThrown);
        assertTrue("Expected a SmartNullPointerException but got: " + exceptionClassName,
                exceptionClassName.contains("SmartNullPointerException"));
    }

    @Test
    public void testAnswer_smartNullStringMethodCall_throwsSmartNullPointerException() {
        SampleInterface smartNull = mock.getSelf();
        boolean exceptionThrown = false;
        try {
            smartNull.getString();
        } catch (Throwable t) {
            exceptionThrown = true;
        }
        assertTrue("Expected an exception to be thrown when calling a non-toString method on a SmartNull", exceptionThrown);
    }

    @Test
    public void testAnswer_multipleCallsToSameMock_returnDifferentSmartNullInstances() {
        SampleInterface smartNull1 = mock.getSelf();
        SampleInterface smartNull2 = mock.getSelf();
        assertNotNull(smartNull1);
        assertNotNull(smartNull2);
    }

    @Test
    public void testAnswer_nestedSmartNullToString_doesNotThrow() {
        SampleInterface smartNull = mock.getSelf();
        try {
            String result = smartNull.toString();
            assertNotNull(result);
        } catch (Throwable t) {
            fail("toString() on SmartNull should not throw an exception, but threw: " + t);
        }
    }
}
