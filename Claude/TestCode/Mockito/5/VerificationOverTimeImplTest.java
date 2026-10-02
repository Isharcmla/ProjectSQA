package org.mockito.internal.verification;

import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.verification.junit.ArgumentsAreDifferent;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

public class VerificationOverTimeImplTest {

    // ---------- Test double VerificationMode implementations ----------

    private static class SuccessMode implements VerificationMode {
        int callCount = 0;
        public void verify(VerificationData data) {
            callCount++;
        }
    }

    private static class AlwaysFailMode implements VerificationMode {
        int callCount = 0;
        public void verify(VerificationData data) {
            callCount++;
            throw new MockitoAssertionError("always fail");
        }
    }

    private static class AlwaysFailArgumentsDifferentMode implements VerificationMode {
        int callCount = 0;
        public void verify(VerificationData data) {
            callCount++;
            throw new ArgumentsAreDifferent("args different");
        }
    }

    private static class FailThenSucceedMode implements VerificationMode {
        int callCount = 0;
        int failCount;

        FailThenSucceedMode(int failCount) {
            this.failCount = failCount;
        }

        public void verify(VerificationData data) {
            callCount++;
            if (callCount <= failCount) {
                throw new MockitoAssertionError("fail #" + callCount);
            }
        }
    }

    // Subclasses of real non-recoverable verification modes that fail immediately,
    // used to test the "non-recoverable" fast-fail branch without needing real invocation data.
    private static class FailingAtMost extends AtMost {
        public FailingAtMost(int maxNumberOfInvocations) {
            super(maxNumberOfInvocations);
        }

        @Override
        public void verify(VerificationData data) {
            throw new MockitoAssertionError("atmost fail");
        }
    }

    private static class FailingNoMoreInteractions extends NoMoreInteractions {
        @Override
        public void verify(VerificationData data) {
            throw new MockitoAssertionError("no more interactions fail");
        }
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_withoutTimer_createsInstanceSuccessfully() {
        VerificationMode delegate = new SuccessMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 100, delegate, true);
        assertEquals(10, impl.getPollingPeriod());
        assertEquals(100, impl.getDuration());
        assertSame(delegate, impl.getDelegate());
    }

    @Test
    public void testConstructor_withTimer_createsInstanceSuccessfully() {
        VerificationMode delegate = new SuccessMode();
        Timer timer = new Timer(50);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(5, 50, delegate, false, timer);
        assertEquals(5, impl.getPollingPeriod());
        assertEquals(50, impl.getDuration());
        assertSame(delegate, impl.getDelegate());
    }

    @Test
    public void testConstructor_withZeroValues_doesNotThrow() {
        VerificationMode delegate = new SuccessMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(0, 0, delegate, true);
        assertEquals(0, impl.getPollingPeriod());
        assertEquals(0, impl.getDuration());
    }

    @Test
    public void testConstructor_withNegativeValues_doesNotThrow() {
        VerificationMode delegate = new SuccessMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(-10, -100, delegate, true);
        assertEquals(-10, impl.getPollingPeriod());
        assertEquals(-100, impl.getDuration());
    }

    // ---------- Getter tests ----------

    @Test
    public void testGetPollingPeriod_returnsCorrectValue() {
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(123, 456, new SuccessMode(), true);
        assertEquals(123, impl.getPollingPeriod());
    }

    @Test
    public void testGetDuration_returnsCorrectValue() {
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(123, 456, new SuccessMode(), true);
        assertEquals(456, impl.getDuration());
    }

    @Test
    public void testGetDelegate_returnsCorrectDelegate() {
        VerificationMode delegate = new SuccessMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 100, delegate, true);
        assertSame(delegate, impl.getDelegate());
    }

    // ---------- verify() behavior tests ----------

    @Test
    public void testVerify_successOnFirstTry_returnOnSuccessTrue_returnsImmediately() {
        SuccessMode delegate = new SuccessMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 1000, delegate, true);
        impl.verify(null);
        assertTrue(delegate.callCount >= 1);
    }

    @Test
    public void testVerify_successOnFirstTry_returnOnSuccessFalse_waitsFullDuration() {
        SuccessMode delegate = new SuccessMode();
        long duration = 100;
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, duration, delegate, false);
        long start = System.currentTimeMillis();
        impl.verify(null);
        long elapsed = System.currentTimeMillis() - start;
        assertTrue(elapsed >= duration - 30);
        assertTrue(delegate.callCount > 1);
    }

    @Test
    public void testVerify_failsThenSucceeds_returnOnSuccessTrue_returnsAfterSuccess() {
        FailThenSucceedMode delegate = new FailThenSucceedMode(2);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 2000, delegate, true);
        impl.verify(null);
        assertTrue(delegate.callCount >= 3);
    }

    @Test
    public void testVerify_recoversFromFailureThenSucceeds_returnOnSuccessFalse_completesWithoutException() {
        FailThenSucceedMode delegate = new FailThenSucceedMode(1);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(5, 50, delegate, false);
        impl.verify(null); // should not throw: eventually succeeds then waits out duration with error reset to null
        assertTrue(delegate.callCount > 1);
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_alwaysFails_recoverableMode_throwsAfterTimeout() {
        AlwaysFailMode delegate = new AlwaysFailMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 50, delegate, true);
        impl.verify(null);
    }

    @Test(expected = ArgumentsAreDifferent.class)
    public void testVerify_argumentsAreDifferentException_throwsAfterTimeout() {
        AlwaysFailArgumentsDifferentMode delegate = new AlwaysFailArgumentsDifferentMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 50, delegate, true);
        impl.verify(null);
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_atMostModeThrowsImmediately_doesNotWaitFullDuration() {
        FailingAtMost delegate = new FailingAtMost(1);
        long duration = 2000;
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, duration, delegate, true);
        long start = System.currentTimeMillis();
        try {
            impl.verify(null);
        } finally {
            long elapsed = System.currentTimeMillis() - start;
            assertTrue(elapsed < duration);
            assertEquals(1, delegate.callCount);
        }
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_noMoreInteractionsModeThrowsImmediately_doesNotWaitFullDuration() {
        FailingNoMoreInteractions delegate = new FailingNoMoreInteractions();
        long duration = 2000;
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, duration, delegate, true);
        long start = System.currentTimeMillis();
        try {
            impl.verify(null);
        } finally {
            long elapsed = System.currentTimeMillis() - start;
            assertTrue(elapsed < duration);
        }
    }

    @Test
    public void testVerify_withNullVerificationData_doesNotThrowNPE_whenDelegateIgnoresData() {
        SuccessMode delegate = new SuccessMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(5, 50, delegate, true);
        impl.verify(null);
        assertTrue(delegate.callCount >= 1);
    }

    // ---------- canRecoverFromFailure() tests (protected method, accessible from same package) ----------

    @Test
    public void testCanRecoverFromFailure_atMostMode_returnsFalse() {
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 100, new SuccessMode(), true);
        assertFalse(impl.canRecoverFromFailure(new AtMost(1)));
    }

    @Test
    public void testCanRecoverFromFailure_noMoreInteractionsMode_returnsFalse() {
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 100, new SuccessMode(), true);
        assertFalse(impl.canRecoverFromFailure(new NoMoreInteractions()));
    }

    @Test
    public void testCanRecoverFromFailure_otherMode_returnsTrue() {
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 100, new SuccessMode(), true);
        assertTrue(impl.canRecoverFromFailure(new SuccessMode()));
    }
}
