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

public class StatisticalBarRenderer_writeObject_110557478221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12953;

    public StatisticalBarRenderer_writeObject_110557478221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12953 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term12953, term12953.getClass(), "errorIndicatorPaint", null);
        setField(term12953, term12953.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term12953, term12953.getClass(), "itemMargin", 0.0);
        setBooleanField(term12953, term12953.getClass(), "drawBarOutline", false);
        setDoubleField(term12953, term12953.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term12953, term12953.getClass(), "minimumBarLength", 0.0);
        setField(term12953, term12953.getClass(), "gradientPaintTransformer", null);
        setField(term12953, term12953.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term12953, term12953.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term12953, term12953.getClass(), "upperClip", 0.0);
        setDoubleField(term12953, term12953.getClass(), "lowerClip", 0.0);
        setDoubleField(term12953, term12953.getClass(), "base", 0.0);
        setBooleanField(term12953, term12953.getClass(), "includeBaseInRange", false);
        setField(term12953, term12953.getClass(), "plot", null);
        setField(term12953, term12953.getClass(), "itemLabelGeneratorList", null);
        setField(term12953, term12953.getClass(), "baseItemLabelGenerator", null);
        setField(term12953, term12953.getClass(), "toolTipGeneratorList", null);
        setField(term12953, term12953.getClass(), "baseToolTipGenerator", null);
        setField(term12953, term12953.getClass(), "urlGeneratorList", null);
        setField(term12953, term12953.getClass(), "baseURLGenerator", null);
        setField(term12953, term12953.getClass(), "legendItemLabelGenerator", null);
        setField(term12953, term12953.getClass(), "legendItemToolTipGenerator", null);
        setField(term12953, term12953.getClass(), "legendItemURLGenerator", null);
        setField(term12953, term12953.getClass(), "backgroundAnnotations", null);
        setField(term12953, term12953.getClass(), "foregroundAnnotations", null);
        setIntField(term12953, term12953.getClass(), "rowCount", 0);
        setIntField(term12953, term12953.getClass(), "columnCount", 0);
        setField(term12953, term12953.getClass(), "seriesVisibleList", null);
        setBooleanField(term12953, term12953.getClass(), "baseSeriesVisible", false);
        setField(term12953, term12953.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term12953, term12953.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term12953, term12953.getClass(), "paintList", null);
        setBooleanField(term12953, term12953.getClass(), "autoPopulateSeriesPaint", false);
        setField(term12953, term12953.getClass(), "basePaint", null);
        setField(term12953, term12953.getClass(), "fillPaintList", null);
        setBooleanField(term12953, term12953.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term12953, term12953.getClass(), "baseFillPaint", null);
        setField(term12953, term12953.getClass(), "outlinePaintList", null);
        setBooleanField(term12953, term12953.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term12953, term12953.getClass(), "baseOutlinePaint", null);
        setField(term12953, term12953.getClass(), "strokeList", null);
        setBooleanField(term12953, term12953.getClass(), "autoPopulateSeriesStroke", false);
        setField(term12953, term12953.getClass(), "baseStroke", null);
        setField(term12953, term12953.getClass(), "outlineStrokeList", null);
        setField(term12953, term12953.getClass(), "baseOutlineStroke", null);
        setBooleanField(term12953, term12953.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term12953, term12953.getClass(), "shapeList", null);
        setBooleanField(term12953, term12953.getClass(), "autoPopulateSeriesShape", false);
        setField(term12953, term12953.getClass(), "baseShape", null);
        setField(term12953, term12953.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term12953, term12953.getClass(), "baseItemLabelsVisible", false);
        setField(term12953, term12953.getClass(), "itemLabelFontList", null);
        setField(term12953, term12953.getClass(), "baseItemLabelFont", null);
        setField(term12953, term12953.getClass(), "itemLabelPaintList", null);
        setField(term12953, term12953.getClass(), "baseItemLabelPaint", null);
        setField(term12953, term12953.getClass(), "positiveItemLabelPositionList", null);
        setField(term12953, term12953.getClass(), "basePositiveItemLabelPosition", null);
        setField(term12953, term12953.getClass(), "negativeItemLabelPositionList", null);
        setField(term12953, term12953.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term12953, term12953.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term12953, term12953.getClass(), "createEntitiesList", null);
        setBooleanField(term12953, term12953.getClass(), "baseCreateEntities", false);
        setField(term12953, term12953.getClass(), "listenerList", null);
        setField(term12953, term12953.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeObject", argTypes, term12953, args);
    }

};


