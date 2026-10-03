package org.jfree.data.statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jfree.data.Range;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetChangeListener;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultBoxAndWhiskerCategoryDatasetTest {

    private DefaultBoxAndWhiskerCategoryDataset dataset;

    @Before
    public void setUp() {
        this.dataset = new DefaultBoxAndWhiskerCategoryDataset();
    }

    private BoxAndWhiskerItem createItem(double mean, double median, double q1, double q3,
                                         double minRegular, double maxRegular,
                                         Double minOutlier, Double maxOutlier,
                                         List<Double> outliers) {
        return new BoxAndWhiskerItem(
                Double.valueOf(mean),
                Double.valueOf(median),
                Double.valueOf(q1),
                Double.valueOf(q3),
                Double.valueOf(minRegular),
                Double.valueOf(maxRegular),
                minOutlier,
                maxOutlier,
                outliers != null ? outliers : new ArrayList<Double>()
        );
    }

    @Test
    public void testConstructor_initialState_validDefaults() {
        Assert.assertEquals(0, this.dataset.getRowCount());
        Assert.assertEquals(0, this.dataset.getColumnCount());
        Assert.assertTrue(Double.isNaN(this.dataset.getRangeLowerBound(false)));
        Assert.assertTrue(Double.isNaN(this.dataset.getRangeUpperBound(false)));
        Assert.assertEquals(new Range(0.0, 0.0), this.dataset.getRangeBounds(false));
        Assert.assertTrue(this.dataset.getRowKeys().isEmpty());
        Assert.assertTrue(this.dataset.getColumnKeys().isEmpty());
    }

    @Test
    public void testAdd_withList_calculatesStatisticsCorrectly() {
        List<Double> values = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        this.dataset.add(values, "Row1", "Col1");

        Assert.assertEquals(1, this.dataset.getRowCount());
        Assert.assertEquals(1, this.dataset.getColumnCount());
        Assert.assertNotNull(this.dataset.getItem(0, 0));
        Assert.assertEquals(5.0, this.dataset.getValue("Row1", "Col1").doubleValue(), 0.0001);
    }

    @Test
    public void testAdd_withBoxAndWhiskerItem_updatesRangeBounds() {
        BoxAndWhiskerItem item1 = createItem(10.0, 10.0, 8.0, 12.0, 5.0, 15.0, 2.0, 18.0, Arrays.asList(2.0, 18.0));
        this.dataset.add(item1, "R1", "C1");

        Assert.assertEquals(2.0, this.dataset.getRangeLowerBound(false), 0.0001);
        Assert.assertEquals(18.0, this.dataset.getRangeUpperBound(false), 0.0001);
        Assert.assertEquals(new Range(2.0, 18.0), this.dataset.getRangeBounds(false));

        // Add item with larger max and smaller min
        BoxAndWhiskerItem item2 = createItem(10.0, 10.0, 8.0, 12.0, 5.0, 15.0, 1.0, 25.0, Arrays.asList(1.0, 25.0));
        this.dataset.add(item2, "R1", "C2");

        Assert.assertEquals(1.0, this.dataset.getRangeLowerBound(false), 0.0001);
        Assert.assertEquals(25.0, this.dataset.getRangeUpperBound(false), 0.0001);
        Assert.assertEquals(new Range(1.0, 25.0), this.dataset.getRangeBounds(false));

        // Add item that does not change bounds
        BoxAndWhiskerItem item3 = createItem(10.0, 10.0, 8.0, 12.0, 5.0, 15.0, 5.0, 10.0, Collections.<Double>emptyList());
        this.dataset.add(item3, "R2", "C1");

        Assert.assertEquals(1.0, this.dataset.getRangeLowerBound(false), 0.0001);
        Assert.assertEquals(25.0, this.dataset.getRangeUpperBound(false), 0.0001);
    }

    @Test
    public void testAdd_withNullOutliers_handlesNaNGracefully() {
        BoxAndWhiskerItem item = createItem(10.0, 10.0, 8.0, 12.0, 5.0, 15.0, null, null, null);
        this.dataset.add(item, "R1", "C1");

        Assert.assertTrue(Double.isNaN(this.dataset.getRangeLowerBound(false)));
        Assert.assertTrue(Double.isNaN(this.dataset.getRangeUpperBound(false)));
        Assert.assertNull(this.dataset.getMinOutlier(0, 0));
        Assert.assertNull(this.dataset.getMaxOutlier(0, 0));
    }

    @Test
    public void testAdd_overwritingCell_triggersBoundsUpdate() {
        BoxAndWhiskerItem item1 = createItem(10.0, 10.0, 8.0, 12.0, 5.0, 15.0, 2.0, 20.0, null);
        this.dataset.add(item1, "R1", "C1");

        Assert.assertEquals(2.0, this.dataset.getRangeLowerBound(false), 0.0001);
        Assert.assertEquals(20.0, this.dataset.getRangeUpperBound(false), 0.0001);

        // Overwrite the same cell with new values
        BoxAndWhiskerItem item2 = createItem(10.0, 10.0, 8.0, 12.0, 5.0, 15.0, 4.0, 16.0, null);
        this.dataset.add(item2, "R1", "C1");

        Assert.assertEquals(4.0, this.dataset.getRangeLowerBound(false), 0.0001);
        Assert.assertEquals(16.0, this.dataset.getRangeUpperBound(false), 0.0001);
    }

    @Test
    public void testAdd_triggersDatasetChangeEvent() {
        final boolean[] notified = new boolean[] { false };
        this.dataset.addChangeListener(new DatasetChangeListener() {
            @Override
            public void datasetChanged(DatasetChangeEvent event) {
                notified[0] = true;
            }
        });

        BoxAndWhiskerItem item = createItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, null);
        this.dataset.add(item, "R1", "C1");
        Assert.assertTrue(notified[0]);
    }

    @Test
    public void testGetValuesByIndexAndKeys_allFieldsMatch() {
        List<Double> outliers = Arrays.asList(0.5, 9.5);
        BoxAndWhiskerItem item = createItem(5.0, 4.5, 3.0, 6.0, 1.0, 8.0, 0.5, 9.5, outliers);
        this.dataset.add(item, "Row1", "Col1");

        // By index
        Assert.assertEquals(item, this.dataset.getItem(0, 0));
        Assert.assertEquals(4.5, this.dataset.getValue(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(5.0, this.dataset.getMeanValue(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(4.5, this.dataset.getMedianValue(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(3.0, this.dataset.getQ1Value(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(6.0, this.dataset.getQ3Value(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(1.0, this.dataset.getMinRegularValue(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(8.0, this.dataset.getMaxRegularValue(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(0.5, this.dataset.getMinOutlier(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(9.5, this.dataset.getMaxOutlier(0, 0).doubleValue(), 0.0001);
        Assert.assertEquals(outliers, this.dataset.getOutliers(0, 0));

        // By key
        Assert.assertEquals(4.5, this.dataset.getValue("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(5.0, this.dataset.getMeanValue("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(4.5, this.dataset.getMedianValue("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(3.0, this.dataset.getQ1Value("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(6.0, this.dataset.getQ3Value("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(1.0, this.dataset.getMinRegularValue("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(8.0, this.dataset.getMaxRegularValue("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(0.5, this.dataset.getMinOutlier("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(9.5, this.dataset.getMaxOutlier("Row1", "Col1").doubleValue(), 0.0001);
        Assert.assertEquals(outliers, this.dataset.getOutliers("Row1", "Col1"));
    }

    @Test
    public void testGetters_whenCellContainsNullItem_returnsNull() {
        // Manually place a null object in a row/column cell using protected data
        this.dataset.data.addObject(null, "Row1", "Col1");

        Assert.assertNull(this.dataset.getItem(0, 0));
        Assert.assertNull(this.dataset.getValue(0, 0));
        Assert.assertNull(this.dataset.getValue("Row1", "Col1"));
        Assert.assertNull(this.dataset.getMeanValue(0, 0));
        Assert.assertNull(this.dataset.getMeanValue("Row1", "Col1"));
        Assert.assertNull(this.dataset.getMedianValue(0, 0));
        Assert.assertNull(this.dataset.getMedianValue("Row1", "Col1"));
        Assert.assertNull(this.dataset.getQ1Value(0, 0));
        Assert.assertNull(this.dataset.getQ1Value("Row1", "Col1"));
        Assert.assertNull(this.dataset.getQ3Value(0, 0));
        Assert.assertNull(this.dataset.getQ3Value("Row1", "Col1"));
        Assert.assertNull(this.dataset.getMinRegularValue(0, 0));
        Assert.assertNull(this.dataset.getMinRegularValue("Row1", "Col1"));
        Assert.assertNull(this.dataset.getMaxRegularValue(0, 0));
        Assert.assertNull(this.dataset.getMaxRegularValue("Row1", "Col1"));
        Assert.assertNull(this.dataset.getMinOutlier(0, 0));
        Assert.assertNull(this.dataset.getMinOutlier("Row1", "Col1"));
        Assert.assertNull(this.dataset.getMaxOutlier(0, 0));
        Assert.assertNull(this.dataset.getMaxOutlier("Row1", "Col1"));
        Assert.assertNull(this.dataset.getOutliers(0, 0));
        Assert.assertNull(this.dataset.getOutliers("Row1", "Col1"));
    }

    @Test
    public void testRowsAndColumnsMetadata() {
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1.0, 1.0, null);
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2.0, 2.0, null);
        this.dataset.add(item1, "R1", "C1");
        this.dataset.add(item2, "R2", "C2");

        Assert.assertEquals(2, this.dataset.getRowCount());
        Assert.assertEquals(2, this.dataset.getColumnCount());

        Assert.assertEquals(0, this.dataset.getRowIndex("R1"));
        Assert.assertEquals(1, this.dataset.getRowIndex("R2"));
        Assert.assertEquals(-1, this.dataset.getRowIndex("UnknownRow"));

        Assert.assertEquals("R1", this.dataset.getRowKey(0));
        Assert.assertEquals("R2", this.dataset.getRowKey(1));
        Assert.assertEquals(Arrays.asList("R1", "R2"), this.dataset.getRowKeys());

        Assert.assertEquals(0, this.dataset.getColumnIndex("C1"));
        Assert.assertEquals(1, this.dataset.getColumnIndex("C2"));
        Assert.assertEquals(-1, this.dataset.getColumnIndex("UnknownCol"));

        Assert.assertEquals("C1", this.dataset.getColumnKey(0));
        Assert.assertEquals("C2", this.dataset.getColumnKey(1));
        Assert.assertEquals(Arrays.asList("C1", "C2"), this.dataset.getColumnKeys());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRowKey_invalidIndex_throwsException() {
        this.dataset.getRowKey(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetColumnKey_invalidIndex_throwsException() {
        this.dataset.getColumnKey(0);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_unknownKey_throwsException() {
        this.dataset.getValue("MissingRow", "MissingCol");
    }

    @Test
    public void testEquals_variousObjects() {
        DefaultBoxAndWhiskerCategoryDataset dataset1 = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset dataset2 = new DefaultBoxAndWhiskerCategoryDataset();

        // Reflexive
        Assert.assertTrue(dataset1.equals(dataset1));

        // Equal empty datasets
        Assert.assertTrue(dataset1.equals(dataset2));
        Assert.assertTrue(dataset2.equals(dataset1));

        // Different instances / types
        Assert.assertFalse(dataset1.equals(null));
        Assert.assertFalse(dataset1.equals("Some String"));

        // Add items to dataset1
        BoxAndWhiskerItem item1 = createItem(1, 1, 1, 1, 1, 1, 1.0, 1.0, null);
        dataset1.add(item1, "R1", "C1");
        Assert.assertFalse(dataset1.equals(dataset2));

        // Add matching item to dataset2
        dataset2.add(item1, "R1", "C1");
        Assert.assertTrue(dataset1.equals(dataset2));

        // Add different item
        BoxAndWhiskerItem item2 = createItem(2, 2, 2, 2, 2, 2, 2.0, 2.0, null);
        dataset2.add(item2, "R2", "C2");
        Assert.assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testClone_createsIndependentCopy() throws CloneNotSupportedException {
        BoxAndWhiskerItem item1 = createItem(1, 2, 3, 4, 5, 6, 0.0, 10.0, null);
        this.dataset.add(item1, "R1", "C1");

        DefaultBoxAndWhiskerCategoryDataset clone = (DefaultBoxAndWhiskerCategoryDataset) this.dataset.clone();

        Assert.assertNotSame(this.dataset, clone);
        Assert.assertEquals(this.dataset, clone);

        // Modifying original does not affect clone
        BoxAndWhiskerItem item2 = createItem(2, 3, 4, 5, 6, 7, 1.0, 12.0, null);
        this.dataset.add(item2, "R2", "C2");

        Assert.assertFalse(this.dataset.equals(clone));
        Assert.assertEquals(1, clone.getRowCount());
        Assert.assertEquals(1, clone.getColumnCount());
        Assert.assertEquals(2, this.dataset.getRowCount());
        Assert.assertEquals(2, this.dataset.getColumnCount());
    }
}
