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

public class StatisticalBarRenderer_drawVerticalItem_111675756019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12905;
     Object term12927;
     Object term12929;

    public StatisticalBarRenderer_drawVerticalItem_111675756019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12905 = newInstance(Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(term12905, term12905.getClass(), "errorIndicatorPaint", null);
        setField(term12905, term12905.getClass(), "errorIndicatorStroke", null);
        setDoubleField(term12905, term12905.getClass(), "itemMargin", 0.0);
        setBooleanField(term12905, term12905.getClass(), "drawBarOutline", false);
        setDoubleField(term12905, term12905.getClass(), "maximumBarWidth", 0.0);
        setDoubleField(term12905, term12905.getClass(), "minimumBarLength", 0.0);
        setField(term12905, term12905.getClass(), "gradientPaintTransformer", null);
        setField(term12905, term12905.getClass(), "positiveItemLabelPositionFallback", null);
        setField(term12905, term12905.getClass(), "negativeItemLabelPositionFallback", null);
        setDoubleField(term12905, term12905.getClass(), "upperClip", 0.0);
        setDoubleField(term12905, term12905.getClass(), "lowerClip", 0.0);
        setDoubleField(term12905, term12905.getClass(), "base", 0.0);
        setBooleanField(term12905, term12905.getClass(), "includeBaseInRange", false);
        setField(term12905, term12905.getClass(), "plot", null);
        setField(term12905, term12905.getClass(), "itemLabelGeneratorList", null);
        setField(term12905, term12905.getClass(), "baseItemLabelGenerator", null);
        setField(term12905, term12905.getClass(), "toolTipGeneratorList", null);
        setField(term12905, term12905.getClass(), "baseToolTipGenerator", null);
        setField(term12905, term12905.getClass(), "urlGeneratorList", null);
        setField(term12905, term12905.getClass(), "baseURLGenerator", null);
        setField(term12905, term12905.getClass(), "legendItemLabelGenerator", null);
        setField(term12905, term12905.getClass(), "legendItemToolTipGenerator", null);
        setField(term12905, term12905.getClass(), "legendItemURLGenerator", null);
        setField(term12905, term12905.getClass(), "backgroundAnnotations", null);
        setField(term12905, term12905.getClass(), "foregroundAnnotations", null);
        setIntField(term12905, term12905.getClass(), "rowCount", 0);
        setIntField(term12905, term12905.getClass(), "columnCount", 0);
        setField(term12905, term12905.getClass(), "seriesVisibleList", null);
        setBooleanField(term12905, term12905.getClass(), "baseSeriesVisible", false);
        setField(term12905, term12905.getClass(), "seriesVisibleInLegendList", null);
        setBooleanField(term12905, term12905.getClass(), "baseSeriesVisibleInLegend", false);
        setField(term12905, term12905.getClass(), "paintList", null);
        setBooleanField(term12905, term12905.getClass(), "autoPopulateSeriesPaint", false);
        setField(term12905, term12905.getClass(), "basePaint", null);
        setField(term12905, term12905.getClass(), "fillPaintList", null);
        setBooleanField(term12905, term12905.getClass(), "autoPopulateSeriesFillPaint", false);
        setField(term12905, term12905.getClass(), "baseFillPaint", null);
        setField(term12905, term12905.getClass(), "outlinePaintList", null);
        setBooleanField(term12905, term12905.getClass(), "autoPopulateSeriesOutlinePaint", false);
        setField(term12905, term12905.getClass(), "baseOutlinePaint", null);
        setField(term12905, term12905.getClass(), "strokeList", null);
        setBooleanField(term12905, term12905.getClass(), "autoPopulateSeriesStroke", false);
        setField(term12905, term12905.getClass(), "baseStroke", null);
        setField(term12905, term12905.getClass(), "outlineStrokeList", null);
        setField(term12905, term12905.getClass(), "baseOutlineStroke", null);
        setBooleanField(term12905, term12905.getClass(), "autoPopulateSeriesOutlineStroke", false);
        setField(term12905, term12905.getClass(), "shapeList", null);
        setBooleanField(term12905, term12905.getClass(), "autoPopulateSeriesShape", false);
        setField(term12905, term12905.getClass(), "baseShape", null);
        setField(term12905, term12905.getClass(), "itemLabelsVisibleList", null);
        setBooleanField(term12905, term12905.getClass(), "baseItemLabelsVisible", false);
        setField(term12905, term12905.getClass(), "itemLabelFontList", null);
        setField(term12905, term12905.getClass(), "baseItemLabelFont", null);
        setField(term12905, term12905.getClass(), "itemLabelPaintList", null);
        setField(term12905, term12905.getClass(), "baseItemLabelPaint", null);
        setField(term12905, term12905.getClass(), "positiveItemLabelPositionList", null);
        setField(term12905, term12905.getClass(), "basePositiveItemLabelPosition", null);
        setField(term12905, term12905.getClass(), "negativeItemLabelPositionList", null);
        setField(term12905, term12905.getClass(), "baseNegativeItemLabelPosition", null);
        setDoubleField(term12905, term12905.getClass(), "itemLabelAnchorOffset", 0.0);
        setField(term12905, term12905.getClass(), "createEntitiesList", null);
        setBooleanField(term12905, term12905.getClass(), "baseCreateEntities", false);
        setField(term12905, term12905.getClass(), "listenerList", null);
        setField(term12905, term12905.getClass(), "event", null);
        term12927 = new Integer(0);
        term12929 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.renderer.category.CategoryItemRendererState");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.CategoryPlot");
        argTypes[4] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        argTypes[5] = Class.forName("org.jfree.chart.axis.ValueAxis");
        argTypes[6] = Class.forName("org.jfree.data.statistics.StatisticalCategoryDataset");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = term12927;
        args[8] = term12929;
        callMethod(klass, "drawVerticalItem", argTypes, term12905, args);
    }

};


