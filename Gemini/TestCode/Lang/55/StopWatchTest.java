package org.apache.commons.lang.time;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class StopWatchTest {

    @Test
    public void testConstructor_initialState_unstartedAndTimeZero() {
        StopWatch watch = new StopWatch();
        Assert.assertEquals(0L, watch.getTime());
        Assert.assertEquals("00:00:00.000", watch.toString());
    }

    @Test
    public void testStart_normal_transitionsToRunning() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(20);
        Assert.assertTrue(watch.getTime() >= 20);
    }

    @Test(expected = IllegalStateException.class)
    public void testStart_whenAlreadyStarted_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.start();
    }

    @Test(expected = IllegalStateException.class)
    public void testStart_whenStoppedWithoutReset_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.start();
    }

    @Test(expected = IllegalStateException.class)
    public void testStart_whenSuspended_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        watch.start();
    }

    @Test
    public void testStop_whenRunning_transitionsToStoppedAndRecordsTime() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(50);
        watch.stop();
        long time1 = watch.getTime();
        Thread.sleep(20);
        long time2 = watch.getTime();
        Assert.assertEquals(time1, time2);
        Assert.assertTrue(time1 >= 50);
    }

    @Test
    public void testStop_whenSuspended_transitionsToStoppedAndRecordsTime() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(30);
        watch.suspend();
        Thread.sleep(20);
        watch.stop();
        long time = watch.getTime();
        Assert.assertTrue(time >= 30);
    }

    @Test(expected = IllegalStateException.class)
    public void testStop_whenUnstarted_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.stop();
    }

    @Test(expected = IllegalStateException.class)
    public void testStop_whenAlreadyStopped_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.stop();
    }

    @Test
    public void testReset_fromStoppedState_clearsValuesAndAllowsRestart() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(20);
        watch.stop();
        watch.reset();

        Assert.assertEquals(0L, watch.getTime());

        watch.start();
        Thread.sleep(20);
        Assert.assertTrue(watch.getTime() >= 20);
        watch.stop();
    }

    @Test
    public void testReset_fromRunningAndSplitState_resetsAllFields() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.split();
        watch.reset();
        Assert.assertEquals(0L, watch.getTime());
    }

    @Test
    public void testSplitAndUnsplit_normal_recordsAndClearsSplit() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(30);
        watch.split();
        long splitTime1 = watch.getSplitTime();
        String splitStr = watch.toSplitString();
        Assert.assertTrue(splitTime1 >= 30);
        Assert.assertNotNull(splitStr);

        Thread.sleep(30);
        long splitTime2 = watch.getSplitTime();
        Assert.assertEquals(splitTime1, splitTime2);

        watch.unsplit();
        Thread.sleep(20);
        Assert.assertTrue(watch.getTime() >= 80);
        watch.stop();
    }

    @Test(expected = IllegalStateException.class)
    public void testSplit_whenUnstarted_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.split();
    }

    @Test(expected = IllegalStateException.class)
    public void testSplit_whenStopped_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.split();
    }

    @Test(expected = IllegalStateException.class)
    public void testSplit_whenSuspended_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        watch.split();
    }

    @Test(expected = IllegalStateException.class)
    public void testUnsplit_whenNotSplit_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.unsplit();
    }

    @Test(expected = IllegalStateException.class)
    public void testUnsplit_whenUnstarted_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.unsplit();
    }

    @Test(expected = IllegalStateException.class)
    public void testGetSplitTime_whenNotSplit_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.getSplitTime();
    }

    @Test(expected = IllegalStateException.class)
    public void testToSplitString_whenNotSplit_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.toSplitString();
    }

    @Test
    public void testSuspendAndResume_normal_excludesSuspendedDuration() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(40);
        watch.suspend();
        long suspendTime = watch.getTime();
        Thread.sleep(50);
        Assert.assertEquals(suspendTime, watch.getTime());

        watch.resume();
        Thread.sleep(40);
        watch.stop();

        long totalTime = watch.getTime();
        Assert.assertTrue(totalTime >= 80);
        Assert.assertTrue(totalTime < 130);
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspend_whenUnstarted_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.suspend();
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspend_whenStopped_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.suspend();
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspend_whenAlreadySuspended_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        watch.suspend();
    }

    @Test(expected = IllegalStateException.class)
    public void testResume_whenUnstarted_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.resume();
    }

    @Test(expected = IllegalStateException.class)
    public void testResume_whenRunning_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.resume();
    }

    @Test(expected = IllegalStateException.class)
    public void testResume_whenStopped_throwsIllegalStateException() {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.resume();
    }

    @Test
    public void testToString_formattedProperlyAcrossStates() throws InterruptedException {
        StopWatch watch = new StopWatch();
        Assert.assertEquals("00:00:00.000", watch.toString());

        watch.start();
        Thread.sleep(20);
        String runningStr = watch.toString();
        Assert.assertTrue(runningStr.matches("\\d{2}:\\d{2}:\\d{2}\\.\\d{3}"));

        watch.suspend();
        String suspendedStr = watch.toString();
        Assert.assertTrue(suspendedStr.matches("\\d{2}:\\d{2}:\\d{2}\\.\\d{3}"));

        watch.resume();
        watch.stop();
        String stoppedStr = watch.toString();
        Assert.assertTrue(stoppedStr.matches("\\d{2}:\\d{2}:\\d{2}\\.\\d{3}"));
    }

    @Test(expected = RuntimeException.class)
    public void testGetTime_invalidInternalRunningState_throwsRuntimeException() throws Exception {
        StopWatch watch = new StopWatch();
        Field field = StopWatch.class.getDeclaredField("runningState");
        field.setAccessible(true);
        field.setInt(watch, 999);
        watch.getTime();
    }
}
