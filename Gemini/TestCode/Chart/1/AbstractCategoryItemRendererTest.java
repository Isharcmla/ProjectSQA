package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.junit.Before;
import org.junit.Test;

public class AbstractCategoryItemRendererTest {

    private static class ConcreteCategoryItemRenderer extends AbstractCategoryItemRenderer {
        private static final long serialVersionUID = 1L;

        public void drawItem(Graphics2D g2, CategoryItemRendererState state,
                             Rectangle2D dataArea, CategoryPlot plot,
                             CategoryAxis domainAxis, ValueAxis rangeAxis,
                             CategoryDataset dataset, int row, int column,
                             int pass) {
            // No-op for abstract implementation testing
        }

        @Override
        public CategoryAxis getDomainAxis(CategoryPlot plot, CategoryDataset dataset) {
            return super.getDomainAxis(plot, dataset);
        }

        @Override
        public ValueAxis getRangeAxis(CategoryPlot plot, int index) {
            return super.getRangeAxis(plot, index);
        }

        @Override
        public void drawItemLabel(Graphics2D g2, PlotOrientation orientation,
                                  CategoryDataset dataset, int row, int column,
                                  boolean selected, double x, double y,
                                  boolean negative) {
            super.drawItemLabel(g2, orientation, dataset, row, column, selected, x, y, negative);
        }

        @Override
        public void updateCrosshairValues(CategoryCrosshairState crosshairState,
                                          Comparable rowKey, Comparable columnKey,
                                          double value, int datasetIndex,
                                          double transX, double transY,
                                          PlotOrientation orientation) {
            super.updateCrosshairValues(crosshairState, rowKey, columnKey, value, datasetIndex, transX, transY, orientation);
        }

        @Override
        public void addEntity(EntityCollection entities, Shape hotspot,
                              CategoryDataset dataset, int row, int column,
                              boolean selected) {
            super.addEntity(entities, hotspot, dataset, row, column, selected);
        }

        @Override
        public void addEntity(EntityCollection entities, Shape hotspot,
                              CategoryDataset dataset, int row, int column,
                              boolean selected, double entityX, double entityY) {
            super.addEntity(entities, hotspot, dataset, row, column, selected, entityX, entityY);
        }

        @Override
        public Range findRangeBounds(CategoryDataset dataset, boolean includeInterval) {
            return super.findRangeBounds(dataset, includeInterval);
        }

        @Override
        public Point2D calculateDomainMarkerTextAnchorPoint(Graphics2D g2,
                PlotOrientation orientation, Rectangle2D dataArea,
                Rectangle2D markerArea, RectangleInsets markerOffset,
                LengthAdjustmentType labelOffsetType, RectangleAnchor anchor) {
            return super.calculateDomainMarkerTextAnchorPoint(g2, orientation, dataArea, markerArea, markerOffset, labelOffsetType, anchor);
        }

        @Override
        public Point2D calculateRangeMarkerTextAnchorPoint(Graphics2D g2,
                PlotOrientation orientation, Rectangle2D dataArea,
                Rectangle2D markerArea, RectangleInsets markerOffset,
                LengthAdjustmentType labelOffsetType, RectangleAnchor anchor) {
            return super.calculateRangeMarkerTextAnchorPoint(g2, orientation, dataArea, markerArea, markerOffset, labelOffsetType, anchor);
        }
    }

    private static class NonCloneableItemLabelGenerator implements CategoryItemLabelGenerator, Serializable {
        public String generateRowLabel(CategoryDataset dataset, int row) {
            return null;
        }
        public String generateColumnLabel(CategoryDataset dataset, int column) {
            return null;
        }
        public String generateLabel(CategoryDataset dataset, int row, int column) {
            return "Test";
        }
    }

    private static class NonCloneableToolTipGenerator implements CategoryToolTipGenerator, Serializable {
        public String generateToolTip(CategoryDataset dataset, int row, int column) {
            return "Tooltip";
        }
    }

    private static class NonCloneableURLGenerator implements CategoryURLGenerator, Serializable {
        public String generateURL(CategoryDataset dataset, int series, int category) {
            return "http://test.url";
        }
    }

    private static class TestRendererChangeListener implements RendererChangeListener {
        int eventCount = 0;
        public void rendererChanged(RendererChangeEvent event) {
            eventCount++;
        }
    }

    private ConcreteCategoryItemRenderer renderer;
    private Graphics2D g2;
    private Rectangle2D dataArea;

    @Before
    public void setUp() {
        renderer = new ConcreteCategoryItemRenderer();
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        g2 = image.createGraphics();
        dataArea = new Rectangle2D.Double(0.0, 0.0, 400.0, 300.0);
    }

    @Test
    public void testGetPassCount_default_returnsOne() {
        assertEquals(1, renderer.getPassCount());
    }

    @Test
    public void testSetAndGetPlot_validPlot_returnsPlot() {
        CategoryPlot plot = new CategoryPlot();
        renderer.setPlot(plot);
        assertSame(plot, renderer.getPlot());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPlot_nullPlot_throwsException() {
        renderer.setPlot(null);
    }

    @Test
    public void testItemLabelGenerator_seriesAndBase_resolvedCorrectly() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        assertNull(renderer.getItemLabelGenerator(0, 0, false));
        assertNull(renderer.getSeriesItemLabelGenerator(0));
        assertNull(renderer.getBaseItemLabelGenerator());

        CategoryItemLabelGenerator baseGen = new StandardCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(baseGen);
        assertSame(baseGen, renderer.getBaseItemLabelGenerator());
        assertSame(baseGen, renderer.getItemLabelGenerator(0, 0, false));
        assertEquals(1, listener.eventCount);

        CategoryItemLabelGenerator seriesGen = new StandardCategoryItemLabelGenerator();
        renderer.setSeriesItemLabelGenerator(0, seriesGen);
        assertSame(seriesGen, renderer.getSeriesItemLabelGenerator(0));
        assertSame(seriesGen, renderer.getItemLabelGenerator(0, 0, false));
        assertSame(baseGen, renderer.getItemLabelGenerator(1, 0, false));
        assertEquals(2, listener.eventCount);

        renderer.setSeriesItemLabelGenerator(0, null, false);
        assertEquals(2, listener.eventCount);
        assertNull(renderer.getSeriesItemLabelGenerator(0));

        renderer.setBaseItemLabelGenerator(null, false);
        assertEquals(2, listener.eventCount);
        assertNull(renderer.getBaseItemLabelGenerator());
    }

    @Test
    public void testToolTipGenerator_seriesAndBase_resolvedCorrectly() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        assertNull(renderer.getToolTipGenerator(0, 0, false));
        assertNull(renderer.getSeriesToolTipGenerator(0));
        assertNull(renderer.getBaseToolTipGenerator());

        CategoryToolTipGenerator baseGen = new StandardCategoryToolTipGenerator();
        renderer.setBaseToolTipGenerator(baseGen);
        assertSame(baseGen, renderer.getBaseToolTipGenerator());
        assertSame(baseGen, renderer.getToolTipGenerator(0, 0, false));
        assertEquals(1, listener.eventCount);

        CategoryToolTipGenerator seriesGen = new StandardCategoryToolTipGenerator();
        renderer.setSeriesToolTipGenerator(0, seriesGen);
        assertSame(seriesGen, renderer.getSeriesToolTipGenerator(0));
        assertSame(seriesGen, renderer.getToolTipGenerator(0, 0, false));
        assertSame(baseGen, renderer.getToolTipGenerator(1, 0, false));
        assertEquals(2, listener.eventCount);

        renderer.setSeriesToolTipGenerator(0, null, false);
        assertEquals(2, listener.eventCount);
        assertNull(renderer.getSeriesToolTipGenerator(0));

        renderer.setBaseToolTipGenerator(null, false);
        assertEquals(2, listener.eventCount);
        assertNull(renderer.getBaseToolTipGenerator());
    }

    @Test
    public void testURLGenerator_seriesAndBase_resolvedCorrectly() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        assertNull(renderer.getURLGenerator(0, 0, false));
        assertNull(renderer.getSeriesURLGenerator(0));
        assertNull(renderer.getBaseURLGenerator());

        CategoryURLGenerator baseGen = new StandardCategoryURLGenerator();
        renderer.setBaseURLGenerator(baseGen);
        assertSame(baseGen, renderer.getBaseURLGenerator());
        assertSame(baseGen, renderer.getURLGenerator(0, 0, false));
        assertEquals(1, listener.eventCount);

        CategoryURLGenerator seriesGen = new StandardCategoryURLGenerator();
        renderer.setSeriesURLGenerator(0, seriesGen);
        assertSame(seriesGen, renderer.getSeriesURLGenerator(0));
        assertSame(seriesGen, renderer.getURLGenerator(0, 0, false));
        assertSame(baseGen, renderer.getURLGenerator(1, 0, false));
        assertEquals(2, listener.eventCount);

        renderer.setSeriesURLGenerator(0, null, false);
        assertEquals(2, listener.eventCount);
        assertNull(renderer.getSeriesURLGenerator(0));

        renderer.setBaseURLGenerator(null, false);
        assertEquals(2, listener.eventCount);
        assertNull(renderer.getBaseURLGenerator());
    }

    @Test
    public void testAnnotations_addRemoveAndDraw_modifiesStateAndTriggersEvents() {
        TestRendererChangeListener listener = new TestRendererChangeListener();
        renderer.addChangeListener(listener);

        CategoryAnnotation a1 = new CategoryTextAnnotation("A1", "C1", 10.0);
        CategoryAnnotation a2 = new CategoryTextAnnotation("A2", "C2", 20.0);

        renderer.addAnnotation(a1);
        assertEquals(1, listener.eventCount);

        renderer.addAnnotation(a2, Layer.BACKGROUND);
        assertEquals(2, listener.eventCount);

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(new DefaultCategoryDataset(), domainAxis, rangeAxis, renderer);
        renderer.setPlot(plot);

        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, Layer.FOREGROUND, info);
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, Layer.BACKGROUND, info);

        boolean removedA1 = renderer.removeAnnotation(a1);
        assertTrue(removedA1);
        assertEquals(3, listener.eventCount);

        boolean removedA2 = renderer.removeAnnotation(a2);
        assertTrue(removedA2);
        assertEquals(4, listener.eventCount);

        renderer.addAnnotation(a1);
        renderer.addAnnotation(a2, Layer.BACKGROUND);
        renderer.removeAnnotations();
        assertEquals(7, listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_nullAnnotation_throwsException() {
        renderer.addAnnotation(null);
    }

    @Test(expected = RuntimeException.class)
    public void testAddAnnotation_invalidLayer_throwsException() {
        renderer.addAnnotation(new CategoryTextAnnotation("A", "C", 1.0), new Layer("OTHER") {});
    }

    @Test(expected = RuntimeException.class)
    public void testDrawAnnotations_invalidLayer_throwsException() {
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, new Layer("INVALID") {}, null);
    }

    @Test
    public void testLegendItemGenerators_gettersAndSetters() {
        assertNotNull(renderer.getLegendItemLabelGenerator());
        CategorySeriesLabelGenerator labelGen = new StandardCategorySeriesLabelGenerator("Custom {0}");
        renderer.setLegendItemLabelGenerator(labelGen);
        assertSame(labelGen, renderer.getLegendItemLabelGenerator());

        assertNull(renderer.getLegendItemToolTipGenerator());
        CategorySeriesLabelGenerator tipGen = new StandardCategorySeriesLabelGenerator("Tooltip {0}");
        renderer.setLegendItemToolTipGenerator(tipGen);
        assertSame(tipGen, renderer.getLegendItemToolTipGenerator());

        assertNull(renderer.getLegendItemURLGenerator());
        CategorySeriesLabelGenerator urlGen = new StandardCategorySeriesLabelGenerator("URL {0}");
        renderer.setLegendItemURLGenerator(urlGen);
        assertSame(urlGen, renderer.getLegendItemURLGenerator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemLabelGenerator_nullGenerator_throwsException() {
        renderer.setLegendItemLabelGenerator(null);
    }

    @Test
    public void testInitialise_withDatasetAndState_updatesRowAndColumnCount() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R2", "C1");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis(), new NumberAxis(), renderer);

        ChartRenderingInfo cri = new ChartRenderingInfo();
        PlotRenderingInfo pri = new PlotRenderingInfo(cri);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, dataset, pri);
        assertNotNull(state);
        assertEquals(2, renderer.getRowCount());
        assertEquals(1, renderer.getColumnCount());
        assertEquals(2, state.getVisibleSeriesCount());

        renderer.setSeriesVisible(1, Boolean.FALSE);
        CategoryItemRendererState state2 = renderer.initialise(g2, dataArea, plot, dataset, pri);
        assertEquals(1, state2.getVisibleSeriesCount());
        assertEquals(0, state2.getVisibleSeriesIndex(0));

        CategoryItemRendererState state3 = renderer.initialise(g2, dataArea, plot, null, null);
        assertNotNull(state3);
        assertEquals(0, renderer.getRowCount());
        assertEquals(0, renderer.getColumnCount());
    }

    @Test
    public void testFindRangeBounds_withAndWithoutInterval_returnsExpectedRange() {
        assertNull(renderer.findRangeBounds(null));
        assertNull(renderer.findRangeBounds(new DefaultCategoryDataset()));

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(20.0, "R1", "C2");
        dataset.addValue(30.0, "R2", "C1");

        Range r = renderer.findRangeBounds(dataset);
        assertNotNull(r);
        assertEquals(10.0, r.getLowerBound(), 0.001);
        assertEquals(30.0, r.getUpperBound(), 0.001);

        renderer.setDataBoundsIncludesVisibleSeriesOnly(true);
        renderer.setSeriesVisible(1, Boolean.FALSE);
        Range rFiltered = renderer.findRangeBounds(dataset);
        assertNotNull(rFiltered);
        assertEquals(10.0, rFiltered.getLowerBound(), 0.001);
        assertEquals(20.0, rFiltered.getUpperBound(), 0.001);

        Number[][] starts = new Number[][] {{1.0, 2.0}};
        Number[][] ends = new Number[][] {{5.0, 6.0}};
        DefaultIntervalCategoryDataset intervalDataset = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S1"}, new Comparable[] {"C1", "C2"}, starts, ends);
        Range intervalRange = renderer.findRangeBounds(intervalDataset, true);
        assertNotNull(intervalRange);
        assertEquals(1.0, intervalRange.getLowerBound(), 0.001);
        assertEquals(6.0, intervalRange.getUpperBound(), 0.001);
    }

    @Test
    public void testGetItemMiddle_calculatesMiddleCorrectly() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        CategoryAxis axis = new CategoryAxis();

        double middle = renderer.getItemMiddle("R1", "C1", dataset, axis, dataArea, RectangleEdge.BOTTOM);
        assertTrue(middle > 0.0);
    }

    @Test
    public void testDrawBackgroundAndOutline_invokesPlotMethodsWithoutException() {
        CategoryPlot plot = new CategoryPlot();
        renderer.drawBackground(g2, plot, dataArea);
        renderer.drawOutline(g2, plot, dataArea);
    }

    @Test
    public void testDrawDomainLine_horizontalAndVertical_rendersProperly() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawDomainLine(g2, plot, dataArea, 50.0, Color.RED, new BasicStroke(1.0f));

        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawDomainLine(g2, plot, dataArea, 50.0, Color.BLUE, new BasicStroke(1.0f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawDomainLine_nullPaint_throwsException() {
        renderer.drawDomainLine(g2, new CategoryPlot(), dataArea, 50.0, null, new BasicStroke(1.0f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawDomainLine_nullStroke_throwsException() {
        renderer.drawDomainLine(g2, new CategoryPlot(), dataArea, 50.0, Color.RED, null);
    }

    @Test
    public void testDrawRangeLine_inAndOutOfRange_rendersProperly() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new NumberAxis();
        axis.setRange(0.0, 100.0);

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawRangeLine(g2, plot, axis, dataArea, 50.0, Color.RED, new BasicStroke(1.0f));
        renderer.drawRangeLine(g2, plot, axis, dataArea, 150.0, Color.RED, new BasicStroke(1.0f));

        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawRangeLine(g2, plot, axis, dataArea, 50.0, Color.RED, new BasicStroke(1.0f));
    }

    @Test
    public void testDrawDomainMarker_lineAndArea_rendersInBothOrientations() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis(), new NumberAxis(), renderer);
        CategoryAxis axis = plot.getDomainAxis();

        CategoryMarker lineMarker = new CategoryMarker("C1", Color.RED, new BasicStroke(1.0f));
        lineMarker.setDrawAsLine(true);
        lineMarker.setLabel("LineMarker");

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawDomainMarker(g2, plot, axis, lineMarker, dataArea);

        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawDomainMarker(g2, plot, axis, lineMarker, dataArea);

        CategoryMarker areaMarker = new CategoryMarker("C1", Color.BLUE, new BasicStroke(1.0f));
        areaMarker.setDrawAsLine(false);
        areaMarker.setLabel("AreaMarker");

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawDomainMarker(g2, plot, axis, areaMarker, dataArea);

        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawDomainMarker(g2, plot, axis, areaMarker, dataArea);

        CategoryMarker missingMarker = new CategoryMarker("UnknownKey", Color.BLACK, new BasicStroke(1.0f));
        renderer.drawDomainMarker(g2, plot, axis, missingMarker, dataArea);
    }

    @Test
    public void testDrawRangeMarker_valueAndInterval_rendersInBothOrientations() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new NumberAxis();
        axis.setRange(0.0, 100.0);

        ValueMarker vm = new ValueMarker(50.0, Color.RED, new BasicStroke(1.0f));
        vm.setLabel("ValueMarker");

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawRangeMarker(g2, plot, axis, vm, dataArea);

        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawRangeMarker(g2, plot, axis, vm, dataArea);

        ValueMarker vmOutOfRange = new ValueMarker(150.0);
        renderer.drawRangeMarker(g2, plot, axis, vmOutOfRange, dataArea);

        IntervalMarker im = new IntervalMarker(20.0, 80.0, Color.GREEN, new BasicStroke(1.0f), Color.BLACK, new BasicStroke(1.0f), 0.5f);
        im.setLabel("IntervalMarker");

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawRangeMarker(g2, plot, axis, im, dataArea);

        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawRangeMarker(g2, plot, axis, im, dataArea);

        IntervalMarker imGradient = new IntervalMarker(20.0, 80.0,
                new GradientPaint(0.0f, 0.0f, Color.RED, 10.0f, 10.0f, Color.BLUE),
                new BasicStroke(1.0f), Color.BLACK, new BasicStroke(1.0f), 0.5f);
        imGradient.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL));
        renderer.drawRangeMarker(g2, plot, axis, imGradient, dataArea);

        IntervalMarker imOutOfRange = new IntervalMarker(200.0, 300.0);
        renderer.drawRangeMarker(g2, plot, axis, imOutOfRange, dataArea);
    }

    @Test
    public void testCalculateMarkerTextAnchorPoints_differentOrientations() {
        Rectangle2D markerArea = new Rectangle2D.Double(10, 10, 50, 50);
        RectangleInsets insets = new RectangleInsets(2, 2, 2, 2);

        Point2D pDomainH = renderer.calculateDomainMarkerTextAnchorPoint(
                g2, PlotOrientation.HORIZONTAL, dataArea, markerArea, insets,
                LengthAdjustmentType.CONTRACT, RectangleAnchor.CENTER);
        assertNotNull(pDomainH);

        Point2D pDomainV = renderer.calculateDomainMarkerTextAnchorPoint(
                g2, PlotOrientation.VERTICAL, dataArea, markerArea, insets,
                LengthAdjustmentType.CONTRACT, RectangleAnchor.CENTER);
        assertNotNull(pDomainV);

        Point2D pRangeH = renderer.calculateRangeMarkerTextAnchorPoint(
                g2, PlotOrientation.HORIZONTAL, dataArea, markerArea, insets,
                LengthAdjustmentType.CONTRACT, RectangleAnchor.CENTER);
        assertNotNull(pRangeH);

        Point2D pRangeV = renderer.calculateRangeMarkerTextAnchorPoint(
                g2, PlotOrientation.VERTICAL, dataArea, markerArea, insets,
                LengthAdjustmentType.CONTRACT, RectangleAnchor.CENTER);
        assertNotNull(pRangeV);
    }

    @Test
    public void testGetLegendItem_visibilityAndAttributes() {
        assertNull(renderer.getLegendItem(0, 0));

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series 1", "Category 1");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis(), new NumberAxis(), renderer);
        renderer.setPlot(plot);

        renderer.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("Tip {0}"));
        renderer.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator("URL {0}"));
        renderer.setLegendTextPaint(0, Color.CYAN);

        LegendItem item = renderer.getLegendItem(0, 0);
        assertNotNull(item);
        assertEquals("Series 1", item.getLabel());
        assertEquals("Tip Series 1", item.getToolTipText());
        assertEquals("URL Series 1", item.getURLText());
        assertEquals(Color.CYAN, item.getLabelPaint());

        renderer.setSeriesVisible(0, Boolean.FALSE);
        assertNull(renderer.getLegendItem(0, 0));

        renderer.setSeriesVisible(0, Boolean.TRUE);
        renderer.setSeriesVisibleInLegend(0, Boolean.FALSE);
        assertNull(renderer.getLegendItem(0, 0));
    }

    @Test
    public void testGetLegendItems_emptyWhenDatasetNullOrPresent() {
        assertEquals(0, renderer.getLegendItems().getItemCount());

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series 1", "Category 1");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis(), new NumberAxis(), renderer);
        renderer.setPlot(plot);

        LegendItemCollection collection = renderer.getLegendItems();
        assertNotNull(collection);
    }

    @Test
    public void testEqualsAndHashCode_standardComparisons() {
        ConcreteCategoryItemRenderer r1 = new ConcreteCategoryItemRenderer();
        ConcreteCategoryItemRenderer r2 = new ConcreteCategoryItemRenderer();

        assertTrue(r1.equals(r1));
        assertTrue(r1.equals(r2));
        assertEquals(r1.hashCode(), r2.hashCode());

        assertFalse(r1.equals(null));
        assertFalse(r1.equals("Not a renderer"));

        r1.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        assertFalse(r1.equals(r2));
        r2.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        assertTrue(r1.equals(r2));

        r1.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        assertFalse(r1.equals(r2));
        r2.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        assertTrue(r1.equals(r2));

        r1.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        assertFalse(r1.equals(r2));
        r2.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        assertTrue(r1.equals(r2));

        r1.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        assertFalse(r1.equals(r2));
        r2.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        assertTrue(r1.equals(r2));

        r1.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        assertFalse(r1.equals(r2));
        r2.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        assertTrue(r1.equals(r2));

        r1.setBaseURLGenerator(new StandardCategoryURLGenerator());
        assertFalse(r1.equals(r2));
        r2.setBaseURLGenerator(new StandardCategoryURLGenerator());
        assertTrue(r1.equals(r2));

        r1.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator("Legend {0}"));
        assertFalse(r1.equals(r2));
        r2.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator("Legend {0}"));
        assertTrue(r1.equals(r2));

        r1.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("Tooltip {0}"));
        assertFalse(r1.equals(r2));
        r2.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("Tooltip {0}"));
        assertTrue(r1.equals(r2));

        r1.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator("URL {0}"));
        assertFalse(r1.equals(r2));
        r2.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator("URL {0}"));
        assertTrue(r1.equals(r2));

        CategoryTextAnnotation annotation = new CategoryTextAnnotation("Text", "Cat", 10.0);
        r1.addAnnotation(annotation, Layer.BACKGROUND);
        assertFalse(r1.equals(r2));
        r2.addAnnotation(annotation, Layer.BACKGROUND);
        assertTrue(r1.equals(r2));

        r1.addAnnotation(annotation, Layer.FOREGROUND);
        assertFalse(r1.equals(r2));
        r2.addAnnotation(annotation, Layer.FOREGROUND);
        assertTrue(r1.equals(r2));
    }

    @Test
    public void testGetDrawingSupplier_withAndWithoutPlot() {
        assertNull(renderer.getDrawingSupplier());

        CategoryPlot plot = new CategoryPlot();
        plot.setDrawingSupplier(new DefaultDrawingSupplier());
        renderer.setPlot(plot);
        assertNotNull(renderer.getDrawingSupplier());
    }

    @Test
    public void testUpdateCrosshairValues_variousConfigurations() {
        CategoryPlot plot = new CategoryPlot();
        renderer.setPlot(plot);

        CategoryCrosshairState state = new CategoryCrosshairState();

        plot.setRangeCrosshairLockedOnData(true);
        renderer.updateCrosshairValues(state, "R1", "C1", 10.0, 0, 50.0, 50.0, PlotOrientation.VERTICAL);

        plot.setRangeCrosshairLockedOnData(false);
        renderer.updateCrosshairValues(state, "R1", "C1", 10.0, 0, 50.0, 50.0, PlotOrientation.HORIZONTAL);

        renderer.updateCrosshairValues(null, "R1", "C1", 10.0, 0, 50.0, 50.0, PlotOrientation.VERTICAL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateCrosshairValues_nullOrientation_throwsException() {
        renderer.updateCrosshairValues(new CategoryCrosshairState(), "R1", "C1", 10.0, 0, 50.0, 50.0, null);
    }

    @Test
    public void testDrawItemLabel_positiveAndNegative() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");

        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setPositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        renderer.setNegativeItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));

        renderer.drawItemLabel(g2, PlotOrientation.VERTICAL, dataset, 0, 0, false, 50.0, 50.0, false);
        renderer.drawItemLabel(g2, PlotOrientation.HORIZONTAL, dataset, 0, 0, false, 50.0, 50.0, true);

        renderer.setBaseItemLabelGenerator(null);
        renderer.drawItemLabel(g2, PlotOrientation.VERTICAL, dataset, 0, 0, false, 50.0, 50.0, false);
    }

    @Test
    public void testAddEntity_hotspotAndRadiusCalculation() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis(), new NumberAxis(), renderer);
        renderer.setPlot(plot);

        StandardEntityCollection entities = new StandardEntityCollection();
        renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());

        renderer.addEntity(entities, new Rectangle(0, 0, 10, 10), dataset, 0, 0, false);
        assertEquals(1, entities.getEntityCount());

        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.addEntity(entities, null, dataset, 0, 0, false, 10.0, 20.0);
        assertEquals(2, entities.getEntityCount());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.addEntity(entities, null, dataset, 0, 0, false, 10.0, 20.0);
        assertEquals(3, entities.getEntityCount());

        renderer.setBaseCreateEntities(false);
        renderer.addEntity(entities, new Rectangle(0, 0, 10, 10), dataset, 0, 0, false);
        assertEquals(3, entities.getEntityCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEntity_nullHotspotSingleOverload_throwsException() {
        renderer.addEntity(new StandardEntityCollection(), null, new DefaultCategoryDataset(), 0, 0, false);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateHotSpotShape_throwsException() {
        renderer.createHotSpotShape(g2, dataArea, new CategoryPlot(), new CategoryAxis(), new NumberAxis(), new DefaultCategoryDataset(), 0, 0, false, null);
    }

    @Test
    public void testCreateHotSpotBoundsAndHitTest() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(null, "R1", "C2");

        CategoryAxis domainAxis = new CategoryAxis();
        NumberAxis rangeAxis = new NumberAxis();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        renderer.setPlot(plot);

        Rectangle2D bounds = renderer.createHotSpotBounds(g2, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, false, null, null);
        assertNotNull(bounds);

        Rectangle2D boundsNull = renderer.createHotSpotBounds(g2, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, false, null, null);
        assertNull(boundsNull);

        boolean hit = renderer.hitTest(bounds.getCenterX(), bounds.getCenterY(), g2, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, false, null);
        assertTrue(hit);

        boolean miss = renderer.hitTest(0.0, 0.0, g2, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, false, null);
        assertFalse(miss);

        boolean hitNullVal = renderer.hitTest(bounds.getCenterX(), bounds.getCenterY(), g2, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, false, null);
        assertFalse(hitNullVal);
    }

    @Test
    public void testGetDomainAxisAndRangeAxis_helperMethods() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        assertSame(domainAxis, renderer.getDomainAxis(plot, dataset));
        assertSame(rangeAxis, renderer.getRangeAxis(plot, 0));
        assertSame(rangeAxis, renderer.getRangeAxis(plot, 99));
    }

    @Test
    public void testCloning_successAndDeepCopy() throws CloneNotSupportedException {
        renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        renderer.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());
        renderer.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator("Legend"));
        renderer.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("Tooltip"));
        renderer.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator("URL"));

        ConcreteCategoryItemRenderer clone = (ConcreteCategoryItemRenderer) renderer.clone();
        assertNotNull(clone);
        assertTrue(clone instanceof PublicCloneable);
        assertTrue(renderer.equals(clone));
    }

    @Test(expected = CloneNotSupportedException.class)
    public void testClone_nonCloneableBaseItemLabelGenerator_throwsException() throws CloneNotSupportedException {
        renderer.setBaseItemLabelGenerator(new NonCloneableItemLabelGenerator());
        renderer.clone();
    }

    @Test(expected = CloneNotSupportedException.class)
    public void testClone_nonCloneableBaseToolTipGenerator_throwsException() throws CloneNotSupportedException {
        renderer.setBaseToolTipGenerator(new NonCloneableToolTipGenerator());
        renderer.clone();
    }

    @Test(expected = CloneNotSupportedException.class)
    public void testClone_nonCloneableBaseURLGenerator_throwsException() throws CloneNotSupportedException {
        renderer.setBaseURLGenerator(new NonCloneableURLGenerator());
        renderer.clone();
    }

    @Test
    public void testSerialization_roundTrip() throws Exception {
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(renderer);

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ConcreteCategoryItemRenderer deserialized = (ConcreteCategoryItemRenderer) in.readObject();

        assertNotNull(deserialized);
        assertTrue(renderer.equals(deserialized));
    }
}
