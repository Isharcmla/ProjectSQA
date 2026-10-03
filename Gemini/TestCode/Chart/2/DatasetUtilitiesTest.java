package org.jfree.data.general;

import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DomainInfo;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.Range;
import org.jfree.data.RangeInfo;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryRangeInfo;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.LineFunction2D;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYDomainInfo;
import org.jfree.data.xy.XYRangeInfo;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DatasetUtilitiesTest {

    private static final double EPSILON = 1e-9;

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<DatasetUtilities> constructor = DatasetUtilities.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        DatasetUtilities instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testCalculatePieDatasetTotal_normal() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", 20.0);
        dataset.setValue("C", 0.0);
        dataset.setValue("D", -5.0);
        dataset.setValue("E", null);
        double total = DatasetUtilities.calculatePieDatasetTotal(dataset);
        assertEquals(30.0, total, EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculatePieDatasetTotal_nullDataset() {
        DatasetUtilities.calculatePieDatasetTotal(null);
    }

    @Test
    public void testCreatePieDatasetForRow_byKeyAndIndex() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        dataset.addValue(3.0, "R2", "C1");
        dataset.addValue(4.0, "R2", "C2");

        PieDataset pieFromKey = DatasetUtilities.createPieDatasetForRow(dataset, "R1");
        assertEquals(2, pieFromKey.getItemCount());
        assertEquals(1.0, pieFromKey.getValue("C1").doubleValue(), EPSILON);
        assertEquals(2.0, pieFromKey.getValue("C2").doubleValue(), EPSILON);

        PieDataset pieFromIndex = DatasetUtilities.createPieDatasetForRow(dataset, 1);
        assertEquals(2, pieFromIndex.getItemCount());
        assertEquals(3.0, pieFromIndex.getValue("C1").doubleValue(), EPSILON);
        assertEquals(4.0, pieFromIndex.getValue("C2").doubleValue(), EPSILON);
    }

    @Test
    public void testCreatePieDatasetForColumn_byKeyAndIndex() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        dataset.addValue(3.0, "R2", "C1");
        dataset.addValue(4.0, "R2", "C2");

        PieDataset pieFromKey = DatasetUtilities.createPieDatasetForColumn(dataset, "C2");
        assertEquals(2, pieFromKey.getItemCount());
        assertEquals(2.0, pieFromKey.getValue("R1").doubleValue(), EPSILON);
        assertEquals(4.0, pieFromKey.getValue("R2").doubleValue(), EPSILON);

        PieDataset pieFromIndex = DatasetUtilities.createPieDatasetForColumn(dataset, 0);
        assertEquals(2, pieFromIndex.getItemCount());
        assertEquals(1.0, pieFromIndex.getValue("R1").doubleValue(), EPSILON);
        assertEquals(3.0, pieFromIndex.getValue("R2").doubleValue(), EPSILON);
    }

    @Test
    public void testCreateConsolidatedPieDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Item 1", 80.0);
        dataset.setValue("Item 2", 10.0);
        dataset.setValue("Item 3", 5.0);
        dataset.setValue("Item 4", 5.0);

        PieDataset result3Args = DatasetUtilities.createConsolidatedPieDataset(dataset, "Other", 0.15);
        assertEquals(2, result3Args.getItemCount());
        assertEquals(80.0, result3Args.getValue("Item 1").doubleValue(), EPSILON);
        assertEquals(20.0, result3Args.getValue("Other").doubleValue(), EPSILON);

        PieDataset result4ArgsMinItemsNotMet = DatasetUtilities.createConsolidatedPieDataset(dataset, "Other", 0.08, 3);
        assertEquals(4, result4ArgsMinItemsNotMet.getItemCount());
        assertNull(result4ArgsMinItemsNotMet.getValue("Other"));
    }

    @Test
    public void testCreateCategoryDataset_doubleArray() {
        double[][] data = new double[][]{{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("R", "C", data);
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(1.0, dataset.getValue("R1", "C1").doubleValue(), EPSILON);
        assertEquals(4.0, dataset.getValue("R2", "C2").doubleValue(), EPSILON);
    }

    @Test
    public void testCreateCategoryDataset_numberArray() {
        Number[][] data = new Number[][]{{1, null}, {3.5, 4}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("Row", "Col", data);
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(1, dataset.getValue("Row1", "Col1").intValue());
        assertNull(dataset.getValue("Row1", "Col2"));
        assertEquals(3.5, dataset.getValue("Row2", "Col1").doubleValue(), EPSILON);
    }

    @Test
    public void testCreateCategoryDataset_keysAndData() {
        Comparable[] rowKeys = new Comparable[]{"R1", "R2"};
        Comparable[] colKeys = new Comparable[]{"C1", "C2", "C3"};
        double[][] data = new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};

        CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, colKeys, data);
        assertEquals(2, dataset.getRowCount());
        assertEquals(3, dataset.getColumnCount());
        assertEquals(5.0, dataset.getValue("R2", "C2").doubleValue(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_nullRowKeys() {
        DatasetUtilities.createCategoryDataset(null, new Comparable[]{"C1"}, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_nullColKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, null, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_duplicateRowKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1", "R1"}, new Comparable[]{"C1"}, new double[][]{{1.0}, {2.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_duplicateColKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, new Comparable[]{"C1", "C1"}, new double[][]{{1.0, 2.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_rowCountMismatch() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1", "R2"}, new Comparable[]{"C1"}, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_colCountMismatch() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, new Comparable[]{"C1", "C2"}, new double[][]{{1.0}});
    }

    @Test
    public void testCreateCategoryDataset_keyedValues() {
        DefaultKeyedValues kv = new DefaultKeyedValues();
        kv.addValue("K1", 10.0);
        kv.addValue("K2", 20.0);

        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("R1", kv);
        assertEquals(1, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(20.0, dataset.getValue("R1", "K2").doubleValue(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_nullRowKeyForKV() {
        DatasetUtilities.createCategoryDataset((Comparable) null, new DefaultKeyedValues());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_nullRowDataForKV() {
        DatasetUtilities.createCategoryDataset("R1", (DefaultKeyedValues) null);
    }

    @Test
    public void testSampleFunction2D() {
        Function2D f = new LineFunction2D(0.0, 2.0); // y = 2x
        XYDataset dataset = DatasetUtilities.sampleFunction2D(f, 0.0, 4.0, 3, "Line");
        assertEquals(1, dataset.getSeriesCount());
        assertEquals(3, dataset.getItemCount(0));
        assertEquals(0.0, dataset.getYValue(0, 0), EPSILON);
        assertEquals(4.0, dataset.getYValue(0, 1), EPSILON);
        assertEquals(8.0, dataset.getYValue(0, 2), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_nullFunction() {
        DatasetUtilities.sampleFunction2DToSeries(null, 0.0, 1.0, 5, "S");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_nullSeriesKey() {
        DatasetUtilities.sampleFunction2DToSeries(new LineFunction2D(1, 1), 0.0, 1.0, 5, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_startGreaterThanEnd() {
        DatasetUtilities.sampleFunction2DToSeries(new LineFunction2D(1, 1), 5.0, 1.0, 5, "S");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_samplesLessThanTwo() {
        DatasetUtilities.sampleFunction2DToSeries(new LineFunction2D(1, 1), 0.0, 1.0, 1, "S");
    }

    @Test
    public void testIsEmptyOrNull_pieDataset() {
        assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
        DefaultPieDataset ds = new DefaultPieDataset();
        assertTrue(DatasetUtilities.isEmptyOrNull(ds));
        ds.setValue("A", null);
        assertTrue(DatasetUtilities.isEmptyOrNull(ds));
        ds.setValue("B", 0.0);
        assertTrue(DatasetUtilities.isEmptyOrNull(ds));
        ds.setValue("C", 10.0);
        assertFalse(DatasetUtilities.isEmptyOrNull(ds));
    }

    @Test
    public void testIsEmptyOrNull_categoryDataset() {
        assertTrue(DatasetUtilities.isEmptyOrNull((CategoryDataset) null));
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        assertTrue(DatasetUtilities.isEmptyOrNull(ds));
        ds.addValue(null, "R1", "C1");
        assertTrue(DatasetUtilities.isEmptyOrNull(ds));
        ds.addValue(5.0, "R1", "C2");
        assertFalse(DatasetUtilities.isEmptyOrNull(ds));
    }

    @Test
    public void testIsEmptyOrNull_xyDataset() {
        assertTrue(DatasetUtilities.isEmptyOrNull((XYDataset) null));
        XYSeriesCollection collection = new XYSeriesCollection();
        assertTrue(DatasetUtilities.isEmptyOrNull(collection));
        XYSeries series = new XYSeries("S");
        collection.addSeries(series);
        assertTrue(DatasetUtilities.isEmptyOrNull(collection));
        series.add(1.0, 2.0);
        assertFalse(DatasetUtilities.isEmptyOrNull(collection));
    }

    @Test
    public void testFindDomainBounds_XYDataset() {
        XYSeriesCollection collection = new XYSeriesCollection();
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 10.0);
        series.add(5.0, 20.0);
        collection.addSeries(series);

        Range range = DatasetUtilities.findDomainBounds(collection);
        assertEquals(new Range(1.0, 5.0), range);

        Range rangeExplicit = DatasetUtilities.findDomainBounds(collection, true);
        assertEquals(new Range(1.0, 5.0), rangeExplicit);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_nullXYDataset() {
        DatasetUtilities.findDomainBounds(null);
    }

    @Test
    public void testFindDomainBounds_visibleSeries() {
        XYSeriesCollection collection = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 10.0);
        s1.add(3.0, 20.0);
        XYSeries s2 = new XYSeries("S2");
        s2.add(5.0, 10.0);
        s2.add(10.0, 20.0);
        collection.addSeries(s1);
        collection.addSeries(s2);

        List<Comparable> visibleKeys = Collections.singletonList("S1");
        Range range = DatasetUtilities.findDomainBounds(collection, visibleKeys, true);
        assertEquals(new Range(1.0, 3.0), range);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_nullVisibleSeries() {
        DatasetUtilities.findDomainBounds(new XYSeriesCollection(), null, true);
    }

    @Test
    public void testIterateDomainBounds_IntervalXYDataset() {
        DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();
        double[][] data = new double[][]{
                {1.0, 2.0}, // x
                {0.5, 1.5}, // start x
                {1.5, 2.5}, // end x
                {10.0, 20.0}, // y
                {9.0, 19.0}, // start y
                {11.0, 21.0} // end y
        };
        dataset.addSeries("S1", data);

        Range rangeWithInterval = DatasetUtilities.iterateDomainBounds(dataset);
        assertEquals(new Range(0.5, 2.5), rangeWithInterval);

        Range rangeWithoutInterval = DatasetUtilities.iterateDomainBounds(dataset, false);
        assertEquals(new Range(1.0, 2.0), rangeWithoutInterval);

        DefaultIntervalXYDataset emptyDs = new DefaultIntervalXYDataset();
        assertNull(DatasetUtilities.iterateDomainBounds(emptyDs));
    }

    @Test
    public void testIterateToFindDomainBounds_IntervalXYDataset() {
        DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();
        double[][] data = new double[][]{
                {1.0}, {0.5}, {1.5}, {10.0}, {9.0}, {11.0}
        };
        dataset.addSeries("S1", data);

        Range range = DatasetUtilities.iterateToFindDomainBounds(dataset, Collections.singletonList("S1"), true);
        assertEquals(new Range(0.5, 1.5), range);

        Range rangeNoInterval = DatasetUtilities.iterateToFindDomainBounds(dataset, Collections.singletonList("S1"), false);
        assertEquals(new Range(1.0, 1.0), rangeNoInterval);
    }

    @Test
    public void testFindRangeBounds_CategoryDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R1", "C1");
        dataset.addValue(15.0, "R1", "C2");

        Range range = DatasetUtilities.findRangeBounds(dataset);
        assertEquals(new Range(5.0, 15.0), range);

        Range rangeExplicit = DatasetUtilities.findRangeBounds(dataset, true);
        assertEquals(new Range(5.0, 15.0), rangeExplicit);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_nullCategoryDataset() {
        DatasetUtilities.findRangeBounds((CategoryDataset) null);
    }

    @Test
    public void testFindRangeBounds_CategoryDataset_visibleSeries() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R1", "C1");
        dataset.addValue(15.0, "R1", "C2");
        dataset.addValue(100.0, "R2", "C1");

        Range range = DatasetUtilities.findRangeBounds(dataset, Collections.singletonList("R1"), true);
        assertEquals(new Range(5.0, 15.0), range);
    }

    @Test
    public void testFindRangeBounds_XYDataset() {
        XYSeriesCollection collection = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, -10.0);
        s1.add(2.0, 20.0);
        collection.addSeries(s1);

        Range range = DatasetUtilities.findRangeBounds(collection);
        assertEquals(new Range(-10.0, 20.0), range);

        Range rangeExplicit = DatasetUtilities.findRangeBounds(collection, false);
        assertEquals(new Range(-10.0, 20.0), rangeExplicit);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_nullXYDataset() {
        DatasetUtilities.findRangeBounds((XYDataset) null);
    }

    @Test
    public void testFindRangeBounds_XYDataset_visibleSeries_xRange() {
        XYSeriesCollection collection = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 10.0);
        s1.add(2.0, 20.0);
        s1.add(3.0, 30.0);
        collection.addSeries(s1);

        Range range = DatasetUtilities.findRangeBounds(collection, Collections.singletonList("S1"), new Range(1.5, 2.5), true);
        assertEquals(new Range(20.0, 20.0), range);
    }

    @Test
    public void testIterateCategoryRangeBounds_and_iterateRangeBounds() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(10.0, "R1", "C2");

        assertEquals(new Range(1.0, 10.0), DatasetUtilities.iterateCategoryRangeBounds(dataset, true));
        assertEquals(new Range(1.0, 10.0), DatasetUtilities.iterateRangeBounds(dataset));
        assertEquals(new Range(1.0, 10.0), DatasetUtilities.iterateRangeBounds(dataset, false));

        DefaultIntervalCategoryDataset intervalCatDs = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{5.0}},
                new Number[][]{{15.0}}
        );
        assertEquals(new Range(5.0, 15.0), DatasetUtilities.iterateRangeBounds(intervalCatDs, true));

        DefaultCategoryDataset emptyCat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.iterateRangeBounds(emptyCat, true));
    }

    @Test
    public void testIterateToFindRangeBounds_CategoryDatasets() {
        DefaultBoxAndWhiskerCategoryDataset bwDataset = new DefaultBoxAndWhiskerCategoryDataset();
        bwDataset.add(Arrays.asList(1.0, 2.0, 3.0, 10.0), "S1", "C1");
        Range bwRange = DatasetUtilities.iterateToFindRangeBounds(bwDataset, Collections.singletonList("S1"), true);
        assertNotNull(bwRange);

        DefaultIntervalCategoryDataset intervalCatDs = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{2.0}},
                new Number[][]{{8.0}}
        );
        Range intervalRange = DatasetUtilities.iterateToFindRangeBounds(intervalCatDs, Collections.singletonList("S1"), true);
        assertEquals(new Range(2.0, 8.0), intervalRange);

        DefaultMultiValueCategoryDataset mvDataset = new DefaultMultiValueCategoryDataset();
        mvDataset.add(Arrays.asList(3.0, 6.0, Double.NaN), "S1", "C1");
        Range mvRange = DatasetUtilities.iterateToFindRangeBounds(mvDataset, Collections.singletonList("S1"), true);
        assertEquals(new Range(3.0, 6.0), mvRange);

        DefaultStatisticalCategoryDataset statDataset = new DefaultStatisticalCategoryDataset();
        statDataset.add(10.0, 2.0, "S1", "C1");
        Range statRange = DatasetUtilities.iterateToFindRangeBounds(statDataset, Collections.singletonList("S1"), true);
        assertEquals(new Range(8.0, 12.0), statRange);

        statDataset.add(20.0, Double.NaN, "S2", "C1");
        Range statRangeNaN = DatasetUtilities.iterateToFindRangeBounds(statDataset, Collections.singletonList("S2"), true);
        assertEquals(new Range(20.0, 20.0), statRangeNaN);

        DefaultCategoryDataset plainCat = new DefaultCategoryDataset();
        plainCat.addValue(5.0, "S1", "C1");
        Range plainRange = DatasetUtilities.iterateToFindRangeBounds(plainCat, Collections.singletonList("S1"), false);
        assertEquals(new Range(5.0, 5.0), plainRange);

        assertNull(DatasetUtilities.iterateToFindRangeBounds(new DefaultCategoryDataset(), Collections.emptyList(), false));
    }

    @Test
    public void testIterateXYRangeBounds_and_iterateRangeBounds() {
        DefaultXYDataset xyDataset = new DefaultXYDataset();
        xyDataset.addSeries("S1", new double[][]{{1.0, 2.0}, {10.0, 20.0}});

        assertEquals(new Range(10.0, 20.0), DatasetUtilities.iterateXYRangeBounds(xyDataset));
        assertEquals(new Range(10.0, 20.0), DatasetUtilities.iterateRangeBounds(xyDataset));
        assertEquals(new Range(10.0, 20.0), DatasetUtilities.iterateRangeBounds(xyDataset, true));

        DefaultIntervalXYDataset intervalXY = new DefaultIntervalXYDataset();
        intervalXY.addSeries("S1", new double[][]{
                {1.0}, {0.5}, {1.5}, {10.0}, {8.0}, {12.0}
        });
        assertEquals(new Range(8.0, 12.0), DatasetUtilities.iterateRangeBounds(intervalXY, true));

        OHLCDataItem item = new OHLCDataItem(new Date(), 10.0, 15.0, 5.0, 12.0, 100);
        DefaultOHLCDataset ohlcDataset = new DefaultOHLCDataset("S1", new OHLCDataItem[]{item});
        assertEquals(new Range(5.0, 15.0), DatasetUtilities.iterateRangeBounds(ohlcDataset, true));

        DefaultXYDataset emptyXY = new DefaultXYDataset();
        assertNull(DatasetUtilities.iterateRangeBounds(emptyXY, true));
    }

    @Test
    public void testIterateToFindRangeBounds_XYDatasets() {
        OHLCDataItem item = new OHLCDataItem(new Date(1000L), 10.0, 20.0, 5.0, 15.0, 100);
        DefaultOHLCDataset ohlc = new DefaultOHLCDataset("S1", new OHLCDataItem[]{item});
        Range ohlcRange = DatasetUtilities.iterateToFindRangeBounds(ohlc, Collections.singletonList("S1"), new Range(0, 2000L), true);
        assertEquals(new Range(5.0, 20.0), ohlcRange);

        DefaultBoxAndWhiskerXYDataset bwXY = new DefaultBoxAndWhiskerXYDataset("S1");
        bwXY.add(new Date(1000L), new org.jfree.data.statistics.BoxAndWhiskerItem(10.0, 10.0, 8.0, 12.0, 5.0, 15.0, 4.0, 16.0, Collections.emptyList()));
        Range bwRange = DatasetUtilities.iterateToFindRangeBounds(bwXY, Collections.singletonList("S1"), new Range(0, 2000L), true);
        assertEquals(new Range(5.0, 15.0), bwRange);

        DefaultIntervalXYDataset intervalXY = new DefaultIntervalXYDataset();
        intervalXY.addSeries("S1", new double[][]{{1.0}, {0.5}, {1.5}, {10.0}, {7.0}, {14.0}});
        Range intervalRange = DatasetUtilities.iterateToFindRangeBounds(intervalXY, Collections.singletonList("S1"), new Range(0.0, 2.0), true);
        assertEquals(new Range(7.0, 14.0), intervalRange);

        DefaultXYDataset plainXY = new DefaultXYDataset();
        plainXY.addSeries("S1", new double[][]{{1.0, 2.0}, {5.0, 15.0}});
        Range plainRange = DatasetUtilities.iterateToFindRangeBounds(plainXY, Collections.singletonList("S1"), new Range(0.0, 3.0), false);
        assertEquals(new Range(5.0, 15.0), plainRange);

        Range outOfRange = DatasetUtilities.iterateToFindRangeBounds(plainXY, Collections.singletonList("S1"), new Range(10.0, 20.0), false);
        assertNull(outOfRange);
    }

    @Test
    public void testFindMinMaxDomainValues() {
        XYSeriesCollection collection = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 10.0);
        s1.add(5.0, 20.0);
        collection.addSeries(s1);

        assertEquals(1.0, DatasetUtilities.findMinimumDomainValue(collection).doubleValue(), EPSILON);
        assertEquals(5.0, DatasetUtilities.findMaximumDomainValue(collection).doubleValue(), EPSILON);

        DefaultXYDataset defaultXY = new DefaultXYDataset();
        defaultXY.addSeries("S1", new double[][]{{2.0, 8.0}, {10.0, 20.0}});
        assertEquals(2.0, DatasetUtilities.findMinimumDomainValue(defaultXY).doubleValue(), EPSILON);
        assertEquals(8.0, DatasetUtilities.findMaximumDomainValue(defaultXY).doubleValue(), EPSILON);

        DefaultIntervalXYDataset intervalXY = new DefaultIntervalXYDataset();
        intervalXY.addSeries("S1", new double[][]{{2.0}, {1.0}, {3.0}, {10.0}, {9.0}, {11.0}});
        assertEquals(1.0, DatasetUtilities.findMinimumDomainValue(intervalXY).doubleValue(), EPSILON);
        assertEquals(3.0, DatasetUtilities.findMaximumDomainValue(intervalXY).doubleValue(), EPSILON);

        DefaultXYDataset emptyXY = new DefaultXYDataset();
        assertNull(DatasetUtilities.findMinimumDomainValue(emptyXY));
        assertNull(DatasetUtilities.findMaximumDomainValue(emptyXY));
    }

    @Test
    public void testFindMinMaxRangeValues_CategoryDataset() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(10.0, "R1", "C1");
        ds.addValue(25.0, "R1", "C2");

        assertEquals(10.0, DatasetUtilities.findMinimumRangeValue(ds).doubleValue(), EPSILON);
        assertEquals(25.0, DatasetUtilities.findMaximumRangeValue(ds).doubleValue(), EPSILON);

        DefaultIntervalCategoryDataset intervalDs = new DefaultIntervalCategoryDataset(
                new Comparable[]{"R1"},
                new Comparable[]{"C1"},
                new Number[][]{{5.0}},
                new Number[][]{{30.0}}
        );
        assertEquals(5.0, DatasetUtilities.findMinimumRangeValue(intervalDs).doubleValue(), EPSILON);
        assertEquals(30.0, DatasetUtilities.findMaximumRangeValue(intervalDs).doubleValue(), EPSILON);

        DefaultIntervalCategoryDataset emptyIntervalDs = new DefaultIntervalCategoryDataset(
                new Number[][]{}, new Number[][]{}
        );
        assertNull(DatasetUtilities.findMinimumRangeValue(emptyIntervalDs));
        assertNull(DatasetUtilities.findMaximumRangeValue(emptyIntervalDs));
    }

    @Test
    public void testFindMinMaxRangeValues_XYDataset() {
        XYSeriesCollection collection = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 10.0);
        s1.add(2.0, 20.0);
        collection.addSeries(s1);

        assertEquals(10.0, DatasetUtilities.findMinimumRangeValue(collection).doubleValue(), EPSILON);
        assertEquals(20.0, DatasetUtilities.findMaximumRangeValue(collection).doubleValue(), EPSILON);

        DefaultIntervalXYDataset intervalXY = new DefaultIntervalXYDataset();
        intervalXY.addSeries("S1", new double[][]{{1.0}, {0.5}, {1.5}, {10.0}, {4.0}, {22.0}});
        assertEquals(4.0, DatasetUtilities.findMinimumRangeValue(intervalXY).doubleValue(), EPSILON);
        assertEquals(22.0, DatasetUtilities.findMaximumRangeValue(intervalXY).doubleValue(), EPSILON);

        OHLCDataItem item = new OHLCDataItem(new Date(), 10.0, 30.0, 3.0, 12.0, 100);
        DefaultOHLCDataset ohlc = new DefaultOHLCDataset("S1", new OHLCDataItem[]{item});
        assertEquals(3.0, DatasetUtilities.findMinimumRangeValue(ohlc).doubleValue(), EPSILON);
        assertEquals(30.0, DatasetUtilities.findMaximumRangeValue(ohlc).doubleValue(), EPSILON);

        DefaultXYDataset plainXY = new DefaultXYDataset();
        plainXY.addSeries("S1", new double[][]{{1.0}, {15.0}});
        assertEquals(15.0, DatasetUtilities.findMinimumRangeValue(plainXY).doubleValue(), EPSILON);
        assertEquals(15.0, DatasetUtilities.findMaximumRangeValue(plainXY).doubleValue(), EPSILON);

        DefaultXYDataset emptyXY = new DefaultXYDataset();
        assertNull(DatasetUtilities.findMinimumRangeValue(emptyXY));
        assertNull(DatasetUtilities.findMaximumRangeValue(emptyXY));
    }

    @Test
    public void testFindStackedRangeBounds_CategoryDataset() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(10.0, "R1", "C1");
        ds.addValue(-5.0, "R2", "C1");
        ds.addValue(20.0, "R1", "C2");
        ds.addValue(-15.0, "R2", "C2");

        Range range = DatasetUtilities.findStackedRangeBounds(ds);
        assertEquals(new Range(-15.0, 20.0), range);

        Range rangeWithBase = DatasetUtilities.findStackedRangeBounds(ds, 5.0);
        assertEquals(new Range(-10.0, 25.0), rangeWithBase);
    }

    @Test
    public void testFindStackedRangeBounds_CategoryDataset_KeyToGroupMap() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(10.0, "R1", "C1");
        ds.addValue(20.0, "R2", "C1");
        ds.addValue(-5.0, "R3", "C1");

        KeyToGroupMap map = new KeyToGroupMap("G1");
        map.mapKeyToGroup("R1", "G1");
        map.mapKeyToGroup("R2", "G2");
        map.mapKeyToGroup("R3", "G1");

        Range range = DatasetUtilities.findStackedRangeBounds(ds, map);
        assertEquals(new Range(-5.0, 20.0), range);

        DefaultCategoryDataset emptyDs = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findStackedRangeBounds(emptyDs, map));
    }

    @Test
    public void testFindMinMaxStackedRangeValue_CategoryDataset() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(10.0, "R1", "C1");
        ds.addValue(-5.0, "R2", "C1");
        ds.addValue(-15.0, "R3", "C1");
        ds.addValue(20.0, "R1", "C2");
        ds.addValue(30.0, "R2", "C2");

        assertEquals(-20.0, DatasetUtilities.findMinimumStackedRangeValue(ds).doubleValue(), EPSILON);
        assertEquals(50.0, DatasetUtilities.findMaximumStackedRangeValue(ds).doubleValue(), EPSILON);

        DefaultCategoryDataset emptyDs = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findMinimumStackedRangeValue(emptyDs));
        assertNull(DatasetUtilities.findMaximumStackedRangeValue(emptyDs));
    }

    @Test
    public void testFindStackedRangeBounds_TableXYDataset() {
        DefaultTableXYDataset dataset = new DefaultTableXYDataset();
        XYSeries s1 = new XYSeries("S1", true, false);
        s1.add(1.0, 10.0);
        s1.add(2.0, -5.0);
        XYSeries s2 = new XYSeries("S2", true, false);
        s2.add(1.0, 15.0);
        s2.add(2.0, -10.0);
        dataset.addSeries(s1);
        dataset.addSeries(s2);

        Range range = DatasetUtilities.findStackedRangeBounds(dataset);
        assertEquals(new Range(-15.0, 25.0), range);

        Range rangeWithBase = DatasetUtilities.findStackedRangeBounds(dataset, 5.0);
        assertEquals(new Range(-10.0, 30.0), rangeWithBase);

        double total = DatasetUtilities.calculateStackTotal(dataset, 0);
        assertEquals(25.0, total, EPSILON);
    }

    @Test
    public void testFindCumulativeRangeBounds_CategoryDataset() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(10.0, "R1", "C1");
        ds.addValue(-5.0, "R1", "C2");
        ds.addValue(20.0, "R1", "C3");

        Range range = DatasetUtilities.findCumulativeRangeBounds(ds);
        assertEquals(new Range(0.0, 25.0), range);

        DefaultCategoryDataset emptyDs = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findCumulativeRangeBounds(emptyDs));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_nullCategoryDataset() {
        DatasetUtilities.findStackedRangeBounds((CategoryDataset) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_nullTableXYDataset() {
        DatasetUtilities.findStackedRangeBounds((TableXYDataset) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCumulativeRangeBounds_nullCategoryDataset() {
        DatasetUtilities.findCumulativeRangeBounds(null);
    }
}
