import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.MockSettings;
import org.mockito.internal.util.MockName;
import org.mockito.stubbing.Answer;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.exceptions.base.MockitoException;

import java.io.Serializable;

public class MockSettingsImplTest {

    private MockSettingsImpl settings;

    @Before
    public void setUp() {
        settings = new MockSettingsImpl();
    }

    // ---------- getExtraInterfaces() ----------

    @Test
    public void testGetExtraInterfaces_initiallyNull() {
        assertNull(settings.getExtraInterfaces());
    }

    // ---------- extraInterfaces() : normal ----------

    @Test
    public void testExtraInterfaces_withValidInterfaces_setsSuccessfully() {
        MockSettings result = settings.extraInterfaces(Runnable.class, Comparable.class);

        assertSame(settings, result);
        Class<?>[] extraInterfaces = settings.getExtraInterfaces();
        assertNotNull(extraInterfaces);
        assertEquals(2, extraInterfaces.length);
        assertEquals(Runnable.class, extraInterfaces[0]);
        assertEquals(Comparable.class, extraInterfaces[1]);
    }

    // ---------- extraInterfaces() : edge/exception cases ----------

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_withNullArray_throwsMockitoException() {
        settings.extraInterfaces((Class<?>[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_withEmptyArray_throwsMockitoException() {
        settings.extraInterfaces(new Class<?>[0]);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_withNullElement_throwsMockitoException() {
        settings.extraInterfaces(Runnable.class, null);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_withNonInterfaceElement_throwsMockitoException() {
        settings.extraInterfaces(String.class);
    }

    // ---------- serializable() ----------

    @Test
    public void testSerializable_setsExtraInterfacesContainingSerializable() {
        MockSettings result = settings.serializable();

        assertSame(settings, result);
        Class<?>[] extraInterfaces = settings.getExtraInterfaces();
        assertNotNull(extraInterfaces);
        assertEquals(1, extraInterfaces.length);
        assertEquals(Serializable.class, extraInterfaces[0]);
    }

    // ---------- isSerializable() ----------

    @Test
    public void testIsSerializable_whenExtraInterfacesNull_returnsFalse() {
        assertFalse(settings.isSerializable());
    }

    @Test
    public void testIsSerializable_whenSerializableInterfaceSet_returnsTrue() {
        settings.serializable();
        assertTrue(settings.isSerializable());
    }

    @Test
    public void testIsSerializable_whenExtraInterfacesSetWithoutSerializable_returnsFalse() {
        settings.extraInterfaces(Runnable.class);
        assertFalse(settings.isSerializable());
    }

    // ---------- name() ----------

    @Test
    public void testName_setsNameField_returnsThis() {
        MockSettings result = settings.name("myMock");
        assertSame(settings, result);
    }

    @Test
    public void testName_withNullName_doesNotThrow() {
        MockSettings result = settings.name(null);
        assertSame(settings, result);
    }

    @Test
    public void testName_withEmptyString_doesNotThrow() {
        MockSettings result = settings.name("");
        assertSame(settings, result);
    }

    // ---------- spiedInstance() ----------

    @Test
    public void testSpiedInstance_setsAndGetsNormalObject() {
        Object spy = new Object();
        MockSettings result = settings.spiedInstance(spy);

        assertSame(settings, result);
        assertSame(spy, settings.getSpiedInstance());
    }

    @Test
    public void testSpiedInstance_withNull_returnsNull() {
        settings.spiedInstance(null);
        assertNull(settings.getSpiedInstance());
    }

    @Test
    public void testGetSpiedInstance_initiallyNull() {
        assertNull(settings.getSpiedInstance());
    }

    // ---------- defaultAnswer() / getDefaultAnswer() ----------

    @Test
    public void testDefaultAnswer_setsAndGetsAnswer() {
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "answered";
            }
        };

        MockSettings result = settings.defaultAnswer(answer);

        assertSame(settings, result);
        assertSame(answer, settings.getDefaultAnswer());
    }

    @Test
    public void testGetDefaultAnswer_initiallyNull() {
        assertNull(settings.getDefaultAnswer());
    }

    @Test
    public void testDefaultAnswer_withNull_returnsNull() {
        settings.defaultAnswer(null);
        assertNull(settings.getDefaultAnswer());
    }

    // ---------- getMockName() / initiateMockName() ----------

    @Test
    public void testGetMockName_initiallyNull() {
        assertNull(settings.getMockName());
    }

    @Test
    public void testInitiateMockName_withoutCustomName_createsMockNameNotNull() {
        settings.initiateMockName(ArrayList.class);

        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        // Exact default naming format is an internal dependency of MockName
        // which is not fully documented here; only verifying non-null/non-empty result.
        assertNotNull(mockName.toString());
        assertFalse(mockName.toString().isEmpty());
    }

    @Test
    public void testInitiateMockName_withCustomName_usesGivenNameAsMockName() {
        settings.name("customName");
        settings.initiateMockName(ArrayList.class);

        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        // Assumption: when a custom name is provided, MockName uses it directly.
        assertEquals("customName", mockName.toString());
    }

    @Test
    public void testGetMockName_afterInitiate_returnsSameInstanceOnRepeatedCalls() {
        settings.initiateMockName(Object.class);
        MockName first = settings.getMockName();
        MockName second = settings.getMockName();
        assertSame(first, second);
    }

    // helper inner reference to avoid extra import clutter
    private static class ArrayList {
    }
}
