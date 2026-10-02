package org.mockito.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

public class MockHandlerTest {

    private MockHandler<Object> mockHandler;
    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
        mockHandler = new MockHandler<Object>(mockSettings);
        new ThreadSafeMockingProgress().reset();
    }

    private Invocation createInvocation(final Object mock, String methodName, final Object[] args) throws Exception {
        final Method targetMethod = mock.getClass().getMethod(methodName);

        for (Constructor<?> constructor : Invocation.class.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 5) {
                Object mockitoMethodArg = null;
                if (parameterTypes[1].equals(Method.class)) {
                    mockitoMethodArg = targetMethod;
                } else if (parameterTypes[1].isInterface()) {
                    mockitoMethodArg = Proxy.newProxyInstance(
                            getClass().getClassLoader(),
                            new Class<?>[]{parameterTypes[1]},
                            new InvocationHandler() {
                                public Object invoke(Object proxy, Method m, Object[] a) throws Throwable {
                                    if (m.getName().equals("getName")) return targetMethod.getName();
                                    if (m.getName().equals("getReturnType")) return targetMethod.getReturnType();
                                    if (m.getName().equals("getParameterTypes")) return targetMethod.getParameterTypes();
                                    if (m.getName().equals("getExceptionTypes")) return targetMethod.getExceptionTypes();
                                    if (m.getName().equals("isVarArgs")) return targetMethod.isVarArgs();
                                    if (m.getName().equals("getJavaMethod")) return targetMethod;
                                    if (m.getName().equals("equals")) return proxy == a[0];
                                    if (m.getName().equals("hashCode")) return targetMethod.hashCode();
                                    if (m.getName().equals("toString")) return targetMethod.toString();
                                    return null;
                                }
                            }
                    );
                } else {
                    try {
                        Constructor<?> smCons = parameterTypes[1].getConstructor(Method.class);
                        mockitoMethodArg = smCons.newInstance(targetMethod);
                    } catch (Exception ignored) {
                    }
                }

                Object realMethodArg = null;
                if (parameterTypes[4].isInterface()) {
                    realMethodArg = Proxy.newProxyInstance(
                            getClass().getClassLoader(),
                            new Class<?>[]{parameterTypes[4]},
                            new InvocationHandler() {
                                public Object invoke(Object proxy, Method m, Object[] a) throws Throwable {
                                    return null;
                                }
                            }
                    );
                }

                try {
                    return (Invocation) constructor.newInstance(mock, mockitoMethodArg, args, 1, realMethodArg);
                } catch (Exception ignored) {
                }
            }
        }
        throw new IllegalStateException("Failed to construct Invocation instance for testing");
    }

    @SuppressWarnings("unchecked")
    private Answer<Object> createAnswer(final Object returnValue, final Throwable throwableToThrow) {
        return (Answer<Object>) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Answer.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("answer")) {
                            if (throwableToThrow != null) {
                                throw throwableToThrow;
                            }
                            return returnValue;
                        }
                        return null;
                    }
                }
        );
    }

    @Test
    public void testDefaultConstructor_createsValidInstance() {
        MockHandler<Object> defaultHandler = new MockHandler<Object>();
        assertNotNull(defaultHandler.getMockSettings());
        assertNotNull(defaultHandler.getInvocationContainer());
    }

    @Test
    public void testConstructor_withMockSettings_initializesCorrectly() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<String> handler = new MockHandler<String>(settings);
        assertSame(settings, handler.getMockSettings());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testConstructor_withOldMockHandler_copiesSettings() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<String> oldHandler = new MockHandler<String>(settings);
        MockHandler<String> newHandler = new MockHandler<String>(oldHandler);
        assertSame(settings, newHandler.getMockSettings());
    }

    @Test
    public void testGetInvocationContainer_returnsNonNullContainer() {
        InvocationContainer container = mockHandler.getInvocationContainer();
        assertNotNull(container);
    }

    @Test
    public void testGetMockSettings_returnsConfiguredSettings() {
        assertSame(mockSettings, mockHandler.getMockSettings());
    }

    @Test
    public void testVoidMethodStubbable_returnsNonNullStubbingObject() {
        Object mockObject = new Object();
        VoidMethodStubbable<Object> stubbable = mockHandler.voidMethodStubbable(mockObject);
        assertNotNull(stubbable);
    }

    @Test
    public void testSetAnswersForStubbing_withEmptyList_doesNotThrow() {
        mockHandler.setAnswersForStubbing(Collections.<Answer>emptyList());
        assertNotNull(mockHandler.getInvocationContainer());
    }

    @Test
    public void testHandle_hasAnswersForStubbing_bindsMethodAndReturnsNull() throws Throwable {
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("stubbedValue", null));
        mockHandler.setAnswersForStubbing(answers);

        Object mock = new Object();
        Invocation invocation = createInvocation(mock, "toString", new Object[0]);

        Object result = mockHandler.handle(invocation);
        assertNull("handle should return null when setting method for stubbing", result);

        Object secondResult = mockHandler.handle(invocation);
        assertEquals("stubbedValue", secondResult);
    }

    @Test
    public void testHandle_withVerificationMode_callsVerifyAndReturnsNull() throws Throwable {
        final boolean[] verifyCalled = new boolean[]{false};
        VerificationMode mode = (VerificationMode) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{VerificationMode.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("verify")) {
                            verifyCalled[0] = true;
                        }
                        return null;
                    }
                }
        );

        mockHandler.mockingProgress.verificationStarted(mode);

        Object mock = new Object();
        Invocation invocation = createInvocation(mock, "toString", new Object[0]);

        Object result = mockHandler.handle(invocation);
        assertNull(result);
        assertTrue("VerificationMode.verify should have been called", verifyCalled[0]);
    }

    @Test
    public void testHandle_defaultAnswer_returnsDefaultValueWhenNotStubbed() throws Throwable {
        mockSettings.defaultAnswer(createAnswer("defaultAnswerResult", null));
        MockHandler<Object> customHandler = new MockHandler<Object>(mockSettings);

        Object mock = new Object();
        Invocation invocation = createInvocation(mock, "toString", new Object[0]);

        Object result = customHandler.handle(invocation);
        assertEquals("defaultAnswerResult", result);
    }

    @Test
    public void testHandle_stubbedAnswer_throwsThrowableWhenAnswerThrows() throws Throwable {
        IllegalArgumentException expectedException = new IllegalArgumentException("Stubbed error");
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer(null, expectedException));
        mockHandler.setAnswersForStubbing(answers);

        Object mock = new Object();
        Invocation invocation = createInvocation(mock, "toString", new Object[0]);

        mockHandler.handle(invocation); // Bind stubbing

        try {
            mockHandler.handle(invocation);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertSame(expectedException, e);
        }
    }

    @Test
    public void testHandle_nullInvocation_throwsNullPointerException() {
        try {
            mockHandler.handle(null);
            fail("Expected NullPointerException when invocation is null");
        } catch (NullPointerException expected) {
            // Success
        } catch (Throwable t) {
            fail("Unexpected exception: " + t);
        }
    }
}
