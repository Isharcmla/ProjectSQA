package org.jfree.chart.plot;

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
import org.junit.Assert;
import org.junit.Test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
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

public class CategoryPlotTest {

    private static class TestPlotListener implements PlotChangeListener {
        int eventCount = 0;
        PlotChangeEvent lastEvent;

        public void plotChanged(PlotChangeEvent event) {
            this.eventCount++;
            this.lastEvent = event;
        }
    }

    private DefaultCategoryDataset createSampleDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series 1", "Category 1");
        dataset.addValue(2.0, "Series 1", "Category 2");
        dataset.addValue(3.0, "Series 2", "Category 1");
        dataset.addValue(4.0, "Series 2", "Category 2");
        return dataset;
    }

    @Test
    public void testDefaultConstructor() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getRenderer());
        Assert.assertEquals("Category Plot", plot.getPlotType());
    }

    @Test
    public void testParameterizedConstructor() {
        DefaultCategoryDataset dataset = createSampleDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        BarRenderer renderer = new BarRenderer();

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        Assert.assertEquals(dataset, plot.getDataset());
        Assert.assertEquals(domainAxis, plot.getDomainAxis());
        Assert.assertEquals(rangeAxis, plot.getRangeAxis());
        Assert.assertEquals(renderer, plot.getRenderer());
        Assert.assertEquals(plot, domainAxis.getPlot());
        Assert.assertEquals(plot, rangeAxis.getPlot());
        Assert.assertEquals(plot, renderer.getPlot());
    }

    @Test
    public void testOrientation() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        Assert.assertEquals(1, listener.eventCount);

        plot.setOrientation(PlotOrientation.VERTICAL);
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientation_nullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(null);
    }

    @Test
    public void testAxisOffset() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        plot.setAxisOffset(insets);
        Assert.assertEquals(insets, plot.getAxisOffset());
        Assert.assertEquals(1, listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffset_nullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testDomainAxisGetAndSet() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        CategoryAxis axis1 = new CategoryAxis("Axis1");
        CategoryAxis axis2 = new CategoryAxis("Axis2");

        plot.setDomainAxis(axis1);
        Assert.assertEquals(axis1, plot.getDomainAxis());
        Assert.assertEquals(axis1, plot.getDomainAxis(0));
        Assert.assertEquals(0, plot.getDomainAxisIndex(axis1));
        Assert.assertEquals(plot, axis1.getPlot());

        plot.setDomainAxis(1, axis2);
        Assert.assertEquals(axis2, plot.getDomainAxis(1));
        Assert.assertEquals(1, plot.getDomainAxisIndex(axis2));
        Assert.assertEquals(2, plot.getDomainAxisCount());

        plot.setDomainAxis(0, null, true);
        Assert.assertNull(plot.getDomainAxis(0));

        plot.setDomainAxes(new CategoryAxis[]{axis1, axis2});
        Assert.assertEquals(axis1, plot.getDomainAxis(0));
        Assert.assertEquals(axis2, plot.getDomainAxis(1));

        plot.clearDomainAxes();
        Assert.assertEquals(0, plot.getDomainAxisCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisIndex_nullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.getDomainAxisIndex(null);
    }

    @Test
    public void testDomainAxisParentDelegation() {
        CategoryPlot parent = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("ParentDomain");
        parent.setDomainAxis(0, axis);

        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);
        child.setDomainAxis(0, null);

        Assert.assertEquals(axis, child.getDomainAxis(0));
    }

    @Test
    public void testDomainAxisLocationAndEdge() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        Assert.assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation(0));
        Assert.assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT, true);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation(1));

        plot.setDomainAxisLocation(2, null, false);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation_index0NullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, null, false);
    }

    @Test
    public void testRangeAxisGetAndSet() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        NumberAxis axis1 = new NumberAxis("Axis1");
        NumberAxis axis2 = new NumberAxis("Axis2");

        plot.setRangeAxis(axis1);
        Assert.assertEquals(axis1, plot.getRangeAxis());
        Assert.assertEquals(axis1, plot.getRangeAxis(0));
        Assert.assertEquals(0, plot.getRangeAxisIndex(axis1));
        Assert.assertEquals(plot, axis1.getPlot());

        plot.setRangeAxis(1, axis2);
        Assert.assertEquals(axis2, plot.getRangeAxis(1));
        Assert.assertEquals(1, plot.getRangeAxisIndex(axis2));
        Assert.assertEquals(2, plot.getRangeAxisCount());

        plot.setRangeAxis(0, null, true);
        Assert.assertNull(plot.getRangeAxis(0));

        plot.setRangeAxes(new ValueAxis[]{axis1, axis2});
        Assert.assertEquals(axis1, plot.getRangeAxis(0));
        Assert.assertEquals(axis2, plot.getRangeAxis(1));

        plot.clearRangeAxes();
        Assert.assertEquals(0, plot.getRangeAxisCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisIndex_nullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.getRangeAxisIndex(null);
    }

    @Test
    public void testRangeAxisParentDelegation() {
        CategoryPlot parent = new CategoryPlot();
        NumberAxis axis = new NumberAxis("ParentRange");
        parent.setRangeAxis(0, axis);

        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);
        child.setRangeAxis(0, null);

        Assert.assertEquals(axis, child.getRangeAxis(0));
        Assert.assertEquals(0, child.getRangeAxisIndex(axis));
    }

    @Test
    public void testRangeAxisLocationAndEdge() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
        Assert.assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation(0));
        Assert.assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(1, AxisLocation.TOP_OR_LEFT, true);
        Assert.assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation(1));

        plot.setRangeAxisLocation(2, null, false);
        Assert.assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocation_index0NullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, null, false);
    }

    @Test
    public void testDatasetOperations() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        DefaultCategoryDataset ds1 = createSampleDataset();
        DefaultCategoryDataset ds2 = new DefaultCategoryDataset();

        plot.setDataset(ds1);
        Assert.assertEquals(ds1, plot.getDataset());
        Assert.assertEquals(ds1, plot.getDataset(0));
        Assert.assertEquals(1, plot.getDatasetCount());

        plot.setDataset(1, ds2);
        Assert.assertEquals(ds2, plot.getDataset(1));
        Assert.assertEquals(2, plot.getDatasetCount());

        plot.setDataset(0, null);
        Assert.assertNull(plot.getDataset(0));
        Assert.assertNull(plot.getDataset(5));
    }

    @Test
    public void testDatasetAxisMapping() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domain0 = new CategoryAxis("Domain0");
        CategoryAxis domain1 = new CategoryAxis("Domain1");
        NumberAxis range0 = new NumberAxis("Range0");
        NumberAxis range1 = new NumberAxis("Range1");

        plot.setDomainAxis(0, domain0);
        plot.setDomainAxis(1, domain1);
        plot.setRangeAxis(0, range0);
        plot.setRangeAxis(1, range1);

        plot.mapDatasetToDomainAxis(0, 0);
        plot.mapDatasetToDomainAxis(1, 1);
        plot.mapDatasetToRangeAxis(0, 0);
        plot.mapDatasetToRangeAxis(1, 1);

        Assert.assertEquals(domain0, plot.getDomainAxisForDataset(0));
        Assert.assertEquals(domain1, plot.getDomainAxisForDataset(1));
        Assert.assertEquals(domain0, plot.getDomainAxisForDataset(2));

        Assert.assertEquals(range0, plot.getRangeAxisForDataset(0));
        Assert.assertEquals(range1, plot.getRangeAxisForDataset(1));
        Assert.assertEquals(range0, plot.getRangeAxisForDataset(2));
    }

    @Test
    public void testRendererOperations() {
        CategoryPlot plot = new CategoryPlot();
        BarRenderer r1 = new BarRenderer();
        LineAndShapeRenderer r2 = new LineAndShapeRenderer();
        DefaultCategoryDataset ds1 = createSampleDataset();
        DefaultCategoryDataset ds2 = new DefaultCategoryDataset();

        plot.setDataset(0, ds1);
        plot.setDataset(1, ds2);

        plot.setRenderer(r1);
        Assert.assertEquals(r1, plot.getRenderer());
        Assert.assertEquals(r1, plot.getRenderer(0));
        Assert.assertEquals(0, plot.getIndexOf(r1));
        Assert.assertEquals(r1, plot.getRendererForDataset(ds1));
        Assert.assertEquals(plot, r1.getPlot());

        plot.setRenderer(1, r2, true);
        Assert.assertEquals(r2, plot.getRenderer(1));
        Assert.assertEquals(1, plot.getIndexOf(r2));
        Assert.assertEquals(r2, plot.getRendererForDataset(ds2));

        Assert.assertNull(plot.getRenderer(5));
        Assert.assertNull(plot.getRendererForDataset(new DefaultCategoryDataset()));

        plot.setRenderers(new CategoryItemRenderer[]{r2, r1});
        Assert.assertEquals(r2, plot.getRenderer(0));
        Assert.assertEquals(r1, plot.getRenderer(1));

        plot.setRenderer(0, null, true);
        Assert.assertNull(plot.getRenderer(0));
    }

    @Test
    public void testOrderingProperties() {
        CategoryPlot plot = new CategoryPlot();

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        Assert.assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());

        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        Assert.assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());

        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        Assert.assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrder_nullThrowsException() {
        new CategoryPlot().setDatasetRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColumnRenderingOrder_nullThrowsException() {
        new CategoryPlot().setColumnRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRowRenderingOrder_nullThrowsException() {
        new CategoryPlot().setRowRenderingOrder(null);
    }

    @Test
    public void testDomainGridlineProperties() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setDomainGridlinesVisible(true);
        Assert.assertTrue(plot.isDomainGridlinesVisible());
        Assert.assertEquals(1, listener.eventCount);

        plot.setDomainGridlinesVisible(true);
        Assert.assertEquals(1, listener.eventCount);

        plot.setDomainGridlinePosition(CategoryAnchor.START);
        Assert.assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());

        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        Assert.assertEquals(stroke, plot.getDomainGridlineStroke());

        plot.setDomainGridlinePaint(Color.RED);
        Assert.assertEquals(Color.RED, plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePosition_nullThrowsException() {
        new CategoryPlot().setDomainGridlinePosition(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStroke_nullThrowsException() {
        new CategoryPlot().setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaint_nullThrowsException() {
        new CategoryPlot().setDomainGridlinePaint(null);
    }

    @Test
    public void testRangeGridlineProperties() {
        CategoryPlot plot = new CategoryPlot();
        TestPlotListener listener = new TestPlotListener();
        plot.addChangeListener(listener);

        plot.setRangeGridlinesVisible(false);
        Assert.assertFalse(plot.isRangeGridlinesVisible());
        Assert.assertEquals(1, listener.eventCount);

        plot.setRangeGridlinesVisible(false);
        Assert.assertEquals(1, listener.eventCount);

        Stroke stroke = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeGridlineStroke());

        plot.setRangeGridlinePaint(Color.GREEN);
        Assert.assertEquals(Color.GREEN, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStroke_nullThrowsException() {
        new CategoryPlot().setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaint_nullThrowsException() {
        new CategoryPlot().setRangeGridlinePaint(null);
    }

    @Test
    public void testCrosshairProperties() {
        CategoryPlot plot = new CategoryPlot();

        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairValue(12.34, true);
        Assert.assertEquals(12.34, plot.getRangeCrosshairValue(), 0.0001);

        Stroke stroke = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(Color.YELLOW);
        Assert.assertEquals(Color.YELLOW, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStroke_nullThrowsException() {
        new CategoryPlot().setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaint_nullThrowsException() {
        new CategoryPlot().setRangeCrosshairPaint(null);
    }

    @Test
    public void testLegendItems() {
        CategoryPlot plot = new CategoryPlot(createSampleDataset(), new CategoryAxis("Domain"),
                new NumberAxis("Range"), new BarRenderer());

        LegendItemCollection lic = plot.getLegendItems();
        Assert.assertNotNull(lic);
        Assert.assertEquals(2, lic.getItemCount());

        LegendItemCollection fixed = new LegendItemCollection();
        fixed.add(new LegendItem("Fixed"));
        plot.setFixedLegendItems(fixed);
        Assert.assertEquals(fixed, plot.getFixedLegendItems());
        Assert.assertEquals(fixed, plot.getLegendItems());

        plot.setFixedLegendItems(null);
        Assert.assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void testDomainMarkers() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker1 = new CategoryMarker("Category 1");
        CategoryMarker marker2 = new CategoryMarker("Category 2");

        plot.addDomainMarker(marker1);
        plot.addDomainMarker(marker2, Layer.BACKGROUND);
        plot.addDomainMarker(1, marker1, Layer.FOREGROUND);
        plot.addDomainMarker(1, marker2, Layer.BACKGROUND, true);

        Collection fg0 = plot.getDomainMarkers(Layer.FOREGROUND);
        Collection bg0 = plot.getDomainMarkers(Layer.BACKGROUND);
        Collection fg1 = plot.getDomainMarkers(1, Layer.FOREGROUND);
        Collection bg1 = plot.getDomainMarkers(1, Layer.BACKGROUND);

        Assert.assertNotNull(fg0);
        Assert.assertNotNull(bg0);
        Assert.assertNotNull(fg1);
        Assert.assertNotNull(bg1);
        Assert.assertTrue(fg0.contains(marker1));
        Assert.assertTrue(bg0.contains(marker2));

        Assert.assertTrue(plot.removeDomainMarker(marker1));
        Assert.assertTrue(plot.removeDomainMarker(marker2, Layer.BACKGROUND));
        Assert.assertTrue(plot.removeDomainMarker(1, marker1, Layer.FOREGROUND));
        Assert.assertTrue(plot.removeDomainMarker(1, marker2, Layer.BACKGROUND, true));
        Assert.assertFalse(plot.removeDomainMarker(marker1));

        plot.addDomainMarker(marker1, Layer.FOREGROUND);
        plot.addDomainMarker(marker2, Layer.BACKGROUND);
        plot.clearDomainMarkers(0);
        Assert.assertEquals(0, plot.getDomainMarkers(Layer.FOREGROUND).size());
        Assert.assertEquals(0, plot.getDomainMarkers(Layer.BACKGROUND).size());

        plot.addDomainMarker(marker1, Layer.FOREGROUND);
        plot.addDomainMarker(marker2, Layer.BACKGROUND);
        plot.clearDomainMarkers();
        Assert.assertEquals(0, plot.getDomainMarkers(Layer.FOREGROUND).size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_nullMarkerThrows() {
        new CategoryPlot().addDomainMarker(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_nullLayerThrows() {
        new CategoryPlot().addDomainMarker(new CategoryMarker("C"), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDomainMarker_nullMarkerThrows() {
        new CategoryPlot().removeDomainMarker(0, null, Layer.FOREGROUND, true);
    }

    @Test
    public void testRangeMarkers() {
        CategoryPlot plot = new CategoryPlot();
        ValueMarker marker1 = new ValueMarker(1.0);
        ValueMarker marker2 = new ValueMarker(2.0);

        plot.addRangeMarker(marker1);
        plot.addRangeMarker(marker2, Layer.BACKGROUND);
        plot.addRangeMarker(1, marker1, Layer.FOREGROUND);
        plot.addRangeMarker(1, marker2, Layer.BACKGROUND, true);

        Collection fg0 = plot.getRangeMarkers(Layer.FOREGROUND);
        Collection bg0 = plot.getRangeMarkers(Layer.BACKGROUND);
        Collection fg1 = plot.getRangeMarkers(1, Layer.FOREGROUND);
        Collection bg1 = plot.getRangeMarkers(1, Layer.BACKGROUND);

        Assert.assertNotNull(fg0);
        Assert.assertNotNull(bg0);
        Assert.assertNotNull(fg1);
        Assert.assertNotNull(bg1);
        Assert.assertTrue(fg0.contains(marker1));
        Assert.assertTrue(bg0.contains(marker2));

        Assert.assertTrue(plot.removeRangeMarker(marker1));
        Assert.assertTrue(plot.removeRangeMarker(marker2, Layer.BACKGROUND));
        Assert.assertTrue(plot.removeRangeMarker(1, marker1, Layer.FOREGROUND));
        Assert.assertTrue(plot.removeRangeMarker(1, marker2, Layer.BACKGROUND, true));
        Assert.assertFalse(plot.removeRangeMarker(marker1));

        plot.addRangeMarker(marker1, Layer.FOREGROUND);
        plot.addRangeMarker(marker2, Layer.BACKGROUND);
        plot.clearRangeMarkers(0);
        Assert.assertEquals(0, plot.getRangeMarkers(Layer.FOREGROUND).size());

        plot.addRangeMarker(marker1, Layer.FOREGROUND);
        plot.addRangeMarker(marker2, Layer.BACKGROUND);
        plot.clearRangeMarkers();
        Assert.assertEquals(0, plot.getRangeMarkers(Layer.FOREGROUND).size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_nullMarkerThrows() {
        new CategoryPlot().removeRangeMarker(0, null, Layer.FOREGROUND, true);
    }

    @Test
    public void testAnnotations() {
        CategoryPlot plot = new CategoryPlot();
        CategoryTextAnnotation a1 = new CategoryTextAnnotation("A1", "Category 1", 1.0);
        CategoryTextAnnotation a2 = new CategoryTextAnnotation("A2", "Category 2", 2.0);

        plot.addAnnotation(a1);
        plot.addAnnotation(a2, true);

        List list = plot.getAnnotations();
        Assert.assertEquals(2, list.size());
        Assert.assertTrue(list.contains(a1));
        Assert.assertTrue(list.contains(a2));

        Assert.assertTrue(plot.removeAnnotation(a1));
        Assert.assertTrue(plot.removeAnnotation(a2, true));
        Assert.assertFalse(plot.removeAnnotation(a1));
        Assert.assertEquals(0, plot.getAnnotations().size());

        plot.addAnnotation(a1);
        plot.clearAnnotations();
        Assert.assertEquals(0, plot.getAnnotations().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_nullThrows() {
        new CategoryPlot().addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotation_nullThrows() {
        new CategoryPlot().removeAnnotation(null);
    }

    @Test
    public void testWeightAndFixedSpaces() {
        CategoryPlot plot = new CategoryPlot();
        plot.setWeight(5);
        Assert.assertEquals(5, plot.getWeight());

        AxisSpace domainSpace = new AxisSpace();
        domainSpace.setTop(10.0);
        domainSpace.setBottom(10.0);
        plot.setFixedDomainAxisSpace(domainSpace);
        Assert.assertEquals(domainSpace, plot.getFixedDomainAxisSpace());

        plot.setFixedDomainAxisSpace(domainSpace, true);
        Assert.assertEquals(domainSpace, plot.getFixedDomainAxisSpace());

        AxisSpace rangeSpace = new AxisSpace();
        rangeSpace.setLeft(15.0);
        rangeSpace.setRight(15.0);
        plot.setFixedRangeAxisSpace(rangeSpace);
        Assert.assertEquals(rangeSpace, plot.getFixedRangeAxisSpace());

        plot.setFixedRangeAxisSpace(rangeSpace, true);
        Assert.assertEquals(rangeSpace, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testGetCategoriesAndCategoriesForAxis() {
        DefaultCategoryDataset dataset = createSampleDataset();
        CategoryAxis axis = new CategoryAxis("Categories");
        CategoryPlot plot = new CategoryPlot(dataset, axis, new NumberAxis("Values"), new BarRenderer());

        List categories = plot.getCategories();
        Assert.assertNotNull(categories);
        Assert.assertEquals(2, categories.size());
        Assert.assertEquals("Category 1", categories.get(0));
        Assert.assertEquals("Category 2", categories.get(1));

        List axisCategories = plot.getCategoriesForAxis(axis);
        Assert.assertEquals(categories, axisCategories);

        CategoryPlot emptyPlot = new CategoryPlot();
        Assert.assertNull(emptyPlot.getCategories());
    }

    @Test
    public void testDrawSharedDomainAxis() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertFalse(plot.getDrawSharedDomainAxis());
        plot.setDrawSharedDomainAxis(true);
        Assert.assertTrue(plot.getDrawSharedDomainAxis());
    }

    @Test
    public void testZoomSupport() {
        CategoryPlot plot = new CategoryPlot(createSampleDataset(), new CategoryAxis("D"),
                new NumberAxis("R"), new BarRenderer());
        Assert.assertFalse(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));

        plot.zoomDomainAxes(1.5, info, new Point2D.Double(10, 10));
        plot.zoomDomainAxes(0.1, 0.9, info, new Point2D.Double(10, 10));
        plot.zoomDomainAxes(1.5, info, new Point2D.Double(10, 10), true);

        plot.setAnchorValue(5.0);
        Assert.assertEquals(5.0, plot.getAnchorValue(), 0.0001);

        plot.zoom(0.5);
        Assert.assertFalse(plot.getRangeAxis().isAutoRange());

        plot.zoom(0.0);
        Assert.assertTrue(plot.getRangeAxis().isAutoRange());

        plot.zoomRangeAxes(0.8, info, new Point2D.Double(20, 20));
        plot.zoomRangeAxes(0.8, info, new Point2D.Double(20, 20), true);
        plot.zoomRangeAxes(0.2, 0.8, info, new Point2D.Double(20, 20));

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.zoomRangeAxes(0.8, info, new Point2D.Double(20, 20), true);
    }

    @Test
    public void testHandleClick() {
        CategoryPlot plot = new CategoryPlot(createSampleDataset(), new CategoryAxis("D"),
                new NumberAxis("R"), new BarRenderer());
        plot.getRangeAxis().setRange(0.0, 10.0);

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 100, 100);
        info.setDataArea(dataArea);

        plot.handleClick(50, 50, info);
        Assert.assertTrue(plot.getAnchorValue() >= 0.0 && plot.getAnchorValue() <= 10.0);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.handleClick(50, 50, info);
        Assert.assertTrue(plot.getAnchorValue() >= 0.0 && plot.getAnchorValue() <= 10.0);

        plot.handleClick(0, 0, info);
    }

    @Test
    public void testGetDataRange() {
        DefaultCategoryDataset dataset = createSampleDataset();
        NumberAxis rangeAxis = new NumberAxis("Values");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Categories"),
                rangeAxis, new BarRenderer());

        Range range = plot.getDataRange(rangeAxis);
        Assert.assertNotNull(range);
        Assert.assertEquals(0.0, range.getLowerBound(), 0.001);
        Assert.assertEquals(4.0, range.getUpperBound(), 0.001);

        NumberAxis unmappedAxis = new NumberAxis("Unmapped");
        Assert.assertNull(plot.getDataRange(unmappedAxis));
    }

    @Test
    public void testEventHandlers() {
        CategoryPlot parent = new CategoryPlot();
        CategoryPlot child = new CategoryPlot();
        child.setParent(parent);

        TestPlotListener listener = new TestPlotListener();
        parent.addChangeListener(listener);

        child.datasetChanged(new DatasetChangeEvent(child, null));
        Assert.assertEquals(1, listener.eventCount);

        child.rendererChanged(new RendererChangeEvent(new BarRenderer()));
        Assert.assertEquals(2, listener.eventCount);
    }

    @Test
    public void testDrawFullChartVerticalAndHorizontal() {
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();

        DefaultCategoryDataset dataset = createSampleDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        BarRenderer renderer = new BarRenderer();

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeCrosshairVisible(true);
        plot.setRangeCrosshairValue(2.5);
        plot.addDomainMarker(new CategoryMarker("Category 1"), Layer.BACKGROUND);
        plot.addDomainMarker(new CategoryMarker("Category 2"), Layer.FOREGROUND);
        plot.addRangeMarker(new ValueMarker(2.0), Layer.BACKGROUND);
        plot.addRangeMarker(new ValueMarker(3.0), Layer.FOREGROUND);
        plot.addAnnotation(new CategoryTextAnnotation("Note", "Category 1", 2.0));

        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        plot.draw(g2, area, new Point2D.Double(200, 150), null, info);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        plot.draw(g2, area, new Point2D.Double(200, 150), null, info);

        plot.draw(g2, new Rectangle2D.Double(0, 0, 1, 1), null, null, null);

        g2.dispose();
    }

    @Test
    public void testDrawWithFixedAxisSpaceAndNoRenderer() {
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();

        CategoryPlot plot = new CategoryPlot(null, new CategoryAxis("Domain"),
                new NumberAxis("Range"), null);
        AxisSpace space = new AxisSpace();
        space.setTop(20);
        space.setBottom(20);
        space.setLeft(30);
        space.setRight(30);
        plot.setFixedDomainAxisSpace(space);
        plot.setFixedRangeAxisSpace(space);

        plot.draw(g2, new Rectangle2D.Double(0, 0, 400, 300), null, null, null);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.draw(g2, new Rectangle2D.Double(0, 0, 400, 300), null, null, null);

        g2.dispose();
    }

    @Test
    public void testEqualsAndClone() throws Exception {
        DefaultCategoryDataset dataset = createSampleDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        BarRenderer renderer = new BarRenderer();

        CategoryPlot plot1 = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        CategoryPlot plot2 = new CategoryPlot(dataset, new CategoryAxis("Domain"),
                new NumberAxis("Range"), new BarRenderer());

        Assert.assertTrue(plot1.equals(plot1));
        Assert.assertFalse(plot1.equals(null));
        Assert.assertFalse(plot1.equals("Some String"));
        Assert.assertTrue(plot1.equals(plot2));

        plot2.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setOrientation(PlotOrientation.VERTICAL);

        plot2.setWeight(10);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setWeight(plot1.getWeight());

        plot2.setAnchorValue(99.0);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setAnchorValue(plot1.getAnchorValue());

        CategoryPlot cloned = (CategoryPlot) plot1.clone();
        Assert.assertNotSame(plot1, cloned);
        Assert.assertTrue(plot1.equals(cloned));
    }

    @Test
    public void testSerialization() throws Exception {
        DefaultCategoryDataset dataset = createSampleDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        BarRenderer renderer = new BarRenderer();

        CategoryPlot plot1 = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(plot1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        CategoryPlot plot2 = (CategoryPlot) in.readObject();
        in.close();

        Assert.assertTrue(plot1.equals(plot2));
    }
}
