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

public class MinMaxCategoryRenderer_getMinIcon_50765540226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19082;

    public MinMaxCategoryRenderer_getMinIcon_50765540226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19082 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19082, term19082.getClass(), "plotLines", false);
        setField(term19082, term19082.getClass(), "groupPaint", null);
        setField(term19082, term19082.getClass(), "groupStroke", null);
        setField(term19082, term19082.getClass(), "minIcon", null);
        setField(term19082, term19082.getClass(), "maxIcon", null);
        setField(term19082, term19082.getClass(), "objectIcon", null);
        setIntField(term19082, term19082.getClass(), "lastCategory", 0);
        setDoubleField(term19082, term19082.getClass(), "min", 0.0);
        setDoubleField(term19082, term19082.getClass(), "max", 0.0);
        setField(term19082, term19082.getClass(), "plot", null);
        setField(term19082, term19082.getClass(), "itemLabelGeneratorList", null);
        setField(term19082, term19082.getClass(), "baseItemLabelGenerator", null);
        setField(term19082, term19082.getClass(), "toolTipGeneratorList", null);
        setField(term19082, term19082.getClass(), "baseToolTipGenerator", null);
        setField(term19082, term19082.getClass(), "urlGeneratorList", null);
        setField(term19082, term19082.getClass(), "baseURLGenerator", null);
        setField(term19082, term19082.getClass(), "legendItemLabelGenerator", null);
        setField(term19082, term19082.getClass(), "legendItemToolTipGenerator", null);
        setField(term19082, term19082.getClass(), "legendItemURLGenerator", null);
        setField(term19082, term19082.getClass(), "backgroundAnnotations", null);
        setField(term19082, term19082.getClass(), "foregroundAnnotations", null);
        setIntField(term19082, term19082.getClass(), "rowCount", 0);
        setIntField(term19082, term19082.getClass(), "columnCount", 0);
        setField(term19082, term19082.getClass(), "seriesVisibleList", null);
        setBooleanField(term19082, term19082.getClass(), "baseSeriesVisible", false);
        setField(term19082, term19082.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19082, term19082.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19082, term19082.getClass(), "paintList", null);
        setBooleanField(term19082, term19082.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19082, term19082.getClass(), "basePaint", null);
        setField(term19082, term19082.getClass(), "fillPaintList", null);
        setBooleanField(term19082, term19082.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19082, term19082.getClass(), "baseFillPaint", null);
        setField(term19082, term19082.getClass(), "outlinePaintList", null);
        setBooleanField(term19082, term19082.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19082, term19082.getClass(), "baseOutlinePaint", null);
        setField(term19082, term19082.getClass(), "strokeList", null);
        setBooleanField(term19082, term19082.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19082, term19082.getClass(), "baseStroke", null);
        setField(term19082, term19082.getClass(), "outlineStrokeList", null);
        setField(term19082, term19082.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19082, term19082.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19082, term19082.getClass(), "shapeList", null);
        setBooleanField(term19082, term19082.getClass(), "autoPopulateSeriesShape", false);
        setField(term19082, term19082.getClass(), "baseShape", null);
        setField(term19082, term19082.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19082, term19082.getClass(), "baseItemLabelsVisible", false);
        setField(term19082, term19082.getClass(), "itemLabelFontList", null);
        setField(term19082, term19082.getClass(), "baseItemLabelFont", null);
        setField(term19082, term19082.getClass(), "itemLabelPaintList", null);
        setField(term19082, term19082.getClass(), "baseItemLabelPaint", null);
        setField(term19082, term19082.getClass(), "positiveItemLabelPositionList", null);
        setField(term19082, term19082.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19082, term19082.getClass(), "negativeItemLabelPositionList", null);
        setField(term19082, term19082.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19082, term19082.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19082, term19082.getClass(), "createEntitiesList", null);
        setBooleanField(term19082, term19082.getClass(), "baseCreateEntities", false);
        setField(term19082, term19082.getClass(), "listenerList", null);
        setField(term19082, term19082.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinIcon", argTypes, term19082, args);
    }

};


