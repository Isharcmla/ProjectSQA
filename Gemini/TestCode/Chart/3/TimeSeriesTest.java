package org.jfree.data.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Assert;
import org.junit.Test;

public class TimeSeriesTest {

    private static class TestSeriesChangeListener implements SeriesChangeListener {
        private int changeCount = 0;
        private SeriesChangeEvent lastEvent;

        public void seriesChanged(SeriesChangeEvent event) {
            this.changeCount++;
            this.lastEvent = event;
        }

        public int getChangeCount() {
            return this.changeCount;
        }

        public void reset() {
            this.changeCount = 0;
            this.lastEvent = null;
        }
    }

    @Test
    public void testConstructor1_validName_createsEmptySeries() {
        TimeSeries series = new TimeSeries("Series A");
        Assert.assertEquals("Series A", series.getKey());
        Assert.assertEquals("Time", series.getDomainDescription());
        Assert.assertEquals("Value", series.getRangeDescription());
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertNull(series.getTimePeriodClass());
        Assert.assertTrue(Double.isNaN(series.getMinY()));
        Assert.assertTrue(Double.isNaN(series.getMaxY()));
        Assert.assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        Assert.assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
    }

    @Test
    public void testConstructor2_customDomainAndRange_setsAttributes() {
        TimeSeries series = new TimeSeries("Series B", "CustomDomain", "CustomRange");
        Assert.assertEquals("Series B", series.getKey());
        Assert.assertEquals("CustomDomain", series.getDomainDescription());
        Assert.assertEquals("CustomRange", series.getRangeDescription());
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertNull(series.getTimePeriodClass());
    }

    @Test
    public void testSetDomainDescription_changesValueAndFiresPropertyChange() {
        TimeSeries series = new TimeSeries("Series A");
        series.setDomainDescription("New Domain");
        Assert.assertEquals("New Domain", series.getDomainDescription());
        series.setDomainDescription(null);
        Assert.assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription_changesValueAndFiresPropertyChange() {
        TimeSeries series = new TimeSeries("Series A");
        series.setRangeDescription("New Range");
        Assert.assertEquals("New Range", series.getRangeDescription());
        series.setRangeDescription(null);
        Assert.assertNull(series.getRangeDescription());
    }

    @Test
    public void testGetItems_returnsUnmodifiableList() {
        TimeSeries series = new TimeSeries("Series A");
        series.add(new Day(1, 1, 2020), 10.0);
        List items = series.getItems();
        Assert.assertEquals(1, items.size());
        try {
            items.add(new TimeSeriesDataItem(new Day(2, 1, 2020), 20.0));
            Assert.fail("Modifying getItems() list should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testSetMaximumItemCount_valid_trimsDataWhenExceeded() {
        TimeSeries series = new TimeSeries("Series A");
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(2, 1, 2020), 20.0);
        series.add(new Day(3, 1, 2020), 30.0);
        Assert.assertEquals(3, series.getItemCount());

        series.setMaximumItemCount(2);
        Assert.assertEquals(2, series.getMaximumItemCount());
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
        Assert.assertEquals(new Day(3, 1, 2020), series.getTimePeriod(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCount_negative_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemAge_valid_removesOldItems() {
        TimeSeries series = new TimeSeries("Series A");
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(10, 1, 2020), 20.0);
        Assert.assertEquals(2, series.getItemCount());

        series.setMaximumItemAge(5);
        Assert.assertEquals(5, series.getMaximumItemAge());
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Day(10, 1, 2020), series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAge_negative_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testGetMinYAndMaxY_emptyAndWithValuesAndNaNs() {
        TimeSeries series = new TimeSeries("Series A");
        Assert.assertTrue(Double.isNaN(series.getMinY()));
        Assert.assertTrue(Double.isNaN(series.getMaxY()));

        series.add(new Day(1, 1, 2020), 5.0);
        Assert.assertEquals(5.0, series.getMinY(), 1e-9);
        Assert.assertEquals(5.0, series.getMaxY(), 1e-9);

        series.add(new Day(2, 1, 2020), (Number) null);
        Assert.assertEquals(5.0, series.getMinY(), 1e-9);
        Assert.assertEquals(5.0, series.getMaxY(), 1e-9);

        series.add(new Day(3, 1, 2020), 15.0);
        Assert.assertEquals(5.0, series.getMinY(), 1e-9);
        Assert.assertEquals(15.0, series.getMaxY(), 1e-9);

        series.add(new Day(4, 1, 2020), -2.0);
        Assert.assertEquals(-2.0, series.getMinY(), 1e-9);
        Assert.assertEquals(15.0, series.getMaxY(), 1e-9);

        series.add(new Day(5, 1, 2020), Double.NaN);
        Assert.assertEquals(-2.0, series.getMinY(), 1e-9);
        Assert.assertEquals(15.0, series.getMaxY(), 1e-9);
    }

    @Test
    public void testGetDataItem_intIndex() {
        TimeSeries series = new TimeSeries("Series A");
        Day day = new Day(1, 1, 2020);
        series.add(day, 10.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        Assert.assertEquals(day, item.getPeriod());
        Assert.assertEquals(new Double(10.0), item.getValue());

        // Verifying clone behavior (modifying returned clone does not affect series)
        item.setValue(new Double(99.0));
        Assert.assertEquals(new Double(10.0), series.getValue(0));
    }

    @Test
    public void testGetDataItem_regularTimePeriod() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series.add(day1, 10.0);

        TimeSeriesDataItem item = series.getDataItem(day1);
        Assert.assertNotNull(item);
        Assert.assertEquals(day1, item.getPeriod());

        Assert.assertNull(series.getDataItem(day2));
    }

    @Test
    public void testGetRawDataItem() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series.add(day1, 10.0);

        TimeSeriesDataItem rawByIndex = series.getRawDataItem(0);
        Assert.assertEquals(day1, rawByIndex.getPeriod());

        TimeSeriesDataItem rawByPeriod = series.getRawDataItem(day1);
        Assert.assertSame(rawByIndex, rawByPeriod);

        Assert.assertNull(series.getRawDataItem(day2));
    }

    @Test
    public void testGetNextTimePeriod() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        series.add(day1, 10.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        Assert.assertEquals(new Day(2, 1, 2020), next);
    }

    @Test
    public void testGetTimePeriods() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series.add(day1, 10.0);
        series.add(day2, 20.0);

        Collection periods = series.getTimePeriods();
        Assert.assertEquals(2, periods.size());
        Assert.assertTrue(periods.contains(day1));
        Assert.assertTrue(periods.contains(day2));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries s1 = new TimeSeries("S1");
        TimeSeries s2 = new TimeSeries("S2");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);

        s1.add(day1, 1.0);
        s1.add(day2, 2.0);

        s2.add(day2, 2.0);
        s2.add(day3, 3.0);

        Collection unique = s1.getTimePeriodsUniqueToOtherSeries(s2);
        Assert.assertEquals(1, unique.size());
        Assert.assertTrue(unique.contains(day3));
    }

    @Test
    public void testGetIndex() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);

        series.add(day1, 10.0);
        series.add(day3, 30.0);

        Assert.assertEquals(0, series.getIndex(day1));
        Assert.assertEquals(1, series.getIndex(day3));
        Assert.assertTrue(series.getIndex(day2) < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_null_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.getIndex(null);
    }

    @Test
    public void testGetValue() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series.add(day1, 10.0);

        Assert.assertEquals(new Double(10.0), series.getValue(0));
        Assert.assertEquals(new Double(10.0), series.getValue(day1));
        Assert.assertNull(series.getValue(day2));
    }

    @Test
    public void testAdd_variousOverloadsAndNotifyFlag() {
        TimeSeries series = new TimeSeries("Series A");
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);
        Day day4 = new Day(4, 1, 2020);

        series.add(new TimeSeriesDataItem(day1, 10.0));
        Assert.assertEquals(1, listener.getChangeCount());

        series.add(day2, 20.0);
        Assert.assertEquals(2, listener.getChangeCount());

        series.add(day3, 30.0, false);
        Assert.assertEquals(2, listener.getChangeCount());

        series.add(day4, new Double(40.0));
        Assert.assertEquals(3, listener.getChangeCount());

        Day day5 = new Day(5, 1, 2020);
        series.add(day5, new Double(50.0), false);
        Assert.assertEquals(3, listener.getChangeCount());

        Assert.assertEquals(5, series.getItemCount());
        Assert.assertEquals(Day.class, series.getTimePeriodClass());
    }

    @Test
    public void testAdd_outOfOrderInsertion() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);

        series.add(day1, 10.0);
        series.add(day3, 30.0);
        series.add(day2, 20.0); // should be inserted at index 1

        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(day1, series.getTimePeriod(0));
        Assert.assertEquals(day2, series.getTimePeriod(1));
        Assert.assertEquals(day3, series.getTimePeriod(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullItem_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_incompatibleTimePeriodClass_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Year(2020), 20.0);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_duplicatePeriod_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        series.add(day1, 10.0);
        series.add(day1, 20.0);
    }

    @Test
    public void testAdd_exceedingMaxItemCountRemovesOldestAndUpdatesBounds() {
        TimeSeries series = new TimeSeries("Series A");
        series.setMaximumItemCount(2);

        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);

        series.add(day1, 100.0);
        series.add(day2, 20.0);
        Assert.assertEquals(100.0, series.getMaxY(), 1e-9);

        series.add(day3, 30.0); // day1 (value 100.0) should be dropped
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(day2, series.getTimePeriod(0));
        Assert.assertEquals(day3, series.getTimePeriod(1));
        Assert.assertEquals(20.0, series.getMinY(), 1e-9);
        Assert.assertEquals(30.0, series.getMaxY(), 1e-9);
    }

    @Test
    public void testUpdate_byIndexAndByPeriod() {
        TimeSeries series = new TimeSeries("Series A");
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);

        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        listener.reset();

        // Update within current min/max bounds
        series.update(1, 25.0);
        Assert.assertEquals(1, listener.getChangeCount());
        Assert.assertEquals(new Double(25.0), series.getValue(1));
        Assert.assertEquals(10.0, series.getMinY(), 1e-9);
        Assert.assertEquals(30.0, series.getMaxY(), 1e-9);

        // Update which changes minY by iteration
        series.update(0, 50.0); // previously min was 10.0 at index 0
        Assert.assertEquals(25.0, series.getMinY(), 1e-9);
        Assert.assertEquals(50.0, series.getMaxY(), 1e-9);

        // Update by period
        series.update(day2, 100.0);
        Assert.assertEquals(100.0, series.getMaxY(), 1e-9);
    }

    @Test(expected = SeriesException.class)
    public void testUpdate_nonExistingPeriod_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.add(new Day(1, 1, 2020), 10.0);
        series.update(new Day(2, 1, 2020), 20.0);
    }

    @Test
    public void testAddOrUpdate_doubleAndNumberAndItem() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);

        // Add brand new item
        TimeSeriesDataItem overwritten1 = series.addOrUpdate(day1, 10.0);
        Assert.assertNull(overwritten1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(10.0, series.getMinY(), 1e-9);
        Assert.assertEquals(10.0, series.getMaxY(), 1e-9);

        // Overwrite existing item with double
        TimeSeriesDataItem overwritten2 = series.addOrUpdate(day1, 20.0);
        Assert.assertNotNull(overwritten2);
        Assert.assertEquals(new Double(10.0), overwritten2.getValue());
        Assert.assertEquals(new Double(20.0), series.getValue(day1));

        // Add with Number
        TimeSeriesDataItem overwritten3 = series.addOrUpdate(day2, new Double(30.0));
        Assert.assertNull(overwritten3);
        Assert.assertEquals(2, series.getItemCount());

        // Overwrite existing item with null value
        TimeSeriesDataItem overwritten4 = series.addOrUpdate(day2, (Number) null);
        Assert.assertNotNull(overwritten4);
        Assert.assertEquals(new Double(30.0), overwritten4.getValue());
        Assert.assertNull(series.getValue(day2));
    }

    @Test
    public void testAddOrUpdate_triggersMaxItemCountRemoval() {
        TimeSeries series = new TimeSeries("Series A");
        series.setMaximumItemCount(1);

        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);

        series.addOrUpdate(day1, 10.0);
        series.addOrUpdate(day2, 20.0);

        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(day2, series.getTimePeriod(0));
        Assert.assertEquals(20.0, series.getMinY(), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_nullItem_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.addOrUpdate((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddOrUpdate_incompatibleTimePeriodClass_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.addOrUpdate(new Day(1, 1, 2020), 10.0);
        series.addOrUpdate(new Year(2020), 20.0);
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries series1 = new TimeSeries("Series 1");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series1.add(day1, 10.0);
        series1.add(day2, 20.0);

        TimeSeries series2 = new TimeSeries("Series 2");
        Day day3 = new Day(3, 1, 2020);
        series2.add(day2, 200.0);
        series2.add(day3, 300.0);

        TimeSeries overwritten = series1.addAndOrUpdate(series2);

        Assert.assertEquals(3, series1.getItemCount());
        Assert.assertEquals(new Double(200.0), series1.getValue(day2));
        Assert.assertEquals(new Double(300.0), series1.getValue(day3));

        Assert.assertEquals(1, overwritten.getItemCount());
        Assert.assertEquals(new Double(20.0), overwritten.getValue(day2));
    }

    @Test
    public void testRemoveAgedItems_byTimePeriod_and_byMillis() {
        TimeSeries series = new TimeSeries("Series A");
        series.setMaximumItemAge(2);

        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);
        Day day5 = new Day(5, 1, 2020);

        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        Assert.assertEquals(3, series.getItemCount());

        // Adding day5 exceeds max age 2 (5 - 1 = 4 > 2, 5 - 2 = 3 > 2)
        series.add(day5, 50.0);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(day3, series.getTimePeriod(0));
        Assert.assertEquals(day5, series.getTimePeriod(1));

        // Test removeAgedItems(long latest, boolean notify)
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        Day day10 = new Day(10, 1, 2020);
        series.removeAgedItems(day10.getMiddleMillisecond(), true);
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertTrue(listener.getChangeCount() > 0);

        // Calling on empty series
        series.removeAgedItems(day10.getMiddleMillisecond(), true);
    }

    @Test
    public void testClear() {
        TimeSeries series = new TimeSeries("Series A");
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        series.clear(); // Empty series clear does nothing
        Assert.assertEquals(0, listener.getChangeCount());

        series.add(new Day(1, 1, 2020), 10.0);
        Assert.assertNotNull(series.getTimePeriodClass());
        Assert.assertEquals(1, listener.getChangeCount());

        series.clear();
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertNull(series.getTimePeriodClass());
        Assert.assertTrue(Double.isNaN(series.getMinY()));
        Assert.assertTrue(Double.isNaN(series.getMaxY()));
        Assert.assertEquals(2, listener.getChangeCount());
    }

    @Test
    public void testDelete_byPeriod() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series.add(day1, 10.0);
        series.add(day2, 20.0);

        series.delete(day1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(day2, series.getTimePeriod(0));
        Assert.assertEquals(20.0, series.getMinY(), 1e-9);

        // Delete non-existent period (should do nothing)
        series.delete(day1);
        Assert.assertEquals(1, series.getItemCount());

        // Delete the last item (should reset timePeriodClass)
        series.delete(day2);
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertNull(series.getTimePeriodClass());
    }

    @Test
    public void testDelete_range() {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);

        series.delete(0, 1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(day3, series.getTimePeriod(0));

        series.delete(0, 0, false);
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertNull(series.getTimePeriodClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelete_invalidRange_throwsException() {
        TimeSeries series = new TimeSeries("Series A");
        series.add(new Day(1, 1, 2020), 10.0);
        series.delete(1, 0);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A", "Domain", "Range");
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(2, 1, 2020), 20.0);

        TimeSeries clone = (TimeSeries) series.clone();
        Assert.assertNotSame(series, clone);
        Assert.assertEquals(series, clone);

        // Ensure deep clone of items
        clone.add(new Day(3, 1, 2020), 30.0);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(3, clone.getItemCount());
    }

    @Test
    public void testCreateCopy_indices() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);

        TimeSeries copy = series.createCopy(1, 2);
        Assert.assertEquals(2, copy.getItemCount());
        Assert.assertEquals(day2, copy.getTimePeriod(0));
        Assert.assertEquals(day3, copy.getTimePeriod(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_negativeStart_throwsException() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A");
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_endLessThanStart_throwsException() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A");
        series.createCopy(1, 0);
    }

    @Test
    public void testCreateCopy_regularTimePeriods() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);
        Day day4 = new Day(4, 1, 2020);
        Day day5 = new Day(5, 1, 2020);

        series.add(day2, 20.0);
        series.add(day4, 40.0);

        // Exact match
        TimeSeries copy1 = series.createCopy(day2, day4);
        Assert.assertEquals(2, copy1.getItemCount());

        // Range covering outside
        TimeSeries copy2 = series.createCopy(day1, day5);
        Assert.assertEquals(2, copy2.getItemCount());

        // Range with no elements (before first element)
        TimeSeries copy3 = series.createCopy(day1, day1);
        Assert.assertEquals(0, copy3.getItemCount());

        // Range with no elements (after last element)
        TimeSeries copy4 = series.createCopy(day5, day5);
        Assert.assertEquals(0, copy4.getItemCount());

        // Range strictly between elements
        TimeSeries copy5 = series.createCopy(day3, day3);
        Assert.assertEquals(0, copy5.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_nullStart_throwsException() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A");
        series.createCopy(null, new Day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_nullEnd_throwsException() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A");
        series.createCopy(new Day(1, 1, 2020), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_startAfterEnd_throwsException() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A");
        series.createCopy(new Day(2, 1, 2020), new Day(1, 1, 2020));
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries s1 = new TimeSeries("Series 1", "Domain 1", "Range 1");
        TimeSeries s2 = new TimeSeries("Series 1", "Domain 1", "Range 1");

        // Identity and basic equality
        Assert.assertTrue(s1.equals(s1));
        Assert.assertFalse(s1.equals(null));
        Assert.assertFalse(s1.equals("Not a TimeSeries"));
        Assert.assertTrue(s1.equals(s2));
        Assert.assertEquals(s1.hashCode(), s2.hashCode());

        // Key difference
        TimeSeries sDiffKey = new TimeSeries("Series Diff", "Domain 1", "Range 1");
        Assert.assertFalse(s1.equals(sDiffKey));

        // Domain difference
        s2.setDomainDescription("Domain Diff");
        Assert.assertFalse(s1.equals(s2));
        s2.setDomainDescription("Domain 1");

        // Range difference
        s2.setRangeDescription("Range Diff");
        Assert.assertFalse(s1.equals(s2));
        s2.setRangeDescription("Range 1");

        // MaximumItemAge difference
        s2.setMaximumItemAge(100);
        Assert.assertFalse(s1.equals(s2));
        s2.setMaximumItemAge(Long.MAX_VALUE);

        // MaximumItemCount difference
        s2.setMaximumItemCount(50);
        Assert.assertFalse(s1.equals(s2));
        s2.setMaximumItemCount(Integer.MAX_VALUE);

        // Data difference (1 item vs 0 items)
        Day day1 = new Day(1, 1, 2020);
        s1.add(day1, 10.0);
        Assert.assertFalse(s1.equals(s2));

        s2.add(day1, 20.0);
        Assert.assertFalse(s1.equals(s2));

        s2.update(day1, 10.0);
        Assert.assertTrue(s1.equals(s2));
        Assert.assertEquals(s1.hashCode(), s2.hashCode());

        // Test hash code with multiple items (branches for count 1, 2, 3+)
        Day day2 = new Day(2, 1, 2020);
        Day day3 = new Day(3, 1, 2020);
        s1.add(day2, 20.0);
        s2.add(day2, 20.0);
        Assert.assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(day3, 30.0);
        s2.add(day3, 30.0);
        Assert.assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void testSerialization() throws Exception {
        TimeSeries s1 = new TimeSeries("Series A", "Domain", "Range");
        s1.add(new Day(1, 1, 2020), 100.0);
        s1.add(new Day(2, 1, 2020), 200.0);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(s1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        TimeSeries s2 = (TimeSeries) in.readObject();
        in.close();

        Assert.assertEquals(s1, s2);
        Assert.assertEquals(s1.getMinY(), s2.getMinY(), 1e-9);
        Assert.assertEquals(s1.getMaxY(), s2.getMaxY(), 1e-9);
    }
}
