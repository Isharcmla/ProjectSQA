package org.mockito.internal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

public class MockitoCoreTest {

    private MockitoCore core;

    public interface TestInterface {
        String testMethod(String arg);
        void voidMethod();
    }

    @Before
    public void setUp() {
        core = new MockitoCore();
        core.validateMockitoUsage();
    }

    @After
    public void tearDown() {
        try {
            core.validateMockitoUsage();
        } catch (Throwable ignored) {
            new ThreadSafeMockingProgress().reset();
        }
    }

    @Test
    public void testMock_withSettingsAndFlag_createsMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        TestInterface mock = core.mock(TestInterface.class, settings, true);
        assertNotNull(mock);
    }

    @Test
    public void testMock_withSettings_createsMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        TestInterface mock = core.mock(TestInterface.class, settings);
        assertNotNull(mock);
    }

    @Test
    public void testWhen_validInvocation_stubsCorrectly() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        OngoingStubbing<String> ongoingStubbing = core.when(mock.testMethod("hello"));
        assertNotNull(ongoingStubbing);
        ongoingStubbing.thenReturn("world");

        assertEquals("world", mock.testMethod("hello"));
    }

    @Test(expected = MockitoException.class)
    public void testWhen_noMethodCall_throwsException() {
        core.when("notAnInvocation");
    }

    @Test
    public void testStub_deprecated_validInvocation_stubsCorrectly() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        DeprecatedOngoingStubbing<String> stubbing = core.stub(mock.testMethod("foo"));
        assertNotNull(stubbing);
        stubbing.toReturn("bar");

        assertEquals("bar", mock.testMethod("foo"));
    }

    @Test(expected = MockitoException.class)
    public void testStub_withoutInvocation_throwsException() {
        core.stub();
    }

    @Test
    public void testVerify_validMock_verifiesMethodCall() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        mock.testMethod("call");

        TestInterface verified = core.verify(mock, VerificationModeFactory.times(1));
        assertSame(mock, verified);
        verified.testMethod("call");
    }

    @Test(expected = MockitoException.class)
    public void testVerify_nullMock_throwsException() {
        core.verify(null, VerificationModeFactory.times(1));
    }

    @Test(expected = MockitoException.class)
    public void testVerify_nonMockObject_throwsException() {
        core.verify("nonMockString", VerificationModeFactory.times(1));
    }

    @Test
    public void testReset_singleAndMultipleMocks_resetsState() {
        TestInterface mock1 = core.mock(TestInterface.class, new MockSettingsImpl());
        TestInterface mock2 = core.mock(TestInterface.class, new MockSettingsImpl());

        core.when(mock1.testMethod("a")).thenReturn("1");
        core.when(mock2.testMethod("b")).thenReturn("2");

        assertEquals("1", mock1.testMethod("a"));
        assertEquals("2", mock2.testMethod("b"));

        core.reset(mock1, mock2);

        assertNull(mock1.testMethod("a"));
        assertNull(mock2.testMethod("b"));
    }

    @Test
    public void testReset_emptyArray_doesNotThrow() {
        core.reset();
    }

    @Test
    public void testVerifyNoMoreInteractions_validMock_noInteractions() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        core.verifyNoMoreInteractions(mock);
    }

    @Test
    public void testVerifyNoMoreInteractions_afterVerification_passes() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        mock.testMethod("test");
        core.verify(mock, VerificationModeFactory.times(1)).testMethod("test");
        core.verifyNoMoreInteractions(mock);
    }

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_nullArray_throwsException() {
        core.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_emptyArray_throwsException() {
        core.verifyNoMoreInteractions(new Object[0]);
    }

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_nullElement_throwsException() {
        core.verifyNoMoreInteractions((Object) null);
    }

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_notAMock_throwsException() {
        core.verifyNoMoreInteractions("notAMock");
    }

    @Test
    public void testInOrder_validMocks_createsInOrder() {
        TestInterface mock1 = core.mock(TestInterface.class, new MockSettingsImpl());
        TestInterface mock2 = core.mock(TestInterface.class, new MockSettingsImpl());

        InOrder inOrder = core.inOrder(mock1, mock2);
        assertNotNull(inOrder);
    }

    @Test(expected = MockitoException.class)
    public void testInOrder_nullArray_throwsException() {
        core.inOrder((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testInOrder_emptyArray_throwsException() {
        core.inOrder(new Object[0]);
    }

    @Test(expected = MockitoException.class)
    public void testInOrder_nullElement_throwsException() {
        core.inOrder((Object) null);
    }

    @Test(expected = MockitoException.class)
    public void testInOrder_notAMock_throwsException() {
        core.inOrder("stringObject");
    }

    @Test
    public void testDoAnswer_validAnswer_stubsMock() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        Answer<String> customAnswer = new Answer<String>() {
            @Override
            public String answer(InvocationOnMock invocation) {
                return "customAnswer";
            }
        };

        Stubber stubber = core.doAnswer(customAnswer);
        assertNotNull(stubber);
        stubber.when(mock).testMethod("input");

        assertEquals("customAnswer", mock.testMethod("input"));
    }

    @Test
    public void testStubVoid_validMock_stubsVoidMethod() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        VoidMethodStubbable<TestInterface> stubbable = core.stubVoid(mock);
        assertNotNull(stubbable);
        stubbable.toThrow(new RuntimeException("void exception")).on().voidMethod();

        try {
            mock.voidMethod();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("void exception", e.getMessage());
        }
    }

    @Test(expected = MockitoException.class)
    public void testStubVoid_nonMock_throwsException() {
        core.stubVoid("notAMock");
    }

    @Test
    public void testValidateMockitoUsage_validState_doesNotThrow() {
        core.validateMockitoUsage();
    }

    @Test
    public void testGetLastInvocation_afterMethodInvocation_returnsLastInvocation() {
        TestInterface mock = core.mock(TestInterface.class, new MockSettingsImpl());
        mock.testMethod("paramValue");

        Invocation lastInvocation = core.getLastInvocation();
        assertNotNull(lastInvocation);
        assertEquals("testMethod", lastInvocation.getMethod().getName());
        assertEquals("paramValue", lastInvocation.getArguments()[0]);
    }
}
