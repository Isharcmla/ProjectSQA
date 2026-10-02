package org.mockito.internal.verification;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.verification.junit.ArgumentsAreDifferent;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

public class VerificationOverTimeImplTest {

    private static class DummyVerificationMode implements VerificationMode {
        private int callCount = 0;
        private final int failTimes;
        private final AssertionError errorToThrow;

        public DummyVerificationMode() {
            this(0, null);
        }

        public DummyVerificationMode(int failTimes, AssertionError errorToThrow) {
            this.failTimes = failTimes;
            this.errorToThrow = errorToThrow;
        }

        @Override
        public void verify(VerificationData data) {
            callCount++;
            if (callCount <= failTimes && errorToThrow != null) {
                throw errorToThrow;
            }
        }

        public int getCallCount() {
            return callCount;
        }
    }

    private static class DummyAtMost extends AtMost {
        public DummyAtMost(int maxNumberOfInvocations) {
            super(maxNumberOfInvocations);
        }

        @Override
        public void verify(VerificationData data) {
            throw new MockitoAssertionError("AtMost failed");
        }
    }

    private static class DummyNoMoreInteractions extends NoMoreInteractions {
        @Override
        public void verify(VerificationData data) {
            throw new MockitoAssertionError("NoMoreInteractions failed");
        }
    }

    private static class FakeTimer extends Timer {
        private int countingCalls;
        private final int maxCountingCalls;

        public FakeTimer(int maxCountingCalls) {
            super(0);
            this.maxCountingCalls = maxCountingCalls;
        }

        @Override
        public void start() {
            this.countingCalls = 0;
        }

        @Override
        public boolean isCounting() {
            return countingCalls++ < maxCountingCalls;
        }
    }

    @Test
    public void testGettersAndConstructors_normalValues_returnsCorrectValues() {
        VerificationMode delegate = new DummyVerificationMode();
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(10L, 50L, delegate, true);

        Assert.assertEquals(10L, overTime.getPollingPeriod());
        Assert.assertEquals(50L, overTime.getDuration());
        Assert.assertSame(delegate, overTime.getDelegate());
    }

    @Test
    public void testGettersAndConstructors_withCustomTimerAndEdgeCaseValues_returnsCorrectValues() {
        VerificationMode delegate = new DummyVerificationMode();
        Timer timer = new Timer(0L);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(-1L, 0L, delegate, false, timer);

        Assert.assertEquals(-1L, overTime.getPollingPeriod());
        Assert.assertEquals(0L, overTime.getDuration());
        Assert.assertSame(delegate, overTime.getDelegate());
    }

    @Test
    public void testVerify_immediateSuccessWithReturnOnSuccessTrue_returnsImmediately() {
        DummyVerificationMode delegate = new DummyVerificationMode();
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true);

        overTime.verify(null);

        Assert.assertEquals(1, delegate.getCallCount());
    }

    @Test
    public void testVerify_successWithReturnOnSuccessFalse_pollsUntilTimerExpires() {
        DummyVerificationMode delegate = new DummyVerificationMode();
        FakeTimer timer = new FakeTimer(3);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, false, timer);

        overTime.verify(null);

        Assert.assertEquals(3, delegate.getCallCount());
    }

    @Test
    public void testVerify_failureThenSuccessWithReturnOnSuccessTrue_recoversAndReturns() {
        DummyVerificationMode delegate = new DummyVerificationMode(1, new MockitoAssertionError("First attempt failed"));
        FakeTimer timer = new FakeTimer(3);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        overTime.verify(null);

        Assert.assertEquals(2, delegate.getCallCount());
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_continuousMockitoAssertionError_throwsLastAssertionError() {
        MockitoAssertionError expectedError = new MockitoAssertionError("Persistent failure");
        DummyVerificationMode delegate = new DummyVerificationMode(10, expectedError);
        FakeTimer timer = new FakeTimer(2);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        overTime.verify(null);
    }

    @Test(expected = ArgumentsAreDifferent.class)
    public void testVerify_continuousArgumentsAreDifferent_throwsLastArgumentsAreDifferent() {
        ArgumentsAreDifferent expectedError = new ArgumentsAreDifferent("Arguments differ", "expected", "actual");
        DummyVerificationMode delegate = new DummyVerificationMode(10, expectedError);
        FakeTimer timer = new FakeTimer(2);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        overTime.verify(null);
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_unrecoverableAtMostDelegate_throwsImmediatelyWithoutPolling() {
        DummyAtMost atMost = new DummyAtMost(1);
        FakeTimer timer = new FakeTimer(5);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, atMost, true, timer);

        overTime.verify(null);
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_unrecoverableNoMoreInteractionsDelegate_throwsImmediatelyWithoutPolling() {
        DummyNoMoreInteractions noMoreInteractions = new DummyNoMoreInteractions();
        FakeTimer timer = new FakeTimer(5);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, noMoreInteractions, true, timer);

        overTime.verify(null);
    }

    @Test
    public void testCanRecoverFromFailure_allVariants_returnsExpectedBoolean() {
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 1L, new DummyVerificationMode(), true);

        Assert.assertTrue(overTime.canRecoverFromFailure(new DummyVerificationMode()));
        Assert.assertFalse(overTime.canRecoverFromFailure(new DummyAtMost(1)));
        Assert.assertFalse(overTime.canRecoverFromFailure(new DummyNoMoreInteractions()));
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_threadInterruptedDuringSleep_catchesInterruptedExceptionAndCompletesLoop() {
        DummyVerificationMode delegate = new DummyVerificationMode(5, new MockitoAssertionError("Failure"));
        FakeTimer timer = new FakeTimer(1);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(10L, 100L, delegate, true, timer);

        Thread.currentThread().interrupt();
        try {
            overTime.verify(null);
        } finally {
            Thread.interrupted();
        }
    }
}
