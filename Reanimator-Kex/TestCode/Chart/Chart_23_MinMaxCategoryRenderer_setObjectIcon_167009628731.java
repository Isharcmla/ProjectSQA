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

public class MinMaxCategoryRenderer_setObjectIcon_167009628731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19172;

    public MinMaxCategoryRenderer_setObjectIcon_167009628731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19172 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19172, term19172.getClass(), "plotLines", false);
        setField(term19172, term19172.getClass(), "groupPaint", null);
        setField(term19172, term19172.getClass(), "groupStroke", null);
        setField(term19172, term19172.getClass(), "minIcon", null);
        setField(term19172, term19172.getClass(), "maxIcon", null);
        setField(term19172, term19172.getClass(), "objectIcon", null);
        setIntField(term19172, term19172.getClass(), "lastCategory", 0);
        setDoubleField(term19172, term19172.getClass(), "min", 0.0);
        setDoubleField(term19172, term19172.getClass(), "max", 0.0);
        setField(term19172, term19172.getClass(), "plot", null);
        setField(term19172, term19172.getClass(), "itemLabelGeneratorList", null);
        setField(term19172, term19172.getClass(), "baseItemLabelGenerator", null);
        setField(term19172, term19172.getClass(), "toolTipGeneratorList", null);
        setField(term19172, term19172.getClass(), "baseToolTipGenerator", null);
        setField(term19172, term19172.getClass(), "urlGeneratorList", null);
        setField(term19172, term19172.getClass(), "baseURLGenerator", null);
        setField(term19172, term19172.getClass(), "legendItemLabelGenerator", null);
        setField(term19172, term19172.getClass(), "legendItemToolTipGenerator", null);
        setField(term19172, term19172.getClass(), "legendItemURLGenerator", null);
        setField(term19172, term19172.getClass(), "backgroundAnnotations", null);
        setField(term19172, term19172.getClass(), "foregroundAnnotations", null);
        setIntField(term19172, term19172.getClass(), "rowCount", 0);
        setIntField(term19172, term19172.getClass(), "columnCount", 0);
        setField(term19172, term19172.getClass(), "seriesVisibleList", null);
        setBooleanField(term19172, term19172.getClass(), "baseSeriesVisible", false);
        setField(term19172, term19172.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19172, term19172.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19172, term19172.getClass(), "paintList", null);
        setBooleanField(term19172, term19172.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19172, term19172.getClass(), "basePaint", null);
        setField(term19172, term19172.getClass(), "fillPaintList", null);
        setBooleanField(term19172, term19172.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19172, term19172.getClass(), "baseFillPaint", null);
        setField(term19172, term19172.getClass(), "outlinePaintList", null);
        setBooleanField(term19172, term19172.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19172, term19172.getClass(), "baseOutlinePaint", null);
        setField(term19172, term19172.getClass(), "strokeList", null);
        setBooleanField(term19172, term19172.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19172, term19172.getClass(), "baseStroke", null);
        setField(term19172, term19172.getClass(), "outlineStrokeList", null);
        setField(term19172, term19172.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19172, term19172.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19172, term19172.getClass(), "shapeList", null);
        setBooleanField(term19172, term19172.getClass(), "autoPopulateSeriesShape", false);
        setField(term19172, term19172.getClass(), "baseShape", null);
        setField(term19172, term19172.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19172, term19172.getClass(), "baseItemLabelsVisible", false);
        setField(term19172, term19172.getClass(), "itemLabelFontList", null);
        setField(term19172, term19172.getClass(), "baseItemLabelFont", null);
        setField(term19172, term19172.getClass(), "itemLabelPaintList", null);
        setField(term19172, term19172.getClass(), "baseItemLabelPaint", null);
        setField(term19172, term19172.getClass(), "positiveItemLabelPositionList", null);
        setField(term19172, term19172.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19172, term19172.getClass(), "negativeItemLabelPositionList", null);
        setField(term19172, term19172.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19172, term19172.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19172, term19172.getClass(), "createEntitiesList", null);
        setBooleanField(term19172, term19172.getClass(), "baseCreateEntities", false);
        setField(term19172, term19172.getClass(), "listenerList", null);
        setField(term19172, term19172.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setObjectIcon", argTypes, term19172, args);
    }

};


