package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.matchers.Equals;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InvocationMatcherTest {

    private static class SampleTarget {
        public void noArgMethod() {}
        public void simpleMethod(String a, int b) {}
        public void simpleMethod(String a, double b) {} // overloaded
        public void differentMethod(String a, int b) {}
        public void varargMethod(String... args) {}
    }

    private static class CapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        private Object captured;

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("capturing");
        }

        @Override
        public void captureFrom(Object argument) {
            this.captured = argument;
        }

        public Object getCaptured() {
            return captured;
        }
    }

    private static class DummyLocation implements Location {
        private final String locationString;

        public DummyLocation(String locationString) {
            this.locationString = locationString;
        }

        @Override
        public String toString() {
            return locationString;
        }
    }

    private Method noArgMethod;
    private Method simpleMethodStringInt;
    private Method simpleMethodStringDouble;
    private Method differentMethod;
    private Method varargMethod;

    @Before
    public void setUp() throws Exception {
        noArgMethod = SampleTarget.class.getMethod("noArgMethod");
        simpleMethodStringInt = SampleTarget.class.getMethod("simpleMethod", String.class, int.class);
        simpleMethodStringDouble = SampleTarget.class.getMethod("simpleMethod", String.class, double.class);
        differentMethod = SampleTarget.class.getMethod("differentMethod", String.class, int.class);
        varargMethod = SampleTarget.class.getMethod("varargMethod", String[].class);
    }

    private Invocation createInvocation(final Object mock, final Method method, final Object[] args, final boolean isVerified, final Location location) {
        return (Invocation) Proxy.newProxyInstance(
                Invocation.class.getClassLoader(),
                new Class<?>[]{Invocation.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method m, Object[] methodArgs) throws Throwable {
                        String name = m.getName();
                        if ("getMock".equals(name)) {
                            return mock;
                        }
                        if ("getMethod".equals(name)) {
                            return method;
                        }
                        if ("getArguments".equals(name) || "getRawArguments".equals(name)) {
                            return args != null ? args : new Object[0];
                        }
                        if ("isVerified".equals(name)) {
                            return isVerified;
                        }
                        if ("getLocation".equals(name)) {
                            return location;
                        }
                        if ("getArgumentAt".equals(name)) {
                            int idx = (Integer) methodArgs[0];
                            Class<?> clazz = (Class<?>) methodArgs[1];
                            if (args != null && idx >= 0 && idx < args.length) {
                                return clazz.cast(args[idx]);
                            }
                            return null;
                        }
                        if ("toString".equals(name)) {
                            return "MockInvocation";
                        }
                        if ("equals".equals(name)) {
                            return proxy == methodArgs[0];
                        }
                        if ("hashCode".equals(name)) {
                            return System.identityHashCode(proxy);
                        }
                        return null;
                    }
                }
        );
    }

    @Test
    public void testConstructor_withEmptyMatchers_createsMatchersFromArguments() {
        Object mock = new Object();
        Object[] args = new Object[]{"hello", 123};
        Invocation invocation = createInvocation(mock, simpleMethodStringInt, args, false, new DummyLocation("loc1"));

        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Assert.assertSame(invocation, matcher.getInvocation());
        Assert.assertEquals(simpleMethodStringInt, matcher.getMethod());
        Assert.assertEquals(2, matcher.getMatchers().size());
    }

    @Test
    public void testConstructor_withExplicitMatchers_usesProvidedMatchers() {
        Object mock = new Object();
        Invocation invocation = createInvocation(mock, simpleMethodStringInt, new Object[]{"hello", 123}, false, new DummyLocation("loc1"));
        List<Matcher> explicitMatchers = Arrays.<Matcher>asList(new Equals("hello"), new Equals(123));

        InvocationMatcher matcher = new InvocationMatcher(invocation, explicitMatchers);

        Assert.assertEquals(explicitMatchers, matcher.getMatchers());
    }

    @Test
    public void testGetLocation_returnsInvocationLocation() {
        Location location = new DummyLocation("at line 42");
        Invocation invocation = createInvocation(new Object(), noArgMethod, new Object[0], false, location);

        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Assert.assertSame(location, matcher.getLocation());
    }

    @Test
    public void testToString_notNullAndNotEmpty() {
        Invocation invocation = createInvocation(new Object(), simpleMethodStringInt, new Object[]{"val", 10}, false, new DummyLocation("loc"));
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        String result = matcher.toString();

        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 0);
    }

    @Test
    public void testMatches_whenMockMethodAndArgumentsMatch_returnsTrue() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg1", 10}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg1", 10}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertTrue(matcher.matches(invocation2));
    }

    @Test
    public void testMatches_whenMockDiffers_returnsFalse() {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Invocation invocation1 = createInvocation(mock1, simpleMethodStringInt, new Object[]{"arg1", 10}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock2, simpleMethodStringInt, new Object[]{"arg1", 10}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.matches(invocation2));
    }

    @Test
    public void testMatches_whenMethodDiffers_returnsFalse() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg1", 10}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, differentMethod, new Object[]{"arg1", 10}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.matches(invocation2));
    }

    @Test
    public void testMatches_whenArgumentsDiffer_returnsFalse() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg1", 10}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringInt, new Object[]{"different", 20}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.matches(invocation2));
    }

    @Test
    public void testHasSameMethod_sameMethod_returnsTrue() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringInt, new Object[]{"other", 2}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertTrue(matcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethod_differentMethodName_returnsFalse() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, differentMethod, new Object[]{"arg", 1}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethod_differentParamTypesSameCount_returnsFalse() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringDouble, new Object[]{"arg", 1.0}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethod_differentParamCount_returnsFalse() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, noArgMethod, new Object[0], false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethod_matchingUnverifiedCandidate_returnsTrue() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringInt, new Object[]{"other", 2}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertTrue(matcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethod_differentMethodName_returnsFalse() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, differentMethod, new Object[]{"arg", 1}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethod_verifiedCandidate_returnsFalse() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, true, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethod_differentMock_returnsFalse() {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Invocation invocation1 = createInvocation(mock1, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock2, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertFalse(matcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethod_overloadedWithDifferentArgs_returnsTrue() {
        Object mock = new Object();
        Invocation invocation1 = createInvocation(mock, simpleMethodStringInt, new Object[]{"arg", 1}, false, new DummyLocation("loc1"));
        Invocation invocation2 = createInvocation(mock, simpleMethodStringDouble, new Object[]{"arg", 2.5}, false, new DummyLocation("loc2"));

        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        Assert.assertTrue(matcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testCaptureArgumentsFrom_nonVarArgs_capturesArgumentsCorrectly() {
        Object mock = new Object();
        Invocation matcherInvocation = createInvocation(mock, simpleMethodStringInt, new Object[]{"val", 123}, false, new DummyLocation("loc1"));
        CapturingMatcher capMatcher1 = new CapturingMatcher();
        CapturingMatcher capMatcher2 = new CapturingMatcher();
        List<Matcher> matchers = Arrays.<Matcher>asList(capMatcher1, capMatcher2);

        InvocationMatcher invocationMatcher = new InvocationMatcher(matcherInvocation, matchers);

        Invocation actualInvocation = createInvocation(mock, simpleMethodStringInt, new Object[]{"capturedValue", 999}, false, new DummyLocation("loc2"));
        invocationMatcher.captureArgumentsFrom(actualInvocation);

        Assert.assertEquals("capturedValue", capMatcher1.getCaptured());
        Assert.assertEquals(999, capMatcher2.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFrom_matcherWithoutCapturesArguments_ignoredSafely() {
        Object mock = new Object();
        Invocation matcherInvocation = createInvocation(mock, simpleMethodStringInt, new Object[]{"val", 123}, false, new DummyLocation("loc1"));
        Matcher regularMatcher = new Equals("val");
        CapturingMatcher capMatcher = new CapturingMatcher();
        List<Matcher> matchers = Arrays.asList(regularMatcher, capMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(matcherInvocation, matchers);

        Invocation actualInvocation = createInvocation(mock, simpleMethodStringInt, new Object[]{"actualVal", 456}, false, new DummyLocation("loc2"));
        invocationMatcher.captureArgumentsFrom(actualInvocation);

        Assert.assertEquals(456, capMatcher.getCaptured());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCaptureArgumentsFrom_varArgs_throwsUnsupportedOperationException() {
        Object mock = new Object();
        Invocation varargInvocation = createInvocation(mock, varargMethod, new Object[]{new String[]{"a", "b"}}, false, new DummyLocation("loc1"));

        InvocationMatcher matcher = new InvocationMatcher(varargInvocation);
        matcher.captureArgumentsFrom(varargInvocation);
    }

    @Test
    public void testCreateFrom_emptyList_returnsEmptyList() {
        List<InvocationMatcher> result = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testCreateFrom_multipleInvocations_returnsListOfMatchers() {
        Object mock = new Object();
        Invocation inv1 = createInvocation(mock, noArgMethod, new Object[0], false, new DummyLocation("loc1"));
        Invocation inv2 = createInvocation(mock, simpleMethodStringInt, new Object[]{"test", 5}, false, new DummyLocation("loc2"));

        List<Invocation> invocations = Arrays.asList(inv1, inv2);
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);

        Assert.assertEquals(2, result.size());
        Assert.assertSame(inv1, result.get(0).getInvocation());
        Assert.assertSame(inv2, result.get(1).getInvocation());
    }

    @Test
    public void testImplementsDescribedInvocation() {
        Invocation invocation = createInvocation(new Object(), noArgMethod, new Object[0], false, new DummyLocation("loc"));
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Assert.assertTrue(matcher instanceof DescribedInvocation);
    }
}
