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

public class MinMaxCategoryRenderer_getGroupStroke_16320180123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19028;

    public MinMaxCategoryRenderer_getGroupStroke_16320180123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19028 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19028, term19028.getClass(), "plotLines", false);
        setField(term19028, term19028.getClass(), "groupPaint", null);
        setField(term19028, term19028.getClass(), "groupStroke", null);
        setField(term19028, term19028.getClass(), "minIcon", null);
        setField(term19028, term19028.getClass(), "maxIcon", null);
        setField(term19028, term19028.getClass(), "objectIcon", null);
        setIntField(term19028, term19028.getClass(), "lastCategory", 0);
        setDoubleField(term19028, term19028.getClass(), "min", 0.0);
        setDoubleField(term19028, term19028.getClass(), "max", 0.0);
        setField(term19028, term19028.getClass(), "plot", null);
        setField(term19028, term19028.getClass(), "itemLabelGeneratorList", null);
        setField(term19028, term19028.getClass(), "baseItemLabelGenerator", null);
        setField(term19028, term19028.getClass(), "toolTipGeneratorList", null);
        setField(term19028, term19028.getClass(), "baseToolTipGenerator", null);
        setField(term19028, term19028.getClass(), "urlGeneratorList", null);
        setField(term19028, term19028.getClass(), "baseURLGenerator", null);
        setField(term19028, term19028.getClass(), "legendItemLabelGenerator", null);
        setField(term19028, term19028.getClass(), "legendItemToolTipGenerator", null);
        setField(term19028, term19028.getClass(), "legendItemURLGenerator", null);
        setField(term19028, term19028.getClass(), "backgroundAnnotations", null);
        setField(term19028, term19028.getClass(), "foregroundAnnotations", null);
        setIntField(term19028, term19028.getClass(), "rowCount", 0);
        setIntField(term19028, term19028.getClass(), "columnCount", 0);
        setField(term19028, term19028.getClass(), "seriesVisibleList", null);
        setBooleanField(term19028, term19028.getClass(), "baseSeriesVisible", false);
        setField(term19028, term19028.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19028, term19028.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19028, term19028.getClass(), "paintList", null);
        setBooleanField(term19028, term19028.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19028, term19028.getClass(), "basePaint", null);
        setField(term19028, term19028.getClass(), "fillPaintList", null);
        setBooleanField(term19028, term19028.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19028, term19028.getClass(), "baseFillPaint", null);
        setField(term19028, term19028.getClass(), "outlinePaintList", null);
        setBooleanField(term19028, term19028.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19028, term19028.getClass(), "baseOutlinePaint", null);
        setField(term19028, term19028.getClass(), "strokeList", null);
        setBooleanField(term19028, term19028.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19028, term19028.getClass(), "baseStroke", null);
        setField(term19028, term19028.getClass(), "outlineStrokeList", null);
        setField(term19028, term19028.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19028, term19028.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19028, term19028.getClass(), "shapeList", null);
        setBooleanField(term19028, term19028.getClass(), "autoPopulateSeriesShape", false);
        setField(term19028, term19028.getClass(), "baseShape", null);
        setField(term19028, term19028.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19028, term19028.getClass(), "baseItemLabelsVisible", false);
        setField(term19028, term19028.getClass(), "itemLabelFontList", null);
        setField(term19028, term19028.getClass(), "baseItemLabelFont", null);
        setField(term19028, term19028.getClass(), "itemLabelPaintList", null);
        setField(term19028, term19028.getClass(), "baseItemLabelPaint", null);
        setField(term19028, term19028.getClass(), "positiveItemLabelPositionList", null);
        setField(term19028, term19028.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19028, term19028.getClass(), "negativeItemLabelPositionList", null);
        setField(term19028, term19028.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19028, term19028.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19028, term19028.getClass(), "createEntitiesList", null);
        setBooleanField(term19028, term19028.getClass(), "baseCreateEntities", false);
        setField(term19028, term19028.getClass(), "listenerList", null);
        setField(term19028, term19028.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupStroke", argTypes, term19028, args);
    }

};


