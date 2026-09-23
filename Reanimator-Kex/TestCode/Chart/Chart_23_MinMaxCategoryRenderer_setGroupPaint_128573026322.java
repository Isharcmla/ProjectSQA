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

public class MinMaxCategoryRenderer_setGroupPaint_128573026322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19010;

    public MinMaxCategoryRenderer_setGroupPaint_128573026322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19010 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19010, term19010.getClass(), "plotLines", false);
        setField(term19010, term19010.getClass(), "groupPaint", null);
        setField(term19010, term19010.getClass(), "groupStroke", null);
        setField(term19010, term19010.getClass(), "minIcon", null);
        setField(term19010, term19010.getClass(), "maxIcon", null);
        setField(term19010, term19010.getClass(), "objectIcon", null);
        setIntField(term19010, term19010.getClass(), "lastCategory", 0);
        setDoubleField(term19010, term19010.getClass(), "min", 0.0);
        setDoubleField(term19010, term19010.getClass(), "max", 0.0);
        setField(term19010, term19010.getClass(), "plot", null);
        setField(term19010, term19010.getClass(), "itemLabelGeneratorList", null);
        setField(term19010, term19010.getClass(), "baseItemLabelGenerator", null);
        setField(term19010, term19010.getClass(), "toolTipGeneratorList", null);
        setField(term19010, term19010.getClass(), "baseToolTipGenerator", null);
        setField(term19010, term19010.getClass(), "urlGeneratorList", null);
        setField(term19010, term19010.getClass(), "baseURLGenerator", null);
        setField(term19010, term19010.getClass(), "legendItemLabelGenerator", null);
        setField(term19010, term19010.getClass(), "legendItemToolTipGenerator", null);
        setField(term19010, term19010.getClass(), "legendItemURLGenerator", null);
        setField(term19010, term19010.getClass(), "backgroundAnnotations", null);
        setField(term19010, term19010.getClass(), "foregroundAnnotations", null);
        setIntField(term19010, term19010.getClass(), "rowCount", 0);
        setIntField(term19010, term19010.getClass(), "columnCount", 0);
        setField(term19010, term19010.getClass(), "seriesVisibleList", null);
        setBooleanField(term19010, term19010.getClass(), "baseSeriesVisible", false);
        setField(term19010, term19010.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19010, term19010.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19010, term19010.getClass(), "paintList", null);
        setBooleanField(term19010, term19010.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19010, term19010.getClass(), "basePaint", null);
        setField(term19010, term19010.getClass(), "fillPaintList", null);
        setBooleanField(term19010, term19010.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19010, term19010.getClass(), "baseFillPaint", null);
        setField(term19010, term19010.getClass(), "outlinePaintList", null);
        setBooleanField(term19010, term19010.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19010, term19010.getClass(), "baseOutlinePaint", null);
        setField(term19010, term19010.getClass(), "strokeList", null);
        setBooleanField(term19010, term19010.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19010, term19010.getClass(), "baseStroke", null);
        setField(term19010, term19010.getClass(), "outlineStrokeList", null);
        setField(term19010, term19010.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19010, term19010.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19010, term19010.getClass(), "shapeList", null);
        setBooleanField(term19010, term19010.getClass(), "autoPopulateSeriesShape", false);
        setField(term19010, term19010.getClass(), "baseShape", null);
        setField(term19010, term19010.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19010, term19010.getClass(), "baseItemLabelsVisible", false);
        setField(term19010, term19010.getClass(), "itemLabelFontList", null);
        setField(term19010, term19010.getClass(), "baseItemLabelFont", null);
        setField(term19010, term19010.getClass(), "itemLabelPaintList", null);
        setField(term19010, term19010.getClass(), "baseItemLabelPaint", null);
        setField(term19010, term19010.getClass(), "positiveItemLabelPositionList", null);
        setField(term19010, term19010.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19010, term19010.getClass(), "negativeItemLabelPositionList", null);
        setField(term19010, term19010.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19010, term19010.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19010, term19010.getClass(), "createEntitiesList", null);
        setBooleanField(term19010, term19010.getClass(), "baseCreateEntities", false);
        setField(term19010, term19010.getClass(), "listenerList", null);
        setField(term19010, term19010.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Paint");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGroupPaint", argTypes, term19010, args);
    }

};


