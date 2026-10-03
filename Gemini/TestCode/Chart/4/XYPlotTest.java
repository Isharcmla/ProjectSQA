package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.annotations.XYAnnotationBoundsInfo;
import org.jfree.chart.annotations.XYBoxAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickType;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.ValueTick;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.renderer.xy.AbstractXYItemRenderer;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.SelectableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYDatasetSelectionState;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Test;

public class XYPlotTest {

    private static class TestPlotListener implements PlotChangeListener {
        private int eventsReceived = 0;

        public void plotChanged(PlotChangeEvent event) {
            this.eventsReceived++;
        }

        public int getEventsReceived() {
            return this.eventsReceived;
        }

        public void reset() {
            this.eventsReceived = 0;
        }
    }

    private XYDataset createSampleDataset() {
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 2.0);
        series.add(2.0, 4.0);
        series.add(3.0, 3.0);
        return new XYSeriesCollection(series);
    }

    private Graphics2D createGraphics() {
        BufferedImage image = new BufferedImage(500, 300, BufferedImage.TYPE_INT_ARGB);
        return image.createGraphics();
    }

    @Test
    public void testDefaultConstructor_initialValues() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());
        assertEquals("XY_Plot", plot.getPlotType().trim().isEmpty() ? "XY_Plot" : plot.getPlotType());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(1, plot.getWeight());
        assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        assertTrue(plot.isDomainGridlinesVisible());
        assertTrue(plot.isRangeGridlinesVisible());
        assertFalse(plot.isDomainMinorGridlinesVisible());
        assertFalse(plot.isRangeMinorGridlinesVisible());
        assertFalse(plot.isDomainZeroBaselineVisible());
        assertFalse(plot.isRangeZeroBaselineVisible());
        assertFalse(plot.isDomainCrosshairVisible());
        assertFalse(plot.isRangeCrosshairVisible());
        assertTrue(plot.isDomainCrosshairLockedOnData());
        assertTrue(plot.isRangeCrosshairLockedOnData());
        assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
        assertEquals(SeriesRenderingOrder.REVERSE, plot.getSeriesRenderingOrder());
    }

    @Test
    public void testCustomConstructor_withNonNullArguments() {
        XYDataset dataset = createSampleDataset();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new StandardXYItemRenderer();

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        assertSame(dataset, plot.getDataset());
        assertSame(xAxis, plot.getDomainAxis());
        assertSame(yAxis, plot.getRangeAxis());
        assertSame(renderer, plot.getRenderer());
        assertSame(plot, xAxis.getPlot());
        assertSame(plot, yAxis.getPlot());
        assertSame(plot, renderer.getPlot());
    }

    @Test
    public void testSetOrientation_validAndNull() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        assertEquals(1, listener.getEventsReceived());

        // setting the same value should not fire event
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(1, listener.getEventsReceived());

        try {
            plot.setOrientation(null);
            fail("Expected IllegalArgumentException on null orientation");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetAxisOffset_validAndNull() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
        assertEquals(1, listener.getEventsReceived());

        try {
            plot.setAxisOffset(null);
            fail("Expected IllegalArgumentException on null offset");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDomainAxis_getSetClearAndMultiple() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("X1");
        NumberAxis axis2 = new NumberAxis("X2");

        plot.setDomainAxis(axis1);
        assertSame(axis1, plot.getDomainAxis());
        assertSame(axis1, plot.getDomainAxis(0));
        assertEquals(1, plot.getDomainAxisCount());

        plot.setDomainAxis(1, axis2, true);
        assertSame(axis2, plot.getDomainAxis(1));
        assertEquals(2, plot.getDomainAxisCount());

        ValueAxis[] axes = new ValueAxis[] { new NumberAxis("A"), new NumberAxis("B") };
        plot.setDomainAxes(axes);
        assertSame(axes[0], plot.getDomainAxis(0));
        assertSame(axes[1], plot.getDomainAxis(1));

        plot.configureDomainAxes();

        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertNull(plot.getDomainAxis());
    }

    @Test
    public void testDomainAxis_parentPlotFallback() {
        XYPlot parent = new XYPlot();
        NumberAxis parentAxis = new NumberAxis("ParentDomain");
        parent.setDomainAxis(0, parentAxis);

        CombinedDomainXYPlot combined = new CombinedDomainXYPlot(parentAxis);
        XYPlot subplot = new XYPlot();
        combined.add(subplot, 1);

        assertSame(parentAxis, subplot.getDomainAxis(0));
        assertEquals(0, subplot.getDomainAxisIndex(parentAxis));
    }

    @Test
    public void testDomainAxisLocations_andEdges() {
        XYPlot plot = new XYPlot();
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT, true);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getDomainAxisLocation(1));

        // Unset location falls back to opposite of primary
        plot.setDomainAxisLocation(0, AxisLocation.TOP_OR_LEFT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getDomainAxisLocation(5));

        try {
            plot.setDomainAxisLocation(0, null, true);
            fail("Expected IllegalArgumentException for null location at index 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRangeAxis_getSetClearAndMultiple() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("Y1");
        NumberAxis axis2 = new NumberAxis("Y2");

        plot.setRangeAxis(axis1);
        assertSame(axis1, plot.getRangeAxis());
        assertSame(axis1, plot.getRangeAxis(0));
        assertEquals(1, plot.getRangeAxisCount());

        plot.setRangeAxis(1, axis2, true);
        assertSame(axis2, plot.getRangeAxis(1));
        assertEquals(2, plot.getRangeAxisCount());

        ValueAxis[] axes = new ValueAxis[] { new NumberAxis("R1"), new NumberAxis("R2") };
        plot.setRangeAxes(axes);
        assertSame(axes[0], plot.getRangeAxis(0));
        assertSame(axes[1], plot.getRangeAxis(1));

        plot.configureRangeAxes();

        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
        assertNull(plot.getRangeAxis());
    }

    @Test
    public void testRangeAxis_parentPlotFallback() {
        XYPlot parent = new XYPlot();
        NumberAxis parentAxis = new NumberAxis("ParentRange");
        parent.setRangeAxis(0, parentAxis);

        CombinedRangeXYPlot combined = new CombinedRangeXYPlot(parentAxis);
        XYPlot subplot = new XYPlot();
        combined.add(subplot, 1);

        assertSame(parentAxis, subplot.getRangeAxis(0));
        assertEquals(0, subplot.getRangeAxisIndex(parentAxis));
    }

    @Test
    public void testRangeAxisLocations_andEdges() {
        XYPlot plot = new XYPlot();
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation());
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT, true);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation(1));

        plot.setRangeAxisLocation(0, AxisLocation.TOP_OR_LEFT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation(5));

        try {
            plot.setRangeAxisLocation(0, null, true);
            fail("Expected IllegalArgumentException for null location at index 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDatasets_getSetIndexAndCount() {
        XYPlot plot = new XYPlot();
        XYDataset ds1 = createSampleDataset();
        XYDataset ds2 = new DefaultXYDataset();

        plot.setDataset(ds1);
        assertSame(ds1, plot.getDataset());
        assertSame(ds1, plot.getDataset(0));
        assertEquals(0, plot.indexOf(ds1));
        assertEquals(-1, plot.indexOf(ds2));

        plot.setDataset(1, ds2);
        assertSame(ds2, plot.getDataset(1));
        assertEquals(2, plot.getDatasetCount());
        assertEquals(1, plot.indexOf(ds2));

        plot.setDataset(0, null);
        assertNull(plot.getDataset(0));
    }

    @Test
    public void testDatasetAxisMapping_domainAndRange() {
        XYPlot plot = new XYPlot();
        NumberAxis x0 = new NumberAxis("X0");
        NumberAxis x1 = new NumberAxis("X1");
        NumberAxis y0 = new NumberAxis("Y0");
        NumberAxis y1 = new NumberAxis("Y1");
        plot.setDomainAxes(new ValueAxis[] { x0, x1 });
        plot.setRangeAxes(new ValueAxis[] { y0, y1 });

        plot.mapDatasetToDomainAxis(0, 1);
        assertSame(x1, plot.getDomainAxisForDataset(0));

        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(y1, plot.getRangeAxisForDataset(0));

        List domainIndices = Arrays.asList(new Integer(0), new Integer(1));
        plot.mapDatasetToDomainAxes(0, domainIndices);
        assertSame(x0, plot.getDomainAxisForDataset(0));

        List rangeIndices = Arrays.asList(new Integer(1), new Integer(0));
        plot.mapDatasetToRangeAxes(0, rangeIndices);
        assertSame(y1, plot.getRangeAxisForDataset(0));

        // Test exception for invalid dataset index in mapping
        try {
            plot.mapDatasetToDomainAxes(-1, domainIndices);
            fail("Expected IllegalArgumentException for negative index");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.mapDatasetToRangeAxes(-1, rangeIndices);
            fail("Expected IllegalArgumentException for negative index");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Test exception for empty indices list
        try {
            plot.mapDatasetToDomainAxes(0, new ArrayList());
            fail("Expected IllegalArgumentException for empty indices");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Test exception for non-integer list elements
        List invalidList = new ArrayList();
        invalidList.add("not an integer");
        try {
            plot.mapDatasetToDomainAxes(0, invalidList);
            fail("Expected IllegalArgumentException for non-Integer element");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Test exception for duplicate integer elements
        List duplicateList = Arrays.asList(new Integer(0), new Integer(0));
        try {
            plot.mapDatasetToRangeAxes(0, duplicateList);
            fail("Expected IllegalArgumentException for duplicate indices");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetAxisForDataset_outOfBounds() {
        XYPlot plot = new XYPlot();
        try {
            plot.getDomainAxisForDataset(10);
            fail("Expected IllegalArgumentException for index out of bounds");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.getRangeAxisForDataset(-1);
            fail("Expected IllegalArgumentException for index out of bounds");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRenderers_getSetIndexAndCount() {
        XYPlot plot = new XYPlot();
        XYItemRenderer r0 = new StandardXYItemRenderer();
        XYItemRenderer r1 = new XYLineAndShapeRenderer();

        plot.setRenderer(r0);
        assertSame(r0, plot.getRenderer());
        assertSame(r0, plot.getRenderer(0));
        assertEquals(0, plot.getIndexOf(r0));
        assertEquals(1, plot.getRendererCount());

        plot.setRenderer(1, r1, true);
        assertSame(r1, plot.getRenderer(1));
        assertEquals(2, plot.getRendererCount());
        assertEquals(1, plot.getIndexOf(r1));

        XYItemRenderer[] renderers = new XYItemRenderer[] { new DefaultXYItemRenderer() };
        plot.setRenderers(renderers);
        assertSame(renderers[0], plot.getRenderer(0));

        XYDataset ds = createSampleDataset();
        plot.setDataset(0, ds);
        assertSame(renderers[0], plot.getRendererForDataset(ds));
    }

    @Test
    public void testRenderingOrders_getAndSet() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());

        try {
            plot.setDatasetRenderingOrder(null);
            fail("Expected IllegalArgumentException on null DatasetRenderingOrder");
        } catch (IllegalArgumentException e) {
            // expected
        }

        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        assertEquals(SeriesRenderingOrder.FORWARD, plot.getSeriesRenderingOrder());

        try {
            plot.setSeriesRenderingOrder(null);
            fail("Expected IllegalArgumentException on null SeriesRenderingOrder");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWeight_getAndSet() {
        XYPlot plot = new XYPlot();
        plot.setWeight(5);
        assertEquals(5, plot.getWeight());
    }

    @Test
    public void testGridlinesAndBaselines_propertiesAndValidation() {
        XYPlot plot = new XYPlot();

        // Domain gridlines
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
        Stroke stroke = new BasicStroke(1.5f);
        plot.setDomainGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainGridlineStroke());
        plot.setDomainGridlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainGridlinePaint());

        try {
            plot.setDomainGridlineStroke(null);
            fail("Expected IllegalArgumentException on null stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setDomainGridlinePaint(null);
            fail("Expected IllegalArgumentException on null paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Domain minor gridlines
        plot.setDomainMinorGridlinesVisible(true);
        assertTrue(plot.isDomainMinorGridlinesVisible());
        plot.setDomainMinorGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainMinorGridlineStroke());
        plot.setDomainMinorGridlinePaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getDomainMinorGridlinePaint());

        try {
            plot.setDomainMinorGridlineStroke(null);
            fail("Expected IllegalArgumentException on null minor stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setDomainMinorGridlinePaint(null);
            fail("Expected IllegalArgumentException on null minor paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Range gridlines
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlineStroke(stroke);
        assertSame(stroke, plot.getRangeGridlineStroke());
        plot.setRangeGridlinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeGridlinePaint());

        try {
            plot.setRangeGridlineStroke(null);
            fail("Expected IllegalArgumentException on null stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setRangeGridlinePaint(null);
            fail("Expected IllegalArgumentException on null paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Range minor gridlines
        plot.setRangeMinorGridlinesVisible(true);
        assertTrue(plot.isRangeMinorGridlinesVisible());
        plot.setRangeMinorGridlineStroke(stroke);
        assertSame(stroke, plot.getRangeMinorGridlineStroke());
        plot.setRangeMinorGridlinePaint(Color.CYAN);
        assertEquals(Color.CYAN, plot.getRangeMinorGridlinePaint());

        try {
            plot.setRangeMinorGridlineStroke(null);
            fail("Expected IllegalArgumentException on null minor stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setRangeMinorGridlinePaint(null);
            fail("Expected IllegalArgumentException on null minor paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Domain zero baseline
        plot.setDomainZeroBaselineVisible(true);
        assertTrue(plot.isDomainZeroBaselineVisible());
        plot.setDomainZeroBaselineStroke(stroke);
        assertSame(stroke, plot.getDomainZeroBaselineStroke());
        plot.setDomainZeroBaselinePaint(Color.MAGENTA);
        assertEquals(Color.MAGENTA, plot.getDomainZeroBaselinePaint());

        try {
            plot.setDomainZeroBaselineStroke(null);
            fail("Expected IllegalArgumentException on null baseline stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setDomainZeroBaselinePaint(null);
            fail("Expected IllegalArgumentException on null baseline paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Range zero baseline
        plot.setRangeZeroBaselineVisible(true);
        assertTrue(plot.isRangeZeroBaselineVisible());
        plot.setRangeZeroBaselineStroke(stroke);
        assertSame(stroke, plot.getRangeZeroBaselineStroke());
        plot.setRangeZeroBaselinePaint(Color.YELLOW);
        assertEquals(Color.YELLOW, plot.getRangeZeroBaselinePaint());

        try {
            plot.setRangeZeroBaselineStroke(null);
            fail("Expected IllegalArgumentException on null baseline stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setRangeZeroBaselinePaint(null);
            fail("Expected IllegalArgumentException on null baseline paint");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCrosshairProperties_andValidation() {
        XYPlot plot = new XYPlot();

        // Domain crosshair
        plot.setDomainCrosshairVisible(true);
        assertTrue(plot.isDomainCrosshairVisible());
        plot.setDomainCrosshairLockedOnData(false);
        assertFalse(plot.isDomainCrosshairLockedOnData());
        plot.setDomainCrosshairValue(12.5, true);
        assertEquals(12.5, plot.getDomainCrosshairValue(), 1e-9);

        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainCrosshairStroke(stroke);
        assertSame(stroke, plot.getDomainCrosshairStroke());
        plot.setDomainCrosshairPaint(Color.ORANGE);
        assertEquals(Color.ORANGE, plot.getDomainCrosshairPaint());

        try {
            plot.setDomainCrosshairStroke(null);
            fail("Expected IllegalArgumentException on null crosshair stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setDomainCrosshairPaint(null);
            fail("Expected IllegalArgumentException on null crosshair paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Range crosshair
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairValue(24.5, true);
        assertEquals(24.5, plot.getRangeCrosshairValue(), 1e-9);

        plot.setRangeCrosshairStroke(stroke);
        assertSame(stroke, plot.getRangeCrosshairStroke());
        plot.setRangeCrosshairPaint(Color.PINK);
        assertEquals(Color.PINK, plot.getRangeCrosshairPaint());

        try {
            plot.setRangeCrosshairStroke(null);
            fail("Expected IllegalArgumentException on null crosshair stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setRangeCrosshairPaint(null);
            fail("Expected IllegalArgumentException on null crosshair paint");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTickBandsAndQuadrants() {
        XYPlot plot = new XYPlot();

        plot.setDomainTickBandPaint(Color.LIGHT_GRAY);
        assertEquals(Color.LIGHT_GRAY, plot.getDomainTickBandPaint());
        plot.setRangeTickBandPaint(Color.DARK_GRAY);
        assertEquals(Color.DARK_GRAY, plot.getRangeTickBandPaint());

        Point2D origin = new Point2D.Double(5.0, 10.0);
        plot.setQuadrantOrigin(origin);
        assertEquals(origin, plot.getQuadrantOrigin());

        try {
            plot.setQuadrantOrigin(null);
            fail("Expected IllegalArgumentException on null quadrant origin");
        } catch (IllegalArgumentException e) {
            // expected
        }

        for (int i = 0; i < 4; i++) {
            plot.setQuadrantPaint(i, Color.BLUE);
            assertEquals(Color.BLUE, plot.getQuadrantPaint(i));
        }

        try {
            plot.getQuadrantPaint(-1);
            fail("Expected IllegalArgumentException for index -1");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setQuadrantPaint(4, Color.RED);
            fail("Expected IllegalArgumentException for index 4");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDomainMarkers_addRemoveClear() {
        XYPlot plot = new XYPlot();
        Marker m1 = new ValueMarker(1.0);
        Marker m2 = new IntervalMarker(2.0, 3.0);

        plot.addDomainMarker(m1);
        plot.addDomainMarker(m2, Layer.BACKGROUND);
        Collection fgMarkers = plot.getDomainMarkers(Layer.FOREGROUND);
        Collection bgMarkers = plot.getDomainMarkers(Layer.BACKGROUND);
        assertTrue(fgMarkers.contains(m1));
        assertTrue(bgMarkers.contains(m2));

        assertTrue(plot.removeDomainMarker(m1));
        assertFalse(plot.removeDomainMarker(m1)); // already removed
        assertTrue(plot.removeDomainMarker(0, m2, Layer.BACKGROUND, true));

        // Add multiple and clear
        plot.addDomainMarker(0, m1, Layer.FOREGROUND);
        plot.addDomainMarker(1, m2, Layer.BACKGROUND);
        plot.clearDomainMarkers(0);
        assertNull(plot.getDomainMarkers(0, Layer.FOREGROUND));

        plot.addDomainMarker(0, m1, Layer.FOREGROUND);
        plot.clearDomainMarkers();
        assertNull(plot.getDomainMarkers(0, Layer.FOREGROUND));
        assertNull(plot.getDomainMarkers(1, Layer.BACKGROUND));

        try {
            plot.addDomainMarker(null);
            fail("Expected IllegalArgumentException for null marker");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.addDomainMarker(0, m1, null);
            fail("Expected IllegalArgumentException for null layer");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRangeMarkers_addRemoveClear() {
        XYPlot plot = new XYPlot();
        Marker m1 = new ValueMarker(10.0);
        Marker m2 = new IntervalMarker(20.0, 30.0);

        plot.addRangeMarker(m1);
        plot.addRangeMarker(m2, Layer.BACKGROUND);
        Collection fgMarkers = plot.getRangeMarkers(Layer.FOREGROUND);
        Collection bgMarkers = plot.getRangeMarkers(Layer.BACKGROUND);
        assertTrue(fgMarkers.contains(m1));
        assertTrue(bgMarkers.contains(m2));

        assertTrue(plot.removeRangeMarker(m1));
        assertFalse(plot.removeRangeMarker(m1));
        assertTrue(plot.removeRangeMarker(0, m2, Layer.BACKGROUND, true));

        plot.addRangeMarker(0, m1, Layer.FOREGROUND);
        plot.addRangeMarker(1, m2, Layer.BACKGROUND);
        plot.clearRangeMarkers(0);
        assertNull(plot.getRangeMarkers(0, Layer.FOREGROUND));

        plot.addRangeMarker(0, m1, Layer.FOREGROUND);
        plot.clearRangeMarkers();
        assertNull(plot.getRangeMarkers(0, Layer.FOREGROUND));
        assertNull(plot.getRangeMarkers(1, Layer.BACKGROUND));

        try {
            plot.addRangeMarker(null);
            fail("Expected IllegalArgumentException for null marker");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.removeRangeMarker(0, null, Layer.FOREGROUND, true);
            fail("Expected IllegalArgumentException for null marker");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAnnotations_addRemoveClear() {
        XYPlot plot = new XYPlot();
        XYAnnotation a1 = new XYTextAnnotation("Text", 1.0, 2.0);
        XYAnnotation a2 = new XYBoxAnnotation(0.0, 0.0, 1.0, 1.0);

        plot.addAnnotation(a1);
        plot.addAnnotation(a2, false);
        List list = plot.getAnnotations();
        assertEquals(2, list.size());
        assertTrue(list.contains(a1));
        assertTrue(list.contains(a2));

        assertTrue(plot.removeAnnotation(a1));
        assertFalse(plot.removeAnnotation(a1));
        assertTrue(plot.removeAnnotation(a2, true));
        assertEquals(0, plot.getAnnotations().size());

        plot.addAnnotation(a1);
        plot.clearAnnotations();
        assertEquals(0, plot.getAnnotations().size());

        try {
            plot.addAnnotation(null);
            fail("Expected IllegalArgumentException for null annotation");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.removeAnnotation(null);
            fail("Expected IllegalArgumentException for null annotation");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFixedAxisSpace_getAndSet() {
        XYPlot plot = new XYPlot();
        AxisSpace space = new AxisSpace();
        space.setTop(10.0);
        space.setBottom(10.0);

        plot.setFixedDomainAxisSpace(space);
        assertSame(space, plot.getFixedDomainAxisSpace());

        plot.setFixedRangeAxisSpace(space);
        assertSame(space, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testPannableAndZoomable_operations() {
        XYPlot plot = new XYPlot();
        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setRange(0.0, 100.0);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setRange(0.0, 100.0);
        plot.setDomainAxis(xAxis);
        plot.setRangeAxis(yAxis);

        assertTrue(plot.isDomainZoomable());
        assertTrue(plot.isRangeZoomable());

        // Panning
        plot.setDomainPannable(true);
        plot.setRangePannable(true);
        assertTrue(plot.isDomainPannable());
        assertTrue(plot.isRangePannable());

        plot.panDomainAxes(0.1, null, new Point2D.Double(0, 0));
        plot.panRangeAxes(0.1, null, new Point2D.Double(0, 0));

        // Inverted axis panning
        xAxis.setInverted(true);
        yAxis.setInverted(true);
        plot.panDomainAxes(0.1, null, new Point2D.Double(0, 0));
        plot.panRangeAxes(0.1, null, new Point2D.Double(0, 0));

        // Disabled panning
        plot.setDomainPannable(false);
        plot.setRangePannable(false);
        plot.panDomainAxes(0.1, null, new Point2D.Double(0, 0));
        plot.panRangeAxes(0.1, null, new Point2D.Double(0, 0));

        // Zooming without anchor
        plot.zoomDomainAxes(0.5, null, new Point2D.Double(0, 0));
        plot.zoomRangeAxes(0.5, null, new Point2D.Double(0, 0));

        // Zooming with percentage
        plot.zoomDomainAxes(0.2, 0.8, null, new Point2D.Double(0, 0));
        plot.zoomRangeAxes(0.2, 0.8, null, new Point2D.Double(0, 0));

        // Zooming with anchor (VERTICAL & HORIZONTAL)
        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        Point2D anchor = new Point2D.Double(50, 50);

        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.zoomDomainAxes(0.5, info, anchor, true);
        plot.zoomRangeAxes(0.5, info, anchor, true);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.zoomDomainAxes(0.5, info, anchor, true);
        plot.zoomRangeAxes(0.5, info, anchor, true);
    }

    @Test
    public void testLegends_getAndSet() {
        XYDataset dataset = createSampleDataset();
        XYPlot plot = new XYPlot(dataset, new NumberAxis("X"), new NumberAxis("Y"), new StandardXYItemRenderer());

        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(1, items.getItemCount());

        LegendItemCollection custom = new LegendItemCollection();
        custom.add(new LegendItem("Custom"));
        plot.setFixedLegendItems(custom);
        assertSame(custom, plot.getFixedLegendItems());
        assertSame(custom, plot.getLegendItems());

        plot.setFixedLegendItems(null);
        assertEquals(1, plot.getLegendItems().getItemCount());
    }

    @Test
    public void testGetDataRange_withDatasetAndAnnotations() {
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYDataset dataset = createSampleDataset();
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        Range xRange = plot.getDataRange(xAxis);
        assertNotNull(xRange);
        assertEquals(1.0, xRange.getLowerBound(), 1e-9);
        assertEquals(3.0, xRange.getUpperBound(), 1e-9);

        Range yRange = plot.getDataRange(yAxis);
        assertNotNull(yRange);
        assertEquals(2.0, yRange.getLowerBound(), 1e-9);
        assertEquals(4.0, yRange.getUpperBound(), 1e-9);

        // Add annotation bounds
        XYBoxAnnotation box = new XYBoxAnnotation(0.0, 0.0, 5.0, 6.0);
        plot.addAnnotation(box);

        Range xRangeWithBox = plot.getDataRange(xAxis);
        assertEquals(0.0, xRangeWithBox.getLowerBound(), 1e-9);
        assertEquals(5.0, xRangeWithBox.getUpperBound(), 1e-9);

        Range yRangeWithBox = plot.getDataRange(yAxis);
        assertEquals(0.0, yRangeWithBox.getLowerBound(), 1e-9);
        assertEquals(6.0, yRangeWithBox.getUpperBound(), 1e-9);
    }

    @Test
    public void testHandleClick_insideAndOutside() {
        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setRange(0.0, 10.0);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setRange(0.0, 10.0);
        XYPlot plot = new XYPlot(null, xAxis, yAxis, null);

        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        info.setDataArea(new Rectangle2D.Double(0.0, 0.0, 100.0, 100.0));

        // Click inside
        plot.handleClick(50, 50, info);
        assertEquals(5.0, plot.getDomainCrosshairValue(), 0.5);

        // Click outside
        plot.setDomainCrosshairValue(1.0);
        plot.handleClick(200, 200, info);
        assertEquals(1.0, plot.getDomainCrosshairValue(), 1e-9);
    }

    @Test
    public void testDatasetAndRendererChanged_listeners() {
        XYPlot plot = new XYPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.datasetChanged(new DatasetChangeEvent(this, null));
        assertTrue(listener.getEventsReceived() > 0);

        listener.reset();
        RendererChangeEvent rce = new RendererChangeEvent(new StandardXYItemRenderer(), true);
        plot.rendererChanged(rce);
        assertTrue(listener.getEventsReceived() > 0);
    }

    @Test
    public void testDraw_comprehensiveExecution() {
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 500, 300);

        XYDataset dataset = createSampleDataset();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        // Setup various decorations
        plot.setDomainMinorGridlinesVisible(true);
        plot.setRangeMinorGridlinesVisible(true);
        plot.setDomainZeroBaselineVisible(true);
        plot.setRangeZeroBaselineVisible(true);
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);
        plot.setDomainCrosshairLockedOnData(false);
        plot.setRangeCrosshairLockedOnData(false);
        plot.setDomainTickBandPaint(new Color(240, 240, 240));
        plot.setRangeTickBandPaint(new Color(240, 240, 240));

        plot.setQuadrantPaint(0, new Color(255, 200, 200));
        plot.setQuadrantPaint(1, new Color(200, 255, 200));
        plot.setQuadrantPaint(2, new Color(200, 200, 255));
        plot.setQuadrantPaint(3, new Color(255, 255, 200));

        plot.addDomainMarker(new ValueMarker(1.5), Layer.FOREGROUND);
        plot.addDomainMarker(new ValueMarker(2.5), Layer.BACKGROUND);
        plot.addRangeMarker(new ValueMarker(2.5), Layer.FOREGROUND);
        plot.addRangeMarker(new ValueMarker(3.5), Layer.BACKGROUND);

        plot.addAnnotation(new XYTextAnnotation("Label", 2.0, 3.0));

        ChartRenderingInfo chartInfo = new ChartRenderingInfo();
        PlotRenderingInfo info = chartInfo.getPlotInfo();

        // Draw normal vertical
        plot.draw(g2, area, new Point2D.Double(150, 150), null, info);

        // Draw horizontal
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.draw(g2, area, new Point2D.Double(150, 150), null, info);

        // Draw forward dataset rendering order
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        plot.draw(g2, area, null, null, info);

        // Draw with fixed axis space
        AxisSpace space = new AxisSpace();
        space.setTop(20);
        space.setBottom(20);
        space.setLeft(20);
        space.setRight(20);
        plot.setFixedDomainAxisSpace(space);
        plot.setFixedRangeAxisSpace(space);
        plot.draw(g2, area, null, null, info);

        // Draw empty / too small area
        plot.draw(g2, new Rectangle2D.Double(0, 0, 5, 5), null, null, info);

        // Draw with no dataset (no data message branch)
        plot.setDataset(null);
        plot.draw(g2, area, null, null, info);
    }

    @Test
    public void testDrawGridlinesAndTickBands_directCalls() {
        Graphics2D g2 = createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 400, 200);

        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setRange(0.0, 10.0);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setRange(0.0, 10.0);
        StandardXYItemRenderer renderer = new StandardXYItemRenderer();

        XYPlot plot = new XYPlot(null, xAxis, yAxis, renderer);
        plot.setDomainTickBandPaint(Color.YELLOW);
        plot.setRangeTickBandPaint(Color.YELLOW);
        plot.setDomainMinorGridlinesVisible(true);
        plot.setRangeMinorGridlinesVisible(true);

        List ticks = new ArrayList();
        ticks.add(new ValueTick(TickType.MAJOR, 0.0, "0", RectangleEdge.BOTTOM, null, 0.0f));
        ticks.add(new ValueTick(TickType.MINOR, 2.5, "2.5", RectangleEdge.BOTTOM, null, 0.0f));
        ticks.add(new ValueTick(TickType.MAJOR, 5.0, "5", RectangleEdge.BOTTOM, null, 0.0f));

        plot.drawDomainTickBands(g2, dataArea, ticks);
        plot.drawRangeTickBands(g2, dataArea, ticks);
        plot.drawDomainGridlines(g2, dataArea, ticks);
        plot.drawRangeGridlines(g2, dataArea, ticks);
        plot.drawZeroDomainBaseline(g2, dataArea);
        plot.drawZeroRangeBaseline(g2, dataArea);

        // Test helper lines
        plot.drawHorizontalLine(g2, dataArea, 5.0, new BasicStroke(1.0f), Color.BLACK);
        plot.drawVerticalLine(g2, dataArea, 5.0, new BasicStroke(1.0f), Color.BLACK);
        plot.drawDomainCrosshair(g2, dataArea, PlotOrientation.VERTICAL, 5.0, xAxis, new BasicStroke(1.0f), Color.RED);
        plot.drawDomainCrosshair(g2, dataArea, PlotOrientation.HORIZONTAL, 5.0, xAxis, new BasicStroke(1.0f), Color.RED);
        plot.drawRangeCrosshair(g2, dataArea, PlotOrientation.VERTICAL, 5.0, yAxis, new BasicStroke(1.0f), Color.RED);
        plot.drawRangeCrosshair(g2, dataArea, PlotOrientation.HORIZONTAL, 5.0, yAxis, new BasicStroke(1.0f), Color.RED);
    }

    @Test
    public void testSelectableMethods() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.canSelectByPoint());
        assertTrue(plot.canSelectByRegion());

        plot.select(10.0, 20.0, new Rectangle2D.Double(0, 0, 100, 100), null);
        plot.clearSelection();

        DefaultTableXYDataset dataset = new DefaultTableXYDataset();
        plot.setDataset(dataset);
        plot.clearSelection();
    }

    @Test
    public void testEqualsAndCloning() throws Exception {
        XYPlot p1 = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new StandardXYItemRenderer());
        XYPlot p2 = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new StandardXYItemRenderer());

        assertEquals(p1, p1);
        assertEquals(p1, p2);
        assertEquals(p2, p1);

        p2.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(p1.equals(p2));
        p2.setOrientation(PlotOrientation.VERTICAL);

        p2.setWeight(2);
        assertFalse(p1.equals(p2));
        p2.setWeight(1);

        p2.setDomainGridlinesVisible(false);
        assertFalse(p1.equals(p2));
        p2.setDomainGridlinesVisible(true);

        p2.setDomainGridlinePaint(Color.RED);
        assertFalse(p1.equals(p2));
        p2.setDomainGridlinePaint(XYPlot.DEFAULT_GRIDLINE_PAINT);

        // Clone test
        XYPlot clone = (XYPlot) p1.clone();
        assertNotSame(p1, clone);
        assertSame(clone.getClass(), p1.getClass());
        assertEquals(p1, clone);
        assertNotSame(p1.getDomainAxis(), clone.getDomainAxis());
        assertNotSame(p1.getRangeAxis(), clone.getRangeAxis());
    }

    @Test
    public void testSerialization() throws Exception {
        XYPlot p1 = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new StandardXYItemRenderer());
        p1.setQuadrantPaint(0, Color.RED);
        p1.setDomainTickBandPaint(Color.LIGHT_GRAY);
        p1.setRangeTickBandPaint(Color.LIGHT_GRAY);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(p1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        XYPlot p2 = (XYPlot) in.readObject();
        in.close();

        assertEquals(p1, p2);
    }
}
