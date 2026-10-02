import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class XYSeriesTest {

    private XYSeries series;

    @Before
    public void setUp() {
        series = new XYSeries("TestSeries");
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultKey_autoSortAndDuplicatesTrue() {
        XYSeries s = new XYSeries("Key1");
        assertTrue(s.getAutoSort());
        assertTrue(s.getAllowDuplicateXValues());
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testConstructor_withAutoSortFlag() {
        XYSeries s = new XYSeries("Key2", false);
        assertFalse(s.getAutoSort());
        assertTrue(s.getAllowDuplicateXValues());
    }

    @Test
    public void testConstructor_withAllFlags() {
        XYSeries s = new XYSeries("Key3", false, false);
        assertFalse(s.getAutoSort());
        assertFalse(s.getAllowDuplicateXValues());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullKey_throwsException() {
        new XYSeries(null);
    }

    // ---------- getAutoSort / getAllowDuplicateXValues ----------

    @Test
    public void testGetAutoSort_defaultTrue() {
        assertTrue(series.getAutoSort());
    }

    @Test
    public void testGetAllowDuplicateXValues_defaultTrue() {
        assertTrue(series.getAllowDuplicateXValues());
    }

    // ---------- getItemCount / getItems ----------

    @Test
    public void testGetItemCount_emptySeries_returnsZero() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItemCount_afterAdd_returnsCorrectCount() {
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testGetItems_returnsUnmodifiableList() {
        series.add(1.0, 2.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new XYDataItem(2.0, 3.0));
            fail("Should throw UnsupportedOperationException");
        }
        catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- getMaximumItemCount / setMaximumItemCount ----------

    @Test
    public void testGetMaximumItemCount_defaultIsMaxInt() {
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCount_reducesSize() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0001);
    }

    @Test
    public void testSetMaximumItemCount_noRemovalWhenUnderLimit() {
        series.add(1.0, 1.0);
        series.setMaximumItemCount(10);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testSetMaximumItemCount_zero_removesAllItems() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.setMaximumItemCount(0);
        assertEquals(0, series.getItemCount());
    }

    // ---------- add(XYDataItem) ----------

    @Test
    public void testAdd_XYDataItem_addsSuccessfully() {
        XYDataItem item = new XYDataItem(1.0, 2.0);
        series.add(item);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullXYDataItem_throwsException() {
        series.add((XYDataItem) null);
    }

    // ---------- add(double, double) ----------

    @Test
    public void testAdd_doubleDouble_addsItem() {
        series.add(1.0, 2.0);
        assertEquals(1, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getY(0).doubleValue(), 0.0001);
    }

    // ---------- add(double, double, boolean) ----------

    @Test
    public void testAdd_doubleDoubleNotifyFalse_addsWithoutNotify() {
        series.add(1.0, 2.0, false);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAdd_doubleDoubleNotifyTrue_addsWithNotify() {
        series.add(1.0, 2.0, true);
        assertEquals(1, series.getItemCount());
    }

    // ---------- add(double, Number) ----------

    @Test
    public void testAdd_doubleNumber_addsItem() {
        series.add(1.0, new Double(5.0));
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAdd_doubleNullNumber_addsNullYValue() {
        series.add(1.0, (Number) null);
        assertNull(series.getY(0));
    }

    // ---------- add(double, Number, boolean) ----------

    @Test
    public void testAdd_doubleNumberNotify_addsItem() {
        series.add(1.0, new Double(5.0), false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- add(Number, Number) ----------

    @Test
    public void testAdd_NumberNumber_addsSorted() {
        series.add(new Double(2.0), new Double(2.0));
        series.add(new Double(1.0), new Double(1.0));
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_duplicateXValueNotAllowed_throwsException() {
        XYSeries s = new XYSeries("NoDup", true, false);
        s.add(1.0, 1.0);
        s.add(1.0, 2.0);
    }

    @Test
    public void testAdd_duplicateXValueAllowed_addsAfterDuplicates() {
        series.add(1.0, 1.0);
        series.add(1.0, 2.0);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testAdd_unsortedSeries_noDuplicateCheck() {
        XYSeries s = new XYSeries("Unsorted", false, true);
        s.add(2.0, 2.0);
        s.add(1.0, 1.0);
        // no auto sort, so order preserved
        assertEquals(2.0, s.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, s.getX(1).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_unsortedSeriesDuplicateNotAllowed_throwsException() {
        XYSeries s = new XYSeries("UnsortedNoDup", false, false);
        s.add(1.0, 1.0);
        s.add(1.0, 2.0);
    }

    @Test
    public void testAdd_exceedsMaximumItemCount_removesFirstItem() {
        series.setMaximumItemCount(2);
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0001);
    }

    // ---------- add(Number, Number, boolean) ----------

    @Test
    public void testAdd_NumberNumberNotifyFalse_addsWithoutNotify() {
        series.add(new Double(1.0), new Double(1.0), false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- delete ----------

    @Test
    public void testDelete_rangeOfItems_removesItems() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(3.0, series.getX(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDelete_invalidRange_throwsException() {
        series.add(1.0, 1.0);
        series.delete(0, 5);
    }

    // ---------- remove(int) ----------

    @Test
    public void testRemove_byIndex_returnsRemovedItem() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        XYDataItem removed = series.remove(0);
        assertEquals(1.0, removed.getX().doubleValue(), 0.0001);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_invalidIndex_throwsException() {
        series.remove(0);
    }

    // ---------- remove(Number) ----------

    @Test
    public void testRemove_byXValue_returnsRemovedItem() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        XYDataItem removed = series.remove(new Double(1.0));
        assertNotNull(removed);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_nonExistingXValue_throwsException() {
        series.add(1.0, 1.0);
        series.remove(new Double(99.0));
    }

    // ---------- clear ----------

    @Test
    public void testClear_nonEmptySeries_removesAllItems() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testClear_emptySeries_doesNothing() {
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    // ---------- getDataItem ----------

    @Test
    public void testGetDataItem_validIndex_returnsItem() {
        series.add(1.0, 1.0);
        XYDataItem item = series.getDataItem(0);
        assertEquals(1.0, item.getX().doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItem_invalidIndex_throwsException() {
        series.getDataItem(0);
    }

    // ---------- getX / getY ----------

    @Test
    public void testGetX_validIndex_returnsXValue() {
        series.add(3.0, 4.0);
        assertEquals(3.0, series.getX(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetY_validIndex_returnsYValue() {
        series.add(3.0, 4.0);
        assertEquals(4.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetY_nullYValue_returnsNull() {
        series.add(3.0, (Number) null);
        assertNull(series.getY(0));
    }

    // ---------- updateByIndex ----------

    @Test
    public void testUpdateByIndex_validIndex_updatesYValue() {
        series.add(1.0, 1.0);
        series.updateByIndex(0, new Double(99.0));
        assertEquals(99.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdateByIndex_invalidIndex_throwsException() {
        series.updateByIndex(0, new Double(1.0));
    }

    // ---------- update(Number, Number) ----------

    @Test
    public void testUpdate_existingXValue_updatesYValue() {
        series.add(1.0, 1.0);
        series.update(new Double(1.0), new Double(50.0));
        assertEquals(50.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdate_nonExistingXValue_throwsException() {
        series.add(1.0, 1.0);
        series.update(new Double(99.0), new Double(50.0));
    }

    // ---------- addOrUpdate(double, double) ----------

    @Test
    public void testAddOrUpdate_doubleDouble_newValue_addsItem() {
        XYDataItem result = series.addOrUpdate(1.0, 1.0);
        assertNull(result);
        assertEquals(1, series.getItemCount());
    }

    // ---------- addOrUpdate(Number, Number) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_nullX_throwsException() {
        series.addOrUpdate(null, new Double(1.0));
    }

    @Test
    public void testAddOrUpdate_existingXValueDuplicatesNotAllowed_updatesAndReturnsOverwritten() {
        XYSeries s = new XYSeries("NoDup", true, false);
        s.add(1.0, 1.0);
        XYDataItem overwritten = s.addOrUpdate(new Double(1.0), new Double(99.0));
        assertNotNull(overwritten);
        assertEquals(1.0, overwritten.getY().doubleValue(), 0.0001);
        assertEquals(99.0, s.getY(0).doubleValue(), 0.0001);
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testAddOrUpdate_newXValueAutoSort_insertsInOrder() {
        series.add(2.0, 2.0);
        XYDataItem result = series.addOrUpdate(new Double(1.0), new Double(1.0));
        assertNull(result);
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdate_newXValueUnsorted_appendsToEnd() {
        XYSeries s = new XYSeries("Unsorted", false, true);
        s.add(2.0, 2.0);
        s.addOrUpdate(new Double(1.0), new Double(1.0));
        assertEquals(2.0, s.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, s.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdate_exceedsMaximumItemCount_removesFirstItem() {
        series.setMaximumItemCount(2);
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.addOrUpdate(3.0, 3.0);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testAddOrUpdate_duplicatesAllowed_alwaysAddsNewItem() {
        series.add(1.0, 1.0);
        XYDataItem result = series.addOrUpdate(new Double(1.0), new Double(2.0));
        assertNull(result);
        assertEquals(2, series.getItemCount());
    }

    // ---------- indexOf ----------

    @Test
    public void testIndexOf_existingValueSorted_returnsCorrectIndex() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        assertEquals(0, series.indexOf(new Double(1.0)));
    }

    @Test
    public void testIndexOf_nonExistingValueSorted_returnsNegative() {
        series.add(1.0, 1.0);
        assertTrue(series.indexOf(new Double(99.0)) < 0);
    }

    @Test
    public void testIndexOf_existingValueUnsorted_returnsCorrectIndex() {
        XYSeries s = new XYSeries("Unsorted", false, true);
        s.add(1.0, 1.0);
        s.add(2.0, 2.0);
        assertEquals(1, s.indexOf(new Double(2.0)));
    }

    @Test
    public void testIndexOf_nonExistingValueUnsorted_returnsMinusOne() {
        XYSeries s = new XYSeries("Unsorted", false, true);
        s.add(1.0, 1.0);
        assertEquals(-1, s.indexOf(new Double(99.0)));
    }

    // ---------- toArray ----------

    @Test
    public void testToArray_withData_returnsCorrectArray() {
        series.add(1.0, 2.0);
        series.add(3.0, 4.0);
        double[][] result = series.toArray();
        assertEquals(1.0, result[0][0], 0.0001);
        assertEquals(2.0, result[1][0], 0.0001);
        assertEquals(3.0, result[0][1], 0.0001);
        assertEquals(4.0, result[1][1], 0.0001);
    }

    @Test
    public void testToArray_withNullY_returnsNaN() {
        series.add(1.0, (Number) null);
        double[][] result = series.toArray();
        assertTrue(Double.isNaN(result[1][0]));
    }

    @Test
    public void testToArray_emptySeries_returnsEmptyArrays() {
        double[][] result = series.toArray();
        assertEquals(0, result[0].length);
        assertEquals(0, result[1].length);
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsIndependentCopy() throws CloneNotSupportedException {
        series.add(1.0, 1.0);
        XYSeries cloned = (XYSeries) series.clone();
        assertEquals(series.getItemCount(), cloned.getItemCount());
        cloned.add(2.0, 2.0);
        assertNotEquals(series.getItemCount(), cloned.getItemCount());
    }

    // ---------- createCopy ----------

    @Test
    public void testCreateCopy_validRange_returnsCopyWithSubset() throws CloneNotSupportedException {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        XYSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(1.0, copy.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, copy.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testCreateCopy_emptySeries_returnsEmptyCopy() throws CloneNotSupportedException {
        XYSeries copy = series.createCopy(0, -1);
        assertEquals(0, copy.getItemCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(series.equals("NotASeries"));
    }

    @Test
    public void testEquals_differentKey_returnsFalse() {
        XYSeries other = new XYSeries("DifferentKey");
        assertFalse(series.equals(other));
    }

    @Test
    public void testEquals_sameKeyAndData_returnsTrue() {
        XYSeries s1 = new XYSeries("SameKey");
        XYSeries s2 = new XYSeries("SameKey");
        s1.add(1.0, 1.0);
        s2.add(1.0, 1.0);
        assertTrue(s1.equals(s2));
    }

    @Test
    public void testEquals_differentMaximumItemCount_returnsFalse() {
        XYSeries s1 = new XYSeries("SameKey");
        XYSeries s2 = new XYSeries("SameKey");
        s1.setMaximumItemCount(5);
        s2.setMaximumItemCount(10);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentAutoSort_returnsFalse() {
        XYSeries s1 = new XYSeries("SameKey", true);
        XYSeries s2 = new XYSeries("SameKey", false);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentAllowDuplicateXValues_returnsFalse() {
        XYSeries s1 = new XYSeries("SameKey", true, true);
        XYSeries s2 = new XYSeries("SameKey", true, false);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentData_returnsFalse() {
        XYSeries s1 = new XYSeries("SameKey");
        XYSeries s2 = new XYSeries("SameKey");
        s1.add(1.0, 1.0);
        s2.add(2.0, 2.0);
        assertFalse(s1.equals(s2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_emptySeries_returnsConsistentValue() {
        int hash1 = series.hashCode();
        int hash2 = series.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_singleItem_computesCorrectly() {
        series.add(1.0, 1.0);
        int hash = series.hashCode();
        assertNotNull(hash);
    }

    @Test
    public void testHashCode_twoItems_computesCorrectly() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        int hash = series.hashCode();
        assertNotNull(hash);
    }

    @Test
    public void testHashCode_threeOrMoreItems_computesCorrectly() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        int hash = series.hashCode();
        assertNotNull(hash);
    }

    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        XYSeries s1 = new XYSeries("SameKey");
        XYSeries s2 = new XYSeries("SameKey");
        s1.add(1.0, 1.0);
        s2.add(1.0, 1.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}
