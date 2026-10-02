package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.reporting.PrintSettings;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class InvocationMatcherTest {

    private interface DummyInterface {
        void simpleMethod();
        void overloadedMethod(String s);
        void overloadedMethod(Integer i);
        void differentMethod();
        void twoArgsMethod(String a, Integer b);
    }

    private static class DummyMockitoMethod implements MockitoMethod {
        private final Method method;

        public DummyMockitoMethod(Method method) {
            this.method = method;
        }

        public String getName() {
            return method != null ? method.getName() : "";
        }

        public Class<?> getReturnType() {
            return method != null ? method.getReturnType() : void.class;
        }

        public Class<?>[] getParameterTypes() {
            return method != null ? method.getParameterTypes() : new Class<?>[0];
        }

        public Class<?>[] getExceptionTypes() {
            return method != null ? method.getExceptionTypes() : new Class<?>[0];
        }

        public boolean isVarArgs() {
            return method != null && method.isVarArgs();
        }

        public Method getJavaMethod() {
            return method;
        }
    }

    private static class DummyRealMethod implements org.mockito.internal.invocation.realmethod.RealMethod {
        public Object invoke(Object target, Object[] arguments) throws Throwable {
            return null;
        }
    }

    private static class DummyInvocation extends Invocation {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;
        private final boolean verified;
        private final Location location;

        public DummyInvocation(Object mock, Method method, Object[] arguments, boolean verified) {
            super(mock, new DummyMockitoMethod(method), arguments != null ? arguments : new Object[0], 1, new DummyRealMethod());
            this.mock = mock;
            this.method = method;
            this.arguments = arguments != null ? arguments : new Object[0];
            this.verified = verified;
            this.location = new LocationImpl();
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        @Override
        public boolean isVerified() {
            return verified;
        }

        @Override
        public Location getLocation() {
            return location;
        }

        @Override
        public List<Matcher> argumentsToMatchers() {
            List<Matcher> list = new ArrayList<Matcher>();
            for (Object arg : arguments) {
                list.add(new Equals(arg));
            }
            return list;
        }

        @Override
        public String toString(List<Matcher> matchers, PrintSettings printSettings) {
            return "dummyInvocationToString";
        }
    }

    private static class DummyCapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        private Object captured;

        public boolean matches(Object item) {
            return true;
        }

        public void describeTo(Description description) {
            description.appendText("capturingMatcher");
        }

        public void captureFrom(Object argument) {
            this.captured = argument;
        }

        public Object getCaptured() {
            return captured;
        }
    }

    private static class ExceptionThrowingMatcher extends BaseMatcher<Object> {
        public boolean matches(Object item) {
            throw new RuntimeException("Forced exception in matcher");
        }

        public void describeTo(Description description) {
            description.appendText("exceptionThrowingMatcher");
        }
    }

    private Object mockObject1;
    private Object mockObject2;
    private Method simpleMethod;
    private Method overloadedStringMethod;
    private Method overloadedIntegerMethod;
    private Method differentMethod;
    private Method twoArgsMethod;

    @Before
    public void setUp() throws Exception {
        mockObject1 = new Object();
        mockObject2 = new Object();
        simpleMethod = DummyInterface.class.getMethod("simpleMethod");
        overloadedStringMethod = DummyInterface.class.getMethod("overloadedMethod", String.class);
        overloadedIntegerMethod = DummyInterface.class.getMethod("overloadedMethod", Integer.class);
        differentMethod = DummyInterface.class.getMethod("differentMethod");
        twoArgsMethod = DummyInterface.class.getMethod("twoArgsMethod", String.class, Integer.class);
    }

    @Test
    public void testConstructor_withEmptyMatchers_createsMatchersFromInvocation() {
        Invocation invocation = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"test"}, false);
        InvocationMatcher matcher = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());

        assertEquals(1, matcher.getMatchers().size());
        assertEquals(invocation, matcher.getInvocation());
        assertEquals(overloadedStringMethod, matcher.getMethod());
    }

    @Test
    public void testConstructor_withExplicitMatchers_usesProvidedMatchers() {
        Invocation invocation = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"test"}, false);
        List<Matcher> matchers = Arrays.<Matcher>asList(new IsEqual<String>("custom"));
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        assertEquals(matchers, matcher.getMatchers());
    }

    @Test
    public void testConstructor_singleArg_createsMatchersFromInvocation() {
        Invocation invocation = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"test"}, false);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertEquals(1, matcher.getMatchers().size());
        assertEquals(invocation, matcher.getInvocation());
    }

    @Test
    public void testGetLocation_returnsInvocationLocation() {
        Invocation invocation = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertNotNull(matcher.getLocation());
        assertEquals(invocation.getLocation(), matcher.getLocation());
    }

    @Test
    public void testToString_returnsInvocationFormattedString() {
        Invocation invocation = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertEquals("dummyInvocationToString", matcher.toString());
        assertEquals("dummyInvocationToString", matcher.toString(new PrintSettings()));
    }

    @Test
    public void testMatches_matchingInvocation_returnsTrue() {
        Invocation wanted = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"hello"}, false);
        Invocation actual = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"hello"}, false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertTrue(matcher.matches(actual));
    }

    @Test
    public void testMatches_differentMock_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"hello"}, false);
        Invocation actual = new DummyInvocation(mockObject2, overloadedStringMethod, new Object[]{"hello"}, false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testMatches_differentMethod_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"hello"}, false);
        Invocation actual = new DummyInvocation(mockObject1, differentMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testMatches_differentArguments_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"hello"}, false);
        Invocation actual = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"world"}, false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testHasSameMethod_sameMethod_returnsTrue() {
        Invocation wanted = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation actual = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertTrue(matcher.hasSameMethod(actual));
    }

    @Test
    public void testHasSameMethod_differentMethod_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation actual = new DummyInvocation(mockObject1, differentMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.hasSameMethod(actual));
    }

    @Test
    public void testHasSimilarMethod_differentMethodName_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = new DummyInvocation(mockObject1, differentMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_candidateIsVerified_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = new DummyInvocation(mockObject1, simpleMethod, new Object[0], true);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_differentMock_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = new DummyInvocation(mockObject2, simpleMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_sameMethodUnverifiedSameMock_returnsTrue() {
        Invocation wanted = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        Invocation candidate = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_overloadedMethodWithDifferentArguments_returnsTrue() {
        Invocation wanted = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"text"}, false);
        Invocation candidate = new DummyInvocation(mockObject1, overloadedIntegerMethod, new Object[]{123}, false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_overloadedMethodWithMatchingArguments_returnsFalse() {
        Invocation wanted = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{null}, false);
        Invocation candidate = new DummyInvocation(mockObject1, overloadedIntegerMethod, new Object[]{null}, false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_safelyArgumentsMatchHandlesException_returnsTrue() {
        Invocation wanted = new DummyInvocation(mockObject1, overloadedStringMethod, new Object[]{"text"}, false);
        Invocation candidate = new DummyInvocation(mockObject1, overloadedIntegerMethod, new Object[]{123}, false);
        InvocationMatcher matcher = new InvocationMatcher(wanted, Arrays.<Matcher>asList(new ExceptionThrowingMatcher()));

        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testCaptureArgumentsFrom_capturesArgumentsForCapturingMatchers() {
        DummyCapturingMatcher capturingMatcher = new DummyCapturingMatcher();
        Matcher regularMatcher = new Equals(42);

        Invocation wanted = new DummyInvocation(mockObject1, twoArgsMethod, new Object[]{"val", 42}, false);
        InvocationMatcher matcher = new InvocationMatcher(wanted, Arrays.asList(capturingMatcher, regularMatcher));

        Invocation actual = new DummyInvocation(mockObject1, twoArgsMethod, new Object[]{"capturedValue", 42}, false);
        matcher.captureArgumentsFrom(actual);

        assertEquals("capturedValue", capturingMatcher.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFrom_withEmptyArguments_doesNotThrow() {
        Invocation wanted = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        Invocation actual = new DummyInvocation(mockObject1, simpleMethod, new Object[0], false);
        matcher.captureArgumentsFrom(actual);
    }
}
