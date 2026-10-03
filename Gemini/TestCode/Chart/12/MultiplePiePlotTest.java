package org.jfree.chart.plot;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.Assert.*;

public class MultiplePiePlotTest {

    @Test
    public void testDefaultConstructor() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertNull(plot.getDataset());
        assertNotNull(plot.getPieChart());
        assertTrue(plot.getPieChart().getPlot() instanceof PiePlot);
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        assertEquals(0.0, plot.getLimit(), 0.00001);
        assertEquals("Other", plot.getAggregatedItemsKey());
        assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    @Test
    public void testConstructorWithDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testGetSetDataset() {
        MultiplePiePlot plot = new MultiplePiePlot();
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        dataset1.addValue(10.0, "R1", "C1");

        plot.setDataset(dataset1);
        assertSame(dataset1, plot.getDataset());

        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.addValue(20.0, "R2", "C2");
        plot.setDataset(dataset2);
        assertSame(dataset2, plot.getDataset());

        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testGetSetPieChart() {
        MultiplePiePlot plot = new MultiplePiePlot();
        PiePlot piePlot = new PiePlot();
        JFreeChart newChart = new JFreeChart("Title", piePlot);

        plot.setPieChart(newChart);
        assertSame(newChart, plot.getPieChart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_null_throwsException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_invalidPlot_throwsException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        JFreeChart chartWithCategoryPlot = new JFreeChart("Invalid", new CategoryPlot());
        plot.setPieChart(chartWithCategoryPlot);
    }

    @Test
    public void testGetSetDataExtractOrder() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrder_null_throwsException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(null);
    }

    @Test
    public void testGetSetLimit() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setLimit(0.15);
        assertEquals(0.15, plot.getLimit(), 0.00001);
        plot.setLimit(0.0);
        assertEquals(0.0, plot.getLimit(), 0.00001);
    }

    @Test
    public void testGetSetAggregatedItemsKey() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey("Miscellaneous");
        assertEquals("Miscellaneous", plot.getAggregatedItemsKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKey_null_throwsException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey(null);
    }

    @Test
    public void testGetSetAggregatedItemsPaint() {
        MultiplePiePlot plot = new MultiplePiePlot();
        Paint paint = Color.red;
        plot.setAggregatedItemsPaint(paint);
        assertEquals(paint, plot.getAggregatedItemsPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaint_null_throwsException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(null);
    }

    @Test
    public void testGetPlotType() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    @Test
    public void testDraw_emptyAndNullDataset() {
        MultiplePiePlot plot = new MultiplePiePlot();
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);

        plot.draw(g2, area, new Point2D.Double(10, 10), null, null);

        DefaultCategoryDataset emptyDataset = new DefaultCategoryDataset();
        plot.setDataset(emptyDataset);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_byColumnAndRenderingInfo() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(20.0, "R2", "C1");
        dataset.addValue(15.0, "R1", "C2");
        dataset.addValue(25.0, "R2", "C2");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);

        BufferedImage image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 600, 400);

        ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
        plot.draw(g2, area, new Point2D.Double(0, 0), null, info);
        g2.dispose();

        assertNotNull(info.getPlotInfo());
        assertEquals(2, info.getPlotInfo().getSubplotCount());
    }

    @Test
    public void testDraw_byRowWithLimitAndOffsets() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100.0, "R1", "C1");
        dataset.addValue(1.0, "R1", "C2");
        dataset.addValue(2.0, "R1", "C3");
        dataset.addValue(50.0, "R2", "C1");
        dataset.addValue(50.0, "R2", "C2");
        dataset.addValue(1.0, "R2", "C3");
        dataset.addValue(30.0, "R3", "C1");
        dataset.addValue(40.0, "R3", "C2");
        dataset.addValue(30.0, "R3", "C3");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        plot.setLimit(0.10);

        BufferedImage image = new BufferedImage(300, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 600);

        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withPredefinedPiePlotSectionPaint() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(20.0, "R2", "C1");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        PiePlot underlyingPiePlot = (PiePlot) plot.getPieChart().getPlot();
        underlyingPiePlot.setSectionPaint("R1", Color.blue);

        BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        plot.draw(g2, new Rectangle2D.Double(0, 0, 400, 400), null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_aspectRatioSwapColsRows() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 2; c++) {
                dataset.addValue(r + c + 1, "R" + r, "C" + c);
            }
        }
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);

        BufferedImage image = new BufferedImage(200, 800, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        plot.draw(g2, new Rectangle2D.Double(0, 0, 200, 800), null, null, null);
        g2.dispose();
    }

    @Test
    public void testGetLegendItems() {
        MultiplePiePlot plot = new MultiplePiePlot(null);
        LegendItemCollection lic = plot.getLegendItems();
        assertNotNull(lic);
        assertEquals(0, lic.getItemCount());

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(30.0, "Row2", "Col1");
        dataset.addValue(40.0, "Row2", "Col2");

        plot.setDataset(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        plot.setLimit(0.0);

        lic = plot.getLegendItems();
        assertEquals(2, lic.getItemCount());

        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        lic = plot.getLegendItems();
        assertEquals(2, lic.getItemCount());

        plot.setLimit(0.20);
        lic = plot.getLegendItems();
        assertEquals(3, lic.getItemCount());
    }

    @Test
    public void testEquals() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();

        assertTrue(p1.equals(p1));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals(new String("other")));
        assertTrue(p1.equals(p2));

        p1.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(p1.equals(p2));
        p2.setDataExtractOrder(TableOrder.BY_ROW);
        assertTrue(p1.equals(p2));

        p1.setLimit(0.05);
        assertFalse(p1.equals(p2));
        p2.setLimit(0.05);
        assertTrue(p1.equals(p2));

        p1.setAggregatedItemsKey("Other2");
        assertFalse(p1.equals(p2));
        p2.setAggregatedItemsKey("Other2");
        assertTrue(p1.equals(p2));

        p1.setAggregatedItemsPaint(Color.magenta);
        assertFalse(p1.equals(p2));
        p2.setAggregatedItemsPaint(Color.magenta);
        assertTrue(p1.equals(p2));

        PiePlot piePlot = new PiePlot();
        piePlot.setCircular(false);
        JFreeChart newChart = new JFreeChart("Diff", piePlot);
        p1.setPieChart(newChart);
        assertFalse(p1.equals(p2));
        p2.setPieChart(new JFreeChart("Diff", piePlot));
        assertTrue(p1.equals(p2));

        p1.setOutlinePaint(Color.blue);
        assertFalse(p1.equals(p2));
        p2.setOutlinePaint(Color.blue);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        MultiplePiePlot p1 = new MultiplePiePlot(dataset);
        MultiplePiePlot p2 = (MultiplePiePlot) p1.clone();

        assertNotSame(p1, p2);
        assertSame(p1.getClass(), p2.getClass());
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testSerialization() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        MultiplePiePlot p1 = new MultiplePiePlot(dataset);
        p1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(p1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        MultiplePiePlot p2 = (MultiplePiePlot) in.readObject();
        in.close();

        assertEquals(p1, p2);
    }
}
