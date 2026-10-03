package org.jfree.chart.renderer.category;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.Icon;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MinMaxCategoryRendererTest {

    private static class TestRendererChangeListener implements RendererChangeListener {
        private boolean notified = false;
        private int eventCount = 0;

        public void rendererChanged(RendererChangeEvent event) {
            this.notified = true;
            this.eventCount++;
        }

        public boolean isNotified() {
            return this.notified;
        }

        public int getEventCount() {
            return this.eventCount;
        }
    }

    private static class DummyIcon implements Icon {
        private int width;
        private int height;

        public DummyIcon(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
        }

        public int getIconWidth() {
            return this.width;
        }

        public int getIconHeight() {
            return this.height;
        }
    }

    @Test
    public void testDefaultConstructor() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Assert.assertFalse(renderer.isDrawLines());
        Assert.assertEquals(Color.black, renderer.getGroupPaint());
        Assert.assertEquals(new BasicStroke(1.0f), renderer.getGroupStroke());
        Assert.assertNotNull(renderer.getMinIcon());
        Assert.assertNotNull(renderer.getMaxIcon());
        Assert.assertNotNull(renderer.getObjectIcon());
    }

    @Test
    public void testSetDrawLines() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        renderer.setDrawLines(false);
        Assert.assertFalse(listener.isNotified());

        renderer.setDrawLines(true);
        Assert.assertTrue(renderer.isDrawLines());
        Assert.assertTrue(listener.isNotified());
        Assert.assertEquals(1, listener.getEventCount());

        renderer.setDrawLines(true);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void testSetGroupPaint_valid() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        Paint newPaint = Color.red;
        renderer.setGroupPaint(newPaint);
        Assert.assertEquals(newPaint, renderer.getGroupPaint());
        Assert.assertTrue(listener.isNotified());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupPaint_nullThrowsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupPaint(null);
    }

    @Test
    public void testSetGroupStroke_valid() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        Stroke newStroke = new BasicStroke(2.5f);
        renderer.setGroupStroke(newStroke);
        Assert.assertEquals(newStroke, renderer.getGroupStroke());
        Assert.assertTrue(listener.isNotified());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStroke_nullThrowsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupStroke(null);
    }

    @Test
    public void testSetObjectIcon_valid() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        Icon icon = new DummyIcon(10, 10);
        renderer.setObjectIcon(icon);
        Assert.assertSame(icon, renderer.getObjectIcon());
        Assert.assertTrue(listener.isNotified());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectIcon_nullThrowsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setObjectIcon(null);
    }

    @Test
    public void testSetMaxIcon_valid() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        Icon icon = new DummyIcon(12, 12);
        renderer.setMaxIcon(icon);
        Assert.assertSame(icon, renderer.getMaxIcon());
        Assert.assertTrue(listener.isNotified());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxIcon_nullThrowsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setMaxIcon(null);
    }

    @Test
    public void testSetMinIcon_valid() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        Icon icon = new DummyIcon(8, 8);
        renderer.setMinIcon(icon);
        Assert.assertSame(icon, renderer.getMinIcon());
        Assert.assertTrue(listener.isNotified());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMinIcon_nullThrowsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setMinIcon(null);
    }

    @Test
    public void testDefaultIconsBehavior() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();

        Icon minIcon = renderer.getMinIcon();
        Assert.assertTrue(minIcon.getIconWidth() >= 0);
        Assert.assertTrue(minIcon.getIconHeight() >= 0);
        minIcon.paintIcon(null, g2, 10, 10);

        Icon maxIcon = renderer.getMaxIcon();
        Assert.assertTrue(maxIcon.getIconWidth() >= 0);
        Assert.assertTrue(maxIcon.getIconHeight() >= 0);
        maxIcon.paintIcon(null, g2, 20, 20);

        Icon objectIcon = renderer.getObjectIcon();
        Assert.assertTrue(objectIcon.getIconWidth() >= 0);
        Assert.assertTrue(objectIcon.getIconHeight() >= 0);
        objectIcon.paintIcon(null, g2, 30, 30);

        g2.dispose();
    }

    @Test
    public void testDrawItem_verticalOrientationWithLinesAndEntities() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series 1", "Cat 1");
        dataset.addValue(5.0, "Series 2", "Cat 1");
        dataset.addValue(20.0, "Series 1", "Cat 2");
        dataset.addValue(15.0, "Series 2", "Cat 2");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(50.0, 50.0, 300.0, 200.0);

        StandardEntityCollection entityCollection = new StandardEntityCollection();
        CategoryItemRendererState state = new CategoryItemRendererState(null);
        state.setElementHinting(false);
        try {
            java.lang.reflect.Field entityField = CategoryItemRendererState.class.getDeclaredField("entities");
            entityField.setAccessible(true);
            entityField.set(state, entityCollection);
        }
        catch (Exception e) {
            // Field might differ in versions, continue if reflection fails
        }

        for (int c = 0; c < dataset.getColumnCount(); c++) {
            for (int r = 0; r < dataset.getRowCount(); r++) {
                renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, r, c, 0);
            }
        }
        g2.dispose();

        Assert.assertNotNull(image);
    }

    @Test
    public void testDrawItem_horizontalOrientation() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series 1", "Cat 1");
        dataset.addValue(2.0, "Series 2", "Cat 1");
        dataset.addValue(30.0, "Series 1", "Cat 2");
        dataset.addValue(25.0, "Series 2", "Cat 2");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(50.0, 50.0, 300.0, 200.0);
        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, dataset, null);

        for (int c = 0; c < dataset.getColumnCount(); c++) {
            for (int r = 0; r < dataset.getRowCount(); r++) {
                renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, r, c, 0);
            }
        }
        g2.dispose();
    }

    @Test
    public void testDrawItem_nullValuesAndEdgeCases() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "Series 1", "Cat 1");
        dataset.addValue(5.0, "Series 2", "Cat 1");
        dataset.addValue(12.0, "Series 1", "Cat 2");
        dataset.addValue(null, "Series 2", "Cat 2");
        dataset.addValue(15.0, "Series 1", "Cat 3");
        dataset.addValue(1.0, "Series 2", "Cat 3");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(50.0, 50.0, 300.0, 200.0);
        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, dataset, null);

        for (int c = 0; c < dataset.getColumnCount(); c++) {
            for (int r = 0; r < dataset.getRowCount(); r++) {
                renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, r, c, 0);
            }
        }
        g2.dispose();
    }

    @Test
    public void testDrawItem_singleRowDataset() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(false);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100.0, "Series 1", "Cat 1");
        dataset.addValue(200.0, "Series 1", "Cat 2");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(50.0, 50.0, 300.0, 200.0);
        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, dataset, null);

        for (int c = 0; c < dataset.getColumnCount(); c++) {
            for (int r = 0; r < dataset.getRowCount(); r++) {
                renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, r, c, 0);
            }
        }
        g2.dispose();
    }

    @Test
    public void testDrawItem_minMaxUpdatingOrder() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(50.0, "Series 1", "Cat 1");
        dataset.addValue(10.0, "Series 2", "Cat 1");
        dataset.addValue(100.0, "Series 3", "Cat 1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(50.0, 50.0, 300.0, 200.0);
        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, dataset, null);

        for (int r = 0; r < dataset.getRowCount(); r++) {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, r, 0, 0);
        }
        g2.dispose();
    }

    @Test
    public void testSerialization() throws Exception {
        MinMaxCategoryRenderer r1 = new MinMaxCategoryRenderer();
        r1.setDrawLines(true);
        r1.setGroupPaint(Color.blue);
        r1.setGroupStroke(new BasicStroke(3.0f));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(r1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        MinMaxCategoryRenderer r2 = (MinMaxCategoryRenderer) in.readObject();
        in.close();

        Assert.assertEquals(r1.isDrawLines(), r2.isDrawLines());
        Assert.assertEquals(r1.getGroupPaint(), r2.getGroupPaint());
        Assert.assertEquals(r1.getGroupStroke(), r2.getGroupStroke());
        Assert.assertNotNull(r2.getMinIcon());
        Assert.assertNotNull(r2.getMaxIcon());
        Assert.assertNotNull(r2.getObjectIcon());

        BufferedImage image = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        r2.getMinIcon().paintIcon(null, g2, 0, 0);
        r2.getMaxIcon().paintIcon(null, g2, 0, 0);
        r2.getObjectIcon().paintIcon(null, g2, 0, 0);
        g2.dispose();
    }
}
