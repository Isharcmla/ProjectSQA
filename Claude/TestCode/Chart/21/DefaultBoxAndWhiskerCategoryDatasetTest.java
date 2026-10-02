package org.jfree.data.statistics;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class DefaultBoxAndWhiskerCategoryDatasetTest {

    private DefaultBoxAndWhiskerCategoryDataset dataset;

    @Before
    public void setUp() {
        dataset = new DefaultBoxAndWhiskerCategoryDataset();
    }

    private BoxAndWhiskerItem createItem(double mean, double median, double q1,
            double q3, double minReg, double maxReg, double minOutlier,
            double maxOutlier, List outliers) {
        return new BoxAndWhiskerItem(mean, median, q1, q3, minReg, maxReg,
                minOutlier, maxOutlier, outliers);
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_initialState_defaultsAreCorrect() {
        assertEquals(0, dataset.getRowCount());
        assertEquals(0, dataset.getColumnCount());
        assertTrue(Double.isNaN(dataset.getRangeLowerBound(true)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(true)));
        Range r = dataset.getRangeBounds(true);
        assertEquals(0.0, r.getLowerBound(), 0.0000001);
        assertEquals(0.0, r.getUpperBound(), 0.0000001);
    }

    // ---------- add(BoxAndWhiskerItem, Comparable, Comparable) ----------

    @Test
    public void testAddItem_normalInput_storesAndUpdatesBounds() {
        List outliers = new ArrayList();
        outliers.add(new Double(1.0));
        BoxAndWhiskerItem item = createItem(5.0, 5.0, 3.0, 7.0, 1.0, 9.0, 0.5, 10.0, outliers);
        dataset.add(item, "R1", "C1");

        assertEquals(1, dataset.getRowCount());
        assertEquals(1, dataset.getColumnCount());
        assertSame(item, dataset.getItem(0, 0));

        assertEquals(0.5, dataset.getRangeLowerBound(true), 0.0000001);
        assertEquals(10.0, dataset.getRangeUpperBound(true), 0.0000001);

        Range r = dataset.getRangeBounds(true);
        assertEquals(0.5, r.getLowerBound(), 0.0000001);
        assertEquals(10.0, r.getUpperBound(), 0.0000001);
    }

    @Test
    public void testAddItem_multipleItems_updatesMinMaxCorrectly() {
        BoxAndWhiskerItem item1 = createItem(5.0, 5.0, 3.0, 7.0, 1.0, 9.0, 0.5, 10.0, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(6.0, 6.0, 4.0, 8.0, 2.0, 10.0, -1.0, 15.0, new ArrayList());
        BoxAndWhiskerItem item3 = createItem(4.0, 4.0, 2.0, 6.0, 0.0, 8.0, 2.0, 3.0, new ArrayList());

        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C1");
        dataset.add(item3, "R3", "C1");

        assertEquals(-1.0, dataset.getRangeLowerBound(true), 0.0000001);
        assertEquals(15.0, dataset.getRangeUpperBound(true), 0.0000001);
    }

    @Test
    public void testAddItem_overwriteSameCell_triggersUpdateBoundsBranch() {
        BoxAndWhiskerItem item1 = createItem(5.0, 5.0, 3.0, 7.0, 1.0, 9.0, 0.5, 10.0, new ArrayList());
        dataset.add(item1, "R1", "C1");

        // Overwrite same row/col -> triggers the branch that resets bounds
        BoxAndWhiskerItem item2 = createItem(2.0, 2.0, 1.0, 3.0, 0.0, 4.0, -5.0, 6.0, new ArrayList());
        dataset.add(item2, "R1", "C1");

        assertEquals(-5.0, dataset.getRangeLowerBound(true), 0.0000001);
        assertEquals(6.0, dataset.getRangeUpperBound(true), 0.0000001);
    }

    @Test
    public void testAddItem_nullOutliers_handlesNaNGracefully() {
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(5.0, 5.0, 3.0, 7.0, 1.0,
                9.0, null, null, new ArrayList());
        dataset.add(item, "R1", "C1");

        assertTrue(Double.isNaN(dataset.getRangeLowerBound(true)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(true)));
    }

    @Test(expected = NullPointerException.class)
    public void testAddItem_nullItem_throwsException() {
        dataset.add((BoxAndWhiskerItem) null, "R1", "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItem_nullRowKey_throwsException() {
        BoxAndWhiskerItem item = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        dataset.add(item, null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItem_nullColumnKey_throwsException() {
        BoxAndWhiskerItem item = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        dataset.add(item, "R1", null);
    }

    // ---------- add(List, Comparable, Comparable) ----------

    @Test
    public void testAddList_normalInput_calculatesStatisticsAndAdds() {
        List values = Arrays.asList(new Double(1.0), new Double(2.0),
                new Double(3.0), new Double(4.0), new Double(5.0));
        dataset.add(values, "R1", "C1");

        assertEquals(1, dataset.getRowCount());
        assertEquals(1, dataset.getColumnCount());
        assertNotNull(dataset.getItem(0, 0));
    }

    // ---------- getItem ----------

    @Test
    public void testGetItem_validIndices_returnsCorrectItem() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertSame(item, dataset.getItem(0, 0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetItem_emptyDataset_throwsException() {
        dataset.getItem(0, 0);
    }

    // ---------- getValue ----------

    @Test
    public void testGetValue_intIndices_returnsMedian() {
        BoxAndWhiskerItem item = createItem(1, 2.5, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(2.5, dataset.getValue(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetValue_comparableKeys_returnsMedian() {
        BoxAndWhiskerItem item = createItem(1, 2.5, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(2.5, dataset.getValue("R1", "C1").doubleValue(), 0.0000001);
    }

    // ---------- getMeanValue ----------

    @Test
    public void testGetMeanValue_intIndices_returnsMean() {
        BoxAndWhiskerItem item = createItem(9.9, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(9.9, dataset.getMeanValue(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMeanValue_comparableKeys_returnsMean() {
        BoxAndWhiskerItem item = createItem(9.9, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(9.9, dataset.getMeanValue("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMeanValue_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");

        // cell (R1, C2) not populated -> should return null
        assertNull(dataset.getMeanValue(0, 1));
        assertNull(dataset.getMeanValue("R1", "C2"));
    }

    // ---------- getMedianValue ----------

    @Test
    public void testGetMedianValue_intIndices_returnsMedian() {
        BoxAndWhiskerItem item = createItem(1, 4.4, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(4.4, dataset.getMedianValue(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMedianValue_comparableKeys_returnsMedian() {
        BoxAndWhiskerItem item = createItem(1, 4.4, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(4.4, dataset.getMedianValue("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMedianValue_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getMedianValue(0, 1));
        assertNull(dataset.getMedianValue("R1", "C2"));
    }

    // ---------- getQ1Value ----------

    @Test
    public void testGetQ1Value_intIndices_returnsQ1() {
        BoxAndWhiskerItem item = createItem(1, 2, 3.3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(3.3, dataset.getQ1Value(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetQ1Value_comparableKeys_returnsQ1() {
        BoxAndWhiskerItem item = createItem(1, 2, 3.3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(3.3, dataset.getQ1Value("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetQ1Value_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getQ1Value(0, 1));
        assertNull(dataset.getQ1Value("R1", "C2"));
    }

    // ---------- getQ3Value ----------

    @Test
    public void testGetQ3Value_intIndices_returnsQ3() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4.4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(4.4, dataset.getQ3Value(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetQ3Value_comparableKeys_returnsQ3() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4.4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(4.4, dataset.getQ3Value("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetQ3Value_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getQ3Value(0, 1));
        assertNull(dataset.getQ3Value("R1", "C2"));
    }

    // ---------- column / row keys and indices ----------

    @Test
    public void testGetColumnIndexAndKey_normalInput_returnsCorrectValues() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(0, dataset.getColumnIndex("C1"));
        assertEquals("C1", dataset.getColumnKey(0));
    }

    @Test
    public void testGetColumnKeys_normalInput_returnsListOfKeys() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        List keys = dataset.getColumnKeys();
        assertEquals(1, keys.size());
        assertEquals("C1", keys.get(0));
    }

    @Test
    public void testGetRowIndexAndKey_normalInput_returnsCorrectValues() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(0, dataset.getRowIndex("R1"));
        assertEquals("R1", dataset.getRowKey(0));
    }

    @Test
    public void testGetRowKeys_normalInput_returnsListOfKeys() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        List keys = dataset.getRowKeys();
        assertEquals(1, keys.size());
        assertEquals("R1", keys.get(0));
    }

    @Test
    public void testGetColumnIndex_unknownKey_returnsNegativeOne() {
        assertEquals(-1, dataset.getColumnIndex("UNKNOWN"));
    }

    @Test
    public void testGetRowIndex_unknownKey_returnsNegativeOne() {
        assertEquals(-1, dataset.getRowIndex("UNKNOWN"));
    }

    // ---------- row count / column count ----------

    @Test
    public void testGetRowCount_emptyDataset_returnsZero() {
        assertEquals(0, dataset.getRowCount());
    }

    @Test
    public void testGetColumnCount_emptyDataset_returnsZero() {
        assertEquals(0, dataset.getColumnCount());
    }

    @Test
    public void testGetRowCountAndColumnCount_afterAdding_returnsCorrectCounts() {
        BoxAndWhiskerItem item1 = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
    }

    // ---------- range bounds ----------

    @Test
    public void testGetRangeLowerBoundAndUpperBound_afterAdd_returnsCorrectValues() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, -10.0, 20.0, -15.0, 25.0, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(-15.0, dataset.getRangeLowerBound(true), 0.0000001);
        assertEquals(25.0, dataset.getRangeUpperBound(true), 0.0000001);
        assertEquals(-15.0, dataset.getRangeLowerBound(false), 0.0000001);
        assertEquals(25.0, dataset.getRangeUpperBound(false), 0.0000001);
    }

    @Test
    public void testGetRangeBounds_afterAdd_returnsCorrectRange() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, -10.0, 20.0, -15.0, 25.0, new ArrayList());
        dataset.add(item, "R1", "C1");
        Range r = dataset.getRangeBounds(true);
        assertEquals(-15.0, r.getLowerBound(), 0.0000001);
        assertEquals(25.0, r.getUpperBound(), 0.0000001);
    }

    // ---------- getMinRegularValue / getMaxRegularValue ----------

    @Test
    public void testGetMinRegularValue_intIndices_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 1.1, 9.9, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(1.1, dataset.getMinRegularValue(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMinRegularValue_comparableKeys_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 1.1, 9.9, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(1.1, dataset.getMinRegularValue("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMinRegularValue_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getMinRegularValue(0, 1));
        assertNull(dataset.getMinRegularValue("R1", "C2"));
    }

    @Test
    public void testGetMaxRegularValue_intIndices_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 1.1, 9.9, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(9.9, dataset.getMaxRegularValue(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMaxRegularValue_comparableKeys_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 1.1, 9.9, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(9.9, dataset.getMaxRegularValue("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMaxRegularValue_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getMaxRegularValue(0, 1));
        assertNull(dataset.getMaxRegularValue("R1", "C2"));
    }

    // ---------- getMinOutlier / getMaxOutlier ----------

    @Test
    public void testGetMinOutlier_intIndices_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, -2.2, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(-2.2, dataset.getMinOutlier(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMinOutlier_comparableKeys_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, -2.2, 8, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(-2.2, dataset.getMinOutlier("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMinOutlier_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getMinOutlier(0, 1));
        assertNull(dataset.getMinOutlier("R1", "C2"));
    }

    @Test
    public void testGetMaxOutlier_intIndices_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 12.5, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(12.5, dataset.getMaxOutlier(0, 0).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMaxOutlier_comparableKeys_returnsCorrectValue() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 12.5, new ArrayList());
        dataset.add(item, "R1", "C1");
        assertEquals(12.5, dataset.getMaxOutlier("R1", "C1").doubleValue(), 0.0000001);
    }

    @Test
    public void testGetMaxOutlier_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getMaxOutlier(0, 1));
        assertNull(dataset.getMaxOutlier("R1", "C2"));
    }

    // ---------- getOutliers ----------

    @Test
    public void testGetOutliers_intIndices_returnsCorrectList() {
        List outliers = new ArrayList();
        outliers.add(new Double(100.0));
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, outliers);
        dataset.add(item, "R1", "C1");
        List result = dataset.getOutliers(0, 0);
        assertEquals(1, result.size());
        assertEquals(100.0, ((Number) result.get(0)).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetOutliers_comparableKeys_returnsCorrectList() {
        List outliers = new ArrayList();
        outliers.add(new Double(100.0));
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, outliers);
        dataset.add(item, "R1", "C1");
        List result = dataset.getOutliers("R1", "C1");
        assertEquals(1, result.size());
        assertEquals(100.0, ((Number) result.get(0)).doubleValue(), 0.0000001);
    }

    @Test
    public void testGetOutliers_missingCell_returnsNull() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1, 1, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2, 2, new ArrayList());
        dataset.add(item1, "R1", "C1");
        dataset.add(item2, "R2", "C2");
        assertNull(dataset.getOutliers(0, 1));
        assertNull(dataset.getOutliers("R1", "C2"));
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(dataset.equals(dataset));
    }

    @Test
    public void testEquals_equalDatasets_returnsTrue() {
        DefaultBoxAndWhiskerCategoryDataset d2 = new DefaultBoxAndWhiskerCategoryDataset();
        BoxAndWhiskerItem item1 = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item1, "R1", "C1");
        d2.add(item2, "R1", "C1");
        assertTrue(dataset.equals(d2));
        assertTrue(d2.equals(dataset));
    }

    @Test
    public void testEquals_differentDatasets_returnsFalse() {
        DefaultBoxAndWhiskerCategoryDataset d2 = new DefaultBoxAndWhiskerCategoryDataset();
        BoxAndWhiskerItem item1 = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        BoxAndWhiskerItem item2 = createItem(9, 9, 9, 9, 9, 9, 9, 9, new ArrayList());
        dataset.add(item1, "R1", "C1");
        d2.add(item2, "R1", "C1");
        assertFalse(dataset.equals(d2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(dataset.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(dataset.equals("SomeString"));
    }

    // ---------- clone ----------

    @Test
    public void testClone_returnsEqualButDistinctObject() throws Exception {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");

        DefaultBoxAndWhiskerCategoryDataset clone =
                (DefaultBoxAndWhiskerCategoryDataset) dataset.clone();

        assertNotSame(dataset, clone);
        assertTrue(dataset.equals(clone));
        assertEquals(dataset.getRowCount(), clone.getRowCount());
        assertEquals(dataset.getColumnCount(), clone.getColumnCount());
    }

    @Test
    public void testClone_modifyingCloneDoesNotAffectOriginal() throws Exception {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6, 7, 8, new ArrayList());
        dataset.add(item, "R1", "C1");

        DefaultBoxAndWhiskerCategoryDataset clone =
                (DefaultBoxAndWhiskerCategoryDataset) dataset.clone();

        BoxAndWhiskerItem newItem = createItem(10, 10, 10, 10, 10, 10, 10, 10, new ArrayList());
        clone.add(newItem, "R2", "C2");

        assertEquals(1, dataset.getRowCount());
        assertEquals(2, clone.getRowCount());
    }
}
