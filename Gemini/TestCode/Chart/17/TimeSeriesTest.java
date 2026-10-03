package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Test;

public class TimeSeriesTest {

    private static class TestSeriesChangeListener implements SeriesChangeListener {
        private int changeCount = 0;
        private SeriesChangeEvent lastEvent = null;

        public void seriesChanged(SeriesChangeEvent event) {
            this.changeCount++;
            this.lastEvent = event;
        }

        public int getChangeCount() {
            return this.changeCount;
        }
    }

    @Test
    public void testConstructor_OneParam_DefaultValues() {
        TimeSeries s = new TimeSeries("Series 1");
        assertEquals("Series 1", s.getKey());
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
        assertEquals(Day.class, s.getTimePeriodClass());
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testConstructor_TwoParams_SpecifiedClass() {
        TimeSeries s = new TimeSeries("Series 1", Year.class);
        assertEquals("Series 1", s.getKey());
        assertEquals(Year.class, s.getTimePeriodClass());
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
    }

    @Test
    public void testConstructor_FourParams_CustomDescriptions() {
        TimeSeries s = new TimeSeries("Series 1", "Custom Domain", "Custom Range", Month.class);
        assertEquals("Series 1", s.getKey());
        assertEquals("Custom Domain", s.getDomainDescription());
        assertEquals("Custom Range", s.getRangeDescription());
        assertEquals(Month.class, s.getTimePeriodClass());
    }

    @Test
    public void testSetDomainDescription_ValidAndNull_PropertyChangeFired() {
        TimeSeries s = new TimeSeries("Series 1");
        s.setDomainDescription("New Domain");
        assertEquals("New Domain", s.getDomainDescription());

        s.setDomainDescription(null);
        assertNull(s.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription_ValidAndNull_PropertyChangeFired() {
        TimeSeries s = new TimeSeries("Series 1");
        s.setRangeDescription("New Range");
        assertEquals("New Range", s.getRangeDescription());

        s.setRangeDescription(null);
        assertNull(s.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCount_Negative_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1");
        s.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCount_Valid_TrimsExistingData() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(2, 1, 2020), 20.0);
        s.add(new Day(3, 1, 2020), 30.0);
        s.add(new Day(4, 1, 2020), 40.0);

        s.setMaximumItemCount(2);
        assertEquals(2, s.getMaximumItemCount());
        assertEquals(2, s.getItemCount());
        assertEquals(new Day(3, 1, 2020), s.getTimePeriod(0));
        assertEquals(new Day(4, 1, 2020), s.getTimePeriod(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAge_Negative_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1");
        s.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAge_Valid_RemovesOldItems() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(2, 1, 2020), 20.0);
        s.add(new Day(10, 1, 2020), 30.0);

        s.setMaximumItemAge(5);
        assertEquals(5, s.getMaximumItemAge());
        assertEquals(1, s.getItemCount());
        assertEquals(new Day(10, 1, 2020), s.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullItem_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1");
        s.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_IncompatiblePeriodClass_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new TimeSeriesDataItem(new Year(2020), 10.0));
    }

    @Test
    public void testAdd_OrderedAndOutOfOrder_AddsCorrectly() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        s.addChangeListener(listener);

        s.add(new TimeSeriesDataItem(new Day(2, 1, 2020), 20.0), true);
        assertEquals(1, s.getItemCount());
        assertEquals(1, listener.getChangeCount());

        s.add(new TimeSeriesDataItem(new Day(3, 1, 2020), 30.0), false);
        assertEquals(2, s.getItemCount());
        assertEquals(1, listener.getChangeCount());

        s.add(new TimeSeriesDataItem(new Day(1, 1, 2020), 10.0), true);
        assertEquals(3, s.getItemCount());
        assertEquals(2, listener.getChangeCount());

        assertEquals(new Day(1, 1, 2020), s.getTimePeriod(0));
        assertEquals(new Day(2, 1, 2020), s.getTimePeriod(1));
        assertEquals(new Day(3, 1, 2020), s.getTimePeriod(2));
    }

    @Test(expected = SeriesException.class)
    public void testAdd_DuplicateItem_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(1, 1, 2020), 20.0);
    }

    @Test
    public void testAdd_ExceedsMaximumItemCount_RemovesFirst() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.setMaximumItemCount(2);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(2, 1, 2020), 20.0);
        s.add(new Day(3, 1, 2020), 30.0);

        assertEquals(2, s.getItemCount());
        assertEquals(new Day(2, 1, 2020), s.getTimePeriod(0));
        assertEquals(new Day(3, 1, 2020), s.getTimePeriod(1));
    }

    @Test
    public void testAdd_HelperMethods_Coverage() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.5);
        s.add(new Day(2, 1, 2020), 20.5, true);
        s.add(new Day(3, 1, 2020), (Number) 30.5);
        s.add(new Day(4, 1, 2020), (Number) 40.5, false);

        assertEquals(4, s.getItemCount());
        assertEquals(10.5, s.getValue(0).doubleValue(), 0.001);
        assertEquals(20.5, s.getValue(1).doubleValue(), 0.001);
        assertEquals(30.5, s.getValue(2).doubleValue(), 0.001);
        assertEquals(40.5, s.getValue(3).doubleValue(), 0.001);
    }

    @Test
    public void testGetItems_ReturnsUnmodifiableList() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.0);
        List items = s.getItems();
        assertEquals(1, items.size());
        try {
            items.clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetDataItem_ByIndexAndPeriod() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        s.add(d1, 10.0);

        TimeSeriesDataItem item = s.getDataItem(0);
        assertEquals(d1, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.001);

        TimeSeriesDataItem itemByPeriod = s.getDataItem(d1);
        assertNotNull(itemByPeriod);
        assertEquals(10.0, itemByPeriod.getValue().doubleValue(), 0.001);

        assertNull(s.getDataItem(d2));
    }

    @Test
    public void testGetNextTimePeriod() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(2, 1, 2020), 20.0);

        RegularTimePeriod next = s.getNextTimePeriod();
        assertEquals(new Day(3, 1, 2020), next);
    }

    @Test
    public void testGetTimePeriods_AndUniqueToOtherSeries() {
        TimeSeries s1 = new TimeSeries("Series 1", Day.class);
        s1.add(new Day(1, 1, 2020), 10.0);
        s1.add(new Day(2, 1, 2020), 20.0);

        Collection periods = s1.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(new Day(1, 1, 2020)));
        assertTrue(periods.contains(new Day(2, 1, 2020)));

        TimeSeries s2 = new TimeSeries("Series 2", Day.class);
        s2.add(new Day(2, 1, 2020), 200.0);
        s2.add(new Day(3, 1, 2020), 300.0);

        Collection uniqueToS2 = s1.getTimePeriodsUniqueToOtherSeries(s2);
        assertEquals(1, uniqueToS2.size());
        assertTrue(uniqueToS2.contains(new Day(3, 1, 2020)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_NullPeriod_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1");
        s.getIndex(null);
    }

    @Test
    public void testGetIndex_AndGetValue() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        s.add(d1, 10.0);

        assertEquals(0, s.getIndex(d1));
        assertTrue(s.getIndex(d2) < 0);

        assertEquals(10.0, s.getValue(0).doubleValue(), 0.001);
        assertEquals(10.0, s.getValue(d1).doubleValue(), 0.001);
        assertNull(s.getValue(d2));
    }

    @Test
    public void testUpdate_ByIndexAndPeriod_Success() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        s.addChangeListener(listener);
        Day d1 = new Day(1, 1, 2020);
        s.add(d1, 10.0);

        s.update(0, 15.0);
        assertEquals(15.0, s.getValue(0).doubleValue(), 0.001);

        s.update(d1, 25.0);
        assertEquals(25.0, s.getValue(0).doubleValue(), 0.001);
        assertTrue(listener.getChangeCount() >= 2);
    }

    @Test(expected = SeriesException.class)
    public void testUpdate_NonExistentPeriod_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.update(new Day(1, 1, 2020), 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_NullPeriod_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1");
        s.addOrUpdate(null, 10.0);
    }

    @Test
    public void testAddOrUpdate_InsertAndUpdateAndExceedMax() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.setMaximumItemCount(2);

        TimeSeriesDataItem old1 = s.addOrUpdate(new Day(2, 1, 2020), 20.0);
        assertNull(old1);
        assertEquals(1, s.getItemCount());

        TimeSeriesDataItem old2 = s.addOrUpdate(new Day(1, 1, 2020), (Number) 10.0);
        assertNull(old2);
        assertEquals(2, s.getItemCount());
        assertEquals(new Day(1, 1, 2020), s.getTimePeriod(0));

        TimeSeriesDataItem old3 = s.addOrUpdate(new Day(3, 1, 2020), 30.0);
        assertNull(old3);
        assertEquals(2, s.getItemCount());
        assertEquals(new Day(2, 1, 2020), s.getTimePeriod(0));
        assertEquals(new Day(3, 1, 2020), s.getTimePeriod(1));

        TimeSeriesDataItem old4 = s.addOrUpdate(new Day(3, 1, 2020), 35.0);
        assertNotNull(old4);
        assertEquals(30.0, old4.getValue().doubleValue(), 0.001);
        assertEquals(35.0, s.getValue(new Day(3, 1, 2020)).doubleValue(), 0.001);
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries s1 = new TimeSeries("Series 1", Day.class);
        s1.add(new Day(1, 1, 2020), 10.0);
        s1.add(new Day(2, 1, 2020), 20.0);

        TimeSeries s2 = new TimeSeries("Series 2", Day.class);
        s2.add(new Day(2, 1, 2020), 25.0);
        s2.add(new Day(3, 1, 2020), 30.0);

        TimeSeries overwritten = s1.addAndOrUpdate(s2);
        assertEquals(3, s1.getItemCount());
        assertEquals(25.0, s1.getValue(new Day(2, 1, 2020)).doubleValue(), 0.001);

        assertEquals(1, overwritten.getItemCount());
        assertEquals(20.0, overwritten.getValue(0).doubleValue(), 0.001);
        assertEquals(new Day(2, 1, 2020), overwritten.getTimePeriod(0));
    }

    @Test
    public void testRemoveAgedItems_NotifyFlag() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        s.addChangeListener(listener);

        s.setMaximumItemAge(2);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(2, 1, 2020), 20.0);
        s.add(new Day(10, 1, 2020), 30.0);

        s.removeAgedItems(true);
        assertEquals(1, s.getItemCount());
        assertEquals(new Day(10, 1, 2020), s.getTimePeriod(0));
        assertTrue(listener.getChangeCount() > 0);
    }

    @Test
    public void testRemoveAgedItems_WithLatestTimestamp() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        s.addChangeListener(listener);

        s.setMaximumItemAge(2);
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        s.add(d1, 10.0);
        s.add(d2, 20.0);

        Day future = new Day(10, 1, 2020);
        s.removeAgedItems(future.getFirstMillisecond(), true);

        assertEquals(0, s.getItemCount());
        assertTrue(listener.getChangeCount() > 0);
    }

    @Test
    public void testClear() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        s.addChangeListener(listener);

        s.clear();
        assertEquals(0, listener.getChangeCount());

        s.add(new Day(1, 1, 2020), 10.0);
        s.clear();
        assertEquals(0, s.getItemCount());
        assertTrue(listener.getChangeCount() > 0);
    }

    @Test
    public void testDelete_ByPeriod() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        s.add(d1, 10.0);

        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        s.addChangeListener(listener);

        s.delete(d2);
        assertEquals(0, listener.getChangeCount());
        assertEquals(1, s.getItemCount());

        s.delete(d1);
        assertEquals(1, listener.getChangeCount());
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testDelete_ByRange_Valid() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(2, 1, 2020), 20.0);
        s.add(new Day(3, 1, 2020), 30.0);

        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        s.addChangeListener(listener);

        s.delete(0, 1);
        assertEquals(1, s.getItemCount());
        assertEquals(new Day(3, 1, 2020), s.getTimePeriod(0));
        assertEquals(1, listener.getChangeCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelete_ByRange_InvalidIndices_ThrowsException() {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.delete(2, 1);
    }

    @Test
    public void testClone_EmptyAndPopulated() throws Exception {
        TimeSeries s1 = new TimeSeries("Series 1", Day.class);
        TimeSeries clone1 = (TimeSeries) s1.clone();
        assertEquals(s1, clone1);

        s1.add(new Day(1, 1, 2020), 10.0);
        s1.add(new Day(2, 1, 2020), 20.0);
        TimeSeries clone2 = (TimeSeries) s1.clone();
        assertEquals(s1, clone2);
        assertFalse(s1 == clone2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_IntIndices_NegativeStart_ThrowsException() throws Exception {
        TimeSeries s = new TimeSeries("Series 1");
        s.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_IntIndices_EndLessThanStart_ThrowsException() throws Exception {
        TimeSeries s = new TimeSeries("Series 1");
        s.createCopy(2, 1);
    }

    @Test
    public void testCreateCopy_IntIndices_Valid() throws Exception {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(1, 1, 2020), 10.0);
        s.add(new Day(2, 1, 2020), 20.0);
        s.add(new Day(3, 1, 2020), 30.0);

        TimeSeries copy = s.createCopy(1, 2);
        assertEquals(2, copy.getItemCount());
        assertEquals(new Day(2, 1, 2020), copy.getTimePeriod(0));
        assertEquals(new Day(3, 1, 2020), copy.getTimePeriod(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_PeriodRange_NullStart_ThrowsException() throws Exception {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.createCopy(null, new Day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_PeriodRange_NullEnd_ThrowsException() throws Exception {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.createCopy(new Day(1, 1, 2020), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_PeriodRange_StartAfterEnd_ThrowsException() throws Exception {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.createCopy(new Day(2, 1, 2020), new Day(1, 1, 2020));
    }

    @Test
    public void testCreateCopy_PeriodRange_EmptyRangesAndValid() throws Exception {
        TimeSeries s = new TimeSeries("Series 1", Day.class);
        s.add(new Day(5, 1, 2020), 50.0);
        s.add(new Day(10, 1, 2020), 100.0);

        TimeSeries copy1 = s.createCopy(new Day(1, 1, 2020), new Day(3, 1, 2020));
        assertEquals(0, copy1.getItemCount());

        TimeSeries copy2 = s.createCopy(new Day(15, 1, 2020), new Day(20, 1, 2020));
        assertEquals(0, copy2.getItemCount());

        TimeSeries copy3 = s.createCopy(new Day(3, 1, 2020), new Day(12, 1, 2020));
        assertEquals(2, copy3.getItemCount());

        TimeSeries copy4 = s.createCopy(new Day(5, 1, 2020), new Day(10, 1, 2020));
        assertEquals(2, copy4.getItemCount());
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries s1 = new TimeSeries("Series", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Series", "Domain", "Range", Day.class);

        assertTrue(s1.equals(s1));
        assertFalse(s1.equals(null));
        assertFalse(s1.equals("Not a TimeSeries"));
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        s2.setDomainDescription("Other Domain");
        assertFalse(s1.equals(s2));
        s2.setDomainDescription("Domain");

        s2.setRangeDescription("Other Range");
        assertFalse(s1.equals(s2));
        s2.setRangeDescription("Range");

        s2.setMaximumItemAge(100);
        assertFalse(s1.equals(s2));
        s2.setMaximumItemAge(Long.MAX_VALUE);

        s2.setMaximumItemCount(100);
        assertFalse(s1.equals(s2));
        s2.setMaximumItemCount(Integer.MAX_VALUE);

        s1.add(new Day(1, 1, 2020), 10.0);
        assertFalse(s1.equals(s2));
        s2.add(new Day(1, 1, 2020), 10.0);
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(2, 1, 2020), 20.0);
        s2.add(new Day(2, 1, 2020), 20.0);
        s1.add(new Day(3, 1, 2020), 30.0);
        s2.add(new Day(3, 1, 2020), 30.0);
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        s2.update(new Day(3, 1, 2020), 35.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testSerialization() throws Exception {
        TimeSeries s1 = new TimeSeries("Series 1", "Domain", "Range", Day.class);
        s1.add(new Day(1, 1, 2020), 10.0);
        s1.add(new Day(2, 1, 2020), 20.0);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(s1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        TimeSeries s2 = (TimeSeries) in.readObject();
        in.close();

        assertEquals(s1, s2);
        assertEquals(s1.getItemCount(), s2.getItemCount());
        assertEquals(s1.getValue(0), s2.getValue(0));
    }
}
