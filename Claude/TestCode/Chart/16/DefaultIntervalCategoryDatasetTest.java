import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.List;

import org.jfree.data.UnknownKeyException;

public class DefaultIntervalCategoryDatasetTest {

    private double[][] starts;
    private double[][] ends;
    private Number[][] startsN;
    private Number[][] endsN;
    private String[] seriesNames;
    private Comparable[] seriesKeys;
    private Comparable[] categoryKeys;

    private DefaultIntervalCategoryDataset dataset;

    @Before
    public void setUp() {
        starts = new double[][] { {1.0, 2.0}, {3.0, 4.0} };
        ends = new double[][] { {5.0, 6.0}, {7.0, 8.0} };
        startsN = new Number[][] { {1.0, 2.0}, {3.0, 4.0} };
        endsN = new Number[][] { {5.0, 6.0}, {7.0, 8.0} };
        seriesNames = new String[] {"S1", "S2"};
        seriesKeys = new Comparable[] {"Series1", "Series2"};
        categoryKeys = new Comparable[] {"Cat1", "Cat2"};

        dataset = new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys,
                startsN, endsN);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_doubleArray_normal_createsDataset() {
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(starts, ends);
        assertEquals(2, ds.getSeriesCount());
        assertEquals(2, ds.getCategoryCount());
    }

    @Test
    public void testConstructor_NumberArray_normal_createsDataset() {
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(startsN, endsN);
        assertEquals(2, ds.getSeriesCount());
        assertEquals(2, ds.getCategoryCount());
        assertEquals("Series 1", ds.getSeriesKey(0));
        assertEquals("Category 1", ds.getColumnKey(0));
    }

    @Test
    public void testConstructor_withSeriesNames_normal_createsDataset() {
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(seriesNames, startsN, endsN);
        assertEquals("S1", ds.getSeriesKey(0));
        assertEquals("S2", ds.getSeriesKey(1));
        assertEquals("Category 1", ds.getColumnKey(0));
    }

    @Test
    public void testConstructor_withSeriesAndCategoryKeys_normal_createsDataset() {
        assertEquals("Series1", dataset.getSeriesKey(0));
        assertEquals("Cat1", dataset.getColumnKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_mismatchedSeriesCount_throwsException() {
        Number[][] s = { {1.0, 2.0} };
        Number[][] e = { {1.0, 2.0}, {3.0, 4.0} };
        new DefaultIntervalCategoryDataset(s, e);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_mismatchedCategoryCount_throwsException() {
        Number[][] s = { {1.0, 2.0}, {3.0, 4.0} };
        Number[][] e = { {1.0, 2.0, 3.0}, {4.0, 5.0, 6.0} };
        new DefaultIntervalCategoryDataset(s, e);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_mismatchedSeriesKeysLength_throwsException() {
        Comparable[] badSeriesKeys = {"OnlyOne"};
        new DefaultIntervalCategoryDataset(badSeriesKeys, categoryKeys,
                startsN, endsN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_mismatchedCategoryKeysLength_throwsException() {
        Comparable[] badCategoryKeys = {"OnlyOne"};
        new DefaultIntervalCategoryDataset(seriesKeys, badCategoryKeys,
                startsN, endsN);
    }

    @Test
    public void testConstructor_emptySeries_keysAreNull() {
        Number[][] s = new Number[0][0];
        Number[][] e = new Number[0][0];
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(s, e);
        assertEquals(0, ds.getSeriesCount());
        assertEquals(0, ds.getCategoryCount());
        List cols = ds.getColumnKeys();
        assertNotNull(cols);
        assertTrue(cols.isEmpty());
        List rows = ds.getRowKeys();
        assertNotNull(rows);
        assertTrue(rows.isEmpty());
    }

    // ---------- getSeriesCount ----------

    @Test
    public void testGetSeriesCount_normal_returnsCorrectCount() {
        assertEquals(2, dataset.getSeriesCount());
    }

    // ---------- getSeriesIndex ----------

    @Test
    public void testGetSeriesIndex_existingKey_returnsIndex() {
        assertEquals(0, dataset.getSeriesIndex("Series1"));
        assertEquals(1, dataset.getSeriesIndex("Series2"));
    }

    @Test
    public void testGetSeriesIndex_unknownKey_returnsMinusOne() {
        assertEquals(-1, dataset.getSeriesIndex("Unknown"));
    }

    // ---------- getSeriesKey ----------

    @Test
    public void testGetSeriesKey_validIndex_returnsKey() {
        assertEquals("Series1", dataset.getSeriesKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_negativeIndex_throwsException() {
        dataset.getSeriesKey(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_indexTooLarge_throwsException() {
        dataset.getSeriesKey(2);
    }

    // ---------- setSeriesKeys ----------

    @Test
    public void testSetSeriesKeys_validKeys_updatesKeys() {
        Comparable[] newKeys = {"NewSeries1", "NewSeries2"};
        dataset.setSeriesKeys(newKeys);
        assertEquals("NewSeries1", dataset.getSeriesKey(0));
        assertEquals("NewSeries2", dataset.getSeriesKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_null_throwsException() {
        dataset.setSeriesKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_wrongLength_throwsException() {
        Comparable[] badKeys = {"OnlyOne"};
        dataset.setSeriesKeys(badKeys);
    }

    // ---------- getCategoryCount ----------

    @Test
    public void testGetCategoryCount_normal_returnsCorrectCount() {
        assertEquals(2, dataset.getCategoryCount());
    }

    @Test
    public void testGetCategoryCount_noSeries_returnsZero() {
        Number[][] s = new Number[0][0];
        Number[][] e = new Number[0][0];
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(s, e);
        assertEquals(0, ds.getCategoryCount());
    }

    // ---------- getColumnKeys ----------

    @Test
    public void testGetColumnKeys_normal_returnsKeysList() {
        List keys = dataset.getColumnKeys();
        assertEquals(2, keys.size());
        assertEquals("Cat1", keys.get(0));
        assertEquals("Cat2", keys.get(1));
    }

    // ---------- setCategoryKeys ----------

    @Test
    public void testSetCategoryKeys_validKeys_updatesKeys() {
        Comparable[] newKeys = {"NewCat1", "NewCat2"};
        dataset.setCategoryKeys(newKeys);
        assertEquals("NewCat1", dataset.getColumnKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_null_throwsException() {
        dataset.setCategoryKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_wrongLength_throwsException() {
        Comparable[] badKeys = {"OnlyOne"};
        dataset.setCategoryKeys(badKeys);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_containsNull_throwsException() {
        Comparable[] badKeys = {"Valid", null};
        dataset.setCategoryKeys(badKeys);
    }

    // ---------- getValue(Comparable, Comparable) ----------

    @Test
    public void testGetValueComparable_validKeys_returnsEndValue() {
        Number val = dataset.getValue("Series1", "Cat1");
        assertEquals(5.0, val.doubleValue(), 0.0001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueComparable_unknownSeries_throwsException() {
        dataset.getValue("UnknownSeries", "Cat1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueComparable_unknownCategory_throwsException() {
        dataset.getValue("Series1", "UnknownCategory");
    }

    // ---------- getValue(int, int) ----------

    @Test
    public void testGetValueIntInt_normal_returnsEndValue() {
        Number val = dataset.getValue(0, 0);
        assertEquals(5.0, val.doubleValue(), 0.0001);
    }

    // ---------- getStartValue(Comparable, Comparable) ----------

    @Test
    public void testGetStartValueComparable_validKeys_returnsStartValue() {
        Number val = dataset.getStartValue("Series1", "Cat1");
        assertEquals(1.0, val.doubleValue(), 0.0001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValueComparable_unknownSeries_throwsException() {
        dataset.getStartValue("UnknownSeries", "Cat1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValueComparable_unknownCategory_throwsException() {
        dataset.getStartValue("Series1", "UnknownCategory");
    }

    // ---------- getStartValue(int, int) ----------

    @Test
    public void testGetStartValueIntInt_normal_returnsValue() {
        Number val = dataset.getStartValue(1, 1);
        assertEquals(4.0, val.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueIntInt_negativeSeries_throwsException() {
        dataset.getStartValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueIntInt_seriesTooLarge_throwsException() {
        dataset.getStartValue(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueIntInt_negativeCategory_throwsException() {
        dataset.getStartValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueIntInt_categoryTooLarge_throwsException() {
        dataset.getStartValue(0, 2);
    }

    // ---------- getEndValue(Comparable, Comparable) ----------

    @Test
    public void testGetEndValueComparable_validKeys_returnsEndValue() {
        Number val = dataset.getEndValue("Series2", "Cat2");
        assertEquals(8.0, val.doubleValue(), 0.0001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValueComparable_unknownSeries_throwsException() {
        dataset.getEndValue("UnknownSeries", "Cat1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValueComparable_unknownCategory_throwsException() {
        dataset.getEndValue("Series1", "UnknownCategory");
    }

    // ---------- getEndValue(int, int) ----------

    @Test
    public void testGetEndValueIntInt_normal_returnsValue() {
        Number val = dataset.getEndValue(0, 1);
        assertEquals(6.0, val.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueIntInt_negativeSeries_throwsException() {
        dataset.getEndValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueIntInt_seriesTooLarge_throwsException() {
        dataset.getEndValue(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueIntInt_negativeCategory_throwsException() {
        dataset.getEndValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueIntInt_categoryTooLarge_throwsException() {
        dataset.getEndValue(0, 2);
    }

    // ---------- setStartValue ----------

    @Test
    public void testSetStartValue_validArguments_updatesValue() {
        dataset.setStartValue(0, "Cat1", 99.0);
        assertEquals(99.0, dataset.getStartValue(0, 0).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_negativeSeries_throwsException() {
        dataset.setStartValue(-1, "Cat1", 99.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_seriesTooLarge_throwsException() {
        dataset.setStartValue(2, "Cat1", 99.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_unrecognisedCategory_throwsException() {
        dataset.setStartValue(0, "UnknownCategory", 99.0);
    }

    // ---------- setEndValue ----------

    @Test
    public void testSetEndValue_validArguments_updatesValue() {
        dataset.setEndValue(1, "Cat2", 123.0);
        assertEquals(123.0, dataset.getEndValue(1, 1).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_negativeSeries_throwsException() {
        dataset.setEndValue(-1, "Cat1", 99.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_seriesTooLarge_throwsException() {
        dataset.setEndValue(2, "Cat1", 99.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_unrecognisedCategory_throwsException() {
        dataset.setEndValue(0, "UnknownCategory", 99.0);
    }

    // ---------- getCategoryIndex ----------

    @Test
    public void testGetCategoryIndex_existingKey_returnsIndex() {
        assertEquals(0, dataset.getCategoryIndex("Cat1"));
        assertEquals(1, dataset.getCategoryIndex("Cat2"));
    }

    @Test
    public void testGetCategoryIndex_unknownKey_returnsMinusOne() {
        assertEquals(-1, dataset.getCategoryIndex("UnknownCategory"));
    }

    // ---------- getColumnKey ----------

    @Test
    public void testGetColumnKey_validIndex_returnsKey() {
        assertEquals("Cat1", dataset.getColumnKey(0));
    }

    // ---------- getColumnIndex ----------

    @Test
    public void testGetColumnIndex_validKey_returnsIndex() {
        assertEquals(1, dataset.getColumnIndex("Cat2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_null_throwsException() {
        dataset.getColumnIndex(null);
    }

    // ---------- getRowIndex ----------

    @Test
    public void testGetRowIndex_validKey_returnsIndex() {
        assertEquals(1, dataset.getRowIndex("Series2"));
    }

    @Test
    public void testGetRowIndex_unknownKey_returnsMinusOne() {
        assertEquals(-1, dataset.getRowIndex("UnknownSeries"));
    }

    // ---------- getRowKeys ----------

    @Test
    public void testGetRowKeys_normal_returnsKeysList() {
        List keys = dataset.getRowKeys();
        assertEquals(2, keys.size());
        assertEquals("Series1", keys.get(0));
        assertEquals("Series2", keys.get(1));
    }

    // ---------- getRowKey ----------

    @Test
    public void testGetRowKey_validIndex_returnsKey() {
        assertEquals("Series1", dataset.getRowKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_negativeIndex_throwsException() {
        dataset.getRowKey(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_indexTooLarge_throwsException() {
        dataset.getRowKey(2);
    }

    // ---------- getColumnCount ----------

    @Test
    public void testGetColumnCount_normal_returnsCorrectCount() {
        assertEquals(2, dataset.getColumnCount());
    }

    // ---------- getRowCount ----------

    @Test
    public void testGetRowCount_normal_returnsCorrectCount() {
        assertEquals(2, dataset.getRowCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(dataset.equals(dataset));
    }

    @Test
    public void testEquals_notInstanceOfClass_returnsFalse() {
        assertFalse(dataset.equals("Not a dataset"));
    }

    @Test
    public void testEquals_equalDatasets_returnsTrue() {
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys,
                        startsN, endsN);
        assertTrue(dataset.equals(other));
    }

    @Test
    public void testEquals_differentSeriesKeys_returnsFalse() {
        Comparable[] otherSeriesKeys = {"DifferentSeries1", "DifferentSeries2"};
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(otherSeriesKeys, categoryKeys,
                        startsN, endsN);
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_differentCategoryKeys_returnsFalse() {
        Comparable[] otherCategoryKeys = {"DifferentCat1", "DifferentCat2"};
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(seriesKeys, otherCategoryKeys,
                        startsN, endsN);
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_differentStartData_returnsFalse() {
        Number[][] otherStarts = { {100.0, 200.0}, {300.0, 400.0} };
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys,
                        otherStarts, endsN);
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_differentEndData_returnsFalse() {
        Number[][] otherEnds = { {500.0, 600.0}, {700.0, 800.0} };
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys,
                        startsN, otherEnds);
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(dataset.equals(null));
    }

    // ---------- clone ----------

    @Test
    public void testClone_normal_producesEqualButIndependentCopy()
            throws CloneNotSupportedException {
        DefaultIntervalCategoryDataset clone =
                (DefaultIntervalCategoryDataset) dataset.clone();
        assertTrue(dataset.equals(clone));
        assertNotSame(dataset, clone);

        // Modify clone's data and verify the original is unaffected
        clone.setStartValue(0, "Cat1", 999.0);
        assertEquals(999.0, clone.getStartValue(0, 0).doubleValue(), 0.0001);
        assertEquals(1.0, dataset.getStartValue(0, 0).doubleValue(), 0.0001);
    }
}
