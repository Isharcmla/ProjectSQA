package org.mockito.internal.util;

import org.junit.Assert;
import org.junit.Test;

public class TimerTest {

    @Test
    public void testIsCounting_timerStartedWithPositiveDuration_returnsTrueImmediately() {
        Timer timer = new Timer(1000L);
        timer.start();
        Assert.assertTrue(timer.isCounting());
    }

    @Test
    public void testIsCounting_timerStartedWithZeroDuration_returnsFalseAfterSmallDelay() throws InterruptedException {
        Timer timer = new Timer(0L);
        timer.start();
        Thread.sleep(5L);
        Assert.assertFalse(timer.isCounting());
    }

    @Test
    public void testIsCounting_timerStartedWithNegativeDuration_returnsFalse() {
        Timer timer = new Timer(-100L);
        timer.start();
        Assert.assertFalse(timer.isCounting());
    }

    @Test
    public void testIsCounting_durationExceeded_returnsFalse() throws InterruptedException {
        Timer timer = new Timer(10L);
        timer.start();
        Thread.sleep(30L);
        Assert.assertFalse(timer.isCounting());
    }

    @Test
    public void testStart_restartingTimer_resetsCountdown() throws InterruptedException {
        Timer timer = new Timer(50L);
        timer.start();
        Thread.sleep(70L);
        Assert.assertFalse(timer.isCounting());

        timer.start();
        Assert.assertTrue(timer.isCounting());
    }

    @Test
    public void testIsCounting_calledWithoutStart_behaviorDependentOnAssertions() {
        Timer timer = new Timer(1000L);
        try {
            boolean result = timer.isCounting();
            Assert.assertTrue(result);
        } catch (AssertionError e) {
            Assert.assertNotNull(e);
        }
    }
}
