package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
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
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetChangeEvent;
import org.junit.Before;
import org.junit.Test;

public class CategoryPlotTest {

    private CategoryPlot plot;
    private DefaultCategoryDataset dataset;
    private CategoryAxis domainAxis;
    private ValueAxis rangeAxis;
    private CategoryItemRenderer renderer;

    @Before
    public void setUp() {
        this.dataset = new DefaultCategoryDataset();
        this.dataset.addValue(1.0, "S1", "C1");
        this.dataset.addValue(2.0, "S1", "C2");
        this.dataset.addValue(3.0, "S2", "C1");
        this.dataset.addValue(4.0, "S2", "C2");

        this.domainAxis = new CategoryAxis("Domain");
        this.rangeAxis = new NumberAxis("Range");
        this.renderer = new BarRenderer();

        this.plot = new CategoryPlot(this.dataset, this.domainAxis, this.rangeAxis, this.renderer);
    }

    @Test
    public void testConstructors() {
        CategoryPlot emptyPlot = new CategoryPlot();
        assertEquals("Category Plot", emptyPlot.getPlotType());
        assertNull(emptyPlot.getDataset());
        assertNull(emptyPlot.getDomainAxis());
        assertNull(emptyPlot.getRangeAxis());
        assertNull(emptyPlot.getRenderer());

        assertEquals("Category Plot", this.plot.getPlotType());
        assertSame(this.dataset, this.plot.getDataset());
        assertSame(this.domainAxis, this.plot.getDomainAxis());
        assertSame(this.rangeAxis, this.plot.getRangeAxis());
        assertSame(this.renderer, this.plot.getRenderer());
    }

    @Test
    public void testOrientation() {
        assertEquals(PlotOrientation.VERTICAL, this.plot.getOrientation());
        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, this.plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientation_null_throwsException() {
        this.plot.setOrientation(null);
    }

    @Test
    public void testAxisOffset() {
        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        this.plot.setAxisOffset(insets);
        assertEquals(insets, this.plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffset_null_throwsException() {
        this.plot.setAxisOffset(null);
    }

    @Test
    public void testDomainAxis() {
        CategoryAxis axis2 = new CategoryAxis("Domain 2");
        this.plot.setDomainAxis(axis2);
        assertSame(axis2, this.plot.getDomainAxis(0));

        CategoryAxis axis3 = new CategoryAxis("Domain 3");
        this.plot.setDomainAxis(1, axis3);
        assertSame(axis3, this.plot.getDomainAxis(1));
        assertEquals(2, this.plot.getDomainAxisCount());

        this.plot.setDomainAxes(new CategoryAxis[] {axis2, axis3});
        assertEquals(0, this.plot.getDomainAxisIndex(axis2));
        assertEquals(1, this.plot.getDomainAxisIndex(axis3));
        assertEquals(-1, this.plot.getDomainAxisIndex(new CategoryAxis("Other")));

        this.plot.clearDomainAxes();
        assertEquals(0, this.plot.getDomainAxisCount());
        assertNull(this.plot.getDomainAxis(0));
    }

    @Test
    public void testDomainAxis_fromParent() {
        CategoryPlot parent = new CategoryPlot();
        CategoryAxis parentDomain = new CategoryAxis("Parent Domain");
        parent.setDomainAxis(parentDomain);

        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);
        assertSame(parentDomain, child.getDomainAxis(0));
    }

    @Test
    public void testDomainAxisLocation() {
        this.plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, this.plot.getDomainAxisLocation());
        assertEquals(RectangleEdge.TOP, this.plot.getDomainAxisEdge());

        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.RIGHT, this.plot.getDomainAxisEdge());

        this.plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT, true);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, this.plot.getDomainAxisLocation(1));

        this.plot.setDomainAxisLocation(2, null, false);
        assertEquals(AxisLocation.TOP_OR_RIGHT, this.plot.getDomainAxisLocation(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation_index0Null_throwsException() {
        this.plot.setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testRangeAxis() {
        ValueAxis axis2 = new NumberAxis("Range 2");
        this.plot.setRangeAxis(axis2);
        assertSame(axis2, this.plot.getRangeAxis(0));

        ValueAxis axis3 = new NumberAxis("Range 3");
        this.plot.setRangeAxis(1, axis3);
        assertSame(axis3, this.plot.getRangeAxis(1));
        assertEquals(2, this.plot.getRangeAxisCount());

        this.plot.setRangeAxes(new ValueAxis[] {axis2, axis3});
        assertEquals(0, this.plot.getRangeAxisIndex(axis2));
        assertEquals(1, this.plot.getRangeAxisIndex(axis3));
        assertEquals(-1, this.plot.getRangeAxisIndex(new NumberAxis("Other")));

        this.plot.clearRangeAxes();
        assertEquals(0, this.plot.getRangeAxisCount());
        assertNull(this.plot.getRangeAxis(0));
    }

    @Test
    public void testRangeAxis_fromParent() {
        CategoryPlot parent = new CategoryPlot();
        ValueAxis parentRange = new NumberAxis("Parent Range");
        parent.setRangeAxis(parentRange);

        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);
        assertSame(parentRange, child.getRangeAxis(0));
        assertEquals(0, child.getRangeAxisIndex(parentRange));
    }

    @Test
    public void testRangeAxisLocation() {
        this.plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, this.plot.getRangeAxisLocation());
        assertEquals(RectangleEdge.RIGHT, this.plot.getRangeAxisEdge());

        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.BOTTOM, this.plot.getRangeAxisEdge());

        this.plot.setRangeAxisLocation(1, AxisLocation.TOP_OR_LEFT, true);
        assertEquals(AxisLocation.TOP_OR_LEFT, this.plot.getRangeAxisLocation(1));

        this.plot.setRangeAxisLocation(2, null, false);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, this.plot.getRangeAxisLocation(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocation_index0Null_throwsException() {
        this.plot.setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testDatasetAndMapping() {
        DefaultCategoryDataset ds2 = new DefaultCategoryDataset();
        this.plot.setDataset(1, ds2);
        assertSame(ds2, this.plot.getDataset(1));
        assertEquals(2, this.plot.getDatasetCount());

        this.plot.mapDatasetToDomainAxis(1, 0);
        assertSame(this.domainAxis, this.plot.getDomainAxisForDataset(1));

        this.plot.mapDatasetToRangeAxis(1, 0);
        assertSame(this.rangeAxis, this.plot.getRangeAxisForDataset(1));

        assertNull(this.plot.getDataset(5));
    }

    @Test
    public void testRenderer() {
        CategoryItemRenderer r2 = new LineAndShapeRenderer();
        this.plot.setRenderer(1, r2);
        assertSame(r2, this.plot.getRenderer(1));
        assertEquals(1, this.plot.getIndexOf(r2));
        assertEquals(-1, this.plot.getIndexOf(new BarRenderer()));

        this.plot.setRenderers(new CategoryItemRenderer[] {this.renderer, r2});
        assertSame(this.renderer, this.plot.getRendererForDataset(this.dataset));
        assertNull(this.plot.getRendererForDataset(new DefaultCategoryDataset()));

        this.plot.setRenderer(null);
        assertNull(this.plot.getRenderer(0));
    }

    @Test
    public void testRenderingOrders() {
        this.plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, this.plot.getDatasetRenderingOrder());

        this.plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, this.plot.getColumnRenderingOrder());

        this.plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, this.plot.getRowRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrder_null_throwsException() {
        this.plot.setDatasetRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColumnRenderingOrder_null_throwsException() {
        this.plot.setColumnRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRowRenderingOrder_null_throwsException() {
        this.plot.setRowRenderingOrder(null);
    }

    @Test
    public void testDomainGridlines() {
        this.plot.setDomainGridlinesVisible(true);
        assertTrue(this.plot.isDomainGridlinesVisible());

        this.plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertEquals(CategoryAnchor.START, this.plot.getDomainGridlinePosition());

        Stroke s = new BasicStroke(1.5f);
        this.plot.setDomainGridlineStroke(s);
        assertEquals(s, this.plot.getDomainGridlineStroke());

        Paint p = Color.RED;
        this.plot.setDomainGridlinePaint(p);
        assertEquals(p, this.plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePosition_null_throwsException() {
        this.plot.setDomainGridlinePosition(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStroke_null_throwsException() {
        this.plot.setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaint_null_throwsException() {
        this.plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testRangeGridlines() {
        this.plot.setRangeGridlinesVisible(false);
        assertFalse(this.plot.isRangeGridlinesVisible());

        Stroke s = new BasicStroke(1.5f);
        this.plot.setRangeGridlineStroke(s);
        assertEquals(s, this.plot.getRangeGridlineStroke());

        Paint p = Color.BLUE;
        this.plot.setRangeGridlinePaint(p);
        assertEquals(p, this.plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStroke_null_throwsException() {
        this.plot.setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaint_null_throwsException() {
        this.plot.setRangeGridlinePaint(null);
    }

    @Test
    public void testLegendItems() {
        LegendItemCollection lic = this.plot.getLegendItems();
        assertNotNull(lic);
        assertEquals(2, lic.getItemCount());

        LegendItemCollection fixed = new LegendItemCollection();
        fixed.add(new LegendItem("Test"));
        this.plot.setFixedLegendItems(fixed);
        assertSame(fixed, this.plot.getFixedLegendItems());
        assertSame(fixed, this.plot.getLegendItems());
    }

    @Test
    public void testHandleClickAndAnchor() {
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(10, 10, 100, 100));

        this.plot.setAnchorValue(5.0);
        assertEquals(5.0, this.plot.getAnchorValue(), 0.001);

        this.plot.handleClick(50, 50, info);
        assertNotEquals(5.0, this.plot.getAnchorValue(), 0.001);

        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.plot.handleClick(50, 50, info);

        // Click outside data area
        double currentAnchor = this.plot.getAnchorValue();
        this.plot.handleClick(5, 5, info);
        assertEquals(currentAnchor, this.plot.getAnchorValue(), 0.001);
    }

    @Test
    public void testZoom() {
        this.plot.setAnchorValue(2.5);
        this.plot.zoom(0.5);
        Range range = this.plot.getRangeAxis().getRange();
        assertEquals(2.5, range.getCentralValue(), 0.001);

        this.plot.zoom(0.0);
        assertTrue(this.plot.getRangeAxis().isAutoRange());
    }

    @Test
    public void testZoomableInterface() {
        assertFalse(this.plot.isDomainZoomable());
        assertTrue(this.plot.isRangeZoomable());

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        Point2D p = new Point2D.Double(50, 50);

        this.plot.zoomDomainAxes(0.5, info, p);
        this.plot.zoomDomainAxes(0.1, 0.9, info, p);
        this.plot.zoomDomainAxes(0.5, info, p, true);

        this.plot.zoomRangeAxes(0.5, info, p);
        this.plot.zoomRangeAxes(0.5, info, p, true);
        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.plot.zoomRangeAxes(0.5, info, p, true);
        this.plot.zoomRangeAxes(0.1, 0.9, info, p);
    }

    @Test
    public void testDatasetAndRendererChangedEvents() {
        final boolean[] flag = new boolean[1];
        PlotChangeListener listener = new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                flag[0] = true;
            }
        };
        this.plot.addChangeListener(listener);

        flag[0] = false;
        this.plot.datasetChanged(new DatasetChangeEvent(this.dataset, this.dataset));
        assertTrue(flag[0]);

        flag[0] = false;
        this.plot.rendererChanged(new RendererChangeEvent(this.renderer));
        assertTrue(flag[0]);
    }

    @Test
    public void testDatasetAndRendererChanged_withParent() {
        CategoryPlot parent = new CategoryPlot();
        final boolean[] parentFlag = new boolean[1];
        parent.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                parentFlag[0] = true;
            }
        });
        this.plot.setParent(parent);

        parentFlag[0] = false;
        this.plot.datasetChanged(new DatasetChangeEvent(this.dataset, this.dataset));
        assertTrue(parentFlag[0]);

        parentFlag[0] = false;
        this.plot.rendererChanged(new RendererChangeEvent(this.renderer));
        assertTrue(parentFlag[0]);
    }

    @Test
    public void testDomainMarkers() {
        CategoryMarker marker1 = new CategoryMarker("C1");
        CategoryMarker marker2 = new CategoryMarker("C2");

        this.plot.addDomainMarker(marker1);
        this.plot.addDomainMarker(marker2, Layer.BACKGROUND);
        this.plot.addDomainMarker(1, new CategoryMarker("C3"), Layer.FOREGROUND);

        Collection fgMarkers = this.plot.getDomainMarkers(Layer.FOREGROUND);
        assertEquals(1, fgMarkers.size());
        assertTrue(fgMarkers.contains(marker1));

        Collection bgMarkers = this.plot.getDomainMarkers(0, Layer.BACKGROUND);
        assertEquals(1, bgMarkers.size());
        assertTrue(bgMarkers.contains(marker2));

        this.plot.clearDomainMarkers(0);
        assertNull(this.plot.getDomainMarkers(0, Layer.FOREGROUND));

        this.plot.addDomainMarker(marker1);
        this.plot.clearDomainMarkers();
        assertNull(this.plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_nullMarker_throwsException() {
        this.plot.addDomainMarker(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_nullLayer_throwsException() {
        this.plot.addDomainMarker(new CategoryMarker("C1"), null);
    }

    @Test
    public void testRangeMarkers() {
        ValueMarker marker1 = new ValueMarker(1.5);
        ValueMarker marker2 = new ValueMarker(2.5);

        this.plot.addRangeMarker(marker1);
        this.plot.addRangeMarker(marker2, Layer.BACKGROUND);
        this.plot.addRangeMarker(1, new ValueMarker(3.5), Layer.FOREGROUND);

        Collection fgMarkers = this.plot.getRangeMarkers(Layer.FOREGROUND);
        assertEquals(1, fgMarkers.size());
        assertTrue(fgMarkers.contains(marker1));

        Collection bgMarkers = this.plot.getRangeMarkers(0, Layer.BACKGROUND);
        assertTrue(bgMarkers.contains(marker2));

        this.plot.clearRangeMarkers(0);
        assertNull(this.plot.getRangeMarkers(0, Layer.FOREGROUND));

        this.plot.addRangeMarker(marker1);
        this.plot.clearRangeMarkers();
        assertNull(this.plot.getRangeMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testCrosshairs() {
        this.plot.setRangeCrosshairVisible(true);
        assertTrue(this.plot.isRangeCrosshairVisible());

        this.plot.setRangeCrosshairLockedOnData(false);
        assertFalse(this.plot.isRangeCrosshairLockedOnData());

        this.plot.setRangeCrosshairValue(2.0, true);
        assertEquals(2.0, this.plot.getRangeCrosshairValue(), 0.001);

        Stroke s = new BasicStroke(2.0f);
        this.plot.setRangeCrosshairStroke(s);
        assertEquals(s, this.plot.getRangeCrosshairStroke());

        Paint p = Color.GREEN;
        this.plot.setRangeCrosshairPaint(p);
        assertEquals(p, this.plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStroke_null_throwsException() {
        this.plot.setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaint_null_throwsException() {
        this.plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void testAnnotations() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Text", "C1", 2.0);
        this.plot.addAnnotation(annotation);
        assertEquals(1, this.plot.getAnnotations().size());
        assertTrue(this.plot.getAnnotations().contains(annotation));

        assertTrue(this.plot.removeAnnotation(annotation));
        assertFalse(this.plot.removeAnnotation(annotation));
        assertEquals(0, this.plot.getAnnotations().size());

        this.plot.addAnnotation(annotation);
        this.plot.clearAnnotations();
        assertEquals(0, this.plot.getAnnotations().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_null_throwsException() {
        this.plot.addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotation_null_throwsException() {
        this.plot.removeAnnotation(null);
    }

    @Test
    public void testSpaceCalculationAndAxisSpaces() {
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);

        AxisSpace space = this.plot.calculateAxisSpace(g2, area);
        assertNotNull(space);

        AxisSpace fixedDomain = new AxisSpace();
        fixedDomain.setLeft(20);
        fixedDomain.setRight(20);
        this.plot.setFixedDomainAxisSpace(fixedDomain);
        assertSame(fixedDomain, this.plot.getFixedDomainAxisSpace());

        AxisSpace fixedRange = new AxisSpace();
        fixedRange.setTop(15);
        fixedRange.setBottom(15);
        this.plot.setFixedRangeAxisSpace(fixedRange);
        assertSame(fixedRange, this.plot.getFixedRangeAxisSpace());

        space = this.plot.calculateAxisSpace(g2, area);
        assertNotNull(space);

        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        space = this.plot.calculateAxisSpace(g2, area);
        assertNotNull(space);

        this.plot.setDrawSharedDomainAxis(true);
        assertTrue(this.plot.getDrawSharedDomainAxis());
    }

    @Test
    public void testDrawMethods() {
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);

        // Standard draw
        this.plot.draw(g2, area, new Point2D.Double(50, 50), null, new PlotRenderingInfo(null));

        // Draw with area too small
        this.plot.draw(g2, new Rectangle2D.Double(0, 0, 5, 5), null, null, null);

        // Draw horizontal, forward order, with crosshair & gridlines visible
        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        this.plot.setDomainGridlinesVisible(true);
        this.plot.setRangeCrosshairVisible(true);
        this.plot.setRangeCrosshairValue(2.0);
        this.plot.addDomainMarker(new CategoryMarker("C1"));
        this.plot.addRangeMarker(new ValueMarker(2.0));
        this.plot.addAnnotation(new CategoryTextAnnotation("Note", "C1", 2.0));

        this.plot.draw(g2, area, null, null, null);

        // Draw without renderer (coverage for fallback branch)
        this.plot.setRenderer(null);
        this.plot.draw(g2, area, null, null, null);

        // Draw empty dataset
        this.plot.setDataset(null);
        this.plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawRangeLine() {
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(10, 10, 380, 280);

        this.plot.setOrientation(PlotOrientation.VERTICAL);
        this.plot.drawRangeLine(g2, area, 2.0, new BasicStroke(1.0f), Color.BLACK);

        this.plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.plot.drawRangeLine(g2, area, 2.0, new BasicStroke(1.0f), Color.BLACK);
    }

    @Test
    public void testGetDataRange() {
        Range r = this.plot.getDataRange(this.rangeAxis);
        assertNotNull(r);
        assertEquals(1.0, r.getLowerBound(), 0.001);
        assertEquals(4.0, r.getUpperBound(), 0.001);

        assertNull(this.plot.getDataRange(new NumberAxis("Unmapped")));

        this.plot.setDataset(null);
        assertNull(this.plot.getDataRange(this.rangeAxis));
    }

    @Test
    public void testCategoriesAndWeight() {
        List categories = this.plot.getCategories();
        assertNotNull(categories);
        assertEquals(2, categories.size());

        List axisCategories = this.plot.getCategoriesForAxis(this.domainAxis);
        assertEquals(2, axisCategories.size());

        this.plot.setWeight(3);
        assertEquals(3, this.plot.getWeight());
    }

    @Test
    public void testEqualsAndHashCode() {
        CategoryPlot p1 = new CategoryPlot(this.dataset, this.domainAxis, this.rangeAxis, this.renderer);
        CategoryPlot p2 = new CategoryPlot(this.dataset, this.domainAxis, this.rangeAxis, this.renderer);

        assertTrue(p1.equals(p1));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("Not a Plot"));
        assertTrue(p1.equals(p2));

        p2.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(p1.equals(p2));
        p2.setOrientation(PlotOrientation.VERTICAL);

        p2.setAxisOffset(new RectangleInsets(10, 10, 10, 10));
        assertFalse(p1.equals(p2));
        p2.setAxisOffset(p1.getAxisOffset());

        p2.setDomainGridlinesVisible(true);
        assertFalse(p1.equals(p2));
        p2.setDomainGridlinesVisible(p1.isDomainGridlinesVisible());

        p2.setRangeGridlinesVisible(false);
        assertFalse(p1.equals(p2));
        p2.setRangeGridlinesVisible(p1.isRangeGridlinesVisible());

        p2.setAnchorValue(10.0);
        assertFalse(p1.equals(p2));
        p2.setAnchorValue(p1.getAnchorValue());

        p2.setWeight(5);
        assertFalse(p1.equals(p2));
        p2.setWeight(p1.getWeight());
    }

    @Test
    public void testCloning() throws Exception {
        CategoryPlot p1 = new CategoryPlot(this.dataset, this.domainAxis, this.rangeAxis, this.renderer);
        p1.setFixedDomainAxisSpace(new AxisSpace());
        p1.setFixedRangeAxisSpace(new AxisSpace());

        CategoryPlot p2 = (CategoryPlot) p1.clone();

        assertNotSame(p1, p2);
        assertSame(p1.getClass(), p2.getClass());
        assertTrue(p1.equals(p2));

        p2.setWeight(99);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testSerialization() throws Exception {
        CategoryPlot p1 = new CategoryPlot(this.dataset, this.domainAxis, this.rangeAxis, this.renderer);
        p1.setRangeCrosshairVisible(true);
        p1.setRangeCrosshairValue(2.5);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(p1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        CategoryPlot p2 = (CategoryPlot) in.readObject();
        in.close();

        assertEquals(p1, p2);
        assertEquals(p1.getRangeCrosshairValue(), p2.getRangeCrosshairValue(), 0.001);
    }
}
