package org.mockito.internal.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.withSettings;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

public class MockUtilTest {

    private MockUtil mockUtil;

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    @Test
    public void testConstructor_withCreationValidator_createsInstance() {
        CreationValidator validator = new CreationValidator();
        MockUtil util = new MockUtil(validator);
        assertNotNull(util);
    }

    @Test
    public void testConstructor_defaultConstructor_createsInstance() {
        MockUtil util = new MockUtil();
        assertNotNull(util);
    }

    @Test
    public void testCreateMock_normalClass_returnsMockInstance() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        List mock = mockUtil.createMock(List.class, settings);
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMock_withExtraInterfaces_returnsMockWithInterfaces() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().extraInterfaces(Comparable.class);
        List mock = mockUtil.createMock(List.class, settings);
        assertNotNull(mock);
        assertTrue(mock instanceof Comparable);
    }

    @Test
    public void testCreateMock_withSpiedInstance_copiesStateToMock() {
        ArrayList<String> spied = new ArrayList<String>();
        spied.add("test");
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().spiedInstance(spied);
        ArrayList mock = mockUtil.createMock(ArrayList.class, settings);
        assertNotNull(mock);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateMock_finalClass_throwsException() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        mockUtil.createMock(String.class, settings);
    }

    @Test
    public void testResetMock_mockObject_resetsSuccessfully() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        List mock = mockUtil.createMock(List.class, settings);
        mockUtil.resetMock(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testGetMockHandler_validMock_returnsHandler() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        List mock = mockUtil.createMock(List.class, settings);
        MockHandlerInterface handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_nullMock_throwsException() {
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_nonMockObject_throwsException() {
        mockUtil.getMockHandler("not a mock");
    }

    @Test
    public void testIsMock_validMock_returnsTrue() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        List mock = mockUtil.createMock(List.class, settings);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testIsMock_nullObject_returnsFalse() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMock_nonMockObject_returnsFalse() {
        assertFalse(mockUtil.isMock("plain string"));
    }

    @Test
    public void testIsMock_emptyStringObject_returnsFalse() {
        assertFalse(mockUtil.isMock(""));
    }

    @Test
    public void testGetMockName_validMock_returnsMockName() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        List mock = mockUtil.createMock(List.class, settings);
        MockName name = mockUtil.getMockName(mock);
        assertNotNull(name);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockName_nonMockObject_throwsException() {
        mockUtil.getMockName("not a mock");
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockName_nullObject_throwsException() {
        mockUtil.getMockName(null);
    }
}
