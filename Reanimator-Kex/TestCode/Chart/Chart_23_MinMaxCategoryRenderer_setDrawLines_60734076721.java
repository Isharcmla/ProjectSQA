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
import java.lang.Boolean;

public class MinMaxCategoryRenderer_setDrawLines_60734076721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18990;
     Object term19008;

    public MinMaxCategoryRenderer_setDrawLines_60734076721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18990 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term18990, term18990.getClass(), "plotLines", false);
        setField(term18990, term18990.getClass(), "groupPaint", null);
        setField(term18990, term18990.getClass(), "groupStroke", null);
        setField(term18990, term18990.getClass(), "minIcon", null);
        setField(term18990, term18990.getClass(), "maxIcon", null);
        setField(term18990, term18990.getClass(), "objectIcon", null);
        setIntField(term18990, term18990.getClass(), "lastCategory", 0);
        setDoubleField(term18990, term18990.getClass(), "min", 0.0);
        setDoubleField(term18990, term18990.getClass(), "max", 0.0);
        setField(term18990, term18990.getClass(), "plot", null);
        setField(term18990, term18990.getClass(), "itemLabelGeneratorList", null);
        setField(term18990, term18990.getClass(), "baseItemLabelGenerator", null);
        setField(term18990, term18990.getClass(), "toolTipGeneratorList", null);
        setField(term18990, term18990.getClass(), "baseToolTipGenerator", null);
        setField(term18990, term18990.getClass(), "urlGeneratorList", null);
        setField(term18990, term18990.getClass(), "baseURLGenerator", null);
        setField(term18990, term18990.getClass(), "legendItemLabelGenerator", null);
        setField(term18990, term18990.getClass(), "legendItemToolTipGenerator", null);
        setField(term18990, term18990.getClass(), "legendItemURLGenerator", null);
        setField(term18990, term18990.getClass(), "backgroundAnnotations", null);
        setField(term18990, term18990.getClass(), "foregroundAnnotations", null);
        setIntField(term18990, term18990.getClass(), "rowCount", 0);
        setIntField(term18990, term18990.getClass(), "columnCount", 0);
        setField(term18990, term18990.getClass(), "seriesVisibleList", null);
        setBooleanField(term18990, term18990.getClass(), "baseSeriesVisible", false);
        setField(term18990, term18990.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term18990, term18990.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term18990, term18990.getClass(), "paintList", null);
        setBooleanField(term18990, term18990.getClass(), "autoPopulateSeriesPaint", false);
        setField(term18990, term18990.getClass(), "basePaint", null);
        setField(term18990, term18990.getClass(), "fillPaintList", null);
        setBooleanField(term18990, term18990.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term18990, term18990.getClass(), "baseFillPaint", null);
        setField(term18990, term18990.getClass(), "outlinePaintList", null);
        setBooleanField(term18990, term18990.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term18990, term18990.getClass(), "baseOutlinePaint", null);
        setField(term18990, term18990.getClass(), "strokeList", null);
        setBooleanField(term18990, term18990.getClass(), "autoPopulateSeriesStroke", false);
        setField(term18990, term18990.getClass(), "baseStroke", null);
        setField(term18990, term18990.getClass(), "outlineStrokeList", null);
        setField(term18990, term18990.getClass(), "baseOutlineStroke", null);
        setBooleanField(term18990, term18990.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term18990, term18990.getClass(), "shapeList", null);
        setBooleanField(term18990, term18990.getClass(), "autoPopulateSeriesShape", false);
        setField(term18990, term18990.getClass(), "baseShape", null);
        setField(term18990, term18990.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term18990, term18990.getClass(), "baseItemLabelsVisible", false);
        setField(term18990, term18990.getClass(), "itemLabelFontList", null);
        setField(term18990, term18990.getClass(), "baseItemLabelFont", null);
        setField(term18990, term18990.getClass(), "itemLabelPaintList", null);
        setField(term18990, term18990.getClass(), "baseItemLabelPaint", null);
        setField(term18990, term18990.getClass(), "positiveItemLabelPositionList", null);
        setField(term18990, term18990.getClass(), "basePositiveItemLabelPosition", null);
        setField(term18990, term18990.getClass(), "negativeItemLabelPositionList", null);
        setField(term18990, term18990.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term18990, term18990.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term18990, term18990.getClass(), "createEntitiesList", null);
        setBooleanField(term18990, term18990.getClass(), "baseCreateEntities", false);
        setField(term18990, term18990.getClass(), "listenerList", null);
        setField(term18990, term18990.getClass(), "event", null);
        term19008 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19008;
        callMethod(klass, "setDrawLines", argTypes, term18990, args);
    }

};


