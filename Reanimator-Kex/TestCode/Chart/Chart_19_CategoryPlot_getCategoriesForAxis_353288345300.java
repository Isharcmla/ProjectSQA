package org.jfree.chart.plot;

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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CategoryPlot_getCategoriesForAxis_353288345300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3132;

    public CategoryPlot_getCategoriesForAxis_353288345300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3174 = new HashMap();
        HashMap term3179 = new HashMap();
        HashMap term3184 = new HashMap();
        term3132 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term3139 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term3140 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3141 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3143 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3145 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term3148 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term3151 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3152 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3154 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3158 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3159 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3161 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3164 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term3167 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3168 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3170 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3202 = newInstance(Class.forName("java.awt.Font"));
        Object term3223 = newInstance(Class.forName("java.awt.Color"));
        Object term3226 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term3227 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term3277 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term3283 = newInstance(Class.forName("java.awt.Color"));
        Object term3287 = newInstance(Class.forName("java.awt.Font"));
        Object term3308 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term3316 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term3323 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3324 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term3132, term3132.getClass(), "lowerMargin", 0.05);
        setDoubleField(term3132, term3132.getClass(), "upperMargin", 0.05);
        setDoubleField(term3132, term3132.getClass(), "categoryMargin", 0.2);
        setIntField(term3132, term3132.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term3132, term3132.getClass(), "maximumCategoryLabelWidthRatio", 0.89057696F);
        setIntField(term3132, term3132.getClass(), "categoryLabelPositionOffset", 4);
        setField(term3141, term3141.getClass(), "name", "");
        setField(term3140, term3140.getClass(), "categoryAnchor", term3141);
        setField(term3143, term3143.getClass(), "name", "");
        setField(term3140, term3140.getClass(), "labelAnchor", term3143);
        setField(term3145, term3145.getClass(), "name", "");
        setField(term3140, term3140.getClass(), "rotationAnchor", term3145);
        setDoubleField(term3140, term3140.getClass(), "angle", 0.0);
        setField(term3148, term3148.getClass(), "name", "");
        setField(term3140, term3140.getClass(), "widthType", term3148);
        setFloatField(term3140, term3140.getClass(), "widthRatio", 0.95F);
        setField(term3139, term3139.getClass(), "positionForAxisAtTop", term3140);
        setField(term3152, term3152.getClass(), "name", "");
        setField(term3151, term3151.getClass(), "categoryAnchor", term3152);
        setField(term3154, term3154.getClass(), "name", "");
        setField(term3151, term3151.getClass(), "labelAnchor", term3154);
        setField(term3151, term3151.getClass(), "rotationAnchor", term3145);
        setDoubleField(term3151, term3151.getClass(), "angle", 0.0);
        setField(term3151, term3151.getClass(), "widthType", term3148);
        setFloatField(term3151, term3151.getClass(), "widthRatio", 0.95F);
        setField(term3139, term3139.getClass(), "positionForAxisAtBottom", term3151);
        setField(term3159, term3159.getClass(), "name", "");
        setField(term3158, term3158.getClass(), "categoryAnchor", term3159);
        setField(term3161, term3161.getClass(), "name", "");
        setField(term3158, term3158.getClass(), "labelAnchor", term3161);
        setField(term3158, term3158.getClass(), "rotationAnchor", term3145);
        setDoubleField(term3158, term3158.getClass(), "angle", 0.0);
        setField(term3164, term3164.getClass(), "name", "");
        setField(term3158, term3158.getClass(), "widthType", term3164);
        setFloatField(term3158, term3158.getClass(), "widthRatio", 0.3F);
        setField(term3139, term3139.getClass(), "positionForAxisAtLeft", term3158);
        setField(term3168, term3168.getClass(), "name", "");
        setField(term3167, term3167.getClass(), "categoryAnchor", term3168);
        setField(term3170, term3170.getClass(), "name", "");
        setField(term3167, term3167.getClass(), "labelAnchor", term3170);
        setField(term3167, term3167.getClass(), "rotationAnchor", term3145);
        setDoubleField(term3167, term3167.getClass(), "angle", 0.0);
        setField(term3167, term3167.getClass(), "widthType", term3164);
        setFloatField(term3167, term3167.getClass(), "widthRatio", 0.3F);
        setField(term3139, term3139.getClass(), "positionForAxisAtRight", term3167);
        setField(term3132, term3132.getClass(), "categoryLabelPositions", term3139);
        setField(term3132, term3132.getClass(), "tickLabelFontMap", term3174);
        setField(term3132, term3132.getClass(), "tickLabelPaintMap", term3179);
        setField(term3132, term3132.getClass(), "categoryLabelToolTips", term3184);
        setBooleanField(term3132, term3132.getClass(), "visible", true);
        setField(term3132, term3132.getClass(), "label", "fhkbdRViHi");
        setField(term3202, term3202.getClass(), "fRequestedAttributes", null);
        setField(term3202, term3202.getClass(), "name", "SansSerif");
        setIntField(term3202, term3202.getClass(), "style", 0);
        setIntField(term3202, term3202.getClass(), "size", 12);
        setFloatField(term3202, term3202.getClass(), "pointSize", 12.0F);
        setField(term3202, term3202.getClass(), "peer", null);
        setLongField(term3202, term3202.getClass(), "pData", 0L);
        setField(term3202, term3202.getClass(), "font2DHandle", null);
        setField(term3202, term3202.getClass(), "values", null);
        setBooleanField(term3202, term3202.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term3202, term3202.getClass(), "createdFont", false);
        setBooleanField(term3202, term3202.getClass(), "nonIdentityTx", false);
        setIntField(term3202, term3202.getClass(), "hash", 0);
        setIntField(term3202, term3202.getClass(), "fontSerializedDataVersion", 1);
        setField(term3202, term3202.getClass(), "flmref", null);
        setField(term3132, term3132.getClass(), "labelFont", term3202);
        setIntField(term3223, term3223.getClass(), "value", -16777216);
        setField(term3223, term3223.getClass(), "frgbvalue", null);
        setField(term3223, term3223.getClass(), "fvalue", null);
        setFloatField(term3223, term3223.getClass(), "falpha", 0.0F);
        setField(term3223, term3223.getClass(), "cs", null);
        setField(term3132, term3132.getClass(), "labelPaint", term3223);
        setField(term3227, term3227.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term3226, term3226.getClass(), "unitType", term3227);
        setDoubleField(term3226, term3226.getClass(), "top", 3.0);
        setDoubleField(term3226, term3226.getClass(), "left", 3.0);
        setDoubleField(term3226, term3226.getClass(), "bottom", 3.0);
        setDoubleField(term3226, term3226.getClass(), "right", 3.0);
        setField(term3132, term3132.getClass(), "labelInsets", term3226);
        setDoubleField(term3132, term3132.getClass(), "labelAngle", 0.6397214730945112);
        setField(term3132, term3132.getClass(), "labelToolTip", "uWHnvSvaPl");
        setField(term3132, term3132.getClass(), "labelURL", "kBdSllIBVz");
        setBooleanField(term3132, term3132.getClass(), "axisLineVisible", true);
        setFloatField(term3277, term3277.getClass(), "width", 1.0F);
        setIntField(term3277, term3277.getClass(), "join", 0);
        setIntField(term3277, term3277.getClass(), "cap", 2);
        setFloatField(term3277, term3277.getClass(), "miterlimit", 10.0F);
        setField(term3277, term3277.getClass(), "dash", null);
        setFloatField(term3277, term3277.getClass(), "dash_phase", 0.0F);
        setField(term3132, term3132.getClass(), "axisLineStroke", term3277);
        setIntField(term3283, term3283.getClass(), "value", -8355712);
        setField(term3283, term3283.getClass(), "frgbvalue", null);
        setField(term3283, term3283.getClass(), "fvalue", null);
        setFloatField(term3283, term3283.getClass(), "falpha", 0.0F);
        setField(term3283, term3283.getClass(), "cs", null);
        setField(term3132, term3132.getClass(), "axisLinePaint", term3283);
        setBooleanField(term3132, term3132.getClass(), "tickLabelsVisible", true);
        setField(term3287, term3287.getClass(), "fRequestedAttributes", null);
        setField(term3287, term3287.getClass(), "name", "SansSerif");
        setIntField(term3287, term3287.getClass(), "style", 0);
        setIntField(term3287, term3287.getClass(), "size", 10);
        setFloatField(term3287, term3287.getClass(), "pointSize", 10.0F);
        setField(term3287, term3287.getClass(), "peer", null);
        setLongField(term3287, term3287.getClass(), "pData", 0L);
        setField(term3287, term3287.getClass(), "font2DHandle", null);
        setField(term3287, term3287.getClass(), "values", null);
        setBooleanField(term3287, term3287.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term3287, term3287.getClass(), "createdFont", false);
        setBooleanField(term3287, term3287.getClass(), "nonIdentityTx", false);
        setIntField(term3287, term3287.getClass(), "hash", 0);
        setIntField(term3287, term3287.getClass(), "fontSerializedDataVersion", 1);
        setField(term3287, term3287.getClass(), "flmref", null);
        setField(term3132, term3132.getClass(), "tickLabelFont", term3287);
        setField(term3132, term3132.getClass(), "tickLabelPaint", term3223);
        setField(term3308, term3308.getClass(), "unitType", term3227);
        setDoubleField(term3308, term3308.getClass(), "top", 2.0);
        setDoubleField(term3308, term3308.getClass(), "left", 4.0);
        setDoubleField(term3308, term3308.getClass(), "bottom", 2.0);
        setDoubleField(term3308, term3308.getClass(), "right", 4.0);
        setField(term3132, term3132.getClass(), "tickLabelInsets", term3308);
        setBooleanField(term3132, term3132.getClass(), "tickMarksVisible", true);
        setFloatField(term3132, term3132.getClass(), "tickMarkInsideLength", 0.15826964F);
        setFloatField(term3132, term3132.getClass(), "tickMarkOutsideLength", 2.0F);
        setFloatField(term3316, term3316.getClass(), "width", 1.0F);
        setIntField(term3316, term3316.getClass(), "join", 0);
        setIntField(term3316, term3316.getClass(), "cap", 2);
        setFloatField(term3316, term3316.getClass(), "miterlimit", 10.0F);
        setField(term3316, term3316.getClass(), "dash", null);
        setFloatField(term3316, term3316.getClass(), "dash_phase", 0.0F);
        setField(term3132, term3132.getClass(), "tickMarkStroke", term3316);
        setField(term3132, term3132.getClass(), "tickMarkPaint", term3283);
        setDoubleField(term3132, term3132.getClass(), "fixedDimension", 0.25937345430928016);
        setField(term3132, term3132.getClass(), "plot", null);
        setField(term3323, term3323.getClass(), "listenerList", term3324);
        setField(term3132, term3132.getClass(), "listenerList", term3323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        Object[] args = new Object[1];
        args[0] = term3132;
        try {
            callMethod(klass, "getCategoriesForAxis", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


