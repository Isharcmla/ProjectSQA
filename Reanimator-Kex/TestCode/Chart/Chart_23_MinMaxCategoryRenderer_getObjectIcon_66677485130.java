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

public class MinMaxCategoryRenderer_getObjectIcon_66677485130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19154;

    public MinMaxCategoryRenderer_getObjectIcon_66677485130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19154 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19154, term19154.getClass(), "plotLines", false);
        setField(term19154, term19154.getClass(), "groupPaint", null);
        setField(term19154, term19154.getClass(), "groupStroke", null);
        setField(term19154, term19154.getClass(), "minIcon", null);
        setField(term19154, term19154.getClass(), "maxIcon", null);
        setField(term19154, term19154.getClass(), "objectIcon", null);
        setIntField(term19154, term19154.getClass(), "lastCategory", 0);
        setDoubleField(term19154, term19154.getClass(), "min", 0.0);
        setDoubleField(term19154, term19154.getClass(), "max", 0.0);
        setField(term19154, term19154.getClass(), "plot", null);
        setField(term19154, term19154.getClass(), "itemLabelGeneratorList", null);
        setField(term19154, term19154.getClass(), "baseItemLabelGenerator", null);
        setField(term19154, term19154.getClass(), "toolTipGeneratorList", null);
        setField(term19154, term19154.getClass(), "baseToolTipGenerator", null);
        setField(term19154, term19154.getClass(), "urlGeneratorList", null);
        setField(term19154, term19154.getClass(), "baseURLGenerator", null);
        setField(term19154, term19154.getClass(), "legendItemLabelGenerator", null);
        setField(term19154, term19154.getClass(), "legendItemToolTipGenerator", null);
        setField(term19154, term19154.getClass(), "legendItemURLGenerator", null);
        setField(term19154, term19154.getClass(), "backgroundAnnotations", null);
        setField(term19154, term19154.getClass(), "foregroundAnnotations", null);
        setIntField(term19154, term19154.getClass(), "rowCount", 0);
        setIntField(term19154, term19154.getClass(), "columnCount", 0);
        setField(term19154, term19154.getClass(), "seriesVisibleList", null);
        setBooleanField(term19154, term19154.getClass(), "baseSeriesVisible", false);
        setField(term19154, term19154.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19154, term19154.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19154, term19154.getClass(), "paintList", null);
        setBooleanField(term19154, term19154.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19154, term19154.getClass(), "basePaint", null);
        setField(term19154, term19154.getClass(), "fillPaintList", null);
        setBooleanField(term19154, term19154.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19154, term19154.getClass(), "baseFillPaint", null);
        setField(term19154, term19154.getClass(), "outlinePaintList", null);
        setBooleanField(term19154, term19154.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19154, term19154.getClass(), "baseOutlinePaint", null);
        setField(term19154, term19154.getClass(), "strokeList", null);
        setBooleanField(term19154, term19154.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19154, term19154.getClass(), "baseStroke", null);
        setField(term19154, term19154.getClass(), "outlineStrokeList", null);
        setField(term19154, term19154.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19154, term19154.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19154, term19154.getClass(), "shapeList", null);
        setBooleanField(term19154, term19154.getClass(), "autoPopulateSeriesShape", false);
        setField(term19154, term19154.getClass(), "baseShape", null);
        setField(term19154, term19154.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19154, term19154.getClass(), "baseItemLabelsVisible", false);
        setField(term19154, term19154.getClass(), "itemLabelFontList", null);
        setField(term19154, term19154.getClass(), "baseItemLabelFont", null);
        setField(term19154, term19154.getClass(), "itemLabelPaintList", null);
        setField(term19154, term19154.getClass(), "baseItemLabelPaint", null);
        setField(term19154, term19154.getClass(), "positiveItemLabelPositionList", null);
        setField(term19154, term19154.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19154, term19154.getClass(), "negativeItemLabelPositionList", null);
        setField(term19154, term19154.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19154, term19154.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19154, term19154.getClass(), "createEntitiesList", null);
        setBooleanField(term19154, term19154.getClass(), "baseCreateEntities", false);
        setField(term19154, term19154.getClass(), "listenerList", null);
        setField(term19154, term19154.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getObjectIcon", argTypes, term19154, args);
    }

};


