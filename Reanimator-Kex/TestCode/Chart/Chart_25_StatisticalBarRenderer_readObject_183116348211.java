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

public class StatisticalBarRenderer_readObject_183116348211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9734;

    public StatisticalBarRenderer_readObject_183116348211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9734 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term9734, term9734.getClass(), "errorIndicatorPaint", null);
        setField(term9734, term9734.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term9734, term9734.getClass(), "itemMargin", 0.0);
        setBooleanField(term9734, term9734.getClass(), "drawBarOutline", false);
        setDoubleField(term9734, term9734.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term9734, term9734.getClass(), "minimumBarLength", 0.0);
        setField(term9734, term9734.getClass(), "gradientPaintTransformer", null);
        setField(term9734, term9734.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term9734, term9734.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term9734, term9734.getClass(), "upperClip", 0.0);
        setDoubleField(term9734, term9734.getClass(), "lowerClip", 0.0);
        setDoubleField(term9734, term9734.getClass(), "base", 0.0);
        setBooleanField(term9734, term9734.getClass(), "includeBaseInRange", false);
        setField(term9734, term9734.getClass(), "plot", null);
        setField(term9734, term9734.getClass(), "itemLabelGeneratorList", null);
        setField(term9734, term9734.getClass(), "baseItemLabelGenerator", null);
        setField(term9734, term9734.getClass(), "toolTipGeneratorList", null);
        setField(term9734, term9734.getClass(), "baseToolTipGenerator", null);
        setField(term9734, term9734.getClass(), "urlGeneratorList", null);
        setField(term9734, term9734.getClass(), "baseURLGenerator", null);
        setField(term9734, term9734.getClass(), "legendItemLabelGenerator", null);
        setField(term9734, term9734.getClass(), "legendItemToolTipGenerator", null);
        setField(term9734, term9734.getClass(), "legendItemURLGenerator", null);
        setField(term9734, term9734.getClass(), "backgroundAnnotations", null);
        setField(term9734, term9734.getClass(), "foregroundAnnotations", null);
        setIntField(term9734, term9734.getClass(), "rowCount", 0);
        setIntField(term9734, term9734.getClass(), "columnCount", 0);
        setField(term9734, term9734.getClass(), "seriesVisibleList", null);
        setBooleanField(term9734, term9734.getClass(), "baseSeriesVisible", false);
        setField(term9734, term9734.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term9734, term9734.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term9734, term9734.getClass(), "paintList", null);
        setBooleanField(term9734, term9734.getClass(), "autoPopulateSeriesPaint", false);
        setField(term9734, term9734.getClass(), "basePaint", null);
        setField(term9734, term9734.getClass(), "fillPaintList", null);
        setBooleanField(term9734, term9734.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term9734, term9734.getClass(), "baseFillPaint", null);
        setField(term9734, term9734.getClass(), "outlinePaintList", null);
        setBooleanField(term9734, term9734.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term9734, term9734.getClass(), "baseOutlinePaint", null);
        setField(term9734, term9734.getClass(), "strokeList", null);
        setBooleanField(term9734, term9734.getClass(), "autoPopulateSeriesStroke", false);
        setField(term9734, term9734.getClass(), "baseStroke", null);
        setField(term9734, term9734.getClass(), "outlineStrokeList", null);
        setField(term9734, term9734.getClass(), "baseOutlineStroke", null);
        setBooleanField(term9734, term9734.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term9734, term9734.getClass(), "shapeList", null);
        setBooleanField(term9734, term9734.getClass(), "autoPopulateSeriesShape", false);
        setField(term9734, term9734.getClass(), "baseShape", null);
        setField(term9734, term9734.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term9734, term9734.getClass(), "baseItemLabelsVisible", false);
        setField(term9734, term9734.getClass(), "itemLabelFontList", null);
        setField(term9734, term9734.getClass(), "baseItemLabelFont", null);
        setField(term9734, term9734.getClass(), "itemLabelPaintList", null);
        setField(term9734, term9734.getClass(), "baseItemLabelPaint", null);
        setField(term9734, term9734.getClass(), "positiveItemLabelPositionList", null);
        setField(term9734, term9734.getClass(), "basePositiveItemLabelPosition", null);
        setField(term9734, term9734.getClass(), "negativeItemLabelPositionList", null);
        setField(term9734, term9734.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term9734, term9734.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term9734, term9734.getClass(), "createEntitiesList", null);
        setBooleanField(term9734, term9734.getClass(), "baseCreateEntities", false);
        setField(term9734, term9734.getClass(), "listenerList", null);
        setField(term9734, term9734.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectInputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readObject", argTypes, term9734, args);
    }

};


