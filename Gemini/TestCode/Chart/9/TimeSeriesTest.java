package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;

public class TimeSeriesTest implements SeriesChangeListener, PropertyChangeListener {

    private boolean seriesChangeReceived;
    private PropertyChangeEvent propertyChangeEventReceived;
    private TimeSeries dailySeries;

    @Before
    public void setUp() {
        this.seriesChangeReceived = false;
        this.propertyChangeEventReceived = null;
        this.dailySeries = new TimeSeries("Test Series", Day.class);
        this.dailySeries.addChangeListener(this);
        this.dailySeries.addPropertyChangeListener(this);
    }

    public void seriesChanged(SeriesChangeEvent event) {
        this.seriesChangeReceived = true;
    }

    public void propertyChange(PropertyChangeEvent event) {
        this.propertyChangeEventReceived = event;
    }

    @Test
    public void testConstructors() {
        TimeSeries s1 = new TimeSeries("Series 1");
        assertEquals("Series 1", s1.getKey());
        assertEquals("Time", s1.getDomainDescription());
        assertEquals("Value", s1.getRangeDescription());
        assertEquals(Day.class, s1.getTimePeriodClass());
        assertEquals(0, s1.getItemCount());
        assertEquals(Integer.MAX_VALUE, s1.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s1.getMaximumItemAge());

        TimeSeries s2 = new TimeSeries("Series 2", Year.class);
        assertEquals("Series 2", s2.getKey());
        assertEquals(Year.class, s2.getTimePeriodClass());

        TimeSeries s3 = new TimeSeries("Series 3", "Domain", "Range", Month.class);
        assertEquals("Series 3", s3.getKey());
        assertEquals("Domain", s3.getDomainDescription());
        assertEquals("Range", s3.getRangeDescription());
        assertEquals(Month.class, s3.getTimePeriodClass());
    }

    @Test
    public void testDomainAndRangeDescription() {
        dailySeries.setDomainDescription("New Domain");
        assertEquals("New Domain", dailySeries.getDomainDescription());
        assertNotNull(this.propertyChangeEventReceived);
        assertEquals("Domain", this.propertyChangeEventReceived.getPropertyName());
        assertEquals("New Domain", this.propertyChangeEventReceived.getNewValue());

        dailySeries.setRangeDescription("New Range");
        assertEquals("New Range", dailySeries.getRangeDescription());
        assertNotNull(this.propertyChangeEventReceived);
        assertEquals("Range", this.propertyChangeEventReceived.getPropertyName());
        assertEquals("New Range", this.propertyChangeEventReceived.getNewValue());

        dailySeries.setDomainDescription(null);
        assertNull(dailySeries.getDomainDescription());

        dailySeries.setRangeDescription(null);
        assertNull(dailySeries.getRangeDescription());
    }

    @Test
    public void testAdd_TimeSeriesDataItem_Success() {
        Day d1 = new Day(1, 1, 2020);
        TimeSeriesDataItem item1 = new TimeSeriesDataItem(d1, 100.0);
        this.seriesChangeReceived = false;

        dailySeries.add(item1);

        assertEquals(1, dailySeries.getItemCount());
        assertEquals(item1, dailySeries.getDataItem(0));
        assertTrue(this.seriesChangeReceived);

        Day d2 = new Day(2, 1, 2020);
        TimeSeriesDataItem item2 = new TimeSeriesDataItem(d2, 200.0);
        this.seriesChangeReceived = false;
        dailySeries.add(item2, false);

        assertEquals(2, dailySeries.getItemCount());
        assertFalse(this.seriesChangeReceived);

        Day d0 = new Day(31, 12, 2019);
        TimeSeriesDataItem item0 = new TimeSeriesDataItem(d0, 50.0);
        dailySeries.add(item0, true);

        assertEquals(3, dailySeries.getItemCount());
        assertEquals(item0, dailySeries.getDataItem(0));
        assertEquals(item1, dailySeries.getDataItem(1));
        assertEquals(item2, dailySeries.getDataItem(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullItem_ThrowsException() {
        dailySeries.add(null);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_IncompatibleTimePeriodClass_ThrowsException() {
        TimeSeries s = new TimeSeries("Test", Day.class);
        s.add(new TimeSeriesDataItem(new Year(2020), 10.0));
    }

    @Test(expected = SeriesException.class)
    public void testAdd_DuplicateItem_ThrowsException() {
        Day d1 = new Day(1, 1, 2020);
        dailySeries.add(new TimeSeriesDataItem(d1, 100.0));
        dailySeries.add(new TimeSeriesDataItem(d1, 200.0));
    }

    @Test
    public void testAddConvenienceMethods() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);
        Day d4 = new Day(4, 1, 2020);

        dailySeries.add(d1, 10.5);
        assertEquals(1, dailySeries.getItemCount());
        assertEquals(new Double(10.5), dailySeries.getValue(0));

        dailySeries.add(d2, 20.5, false);
        assertEquals(2, dailySeries.getItemCount());
        assertEquals(new Double(20.5), dailySeries.getValue(1));

        dailySeries.add(d3, (Number) new Integer(30));
        assertEquals(3, dailySeries.getItemCount());
        assertEquals(new Integer(30), dailySeries.getValue(2));

        dailySeries.add(d4, (Number) null, true);
        assertEquals(4, dailySeries.getItemCount());
        assertNull(dailySeries.getValue(3));
    }

    @Test
    public void testGetItems_Unmodifiable() {
        Day d1 = new Day(1, 1, 2020);
        dailySeries.add(d1, 10.0);
        List items = dailySeries.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new TimeSeriesDataItem(new Day(2, 1, 2020), 20.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Success
        }
    }

    @Test
    public void testGetDataItem_ByPeriod() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        dailySeries.add(d1, 100.0);

        assertNotNull(dailySeries.getDataItem(d1));
        assertEquals(new Double(100.0), dailySeries.getDataItem(d1).getValue());
        assertNull(dailySeries.getDataItem(d2));
    }

    @Test
    public void testGetIndex_NullPeriod_ThrowsException() {
        try {
            dailySeries.getIndex(null);
            fail("Expected IllegalArgumentException for null period");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void testGetIndex_ExistingAndNonExisting() {
        Day d1 = new Day(1, 1, 2020);
        Day d3 = new Day(3, 1, 2020);
        dailySeries.add(d1, 10.0);
        dailySeries.add(d3, 30.0);

        assertEquals(0, dailySeries.getIndex(d1));
        assertEquals(1, dailySeries.getIndex(d3));
        assertTrue(dailySeries.getIndex(new Day(2, 1, 2020)) < 0);
    }

    @Test
    public void testGetValue_ByIndexAndPeriod() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        dailySeries.add(d1, 100.0);

        assertEquals(new Double(100.0), dailySeries.getValue(0));
        assertEquals(new Double(100.0), dailySeries.getValue(d1));
        assertNull(dailySeries.getValue(d2));
    }

    @Test
    public void testGetTimePeriod_And_GetNextTimePeriod() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        dailySeries.add(d1, 10.0);
        dailySeries.add(d2, 20.0);

        assertEquals(d1, dailySeries.getTimePeriod(0));
        assertEquals(d2, dailySeries.getTimePeriod(1));
        assertEquals(new Day(3, 1, 2020), dailySeries.getNextTimePeriod());
    }

    @Test
    public void testGetTimePeriods() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        dailySeries.add(d1, 10.0);
        dailySeries.add(d2, 20.0);

        Collection periods = dailySeries.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(d1));
        assertTrue(periods.contains(d2));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);

        TimeSeries otherSeries = new TimeSeries("Other", Day.class);
        dailySeries.add(d1, 1.0);
        dailySeries.add(d2, 2.0);

        otherSeries.add(d2, 20.0);
        otherSeries.add(d3, 30.0);

        Collection unique = dailySeries.getTimePeriodsUniqueToOtherSeries(otherSeries);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(d3));
        assertFalse(unique.contains(d2));
    }

    @Test
    public void testUpdate_ByPeriod() {
        Day d1 = new Day(1, 1, 2020);
        dailySeries.add(d1, 10.0);
        this.seriesChangeReceived = false;

        dailySeries.update(d1, 50.0);
        assertEquals(new Double(50.0), dailySeries.getValue(d1));
        assertTrue(this.seriesChangeReceived);

        try {
            dailySeries.update(new Day(2, 1, 2020), 100.0);
            fail("Expected SeriesException for updating non-existing period");
        } catch (SeriesException e) {
            // Success
        }
    }

    @Test
    public void testUpdate_ByIndex() {
        Day d1 = new Day(1, 1, 2020);
        dailySeries.add(d1, 10.0);
        this.seriesChangeReceived = false;

        dailySeries.update(0, 99.0);
        assertEquals(new Double(99.0), dailySeries.getValue(0));
        assertTrue(this.seriesChangeReceived);
    }

    @Test
    public void testAddOrUpdate_ExistingAndNew() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);

        TimeSeriesDataItem oldItem = dailySeries.addOrUpdate(d1, 10.0);
        assertNull(oldItem);
        assertEquals(1, dailySeries.getItemCount());
        assertEquals(new Double(10.0), dailySeries.getValue(d1));

        TimeSeriesDataItem overwritten = dailySeries.addOrUpdate(d1, (Number) 20.0);
        assertNotNull(overwritten);
        assertEquals(new Double(10.0), overwritten.getValue());
        assertEquals(1, dailySeries.getItemCount());
        assertEquals(new Double(20.0), dailySeries.getValue(d1));

        dailySeries.addOrUpdate(d2, 30.0);
        assertEquals(2, dailySeries.getItemCount());
        assertEquals(new Double(30.0), dailySeries.getValue(d2));

        try {
            dailySeries.addOrUpdate(null, 40.0);
            fail("Expected IllegalArgumentException for null period");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void testAddAndOrUpdate() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);

        dailySeries.add(d1, 10.0);
        dailySeries.add(d2, 20.0);

        TimeSeries otherSeries = new TimeSeries("Source", Day.class);
        otherSeries.add(d2, 200.0);
        otherSeries.add(d3, 300.0);

        TimeSeries overwritten = dailySeries.addAndOrUpdate(otherSeries);

        assertEquals(3, dailySeries.getItemCount());
        assertEquals(new Double(10.0), dailySeries.getValue(d1));
        assertEquals(new Double(200.0), dailySeries.getValue(d2));
        assertEquals(new Double(300.0), dailySeries.getValue(d3));

        assertEquals(1, overwritten.getItemCount());
        assertEquals(new Double(20.0), overwritten.getValue(d2));
    }

    @Test
    public void testMaximumItemCount() {
        dailySeries.setMaximumItemCount(2);
        assertEquals(2, dailySeries.getMaximumItemCount());

        dailySeries.add(new Day(1, 1, 2020), 10.0);
        dailySeries.add(new Day(2, 1, 2020), 20.0);
        assertEquals(2, dailySeries.getItemCount());

        dailySeries.add(new Day(3, 1, 2020), 30.0);
        assertEquals(2, dailySeries.getItemCount());
        assertEquals(new Day(2, 1, 2020), dailySeries.getTimePeriod(0));
        assertEquals(new Day(3, 1, 2020), dailySeries.getTimePeriod(1));

        dailySeries.addOrUpdate(new Day(4, 1, 2020), 40.0);
        assertEquals(2, dailySeries.getItemCount());
        assertEquals(new Day(3, 1, 2020), dailySeries.getTimePeriod(0));
        assertEquals(new Day(4, 1, 2020), dailySeries.getTimePeriod(1));

        dailySeries.setMaximumItemCount(1);
        assertEquals(1, dailySeries.getItemCount());
        assertEquals(new Day(4, 1, 2020), dailySeries.getTimePeriod(0));

        try {
            dailySeries.setMaximumItemCount(-1);
            fail("Expected IllegalArgumentException for negative count");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void testMaximumItemAge() {
        dailySeries.setMaximumItemAge(2);
        assertEquals(2, dailySeries.getMaximumItemAge());

        dailySeries.add(new Day(1, 1, 2020), 10.0);
        dailySeries.add(new Day(2, 1, 2020), 20.0);
        dailySeries.add(new Day(3, 1, 2020), 30.0);
        assertEquals(3, dailySeries.getItemCount());

        dailySeries.add(new Day(4, 1, 2020), 40.0);
        assertEquals(3, dailySeries.getItemCount());
        assertEquals(new Day(2, 1, 2020), dailySeries.getTimePeriod(0));

        dailySeries.setMaximumItemAge(1);
        assertEquals(2, dailySeries.getItemCount());
        assertEquals(new Day(3, 1, 2020), dailySeries.getTimePeriod(0));

        try {
            dailySeries.setMaximumItemAge(-5);
            fail("Expected IllegalArgumentException for negative age");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void testRemoveAgedItems_WithTime() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d5 = new Day(5, 1, 2020);

        dailySeries.add(d1, 10.0);
        dailySeries.add(d2, 20.0);
        dailySeries.add(d5, 50.0);

        dailySeries.setMaximumItemAge(2);
        this.seriesChangeReceived = false;

        dailySeries.removeAgedItems(d5.getMiddleMillisecond(), true);
        assertEquals(1, dailySeries.getItemCount());
        assertEquals(d5, dailySeries.getTimePeriod(0));
        assertTrue(this.seriesChangeReceived);
    }

    @Test
    public void testClear() {
        dailySeries.add(new Day(1, 1, 2020), 10.0);
        dailySeries.add(new Day(2, 1, 2020), 20.0);
        this.seriesChangeReceived = false;

        dailySeries.clear();
        assertEquals(0, dailySeries.getItemCount());
        assertTrue(this.seriesChangeReceived);

        this.seriesChangeReceived = false;
        dailySeries.clear();
        assertFalse(this.seriesChangeReceived);
    }

    @Test
    public void testDelete_ByPeriod() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);
        dailySeries.add(d1, 10.0);
        dailySeries.add(d2, 20.0);

        this.seriesChangeReceived = false;
        dailySeries.delete(d1);
        assertEquals(1, dailySeries.getItemCount());
        assertEquals(d2, dailySeries.getTimePeriod(0));
        assertTrue(this.seriesChangeReceived);

        this.seriesChangeReceived = false;
        dailySeries.delete(d3);
        assertEquals(1, dailySeries.getItemCount());
        assertFalse(this.seriesChangeReceived);
    }

    @Test
    public void testDelete_ByRange() {
        dailySeries.add(new Day(1, 1, 2020), 10.0);
        dailySeries.add(new Day(2, 1, 2020), 20.0);
        dailySeries.add(new Day(3, 1, 2020), 30.0);
        dailySeries.add(new Day(4, 1, 2020), 40.0);

        this.seriesChangeReceived = false;
        dailySeries.delete(1, 2);
        assertEquals(2, dailySeries.getItemCount());
        assertEquals(new Day(1, 1, 2020), dailySeries.getTimePeriod(0));
        assertEquals(new Day(4, 1, 2020), dailySeries.getTimePeriod(1));
        assertTrue(this.seriesChangeReceived);

        try {
            dailySeries.delete(2, 1);
            fail("Expected IllegalArgumentException for start > end");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        dailySeries.add(new Day(1, 1, 2020), 10.0);
        dailySeries.add(new Day(2, 1, 2020), 20.0);

        TimeSeries clone = (TimeSeries) dailySeries.clone();
        assertEquals(dailySeries, clone);
        assertEquals(dailySeries.getItemCount(), clone.getItemCount());

        clone.add(new Day(3, 1, 2020), 30.0);
        assertEquals(2, dailySeries.getItemCount());
        assertEquals(3, clone.getItemCount());
    }

    @Test
    public void testCreateCopy_IndexRange() throws CloneNotSupportedException {
        dailySeries.add(new Day(1, 1, 2020), 10.0);
        dailySeries.add(new Day(2, 1, 2020), 20.0);
        dailySeries.add(new Day(3, 1, 2020), 30.0);
        dailySeries.add(new Day(4, 1, 2020), 40.0);

        TimeSeries copy = dailySeries.createCopy(1, 2);
        assertEquals(2, copy.getItemCount());
        assertEquals(new Day(2, 1, 2020), copy.getTimePeriod(0));
        assertEquals(new Day(3, 1, 2020), copy.getTimePeriod(1));

        TimeSeries emptySeries = new TimeSeries("Empty", Day.class);
        TimeSeries emptyCopy = emptySeries.createCopy(0, 0);
        assertEquals(0, emptyCopy.getItemCount());

        try {
            dailySeries.createCopy(-1, 2);
            fail("Expected IllegalArgumentException for negative start");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            dailySeries.createCopy(3, 1);
            fail("Expected IllegalArgumentException for end < start");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void testCreateCopy_PeriodRange() throws CloneNotSupportedException {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);
        Day d4 = new Day(4, 1, 2020);
        Day d5 = new Day(5, 1, 2020);

        dailySeries.add(d2, 20.0);
        dailySeries.add(d4, 40.0);

        TimeSeries copy1 = dailySeries.createCopy(d2, d4);
        assertEquals(2, copy1.getItemCount());
        assertEquals(d2, copy1.getTimePeriod(0));
        assertEquals(d4, copy1.getTimePeriod(1));

        TimeSeries copy2 = dailySeries.createCopy(d1, d3);
        assertEquals(1, copy2.getItemCount());
        assertEquals(d2, copy2.getTimePeriod(0));

        TimeSeries copy3 = dailySeries.createCopy(d1, d1);
        assertEquals(0, copy3.getItemCount());

        TimeSeries copy4 = dailySeries.createCopy(d5, new Day(6, 1, 2020));
        assertEquals(0, copy4.getItemCount());

        try {
            dailySeries.createCopy(null, d2);
            fail("Expected IllegalArgumentException for null start");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            dailySeries.createCopy(d1, null);
            fail("Expected IllegalArgumentException for null end");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            dailySeries.createCopy(d2, d1);
            fail("Expected IllegalArgumentException for start > end");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries s1 = new TimeSeries("Series", "D", "R", Day.class);
        TimeSeries s2 = new TimeSeries("Series", "D", "R", Day.class);

        assertTrue(s1.equals(s1));
        assertFalse(s1.equals(null));
        assertFalse(s1.equals("Not a TimeSeries"));
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        s2.setDomainDescription("Different D");
        assertFalse(s1.equals(s2));
        s2.setDomainDescription("D");

        s2.setRangeDescription("Different R");
        assertFalse(s1.equals(s2));
        s2.setRangeDescription("R");

        TimeSeries s3 = new TimeSeries("Series", "D", "R", Year.class);
        assertFalse(s1.equals(s3));

        s2.setMaximumItemAge(10);
        assertFalse(s1.equals(s2));
        s2.setMaximumItemAge(Long.MAX_VALUE);

        s2.setMaximumItemCount(10);
        assertFalse(s1.equals(s2));
        s2.setMaximumItemCount(Integer.MAX_VALUE);

        s1.add(new Day(1, 1, 2020), 10.0);
        assertFalse(s1.equals(s2));
        s2.add(new Day(1, 1, 2020), 20.0);
        assertFalse(s1.equals(s2));

        s2.update(0, 10.0);
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(2, 1, 2020), 20.0);
        s2.add(new Day(2, 1, 2020), 20.0);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(3, 1, 2020), 30.0);
        s2.add(new Day(3, 1, 2020), 30.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void testSerialization() throws Exception {
        dailySeries.add(new Day(1, 1, 2020), 100.0);
        dailySeries.add(new Day(2, 1, 2020), 200.0);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(dailySeries);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        TimeSeries deserialized = (TimeSeries) in.readObject();
        in.close();

        assertEquals(dailySeries, deserialized);
    }
}
