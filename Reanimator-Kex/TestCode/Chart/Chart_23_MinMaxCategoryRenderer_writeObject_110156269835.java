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

public class MinMaxCategoryRenderer_writeObject_110156269835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19254;

    public MinMaxCategoryRenderer_writeObject_110156269835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19254 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19254, term19254.getClass(), "plotLines", false);
        setField(term19254, term19254.getClass(), "groupPaint", null);
        setField(term19254, term19254.getClass(), "groupStroke", null);
        setField(term19254, term19254.getClass(), "minIcon", null);
        setField(term19254, term19254.getClass(), "maxIcon", null);
        setField(term19254, term19254.getClass(), "objectIcon", null);
        setIntField(term19254, term19254.getClass(), "lastCategory", 0);
        setDoubleField(term19254, term19254.getClass(), "min", 0.0);
        setDoubleField(term19254, term19254.getClass(), "max", 0.0);
        setField(term19254, term19254.getClass(), "plot", null);
        setField(term19254, term19254.getClass(), "itemLabelGeneratorList", null);
        setField(term19254, term19254.getClass(), "baseItemLabelGenerator", null);
        setField(term19254, term19254.getClass(), "toolTipGeneratorList", null);
        setField(term19254, term19254.getClass(), "baseToolTipGenerator", null);
        setField(term19254, term19254.getClass(), "urlGeneratorList", null);
        setField(term19254, term19254.getClass(), "baseURLGenerator", null);
        setField(term19254, term19254.getClass(), "legendItemLabelGenerator", null);
        setField(term19254, term19254.getClass(), "legendItemToolTipGenerator", null);
        setField(term19254, term19254.getClass(), "legendItemURLGenerator", null);
        setField(term19254, term19254.getClass(), "backgroundAnnotations", null);
        setField(term19254, term19254.getClass(), "foregroundAnnotations", null);
        setIntField(term19254, term19254.getClass(), "rowCount", 0);
        setIntField(term19254, term19254.getClass(), "columnCount", 0);
        setField(term19254, term19254.getClass(), "seriesVisibleList", null);
        setBooleanField(term19254, term19254.getClass(), "baseSeriesVisible", false);
        setField(term19254, term19254.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19254, term19254.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19254, term19254.getClass(), "paintList", null);
        setBooleanField(term19254, term19254.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19254, term19254.getClass(), "basePaint", null);
        setField(term19254, term19254.getClass(), "fillPaintList", null);
        setBooleanField(term19254, term19254.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19254, term19254.getClass(), "baseFillPaint", null);
        setField(term19254, term19254.getClass(), "outlinePaintList", null);
        setBooleanField(term19254, term19254.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19254, term19254.getClass(), "baseOutlinePaint", null);
        setField(term19254, term19254.getClass(), "strokeList", null);
        setBooleanField(term19254, term19254.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19254, term19254.getClass(), "baseStroke", null);
        setField(term19254, term19254.getClass(), "outlineStrokeList", null);
        setField(term19254, term19254.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19254, term19254.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19254, term19254.getClass(), "shapeList", null);
        setBooleanField(term19254, term19254.getClass(), "autoPopulateSeriesShape", false);
        setField(term19254, term19254.getClass(), "baseShape", null);
        setField(term19254, term19254.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19254, term19254.getClass(), "baseItemLabelsVisible", false);
        setField(term19254, term19254.getClass(), "itemLabelFontList", null);
        setField(term19254, term19254.getClass(), "baseItemLabelFont", null);
        setField(term19254, term19254.getClass(), "itemLabelPaintList", null);
        setField(term19254, term19254.getClass(), "baseItemLabelPaint", null);
        setField(term19254, term19254.getClass(), "positiveItemLabelPositionList", null);
        setField(term19254, term19254.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19254, term19254.getClass(), "negativeItemLabelPositionList", null);
        setField(term19254, term19254.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19254, term19254.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19254, term19254.getClass(), "createEntitiesList", null);
        setBooleanField(term19254, term19254.getClass(), "baseCreateEntities", false);
        setField(term19254, term19254.getClass(), "listenerList", null);
        setField(term19254, term19254.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeObject", argTypes, term19254, args);
    }

};


