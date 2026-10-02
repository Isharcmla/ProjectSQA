import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import org.apache.commons.lang.time.StopWatch;

public class StopWatchTest {

    private StopWatch stopWatch;

    @Before
    public void setUp() {
        stopWatch = new StopWatch();
    }

    // ---------- start() ----------

    @Test
    public void testStart_normal_startsSuccessfully() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testStart_calledTwice_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.start();
    }

    @Test(expected = IllegalStateException.class)
    public void testStart_afterStop_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.stop();
        stopWatch.start();
    }

    @Test
    public void testStart_afterReset_startsSuccessfully() {
        stopWatch.start();
        stopWatch.stop();
        stopWatch.reset();
        stopWatch.start();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    // ---------- stop() ----------

    @Test
    public void testStop_afterStart_stopsSuccessfully() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        stopWatch.stop();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testStop_beforeStart_throwsIllegalStateException() {
        stopWatch.stop();
    }

    @Test
    public void testStop_afterSuspend_stopsSuccessfully() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(5);
        stopWatch.suspend();
        stopWatch.stop();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testStop_calledTwice_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.stop();
        stopWatch.stop();
    }

    // ---------- reset() ----------

    @Test
    public void testReset_afterStartStop_resetsToUnstarted() {
        stopWatch.start();
        stopWatch.stop();
        stopWatch.reset();
        long time = stopWatch.getTime();
        Assert.assertEquals(0, time);
    }

    @Test
    public void testReset_withoutStart_doesNotThrow() {
        stopWatch.reset();
        long time = stopWatch.getTime();
        Assert.assertEquals(0, time);
    }

    // ---------- split() ----------

    @Test
    public void testSplit_afterStart_splitsSuccessfully() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        stopWatch.split();
        long splitTime = stopWatch.getSplitTime();
        Assert.assertTrue(splitTime >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testSplit_beforeStart_throwsIllegalStateException() {
        stopWatch.split();
    }

    @Test(expected = IllegalStateException.class)
    public void testSplit_calledTwice_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.split();
        stopWatch.split();
    }

    // ---------- unsplit() ----------

    @Test
    public void testUnsplit_afterSplit_unsplitsSuccessfully() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(5);
        stopWatch.split();
        stopWatch.unsplit();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testUnsplit_withoutSplit_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.unsplit();
    }

    @Test(expected = IllegalStateException.class)
    public void testUnsplit_beforeStart_throwsIllegalStateException() {
        stopWatch.unsplit();
    }

    // ---------- suspend() ----------

    @Test
    public void testSuspend_afterStart_suspendsSuccessfully() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(5);
        stopWatch.suspend();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspend_beforeStart_throwsIllegalStateException() {
        stopWatch.suspend();
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspend_calledTwice_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.suspend();
        stopWatch.suspend();
    }

    // ---------- resume() ----------

    @Test
    public void testResume_afterSuspend_resumesSuccessfully() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(5);
        stopWatch.suspend();
        Thread.sleep(5);
        stopWatch.resume();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testResume_withoutSuspend_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.resume();
    }

    @Test(expected = IllegalStateException.class)
    public void testResume_beforeStart_throwsIllegalStateException() {
        stopWatch.resume();
    }

    // ---------- getTime() ----------

    @Test
    public void testGetTime_whenUnstarted_returnsZero() {
        long time = stopWatch.getTime();
        Assert.assertEquals(0, time);
    }

    @Test
    public void testGetTime_whenRunning_returnsPositiveTime() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test
    public void testGetTime_whenStopped_returnsStoppedTime() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        stopWatch.stop();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    @Test
    public void testGetTime_whenSuspended_returnsSuspendedTime() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        stopWatch.suspend();
        long time = stopWatch.getTime();
        Assert.assertTrue(time >= 0);
    }

    // ---------- getSplitTime() ----------

    @Test
    public void testGetSplitTime_afterSplit_returnsSplitTime() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        stopWatch.split();
        long splitTime = stopWatch.getSplitTime();
        Assert.assertTrue(splitTime >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetSplitTime_withoutSplit_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.getSplitTime();
    }

    @Test(expected = IllegalStateException.class)
    public void testGetSplitTime_beforeStart_throwsIllegalStateException() {
        stopWatch.getSplitTime();
    }

    // ---------- toString() ----------

    @Test
    public void testToString_whenUnstarted_returnsFormattedZeroTime() {
        String result = stopWatch.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 0);
    }

    @Test
    public void testToString_afterStop_returnsFormattedTime() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        stopWatch.stop();
        String result = stopWatch.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 0);
    }

    // ---------- toSplitString() ----------

    @Test
    public void testToSplitString_afterSplit_returnsFormattedSplitTime() throws InterruptedException {
        stopWatch.start();
        Thread.sleep(10);
        stopWatch.split();
        String result = stopWatch.toSplitString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testToSplitString_withoutSplit_throwsIllegalStateException() {
        stopWatch.start();
        stopWatch.toSplitString();
    }
}
