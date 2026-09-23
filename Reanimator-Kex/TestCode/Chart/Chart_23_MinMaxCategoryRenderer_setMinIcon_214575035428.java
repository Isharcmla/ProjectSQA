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

public class MinMaxCategoryRenderer_setMinIcon_214575035428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19118;

    public MinMaxCategoryRenderer_setMinIcon_214575035428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19118 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19118, term19118.getClass(), "plotLines", false);
        setField(term19118, term19118.getClass(), "groupPaint", null);
        setField(term19118, term19118.getClass(), "groupStroke", null);
        setField(term19118, term19118.getClass(), "minIcon", null);
        setField(term19118, term19118.getClass(), "maxIcon", null);
        setField(term19118, term19118.getClass(), "objectIcon", null);
        setIntField(term19118, term19118.getClass(), "lastCategory", 0);
        setDoubleField(term19118, term19118.getClass(), "min", 0.0);
        setDoubleField(term19118, term19118.getClass(), "max", 0.0);
        setField(term19118, term19118.getClass(), "plot", null);
        setField(term19118, term19118.getClass(), "itemLabelGeneratorList", null);
        setField(term19118, term19118.getClass(), "baseItemLabelGenerator", null);
        setField(term19118, term19118.getClass(), "toolTipGeneratorList", null);
        setField(term19118, term19118.getClass(), "baseToolTipGenerator", null);
        setField(term19118, term19118.getClass(), "urlGeneratorList", null);
        setField(term19118, term19118.getClass(), "baseURLGenerator", null);
        setField(term19118, term19118.getClass(), "legendItemLabelGenerator", null);
        setField(term19118, term19118.getClass(), "legendItemToolTipGenerator", null);
        setField(term19118, term19118.getClass(), "legendItemURLGenerator", null);
        setField(term19118, term19118.getClass(), "backgroundAnnotations", null);
        setField(term19118, term19118.getClass(), "foregroundAnnotations", null);
        setIntField(term19118, term19118.getClass(), "rowCount", 0);
        setIntField(term19118, term19118.getClass(), "columnCount", 0);
        setField(term19118, term19118.getClass(), "seriesVisibleList", null);
        setBooleanField(term19118, term19118.getClass(), "baseSeriesVisible", false);
        setField(term19118, term19118.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19118, term19118.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19118, term19118.getClass(), "paintList", null);
        setBooleanField(term19118, term19118.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19118, term19118.getClass(), "basePaint", null);
        setField(term19118, term19118.getClass(), "fillPaintList", null);
        setBooleanField(term19118, term19118.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19118, term19118.getClass(), "baseFillPaint", null);
        setField(term19118, term19118.getClass(), "outlinePaintList", null);
        setBooleanField(term19118, term19118.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19118, term19118.getClass(), "baseOutlinePaint", null);
        setField(term19118, term19118.getClass(), "strokeList", null);
        setBooleanField(term19118, term19118.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19118, term19118.getClass(), "baseStroke", null);
        setField(term19118, term19118.getClass(), "outlineStrokeList", null);
        setField(term19118, term19118.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19118, term19118.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19118, term19118.getClass(), "shapeList", null);
        setBooleanField(term19118, term19118.getClass(), "autoPopulateSeriesShape", false);
        setField(term19118, term19118.getClass(), "baseShape", null);
        setField(term19118, term19118.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19118, term19118.getClass(), "baseItemLabelsVisible", false);
        setField(term19118, term19118.getClass(), "itemLabelFontList", null);
        setField(term19118, term19118.getClass(), "baseItemLabelFont", null);
        setField(term19118, term19118.getClass(), "itemLabelPaintList", null);
        setField(term19118, term19118.getClass(), "baseItemLabelPaint", null);
        setField(term19118, term19118.getClass(), "positiveItemLabelPositionList", null);
        setField(term19118, term19118.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19118, term19118.getClass(), "negativeItemLabelPositionList", null);
        setField(term19118, term19118.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19118, term19118.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19118, term19118.getClass(), "createEntitiesList", null);
        setBooleanField(term19118, term19118.getClass(), "baseCreateEntities", false);
        setField(term19118, term19118.getClass(), "listenerList", null);
        setField(term19118, term19118.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinIcon", argTypes, term19118, args);
    }

};


