package org.mockito.internal.util;

import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.NoOp;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.*;

public class MockUtilTest {

    private MockUtil mockUtil;

    public static class SampleClass {
        private String text;

        public SampleClass() {
        }

        public SampleClass(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    @Test
    public void testConstructor_customCreationValidator() {
        MockCreationValidator validator = new MockCreationValidator();
        MockUtil customMockUtil = new MockUtil(validator);
        assertNotNull(customMockUtil);
    }

    @Test
    public void testCreateMock_standardClass_returnsMockInstance() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMock_serializableWithoutExtraInterfaces_implementsSerializable() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof Serializable);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMock_serializableWithExtraInterfaces_implementsAllInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        settings.extraInterfaces(Comparable.class);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof Serializable);
        assertTrue(mock instanceof Comparable);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMock_nonSerializableWithExtraInterfaces_implementsInterface() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Comparable.class);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof Comparable);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMock_spiedInstance_copiesFieldsToMock() {
        SampleClass spiedInstance = new SampleClass("initial-value");
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.spiedInstance(spiedInstance);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        assertEquals("initial-value", mock.getText());
    }

    @Test
    public void testIsMock_nullInput_returnsFalse() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMock_regularObject_returnsFalse() {
        assertFalse(mockUtil.isMock("regular-string"));
        assertFalse(mockUtil.isMock(new Object()));
        assertFalse(mockUtil.isMock(new SampleClass()));
    }

    @Test
    public void testIsMock_cglibProxyWithoutMockitoCallback_returnsFalse() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object cglibProxy = enhancer.create();

        assertFalse(mockUtil.isMock(cglibProxy));
    }

    @Test
    public void testIsMock_validMock_returnsTrue() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testGetMockHandler_validMock_returnsMockHandlerInterface() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> handler = mockUtil.getMockHandler(mock);

        assertNotNull(handler);
        assertNotNull(handler.getMockSettings());
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_nullMock_throwsNotAMockException() {
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_notAMock_throwsNotAMockException() {
        mockUtil.getMockHandler(new SampleClass());
    }

    @Test
    public void testResetMock_validMock_resetsHandlerAndRemainsMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> initialHandler = mockUtil.getMockHandler(mock);
        mockUtil.resetMock(mock);
        MockHandlerInterface<SampleClass> newHandler = mockUtil.getMockHandler(mock);

        assertTrue(mockUtil.isMock(mock));
        assertNotNull(newHandler);
        assertNotSame(initialHandler, newHandler);
    }

    @Test(expected = NotAMockException.class)
    public void testResetMock_notAMock_throwsNotAMockException() {
        mockUtil.resetMock("not-a-mock");
    }

    @Test
    public void testGetMockName_explicitName_returnsConfiguredName() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("customMockName");
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockName mockName = mockUtil.getMockName(mock);

        assertNotNull(mockName);
        assertEquals("customMockName", mockName.toString());
    }

    @Test
    public void testGetMockName_defaultName_returnsTypeNameBasedMockName() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockName mockName = mockUtil.getMockName(mock);

        assertNotNull(mockName);
        assertTrue(mockName.toString().contains("sampleClass"));
    }
}
