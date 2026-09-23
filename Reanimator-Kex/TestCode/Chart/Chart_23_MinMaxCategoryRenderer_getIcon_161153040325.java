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

public class MinMaxCategoryRenderer_getIcon_161153040325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19064;

    public MinMaxCategoryRenderer_getIcon_161153040325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19064 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19064, term19064.getClass(), "plotLines", false);
        setField(term19064, term19064.getClass(), "groupPaint", null);
        setField(term19064, term19064.getClass(), "groupStroke", null);
        setField(term19064, term19064.getClass(), "minIcon", null);
        setField(term19064, term19064.getClass(), "maxIcon", null);
        setField(term19064, term19064.getClass(), "objectIcon", null);
        setIntField(term19064, term19064.getClass(), "lastCategory", 0);
        setDoubleField(term19064, term19064.getClass(), "min", 0.0);
        setDoubleField(term19064, term19064.getClass(), "max", 0.0);
        setField(term19064, term19064.getClass(), "plot", null);
        setField(term19064, term19064.getClass(), "itemLabelGeneratorList", null);
        setField(term19064, term19064.getClass(), "baseItemLabelGenerator", null);
        setField(term19064, term19064.getClass(), "toolTipGeneratorList", null);
        setField(term19064, term19064.getClass(), "baseToolTipGenerator", null);
        setField(term19064, term19064.getClass(), "urlGeneratorList", null);
        setField(term19064, term19064.getClass(), "baseURLGenerator", null);
        setField(term19064, term19064.getClass(), "legendItemLabelGenerator", null);
        setField(term19064, term19064.getClass(), "legendItemToolTipGenerator", null);
        setField(term19064, term19064.getClass(), "legendItemURLGenerator", null);
        setField(term19064, term19064.getClass(), "backgroundAnnotations", null);
        setField(term19064, term19064.getClass(), "foregroundAnnotations", null);
        setIntField(term19064, term19064.getClass(), "rowCount", 0);
        setIntField(term19064, term19064.getClass(), "columnCount", 0);
        setField(term19064, term19064.getClass(), "seriesVisibleList", null);
        setBooleanField(term19064, term19064.getClass(), "baseSeriesVisible", false);
        setField(term19064, term19064.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19064, term19064.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19064, term19064.getClass(), "paintList", null);
        setBooleanField(term19064, term19064.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19064, term19064.getClass(), "basePaint", null);
        setField(term19064, term19064.getClass(), "fillPaintList", null);
        setBooleanField(term19064, term19064.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19064, term19064.getClass(), "baseFillPaint", null);
        setField(term19064, term19064.getClass(), "outlinePaintList", null);
        setBooleanField(term19064, term19064.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19064, term19064.getClass(), "baseOutlinePaint", null);
        setField(term19064, term19064.getClass(), "strokeList", null);
        setBooleanField(term19064, term19064.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19064, term19064.getClass(), "baseStroke", null);
        setField(term19064, term19064.getClass(), "outlineStrokeList", null);
        setField(term19064, term19064.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19064, term19064.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19064, term19064.getClass(), "shapeList", null);
        setBooleanField(term19064, term19064.getClass(), "autoPopulateSeriesShape", false);
        setField(term19064, term19064.getClass(), "baseShape", null);
        setField(term19064, term19064.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19064, term19064.getClass(), "baseItemLabelsVisible", false);
        setField(term19064, term19064.getClass(), "itemLabelFontList", null);
        setField(term19064, term19064.getClass(), "baseItemLabelFont", null);
        setField(term19064, term19064.getClass(), "itemLabelPaintList", null);
        setField(term19064, term19064.getClass(), "baseItemLabelPaint", null);
        setField(term19064, term19064.getClass(), "positiveItemLabelPositionList", null);
        setField(term19064, term19064.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19064, term19064.getClass(), "negativeItemLabelPositionList", null);
        setField(term19064, term19064.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19064, term19064.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19064, term19064.getClass(), "createEntitiesList", null);
        setBooleanField(term19064, term19064.getClass(), "baseCreateEntities", false);
        setField(term19064, term19064.getClass(), "listenerList", null);
        setField(term19064, term19064.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Shape");
        argTypes[1] = Class.forName("java.awt.Paint");
        argTypes[2] = Class.forName("java.awt.Paint");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getIcon", argTypes, term19064, args);
    }

};


