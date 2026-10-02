package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;
import org.mockito.invocation.StubInfo;

import java.lang.reflect.Method;
import java.util.*;

public class InvocationMatcherTest {

    private SampleService sampleMock;
    private SampleService otherMock;
    private Method simpleMethod;
    private Method methodWithArgs;
    private Method overloadedMethod;
    private Method diffNameMethod;
    private Method varargMethod;

    public interface SampleService {
        void simple();
        void doWork(String a, Integer b);
        void doWork(String a);
        void different(String a, Integer b);
        void varargs(String prefix, String... items);
    }

    private static class DummyLocation implements Location {
        private final String locationText;

        public DummyLocation(String locationText) {
            this.locationText = locationText;
        }

        public String toString() {
            return locationText;
        }
    }

    private static class DummyInvocation implements Invocation {
        private final Object mock;
        private final Method method;
        private final Object[] rawArguments;
        private final Object[] arguments;
        private final Location location;
        private boolean verified;

        public DummyInvocation(Object mock, Method method, Object[] rawArguments, Object[] arguments, Location location, boolean verified) {
            this.mock = mock;
            this.method = method;
            this.rawArguments = rawArguments != null ? rawArguments : new Object[0];
            this.arguments = arguments != null ? arguments : new Object[0];
            this.location = location;
            this.verified = verified;
        }

        public DummyInvocation(Object mock, Method method, Object[] arguments) {
            this(mock, method, arguments, arguments, new DummyLocation("at line 1"), false);
        }

        @Override
        public int getSequenceNumber() {
            return 1;
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
        public Object[] getRawArguments() {
            return rawArguments;
        }

        @Override
        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return clazz.cast(arguments[index]);
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
        public StubInfo getStubInfo() {
            return null;
        }

        @Override
        public void markVerified() {
            this.verified = true;
        }

        @Override
        public boolean isIgnoredForVerification() {
            return false;
        }

        @Override
        public void ignoreForVerification() {
        }

        @Override
        public void markStubbed(StubInfo stubInfo) {
        }
    }

    private static class DummyCapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        private final List<Object> captured = new ArrayList<Object>();
        private final Object expected;

        public DummyCapturingMatcher(Object expected) {
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            if (expected == null) {
                return item == null;
            }
            return expected.equals(item);
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(String.valueOf(expected));
        }

        @Override
        public void captureFrom(Object argument) {
            captured.add(argument);
        }

        public List<Object> getCaptured() {
            return captured;
        }
    }

    private static class SimpleMatcher extends BaseMatcher<Object> {
        private final Object expected;

        public SimpleMatcher(Object expected) {
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

    @Before
    public void setUp() throws Exception {
        sampleMock = new SampleService() {
            public void simple() {}
            public void doWork(String a, Integer b) {}
            public void doWork(String a) {}
            public void different(String a, Integer b) {}
            public void varargs(String prefix, String... items) {}
        };
        otherMock = new SampleService() {
            public void simple() {}
            public void doWork(String a, Integer b) {}
            public void doWork(String a) {}
            public void different(String a, Integer b) {}
            public void varargs(String prefix, String... items) {}
        };

        simpleMethod = SampleService.class.getMethod("simple");
        methodWithArgs = SampleService.class.getMethod("doWork", String.class, Integer.class);
        overloadedMethod = SampleService.class.getMethod("doWork", String.class);
        diffNameMethod = SampleService.class.getMethod("different", String.class, Integer.class);
        varargMethod = SampleService.class.getMethod("varargs", String.class, String[].class);
    }

    @Test
    public void testConstructor_withEmptyMatchers_convertsArgumentsToMatchers() {
        Invocation invocation = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"test", 10});
        InvocationMatcher matcher = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());

        Assert.assertEquals(2, matcher.getMatchers().size());
        Assert.assertEquals(invocation, matcher.getInvocation());
        Assert.assertEquals(methodWithArgs, matcher.getMethod());
    }

    @Test
    public void testConstructor_withExplicitMatchers() {
        Invocation invocation = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"test", 10});
        List<Matcher> matchers = Arrays.<Matcher>asList(new SimpleMatcher("test"), new SimpleMatcher(10));
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        Assert.assertEquals(matchers, matcher.getMatchers());
        Assert.assertEquals(invocation, matcher.getInvocation());
    }

    @Test
    public void testConstructor_singleInvocation_initializesCorrectly() {
        Invocation invocation = new DummyInvocation(sampleMock, simpleMethod, new Object[0]);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Assert.assertTrue(matcher.getMatchers().isEmpty());
        Assert.assertEquals(simpleMethod, matcher.getMethod());
        Assert.assertEquals(invocation, matcher.getInvocation());
    }

    @Test
    public void testGetLocation_returnsInvocationLocation() {
        Location loc = new DummyLocation("location A");
        Invocation invocation = new DummyInvocation(sampleMock, simpleMethod, new Object[0], new Object[0], loc, false);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Assert.assertEquals(loc, matcher.getLocation());
    }

    @Test
    public void testToString_returnsNonEmptyString() {
        Invocation invocation = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"hello", 123});
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        String result = matcher.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("doWork"));
    }

    @Test
    public void testMatches_sameInvocation_returnsTrue() {
        Invocation invocation = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"hello", 123});
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Invocation actual = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"hello", 123});
        Assert.assertTrue(matcher.matches(actual));
    }

    @Test
    public void testMatches_differentMock_returnsFalse() {
        Invocation invocation = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"hello", 123});
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Invocation actual = new DummyInvocation(otherMock, methodWithArgs, new Object[]{"hello", 123});
        Assert.assertFalse(matcher.matches(actual));
    }

    @Test
    public void testMatches_differentMethod_returnsFalse() {
        Invocation invocation = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"hello", 123});
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Invocation actual = new DummyInvocation(sampleMock, diffNameMethod, new Object[]{"hello", 123});
        Assert.assertFalse(matcher.matches(actual));
    }

    @Test
    public void testMatches_differentArguments_returnsFalse() {
        Invocation invocation = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"hello", 123});
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Invocation actual = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"hello", 999});
        Assert.assertFalse(matcher.matches(actual));
    }

    @Test
    public void testHasSameMethod_sameMethodSameParams_returnsTrue() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        Invocation inv2 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"b", 2});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertTrue(matcher.hasSameMethod(inv2));
    }

    @Test
    public void testHasSameMethod_differentName_returnsFalse() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        Invocation inv2 = new DummyInvocation(sampleMock, diffNameMethod, new Object[]{"a", 1});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertFalse(matcher.hasSameMethod(inv2));
    }

    @Test
    public void testHasSameMethod_differentParameterLength_returnsFalse() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        Invocation inv2 = new DummyInvocation(sampleMock, overloadedMethod, new Object[]{"a"});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertFalse(matcher.hasSameMethod(inv2));
    }

    @Test
    public void testHasSameMethod_differentParameterTypes_returnsFalse() throws Exception {
        class ParamTest {
            public void test(String s) {}
            public void test(Integer i) {}
        }
        Method m1 = ParamTest.class.getMethod("test", String.class);
        Method m2 = ParamTest.class.getMethod("test", Integer.class);

        Invocation inv1 = new DummyInvocation(sampleMock, m1, new Object[]{"str"});
        Invocation inv2 = new DummyInvocation(sampleMock, m2, new Object[]{1});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertFalse(matcher.hasSameMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_matchingCandidate_returnsTrue() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        Invocation inv2 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"b", 2});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertTrue(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_differentMethodName_returnsFalse() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        Invocation inv2 = new DummyInvocation(sampleMock, diffNameMethod, new Object[]{"a", 1});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertFalse(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_candidateIsVerified_returnsFalse() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        DummyInvocation inv2 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        inv2.markVerified();
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertFalse(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_differentMock_returnsFalse() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        Invocation inv2 = new DummyInvocation(otherMock, methodWithArgs, new Object[]{"a", 1});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertFalse(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_overloadedWithDifferentSignature_notMatchingArgs_returnsTrue() {
        Invocation inv1 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        Invocation inv2 = new DummyInvocation(sampleMock, overloadedMethod, new Object[]{"a"});
        InvocationMatcher matcher = new InvocationMatcher(inv1);

        Assert.assertTrue(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testCaptureArgumentsFrom_nonVarArgs() {
        DummyCapturingMatcher m1 = new DummyCapturingMatcher("a");
        DummyCapturingMatcher m2 = new DummyCapturingMatcher(10);
        List<Matcher> matchers = Arrays.<Matcher>asList(m1, m2);

        Invocation wanted = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 10});
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        Invocation actual = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"capturedValue", 99});
        matcher.captureArgumentsFrom(actual);

        Assert.assertEquals(1, m1.getCaptured().size());
        Assert.assertEquals("capturedValue", m1.getCaptured().get(0));
        Assert.assertEquals(1, m2.getCaptured().size());
        Assert.assertEquals(99, m2.getCaptured().get(0));
    }

    @Test
    public void testCaptureArgumentsFrom_varArgs() {
        DummyCapturingMatcher prefixMatcher = new DummyCapturingMatcher("prefix");
        DummyCapturingMatcher varargMatcher1 = new DummyCapturingMatcher("val1");
        DummyCapturingMatcher varargMatcher2 = new DummyCapturingMatcher("val2");

        List<Matcher> matchers = Arrays.<Matcher>asList(prefixMatcher, varargMatcher1, varargMatcher2);

        Object[] rawArgs = new Object[]{"prefix", "val1", "val2"};
        Object[] flatArgs = new Object[]{"prefix", new String[]{"val1", "val2"}};
        Invocation wanted = new DummyInvocation(sampleMock, varargMethod, rawArgs, flatArgs, new DummyLocation("loc"), false);
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        Invocation actual = new DummyInvocation(sampleMock, varargMethod, rawArgs, flatArgs, new DummyLocation("loc"), false);
        matcher.captureArgumentsFrom(actual);

        Assert.assertEquals(1, prefixMatcher.getCaptured().size());
        Assert.assertEquals("prefix", prefixMatcher.getCaptured().get(0));
        Assert.assertEquals(1, varargMatcher1.getCaptured().size());
        Assert.assertEquals("val1", varargMatcher1.getCaptured().get(0));
        Assert.assertEquals(1, varargMatcher2.getCaptured().size());
        Assert.assertEquals("val2", varargMatcher2.getCaptured().get(0));
    }

    @Test
    public void testCaptureArgumentsFrom_matcherNotCapturesArguments() {
        SimpleMatcher simpleMatcher = new SimpleMatcher("test");
        List<Matcher> matchers = Arrays.<Matcher>asList(simpleMatcher);

        Invocation wanted = new DummyInvocation(sampleMock, overloadedMethod, new Object[]{"test"});
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        Invocation actual = new DummyInvocation(sampleMock, overloadedMethod, new Object[]{"actualValue"});
        matcher.captureArgumentsFrom(actual);
        // Should complete without throwing exceptions
    }

    @Test
    public void testCreateFrom_convertsInvocationsList() {
        Invocation inv1 = new DummyInvocation(sampleMock, simpleMethod, new Object[0]);
        Invocation inv2 = new DummyInvocation(sampleMock, methodWithArgs, new Object[]{"a", 1});
        List<Invocation> invocations = Arrays.asList(inv1, inv2);

        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(inv1, result.get(0).getInvocation());
        Assert.assertEquals(inv2, result.get(1).getInvocation());
    }

    @Test
    public void testCreateFrom_emptyList() {
        List<InvocationMatcher> result = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }
}
