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

public class MinMaxCategoryRenderer_getIcon_84116873334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19232;
     Object term19250;
     Object term19252;

    public MinMaxCategoryRenderer_getIcon_84116873334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19232 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19232, term19232.getClass(), "plotLines", false);
        setField(term19232, term19232.getClass(), "groupPaint", null);
        setField(term19232, term19232.getClass(), "groupStroke", null);
        setField(term19232, term19232.getClass(), "minIcon", null);
        setField(term19232, term19232.getClass(), "maxIcon", null);
        setField(term19232, term19232.getClass(), "objectIcon", null);
        setIntField(term19232, term19232.getClass(), "lastCategory", 0);
        setDoubleField(term19232, term19232.getClass(), "min", 0.0);
        setDoubleField(term19232, term19232.getClass(), "max", 0.0);
        setField(term19232, term19232.getClass(), "plot", null);
        setField(term19232, term19232.getClass(), "itemLabelGeneratorList", null);
        setField(term19232, term19232.getClass(), "baseItemLabelGenerator", null);
        setField(term19232, term19232.getClass(), "toolTipGeneratorList", null);
        setField(term19232, term19232.getClass(), "baseToolTipGenerator", null);
        setField(term19232, term19232.getClass(), "urlGeneratorList", null);
        setField(term19232, term19232.getClass(), "baseURLGenerator", null);
        setField(term19232, term19232.getClass(), "legendItemLabelGenerator", null);
        setField(term19232, term19232.getClass(), "legendItemToolTipGenerator", null);
        setField(term19232, term19232.getClass(), "legendItemURLGenerator", null);
        setField(term19232, term19232.getClass(), "backgroundAnnotations", null);
        setField(term19232, term19232.getClass(), "foregroundAnnotations", null);
        setIntField(term19232, term19232.getClass(), "rowCount", 0);
        setIntField(term19232, term19232.getClass(), "columnCount", 0);
        setField(term19232, term19232.getClass(), "seriesVisibleList", null);
        setBooleanField(term19232, term19232.getClass(), "baseSeriesVisible", false);
        setField(term19232, term19232.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19232, term19232.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19232, term19232.getClass(), "paintList", null);
        setBooleanField(term19232, term19232.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19232, term19232.getClass(), "basePaint", null);
        setField(term19232, term19232.getClass(), "fillPaintList", null);
        setBooleanField(term19232, term19232.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19232, term19232.getClass(), "baseFillPaint", null);
        setField(term19232, term19232.getClass(), "outlinePaintList", null);
        setBooleanField(term19232, term19232.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19232, term19232.getClass(), "baseOutlinePaint", null);
        setField(term19232, term19232.getClass(), "strokeList", null);
        setBooleanField(term19232, term19232.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19232, term19232.getClass(), "baseStroke", null);
        setField(term19232, term19232.getClass(), "outlineStrokeList", null);
        setField(term19232, term19232.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19232, term19232.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19232, term19232.getClass(), "shapeList", null);
        setBooleanField(term19232, term19232.getClass(), "autoPopulateSeriesShape", false);
        setField(term19232, term19232.getClass(), "baseShape", null);
        setField(term19232, term19232.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19232, term19232.getClass(), "baseItemLabelsVisible", false);
        setField(term19232, term19232.getClass(), "itemLabelFontList", null);
        setField(term19232, term19232.getClass(), "baseItemLabelFont", null);
        setField(term19232, term19232.getClass(), "itemLabelPaintList", null);
        setField(term19232, term19232.getClass(), "baseItemLabelPaint", null);
        setField(term19232, term19232.getClass(), "positiveItemLabelPositionList", null);
        setField(term19232, term19232.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19232, term19232.getClass(), "negativeItemLabelPositionList", null);
        setField(term19232, term19232.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19232, term19232.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19232, term19232.getClass(), "createEntitiesList", null);
        setBooleanField(term19232, term19232.getClass(), "baseCreateEntities", false);
        setField(term19232, term19232.getClass(), "listenerList", null);
        setField(term19232, term19232.getClass(), "event", null);
        term19250 = new Boolean(false);
        term19252 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Shape");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term19250;
        args[2] = term19252;
        callMethod(klass, "getIcon", argTypes, term19232, args);
    }

};


