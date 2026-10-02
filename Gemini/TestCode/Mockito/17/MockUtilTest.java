package org.mockito.internal.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.NoOp;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

import java.io.Serializable;
import java.util.List;

public class MockUtilTest {

    private MockUtil mockUtil;

    public static class SampleClass {
        private int sampleField = 10;

        public int getSampleField() {
            return sampleField;
        }

        public void setSampleField(int sampleField) {
            this.sampleField = sampleField;
        }
    }

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    @Test
    public void testConstructor_defaultInstantiation_succeeds() {
        MockUtil util = new MockUtil();
        Assert.assertNotNull(util);
    }

    @Test
    public void testConstructor_customCreationValidator_succeeds() {
        CreationValidator validator = new CreationValidator();
        MockUtil util = new MockUtil(validator);
        Assert.assertNotNull(util);
    }

    @Test
    public void testCreateMock_withoutExtraInterfaces_createsValidMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMock_withExtraInterfaces_createsMockImplementingInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Serializable.class, Comparable.class);
        List<?> mock = mockUtil.createMock(List.class, settings);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mockUtil.isMock(mock));
        Assert.assertTrue(mock instanceof Serializable);
        Assert.assertTrue(mock instanceof Comparable);
    }

    @Test
    public void testCreateMock_withSpiedInstance_copiesStateToMock() {
        SampleClass spiedInstance = new SampleClass();
        spiedInstance.setSampleField(99);

        MockSettingsImpl settings = new MockSettingsImpl();
        settings.spiedInstance(spiedInstance);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mockUtil.isMock(mock));
        Assert.assertEquals(99, mock.getSampleField());
    }

    @Test
    public void testResetMock_validMock_resetsHandler() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> initialHandler = mockUtil.getMockHandler(mock);
        Assert.assertNotNull(initialHandler);

        mockUtil.resetMock(mock);

        MockHandlerInterface<SampleClass> resetHandler = mockUtil.getMockHandler(mock);
        Assert.assertNotNull(resetHandler);
        Assert.assertNotSame(initialHandler, resetHandler);
    }

    @Test
    public void testIsMock_nullInput_returnsFalse() {
        Assert.assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMock_regularObject_returnsFalse() {
        Assert.assertFalse(mockUtil.isMock(new Object()));
        Assert.assertFalse(mockUtil.isMock("sample string"));
        Assert.assertFalse(mockUtil.isMock(123));
    }

    @Test
    public void testIsMock_cglibEnhancedNonMockitoMock_returnsFalse() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object cglibProxy = enhancer.create();

        Assert.assertFalse(mockUtil.isMock(cglibProxy));
    }

    @Test
    public void testIsMock_validMockitoMock_returnsTrue() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        Assert.assertTrue(mockUtil.isMock(mock));
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_nullInput_throwsNotAMockException() {
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_regularObject_throwsNotAMockException() {
        mockUtil.getMockHandler(new Object());
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_cglibEnhancedNonMockitoMock_throwsNotAMockException() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object cglibProxy = enhancer.create();

        mockUtil.getMockHandler(cglibProxy);
    }

    @Test
    public void testGetMockHandler_validMock_returnsHandler() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> handler = mockUtil.getMockHandler(mock);
        Assert.assertNotNull(handler);
    }

    @Test
    public void testGetMockName_validMockWithCustomName_returnsCorrectName() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("customName");
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockName mockName = mockUtil.getMockName(mock);
        Assert.assertNotNull(mockName);
        Assert.assertEquals("customName", mockName.toString());
    }

    @Test
    public void testGetMockName_validMockWithDefaultName_returnsDefaultName() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockName mockName = mockUtil.getMockName(mock);
        Assert.assertNotNull(mockName);
        Assert.assertEquals("sampleClass", mockName.toString());
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockName_nonMock_throwsNotAMockException() {
        mockUtil.getMockName(new Object());
    }
}
