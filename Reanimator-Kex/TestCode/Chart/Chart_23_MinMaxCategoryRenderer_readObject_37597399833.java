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

public class MinMaxCategoryRenderer_readObject_37597399833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19214;

    public MinMaxCategoryRenderer_readObject_37597399833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19214 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19214, term19214.getClass(), "plotLines", false);
        setField(term19214, term19214.getClass(), "groupPaint", null);
        setField(term19214, term19214.getClass(), "groupStroke", null);
        setField(term19214, term19214.getClass(), "minIcon", null);
        setField(term19214, term19214.getClass(), "maxIcon", null);
        setField(term19214, term19214.getClass(), "objectIcon", null);
        setIntField(term19214, term19214.getClass(), "lastCategory", 0);
        setDoubleField(term19214, term19214.getClass(), "min", 0.0);
        setDoubleField(term19214, term19214.getClass(), "max", 0.0);
        setField(term19214, term19214.getClass(), "plot", null);
        setField(term19214, term19214.getClass(), "itemLabelGeneratorList", null);
        setField(term19214, term19214.getClass(), "baseItemLabelGenerator", null);
        setField(term19214, term19214.getClass(), "toolTipGeneratorList", null);
        setField(term19214, term19214.getClass(), "baseToolTipGenerator", null);
        setField(term19214, term19214.getClass(), "urlGeneratorList", null);
        setField(term19214, term19214.getClass(), "baseURLGenerator", null);
        setField(term19214, term19214.getClass(), "legendItemLabelGenerator", null);
        setField(term19214, term19214.getClass(), "legendItemToolTipGenerator", null);
        setField(term19214, term19214.getClass(), "legendItemURLGenerator", null);
        setField(term19214, term19214.getClass(), "backgroundAnnotations", null);
        setField(term19214, term19214.getClass(), "foregroundAnnotations", null);
        setIntField(term19214, term19214.getClass(), "rowCount", 0);
        setIntField(term19214, term19214.getClass(), "columnCount", 0);
        setField(term19214, term19214.getClass(), "seriesVisibleList", null);
        setBooleanField(term19214, term19214.getClass(), "baseSeriesVisible", false);
        setField(term19214, term19214.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19214, term19214.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19214, term19214.getClass(), "paintList", null);
        setBooleanField(term19214, term19214.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19214, term19214.getClass(), "basePaint", null);
        setField(term19214, term19214.getClass(), "fillPaintList", null);
        setBooleanField(term19214, term19214.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19214, term19214.getClass(), "baseFillPaint", null);
        setField(term19214, term19214.getClass(), "outlinePaintList", null);
        setBooleanField(term19214, term19214.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19214, term19214.getClass(), "baseOutlinePaint", null);
        setField(term19214, term19214.getClass(), "strokeList", null);
        setBooleanField(term19214, term19214.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19214, term19214.getClass(), "baseStroke", null);
        setField(term19214, term19214.getClass(), "outlineStrokeList", null);
        setField(term19214, term19214.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19214, term19214.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19214, term19214.getClass(), "shapeList", null);
        setBooleanField(term19214, term19214.getClass(), "autoPopulateSeriesShape", false);
        setField(term19214, term19214.getClass(), "baseShape", null);
        setField(term19214, term19214.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19214, term19214.getClass(), "baseItemLabelsVisible", false);
        setField(term19214, term19214.getClass(), "itemLabelFontList", null);
        setField(term19214, term19214.getClass(), "baseItemLabelFont", null);
        setField(term19214, term19214.getClass(), "itemLabelPaintList", null);
        setField(term19214, term19214.getClass(), "baseItemLabelPaint", null);
        setField(term19214, term19214.getClass(), "positiveItemLabelPositionList", null);
        setField(term19214, term19214.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19214, term19214.getClass(), "negativeItemLabelPositionList", null);
        setField(term19214, term19214.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19214, term19214.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19214, term19214.getClass(), "createEntitiesList", null);
        setBooleanField(term19214, term19214.getClass(), "baseCreateEntities", false);
        setField(term19214, term19214.getClass(), "listenerList", null);
        setField(term19214, term19214.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectInputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readObject", argTypes, term19214, args);
    }

};


