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

public class StatisticalBarRenderer_getErrorIndicatorStroke_210359364314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12785;

    public StatisticalBarRenderer_getErrorIndicatorStroke_210359364314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12785 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term12785, term12785.getClass(), "errorIndicatorPaint", null);
        setField(term12785, term12785.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term12785, term12785.getClass(), "itemMargin", 0.0);
        setBooleanField(term12785, term12785.getClass(), "drawBarOutline", false);
        setDoubleField(term12785, term12785.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term12785, term12785.getClass(), "minimumBarLength", 0.0);
        setField(term12785, term12785.getClass(), "gradientPaintTransformer", null);
        setField(term12785, term12785.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term12785, term12785.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term12785, term12785.getClass(), "upperClip", 0.0);
        setDoubleField(term12785, term12785.getClass(), "lowerClip", 0.0);
        setDoubleField(term12785, term12785.getClass(), "base", 0.0);
        setBooleanField(term12785, term12785.getClass(), "includeBaseInRange", false);
        setField(term12785, term12785.getClass(), "plot", null);
        setField(term12785, term12785.getClass(), "itemLabelGeneratorList", null);
        setField(term12785, term12785.getClass(), "baseItemLabelGenerator", null);
        setField(term12785, term12785.getClass(), "toolTipGeneratorList", null);
        setField(term12785, term12785.getClass(), "baseToolTipGenerator", null);
        setField(term12785, term12785.getClass(), "urlGeneratorList", null);
        setField(term12785, term12785.getClass(), "baseURLGenerator", null);
        setField(term12785, term12785.getClass(), "legendItemLabelGenerator", null);
        setField(term12785, term12785.getClass(), "legendItemToolTipGenerator", null);
        setField(term12785, term12785.getClass(), "legendItemURLGenerator", null);
        setField(term12785, term12785.getClass(), "backgroundAnnotations", null);
        setField(term12785, term12785.getClass(), "foregroundAnnotations", null);
        setIntField(term12785, term12785.getClass(), "rowCount", 0);
        setIntField(term12785, term12785.getClass(), "columnCount", 0);
        setField(term12785, term12785.getClass(), "seriesVisibleList", null);
        setBooleanField(term12785, term12785.getClass(), "baseSeriesVisible", false);
        setField(term12785, term12785.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term12785, term12785.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term12785, term12785.getClass(), "paintList", null);
        setBooleanField(term12785, term12785.getClass(), "autoPopulateSeriesPaint", false);
        setField(term12785, term12785.getClass(), "basePaint", null);
        setField(term12785, term12785.getClass(), "fillPaintList", null);
        setBooleanField(term12785, term12785.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term12785, term12785.getClass(), "baseFillPaint", null);
        setField(term12785, term12785.getClass(), "outlinePaintList", null);
        setBooleanField(term12785, term12785.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term12785, term12785.getClass(), "baseOutlinePaint", null);
        setField(term12785, term12785.getClass(), "strokeList", null);
        setBooleanField(term12785, term12785.getClass(), "autoPopulateSeriesStroke", false);
        setField(term12785, term12785.getClass(), "baseStroke", null);
        setField(term12785, term12785.getClass(), "outlineStrokeList", null);
        setField(term12785, term12785.getClass(), "baseOutlineStroke", null);
        setBooleanField(term12785, term12785.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term12785, term12785.getClass(), "shapeList", null);
        setBooleanField(term12785, term12785.getClass(), "autoPopulateSeriesShape", false);
        setField(term12785, term12785.getClass(), "baseShape", null);
        setField(term12785, term12785.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term12785, term12785.getClass(), "baseItemLabelsVisible", false);
        setField(term12785, term12785.getClass(), "itemLabelFontList", null);
        setField(term12785, term12785.getClass(), "baseItemLabelFont", null);
        setField(term12785, term12785.getClass(), "itemLabelPaintList", null);
        setField(term12785, term12785.getClass(), "baseItemLabelPaint", null);
        setField(term12785, term12785.getClass(), "positiveItemLabelPositionList", null);
        setField(term12785, term12785.getClass(), "basePositiveItemLabelPosition", null);
        setField(term12785, term12785.getClass(), "negativeItemLabelPositionList", null);
        setField(term12785, term12785.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term12785, term12785.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term12785, term12785.getClass(), "createEntitiesList", null);
        setBooleanField(term12785, term12785.getClass(), "baseCreateEntities", false);
        setField(term12785, term12785.getClass(), "listenerList", null);
        setField(term12785, term12785.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorIndicatorStroke", argTypes, term12785, args);
    }

};


