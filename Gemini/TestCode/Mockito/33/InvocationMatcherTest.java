package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.reporting.PrintSettings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class InvocationMatcherTest {

    private Method simpleMethod;
    private Method overloadedStringMethod;
    private Method overloadedIntMethod;
    private Method returningMethod;
    private Method anotherMethod;

    private Object mockObject1;
    private Object mockObject2;

    interface SampleInterface {
        void simpleMethod();
        void overloadedMethod(String arg);
        void overloadedMethod(Integer arg);
        String returningMethod(String input);
        void anotherMethod();
    }

    static class SimpleMatcher extends BaseMatcher<Object> {
        private final Object expected;

        SimpleMatcher(Object expected) {
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            return expected == null ? item == null : expected.equals(item);
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(String.valueOf(expected));
        }
    }

    static class ThrowingMatcher extends BaseMatcher<Object> {
        @Override
        public boolean matches(Object item) {
            throw new RuntimeException("Simulated matching error");
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("throwing matcher");
        }
    }

    static class CapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        private Object captured;

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("capturing matcher");
        }

        @Override
        public void captureFrom(Object argument) {
            this.captured = argument;
        }

        public Object getCaptured() {
            return captured;
        }
    }

    @Before
    public void setUp() throws Exception {
        simpleMethod = SampleInterface.class.getMethod("simpleMethod");
        overloadedStringMethod = SampleInterface.class.getMethod("overloadedMethod", String.class);
        overloadedIntMethod = SampleInterface.class.getMethod("overloadedMethod", Integer.class);
        returningMethod = SampleInterface.class.getMethod("returningMethod", String.class);
        anotherMethod = SampleInterface.class.getMethod("anotherMethod");

        mockObject1 = new Object();
        mockObject2 = new Object();
    }

    private Invocation createDummyInvocation(final Object mock, final Method method, final Object[] args, final boolean verified) {
        if (Invocation.class.isInterface()) {
            InvocationHandler handler = new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method m, Object[] mArgs) {
                    String name = m.getName();
                    if ("getMock".equals(name)) return mock;
                    if ("getMethod".equals(name)) return method;
                    if ("getArguments".equals(name)) return args != null ? args : new Object[0];
                    if ("getRawArguments".equals(name)) return args != null ? args : new Object[0];
                    if ("isVerified".equals(name)) return verified;
                    if ("getLocation".equals(name)) return new Location();
                    if ("argumentsToMatchers".equals(name)) {
                        List<Matcher> matchers = new ArrayList<Matcher>();
                        if (args != null) {
                            for (Object a : args) {
                                matchers.add(new SimpleMatcher(a));
                            }
                        }
                        return matchers;
                    }
                    if ("toString".equals(name)) {
                        return "mock." + (method != null ? method.getName() : "unknown") + "()";
                    }
                    if ("equals".equals(name)) return proxy == mArgs[0];
                    if ("hashCode".equals(name)) return System.identityHashCode(proxy);
                    return null;
                }
            };
            return (Invocation) Proxy.newProxyInstance(Invocation.class.getClassLoader(), new Class<?>[]{Invocation.class}, handler);
        } else {
            for (Constructor<?> c : Invocation.class.getConstructors()) {
                c.setAccessible(true);
                Class<?>[] pTypes = c.getParameterTypes();
                try {
                    Object[] params = new Object[pTypes.length];
                    for (int i = 0; i < pTypes.length; i++) {
                        if (pTypes[i] == Object.class) {
                            params[i] = mock;
                        } else if (pTypes[i] == Method.class) {
                            params[i] = method;
                        } else if (pTypes[i].getSimpleName().equals("MockitoMethod")) {
                            params[i] = createMockitoMethod(method);
                        } else if (pTypes[i] == Object[].class) {
                            params[i] = args != null ? args : new Object[0];
                        } else if (pTypes[i] == int.class || pTypes[i] == Integer.class) {
                            params[i] = 1;
                        } else if (pTypes[i].getSimpleName().equals("RealMethod")) {
                            params[i] = createRealMethod();
                        } else if (pTypes[i].getSimpleName().equals("Location")) {
                            params[i] = new Location();
                        }
                    }
                    Invocation inv = (Invocation) c.newInstance(params);
                    if (verified) {
                        try {
                            Method markVerified = Invocation.class.getMethod("markVerified");
                            markVerified.invoke(inv);
                        } catch (Exception ignored) {}
                    }
                    return inv;
                } catch (Exception ignored) {
                }
            }
            throw new IllegalStateException("Unable to construct dummy Invocation instance");
        }
    }

    private Object createMockitoMethod(final Method method) {
        try {
            Class<?> mmClass = Class.forName("org.mockito.internal.invocation.MockitoMethod");
            return Proxy.newProxyInstance(mmClass.getClassLoader(), new Class<?>[]{mmClass}, new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method m, Object[] args) {
                    if ("getJavaMethod".equals(m.getName()) || "getMethod".equals(m.getName())) return method;
                    if ("getName".equals(m.getName())) return method.getName();
                    if ("getReturnType".equals(m.getName())) return method.getReturnType();
                    if ("getParameterTypes".equals(m.getName())) return method.getParameterTypes();
                    if ("isVarArgs".equals(m.getName())) return method.isVarArgs();
                    if ("getExceptionTypes".equals(m.getName())) return method.getExceptionTypes();
                    return null;
                }
            });
        } catch (Exception e) {
            return null;
        }
    }

    private Object createRealMethod() {
        try {
            Class<?> rmClass = Class.forName("org.mockito.internal.invocation.realmethod.RealMethod");
            return Proxy.newProxyInstance(rmClass.getClassLoader(), new Class<?>[]{rmClass}, new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method m, Object[] args) {
                    return null;
                }
            });
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    public void testConstructor_withEmptyMatchersList_derivesMatchersFromInvocation() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"hello"}, false);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());

        assertNotNull(invocationMatcher.getMatchers());
        assertEquals(1, invocationMatcher.getMatchers().size());
        assertEquals(returningMethod, invocationMatcher.getMethod());
        assertEquals(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testConstructor_withExplicitMatchersList_retainsProvidedMatchers() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"hello"}, false);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new SimpleMatcher("custom"));

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);

        assertSame(matchers, invocationMatcher.getMatchers());
        assertEquals(1, invocationMatcher.getMatchers().size());
    }

    @Test
    public void testConstructor_singleArgument_usesEmptyMatchersAndDerives() {
        Invocation invocation = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        assertEquals(invocation, invocationMatcher.getInvocation());
        assertEquals(simpleMethod, invocationMatcher.getMethod());
        assertNotNull(invocationMatcher.getMatchers());
        assertTrue(invocationMatcher.getMatchers().isEmpty());
    }

    @Test
    public void testGetLocation_returnsInvocationLocation() {
        Invocation invocation = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        assertNotNull(invocationMatcher.getLocation());
    }

    @Test
    public void testToString_returnsNonEmptyString() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"value"}, false);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        String result = invocationMatcher.toString();
        assertNotNull(result);
        assertTrue(result.contains("returningMethod"));
    }

    @Test
    public void testToStringWithPrintSettings_returnsNonEmptyString() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"value"}, false);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        PrintSettings settings = new PrintSettings();

        String result = invocationMatcher.toString(settings);
        assertNotNull(result);
        assertTrue(result.contains("returningMethod"));
    }

    @Test
    public void testMatches_sameMockSameMethodSameArgs_returnsTrue() {
        Invocation wanted = createDummyInvocation(mockObject1, returningMethod, new Object[]{"match"}, false);
        Invocation actual = createDummyInvocation(mockObject1, returningMethod, new Object[]{"match"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertTrue(invocationMatcher.matches(actual));
    }

    @Test
    public void testMatches_differentMock_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, returningMethod, new Object[]{"match"}, false);
        Invocation actual = createDummyInvocation(mockObject2, returningMethod, new Object[]{"match"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.matches(actual));
    }

    @Test
    public void testMatches_differentMethod_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, returningMethod, new Object[]{"match"}, false);
        Invocation actual = createDummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"match"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.matches(actual));
    }

    @Test
    public void testMatches_differentArgs_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, returningMethod, new Object[]{"expected"}, false);
        Invocation actual = createDummyInvocation(mockObject1, returningMethod, new Object[]{"different"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.matches(actual));
    }

    @Test
    public void testMatches_withNullAndEmptyArgs_handlesGracefully() {
        Invocation wanted = createDummyInvocation(mockObject1, returningMethod, new Object[]{null}, false);
        Invocation actual = createDummyInvocation(mockObject1, returningMethod, new Object[]{null}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertTrue(invocationMatcher.matches(actual));

        Invocation actualNonNull = createDummyInvocation(mockObject1, returningMethod, new Object[]{"non-null"}, false);
        assertFalse(invocationMatcher.matches(actualNonNull));
    }

    @Test
    public void testHasSameMethod_sameMethod_returnsTrue() {
        Invocation wanted = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation actual = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertTrue(invocationMatcher.hasSameMethod(actual));
    }

    @Test
    public void testHasSameMethod_differentMethod_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation actual = createDummyInvocation(mockObject1, anotherMethod, new Object[0], false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.hasSameMethod(actual));
    }

    @Test
    public void testHasSimilarMethod_differentMethodName_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = createDummyInvocation(mockObject1, anotherMethod, new Object[0], false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_candidateIsVerified_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = createDummyInvocation(mockObject1, simpleMethod, new Object[0], true);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_differentMock_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = createDummyInvocation(mockObject2, simpleMethod, new Object[0], false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_sameMethodAndUnverified_returnsTrue() {
        Invocation wanted = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertTrue(invocationMatcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_overloadedMethodWithSameMatchingArgs_returnsFalse() {
        Invocation wanted = createDummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"test"}, false);
        Invocation candidate = createDummyInvocation(mockObject1, overloadedIntMethod, new Object[]{"test"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertFalse(invocationMatcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_overloadedMethodWithDifferentArgs_returnsTrue() {
        Invocation wanted = createDummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"test"}, false);
        Invocation candidate = createDummyInvocation(mockObject1, overloadedIntMethod, new Object[]{123}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted);
        assertTrue(invocationMatcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_whenSafelyArgumentsMatchThrowsThrowable_returnsTrue() {
        Invocation wanted = createDummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"test"}, false);
        Invocation candidate = createDummyInvocation(mockObject1, overloadedIntMethod, new Object[]{123}, false);

        List<Matcher> throwingMatchers = new ArrayList<Matcher>();
        throwingMatchers.add(new ThrowingMatcher());

        InvocationMatcher invocationMatcher = new InvocationMatcher(wanted, throwingMatchers);
        assertTrue(invocationMatcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testCaptureArgumentsFrom_withCapturingMatcherAndSufficientArgs_capturesArgument() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"target"}, false);
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);

        Invocation candidate = createDummyInvocation(mockObject1, returningMethod, new Object[]{"captured_value"}, false);
        invocationMatcher.captureArgumentsFrom(candidate);

        assertEquals("captured_value", capturingMatcher.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFrom_withNonCapturingMatcher_doesNothing() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"target"}, false);
        SimpleMatcher simpleMatcher = new SimpleMatcher("target");
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(simpleMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);

        Invocation candidate = createDummyInvocation(mockObject1, returningMethod, new Object[]{"new_value"}, false);
        invocationMatcher.captureArgumentsFrom(candidate);
    }

    @Test
    public void testCaptureArgumentsFrom_whenCandidateHasFewerArguments_doesNotThrow() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"arg1", "arg2"}, false);
        CapturingMatcher matcher1 = new CapturingMatcher();
        CapturingMatcher matcher2 = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(matcher1);
        matchers.add(matcher2);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);

        Invocation candidateWithOnlyOneArg = createDummyInvocation(mockObject1, returningMethod, new Object[]{"only_one"}, false);
        invocationMatcher.captureArgumentsFrom(candidateWithOnlyOneArg);

        assertEquals("only_one", matcher1.getCaptured());
        assertNull(matcher2.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFrom_whenCandidateHasEmptyArguments_doesNotThrow() {
        Invocation invocation = createDummyInvocation(mockObject1, returningMethod, new Object[]{"arg1"}, false);
        CapturingMatcher matcher = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(matcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);

        Invocation candidateEmpty = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        invocationMatcher.captureArgumentsFrom(candidateEmpty);

        assertNull(matcher.getCaptured());
    }

    @Test
    public void testCreateFrom_emptyList_returnsEmptyList() {
        List<Invocation> emptyInvocations = Collections.emptyList();
        List<InvocationMatcher> result = InvocationMatcher.createFrom(emptyInvocations);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCreateFrom_multipleInvocations_returnsListOfInvocationMatchers() {
        Invocation inv1 = createDummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation inv2 = createDummyInvocation(mockObject1, returningMethod, new Object[]{"test"}, false);

        List<Invocation> invocations = Arrays.asList(inv1, inv2);
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertSame(inv1, result.get(0).getInvocation());
        assertSame(inv2, result.get(1).getInvocation());
    }
}
