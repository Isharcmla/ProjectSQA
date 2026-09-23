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

public class StatisticalBarRenderer_drawItem_103106778617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12851;
     Object term12873;
     Object term12875;
     Object term12877;

    public StatisticalBarRenderer_drawItem_103106778617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12851 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term12851, term12851.getClass(), "errorIndicatorPaint", null);
        setField(term12851, term12851.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term12851, term12851.getClass(), "itemMargin", 0.0);
        setBooleanField(term12851, term12851.getClass(), "drawBarOutline", false);
        setDoubleField(term12851, term12851.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term12851, term12851.getClass(), "minimumBarLength", 0.0);
        setField(term12851, term12851.getClass(), "gradientPaintTransformer", null);
        setField(term12851, term12851.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term12851, term12851.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term12851, term12851.getClass(), "upperClip", 0.0);
        setDoubleField(term12851, term12851.getClass(), "lowerClip", 0.0);
        setDoubleField(term12851, term12851.getClass(), "base", 0.0);
        setBooleanField(term12851, term12851.getClass(), "includeBaseInRange", false);
        setField(term12851, term12851.getClass(), "plot", null);
        setField(term12851, term12851.getClass(), "itemLabelGeneratorList", null);
        setField(term12851, term12851.getClass(), "baseItemLabelGenerator", null);
        setField(term12851, term12851.getClass(), "toolTipGeneratorList", null);
        setField(term12851, term12851.getClass(), "baseToolTipGenerator", null);
        setField(term12851, term12851.getClass(), "urlGeneratorList", null);
        setField(term12851, term12851.getClass(), "baseURLGenerator", null);
        setField(term12851, term12851.getClass(), "legendItemLabelGenerator", null);
        setField(term12851, term12851.getClass(), "legendItemToolTipGenerator", null);
        setField(term12851, term12851.getClass(), "legendItemURLGenerator", null);
        setField(term12851, term12851.getClass(), "backgroundAnnotations", null);
        setField(term12851, term12851.getClass(), "foregroundAnnotations", null);
        setIntField(term12851, term12851.getClass(), "rowCount", 0);
        setIntField(term12851, term12851.getClass(), "columnCount", 0);
        setField(term12851, term12851.getClass(), "seriesVisibleList", null);
        setBooleanField(term12851, term12851.getClass(), "baseSeriesVisible", false);
        setField(term12851, term12851.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term12851, term12851.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term12851, term12851.getClass(), "paintList", null);
        setBooleanField(term12851, term12851.getClass(), "autoPopulateSeriesPaint", false);
        setField(term12851, term12851.getClass(), "basePaint", null);
        setField(term12851, term12851.getClass(), "fillPaintList", null);
        setBooleanField(term12851, term12851.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term12851, term12851.getClass(), "baseFillPaint", null);
        setField(term12851, term12851.getClass(), "outlinePaintList", null);
        setBooleanField(term12851, term12851.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term12851, term12851.getClass(), "baseOutlinePaint", null);
        setField(term12851, term12851.getClass(), "strokeList", null);
        setBooleanField(term12851, term12851.getClass(), "autoPopulateSeriesStroke", false);
        setField(term12851, term12851.getClass(), "baseStroke", null);
        setField(term12851, term12851.getClass(), "outlineStrokeList", null);
        setField(term12851, term12851.getClass(), "baseOutlineStroke", null);
        setBooleanField(term12851, term12851.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term12851, term12851.getClass(), "shapeList", null);
        setBooleanField(term12851, term12851.getClass(), "autoPopulateSeriesShape", false);
        setField(term12851, term12851.getClass(), "baseShape", null);
        setField(term12851, term12851.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term12851, term12851.getClass(), "baseItemLabelsVisible", false);
        setField(term12851, term12851.getClass(), "itemLabelFontList", null);
        setField(term12851, term12851.getClass(), "baseItemLabelFont", null);
        setField(term12851, term12851.getClass(), "itemLabelPaintList", null);
        setField(term12851, term12851.getClass(), "baseItemLabelPaint", null);
        setField(term12851, term12851.getClass(), "positiveItemLabelPositionList", null);
        setField(term12851, term12851.getClass(), "basePositiveItemLabelPosition", null);
        setField(term12851, term12851.getClass(), "negativeItemLabelPositionList", null);
        setField(term12851, term12851.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term12851, term12851.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term12851, term12851.getClass(), "createEntitiesList", null);
        setBooleanField(term12851, term12851.getClass(), "baseCreateEntities", false);
        setField(term12851, term12851.getClass(), "listenerList", null);
        setField(term12851, term12851.getClass(), "event", null);
        term12873 = new Integer(0);
        term12875 = new Integer(0);
        term12877 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.renderer.category.CategoryItemRendererState");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.CategoryPlot");
        argTypes[4] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        argTypes[5] = Class.forName("org.jfree.chart.axis.ValueAxis");
        argTypes[6] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = term12873;
        args[8] = term12875;
        args[9] = term12877;
        callMethod(klass, "drawItem", argTypes, term12851, args);
    }

};


