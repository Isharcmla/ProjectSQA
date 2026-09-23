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
import java.lang.Integer;

public class MinMaxCategoryRenderer_drawItem_105676203032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19190;
     Object term19208;
     Object term19210;
     Object term19212;

    public MinMaxCategoryRenderer_drawItem_105676203032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19190 = newInstance(Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setBooleanField(term19190, term19190.getClass(), "plotLines", false);
        setField(term19190, term19190.getClass(), "groupPaint", null);
        setField(term19190, term19190.getClass(), "groupStroke", null);
        setField(term19190, term19190.getClass(), "minIcon", null);
        setField(term19190, term19190.getClass(), "maxIcon", null);
        setField(term19190, term19190.getClass(), "objectIcon", null);
        setIntField(term19190, term19190.getClass(), "lastCategory", 0);
        setDoubleField(term19190, term19190.getClass(), "min", 0.0);
        setDoubleField(term19190, term19190.getClass(), "max", 0.0);
        setField(term19190, term19190.getClass(), "plot", null);
        setField(term19190, term19190.getClass(), "itemLabelGeneratorList", null);
        setField(term19190, term19190.getClass(), "baseItemLabelGenerator", null);
        setField(term19190, term19190.getClass(), "toolTipGeneratorList", null);
        setField(term19190, term19190.getClass(), "baseToolTipGenerator", null);
        setField(term19190, term19190.getClass(), "urlGeneratorList", null);
        setField(term19190, term19190.getClass(), "baseURLGenerator", null);
        setField(term19190, term19190.getClass(), "legendItemLabelGenerator", null);
        setField(term19190, term19190.getClass(), "legendItemToolTipGenerator", null);
        setField(term19190, term19190.getClass(), "legendItemURLGenerator", null);
        setField(term19190, term19190.getClass(), "backgroundAnnotations", null);
        setField(term19190, term19190.getClass(), "foregroundAnnotations", null);
        setIntField(term19190, term19190.getClass(), "rowCount", 0);
        setIntField(term19190, term19190.getClass(), "columnCount", 0);
        setField(term19190, term19190.getClass(), "seriesVisibleList", null);
        setBooleanField(term19190, term19190.getClass(), "baseSeriesVisible", false);
        setField(term19190, term19190.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term19190, term19190.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term19190, term19190.getClass(), "paintList", null);
        setBooleanField(term19190, term19190.getClass(), "autoPopulateSeriesPaint", false);
        setField(term19190, term19190.getClass(), "basePaint", null);
        setField(term19190, term19190.getClass(), "fillPaintList", null);
        setBooleanField(term19190, term19190.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term19190, term19190.getClass(), "baseFillPaint", null);
        setField(term19190, term19190.getClass(), "outlinePaintList", null);
        setBooleanField(term19190, term19190.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term19190, term19190.getClass(), "baseOutlinePaint", null);
        setField(term19190, term19190.getClass(), "strokeList", null);
        setBooleanField(term19190, term19190.getClass(), "autoPopulateSeriesStroke", false);
        setField(term19190, term19190.getClass(), "baseStroke", null);
        setField(term19190, term19190.getClass(), "outlineStrokeList", null);
        setField(term19190, term19190.getClass(), "baseOutlineStroke", null);
        setBooleanField(term19190, term19190.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term19190, term19190.getClass(), "shapeList", null);
        setBooleanField(term19190, term19190.getClass(), "autoPopulateSeriesShape", false);
        setField(term19190, term19190.getClass(), "baseShape", null);
        setField(term19190, term19190.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term19190, term19190.getClass(), "baseItemLabelsVisible", false);
        setField(term19190, term19190.getClass(), "itemLabelFontList", null);
        setField(term19190, term19190.getClass(), "baseItemLabelFont", null);
        setField(term19190, term19190.getClass(), "itemLabelPaintList", null);
        setField(term19190, term19190.getClass(), "baseItemLabelPaint", null);
        setField(term19190, term19190.getClass(), "positiveItemLabelPositionList", null);
        setField(term19190, term19190.getClass(), "basePositiveItemLabelPosition", null);
        setField(term19190, term19190.getClass(), "negativeItemLabelPositionList", null);
        setField(term19190, term19190.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term19190, term19190.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term19190, term19190.getClass(), "createEntitiesList", null);
        setBooleanField(term19190, term19190.getClass(), "baseCreateEntities", false);
        setField(term19190, term19190.getClass(), "listenerList", null);
        setField(term19190, term19190.getClass(), "event", null);
        term19208 = new Integer(0);
        term19210 = new Integer(0);
        term19212 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.MinMaxCategoryRenderer");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.renderer.category.CategoryItemRendererState");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.CategoryPlot");
        argTypes[4] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        argTypes[5] = Class.forName("org.jfree.chart.axis.ValueAxis");
        argTypes[6] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = term19208;
        args[8] = term19210;
        args[9] = term19212;
        callMethod(klass, "drawItem", argTypes, term19190, args);
    }

};


