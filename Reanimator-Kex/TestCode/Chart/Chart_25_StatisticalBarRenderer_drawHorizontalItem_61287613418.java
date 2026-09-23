package org.jfree.chart.renderer.category;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jfree.chart.renderer.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StatisticalBarRenderer_drawHorizontalItem_61287613418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12879;
     Object term12901;
     Object term12903;

    public StatisticalBarRenderer_drawHorizontalItem_61287613418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12879 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term12879, term12879.getClass(), "errorIndicatorPaint", null);
        setField(term12879, term12879.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term12879, term12879.getClass(), "itemMargin", 0.0);
        setBooleanField(term12879, term12879.getClass(), "drawBarOutline", false);
        setDoubleField(term12879, term12879.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term12879, term12879.getClass(), "minimumBarLength", 0.0);
        setField(term12879, term12879.getClass(), "gradientPaintTransformer", null);
        setField(term12879, term12879.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term12879, term12879.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term12879, term12879.getClass(), "upperClip", 0.0);
        setDoubleField(term12879, term12879.getClass(), "lowerClip", 0.0);
        setDoubleField(term12879, term12879.getClass(), "base", 0.0);
        setBooleanField(term12879, term12879.getClass(), "includeBaseInRange", false);
        setField(term12879, term12879.getClass(), "plot", null);
        setField(term12879, term12879.getClass(), "itemLabelGeneratorList", null);
        setField(term12879, term12879.getClass(), "baseItemLabelGenerator", null);
        setField(term12879, term12879.getClass(), "toolTipGeneratorList", null);
        setField(term12879, term12879.getClass(), "baseToolTipGenerator", null);
        setField(term12879, term12879.getClass(), "urlGeneratorList", null);
        setField(term12879, term12879.getClass(), "baseURLGenerator", null);
        setField(term12879, term12879.getClass(), "legendItemLabelGenerator", null);
        setField(term12879, term12879.getClass(), "legendItemToolTipGenerator", null);
        setField(term12879, term12879.getClass(), "legendItemURLGenerator", null);
        setField(term12879, term12879.getClass(), "backgroundAnnotations", null);
        setField(term12879, term12879.getClass(), "foregroundAnnotations", null);
        setIntField(term12879, term12879.getClass(), "rowCount", 0);
        setIntField(term12879, term12879.getClass(), "columnCount", 0);
        setField(term12879, term12879.getClass(), "seriesVisibleList", null);
        setBooleanField(term12879, term12879.getClass(), "baseSeriesVisible", false);
        setField(term12879, term12879.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term12879, term12879.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term12879, term12879.getClass(), "paintList", null);
        setBooleanField(term12879, term12879.getClass(), "autoPopulateSeriesPaint", false);
        setField(term12879, term12879.getClass(), "basePaint", null);
        setField(term12879, term12879.getClass(), "fillPaintList", null);
        setBooleanField(term12879, term12879.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term12879, term12879.getClass(), "baseFillPaint", null);
        setField(term12879, term12879.getClass(), "outlinePaintList", null);
        setBooleanField(term12879, term12879.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term12879, term12879.getClass(), "baseOutlinePaint", null);
        setField(term12879, term12879.getClass(), "strokeList", null);
        setBooleanField(term12879, term12879.getClass(), "autoPopulateSeriesStroke", false);
        setField(term12879, term12879.getClass(), "baseStroke", null);
        setField(term12879, term12879.getClass(), "outlineStrokeList", null);
        setField(term12879, term12879.getClass(), "baseOutlineStroke", null);
        setBooleanField(term12879, term12879.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term12879, term12879.getClass(), "shapeList", null);
        setBooleanField(term12879, term12879.getClass(), "autoPopulateSeriesShape", false);
        setField(term12879, term12879.getClass(), "baseShape", null);
        setField(term12879, term12879.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term12879, term12879.getClass(), "baseItemLabelsVisible", false);
        setField(term12879, term12879.getClass(), "itemLabelFontList", null);
        setField(term12879, term12879.getClass(), "baseItemLabelFont", null);
        setField(term12879, term12879.getClass(), "itemLabelPaintList", null);
        setField(term12879, term12879.getClass(), "baseItemLabelPaint", null);
        setField(term12879, term12879.getClass(), "positiveItemLabelPositionList", null);
        setField(term12879, term12879.getClass(), "basePositiveItemLabelPosition", null);
        setField(term12879, term12879.getClass(), "negativeItemLabelPositionList", null);
        setField(term12879, term12879.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term12879, term12879.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term12879, term12879.getClass(), "createEntitiesList", null);
        setBooleanField(term12879, term12879.getClass(), "baseCreateEntities", false);
        setField(term12879, term12879.getClass(), "listenerList", null);
        setField(term12879, term12879.getClass(), "event", null);
        term12901 = new Integer(0);
        term12903 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.renderer.category.CategoryItemRendererState");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.CategoryPlot");
        argTypes[4] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        argTypes[5] = Class.forName("org.jfree.chart.axis.ValueAxis");
        argTypes[6] = Class.forName("org.jfree.data.statistics.StatisticalCategoryDataset");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = term12901;
        args[8] = term12903;
        callMethod(klass, "drawHorizontalItem", argTypes, term12879, args);
    }

};


