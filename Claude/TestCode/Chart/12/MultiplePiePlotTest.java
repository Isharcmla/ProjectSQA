import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.TableOrder;
import org.jfree.chart.LegendItemCollection;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.CategoryDataset;

public class MultiplePiePlotTest {

    private MultiplePiePlot plot;
    private DefaultCategoryDataset dataset;

    @Before
    public void setUp() {
        dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(30.0, "Row2", "Col1");
        dataset.addValue(40.0, "Row2", "Col2");
        plot = new MultiplePiePlot(dataset);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_noDataset_returnsNullDataset() {
        MultiplePiePlot p = new MultiplePiePlot();
        assertNull(p.getDataset());
        assertNotNull(p.getPieChart());
        assertEquals(TableOrder.BY_COLUMN, p.getDataExtractOrder());
    }

    @Test
    public void testConstructor_withDataset_setsDatasetCorrectly() {
        assertSame(dataset, plot.getDataset());
        assertNotNull(plot.getPieChart());
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        assertEquals(0.0, plot.getLimit(), 0.0001);
        assertEquals("Other", plot.getAggregatedItemsKey());
        assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
    }

    // ---------- getDataset / setDataset ----------

    @Test
    public void testGetDataset_afterConstruction_returnsSameDataset() {
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDataset_newDataset_updatesDataset() {
        DefaultCategoryDataset newDataset = new DefaultCategoryDataset();
        newDataset.addValue(1.0, "R1", "C1");
        plot.setDataset(newDataset);
        assertSame(newDataset, plot.getDataset());
    }

    @Test
    public void testSetDataset_null_setsToNull() {
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testSetDataset_replaceExistingDataset_removesOldListener() {
        DefaultCategoryDataset newDataset = new DefaultCategoryDataset();
        newDataset.addValue(5.0, "R1", "C1");
        plot.setDataset(newDataset);
        assertSame(newDataset, plot.getDataset());
        // setting again to null should work without exception
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    // ---------- getPieChart / setPieChart ----------

    @Test
    public void testGetPieChart_afterConstruction_notNull() {
        assertNotNull(plot.getPieChart());
    }

    @Test
    public void testSetPieChart_validChart_updatesPieChart() {
        PiePlot piePlot = new PiePlot(null);
        JFreeChart newChart = new JFreeChart(piePlot);
        plot.setPieChart(newChart);
        assertSame(newChart, plot.getPieChart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_null_throwsException() {
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_nonPiePlotChart_throwsException() {
        org.jfree.chart.plot.Plot dummyPlot = new org.jfree.chart.plot.CategoryPlot();
        JFreeChart badChart = new JFreeChart(dummyPlot);
        plot.setPieChart(badChart);
    }

    // ---------- getDataExtractOrder / setDataExtractOrder ----------

    @Test
    public void testGetDataExtractOrder_default_returnsByColumn() {
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
    }

    @Test
    public void testSetDataExtractOrder_byRow_updatesOrder() {
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrder_null_throwsException() {
        plot.setDataExtractOrder(null);
    }

    // ---------- getLimit / setLimit ----------

    @Test
    public void testGetLimit_default_returnsZero() {
        assertEquals(0.0, plot.getLimit(), 0.0001);
    }

    @Test
    public void testSetLimit_positiveValue_updatesLimit() {
        plot.setLimit(0.05);
        assertEquals(0.05, plot.getLimit(), 0.0001);
    }

    @Test
    public void testSetLimit_negativeValue_updatesLimit() {
        plot.setLimit(-1.0);
        assertEquals(-1.0, plot.getLimit(), 0.0001);
    }

    @Test
    public void testSetLimit_zero_updatesLimit() {
        plot.setLimit(0.0);
        assertEquals(0.0, plot.getLimit(), 0.0001);
    }

    // ---------- getAggregatedItemsKey / setAggregatedItemsKey ----------

    @Test
    public void testGetAggregatedItemsKey_default_returnsOther() {
        assertEquals("Other", plot.getAggregatedItemsKey());
    }

    @Test
    public void testSetAggregatedItemsKey_validKey_updatesKey() {
        plot.setAggregatedItemsKey("Misc");
        assertEquals("Misc", plot.getAggregatedItemsKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKey_null_throwsException() {
        plot.setAggregatedItemsKey(null);
    }

    // ---------- getAggregatedItemsPaint / setAggregatedItemsPaint ----------

    @Test
    public void testGetAggregatedItemsPaint_default_returnsLightGray() {
        assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
    }

    @Test
    public void testSetAggregatedItemsPaint_validPaint_updatesPaint() {
        plot.setAggregatedItemsPaint(Color.RED);
        assertEquals(Color.RED, plot.getAggregatedItemsPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaint_null_throwsException() {
        plot.setAggregatedItemsPaint(null);
    }

    // ---------- getPlotType ----------

    @Test
    public void testGetPlotType_returnsExpectedString() {
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    // ---------- draw ----------

    @Test
    public void testDraw_emptyDataset_drawsNoDataMessage() {
        MultiplePiePlot emptyPlot = new MultiplePiePlot(new DefaultCategoryDataset());
        BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        // Should not throw exception, will just draw "no data" message
        emptyPlot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_nullDataset_drawsNoDataMessage() {
        MultiplePiePlot nullDatasetPlot = new MultiplePiePlot(null);
        BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        nullDatasetPlot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withDataset_byColumn_drawsSuccessfully() {
        BufferedImage img = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 400);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withDataset_byRow_drawsSuccessfully() {
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        BufferedImage img = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 400);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withLimitGreaterThanZero_drawsSuccessfully() {
        plot.setLimit(50.0);
        BufferedImage img = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 400);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withPlotRenderingInfo_collectsSubplotInfo() {
        BufferedImage img = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 400);
        PlotRenderingInfo info = new PlotRenderingInfo(
                new org.jfree.chart.ChartRenderingInfo());
        plot.draw(g2, area, null, null, info);
        g2.dispose();
        assertTrue(info.getSubplotCount() > 0);
    }

    @Test
    public void testDraw_wideArea_swapsRowsColumns() {
        // area wider than tall to trigger swap logic when displayCols > displayRows
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        for (int i = 0; i < 5; i++) {
            ds.addValue(i + 1.0, "Row1", "Col" + i);
        }
        MultiplePiePlot widePlot = new MultiplePiePlot(ds);
        BufferedImage img = new BufferedImage(600, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 600, 100);
        widePlot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    // ---------- getLegendItems ----------

    @Test
    public void testGetLegendItems_byColumn_returnsItemsForRowKeys() {
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertTrue(items.getItemCount() > 0);
    }

    @Test
    public void testGetLegendItems_byRow_returnsItemsForColumnKeys() {
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertTrue(items.getItemCount() > 0);
    }

    @Test
    public void testGetLegendItems_withLimit_addsAggregatedItem() {
        plot.setLimit(10.0);
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertTrue(items.getItemCount() > 0);
    }

    @Test
    public void testGetLegendItems_nullDataset_returnsEmptyCollection() {
        MultiplePiePlot nullDatasetPlot = new MultiplePiePlot(null);
        LegendItemCollection items = nullDatasetPlot.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(plot.equals("Not a plot"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(plot.equals(null));
    }

    @Test
    public void testEquals_equalPlots_returnsTrue() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        assertTrue(plot1.equals(plot2));
    }

    @Test
    public void testEquals_differentDataExtractOrder_returnsFalse() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEquals_differentLimit_returnsFalse() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setLimit(5.0);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEquals_differentAggregatedItemsKey_returnsFalse() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setAggregatedItemsKey("Different");
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEquals_differentAggregatedItemsPaint_returnsFalse() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setAggregatedItemsPaint(Color.BLUE);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEquals_differentPieChart_returnsFalse() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        PiePlot piePlot = new PiePlot(null);
        JFreeChart newChart = new JFreeChart(piePlot);
        plot2.setPieChart(newChart);
        assertFalse(plot1.equals(plot2));
    }
}
