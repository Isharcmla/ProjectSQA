package org.jfree.data.time;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.junit.Assert;
import org.junit.Test;

public class TimePeriodValuesTest {

    private static class TestSeriesChangeListener implements SeriesChangeListener {
        private int eventCount = 0;

        public void seriesChanged(SeriesChangeEvent event) {
            this.eventCount++;
        }

        public int getEventCount() {
            return this.eventCount;
        }
    }

    private static class TestPropertyChangeListener implements PropertyChangeListener {
        private int eventCount = 0;
        private PropertyChangeEvent lastEvent;

        public void propertyChange(PropertyChangeEvent evt) {
            this.eventCount++;
            this.lastEvent = evt;
        }

        public int getEventCount() {
            return this.eventCount;
        }

        public PropertyChangeEvent getLastEvent() {
            return this.lastEvent;
        }
    }

    @Test
    public void testConstructor_singleArg_defaultDescriptions() {
        TimePeriodValues tpv = new TimePeriodValues("Series 1");
        Assert.assertEquals("Series 1", tpv.getKey());
        Assert.assertEquals("Time", tpv.getDomainDescription());
        Assert.assertEquals("Value", tpv.getRangeDescription());
        Assert.assertEquals(0, tpv.getItemCount());
        Assert.assertEquals(-1, tpv.getMinStartIndex());
        Assert.assertEquals(-1, tpv.getMaxStartIndex());
        Assert.assertEquals(-1, tpv.getMinMiddleIndex());
        Assert.assertEquals(-1, tpv.getMaxMiddleIndex());
        Assert.assertEquals(-1, tpv.getMinEndIndex());
        Assert.assertEquals(-1, tpv.getMaxEndIndex());
    }

    @Test
    public void testConstructor_threeArgs_customDescriptions() {
        TimePeriodValues tpv = new TimePeriodValues("Series A", "Custom Domain", "Custom Range");
        Assert.assertEquals("Series A", tpv.getKey());
        Assert.assertEquals("Custom Domain", tpv.getDomainDescription());
        Assert.assertEquals("Custom Range", tpv.getRangeDescription());
        Assert.assertEquals(0, tpv.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullName_throwsException() {
        new TimePeriodValues(null);
    }

    @Test
    public void testSetDomainDescription_firesPropertyChange() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        TestPropertyChangeListener listener = new TestPropertyChangeListener();
        tpv.addPropertyChangeListener(listener);

        tpv.setDomainDescription("New Domain");
        Assert.assertEquals("New Domain", tpv.getDomainDescription());
        Assert.assertEquals(1, listener.getEventCount());
        Assert.assertEquals("Domain", listener.getLastEvent().getPropertyName());
        Assert.assertEquals("Time", listener.getLastEvent().getOldValue());
        Assert.assertEquals("New Domain", listener.getLastEvent().getNewValue());

        tpv.setDomainDescription(null);
        Assert.assertNull(tpv.getDomainDescription());
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test
    public void testSetRangeDescription_firesPropertyChange() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        TestPropertyChangeListener listener = new TestPropertyChangeListener();
        tpv.addPropertyChangeListener(listener);

        tpv.setRangeDescription("New Range");
        Assert.assertEquals("New Range", tpv.getRangeDescription());
        Assert.assertEquals(1, listener.getEventCount());
        Assert.assertEquals("Range", listener.getLastEvent().getPropertyName());
        Assert.assertEquals("Value", listener.getLastEvent().getOldValue());
        Assert.assertEquals("New Range", listener.getLastEvent().getNewValue());

        tpv.setRangeDescription(null);
        Assert.assertNull(tpv.getRangeDescription());
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test
    public void testAdd_timePeriodValue_andGetters() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        tpv.addChangeListener(listener);

        TimePeriod period = new SimpleTimePeriod(new Date(100L), new Date(200L));
        TimePeriodValue item = new TimePeriodValue(period, 55.5);
        tpv.add(item);

        Assert.assertEquals(1, tpv.getItemCount());
        Assert.assertEquals(item, tpv.getDataItem(0));
        Assert.assertEquals(period, tpv.getTimePeriod(0));
        Assert.assertEquals(55.5, tpv.getValue(0));
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullItem_throwsException() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        tpv.add((TimePeriodValue) null);
    }

    @Test
    public void testAdd_primitiveDoubleAndNumber() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        TimePeriod p1 = new SimpleTimePeriod(new Date(100L), new Date(200L));
        TimePeriod p2 = new SimpleTimePeriod(new Date(200L), new Date(300L));

        tpv.add(p1, 10.5);
        tpv.add(p2, (Number) null);

        Assert.assertEquals(2, tpv.getItemCount());
        Assert.assertEquals(10.5, tpv.getValue(0));
        Assert.assertNull(tpv.getValue(1));
    }

    @Test
    public void testUpdateBounds_allBranches() {
        TimePeriodValues tpv = new TimePeriodValues("Test");

        // Item 0: start=100, end=200, mid=150
        TimePeriod p0 = new SimpleTimePeriod(new Date(100L), new Date(200L));
        tpv.add(p0, 1.0);
        Assert.assertEquals(0, tpv.getMinStartIndex());
        Assert.assertEquals(0, tpv.getMaxStartIndex());
        Assert.assertEquals(0, tpv.getMinMiddleIndex());
        Assert.assertEquals(0, tpv.getMaxMiddleIndex());
        Assert.assertEquals(0, tpv.getMinEndIndex());
        Assert.assertEquals(0, tpv.getMaxEndIndex());

        // Item 1: smaller start, middle, end (start=50, end=150, mid=100)
        TimePeriod p1 = new SimpleTimePeriod(new Date(50L), new Date(150L));
        tpv.add(p1, 2.0);
        Assert.assertEquals(1, tpv.getMinStartIndex());
        Assert.assertEquals(0, tpv.getMaxStartIndex());
        Assert.assertEquals(1, tpv.getMinMiddleIndex());
        Assert.assertEquals(0, tpv.getMaxMiddleIndex());
        Assert.assertEquals(1, tpv.getMinEndIndex());
        Assert.assertEquals(0, tpv.getMaxEndIndex());

        // Item 2: larger start, middle, end (start=120, end=300, mid=210)
        TimePeriod p2 = new SimpleTimePeriod(new Date(120L), new Date(300L));
        tpv.add(p2, 3.0);
        Assert.assertEquals(1, tpv.getMinStartIndex());
        Assert.assertEquals(2, tpv.getMaxStartIndex());
        Assert.assertEquals(1, tpv.getMinMiddleIndex());
        Assert.assertEquals(2, tpv.getMaxMiddleIndex());
        Assert.assertEquals(1, tpv.getMinEndIndex());
        Assert.assertEquals(2, tpv.getMaxEndIndex());

        // Item 3: in-between values (start=80, end=180, mid=130) -> no min/max updates
        TimePeriod p3 = new SimpleTimePeriod(new Date(80L), new Date(180L));
        tpv.add(p3, 4.0);
        Assert.assertEquals(1, tpv.getMinStartIndex());
        Assert.assertEquals(2, tpv.getMaxStartIndex());
        Assert.assertEquals(1, tpv.getMinMiddleIndex());
        Assert.assertEquals(2, tpv.getMaxMiddleIndex());
        Assert.assertEquals(1, tpv.getMinEndIndex());
        Assert.assertEquals(2, tpv.getMaxEndIndex());
    }

    @Test
    public void testUpdate_validIndex_updatesValueAndFiresEvent() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        tpv.addChangeListener(listener);

        tpv.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 10.0);
        Assert.assertEquals(1, listener.getEventCount());

        tpv.update(0, 99.9);
        Assert.assertEquals(99.9, tpv.getValue(0));
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test
    public void testDelete_andBoundsRecalculation() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        tpv.add(new SimpleTimePeriod(new Date(10L), new Date(50L)), 1.0);  // 0: start 10, mid 30, end 50
        tpv.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 2.0); // 1: start 100, mid 150, end 200
        tpv.add(new SimpleTimePeriod(new Date(300L), new Date(400L)), 3.0); // 2: start 300, mid 350, end 400

        Assert.assertEquals(0, tpv.getMinStartIndex());
        Assert.assertEquals(2, tpv.getMaxStartIndex());

        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        tpv.addChangeListener(listener);

        // Delete first item
        tpv.delete(0, 0);
        Assert.assertEquals(2, tpv.getItemCount());
        Assert.assertEquals(1, listener.getEventCount());

        // Bounds should be recalculated: previous item 1 is now 0, item 2 is now 1
        Assert.assertEquals(0, tpv.getMinStartIndex());
        Assert.assertEquals(1, tpv.getMaxStartIndex());
        Assert.assertEquals(0, tpv.getMinMiddleIndex());
        Assert.assertEquals(1, tpv.getMaxMiddleIndex());
        Assert.assertEquals(0, tpv.getMinEndIndex());
        Assert.assertEquals(1, tpv.getMaxEndIndex());

        // Delete remaining items
        tpv.delete(0, 1);
        Assert.assertEquals(0, tpv.getItemCount());
        Assert.assertEquals(-1, tpv.getMinStartIndex());
        Assert.assertEquals(-1, tpv.getMaxStartIndex());
        Assert.assertEquals(-1, tpv.getMinMiddleIndex());
        Assert.assertEquals(-1, tpv.getMaxMiddleIndex());
        Assert.assertEquals(-1, tpv.getMinEndIndex());
        Assert.assertEquals(-1, tpv.getMaxEndIndex());
    }

    @Test
    public void testEquals_andHashCode() {
        TimePeriodValues tpv1 = new TimePeriodValues("Series", "D1", "R1");
        TimePeriodValues tpv2 = new TimePeriodValues("Series", "D1", "R1");

        // Same object
        Assert.assertTrue(tpv1.equals(tpv1));

        // Equal empty objects
        Assert.assertTrue(tpv1.equals(tpv2));
        Assert.assertTrue(tpv2.equals(tpv1));
        Assert.assertEquals(tpv1.hashCode(), tpv2.hashCode());

        // Different object types / null
        Assert.assertFalse(tpv1.equals(null));
        Assert.assertFalse(tpv1.equals("Not a TimePeriodValues"));

        // Different series key (super.equals)
        TimePeriodValues tpvDifferentKey = new TimePeriodValues("Series Different", "D1", "R1");
        Assert.assertFalse(tpv1.equals(tpvDifferentKey));

        // Different domain
        tpv2.setDomainDescription("D2");
        Assert.assertFalse(tpv1.equals(tpv2));
        tpv2.setDomainDescription("D1");

        // Different range
        tpv2.setRangeDescription("R2");
        Assert.assertFalse(tpv1.equals(tpv2));
        tpv2.setRangeDescription("R1");

        // Different item count
        tpv1.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 10.0);
        Assert.assertFalse(tpv1.equals(tpv2));

        // Same item count, same items
        tpv2.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 10.0);
        Assert.assertTrue(tpv1.equals(tpv2));
        Assert.assertEquals(tpv1.hashCode(), tpv2.hashCode());

        // Same item count, different item
        TimePeriodValues tpv3 = new TimePeriodValues("Series", "D1", "R1");
        tpv3.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 20.0);
        Assert.assertFalse(tpv1.equals(tpv3));
    }

    @Test
    public void testHashCode_withNullDomainAndRange() {
        TimePeriodValues tpv = new TimePeriodValues("Series", null, null);
        int hc = tpv.hashCode();
        Assert.assertTrue(hc != 0);
    }

    @Test
    public void testClone_emptySeries() throws CloneNotSupportedException {
        TimePeriodValues tpv = new TimePeriodValues("Test", "Domain", "Range");
        TimePeriodValues clone = (TimePeriodValues) tpv.clone();

        Assert.assertNotSame(tpv, clone);
        Assert.assertEquals(tpv.getClass(), clone.getClass());
        Assert.assertEquals(tpv, clone);
        Assert.assertEquals(0, clone.getItemCount());
    }

    @Test
    public void testClone_populatedSeries() throws CloneNotSupportedException {
        TimePeriodValues tpv = new TimePeriodValues("Test", "Domain", "Range");
        tpv.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 1.0);
        tpv.add(new SimpleTimePeriod(new Date(300L), new Date(400L)), 2.0);

        TimePeriodValues clone = (TimePeriodValues) tpv.clone();
        Assert.assertNotSame(tpv, clone);
        Assert.assertEquals(tpv, clone);
        Assert.assertEquals(2, clone.getItemCount());

        // Modifying original should not alter clone
        tpv.update(0, 999.0);
        Assert.assertFalse(tpv.equals(clone));
    }

    @Test
    public void testCreateCopy_subset() throws CloneNotSupportedException {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        tpv.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 1.0);
        tpv.add(new SimpleTimePeriod(new Date(200L), new Date(300L)), 2.0);
        tpv.add(new SimpleTimePeriod(new Date(300L), new Date(400L)), 3.0);

        TimePeriodValues copy = tpv.createCopy(1, 2);
        Assert.assertEquals(2, copy.getItemCount());
        Assert.assertEquals(2.0, copy.getValue(0));
        Assert.assertEquals(3.0, copy.getValue(1));
    }

    @Test
    public void testCreateCopy_emptySeries() throws CloneNotSupportedException {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        TimePeriodValues copy = tpv.createCopy(0, 0);
        Assert.assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testSerialization() throws Exception {
        TimePeriodValues tpv1 = new TimePeriodValues("Series 1", "Domain", "Range");
        tpv1.add(new SimpleTimePeriod(new Date(100L), new Date(200L)), 12.34);
        tpv1.add(new SimpleTimePeriod(new Date(300L), new Date(400L)), 56.78);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(tpv1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        TimePeriodValues tpv2 = (TimePeriodValues) in.readObject();
        in.close();

        Assert.assertEquals(tpv1, tpv2);
        Assert.assertEquals(tpv1.getMinStartIndex(), tpv2.getMinStartIndex());
        Assert.assertEquals(tpv1.getMaxStartIndex(), tpv2.getMaxStartIndex());
        Assert.assertEquals(tpv1.getMinMiddleIndex(), tpv2.getMinMiddleIndex());
        Assert.assertEquals(tpv1.getMaxMiddleIndex(), tpv2.getMaxMiddleIndex());
        Assert.assertEquals(tpv1.getMinEndIndex(), tpv2.getMinEndIndex());
        Assert.assertEquals(tpv1.getMaxEndIndex(), tpv2.getMaxEndIndex());
    }
}
