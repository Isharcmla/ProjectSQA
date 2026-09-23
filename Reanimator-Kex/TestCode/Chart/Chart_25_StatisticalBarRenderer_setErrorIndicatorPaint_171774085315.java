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

public class StatisticalBarRenderer_setErrorIndicatorPaint_171774085315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12807;

    public StatisticalBarRenderer_setErrorIndicatorPaint_171774085315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12807 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term12807, term12807.getClass(), "errorIndicatorPaint", null);
        setField(term12807, term12807.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term12807, term12807.getClass(), "itemMargin", 0.0);
        setBooleanField(term12807, term12807.getClass(), "drawBarOutline", false);
        setDoubleField(term12807, term12807.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term12807, term12807.getClass(), "minimumBarLength", 0.0);
        setField(term12807, term12807.getClass(), "gradientPaintTransformer", null);
        setField(term12807, term12807.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term12807, term12807.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term12807, term12807.getClass(), "upperClip", 0.0);
        setDoubleField(term12807, term12807.getClass(), "lowerClip", 0.0);
        setDoubleField(term12807, term12807.getClass(), "base", 0.0);
        setBooleanField(term12807, term12807.getClass(), "includeBaseInRange", false);
        setField(term12807, term12807.getClass(), "plot", null);
        setField(term12807, term12807.getClass(), "itemLabelGeneratorList", null);
        setField(term12807, term12807.getClass(), "baseItemLabelGenerator", null);
        setField(term12807, term12807.getClass(), "toolTipGeneratorList", null);
        setField(term12807, term12807.getClass(), "baseToolTipGenerator", null);
        setField(term12807, term12807.getClass(), "urlGeneratorList", null);
        setField(term12807, term12807.getClass(), "baseURLGenerator", null);
        setField(term12807, term12807.getClass(), "legendItemLabelGenerator", null);
        setField(term12807, term12807.getClass(), "legendItemToolTipGenerator", null);
        setField(term12807, term12807.getClass(), "legendItemURLGenerator", null);
        setField(term12807, term12807.getClass(), "backgroundAnnotations", null);
        setField(term12807, term12807.getClass(), "foregroundAnnotations", null);
        setIntField(term12807, term12807.getClass(), "rowCount", 0);
        setIntField(term12807, term12807.getClass(), "columnCount", 0);
        setField(term12807, term12807.getClass(), "seriesVisibleList", null);
        setBooleanField(term12807, term12807.getClass(), "baseSeriesVisible", false);
        setField(term12807, term12807.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term12807, term12807.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term12807, term12807.getClass(), "paintList", null);
        setBooleanField(term12807, term12807.getClass(), "autoPopulateSeriesPaint", false);
        setField(term12807, term12807.getClass(), "basePaint", null);
        setField(term12807, term12807.getClass(), "fillPaintList", null);
        setBooleanField(term12807, term12807.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term12807, term12807.getClass(), "baseFillPaint", null);
        setField(term12807, term12807.getClass(), "outlinePaintList", null);
        setBooleanField(term12807, term12807.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term12807, term12807.getClass(), "baseOutlinePaint", null);
        setField(term12807, term12807.getClass(), "strokeList", null);
        setBooleanField(term12807, term12807.getClass(), "autoPopulateSeriesStroke", false);
        setField(term12807, term12807.getClass(), "baseStroke", null);
        setField(term12807, term12807.getClass(), "outlineStrokeList", null);
        setField(term12807, term12807.getClass(), "baseOutlineStroke", null);
        setBooleanField(term12807, term12807.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term12807, term12807.getClass(), "shapeList", null);
        setBooleanField(term12807, term12807.getClass(), "autoPopulateSeriesShape", false);
        setField(term12807, term12807.getClass(), "baseShape", null);
        setField(term12807, term12807.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term12807, term12807.getClass(), "baseItemLabelsVisible", false);
        setField(term12807, term12807.getClass(), "itemLabelFontList", null);
        setField(term12807, term12807.getClass(), "baseItemLabelFont", null);
        setField(term12807, term12807.getClass(), "itemLabelPaintList", null);
        setField(term12807, term12807.getClass(), "baseItemLabelPaint", null);
        setField(term12807, term12807.getClass(), "positiveItemLabelPositionList", null);
        setField(term12807, term12807.getClass(), "basePositiveItemLabelPosition", null);
        setField(term12807, term12807.getClass(), "negativeItemLabelPositionList", null);
        setField(term12807, term12807.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term12807, term12807.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term12807, term12807.getClass(), "createEntitiesList", null);
        setBooleanField(term12807, term12807.getClass(), "baseCreateEntities", false);
        setField(term12807, term12807.getClass(), "listenerList", null);
        setField(term12807, term12807.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Paint");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setErrorIndicatorPaint", argTypes, term12807, args);
    }

};


