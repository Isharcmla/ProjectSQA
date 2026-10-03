package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Assert;
import org.junit.Test;

public class XYPlotTest implements PlotChangeListener {

    private boolean plotChanged = false;

    public void plotChanged(PlotChangeEvent event) {
        this.plotChanged = true;
    }

    private XYDataset createSampleDataset() {
        XYSeries series = new XYSeries("Series 1");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    @Test
    public void testDefaultConstructor() {
        XYPlot plot = new XYPlot();
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getRenderer());
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertEquals("XY Plot", plot.getPlotType());
    }

    @Test
    public void testCustomConstructor() {
        XYDataset dataset = createSampleDataset();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        Assert.assertEquals(dataset, plot.getDataset());
        Assert.assertEquals(xAxis, plot.getDomainAxis());
        Assert.assertEquals(yAxis, plot.getRangeAxis());
        Assert.assertEquals(renderer, plot.getRenderer());
        Assert.assertEquals(1, plot.getDomainAxisCount());
        Assert.assertEquals(1, plot.getRangeAxisCount());
        Assert.assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testOrientation() {
        XYPlot plot = new XYPlot();
        plot.addChangeListener(this);
        this.plotChanged = false;

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        Assert.assertTrue(this.plotChanged);

        this.plotChanged = false;
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(this.plotChanged);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientation_null() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }

    @Test
    public void testAxisOffset() {
        XYPlot plot = new XYPlot();
        plot.addChangeListener(this);
        this.plotChanged = false;

        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        plot.setAxisOffset(insets);
        Assert.assertEquals(insets, plot.getAxisOffset());
        Assert.assertTrue(this.plotChanged);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffset_null() {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testDomainAxisOperations() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("X1");
        NumberAxis axis2 = new NumberAxis("X2");

        plot.setDomainAxis(axis1);
        Assert.assertEquals(axis1, plot.getDomainAxis());
        Assert.assertEquals(axis1, plot.getDomainAxis(0));
        Assert.assertEquals(0, plot.getDomainAxisIndex(axis1));

        plot.setDomainAxis(1, axis2);
        Assert.assertEquals(axis2, plot.getDomainAxis(1));
        Assert.assertEquals(1, plot.getDomainAxisIndex(axis2));
        Assert.assertEquals(2, plot.getDomainAxisCount());

        ValueAxis[] axes = new ValueAxis[] {new NumberAxis("A"), new NumberAxis("B")};
        plot.setDomainAxes(axes);
        Assert.assertEquals("A", plot.getDomainAxis(0).getLabel());
        Assert.assertEquals("B", plot.getDomainAxis(1).getLabel());

        plot.clearDomainAxes();
        Assert.assertEquals(0, plot.getDomainAxisCount());
        Assert.assertNull(plot.getDomainAxis(0));
    }

    @Test
    public void testRangeAxisOperations() {
        XYPlot plot = new XYPlot();
        NumberAxis axis1 = new NumberAxis("Y1");
        NumberAxis axis2 = new NumberAxis("Y2");

        plot.setRangeAxis(axis1);
        Assert.assertEquals(axis1, plot.getRangeAxis());
        Assert.assertEquals(axis1, plot.getRangeAxis(0));
        Assert.assertEquals(0, plot.getRangeAxisIndex(axis1));

        plot.setRangeAxis(1, axis2);
        Assert.assertEquals(axis2, plot.getRangeAxis(1));
        Assert.assertEquals(1, plot.getRangeAxisIndex(axis2));
        Assert.assertEquals(2, plot.getRangeAxisCount());

        ValueAxis[] axes = new ValueAxis[] {new NumberAxis("RA"), new NumberAxis("RB")};
        plot.setRangeAxes(axes);
        Assert.assertEquals("RA", plot.getRangeAxis(0).getLabel());
        Assert.assertEquals("RB", plot.getRangeAxis(1).getLabel());

        plot.clearRangeAxes();
        Assert.assertEquals(0, plot.getRangeAxisCount());
        Assert.assertNull(plot.getRangeAxis(0));
    }

    @Test
    public void testDomainAxisLocationsAndEdges() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_LEFT);
        Assert.assertEquals(AxisLocation.TOP_OR_LEFT, plot.getDomainAxisLocation());
        Assert.assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getDomainAxisLocation(1));
        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge(1));

        Assert.assertNotNull(plot.getDomainAxisLocation(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation_nullIndex0() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testRangeAxisLocationsAndEdges() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation(1));
        Assert.assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge(1));

        Assert.assertNotNull(plot.getRangeAxisLocation(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocation_nullIndex0() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testDatasetOperations() {
        XYPlot plot = new XYPlot();
        XYDataset dataset0 = createSampleDataset();
        XYDataset dataset1 = createSampleDataset();

        plot.setDataset(dataset0);
        Assert.assertEquals(dataset0, plot.getDataset());
        Assert.assertEquals(0, plot.indexOf(dataset0));

        plot.setDataset(1, dataset1);
        Assert.assertEquals(dataset1, plot.getDataset(1));
        Assert.assertEquals(1, plot.indexOf(dataset1));
        Assert.assertEquals(2, plot.getDatasetCount());

        Assert.assertEquals(-1, plot.indexOf(createSampleDataset()));
        Assert.assertNull(plot.getDataset(5));
    }

    @Test
    public void testDatasetToAxisMapping() {
        XYPlot plot = new XYPlot();
        XYDataset d0 = createSampleDataset();
        XYDataset d1 = createSampleDataset();
        plot.setDataset(0, d0);
        plot.setDataset(1, d1);

        NumberAxis x0 = new NumberAxis("X0");
        NumberAxis x1 = new NumberAxis("X1");
        plot.setDomainAxis(0, x0);
        plot.setDomainAxis(1, x1);

        NumberAxis y0 = new NumberAxis("Y0");
        NumberAxis y1 = new NumberAxis("Y1");
        plot.setRangeAxis(0, y0);
        plot.setRangeAxis(1, y1);

        plot.mapDatasetToDomainAxis(1, 1);
        plot.mapDatasetToRangeAxis(1, 1);

        Assert.assertEquals(x0, plot.getDomainAxisForDataset(0));
        Assert.assertEquals(x1, plot.getDomainAxisForDataset(1));
        Assert.assertEquals(y0, plot.getRangeAxisForDataset(0));
        Assert.assertEquals(y1, plot.getRangeAxisForDataset(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDataset_outOfBounds() {
        XYPlot plot = new XYPlot();
        plot.getDomainAxisForDataset(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDataset_outOfBounds() {
        XYPlot plot = new XYPlot();
        plot.getRangeAxisForDataset(-1);
    }

    @Test
    public void testRendererOperations() {
        XYPlot plot = new XYPlot();
        XYItemRenderer r0 = new StandardXYItemRenderer();
        XYItemRenderer r1 = new DefaultXYItemRenderer();

        plot.setRenderer(r0);
        Assert.assertEquals(r0, plot.getRenderer());
        Assert.assertEquals(r0, plot.getRenderer(0));
        Assert.assertEquals(0, plot.getIndexOf(r0));

        plot.setRenderer(1, r1);
        Assert.assertEquals(r1, plot.getRenderer(1));
        Assert.assertEquals(1, plot.getIndexOf(r1));

        XYItemRenderer[] renderers = new XYItemRenderer[] {new StandardXYItemRenderer(), new DefaultXYItemRenderer()};
        plot.setRenderers(renderers);
        Assert.assertEquals(renderers[0], plot.getRenderer(0));
        Assert.assertEquals(renderers[1], plot.getRenderer(1));

        Assert.assertNull(plot.getRenderer(5));
        Assert.assertEquals(-1, plot.getIndexOf(new DefaultXYItemRenderer()));
    }

    @Test
    public void testGetRendererForDataset() {
        XYPlot plot = new XYPlot();
        XYDataset d0 = createSampleDataset();
        XYDataset d1 = createSampleDataset();
        plot.setDataset(0, d0);
        plot.setDataset(1, d1);

        XYItemRenderer r0 = new StandardXYItemRenderer();
        plot.setRenderer(0, r0);

        Assert.assertEquals(r0, plot.getRendererForDataset(d0));
        Assert.assertEquals(r0, plot.getRendererForDataset(d1));
        Assert.assertNull(plot.getRendererForDataset(createSampleDataset()));
    }

    @Test
    public void testRenderingOrders() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        Assert.assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());

        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        Assert.assertEquals(SeriesRenderingOrder.FORWARD, plot.getSeriesRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrder_null() {
        new XYPlot().setDatasetRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesRenderingOrder_null() {
        new XYPlot().setSeriesRenderingOrder(null);
    }

    @Test
    public void testWeight() {
        XYPlot plot = new XYPlot();
        plot.setWeight(3);
        Assert.assertEquals(3, plot.getWeight());
    }

    @Test
    public void testGridlineProperties() {
        XYPlot plot = new XYPlot();
        Stroke stroke = new BasicStroke(2.0f);
        Paint paint = Color.red;

        plot.setDomainGridlinesVisible(false);
        Assert.assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlineStroke(stroke);
        Assert.assertEquals(stroke, plot.getDomainGridlineStroke());
        plot.setDomainGridlinePaint(paint);
        Assert.assertEquals(paint, plot.getDomainGridlinePaint());

        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlineStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeGridlineStroke());
        plot.setRangeGridlinePaint(paint);
        Assert.assertEquals(paint, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStroke_null() {
        new XYPlot().setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaint_null() {
        new XYPlot().setDomainGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStroke_null() {
        new XYPlot().setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaint_null() {
        new XYPlot().setRangeGridlinePaint(null);
    }

    @Test
    public void testZeroBaselineProperties() {
        XYPlot plot = new XYPlot();
        Stroke stroke = new BasicStroke(1.5f);
        Paint paint = Color.green;

        plot.setDomainZeroBaselineVisible(true);
        Assert.assertTrue(plot.isDomainZeroBaselineVisible());
        plot.setDomainZeroBaselineStroke(stroke);
        Assert.assertEquals(stroke, plot.getDomainZeroBaselineStroke());
        plot.setDomainZeroBaselinePaint(paint);
        Assert.assertEquals(paint, plot.getDomainZeroBaselinePaint());

        plot.setRangeZeroBaselineVisible(true);
        Assert.assertTrue(plot.isRangeZeroBaselineVisible());
        plot.setRangeZeroBaselineStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeZeroBaselineStroke());
        plot.setRangeZeroBaselinePaint(paint);
        Assert.assertEquals(paint, plot.getRangeZeroBaselinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselineStroke_null() {
        new XYPlot().setDomainZeroBaselineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselinePaint_null() {
        new XYPlot().setDomainZeroBaselinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselineStroke_null() {
        new XYPlot().setRangeZeroBaselineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselinePaint_null() {
        new XYPlot().setRangeZeroBaselinePaint(null);
    }

    @Test
    public void testCrosshairProperties() {
        XYPlot plot = new XYPlot();
        Stroke stroke = new BasicStroke(1.2f);
        Paint paint = Color.cyan;

        plot.setDomainCrosshairVisible(true);
        Assert.assertTrue(plot.isDomainCrosshairVisible());
        plot.setDomainCrosshairValue(15.5);
        Assert.assertEquals(15.5, plot.getDomainCrosshairValue(), 0.0001);
        plot.setDomainCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isDomainCrosshairLockedOnData());
        plot.setDomainCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getDomainCrosshairStroke());
        plot.setDomainCrosshairPaint(paint);
        Assert.assertEquals(paint, plot.getDomainCrosshairPaint());

        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairValue(25.5);
        Assert.assertEquals(25.5, plot.getRangeCrosshairValue(), 0.0001);
        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeCrosshairStroke());
        plot.setRangeCrosshairPaint(paint);
        Assert.assertEquals(paint, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairStroke_null() {
        new XYPlot().setDomainCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairPaint_null() {
        new XYPlot().setDomainCrosshairPaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStroke_null() {
        new XYPlot().setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaint_null() {
        new XYPlot().setRangeCrosshairPaint(null);
    }

    @Test
    public void testTickBandPaint() {
        XYPlot plot = new XYPlot();
        plot.setDomainTickBandPaint(Color.lightGray);
        Assert.assertEquals(Color.lightGray, plot.getDomainTickBandPaint());

        plot.setRangeTickBandPaint(Color.darkGray);
        Assert.assertEquals(Color.darkGray, plot.getRangeTickBandPaint());
    }

    @Test
    public void testQuadrantProperties() {
        XYPlot plot = new XYPlot();
        Point2D origin = new Point2D.Double(5.0, 10.0);
        plot.setQuadrantOrigin(origin);
        Assert.assertEquals(origin, plot.getQuadrantOrigin());

        plot.setQuadrantPaint(0, Color.red);
        plot.setQuadrantPaint(1, Color.green);
        plot.setQuadrantPaint(2, Color.blue);
        plot.setQuadrantPaint(3, Color.yellow);

        Assert.assertEquals(Color.red, plot.getQuadrantPaint(0));
        Assert.assertEquals(Color.green, plot.getQuadrantPaint(1));
        Assert.assertEquals(Color.blue, plot.getQuadrantPaint(2));
        Assert.assertEquals(Color.yellow, plot.getQuadrantPaint(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantOrigin_null() {
        new XYPlot().setQuadrantOrigin(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaint_outOfBoundsLow() {
        new XYPlot().getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaint_outOfBoundsHigh() {
        new XYPlot().getQuadrantPaint(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaint_outOfBounds() {
        new XYPlot().setQuadrantPaint(5, Color.red);
    }

    @Test
    public void testDomainMarkers() {
        XYPlot plot = new XYPlot();
        Marker m1 = new ValueMarker(1.0);
        Marker m2 = new ValueMarker(2.0);

        plot.addDomainMarker(m1);
        plot.addDomainMarker(m2, Layer.BACKGROUND);
        plot.addDomainMarker(1, new ValueMarker(3.0), Layer.FOREGROUND);

        Collection fgMarkers = plot.getDomainMarkers(Layer.FOREGROUND);
        Assert.assertEquals(1, fgMarkers.size());
        Collection bgMarkers = plot.getDomainMarkers(Layer.BACKGROUND);
        Assert.assertEquals(1, bgMarkers.size());
        Collection r1FgMarkers = plot.getDomainMarkers(1, Layer.FOREGROUND);
        Assert.assertEquals(1, r1FgMarkers.size());

        Assert.assertTrue(plot.removeDomainMarker(m1));
        Assert.assertTrue(plot.removeDomainMarker(m2, Layer.BACKGROUND));
        Assert.assertFalse(plot.removeDomainMarker(new ValueMarker(99.0)));

        plot.addDomainMarker(new ValueMarker(4.0));
        plot.clearDomainMarkers(0);
        Assert.assertTrue(plot.getDomainMarkers(Layer.FOREGROUND).isEmpty());

        plot.addDomainMarker(new ValueMarker(5.0));
        plot.clearDomainMarkers();
        Assert.assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testRangeMarkers() {
        XYPlot plot = new XYPlot();
        Marker m1 = new ValueMarker(10.0);
        Marker m2 = new ValueMarker(20.0);

        plot.addRangeMarker(m1);
        plot.addRangeMarker(m2, Layer.BACKGROUND);
        plot.addRangeMarker(1, new ValueMarker(30.0), Layer.FOREGROUND);

        Collection fgMarkers = plot.getRangeMarkers(Layer.FOREGROUND);
        Assert.assertEquals(1, fgMarkers.size());
        Collection bgMarkers = plot.getRangeMarkers(Layer.BACKGROUND);
        Assert.assertEquals(1, bgMarkers.size());
        Collection r1FgMarkers = plot.getRangeMarkers(1, Layer.FOREGROUND);
        Assert.assertEquals(1, r1FgMarkers.size());

        Assert.assertTrue(plot.removeRangeMarker(m1));
        Assert.assertTrue(plot.removeRangeMarker(m2, Layer.BACKGROUND));
        Assert.assertFalse(plot.removeRangeMarker(new ValueMarker(99.0)));

        plot.addRangeMarker(new ValueMarker(40.0));
        plot.clearRangeMarkers(0);
        Assert.assertTrue(plot.getRangeMarkers(Layer.FOREGROUND).isEmpty());

        plot.addRangeMarker(new ValueMarker(50.0));
        plot.clearRangeMarkers();
        Assert.assertNull(plot.getRangeMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testAnnotations() {
        XYPlot plot = new XYPlot();
        XYAnnotation a1 = new XYTextAnnotation("Text 1", 1.0, 2.0);
        XYAnnotation a2 = new XYTextAnnotation("Text 2", 3.0, 4.0);

        plot.addAnnotation(a1);
        plot.addAnnotation(a2, false);

        List annotations = plot.getAnnotations();
        Assert.assertEquals(2, annotations.size());
        Assert.assertTrue(annotations.contains(a1));

        Assert.assertTrue(plot.removeAnnotation(a1));
        Assert.assertFalse(plot.removeAnnotation(new XYTextAnnotation("Not Added", 0, 0)));

        plot.clearAnnotations();
        Assert.assertEquals(0, plot.getAnnotations().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_null() {
        new XYPlot().addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotation_null() {
        new XYPlot().removeAnnotation(null);
    }

    @Test
    public void testFixedAxisSpace() {
        XYPlot plot = new XYPlot();
        AxisSpace domainSpace = new AxisSpace();
        domainSpace.setTop(10.0);
        domainSpace.setBottom(10.0);
        plot.setFixedDomainAxisSpace(domainSpace);
        Assert.assertEquals(domainSpace, plot.getFixedDomainAxisSpace());

        AxisSpace rangeSpace = new AxisSpace();
        rangeSpace.setLeft(15.0);
        rangeSpace.setRight(15.0);
        plot.setFixedRangeAxisSpace(rangeSpace);
        Assert.assertEquals(rangeSpace, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testZooming() {
        XYPlot plot = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new DefaultXYItemRenderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 200, 200));

        Assert.assertTrue(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());

        plot.zoomDomainAxes(0.5, info, new Point(50, 50));
        plot.zoomDomainAxes(0.5, info, new Point(50, 50), true);
        plot.zoomDomainAxes(0.1, 0.9, info, new Point(50, 50));

        plot.zoomRangeAxes(0.5, info, new Point(50, 50));
        plot.zoomRangeAxes(0.5, info, new Point(50, 50), true);
        plot.zoomRangeAxes(0.1, 0.9, info, new Point(50, 50));

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.zoomDomainAxes(0.5, info, new Point(50, 50), true);
        plot.zoomRangeAxes(0.5, info, new Point(50, 50), true);
    }

    @Test
    public void testSeriesCountAndLegends() {
        XYPlot plot = new XYPlot();
        Assert.assertEquals(0, plot.getSeriesCount());

        XYDataset dataset = createSampleDataset();
        plot.setDataset(dataset);
        plot.setRenderer(new XYLineAndShapeRenderer());
        Assert.assertEquals(1, plot.getSeriesCount());

        LegendItemCollection legendItems = plot.getLegendItems();
        Assert.assertEquals(1, legendItems.get(0).getSeriesIndex());

        LegendItemCollection fixedLegends = new LegendItemCollection();
        fixedLegends.add(new LegendItem("Fixed"));
        plot.setFixedLegendItems(fixedLegends);
        Assert.assertEquals(fixedLegends, plot.getFixedLegendItems());
        Assert.assertEquals(fixedLegends, plot.getLegendItems());
    }

    @Test
    public void testGetDataRange() {
        XYPlot plot = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new DefaultXYItemRenderer());
        Range xRange = plot.getDataRange(plot.getDomainAxis());
        Assert.assertNotNull(xRange);
        Assert.assertEquals(1.0, xRange.getLowerBound(), 0.0001);
        Assert.assertEquals(3.0, xRange.getUpperBound(), 0.0001);

        Range yRange = plot.getDataRange(plot.getRangeAxis());
        Assert.assertNotNull(yRange);
        Assert.assertEquals(1.0, yRange.getLowerBound(), 0.0001);
        Assert.assertEquals(3.0, yRange.getUpperBound(), 0.0001);

        Assert.assertNull(plot.getDataRange(new NumberAxis("Unrelated")));
    }

    @Test
    public void testHandleClick() {
        XYPlot plot = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new DefaultXYItemRenderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(10, 10, 100, 100));

        plot.handleClick(50, 50, info);
        plot.handleClick(0, 0, info);
    }

    @Test
    public void testEvents() {
        XYPlot plot = new XYPlot();
        plot.addChangeListener(this);

        this.plotChanged = false;
        plot.rendererChanged(new RendererChangeEvent(new DefaultXYItemRenderer()));
        Assert.assertTrue(this.plotChanged);

        this.plotChanged = false;
        plot.datasetChanged(new DatasetChangeEvent(this, createSampleDataset()));
        Assert.assertTrue(this.plotChanged);
    }

    @Test
    public void testDrawCoverage() {
        XYDataset dataset = createSampleDataset();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);
        plot.setDomainZeroBaselineVisible(true);
        plot.setRangeZeroBaselineVisible(true);
        plot.setDomainTickBandPaint(new Color(240, 240, 240));
        plot.setRangeTickBandPaint(new Color(240, 240, 240));
        plot.setQuadrantPaint(0, new Color(255, 200, 200));
        plot.setQuadrantPaint(1, new Color(200, 255, 200));
        plot.setQuadrantPaint(2, new Color(200, 200, 255));
        plot.setQuadrantPaint(3, new Color(255, 255, 200));
        plot.addDomainMarker(new ValueMarker(2.0), Layer.FOREGROUND);
        plot.addDomainMarker(new ValueMarker(1.5), Layer.BACKGROUND);
        plot.addRangeMarker(new ValueMarker(2.0), Layer.FOREGROUND);
        plot.addRangeMarker(new ValueMarker(1.5), Layer.BACKGROUND);
        plot.addAnnotation(new XYTextAnnotation("Test", 2.0, 2.0));

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);

        plot.draw(g2, area, new Point2D.Double(150, 150), null, info);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        plot.draw(g2, area, new Point2D.Double(150, 150), null, info);

        // Draw empty area
        plot.draw(g2, new Rectangle2D.Double(0, 0, 5, 5), null, null, info);

        // Draw without data
        XYPlot emptyPlot = new XYPlot(new XYSeriesCollection(), xAxis, yAxis, renderer);
        emptyPlot.draw(g2, area, null, null, info);

        g2.dispose();
    }

    @Test
    public void testEqualsAndHashCode() {
        XYPlot p1 = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new DefaultXYItemRenderer());
        XYPlot p2 = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new DefaultXYItemRenderer());

        Assert.assertTrue(p1.equals(p1));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("Not a plot"));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));

        p2.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(p1.equals(p2));
        p2.setOrientation(PlotOrientation.VERTICAL);

        p2.setWeight(5);
        Assert.assertFalse(p1.equals(p2));
        p2.setWeight(1);

        p2.setDomainGridlinesVisible(false);
        Assert.assertFalse(p1.equals(p2));
        p2.setDomainGridlinesVisible(true);

        p2.setRangeCrosshairValue(99.0);
        Assert.assertFalse(p1.equals(p2));
    }

    @Test
    public void testCloning() throws Exception {
        XYPlot p1 = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new DefaultXYItemRenderer());
        p1.setFixedDomainAxisSpace(new AxisSpace());
        p1.setFixedRangeAxisSpace(new AxisSpace());
        p1.addAnnotation(new XYTextAnnotation("A", 1, 1));

        XYPlot p2 = (XYPlot) p1.clone();
        Assert.assertNotSame(p1, p2);
        Assert.assertSame(p1.getClass(), p2.getClass());
        Assert.assertEquals(p1, p2);

        p2.getDomainAxis().setLabel("Modified X");
        Assert.assertFalse(p1.getDomainAxis().getLabel().equals(p2.getDomainAxis().getLabel()));
    }

    @Test
    public void testSerialization() throws Exception {
        XYPlot p1 = new XYPlot(createSampleDataset(), new NumberAxis("X"), new NumberAxis("Y"), new DefaultXYItemRenderer());
        p1.setQuadrantPaint(0, Color.red);
        p1.setDomainTickBandPaint(Color.blue);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(p1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        XYPlot p2 = (XYPlot) in.readObject();
        in.close();

        Assert.assertEquals(p1, p2);
    }
}
