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

public class MinMaxCategoryRenderer_setGroupStroke_132996922324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19046;

    public MinMaxCategoryRenderer_setGroupStroke_132996922324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19046 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19046, term19046.getClass(), "plotLines", false);
        setField(term19046, term19046.getClass(), "groupPaint", null);
        setField(term19046, term19046.getClass(), "groupStroke", null);
        setField(term19046, term19046.getClass(), "minIcon", null);
        setField(term19046, term19046.getClass(), "maxIcon", null);
        setField(term19046, term19046.getClass(), "objectIcon", null);
        setIntField(term19046, term19046.getClass(), "lastCategory", 0);
        setDoubleField(term19046, term19046.getClass(), "min", 0.0);
        setDoubleField(term19046, term19046.getClass(), "max", 0.0);
        setField(term19046, term19046.getClass(), "plot", null);
        setField(term19046, term19046.getClass(), "itemLabelGeneratorList", null);
        setField(term19046, term19046.getClass(), "baseItemLabelGenerator", null);
        setField(term19046, term19046.getClass(), "toolTipGeneratorList", null);
        setField(term19046, term19046.getClass(), "baseToolTipGenerator", null);
        setField(term19046, term19046.getClass(), "urlGeneratorList", null);
        setField(term19046, term19046.getClass(), "baseURLGenerator", null);
        setField(term19046, term19046.getClass(), "legendItemLabelGenerator", null);
        setField(term19046, term19046.getClass(), "legendItemToolTipGenerator", null);
        setField(term19046, term19046.getClass(), "legendItemURLGenerator", null);
        setField(term19046, term19046.getClass(), "backgroundAnnotations", null);
        setField(term19046, term19046.getClass(), "foregroundAnnotations", null);
        setIntField(term19046, term19046.getClass(), "rowCount", 0);
        setIntField(term19046, term19046.getClass(), "columnCount", 0);
        setField(term19046, term19046.getClass(), "seriesVisibleList", null);
        setBooleanField(term19046, term19046.getClass(), "baseSeriesVisible", false);
        setField(term19046, term19046.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19046, term19046.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19046, term19046.getClass(), "paintList", null);
        setBooleanField(term19046, term19046.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19046, term19046.getClass(), "basePaint", null);
        setField(term19046, term19046.getClass(), "fillPaintList", null);
        setBooleanField(term19046, term19046.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19046, term19046.getClass(), "baseFillPaint", null);
        setField(term19046, term19046.getClass(), "outlinePaintList", null);
        setBooleanField(term19046, term19046.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19046, term19046.getClass(), "baseOutlinePaint", null);
        setField(term19046, term19046.getClass(), "strokeList", null);
        setBooleanField(term19046, term19046.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19046, term19046.getClass(), "baseStroke", null);
        setField(term19046, term19046.getClass(), "outlineStrokeList", null);
        setField(term19046, term19046.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19046, term19046.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19046, term19046.getClass(), "shapeList", null);
        setBooleanField(term19046, term19046.getClass(), "autoPopulateSeriesShape", false);
        setField(term19046, term19046.getClass(), "baseShape", null);
        setField(term19046, term19046.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19046, term19046.getClass(), "baseItemLabelsVisible", false);
        setField(term19046, term19046.getClass(), "itemLabelFontList", null);
        setField(term19046, term19046.getClass(), "baseItemLabelFont", null);
        setField(term19046, term19046.getClass(), "itemLabelPaintList", null);
        setField(term19046, term19046.getClass(), "baseItemLabelPaint", null);
        setField(term19046, term19046.getClass(), "positiveItemLabelPositionList", null);
        setField(term19046, term19046.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19046, term19046.getClass(), "negativeItemLabelPositionList", null);
        setField(term19046, term19046.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19046, term19046.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19046, term19046.getClass(), "createEntitiesList", null);
        setBooleanField(term19046, term19046.getClass(), "baseCreateEntities", false);
        setField(term19046, term19046.getClass(), "listenerList", null);
        setField(term19046, term19046.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Stroke");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGroupStroke", argTypes, term19046, args);
    }

};


