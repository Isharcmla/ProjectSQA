package org.jfree.data.category;

import java.util.List;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetChangeListener;
import org.junit.Assert;
import org.junit.Test;

public class DefaultIntervalCategoryDatasetTest {

    static class TestDatasetChangeListener implements DatasetChangeListener {
        int eventCount = 0;

        @Override
        public void datasetChanged(DatasetChangeEvent event) {
            this.eventCount++;
        }
    }

    @Test
    public void testConstructor_doubleArrays_success() {
        double[][] starts = new double[][] {{1.0, 2.0}, {3.0, 4.0}};
        double[][] ends = new double[][] {{2.0, 3.0}, {4.0, 5.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);

        Assert.assertEquals(2, dataset.getSeriesCount());
        Assert.assertEquals(2, dataset.getCategoryCount());
        Assert.assertEquals(1.0, dataset.getStartValue(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(2.0, dataset.getEndValue(0, 0).doubleValue(), 0.0001);
    }

    @Test
    public void testConstructor_numberArrays_success() {
        Number[][] starts = new Number[][] {{1.0, 2.0}};
        Number[][] ends = new Number[][] {{2.0, 3.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);

        Assert.assertEquals(1, dataset.getSeriesCount());
        Assert.assertEquals(2, dataset.getCategoryCount());
    }

    @Test
    public void testConstructor_seriesNamesAndNumberArrays_success() {
        String[] seriesNames = new String[] {"S1", "S2"};
        Number[][] starts = new Number[][] {{1, 2}, {3, 4}};
        Number[][] ends = new Number[][] {{2, 3}, {4, 5}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(seriesNames, starts, ends);

        Assert.assertEquals("S1", dataset.getSeriesKey(0));
        Assert.assertEquals("S2", dataset.getSeriesKey(1));
        Assert.assertEquals(2, dataset.getSeriesCount());
    }

    @Test
    public void testConstructor_customKeys_success() {
        Comparable[] sKeys = new Comparable[] {"Series A", "Series B"};
        Comparable[] cKeys = new Comparable[] {"Cat 1", "Cat 2", "Cat 3"};
        Number[][] starts = new Number[][] {{1, 2, 3}, {4, 5, 6}};
        Number[][] ends = new Number[][] {{2, 3, 4}, {5, 6, 7}};

        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);

        Assert.assertEquals(2, dataset.getSeriesCount());
        Assert.assertEquals(3, dataset.getCategoryCount());
        Assert.assertEquals("Series A", dataset.getSeriesKey(0));
        Assert.assertEquals("Cat 1", dataset.getColumnKey(0));
    }

    @Test
    public void testConstructor_emptyArrays_success() {
        Number[][] starts = new Number[0][0];
        Number[][] ends = new Number[0][0];
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);

        Assert.assertEquals(0, dataset.getSeriesCount());
        Assert.assertEquals(0, dataset.getCategoryCount());
        Assert.assertTrue(dataset.getRowKeys().isEmpty());
        Assert.assertTrue(dataset.getColumnKeys().isEmpty());
    }

    @Test
    public void testConstructor_nullStartsAndEnds_success() {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                (Comparable[]) null, (Comparable[]) null, (Number[][]) null, (Number[][]) null);
        Assert.assertEquals(0, dataset.getSeriesCount());
        Assert.assertEquals(0, dataset.getCategoryCount());
        Assert.assertTrue(dataset.getColumnKeys().isEmpty());
        Assert.assertTrue(dataset.getRowKeys().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_seriesCountMismatch_throwsException() {
        Number[][] starts = new Number[][] {{1.0, 2.0}};
        Number[][] ends = new Number[][] {{1.0, 2.0}, {3.0, 4.0}};
        new DefaultIntervalCategoryDataset(starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_seriesKeysLengthMismatch_throwsException() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Number[][] starts = new Number[][] {{1, 2}, {3, 4}};
        Number[][] ends = new Number[][] {{2, 3}, {4, 5}};
        new DefaultIntervalCategoryDataset(sKeys, null, starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_categoryCountMismatch_throwsException() {
        Number[][] starts = new Number[][] {{1.0, 2.0}};
        Number[][] ends = new Number[][] {{1.0}};
        new DefaultIntervalCategoryDataset(starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_categoryKeysLengthMismatch_throwsException() {
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{1, 2}};
        Number[][] ends = new Number[][] {{2, 3}};
        new DefaultIntervalCategoryDataset(null, cKeys, starts, ends);
    }

    @Test
    public void testGetSeriesIndex_existingAndNonExisting() {
        Comparable[] sKeys = new Comparable[] {"S1", "S2"};
        Number[][] starts = new Number[][] {{1}, {2}};
        Number[][] ends = new Number[][] {{2}, {3}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, null, starts, ends);

        Assert.assertEquals(0, dataset.getSeriesIndex("S1"));
        Assert.assertEquals(1, dataset.getSeriesIndex("S2"));
        Assert.assertEquals(-1, dataset.getSeriesIndex("Unknown"));
        Assert.assertEquals(0, dataset.getRowIndex("S1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_indexNegative_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getSeriesKey(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_indexOutOfBounds_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getSeriesKey(1);
    }

    @Test
    public void testSetSeriesKeys_validInput_updatesKeysAndFiresEvent() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        TestDatasetChangeListener listener = new TestDatasetChangeListener();
        dataset.addChangeListener(listener);

        Comparable[] newKeys = new Comparable[] {"NewSeries"};
        dataset.setSeriesKeys(newKeys);

        Assert.assertEquals("NewSeries", dataset.getSeriesKey(0));
        Assert.assertEquals(1, listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_null_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.setSeriesKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_invalidLength_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.setSeriesKeys(new Comparable[] {"S1", "S2"});
    }

    @Test
    public void testGetColumnKeys_and_getRowKeys() {
        Comparable[] sKeys = new Comparable[] {"S1", "S2"};
        Comparable[] cKeys = new Comparable[] {"C1", "C2", "C3"};
        Number[][] starts = new Number[][] {{1, 2, 3}, {4, 5, 6}};
        Number[][] ends = new Number[][] {{2, 3, 4}, {5, 6, 7}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);

        List colKeys = dataset.getColumnKeys();
        Assert.assertEquals(3, colKeys.size());
        Assert.assertEquals("C1", colKeys.get(0));

        List rowKeys = dataset.getRowKeys();
        Assert.assertEquals(2, rowKeys.size());
        Assert.assertEquals("S1", rowKeys.get(0));

        Assert.assertEquals("C1", dataset.getColumnKey(0));
        Assert.assertEquals("S1", dataset.getRowKey(0));
        Assert.assertEquals(3, dataset.getColumnCount());
        Assert.assertEquals(2, dataset.getRowCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_negativeIndex_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getRowKey(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_indexOutOfBounds_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getRowKey(1);
    }

    @Test
    public void testSetCategoryKeys_validInput_updatesKeysAndFiresEvent() {
        Number[][] starts = new Number[][] {{1, 2}};
        Number[][] ends = new Number[][] {{2, 3}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        TestDatasetChangeListener listener = new TestDatasetChangeListener();
        dataset.addChangeListener(listener);

        Comparable[] newKeys = new Comparable[] {"Category A", "Category B"};
        dataset.setCategoryKeys(newKeys);

        Assert.assertEquals("Category A", dataset.getColumnKey(0));
        Assert.assertEquals("Category B", dataset.getColumnKey(1));
        Assert.assertEquals(1, listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_null_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.setCategoryKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_invalidLength_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.setCategoryKeys(new Comparable[] {"C1", "C2"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_containsNullElement_throwsException() {
        Number[][] starts = new Number[][] {{1, 2}};
        Number[][] ends = new Number[][] {{2, 3}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.setCategoryKeys(new Comparable[] {"C1", null});
    }

    @Test
    public void testGetColumnIndex_validAndInvalid() {
        Comparable[] cKeys = new Comparable[] {"C1", "C2"};
        Number[][] starts = new Number[][] {{1, 2}};
        Number[][] ends = new Number[][] {{2, 3}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(null, cKeys, starts, ends);

        Assert.assertEquals(0, dataset.getColumnIndex("C1"));
        Assert.assertEquals(1, dataset.getColumnIndex("C2"));
        Assert.assertEquals(-1, dataset.getColumnIndex("NonExistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_nullKey_throwsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getColumnIndex(null);
    }

    @Test
    public void testGetValueAndIntervalValues_byIndicesAndKeys() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);

        Assert.assertEquals(20.0, dataset.getValue(0, 0));
        Assert.assertEquals(20.0, dataset.getValue("S1", "C1"));
        Assert.assertEquals(10.0, dataset.getStartValue(0, 0));
        Assert.assertEquals(10.0, dataset.getStartValue("S1", "C1"));
        Assert.assertEquals(20.0, dataset.getEndValue(0, 0));
        Assert.assertEquals(20.0, dataset.getEndValue("S1", "C1"));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_unknownSeries_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getValue("Unknown", dataset.getColumnKey(0));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_unknownCategory_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getValue(dataset.getSeriesKey(0), "Unknown");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_unknownSeries_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getStartValue("Unknown", dataset.getColumnKey(0));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_unknownCategory_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getStartValue(dataset.getSeriesKey(0), "Unknown");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_unknownSeries_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getEndValue("Unknown", dataset.getColumnKey(0));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_unknownCategory_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getEndValue(dataset.getSeriesKey(0), "Unknown");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_seriesIndexNegative_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getStartValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_seriesIndexOutOfBounds_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getStartValue(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_categoryIndexNegative_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getStartValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_categoryIndexOutOfBounds_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getStartValue(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_seriesIndexNegative_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getEndValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_seriesIndexOutOfBounds_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getEndValue(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_categoryIndexNegative_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getEndValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_categoryIndexOutOfBounds_throwsException() {
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getEndValue(0, 1);
    }

    @Test
    public void testSetStartValue_valid_success() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        TestDatasetChangeListener listener = new TestDatasetChangeListener();
        dataset.addChangeListener(listener);

        dataset.setStartValue(0, "C1", 15.0);
        Assert.assertEquals(15.0, dataset.getStartValue(0, 0));
        Assert.assertEquals(1, listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_invalidSeriesNegative_throwsException() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        dataset.setStartValue(-1, "C1", 15.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_invalidSeriesHigh_throwsException() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        dataset.setStartValue(1, "C1", 15.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_invalidCategory_throwsException() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        dataset.setStartValue(0, "UnknownCat", 15.0);
    }

    @Test
    public void testSetEndValue_valid_success() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        TestDatasetChangeListener listener = new TestDatasetChangeListener();
        dataset.addChangeListener(listener);

        dataset.setEndValue(0, "C1", 25.0);
        Assert.assertEquals(25.0, dataset.getEndValue(0, 0));
        Assert.assertEquals(1, listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_invalidSeriesNegative_throwsException() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        dataset.setEndValue(-1, "C1", 25.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_invalidSeriesHigh_throwsException() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        dataset.setEndValue(1, "C1", 25.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_invalidCategory_throwsException() {
        Comparable[] sKeys = new Comparable[] {"S1"};
        Comparable[] cKeys = new Comparable[] {"C1"};
        Number[][] starts = new Number[][] {{10.0}};
        Number[][] ends = new Number[][] {{20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(sKeys, cKeys, starts, ends);
        dataset.setEndValue(0, "UnknownCat", 25.0);
    }

    @Test
    public void testEqualsAndHashCode() {
        Number[][] starts1 = new Number[][] {{1.0, 2.0}};
        Number[][] ends1 = new Number[][] {{2.0, 3.0}};
        DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(starts1, ends1);

        Number[][] starts2 = new Number[][] {{1.0, 2.0}};
        Number[][] ends2 = new Number[][] {{2.0, 3.0}};
        DefaultIntervalCategoryDataset d2 = new DefaultIntervalCategoryDataset(starts2, ends2);

        Assert.assertTrue(d1.equals(d1));
        Assert.assertFalse(d1.equals(null));
        Assert.assertFalse(d1.equals("Not a dataset"));
        Assert.assertTrue(d1.equals(d2));

        // Test difference in series keys
        d2.setSeriesKeys(new Comparable[] {"DifferentSeries"});
        Assert.assertFalse(d1.equals(d2));

        // Restore series keys, change category keys
        d2.setSeriesKeys(new Comparable[] {d1.getSeriesKey(0)});
        d2.setCategoryKeys(new Comparable[] {"Diff1", "Diff2"});
        Assert.assertFalse(d1.equals(d2));

        // Restore category keys, change start value
        d2.setCategoryKeys(new Comparable[] {d1.getColumnKey(0), d1.getColumnKey(1)});
        d2.setStartValue(0, d2.getColumnKey(0), 99.0);
        Assert.assertFalse(d1.equals(d2));

        // Restore start value, change end value
        d2.setStartValue(0, d2.getColumnKey(0), 1.0);
        d2.setEndValue(0, d2.getColumnKey(0), 99.0);
        Assert.assertFalse(d1.equals(d2));
    }

    @Test
    public void testEquals_nullAndDimensionMismatches() {
        DefaultIntervalCategoryDataset empty1 = new DefaultIntervalCategoryDataset(
                (Comparable[]) null, (Comparable[]) null, (Number[][]) null, (Number[][]) null);
        DefaultIntervalCategoryDataset empty2 = new DefaultIntervalCategoryDataset(
                (Comparable[]) null, (Comparable[]) null, (Number[][]) null, (Number[][]) null);
        Assert.assertTrue(empty1.equals(empty2));

        DefaultIntervalCategoryDataset dataset1 = new DefaultIntervalCategoryDataset(
                new Number[][] {{1.0}}, new Number[][] {{2.0}});
        Assert.assertFalse(empty1.equals(dataset1));
        Assert.assertFalse(dataset1.equals(empty1));

        DefaultIntervalCategoryDataset dataset2 = new DefaultIntervalCategoryDataset(
                new Number[][] {{1.0}, {2.0}}, new Number[][] {{2.0}, {3.0}});
        Assert.assertFalse(dataset1.equals(dataset2));

        DefaultIntervalCategoryDataset dataset3 = new DefaultIntervalCategoryDataset(
                new Number[][] {{1.0, 1.5}}, new Number[][] {{2.0, 2.5}});
        Assert.assertFalse(dataset1.equals(dataset3));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Number[][] starts = new Number[][] {{1.0, 2.0}};
        Number[][] ends = new Number[][] {{2.0, 3.0}};
        DefaultIntervalCategoryDataset original = new DefaultIntervalCategoryDataset(starts, ends);
        DefaultIntervalCategoryDataset cloned = (DefaultIntervalCategoryDataset) original.clone();

        Assert.assertNotSame(original, cloned);
        Assert.assertTrue(original.equals(cloned));

        cloned.setStartValue(0, cloned.getColumnKey(0), 99.0);
        Assert.assertFalse(original.equals(cloned));
    }
}
