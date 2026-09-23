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

public class MinMaxCategoryRenderer_isDrawLines_39100521919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18954;

    public MinMaxCategoryRenderer_isDrawLines_39100521919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18954 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term18954, term18954.getClass(), "plotLines", false);
        setField(term18954, term18954.getClass(), "groupPaint", null);
        setField(term18954, term18954.getClass(), "groupStroke", null);
        setField(term18954, term18954.getClass(), "minIcon", null);
        setField(term18954, term18954.getClass(), "maxIcon", null);
        setField(term18954, term18954.getClass(), "objectIcon", null);
        setIntField(term18954, term18954.getClass(), "lastCategory", 0);
        setDoubleField(term18954, term18954.getClass(), "min", 0.0);
        setDoubleField(term18954, term18954.getClass(), "max", 0.0);
        setField(term18954, term18954.getClass(), "plot", null);
        setField(term18954, term18954.getClass(), "itemLabelGeneratorList", null);
        setField(term18954, term18954.getClass(), "baseItemLabelGenerator", null);
        setField(term18954, term18954.getClass(), "toolTipGeneratorList", null);
        setField(term18954, term18954.getClass(), "baseToolTipGenerator", null);
        setField(term18954, term18954.getClass(), "urlGeneratorList", null);
        setField(term18954, term18954.getClass(), "baseURLGenerator", null);
        setField(term18954, term18954.getClass(), "legendItemLabelGenerator", null);
        setField(term18954, term18954.getClass(), "legendItemToolTipGenerator", null);
        setField(term18954, term18954.getClass(), "legendItemURLGenerator", null);
        setField(term18954, term18954.getClass(), "backgroundAnnotations", null);
        setField(term18954, term18954.getClass(), "foregroundAnnotations", null);
        setIntField(term18954, term18954.getClass(), "rowCount", 0);
        setIntField(term18954, term18954.getClass(), "columnCount", 0);
        setField(term18954, term18954.getClass(), "seriesVisibleList", null);
        setBooleanField(term18954, term18954.getClass(), "baseSeriesVisible", false);
        setField(term18954, term18954.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term18954, term18954.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term18954, term18954.getClass(), "paintList", null);
        setBooleanField(term18954, term18954.getClass(), "autoPopulateSeriesPaint", false);
        setField(term18954, term18954.getClass(), "basePaint", null);
        setField(term18954, term18954.getClass(), "fillPaintList", null);
        setBooleanField(term18954, term18954.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term18954, term18954.getClass(), "baseFillPaint", null);
        setField(term18954, term18954.getClass(), "outlinePaintList", null);
        setBooleanField(term18954, term18954.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term18954, term18954.getClass(), "baseOutlinePaint", null);
        setField(term18954, term18954.getClass(), "strokeList", null);
        setBooleanField(term18954, term18954.getClass(), "autoPopulateSeriesStroke", false);
        setField(term18954, term18954.getClass(), "baseStroke", null);
        setField(term18954, term18954.getClass(), "outlineStrokeList", null);
        setField(term18954, term18954.getClass(), "baseOutlineStroke", null);
        setBooleanField(term18954, term18954.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term18954, term18954.getClass(), "shapeList", null);
        setBooleanField(term18954, term18954.getClass(), "autoPopulateSeriesShape", false);
        setField(term18954, term18954.getClass(), "baseShape", null);
        setField(term18954, term18954.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term18954, term18954.getClass(), "baseItemLabelsVisible", false);
        setField(term18954, term18954.getClass(), "itemLabelFontList", null);
        setField(term18954, term18954.getClass(), "baseItemLabelFont", null);
        setField(term18954, term18954.getClass(), "itemLabelPaintList", null);
        setField(term18954, term18954.getClass(), "baseItemLabelPaint", null);
        setField(term18954, term18954.getClass(), "positiveItemLabelPositionList", null);
        setField(term18954, term18954.getClass(), "basePositiveItemLabelPosition", null);
        setField(term18954, term18954.getClass(), "negativeItemLabelPositionList", null);
        setField(term18954, term18954.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term18954, term18954.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term18954, term18954.getClass(), "createEntitiesList", null);
        setBooleanField(term18954, term18954.getClass(), "baseCreateEntities", false);
        setField(term18954, term18954.getClass(), "listenerList", null);
        setField(term18954, term18954.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDrawLines", argTypes, term18954, args);
    }

};


