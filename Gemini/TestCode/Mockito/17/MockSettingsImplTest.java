package org.mockito.internal.creation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class MockSettingsImplTest {

    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
    }

    @Test
    public void testInitialState_defaultValuesAreNullOrFalse() {
        assertNull(mockSettings.getExtraInterfaces());
        assertNull(mockSettings.getMockName());
        assertNull(mockSettings.getSpiedInstance());
        assertNull(mockSettings.getDefaultAnswer());
        assertFalse(mockSettings.isSerializable());
    }

    @Test
    public void testSerializable_shouldAddSerializableInterfaceAndSetSerializableToTrue() {
        MockSettingsImpl returned = (MockSettingsImpl) mockSettings.serializable();

        assertSame(mockSettings, returned);
        assertTrue(mockSettings.isSerializable());
        assertNotNull(mockSettings.getExtraInterfaces());
        assertArrayEquals(new Class<?>[]{Serializable.class}, mockSettings.getExtraInterfaces());
    }

    @Test
    public void testExtraInterfaces_validInterfaces_shouldSetInterfacesCorrectly() {
        MockSettingsImpl returned = (MockSettingsImpl) mockSettings.extraInterfaces(List.class, Set.class);

        assertSame(mockSettings, returned);
        assertArrayEquals(new Class<?>[]{List.class, Set.class}, mockSettings.getExtraInterfaces());
        assertFalse(mockSettings.isSerializable());
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_nullArray_throwsException() {
        mockSettings.extraInterfaces((Class<?>[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_emptyArray_throwsException() {
        mockSettings.extraInterfaces(new Class<?>[0]);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_nullElementInArray_throwsException() {
        mockSettings.extraInterfaces(List.class, null);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_classIsNotAnInterface_throwsException() {
        mockSettings.extraInterfaces(String.class);
    }

    @Test
    public void testIsSerializable_whenExtraInterfacesIsNull_returnsFalse() {
        assertFalse(mockSettings.isSerializable());
    }

    @Test
    public void testIsSerializable_whenExtraInterfacesDoesNotContainSerializable_returnsFalse() {
        mockSettings.extraInterfaces(List.class);
        assertFalse(mockSettings.isSerializable());
    }

    @Test
    public void testIsSerializable_whenExtraInterfacesContainsSerializable_returnsTrue() {
        mockSettings.extraInterfaces(List.class, Serializable.class);
        assertTrue(mockSettings.isSerializable());
    }

    @Test
    public void testName_setsNameAndReturnsThis() {
        MockSettingsImpl returned = (MockSettingsImpl) mockSettings.name("myMock");
        assertSame(mockSettings, returned);
    }

    @Test
    public void testInitiateMockName_withCustomName_createsMockNameWithCustomName() {
        mockSettings.name("customName");
        mockSettings.initiateMockName(List.class);

        assertNotNull(mockSettings.getMockName());
        assertEquals("customName", mockSettings.getMockName().toString());
    }

    @Test
    public void testInitiateMockName_withoutName_createsDefaultMockName() {
        mockSettings.initiateMockName(List.class);

        assertNotNull(mockSettings.getMockName());
        assertEquals("list", mockSettings.getMockName().toString());
    }

    @Test
    public void testSpiedInstance_setsAndGetsSpiedInstance() {
        Object instance = new Object();
        MockSettingsImpl returned = (MockSettingsImpl) mockSettings.spiedInstance(instance);

        assertSame(mockSettings, returned);
        assertSame(instance, mockSettings.getSpiedInstance());
    }

    @Test
    public void testSpiedInstance_withNull_setsNull() {
        mockSettings.spiedInstance(null);
        assertNull(mockSettings.getSpiedInstance());
    }

    @Test
    public void testDefaultAnswer_setsAndGetsDefaultAnswer() {
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                return null;
            }
        };

        MockSettingsImpl returned = (MockSettingsImpl) mockSettings.defaultAnswer(answer);

        assertSame(mockSettings, returned);
        assertSame(answer, mockSettings.getDefaultAnswer());
    }

    @Test
    public void testDefaultAnswer_withNull_setsNull() {
        mockSettings.defaultAnswer(null);
        assertNull(mockSettings.getDefaultAnswer());
    }
}
