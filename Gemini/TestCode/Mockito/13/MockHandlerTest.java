package org.mockito.internal;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.SerializableMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.internal.verification.MockAwareVerificationMode;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MockHandlerTest {

    private MockingProgress mockingProgress;
    private MockSettingsImpl mockSettings;
    private MockHandler<List<?>> mockHandler;

    @Before
    public void setUp() {
        mockingProgress = new ThreadSafeMockingProgress();
        mockingProgress.reset();
        mockSettings = new MockSettingsImpl();
        mockHandler = new MockHandler<List<?>>(mockSettings);
    }

    @After
    public void tearDown() {
        mockingProgress.reset();
    }

    private Invocation createInvocation(Object mock, String methodName, Class<?>[] paramTypes, Object[] args) throws Exception {
        Method method = mock.getClass().getMethod(methodName, paramTypes);
        MockitoMethod mockitoMethod = new SerializableMethod(method);
        RealMethod realMethod = new RealMethod() {
            private static final long serialVersionUID = 1L;
            public Object invoke(Object target, Object[] arguments) throws Throwable {
                return null;
            }
        };
        return new Invocation(mock, mockitoMethod, args, 1, realMethod);
    }

    @Test
    public void testDefaultConstructor_initializesProperly() {
        MockHandler<Object> handler = new MockHandler<Object>();
        assertNotNull(handler.getMockSettings());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testConstructor_withMockSettings_initializesProperly() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        assertSame(settings, handler.getMockSettings());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testConstructor_withOldMockHandler_copiesMockSettings() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> oldHandler = new MockHandler<Object>(settings);
        MockHandler<Object> newHandler = new MockHandler<Object>(oldHandler);

        assertSame(settings, newHandler.getMockSettings());
        assertNotNull(newHandler.getInvocationContainer());
        assertNotSame(oldHandler.getInvocationContainer(), newHandler.getInvocationContainer());
    }

    @Test
    public void testGetMockSettings_returnsSettings() {
        assertSame(mockSettings, mockHandler.getMockSettings());
    }

    @Test
    public void testGetInvocationContainer_returnsContainer() {
        InvocationContainer container = mockHandler.getInvocationContainer();
        assertNotNull(container);
    }

    @Test
    public void testVoidMethodStubbable_returnsValidInstance() {
        List<?> mockList = new ArrayList<Object>();
        VoidMethodStubbable<List<?>> stubbable = mockHandler.voidMethodStubbable(mockList);
        assertNotNull(stubbable);
    }

    @Test
    public void testSetAnswersForStubbing_withEmptyList() {
        mockHandler.setAnswersForStubbing(Collections.<Answer>emptyList());
        assertNotNull(mockHandler.getInvocationContainer());
    }

    @Test
    public void testHandle_hasAnswersForStubbing_setsMethodAndReturnsNull() throws Throwable {
        List<String> mockList = new ArrayList<String>();
        Invocation invocation = createInvocation(mockList, "size", new Class<?>[0], new Object[0]);

        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                return 42;
            }
        });
        mockHandler.setAnswersForStubbing(answers);

        Object result = mockHandler.handle(invocation);

        assertNull(result);
    }

    @Test
    public void testHandle_stubbedInvocation_returnsStubbedAnswer() throws Throwable {
        List<String> mockList = new ArrayList<String>();
        Invocation invocation = createInvocation(mockList, "size", new Class<?>[0], new Object[0]);

        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                return 42;
            }
        });
        mockHandler.setAnswersForStubbing(answers);
        mockHandler.handle(invocation);

        Object result = mockHandler.handle(invocation);

        assertEquals(42, result);
    }

    @Test
    public void testHandle_notStubbed_returnsDefaultAnswer() throws Throwable {
        List<String> mockList = new ArrayList<String>();
        Invocation invocation = createInvocation(mockList, "size", new Class<?>[0], new Object[0]);

        Object result = mockHandler.handle(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testHandle_verificationMode_matchingMock_executesVerifyAndReturnsNull() throws Throwable {
        final List<String> mockList = new ArrayList<String>();
        Invocation invocation = createInvocation(mockList, "size", new Class<?>[0], new Object[0]);

        final boolean[] verifyCalled = new boolean[]{false};
        VerificationMode mode = new VerificationMode() {
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
            }
        };

        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(mockList, mode);
        mockingProgress.verificationStarted(mockAwareMode);

        Object result = mockHandler.handle(invocation);

        assertNull(result);
        assertTrue(verifyCalled[0]);
    }

    @Test
    public void testHandle_verificationMode_differentMock_skipsVerification() throws Throwable {
        List<String> mockList1 = new ArrayList<String>();
        List<String> mockList2 = new ArrayList<String>();
        Invocation invocationOnMock1 = createInvocation(mockList1, "size", new Class<?>[0], new Object[0]);

        final boolean[] verifyCalled = new boolean[]{false};
        VerificationMode mode = new VerificationMode() {
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
            }
        };

        MockAwareVerificationMode mockAwareModeOnMock2 = new MockAwareVerificationMode(mockList2, mode);
        mockingProgress.verificationStarted(mockAwareModeOnMock2);

        Object result = mockHandler.handle(invocationOnMock1);

        assertFalse(verifyCalled[0]);
        assertEquals(0, result);
    }

    @Test
    public void testHandle_verificationMode_notMockAware_fallsThrough() throws Throwable {
        List<String> mockList = new ArrayList<String>();
        Invocation invocation = createInvocation(mockList, "size", new Class<?>[0], new Object[0]);

        final boolean[] verifyCalled = new boolean[]{false};
        VerificationMode mode = new VerificationMode() {
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
            }
        };

        mockingProgress.verificationStarted(mode);

        Object result = mockHandler.handle(invocation);

        assertFalse(verifyCalled[0]);
        assertEquals(0, result);
    }
}
