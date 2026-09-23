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

public class MinMaxCategoryRenderer_setMaxIcon_137673836827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19100;

    public MinMaxCategoryRenderer_setMaxIcon_137673836827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19100 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19100, term19100.getClass(), "plotLines", false);
        setField(term19100, term19100.getClass(), "groupPaint", null);
        setField(term19100, term19100.getClass(), "groupStroke", null);
        setField(term19100, term19100.getClass(), "minIcon", null);
        setField(term19100, term19100.getClass(), "maxIcon", null);
        setField(term19100, term19100.getClass(), "objectIcon", null);
        setIntField(term19100, term19100.getClass(), "lastCategory", 0);
        setDoubleField(term19100, term19100.getClass(), "min", 0.0);
        setDoubleField(term19100, term19100.getClass(), "max", 0.0);
        setField(term19100, term19100.getClass(), "plot", null);
        setField(term19100, term19100.getClass(), "itemLabelGeneratorList", null);
        setField(term19100, term19100.getClass(), "baseItemLabelGenerator", null);
        setField(term19100, term19100.getClass(), "toolTipGeneratorList", null);
        setField(term19100, term19100.getClass(), "baseToolTipGenerator", null);
        setField(term19100, term19100.getClass(), "urlGeneratorList", null);
        setField(term19100, term19100.getClass(), "baseURLGenerator", null);
        setField(term19100, term19100.getClass(), "legendItemLabelGenerator", null);
        setField(term19100, term19100.getClass(), "legendItemToolTipGenerator", null);
        setField(term19100, term19100.getClass(), "legendItemURLGenerator", null);
        setField(term19100, term19100.getClass(), "backgroundAnnotations", null);
        setField(term19100, term19100.getClass(), "foregroundAnnotations", null);
        setIntField(term19100, term19100.getClass(), "rowCount", 0);
        setIntField(term19100, term19100.getClass(), "columnCount", 0);
        setField(term19100, term19100.getClass(), "seriesVisibleList", null);
        setBooleanField(term19100, term19100.getClass(), "baseSeriesVisible", false);
        setField(term19100, term19100.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19100, term19100.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19100, term19100.getClass(), "paintList", null);
        setBooleanField(term19100, term19100.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19100, term19100.getClass(), "basePaint", null);
        setField(term19100, term19100.getClass(), "fillPaintList", null);
        setBooleanField(term19100, term19100.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19100, term19100.getClass(), "baseFillPaint", null);
        setField(term19100, term19100.getClass(), "outlinePaintList", null);
        setBooleanField(term19100, term19100.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19100, term19100.getClass(), "baseOutlinePaint", null);
        setField(term19100, term19100.getClass(), "strokeList", null);
        setBooleanField(term19100, term19100.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19100, term19100.getClass(), "baseStroke", null);
        setField(term19100, term19100.getClass(), "outlineStrokeList", null);
        setField(term19100, term19100.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19100, term19100.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19100, term19100.getClass(), "shapeList", null);
        setBooleanField(term19100, term19100.getClass(), "autoPopulateSeriesShape", false);
        setField(term19100, term19100.getClass(), "baseShape", null);
        setField(term19100, term19100.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19100, term19100.getClass(), "baseItemLabelsVisible", false);
        setField(term19100, term19100.getClass(), "itemLabelFontList", null);
        setField(term19100, term19100.getClass(), "baseItemLabelFont", null);
        setField(term19100, term19100.getClass(), "itemLabelPaintList", null);
        setField(term19100, term19100.getClass(), "baseItemLabelPaint", null);
        setField(term19100, term19100.getClass(), "positiveItemLabelPositionList", null);
        setField(term19100, term19100.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19100, term19100.getClass(), "negativeItemLabelPositionList", null);
        setField(term19100, term19100.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19100, term19100.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19100, term19100.getClass(), "createEntitiesList", null);
        setBooleanField(term19100, term19100.getClass(), "baseCreateEntities", false);
        setField(term19100, term19100.getClass(), "listenerList", null);
        setField(term19100, term19100.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMaxIcon", argTypes, term19100, args);
    }

};


