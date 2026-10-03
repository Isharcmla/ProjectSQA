package org.jfree.chart.renderer.category;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

public class StatisticalBarRendererTest {

    private static class CustomClipRenderer extends StatisticalBarRenderer {
        private static final long serialVersionUID = 1L;
        private double lowerClip;
        private double upperClip;

        public CustomClipRenderer(double lowerClip, double upperClip) {
            super();
            this.lowerClip = lowerClip;
            this.upperClip = upperClip;
        }

        public double getLowerClip() {
            return this.lowerClip;
        }

        public double getUpperClip() {
            return this.upperClip;
        }
    }

    private static class TestRendererChangeListener implements RendererChangeListener {
        private boolean notified = false;

        public void rendererChanged(RendererChangeEvent event) {
            this.notified = true;
        }

        public boolean isNotified() {
            return this.notified;
        }
    }

    @Test
    public void testConstructor_defaultValues() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Assert.assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        Assert.assertEquals(new BasicStroke(0.5f), renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetErrorIndicatorPaint_normalAndNull_triggersNotification() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        renderer.setErrorIndicatorPaint(Color.red);
        Assert.assertEquals(Color.red, renderer.getErrorIndicatorPaint());
        Assert.assertTrue(listener.isNotified());

        renderer.setErrorIndicatorPaint(null);
        Assert.assertNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetErrorIndicatorStroke_normalAndNull_triggersNotification() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        BasicStroke stroke = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(stroke);
        Assert.assertEquals(stroke, renderer.getErrorIndicatorStroke());
        Assert.assertTrue(listener.isNotified());

        renderer.setErrorIndicatorStroke(null);
        Assert.assertNull(renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testEquals_variousScenarios() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();

        Assert.assertTrue(r1.equals(r1));
        Assert.assertFalse(r1.equals(null));
        Assert.assertFalse(r1.equals("Not a renderer"));
        Assert.assertTrue(r1.equals(r2));
        Assert.assertTrue(r2.equals(r1));

        r1.setErrorIndicatorPaint(Color.blue);
        Assert.assertFalse(r1.equals(r2));
        r2.setErrorIndicatorPaint(Color.blue);
        Assert.assertTrue(r1.equals(r2));

        r1.setErrorIndicatorPaint(new GradientPaint(0f, 0f, Color.red, 1f, 1f, Color.blue));
        r2.setErrorIndicatorPaint(new GradientPaint(0f, 0f, Color.red, 1f, 1f, Color.green));
        Assert.assertFalse(r1.equals(r2));

        r1.setErrorIndicatorPaint(Color.blue);
        r2.setErrorIndicatorPaint(Color.blue);
        r1.setSeriesPaint(0, Color.black);
        Assert.assertFalse(r1.equals(r2));
    }

    @Test
    public void testCloning_createsIndependentCopy() throws CloneNotSupportedException {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        r1.setErrorIndicatorPaint(Color.yellow);
        r1.setErrorIndicatorStroke(new BasicStroke(1.5f));

        StatisticalBarRenderer r2 = (StatisticalBarRenderer) r1.clone();
        Assert.assertNotSame(r1, r2);
        Assert.assertSame(r1.getClass(), r2.getClass());
        Assert.assertEquals(r1, r2);

        r2.setErrorIndicatorPaint(Color.magenta);
        Assert.assertFalse(r1.equals(r2));
    }

    @Test
    public void testSerialization_roundTrip() throws Exception {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        r1.setErrorIndicatorPaint(new GradientPaint(0.0f, 0.0f, Color.red, 10.0f, 10.0f, Color.yellow));
        r1.setErrorIndicatorStroke(new BasicStroke(1.2f));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(r1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        StatisticalBarRenderer r2 = (StatisticalBarRenderer) in.readObject();
        in.close();

        Assert.assertEquals(r1, r2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawItem_invalidDatasetType_throwsException() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        DefaultCategoryDataset invalidDataset = new DefaultCategoryDataset();
        invalidDataset.addValue(10.0, "Row1", "Col1");

        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, 0, null);
        try {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, invalidDataset, 0, 0, 0);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testDrawItem_verticalAndHorizontal_standardExecution() {
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series 1", "Category 1");
        dataset.add(15.0, 3.0, "Series 1", "Category 2");
        dataset.add(20.0, 4.0, "Series 2", "Category 1");
        dataset.add(25.0, 5.0, "Series 2", "Category 2");

        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 380, 380);

        try {
            plot.setOrientation(PlotOrientation.VERTICAL);
            CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, 0, null);
            for (int r = 0; r < dataset.getRowCount(); r++) {
                for (int c = 0; c < dataset.getColumnCount(); c++) {
                    renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, r, c, 0);
                }
            }

            plot.setOrientation(PlotOrientation.HORIZONTAL);
            CategoryItemRendererState stateH = renderer.initialise(g2, dataArea, plot, 0, null);
            for (int r = 0; r < dataset.getRowCount(); r++) {
                for (int c = 0; c < dataset.getColumnCount(); c++) {
                    renderer.drawItem(g2, stateH, dataArea, plot, domainAxis, rangeAxis, dataset, r, c, 0);
                }
            }
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testDrawItem_singleSeriesAndOutlineAndItemLabelsAndEntities() {
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Series 1", "Category 1");
        dataset.add(-10.0, 2.0, "Series 1", "Category 2");

        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setDrawBarOutline(true);
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);
        renderer.setErrorIndicatorPaint(null);
        renderer.setErrorIndicatorStroke(null);

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 380, 380);
        EntityCollection entities = new StandardEntityCollection();

        try {
            plot.setOrientation(PlotOrientation.VERTICAL);
            CategoryItemRendererState stateV = renderer.initialise(g2, dataArea, plot, 0, null);
            stateV.setBarWidth(10.0);
            stateV.setEntityCollection(entities);
            renderer.drawItem(g2, stateV, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
            renderer.drawItem(g2, stateV, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);

            plot.setOrientation(PlotOrientation.HORIZONTAL);
            CategoryItemRendererState stateH = renderer.initialise(g2, dataArea, plot, 0, null);
            stateH.setBarWidth(10.0);
            stateH.setEntityCollection(entities);
            renderer.drawItem(g2, stateH, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
            renderer.drawItem(g2, stateH, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);

            Assert.assertTrue(entities.getEntityCount() > 0);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testDrawItem_clippingBranchesHorizontalAndVertical() {
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 1.0, "Series 1", "Category 1");
        dataset.add(-10.0, 1.0, "Series 1", "Category 2");

        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 380, 380);

        try {
            PlotOrientation[] orientations = {PlotOrientation.HORIZONTAL, PlotOrientation.VERTICAL};
            CustomClipRenderer[] renderers = {
                new CustomClipRenderer(-50.0, -10.0),
                new CustomClipRenderer(-50.0, 50.0),
                new CustomClipRenderer(5.0, 50.0),
                new CustomClipRenderer(-5.0, -1.0),
                new CustomClipRenderer(20.0, 50.0)
            };

            for (PlotOrientation orientation : orientations) {
                for (CustomClipRenderer renderer : renderers) {
                    CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
                    plot.setOrientation(orientation);
                    CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, 0, null);
                    state.setBarWidth(2.0);

                    renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
                    renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);
                }
            }
        } finally {
            g2.dispose();
        }
    }
}
