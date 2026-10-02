package org.mockito.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
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
import org.mockito.internal.debugging.Location;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.invocation.Invocation;

public class ReporterTest {

    private Reporter reporter;

    @Before
    public void setUp() {
        reporter = new Reporter();
    }

    private PrintableInvocation createPrintableInvocation(final String description) {
        return new PrintableInvocation() {
            @Override
            public Location getLocation() {
                return new Location();
            }

            @Override
            public String toString() {
                return description;
            }
        };
    }

    private VerificationAwareInvocation createVerificationAwareInvocation(final boolean verified) {
        return new VerificationAwareInvocation() {
            @Override
            public boolean isVerified() {
                return verified;
            }

            @Override
            public Location getLocation() {
                return new Location();
            }
        };
    }

    private Invocation createDummyInvocation() {
        try {
            sun.reflect.ReflectionFactory rf = sun.reflect.ReflectionFactory.getReflectionFactory();
            Constructor<?> objectConstructor = Object.class.getDeclaredConstructor();
            Constructor<?> invocationConstructor = rf.newConstructorForSerialization(Invocation.class, objectConstructor);
            Invocation invocation = (Invocation) invocationConstructor.newInstance();
            try {
                Field locationField = Invocation.class.getDeclaredField("location");
                locationField.setAccessible(true);
                locationField.set(invocation, new Location());
            } catch (NoSuchFieldException ignored) {
            }
            return invocation;
        } catch (Exception e) {
            throw new RuntimeException("Failed to construct dummy invocation", e);
        }
    }

    @Test
    public void testCheckedExceptionInvalid_shouldThrowMockitoException() {
        Exception cause = new Exception("Invalid checked exception");
        try {
            reporter.checkedExceptionInvalid(cause);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Checked exception is invalid for this method!"));
            assertTrue(e.getMessage().contains(cause.toString()));
        }
    }

    @Test
    public void testCannotStubWithNullThrowable_shouldThrowMockitoException() {
        try {
            reporter.cannotStubWithNullThrowable();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot stub with null throwable!"));
        }
    }

    @Test
    public void testUnfinishedStubbing_withValidLocation_shouldThrowUnfinishedStubbingException() {
        Location location = new Location();
        try {
            reporter.unfinishedStubbing(location);
            fail("Expected UnfinishedStubbingException");
        } catch (UnfinishedStubbingException e) {
            assertTrue(e.getMessage().contains("Unfinished stubbing detected here:"));
            assertTrue(e.getMessage().contains("thenReturn()"));
        }
    }

    @Test
    public void testMissingMethodInvocation_shouldThrowMissingMethodInvocationException() {
        try {
            reporter.missingMethodInvocation();
            fail("Expected MissingMethodInvocationException");
        } catch (MissingMethodInvocationException e) {
            assertTrue(e.getMessage().contains("when() requires an argument which has to be 'a method call on a mock'."));
        }
    }

    @Test
    public void testUnfinishedVerificationException_withValidLocation_shouldThrowUnfinishedVerificationException() {
        Location location = new Location();
        try {
            reporter.unfinishedVerificationException(location);
            fail("Expected UnfinishedVerificationException");
        } catch (UnfinishedVerificationException e) {
            assertTrue(e.getMessage().contains("Missing method call for verify(mock) here:"));
        }
    }

    @Test
    public void testNotAMockPassedToVerify_withClass_shouldThrowNotAMockException() {
        try {
            reporter.notAMockPassedToVerify(String.class);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() is of type String and is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToVerify_shouldThrowNullInsteadOfMockException() {
        try {
            reporter.nullPassedToVerify();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() should be a mock but is null!"));
        }
    }

    @Test
    public void testNotAMockPassedToWhenMethod_shouldThrowNotAMockException() {
        try {
            reporter.notAMockPassedToWhenMethod();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToWhenMethod_shouldThrowNullInsteadOfMockException() {
        try {
            reporter.nullPassedToWhenMethod();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is null!"));
        }
    }

    @Test
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions_shouldThrowMockitoException() {
        try {
            reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
            assertTrue(e.getMessage().contains("verifyNoMoreInteractions(mockOne, mockTwo);"));
        }
    }

    @Test
    public void testNotAMockPassedToVerifyNoMoreInteractions_shouldThrowNotAMockException() {
        try {
            reporter.notAMockPassedToVerifyNoMoreInteractions();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToVerifyNoMoreInteractions_shouldThrowNullInsteadOfMockException() {
        try {
            reporter.nullPassedToVerifyNoMoreInteractions();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void testNotAMockPassedWhenCreatingInOrder_shouldThrowNotAMockException() {
        try {
            reporter.notAMockPassedWhenCreatingInOrder();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
            assertTrue(e.getMessage().contains("InOrder inOrder = inOrder(mockOne, mockTwo);"));
        }
    }

    @Test
    public void testNullPassedWhenCreatingInOrder_shouldThrowNullInsteadOfMockException() {
        try {
            reporter.nullPassedWhenCreatingInOrder();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
            assertTrue(e.getMessage().contains("InOrder inOrder = inOrder(mockOne, mockTwo);"));
        }
    }

    @Test
    public void testMocksHaveToBePassedWhenCreatingInOrder_shouldThrowMockitoException() {
        try {
            reporter.mocksHaveToBePassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
            assertTrue(e.getMessage().contains("InOrder inOrder = inOrder(mockOne, mockTwo);"));
        }
    }

    @Test
    public void testInOrderRequiresFamiliarMock_shouldThrowMockitoException() {
        try {
            reporter.inOrderRequiresFamiliarMock();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("InOrder can only verify mocks that were passed in during creation of InOrder."));
        }
    }

    @Test
    public void testInvalidUseOfMatchers_withCounts_shouldThrowInvalidUseOfMatchersException() {
        try {
            reporter.invalidUseOfMatchers(3, 1);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Invalid use of argument matchers!"));
            assertTrue(e.getMessage().contains("3 matchers expected, 1 recorded."));
        }
    }

    @Test
    public void testArgumentsAreDifferent_withLocation_shouldThrowComparisonOrAssertionError() {
        try {
            reporter.argumentsAreDifferent("wantedMethod(1)", "actualMethod(2)", new Location());
            fail("Expected error for different arguments");
        } catch (Throwable t) {
            assertTrue(t.getMessage().contains("Argument(s) are different! Wanted:"));
            assertTrue(t.getMessage().contains("wantedMethod(1)"));
            assertTrue(t.getMessage().contains("actualMethod(2)"));
        }
    }

    @Test
    public void testWantedButNotInvoked_singleInvocation_shouldThrowWantedButNotInvoked() {
        PrintableInvocation wanted = createPrintableInvocation("wantedMethod()");
        try {
            reporter.wantedButNotInvoked(wanted);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("wantedMethod()"));
        }
    }

    @Test
    public void testWantedButNotInvoked_withEmptyInvocationsList_shouldShowZeroInteractionsMessage() {
        PrintableInvocation wanted = createPrintableInvocation("wantedMethod()");
        List<PrintableInvocation> invocations = Collections.emptyList();
        try {
            reporter.wantedButNotInvoked(wanted, invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("Actually, there were zero interactions with this mock."));
        }
    }

    @Test
    public void testWantedButNotInvoked_withNonEmptyInvocationsList_shouldShowOtherInteractions() {
        PrintableInvocation wanted = createPrintableInvocation("wantedMethod()");
        List<PrintableInvocation> invocations = new ArrayList<PrintableInvocation>();
        invocations.add(createPrintableInvocation("otherMethod1()"));
        invocations.add(createPrintableInvocation("otherMethod2()"));

        try {
            reporter.wantedButNotInvoked(wanted, invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("However, there were other interactions with this mock:"));
        }
    }

    @Test
    public void testWantedButNotInvokedInOrder_shouldThrowVerificationInOrderFailure() {
        PrintableInvocation wanted = createPrintableInvocation("wantedInOrder()");
        PrintableInvocation previous = createPrintableInvocation("previousInOrder()");
        try {
            reporter.wantedButNotInvokedInOrder(wanted, previous);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure"));
            assertTrue(e.getMessage().contains("Wanted anywhere AFTER following interaction:"));
            assertTrue(e.getMessage().contains("previousInOrder()"));
        }
    }

    @Test
    public void testTooManyActualInvocations_shouldThrowTooManyActualInvocations() {
        PrintableInvocation wanted = createPrintableInvocation("tooManyMethod()");
        Location location = new Location();
        try {
            reporter.tooManyActualInvocations(1, 3, wanted, location);
            fail("Expected TooManyActualInvocations");
        } catch (TooManyActualInvocations e) {
            assertTrue(e.getMessage().contains("tooManyMethod()"));
            assertTrue(e.getMessage().contains("Wanted 1 time:"));
            assertTrue(e.getMessage().contains("But was 3 times."));
        }
    }

    @Test
    public void testNeverWantedButInvoked_shouldThrowNeverWantedButInvoked() {
        PrintableInvocation wanted = createPrintableInvocation("neverWantedMethod()");
        Location location = new Location();
        try {
            reporter.neverWantedButInvoked(wanted, location);
            fail("Expected NeverWantedButInvoked");
        } catch (NeverWantedButInvoked e) {
            assertTrue(e.getMessage().contains("neverWantedMethod()"));
            assertTrue(e.getMessage().contains("Never wanted here:"));
            assertTrue(e.getMessage().contains("But invoked here:"));
        }
    }

    @Test
    public void testTooManyActualInvocationsInOrder_shouldThrowVerificationInOrderFailure() {
        PrintableInvocation wanted = createPrintableInvocation("tooManyInOrder()");
        Location location = new Location();
        try {
            reporter.tooManyActualInvocationsInOrder(2, 5, wanted, location);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("tooManyInOrder()"));
            assertTrue(e.getMessage().contains("Wanted 2 times:"));
            assertTrue(e.getMessage().contains("But was 5 times."));
        }
    }

    @Test
    public void testTooLittleActualInvocations_withLocation_shouldThrowTooLittleActualInvocations() {
        Discrepancy discrepancy = new Discrepancy(2, 1);
        PrintableInvocation wanted = createPrintableInvocation("tooLittleMethod()");
        Location location = new Location();
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, location);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("tooLittleMethod()"));
            assertTrue(e.getMessage().contains("Wanted 2 times:"));
            assertTrue(e.getMessage().contains("But was 1 time:"));
        }
    }

    @Test
    public void testTooLittleActualInvocations_withNullLocation_shouldHandleNullLocation() {
        Discrepancy discrepancy = new Discrepancy(3, 0);
        PrintableInvocation wanted = createPrintableInvocation("tooLittleMethodZero()");
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, null);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("tooLittleMethodZero()"));
            assertTrue(e.getMessage().contains("Wanted 3 times:"));
            assertTrue(e.getMessage().contains("But was 0 times:"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrder_withLocation_shouldThrowVerificationInOrderFailure() {
        Discrepancy discrepancy = new Discrepancy(2, 1);
        PrintableInvocation wanted = createPrintableInvocation("tooLittleInOrder()");
        Location location = new Location();
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, location);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("tooLittleInOrder()"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrder_withNullLocation_shouldThrowVerificationInOrderFailure() {
        Discrepancy discrepancy = new Discrepancy(1, 0);
        PrintableInvocation wanted = createPrintableInvocation("tooLittleInOrderNullLoc()");
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, null);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("tooLittleInOrderNullLoc()"));
        }
    }

    @Test
    public void testNoMoreInteractionsWanted_withInvocationsList_shouldThrowNoInteractionsWanted() {
        Invocation undesired = createDummyInvocation();
        List<VerificationAwareInvocation> invocations = new ArrayList<VerificationAwareInvocation>();
        invocations.add(createVerificationAwareInvocation(false));
        invocations.add(createVerificationAwareInvocation(true));

        try {
            reporter.noMoreInteractionsWanted(undesired, invocations);
            fail("Expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction:"));
        }
    }

    @Test
    public void testNoMoreInteractionsWanted_withEmptyInvocationsList_shouldThrowNoInteractionsWanted() {
        Invocation undesired = createDummyInvocation();
        List<VerificationAwareInvocation> invocations = Collections.emptyList();

        try {
            reporter.noMoreInteractionsWanted(undesired, invocations);
            fail("Expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
        }
    }

    @Test
    public void testNoMoreInteractionsWantedInOrder_shouldThrowVerificationInOrderFailure() {
        Invocation undesired = createDummyInvocation();
        try {
            reporter.noMoreInteractionsWantedInOrder(undesired);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction:"));
        }
    }

    @Test
    public void testCannotMockFinalClass_shouldThrowMockitoException() {
        try {
            reporter.cannotMockFinalClass(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot mock/spy " + String.class.toString()));
            assertTrue(e.getMessage().contains("final classes"));
        }
    }

    @Test
    public void testCannotStubVoidMethodWithAReturnValue_shouldThrowMockitoException() {
        try {
            reporter.cannotStubVoidMethodWithAReturnValue("doSomethingVoid");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("'doSomethingVoid' is a *void method* and it *cannot* be stubbed with a *return value*!"));
        }
    }

    @Test
    public void testOnlyVoidMethodsCanBeSetToDoNothing_shouldThrowMockitoException() {
        try {
            reporter.onlyVoidMethodsCanBeSetToDoNothing();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Only void methods can doNothing()!"));
            assertTrue(e.getMessage().contains("doNothing()."));
        }
    }

    @Test
    public void testWrongTypeOfReturnValue_shouldThrowWrongTypeOfReturnValue() {
        try {
            reporter.wrongTypeOfReturnValue("String", "Integer", "getName");
            fail("Expected WrongTypeOfReturnValue");
        } catch (WrongTypeOfReturnValue e) {
            assertTrue(e.getMessage().contains("Integer cannot be returned by getName()"));
            assertTrue(e.getMessage().contains("getName() should return String"));
        }
    }

    @Test
    public void testWantedAtMostX_shouldThrowMockitoAssertionError() {
        try {
            reporter.wantedAtMostX(2, 4);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Wanted at most 2 times but was 4"));
        }
    }

    @Test
    public void testWantedAtMostX_edgeCaseZeroAndOne_shouldFormatSingularPluralCorrectly() {
        try {
            reporter.wantedAtMostX(1, 0);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Wanted at most 1 time but was 0"));
        }
    }

    @Test
    public void testMisplacedArgumentMatcher_shouldThrowInvalidUseOfMatchersException() {
        Location location = new Location();
        try {
            reporter.misplacedArgumentMatcher(location);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Misplaced argument matcher detected here:"));
            assertTrue(e.getMessage().contains("You cannot use argument matchers outside of verification or stubbing."));
        }
    }

    @Test
    public void testSmartNullPointerException_shouldThrowSmartNullPointerException() {
        Location location = new Location();
        try {
            reporter.smartNullPointerException(location);
            fail("Expected SmartNullPointerException");
        } catch (SmartNullPointerException e) {
            assertTrue(e.getMessage().contains("You have a NullPointerException here:"));
            assertTrue(e.getMessage().contains("Because this method was *not* stubbed correctly:"));
        }
    }

    @Test
    public void testNoArgumentValueWasCaptured_shouldThrowMockitoException() {
        try {
            reporter.noArgumentValueWasCaptured();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("No argument value was captured!"));
            assertTrue(e.getMessage().contains("ArgumentCaptor"));
        }
    }

    @Test
    public void testExtraInterfacesDoesNotAcceptNullParameters_shouldThrowMockitoException() {
        try {
            reporter.extraInterfacesDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept null parameters."));
        }
    }

    @Test
    public void testExtraInterfacesAcceptsOnlyInterfaces_shouldThrowMockitoException() {
        try {
            reporter.extraInterfacesAcceptsOnlyInterfaces(Integer.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() accepts only interfaces."));
            assertTrue(e.getMessage().contains("Integer"));
        }
    }

    @Test
    public void testExtraInterfacesCannotContainMockedType_shouldThrowMockitoException() {
        try {
            reporter.extraInterfacesCannotContainMockedType(List.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept the same type as the mocked type."));
            assertTrue(e.getMessage().contains("List"));
        }
    }

    @Test
    public void testExtraInterfacesRequiresAtLeastOneInterface_shouldThrowMockitoException() {
        try {
            reporter.extraInterfacesRequiresAtLeastOneInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() requires at least one interface."));
        }
    }

    @Test
    public void testMockedTypeIsInconsistentWithSpiedInstanceType_shouldThrowMockitoException() {
        try {
            reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, "notAList");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mocked type must be the same as the type of your spied instance."));
            assertTrue(e.getMessage().contains("Mocked type must be: String, but is: List"));
        }
    }

    @Test
    public void testCannotCallRealMethodOnInterface_shouldThrowMockitoException() {
        try {
            reporter.cannotCallRealMethodOnInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot call real method on java interface."));
        }
    }

    @Test
    public void testCannotVerifyToString_shouldThrowMockitoException() {
        try {
            reporter.cannotVerifyToString();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mockito cannot verify toString()"));
        }
    }

    @Test
    public void testMoreThanOneAnnotationNotAllowed_shouldThrowMockitoException() {
        try {
            reporter.moreThanOneAnnotationNotAllowed("sampleField");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("You cannot have more than one Mockito annotation on a field!"));
            assertTrue(e.getMessage().contains("sampleField"));
        }
    }

    @Test
    public void testUnsupportedCombinationOfAnnotations_shouldThrowMockitoException() {
        try {
            reporter.unsupportedCombinationOfAnnotations("Mock", "Spy");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("This combination of annotations is not permitted on a single field:"));
            assertTrue(e.getMessage().contains("@Mock and @Spy"));
        }
    }

    @Test
    public void testCannotInitializeForSpyAnnotation_shouldThrowMockitoExceptionWithDetails() {
        Exception cause = new IllegalAccessException("No access");
        try {
            reporter.cannotInitializeForSpyAnnotation("mySpyField", cause);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate a @Spy for 'mySpyField' field."));
            assertTrue(e.getMessage().contains("No access"));
            assertEquals(cause, e.getCause());
        }
    }

    @Test
    public void testCannotInitializeForInjectMocksAnnotation_shouldThrowMockitoExceptionWithDetails() {
        Exception cause = new InstantiationException("Cannot instantiate");
        try {
            reporter.cannotInitializeForInjectMocksAnnotation("myInjectField", cause);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate @InjectMocks field named 'myInjectField'."));
            assertTrue(e.getMessage().contains("Cannot instantiate"));
            assertEquals(cause, e.getCause());
        }
    }
}
