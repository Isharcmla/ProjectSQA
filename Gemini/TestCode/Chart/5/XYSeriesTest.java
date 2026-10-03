package org.jfree.data.xy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Test;

public class XYSeriesTest {

    private static class TestSeriesChangeListener implements SeriesChangeListener {
        private int changeCount = 0;
        private SeriesChangeEvent lastEvent = null;

        @Override
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
    public void testConstructor_singleArgument_defaultValues() {
        XYSeries series = new XYSeries("Series 1");
        assertEquals("Series 1", series.getKey());
        assertTrue(series.getAutoSort());
        assertTrue(series.getAllowDuplicateXValues());
        assertEquals(0, series.getItemCount());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
    }

    @Test
    public void testConstructor_twoArguments_autoSortConfigured() {
        XYSeries series = new XYSeries("Series 2", false);
        assertEquals("Series 2", series.getKey());
        assertFalse(series.getAutoSort());
        assertTrue(series.getAllowDuplicateXValues());
    }

    @Test
    public void testConstructor_threeArguments_allConfigured() {
        XYSeries series = new XYSeries("Series 3", false, false);
        assertEquals("Series 3", series.getKey());
        assertFalse(series.getAutoSort());
        assertFalse(series.getAllowDuplicateXValues());
    }

    @Test
    public void testGetItems_returnsUnmodifiableList() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 2.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new XYDataItem(2.0, 3.0));
            fail("Expected UnsupportedOperationException when modifying unmodifiable list.");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetMaximumItemCount_reduceCount_removesOldestAndNotifies() {
        XYSeries series = new XYSeries("Series", true, true);
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(3.0, 30.0);
        listener.reset();

        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(2, series.getMaximumItemCount());
        assertEquals(new Double(2.0), series.getX(0));
        assertEquals(new Double(3.0), series.getX(1));
        assertEquals(1, listener.getChangeCount());

        // Setting a larger maximum does not remove items or fire change
        listener.reset();
        series.setMaximumItemCount(5);
        assertEquals(5, series.getMaximumItemCount());
        assertEquals(2, series.getItemCount());
        assertEquals(0, listener.getChangeCount());
    }

    @Test
    public void testAdd_nullItem_throwsException() {
        XYSeries series = new XYSeries("Series");
        try {
            series.add((XYDataItem) null);
            fail("Expected IllegalArgumentException for null item.");
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            series.add((XYDataItem) null, true);
            fail("Expected IllegalArgumentException for null item.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAdd_sortedAllowedDuplicates_insertsCorrectly() {
        XYSeries series = new XYSeries("Series", true, true);
        series.add(10.0, 100.0);
        series.add(5.0, 50.0);
        series.add(15.0, 150.0);

        assertEquals(3, series.getItemCount());
        assertEquals(new Double(5.0), series.getX(0));
        assertEquals(new Double(10.0), series.getX(1));
        assertEquals(new Double(15.0), series.getX(2));

        // Add duplicates in middle and at the end
        series.add(10.0, 101.0);
        assertEquals(4, series.getItemCount());
        assertEquals(new Double(10.0), series.getX(1));
        assertEquals(new Double(10.0), series.getX(2));
        assertEquals(new Double(101.0), series.getY(2));

        series.add(15.0, 151.0);
        assertEquals(5, series.getItemCount());
        assertEquals(new Double(15.0), series.getX(4));
        assertEquals(new Double(151.0), series.getY(4));
    }

    @Test
    public void testAdd_sortedDisallowedDuplicates_throwsException() {
        XYSeries series = new XYSeries("Series", true, false);
        series.add(1.0, 10.0);
        try {
            series.add(1.0, 20.0);
            fail("Expected SeriesException when adding duplicate X value.");
        } catch (SeriesException e) {
            // Expected
        }
    }

    @Test
    public void testAdd_unsortedAllowedDuplicates_appendsItems() {
        XYSeries series = new XYSeries("Series", false, true);
        series.add(10.0, 1.0);
        series.add(5.0, 2.0);
        series.add(10.0, 3.0);

        assertEquals(3, series.getItemCount());
        assertEquals(new Double(10.0), series.getX(0));
        assertEquals(new Double(5.0), series.getX(1));
        assertEquals(new Double(10.0), series.getX(2));
    }

    @Test
    public void testAdd_unsortedDisallowedDuplicates_throwsException() {
        XYSeries series = new XYSeries("Series", false, false);
        series.add(10.0, 1.0);
        series.add(5.0, 2.0);

        try {
            series.add(10.0, 3.0);
            fail("Expected SeriesException for duplicate x in unsorted series.");
        } catch (SeriesException e) {
            // Expected
        }
    }

    @Test
    public void testAdd_overloadVariationsAndNotification() {
        XYSeries series = new XYSeries("Series");
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        series.add(new Double(1.0), new Double(10.0));
        assertEquals(1, listener.getChangeCount());

        series.add(new Double(2.0), new Double(20.0), false);
        assertEquals(1, listener.getChangeCount()); // Notification suppressed

        series.add(3.0, 30.0);
        assertEquals(2, listener.getChangeCount());

        series.add(4.0, 40.0, false);
        assertEquals(2, listener.getChangeCount());

        series.add(5.0, (Number) null);
        assertEquals(3, listener.getChangeCount());
        assertNull(series.getY(4));

        series.add(6.0, (Number) null, false);
        assertEquals(3, listener.getChangeCount());
        assertNull(series.getY(5));

        XYDataItem item = new XYDataItem(7.0, 70.0);
        series.add(item);
        assertEquals(4, listener.getChangeCount());
    }

    @Test
    public void testAdd_exceedsMaximumItemCount_removesOldest() {
        XYSeries series = new XYSeries("Series");
        series.setMaximumItemCount(2);

        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Double(1.0), series.getX(0));

        series.add(3.0, 30.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Double(2.0), series.getX(0));
        assertEquals(new Double(3.0), series.getX(1));
    }

    @Test
    public void testDelete_removesRangeAndNotifies() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(3.0, 30.0);
        series.add(4.0, 40.0);

        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        series.delete(1, 2);
        assertEquals(2, series.getItemCount());
        assertEquals(new Double(1.0), series.getX(0));
        assertEquals(new Double(4.0), series.getX(1));
        assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void testRemove_byIndex_removesAndReturnsItem() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);

        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        XYDataItem removed = series.remove(0);
        assertEquals(new Double(1.0), removed.getX());
        assertEquals(new Double(10.0), removed.getY());
        assertEquals(1, series.getItemCount());
        assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void testRemove_byNumber_removesItem() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);

        XYDataItem removed = series.remove(new Double(2.0));
        assertNotNull(removed);
        assertEquals(new Double(2.0), removed.getX());
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testClear_emptyAndNonEmpty() {
        XYSeries series = new XYSeries("Series");
        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        // Clear empty series
        series.clear();
        assertEquals(0, listener.getChangeCount());

        // Clear populated series
        series.add(1.0, 10.0);
        listener.reset();
        series.clear();
        assertEquals(0, series.getItemCount());
        assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void testGetDataItem_getX_getY() {
        XYSeries series = new XYSeries("Series");
        series.add(1.5, null);
        series.add(2.5, 3.5);

        XYDataItem item0 = series.getDataItem(0);
        assertEquals(new Double(1.5), item0.getX());
        assertNull(item0.getY());
        assertEquals(new Double(1.5), series.getX(0));
        assertNull(series.getY(0));

        assertEquals(new Double(2.5), series.getX(1));
        assertEquals(new Double(3.5), series.getY(1));
    }

    @Test
    public void testUpdateByIndex_updatesAndNotifies() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 10.0);

        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        series.updateByIndex(0, 99.0);
        assertEquals(new Double(99.0), series.getY(0));
        assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void testUpdate_existingAndNonExistingX() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);

        TestSeriesChangeListener listener = new TestSeriesChangeListener();
        series.addChangeListener(listener);

        series.update(new Double(2.0), new Double(200.0));
        assertEquals(new Double(200.0), series.getY(1));
        assertEquals(1, listener.getChangeCount());

        try {
            series.update(new Double(3.0), new Double(300.0));
            fail("Expected SeriesException when updating nonexistent x.");
        } catch (SeriesException e) {
            // Expected
        }
    }

    @Test
    public void testAddOrUpdate_nullX_throwsException() {
        XYSeries series = new XYSeries("Series");
        try {
            series.addOrUpdate((Number) null, new Double(1.0));
            fail("Expected IllegalArgumentException for null X in addOrUpdate.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddOrUpdate_doubleOverload() {
        XYSeries series = new XYSeries("Series", true, false);
        XYDataItem overwritten1 = series.addOrUpdate(1.0, 10.0);
        assertNull(overwritten1);
        assertEquals(1, series.getItemCount());

        XYDataItem overwritten2 = series.addOrUpdate(1.0, 20.0);
        assertNotNull(overwritten2);
        assertEquals(new Double(1.0), overwritten2.getX());
        assertEquals(new Double(10.0), overwritten2.getY());
        assertEquals(new Double(20.0), series.getY(0));
    }

    @Test
    public void testAddOrUpdate_sortedAllowedDuplicates() {
        XYSeries series = new XYSeries("Series", true, true);
        series.addOrUpdate(new Double(1.0), new Double(10.0));
        XYDataItem result = series.addOrUpdate(new Double(1.0), new Double(20.0));
        assertNull(result); // Duplicate allowed, so item was added, not overwritten
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testAddOrUpdate_unsortedNoDuplicates_updatesExisting() {
        XYSeries series = new XYSeries("Series", false, false);
        series.addOrUpdate(new Double(5.0), new Double(50.0));
        series.addOrUpdate(new Double(2.0), new Double(20.0));

        XYDataItem overwritten = series.addOrUpdate(new Double(2.0), new Double(200.0));
        assertNotNull(overwritten);
        assertEquals(new Double(20.0), overwritten.getY());
        assertEquals(new Double(200.0), series.getY(1));
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testAddOrUpdate_unsortedAllowedDuplicates_appends() {
        XYSeries series = new XYSeries("Series", false, true);
        series.addOrUpdate(new Double(5.0), new Double(50.0));
        XYDataItem result = series.addOrUpdate(new Double(5.0), new Double(55.0));
        assertNull(result);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testAddOrUpdate_exceedsMaximumItemCount() {
        XYSeries series = new XYSeries("Series", true, true);
        series.setMaximumItemCount(2);
        series.addOrUpdate(new Double(1.0), new Double(10.0));
        series.addOrUpdate(new Double(2.0), new Double(20.0));
        series.addOrUpdate(new Double(3.0), new Double(30.0));

        assertEquals(2, series.getItemCount());
        assertEquals(new Double(2.0), series.getX(0));
        assertEquals(new Double(3.0), series.getX(1));
    }

    @Test
    public void testIndexOf_sortedAndUnsorted() {
        XYSeries sortedSeries = new XYSeries("Sorted", true, true);
        sortedSeries.add(10.0, 1.0);
        sortedSeries.add(20.0, 2.0);
        sortedSeries.add(30.0, 3.0);

        assertEquals(1, sortedSeries.indexOf(new Double(20.0)));
        assertTrue(sortedSeries.indexOf(new Double(15.0)) < 0);

        XYSeries unsortedSeries = new XYSeries("Unsorted", false, true);
        unsortedSeries.add(30.0, 3.0);
        unsortedSeries.add(10.0, 1.0);
        unsortedSeries.add(20.0, 2.0);

        assertEquals(1, unsortedSeries.indexOf(new Double(10.0)));
        assertEquals(2, unsortedSeries.indexOf(new Double(20.0)));
        assertEquals(-1, unsortedSeries.indexOf(new Double(99.0)));
    }

    @Test
    public void testToArray_emptyAndValuesWithNull() {
        XYSeries emptySeries = new XYSeries("Empty");
        double[][] emptyArray = emptySeries.toArray();
        assertEquals(2, emptyArray.length);
        assertEquals(0, emptyArray[0].length);
        assertEquals(0, emptyArray[1].length);

        XYSeries series = new XYSeries("Data");
        series.add(1.0, 10.0);
        series.add(2.0, (Number) null);
        series.add(-3.5, -35.5);

        double[][] array = series.toArray();
        assertEquals(2, array.length);
        assertEquals(3, array[0].length);
        assertEquals(3, array[1].length);

        // series is sorted by default: -3.5, 1.0, 2.0
        assertEquals(-3.5, array[0][0], 1e-9);
        assertEquals(-35.5, array[1][0], 1e-9);

        assertEquals(1.0, array[0][1], 1e-9);
        assertEquals(10.0, array[1][1], 1e-9);

        assertEquals(2.0, array[0][2], 1e-9);
        assertTrue(Double.isNaN(array[1][2]));
    }

    @Test
    public void testClone_createsIndependentCopy() throws CloneNotSupportedException {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 10.0);
        s1.add(2.0, 20.0);

        XYSeries s2 = (XYSeries) s1.clone();
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        s2.add(3.0, 30.0);
        assertFalse(s1.equals(s2));
        assertEquals(2, s1.getItemCount());
        assertEquals(3, s2.getItemCount());
    }

    @Test
    public void testCreateCopy_emptyAndSubset() throws CloneNotSupportedException {
        XYSeries s1 = new XYSeries("Series");
        XYSeries emptyCopy = s1.createCopy(0, 0);
        assertEquals(0, emptyCopy.getItemCount());

        s1.add(1.0, 10.0);
        s1.add(2.0, 20.0);
        s1.add(3.0, 30.0);
        s1.add(4.0, 40.0);

        XYSeries subCopy = s1.createCopy(1, 2);
        assertEquals(2, subCopy.getItemCount());
        assertEquals(new Double(2.0), subCopy.getX(0));
        assertEquals(new Double(20.0), subCopy.getY(0));
        assertEquals(new Double(3.0), subCopy.getX(1));
        assertEquals(new Double(30.0), subCopy.getY(1));
    }

    @Test
    public void testEquals_andHashCode_allBranches() {
        XYSeries s1 = new XYSeries("Key", true, true);
        XYSeries s2 = new XYSeries("Key", true, true);

        // Same reference
        assertTrue(s1.equals(s1));
        // Non-XYSeries or null
        assertFalse(s1.equals(null));
        assertFalse(s1.equals("Not a series"));

        // Identical empty series
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        // Different key
        XYSeries sDiffKey = new XYSeries("Different Key", true, true);
        assertFalse(s1.equals(sDiffKey));

        // Different maximumItemCount
        s2.setMaximumItemCount(10);
        assertFalse(s1.equals(s2));
        s2.setMaximumItemCount(Integer.MAX_VALUE);
        assertTrue(s1.equals(s2));

        // Different autoSort
        XYSeries sDiffSort = new XYSeries("Key", false, true);
        assertFalse(s1.equals(sDiffSort));

        // Different allowDuplicateXValues
        XYSeries sDiffDup = new XYSeries("Key", true, false);
        assertFalse(s1.equals(sDiffDup));

        // Different data
        s1.add(1.0, 10.0);
        assertFalse(s1.equals(s2));

        s2.add(1.0, 10.0);
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        // Test hashCode with 2 items
        s1.add(2.0, 20.0);
        s2.add(2.0, 20.0);
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        // Test hashCode with 3 items (triggers count > 2 middle element calculation)
        s1.add(3.0, 30.0);
        s2.add(3.0, 30.0);
        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());

        // Different y value
        s2.updateByIndex(1, 999.0);
        assertFalse(s1.equals(s2));
    }
}
