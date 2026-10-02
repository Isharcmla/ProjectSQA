package org.mockito.exceptions;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue;
import org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock;
import org.mockito.exceptions.misusing.FriendlyReminderException;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import org.mockito.exceptions.verification.NeverWantedButInvoked;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.reporting.Discrepancy;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.listeners.InvocationListener;
import org.mockito.listeners.MethodInvocationReport;
import org.mockito.mock.SerializableMode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ReporterTest {

    private Reporter reporter;

    @Before
    public void setUp() {
        reporter = new Reporter();
    }

    private static class DummyTarget {
        public String sampleField;

        public void methodWithoutArgs() {}

        public void methodWithArgs(String a, Integer b) {}

        public void methodWithVarargs(String a, Integer... rest) {}
    }

    private static class SimpleDescribedInvocation implements DescribedInvocation {
        private final String description;
        private final Location location;

        public SimpleDescribedInvocation(String description, Location location) {
            this.description = description;
            this.location = location;
        }

        public Location getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    private static class SimpleInvocationOnMock implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        public SimpleInvocationOnMock(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments;
        }

        public Object getMock() {
            return mock;
        }

        public Method getMethod() {
            return method;
        }

        public Object[] getArguments() {
            return arguments;
        }

        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return clazz.cast(arguments[index]);
        }

        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    private static class SimpleVerificationAwareInvocation implements Invocation, VerificationAwareInvocation {
        private final Object mock;
        private final Method method;
        private final Location location;
        private boolean isVerified;

        public SimpleVerificationAwareInvocation(Object mock, Method method, Location location) {
            this.mock = mock;
            this.method = method;
            this.location = location;
            this.isVerified = false;
        }

        public int getSequenceNumber() {
            return 1;
        }

        public Location getLocation() {
            return location;
        }

        public Object[] getArguments() {
            return new Object[0];
        }

        public Method getMethod() {
            return method;
        }

        public Object getMock() {
            return mock;
        }

        public boolean isVerified() {
            return isVerified;
        }

        public boolean isIgnoredForVerification() {
            return false;
        }

        public void ignoreForVerification() {}

        public void markVerified() {
            this.isVerified = true;
        }

        public Object callRealMethod() throws Throwable {
            return null;
        }

        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return null;
        }

        public Object[] getRawArguments() {
            return new Object[0];
        }

        public Class<?> getRawReturnType() {
            return method.getReturnType();
        }

        public void markStubbed(org.mockito.invocation.StubInfo stubInfo) {}

        public org.mockito.invocation.StubInfo stubInfo() {
            return null;
        }

        @Override
        public String toString() {
            return "simpleInvocation()";
        }
    }

    @Test(expected = MockitoException.class)
    public void testCheckedExceptionInvalid_shouldThrowMockitoException() {
        reporter.checkedExceptionInvalid(new Exception("Checked Exception"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotStubWithNullThrowable_shouldThrowMockitoException() {
        reporter.cannotStubWithNullThrowable();
    }

    @Test(expected = UnfinishedStubbingException.class)
    public void testUnfinishedStubbing_shouldThrowUnfinishedStubbingException() {
        reporter.unfinishedStubbing(new LocationImpl());
    }

    @Test(expected = MockitoException.class)
    public void testIncorrectUseOfApi_shouldThrowMockitoException() {
        reporter.incorrectUseOfApi();
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testMissingMethodInvocation_shouldThrowMissingMethodInvocationException() {
        reporter.missingMethodInvocation();
    }

    @Test(expected = UnfinishedVerificationException.class)
    public void testUnfinishedVerificationException_shouldThrowUnfinishedVerificationException() {
        reporter.unfinishedVerificationException(new LocationImpl());
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerify_shouldThrowNotAMockException() {
        reporter.notAMockPassedToVerify(String.class);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerify_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedToVerify();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToWhenMethod_shouldThrowNotAMockException() {
        reporter.notAMockPassedToWhenMethod();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToWhenMethod_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedToWhenMethod();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions_shouldThrowMockitoException() {
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerifyNoMoreInteractions_shouldThrowNotAMockException() {
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerifyNoMoreInteractions_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedWhenCreatingInOrder_shouldThrowNotAMockException() {
        reporter.notAMockPassedWhenCreatingInOrder();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedWhenCreatingInOrder_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedWhenCreatingInOrder_shouldThrowMockitoException() {
        reporter.mocksHaveToBePassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testInOrderRequiresFamiliarMock_shouldThrowMockitoException() {
        reporter.inOrderRequiresFamiliarMock();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testInvalidUseOfMatchers_shouldThrowInvalidUseOfMatchersException() {
        List<LocalizedMatcher> matchers = Collections.singletonList(new LocalizedMatcher(new Equals("test")));
        reporter.invalidUseOfMatchers(2, matchers);
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testIncorrectUseOfAdditionalMatchers_shouldThrowInvalidUseOfMatchersException() {
        List<LocalizedMatcher> matchers = Collections.singletonList(new LocalizedMatcher(new Equals("test")));
        reporter.incorrectUseOfAdditionalMatchers("and", 2, matchers);
    }

    @Test(expected = CannotVerifyStubOnlyMock.class)
    public void testStubPassedToVerify_shouldThrowCannotVerifyStubOnlyMock() {
        reporter.stubPassedToVerify();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testReportNoSubMatchersFound_shouldThrowInvalidUseOfMatchersException() {
        reporter.reportNoSubMatchersFound("and");
    }

    @Test(expected = Throwable.class)
    public void testArgumentsAreDifferent_shouldThrowAssertionError() {
        reporter.argumentsAreDifferent("wanted()", "actual()", new LocationImpl());
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvoked_singleArg_shouldThrowWantedButNotInvoked() {
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.wantedButNotInvoked(wanted);
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvoked_withEmptyInvocationsList_shouldThrowWantedButNotInvoked() {
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.wantedButNotInvoked(wanted, Collections.<DescribedInvocation>emptyList());
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvoked_withNonEmptyInvocationsList_shouldThrowWantedButNotInvoked() {
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        DescribedInvocation other = new SimpleDescribedInvocation("mock.otherMethod()", new LocationImpl());
        reporter.wantedButNotInvoked(wanted, Collections.singletonList(other));
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testWantedButNotInvokedInOrder_shouldThrowVerificationInOrderFailure() {
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.first()", new LocationImpl());
        DescribedInvocation previous = new SimpleDescribedInvocation("mock.second()", new LocationImpl());
        reporter.wantedButNotInvokedInOrder(wanted, previous);
    }

    @Test(expected = TooManyActualInvocations.class)
    public void testTooManyActualInvocations_shouldThrowTooManyActualInvocations() {
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.tooManyActualInvocations(1, 2, wanted, new LocationImpl());
    }

    @Test(expected = NeverWantedButInvoked.class)
    public void testNeverWantedButInvoked_shouldThrowNeverWantedButInvoked() {
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.neverWantedButInvoked(wanted, new LocationImpl());
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testTooManyActualInvocationsInOrder_shouldThrowVerificationInOrderFailure() {
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.tooManyActualInvocationsInOrder(1, 2, wanted, new LocationImpl());
    }

    @Test(expected = TooLittleActualInvocations.class)
    public void testTooLittleActualInvocations_withLocation_shouldThrowTooLittleActualInvocations() {
        Discrepancy discrepancy = new Discrepancy(2, 1);
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.tooLittleActualInvocations(discrepancy, wanted, new LocationImpl());
    }

    @Test(expected = TooLittleActualInvocations.class)
    public void testTooLittleActualInvocations_withNullLocation_shouldThrowTooLittleActualInvocations() {
        Discrepancy discrepancy = new Discrepancy(2, 0);
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.tooLittleActualInvocations(discrepancy, wanted, null);
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testTooLittleActualInvocationsInOrder_withLocation_shouldThrowVerificationInOrderFailure() {
        Discrepancy discrepancy = new Discrepancy(2, 1);
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, new LocationImpl());
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testTooLittleActualInvocationsInOrder_withNullLocation_shouldThrowVerificationInOrderFailure() {
        Discrepancy discrepancy = new Discrepancy(2, 0);
        DescribedInvocation wanted = new SimpleDescribedInvocation("mock.doSomething()", new LocationImpl());
        reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, null);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testNoMoreInteractionsWanted_shouldThrowNoInteractionsWanted() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithoutArgs");
        SimpleVerificationAwareInvocation invocation = new SimpleVerificationAwareInvocation("testMock", method, new LocationImpl());
        List<VerificationAwareInvocation> list = new ArrayList<VerificationAwareInvocation>();
        list.add(invocation);

        reporter.noMoreInteractionsWanted(invocation, list);
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testNoMoreInteractionsWantedInOrder_shouldThrowVerificationInOrderFailure() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithoutArgs");
        SimpleVerificationAwareInvocation invocation = new SimpleVerificationAwareInvocation("testMock", method, new LocationImpl());
        reporter.noMoreInteractionsWantedInOrder(invocation);
    }

    @Test(expected = MockitoException.class)
    public void testCannotMockFinalClass_shouldThrowMockitoException() {
        reporter.cannotMockFinalClass(String.class);
    }

    @Test(expected = CannotStubVoidMethodWithReturnValue.class)
    public void testCannotStubVoidMethodWithAReturnValue_shouldThrowCannotStubVoidMethodWithReturnValue() {
        reporter.cannotStubVoidMethodWithAReturnValue("voidMethod");
    }

    @Test(expected = MockitoException.class)
    public void testOnlyVoidMethodsCanBeSetToDoNothing_shouldThrowMockitoException() {
        reporter.onlyVoidMethodsCanBeSetToDoNothing();
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfReturnValue_shouldThrowWrongTypeOfReturnValue() {
        reporter.wrongTypeOfReturnValue("String", "Integer", "getSomething");
    }

    @Test(expected = MockitoAssertionError.class)
    public void testWantedAtMostX_shouldThrowMockitoAssertionError() {
        reporter.wantedAtMostX(1, 3);
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testMisplacedArgumentMatcher_shouldThrowInvalidUseOfMatchersException() {
        List<LocalizedMatcher> matchers = Arrays.asList(
                new LocalizedMatcher(new Equals("one")),
                new LocalizedMatcher(new Equals("two"))
        );
        reporter.misplacedArgumentMatcher(matchers);
    }

    @Test(expected = SmartNullPointerException.class)
    public void testSmartNullPointerException_shouldThrowSmartNullPointerException() {
        reporter.smartNullPointerException("mock.doStuff()", new LocationImpl());
    }

    @Test(expected = MockitoException.class)
    public void testNoArgumentValueWasCaptured_shouldThrowMockitoException() {
        reporter.noArgumentValueWasCaptured();
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesDoesNotAcceptNullParameters_shouldThrowMockitoException() {
        reporter.extraInterfacesDoesNotAcceptNullParameters();
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesAcceptsOnlyInterfaces_shouldThrowMockitoException() {
        reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesCannotContainMockedType_shouldThrowMockitoException() {
        reporter.extraInterfacesCannotContainMockedType(Comparable.class);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesRequiresAtLeastOneInterface_shouldThrowMockitoException() {
        reporter.extraInterfacesRequiresAtLeastOneInterface();
    }

    @Test(expected = MockitoException.class)
    public void testMockedTypeIsInconsistentWithSpiedInstanceType_shouldThrowMockitoException() {
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, new ArrayList<Object>());
    }

    @Test(expected = MockitoException.class)
    public void testCannotCallAbstractRealMethod_shouldThrowMockitoException() {
        reporter.cannotCallAbstractRealMethod();
    }

    @Test(expected = MockitoException.class)
    public void testCannotVerifyToString_shouldThrowMockitoException() {
        reporter.cannotVerifyToString();
    }

    @Test(expected = MockitoException.class)
    public void testMoreThanOneAnnotationNotAllowed_shouldThrowMockitoException() {
        reporter.moreThanOneAnnotationNotAllowed("sampleField");
    }

    @Test(expected = MockitoException.class)
    public void testUnsupportedCombinationOfAnnotations_shouldThrowMockitoException() {
        reporter.unsupportedCombinationOfAnnotations("InjectMocks", "Spy");
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForSpyAnnotation_shouldThrowMockitoException() {
        reporter.cannotInitializeForSpyAnnotation("spyField", new RuntimeException("Constructor failed"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForInjectMocksAnnotation_shouldThrowMockitoException() {
        reporter.cannotInitializeForInjectMocksAnnotation("injectMocksField", new RuntimeException("Constructor failed"));
    }

    @Test(expected = FriendlyReminderException.class)
    public void testAtMostAndNeverShouldNotBeUsedWithTimeout_shouldThrowFriendlyReminderException() {
        reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
    }

    @Test(expected = MockitoException.class)
    public void testFieldInitialisationThrewException_shouldThrowMockitoException() throws Exception {
        Field field = DummyTarget.class.getDeclaredField("sampleField");
        reporter.fieldInitialisationThrewException(field, new RuntimeException("Init error"));
    }

    @Test(expected = MockitoException.class)
    public void testInvocationListenerDoesNotAcceptNullParameters_shouldThrowMockitoException() {
        reporter.invocationListenerDoesNotAcceptNullParameters();
    }

    @Test(expected = MockitoException.class)
    public void testInvocationListenersRequiresAtLeastOneListener_shouldThrowMockitoException() {
        reporter.invocationListenersRequiresAtLeastOneListener();
    }

    @Test(expected = MockitoException.class)
    public void testInvocationListenerThrewException_shouldThrowMockitoException() {
        InvocationListener listener = new InvocationListener() {
            public void reportInvocation(MethodInvocationReport methodInvocationReport) {}
        };
        reporter.invocationListenerThrewException(listener, new RuntimeException("Listener error"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotInjectDependency_shouldThrowMockitoException() throws Exception {
        Field field = DummyTarget.class.getDeclaredField("sampleField");
        Exception details = new Exception("wrapper", new RuntimeException("nested cause"));
        reporter.cannotInjectDependency(field, "matchingMockObject", details);
    }

    @Test(expected = MockitoException.class)
    public void testMockedTypeIsInconsistentWithDelegatedInstanceType_shouldThrowMockitoException() {
        reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(List.class, new ArrayList<Object>());
    }

    @Test(expected = MockitoException.class)
    public void testSpyAndDelegateAreMutuallyExclusive_shouldThrowMockitoException() {
        reporter.spyAndDelegateAreMutuallyExclusive();
    }

    @Test(expected = MockitoException.class)
    public void testInvalidArgumentRangeAtIdentityAnswerCreationTime_shouldThrowMockitoException() {
        reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
    }

    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime_noArgsMethod_willReturnLastParameterTrue() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithoutArgs");
        InvocationOnMock invocation = new SimpleInvocationOnMock("myMock", method, new Object[0]);

        try {
            reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, true, 0);
            fail("Should have thrown MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Last parameter wanted"));
            assertTrue(e.getMessage().contains("the method has no arguments"));
        }
    }

    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime_withArgs_willReturnLastParameterFalse() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithArgs", String.class, Integer.class);
        InvocationOnMock invocation = new SimpleInvocationOnMock("myMock", method, new Object[]{"val", 1});

        try {
            reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 5);
            fail("Should have thrown MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Wanted parameter at position 5"));
            assertTrue(e.getMessage().contains("the possible argument indexes for this method are"));
        }
    }

    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime_withVarargs() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithVarargs", String.class, Integer[].class);
        InvocationOnMock invocation = new SimpleInvocationOnMock("myMock", method, new Object[]{"val", new Integer[]{1, 2}});

        try {
            reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 3);
            fail("Should have thrown MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Vararg"));
        }
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfArgumentToReturn_noArgs_shouldThrowWrongTypeOfReturnValue() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithoutArgs");
        InvocationOnMock invocation = new SimpleInvocationOnMock("myMock", method, new Object[0]);
        reporter.wrongTypeOfArgumentToReturn(invocation, "String", Integer.class, 0);
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfArgumentToReturn_withArgs_shouldThrowWrongTypeOfReturnValue() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithArgs", String.class, Integer.class);
        InvocationOnMock invocation = new SimpleInvocationOnMock("myMock", method, new Object[]{"a", 1});
        reporter.wrongTypeOfArgumentToReturn(invocation, "String", Integer.class, 1);
    }

    @Test(expected = MockitoException.class)
    public void testDefaultAnswerDoesNotAcceptNullParameter_shouldThrowMockitoException() {
        reporter.defaultAnswerDoesNotAcceptNullParameter();
    }

    @Test(expected = MockitoException.class)
    public void testSerializableWontWorkForObjectsThatDontImplementSerializable_shouldThrowMockitoException() {
        reporter.serializableWontWorkForObjectsThatDontImplementSerializable(DummyTarget.class);
    }

    @Test(expected = MockitoException.class)
    public void testDelegatedMethodHasWrongReturnType_shouldThrowMockitoException() throws Exception {
        Method method1 = DummyTarget.class.getMethod("methodWithoutArgs");
        Method method2 = Object.class.getMethod("toString");
        reporter.delegatedMethodHasWrongReturnType(method1, method2, "mockInstance", "delegateInstance");
    }

    @Test(expected = MockitoException.class)
    public void testDelegatedMethodDoesNotExistOnDelegate_shouldThrowMockitoException() throws Exception {
        Method method = DummyTarget.class.getMethod("methodWithoutArgs");
        reporter.delegatedMethodDoesNotExistOnDelegate(method, "mockInstance", "delegateInstance");
    }

    @Test(expected = MockitoException.class)
    public void testUsingConstructorWithFancySerializable_shouldThrowMockitoException() {
        reporter.usingConstructorWithFancySerializable(SerializableMode.BASIC);
    }
}
