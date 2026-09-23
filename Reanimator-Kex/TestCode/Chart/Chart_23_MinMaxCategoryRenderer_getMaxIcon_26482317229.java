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

public class MinMaxCategoryRenderer_getMaxIcon_26482317229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19136;

    public MinMaxCategoryRenderer_getMaxIcon_26482317229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19136 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19136, term19136.getClass(), "plotLines", false);
        setField(term19136, term19136.getClass(), "groupPaint", null);
        setField(term19136, term19136.getClass(), "groupStroke", null);
        setField(term19136, term19136.getClass(), "minIcon", null);
        setField(term19136, term19136.getClass(), "maxIcon", null);
        setField(term19136, term19136.getClass(), "objectIcon", null);
        setIntField(term19136, term19136.getClass(), "lastCategory", 0);
        setDoubleField(term19136, term19136.getClass(), "min", 0.0);
        setDoubleField(term19136, term19136.getClass(), "max", 0.0);
        setField(term19136, term19136.getClass(), "plot", null);
        setField(term19136, term19136.getClass(), "itemLabelGeneratorList", null);
        setField(term19136, term19136.getClass(), "baseItemLabelGenerator", null);
        setField(term19136, term19136.getClass(), "toolTipGeneratorList", null);
        setField(term19136, term19136.getClass(), "baseToolTipGenerator", null);
        setField(term19136, term19136.getClass(), "urlGeneratorList", null);
        setField(term19136, term19136.getClass(), "baseURLGenerator", null);
        setField(term19136, term19136.getClass(), "legendItemLabelGenerator", null);
        setField(term19136, term19136.getClass(), "legendItemToolTipGenerator", null);
        setField(term19136, term19136.getClass(), "legendItemURLGenerator", null);
        setField(term19136, term19136.getClass(), "backgroundAnnotations", null);
        setField(term19136, term19136.getClass(), "foregroundAnnotations", null);
        setIntField(term19136, term19136.getClass(), "rowCount", 0);
        setIntField(term19136, term19136.getClass(), "columnCount", 0);
        setField(term19136, term19136.getClass(), "seriesVisibleList", null);
        setBooleanField(term19136, term19136.getClass(), "baseSeriesVisible", false);
        setField(term19136, term19136.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19136, term19136.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19136, term19136.getClass(), "paintList", null);
        setBooleanField(term19136, term19136.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19136, term19136.getClass(), "basePaint", null);
        setField(term19136, term19136.getClass(), "fillPaintList", null);
        setBooleanField(term19136, term19136.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19136, term19136.getClass(), "baseFillPaint", null);
        setField(term19136, term19136.getClass(), "outlinePaintList", null);
        setBooleanField(term19136, term19136.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19136, term19136.getClass(), "baseOutlinePaint", null);
        setField(term19136, term19136.getClass(), "strokeList", null);
        setBooleanField(term19136, term19136.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19136, term19136.getClass(), "baseStroke", null);
        setField(term19136, term19136.getClass(), "outlineStrokeList", null);
        setField(term19136, term19136.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19136, term19136.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19136, term19136.getClass(), "shapeList", null);
        setBooleanField(term19136, term19136.getClass(), "autoPopulateSeriesShape", false);
        setField(term19136, term19136.getClass(), "baseShape", null);
        setField(term19136, term19136.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19136, term19136.getClass(), "baseItemLabelsVisible", false);
        setField(term19136, term19136.getClass(), "itemLabelFontList", null);
        setField(term19136, term19136.getClass(), "baseItemLabelFont", null);
        setField(term19136, term19136.getClass(), "itemLabelPaintList", null);
        setField(term19136, term19136.getClass(), "baseItemLabelPaint", null);
        setField(term19136, term19136.getClass(), "positiveItemLabelPositionList", null);
        setField(term19136, term19136.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19136, term19136.getClass(), "negativeItemLabelPositionList", null);
        setField(term19136, term19136.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19136, term19136.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19136, term19136.getClass(), "createEntitiesList", null);
        setBooleanField(term19136, term19136.getClass(), "baseCreateEntities", false);
        setField(term19136, term19136.getClass(), "listenerList", null);
        setField(term19136, term19136.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxIcon", argTypes, term19136, args);
    }

};


