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

public class MinMaxCategoryRenderer_getGroupPaint_71314339920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18972;

    public MinMaxCategoryRenderer_getGroupPaint_71314339920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18972 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term18972, term18972.getClass(), "plotLines", false);
        setField(term18972, term18972.getClass(), "groupPaint", null);
        setField(term18972, term18972.getClass(), "groupStroke", null);
        setField(term18972, term18972.getClass(), "minIcon", null);
        setField(term18972, term18972.getClass(), "maxIcon", null);
        setField(term18972, term18972.getClass(), "objectIcon", null);
        setIntField(term18972, term18972.getClass(), "lastCategory", 0);
        setDoubleField(term18972, term18972.getClass(), "min", 0.0);
        setDoubleField(term18972, term18972.getClass(), "max", 0.0);
        setField(term18972, term18972.getClass(), "plot", null);
        setField(term18972, term18972.getClass(), "itemLabelGeneratorList", null);
        setField(term18972, term18972.getClass(), "baseItemLabelGenerator", null);
        setField(term18972, term18972.getClass(), "toolTipGeneratorList", null);
        setField(term18972, term18972.getClass(), "baseToolTipGenerator", null);
        setField(term18972, term18972.getClass(), "urlGeneratorList", null);
        setField(term18972, term18972.getClass(), "baseURLGenerator", null);
        setField(term18972, term18972.getClass(), "legendItemLabelGenerator", null);
        setField(term18972, term18972.getClass(), "legendItemToolTipGenerator", null);
        setField(term18972, term18972.getClass(), "legendItemURLGenerator", null);
        setField(term18972, term18972.getClass(), "backgroundAnnotations", null);
        setField(term18972, term18972.getClass(), "foregroundAnnotations", null);
        setIntField(term18972, term18972.getClass(), "rowCount", 0);
        setIntField(term18972, term18972.getClass(), "columnCount", 0);
        setField(term18972, term18972.getClass(), "seriesVisibleList", null);
        setBooleanField(term18972, term18972.getClass(), "baseSeriesVisible", false);
        setField(term18972, term18972.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term18972, term18972.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term18972, term18972.getClass(), "paintList", null);
        setBooleanField(term18972, term18972.getClass(), "autoPopulateSeriesPaint", false);
        setField(term18972, term18972.getClass(), "basePaint", null);
        setField(term18972, term18972.getClass(), "fillPaintList", null);
        setBooleanField(term18972, term18972.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term18972, term18972.getClass(), "baseFillPaint", null);
        setField(term18972, term18972.getClass(), "outlinePaintList", null);
        setBooleanField(term18972, term18972.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term18972, term18972.getClass(), "baseOutlinePaint", null);
        setField(term18972, term18972.getClass(), "strokeList", null);
        setBooleanField(term18972, term18972.getClass(), "autoPopulateSeriesStroke", false);
        setField(term18972, term18972.getClass(), "baseStroke", null);
        setField(term18972, term18972.getClass(), "outlineStrokeList", null);
        setField(term18972, term18972.getClass(), "baseOutlineStroke", null);
        setBooleanField(term18972, term18972.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term18972, term18972.getClass(), "shapeList", null);
        setBooleanField(term18972, term18972.getClass(), "autoPopulateSeriesShape", false);
        setField(term18972, term18972.getClass(), "baseShape", null);
        setField(term18972, term18972.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term18972, term18972.getClass(), "baseItemLabelsVisible", false);
        setField(term18972, term18972.getClass(), "itemLabelFontList", null);
        setField(term18972, term18972.getClass(), "baseItemLabelFont", null);
        setField(term18972, term18972.getClass(), "itemLabelPaintList", null);
        setField(term18972, term18972.getClass(), "baseItemLabelPaint", null);
        setField(term18972, term18972.getClass(), "positiveItemLabelPositionList", null);
        setField(term18972, term18972.getClass(), "basePositiveItemLabelPosition", null);
        setField(term18972, term18972.getClass(), "negativeItemLabelPositionList", null);
        setField(term18972, term18972.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term18972, term18972.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term18972, term18972.getClass(), "createEntitiesList", null);
        setBooleanField(term18972, term18972.getClass(), "baseCreateEntities", false);
        setField(term18972, term18972.getClass(), "listenerList", null);
        setField(term18972, term18972.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupPaint", argTypes, term18972, args);
    }

};


