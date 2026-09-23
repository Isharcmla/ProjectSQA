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

public class StatisticalBarRenderer_equals_92619656820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12931;

    public StatisticalBarRenderer_equals_92619656820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12931 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term12931, term12931.getClass(), "errorIndicatorPaint", null);
        setField(term12931, term12931.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term12931, term12931.getClass(), "itemMargin", 0.0);
        setBooleanField(term12931, term12931.getClass(), "drawBarOutline", false);
        setDoubleField(term12931, term12931.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term12931, term12931.getClass(), "minimumBarLength", 0.0);
        setField(term12931, term12931.getClass(), "gradientPaintTransformer", null);
        setField(term12931, term12931.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term12931, term12931.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term12931, term12931.getClass(), "upperClip", 0.0);
        setDoubleField(term12931, term12931.getClass(), "lowerClip", 0.0);
        setDoubleField(term12931, term12931.getClass(), "base", 0.0);
        setBooleanField(term12931, term12931.getClass(), "includeBaseInRange", false);
        setField(term12931, term12931.getClass(), "plot", null);
        setField(term12931, term12931.getClass(), "itemLabelGeneratorList", null);
        setField(term12931, term12931.getClass(), "baseItemLabelGenerator", null);
        setField(term12931, term12931.getClass(), "toolTipGeneratorList", null);
        setField(term12931, term12931.getClass(), "baseToolTipGenerator", null);
        setField(term12931, term12931.getClass(), "urlGeneratorList", null);
        setField(term12931, term12931.getClass(), "baseURLGenerator", null);
        setField(term12931, term12931.getClass(), "legendItemLabelGenerator", null);
        setField(term12931, term12931.getClass(), "legendItemToolTipGenerator", null);
        setField(term12931, term12931.getClass(), "legendItemURLGenerator", null);
        setField(term12931, term12931.getClass(), "backgroundAnnotations", null);
        setField(term12931, term12931.getClass(), "foregroundAnnotations", null);
        setIntField(term12931, term12931.getClass(), "rowCount", 0);
        setIntField(term12931, term12931.getClass(), "columnCount", 0);
        setField(term12931, term12931.getClass(), "seriesVisibleList", null);
        setBooleanField(term12931, term12931.getClass(), "baseSeriesVisible", false);
        setField(term12931, term12931.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term12931, term12931.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term12931, term12931.getClass(), "paintList", null);
        setBooleanField(term12931, term12931.getClass(), "autoPopulateSeriesPaint", false);
        setField(term12931, term12931.getClass(), "basePaint", null);
        setField(term12931, term12931.getClass(), "fillPaintList", null);
        setBooleanField(term12931, term12931.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term12931, term12931.getClass(), "baseFillPaint", null);
        setField(term12931, term12931.getClass(), "outlinePaintList", null);
        setBooleanField(term12931, term12931.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term12931, term12931.getClass(), "baseOutlinePaint", null);
        setField(term12931, term12931.getClass(), "strokeList", null);
        setBooleanField(term12931, term12931.getClass(), "autoPopulateSeriesStroke", false);
        setField(term12931, term12931.getClass(), "baseStroke", null);
        setField(term12931, term12931.getClass(), "outlineStrokeList", null);
        setField(term12931, term12931.getClass(), "baseOutlineStroke", null);
        setBooleanField(term12931, term12931.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term12931, term12931.getClass(), "shapeList", null);
        setBooleanField(term12931, term12931.getClass(), "autoPopulateSeriesShape", false);
        setField(term12931, term12931.getClass(), "baseShape", null);
        setField(term12931, term12931.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term12931, term12931.getClass(), "baseItemLabelsVisible", false);
        setField(term12931, term12931.getClass(), "itemLabelFontList", null);
        setField(term12931, term12931.getClass(), "baseItemLabelFont", null);
        setField(term12931, term12931.getClass(), "itemLabelPaintList", null);
        setField(term12931, term12931.getClass(), "baseItemLabelPaint", null);
        setField(term12931, term12931.getClass(), "positiveItemLabelPositionList", null);
        setField(term12931, term12931.getClass(), "basePositiveItemLabelPosition", null);
        setField(term12931, term12931.getClass(), "negativeItemLabelPositionList", null);
        setField(term12931, term12931.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term12931, term12931.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term12931, term12931.getClass(), "createEntitiesList", null);
        setBooleanField(term12931, term12931.getClass(), "baseCreateEntities", false);
        setField(term12931, term12931.getClass(), "listenerList", null);
        setField(term12931, term12931.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term12931, args);
    }

};


