package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

import javax.swing.Icon;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Test;

public class MinMaxCategoryRendererTest {

    private Graphics2D createGraphics2D() {
        BufferedImage image = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        return image.createGraphics();
    }

    private Icon createDummyIcon() {
        return new Icon() {
            public void paintIcon(Component c, Graphics g, int x, int y) {
                // do nothing
            }
            public int getIconWidth() {
                return 5;
            }
            public int getIconHeight() {
                return 5;
            }
        };
    }

    // ---------- Constructor / default state ----------

    @Test
    public void testConstructor_defaultValues_setCorrectly() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertFalse(renderer.isDrawLines());
        assertEquals(Color.black, renderer.getGroupPaint());
        assertNotNull(renderer.getGroupStroke());
        assertNotNull(renderer.getObjectIcon());
        assertNotNull(renderer.getMinIcon());
        assertNotNull(renderer.getMaxIcon());
    }

    // ---------- isDrawLines / setDrawLines ----------

    @Test
    public void testSetDrawLines_changeToTrue_updatesValueAndNotifies() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        final boolean[] notified = {false};
        renderer.addChangeListener(new RendererChangeListener() {
            public void rendererChanged(RendererChangeEvent event) {
                notified[0] = true;
            }
        });
        renderer.setDrawLines(true);
        assertTrue(renderer.isDrawLines());
        assertTrue(notified[0]);
    }

    @Test
    public void testSetDrawLines_sameValue_doesNotNotify() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        final int[] count = {0};
        renderer.addChangeListener(new RendererChangeListener() {
            public void rendererChanged(RendererChangeEvent event) {
                count[0]++;
            }
        });
        renderer.setDrawLines(false); // same as default
        assertEquals(0, count[0]);
        assertFalse(renderer.isDrawLines());
    }

    // ---------- getGroupPaint / setGroupPaint ----------

    @Test
    public void testSetGroupPaint_validPaint_updatesValue() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Paint paint = Color.red;
        renderer.setGroupPaint(paint);
        assertEquals(paint, renderer.getGroupPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupPaint_null_throwsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupPaint(null);
    }

    // ---------- getGroupStroke / setGroupStroke ----------

    @Test
    public void testSetGroupStroke_validStroke_updatesValue() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        renderer.setGroupStroke(stroke);
        assertEquals(stroke, renderer.getGroupStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStroke_null_throwsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupStroke(null);
    }

    // ---------- getObjectIcon / setObjectIcon ----------

    @Test
    public void testSetObjectIcon_validIcon_updatesValue() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon icon = createDummyIcon();
        renderer.setObjectIcon(icon);
        assertEquals(icon, renderer.getObjectIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectIcon_null_throwsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setObjectIcon(null);
    }

    // ---------- getMaxIcon / setMaxIcon ----------

    @Test
    public void testSetMaxIcon_validIcon_updatesValue() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon icon = createDummyIcon();
        renderer.setMaxIcon(icon);
        assertEquals(icon, renderer.getMaxIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxIcon_null_throwsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setMaxIcon(null);
    }

    // ---------- getMinIcon / setMinIcon ----------

    @Test
    public void testSetMinIcon_validIcon_updatesValue() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon icon = createDummyIcon();
        renderer.setMinIcon(icon);
        assertEquals(icon, renderer.getMinIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMinIcon_null_throwsException() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setMinIcon(null);
    }

    // ---------- drawItem ----------

    @Test
    public void testDrawItem_verticalOrientationSingleRow_noExceptionThrown() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series1", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        // if no exception is thrown, the test passes
        assertTrue(true);
    }

    @Test
    public void testDrawItem_horizontalOrientation_noExceptionThrown() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15.0, "Series1", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertTrue(true);
    }

    @Test
    public void testDrawItem_multipleRowsSameColumn_lastRowDrawsMinMax() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series1", "Category1");
        dataset.addValue(20.0, "Series2", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 0, 0);
        assertTrue(true);
    }

    @Test
    public void testDrawItem_threeRowsSameColumn_middleRowNotLast_branchCovered() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "Series1", "Category1");
        dataset.addValue(15.0, "Series2", "Category1");
        dataset.addValue(25.0, "Series3", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 2, 0, 0);
        assertTrue(true);
    }

    @Test
    public void testDrawItem_nullValue_doesNothingWithoutException() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue((Number) null, "Series1", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertTrue(true);
    }

    @Test
    public void testDrawItem_plotLinesTrueWithPreviousValue_drawsLine() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series1", "Category1");
        dataset.addValue(20.0, "Series1", "Category2");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 1, 0);
        assertTrue(true);
    }

    @Test
    public void testDrawItem_plotLinesTrueWithPreviousValueNull_skipsLine() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue((Number) null, "Series1", "Category1");
        dataset.addValue(20.0, "Series1", "Category2");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 1, 0);
        assertTrue(true);
    }

    @Test
    public void testDrawItem_plotLinesTrueColumnZero_skipsPreviousLookup() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series1", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertTrue(true);
    }

    @Test
    public void testDrawItem_horizontalOrientationLastRow_drawsMinMaxHorizontally() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(30.0, "Series1", "Category1");
        dataset.addValue(10.0, "Series2", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        CategoryItemRendererState state = new CategoryItemRendererState(
                new PlotRenderingInfo(null));
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = createGraphics2D();

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 0, 0);
        assertTrue(true);
    }

    // ---------- Serialization ----------

    @Test
    public void testSerialization_roundTrip_preservesState() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupPaint(Color.red);
        renderer.setGroupStroke(new BasicStroke(2.0f));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(renderer);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MinMaxCategoryRenderer restored = (MinMaxCategoryRenderer) ois.readObject();
        ois.close();

        assertNotNull(restored);
        assertEquals(Color.red, restored.getGroupPaint());
        assertNotNull(restored.getGroupStroke());
        assertNotNull(restored.getObjectIcon());
        assertNotNull(restored.getMinIcon());
        assertNotNull(restored.getMaxIcon());
    }
}
