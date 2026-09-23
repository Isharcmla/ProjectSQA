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

public class CategoryPlot_getCategoriesForAxis_353288345329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3419;

    public CategoryPlot_getCategoriesForAxis_353288345329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3461 = new HashMap();
        HashMap term3466 = new HashMap();
        HashMap term3471 = new HashMap();
        term3419 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term3426 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term3427 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3428 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3430 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3432 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term3435 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term3438 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3439 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3441 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3445 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3446 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3448 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3451 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term3454 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term3455 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term3457 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term3489 = newInstance(Class.forName("java.awt.Font"));
        Object term3510 = newInstance(Class.forName("java.awt.Color"));
        Object term3513 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term3514 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term3564 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term3570 = newInstance(Class.forName("java.awt.Color"));
        Object term3574 = newInstance(Class.forName("java.awt.Font"));
        Object term3595 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term3603 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term3610 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3611 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term3419, term3419.getClass(), "lowerMargin", 0.05);
        setDoubleField(term3419, term3419.getClass(), "upperMargin", 0.05);
        setDoubleField(term3419, term3419.getClass(), "categoryMargin", 0.2);
        setIntField(term3419, term3419.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term3419, term3419.getClass(), "maximumCategoryLabelWidthRatio", 0.15826964F);
        setIntField(term3419, term3419.getClass(), "categoryLabelPositionOffset", 4);
        setField(term3428, term3428.getClass(), "name", "");
        setField(term3427, term3427.getClass(), "categoryAnchor", term3428);
        setField(term3430, term3430.getClass(), "name", "");
        setField(term3427, term3427.getClass(), "labelAnchor", term3430);
        setField(term3432, term3432.getClass(), "name", "");
        setField(term3427, term3427.getClass(), "rotationAnchor", term3432);
        setDoubleField(term3427, term3427.getClass(), "angle", 0.0);
        setField(term3435, term3435.getClass(), "name", "");
        setField(term3427, term3427.getClass(), "widthType", term3435);
        setFloatField(term3427, term3427.getClass(), "widthRatio", 0.95F);
        setField(term3426, term3426.getClass(), "positionForAxisAtTop", term3427);
        setField(term3439, term3439.getClass(), "name", "");
        setField(term3438, term3438.getClass(), "categoryAnchor", term3439);
        setField(term3441, term3441.getClass(), "name", "");
        setField(term3438, term3438.getClass(), "labelAnchor", term3441);
        setField(term3438, term3438.getClass(), "rotationAnchor", term3432);
        setDoubleField(term3438, term3438.getClass(), "angle", 0.0);
        setField(term3438, term3438.getClass(), "widthType", term3435);
        setFloatField(term3438, term3438.getClass(), "widthRatio", 0.95F);
        setField(term3426, term3426.getClass(), "positionForAxisAtBottom", term3438);
        setField(term3446, term3446.getClass(), "name", "");
        setField(term3445, term3445.getClass(), "categoryAnchor", term3446);
        setField(term3448, term3448.getClass(), "name", "");
        setField(term3445, term3445.getClass(), "labelAnchor", term3448);
        setField(term3445, term3445.getClass(), "rotationAnchor", term3432);
        setDoubleField(term3445, term3445.getClass(), "angle", 0.0);
        setField(term3451, term3451.getClass(), "name", "");
        setField(term3445, term3445.getClass(), "widthType", term3451);
        setFloatField(term3445, term3445.getClass(), "widthRatio", 0.3F);
        setField(term3426, term3426.getClass(), "positionForAxisAtLeft", term3445);
        setField(term3455, term3455.getClass(), "name", "");
        setField(term3454, term3454.getClass(), "categoryAnchor", term3455);
        setField(term3457, term3457.getClass(), "name", "");
        setField(term3454, term3454.getClass(), "labelAnchor", term3457);
        setField(term3454, term3454.getClass(), "rotationAnchor", term3432);
        setDoubleField(term3454, term3454.getClass(), "angle", 0.0);
        setField(term3454, term3454.getClass(), "widthType", term3451);
        setFloatField(term3454, term3454.getClass(), "widthRatio", 0.3F);
        setField(term3426, term3426.getClass(), "positionForAxisAtRight", term3454);
        setField(term3419, term3419.getClass(), "categoryLabelPositions", term3426);
        setField(term3419, term3419.getClass(), "tickLabelFontMap", term3461);
        setField(term3419, term3419.getClass(), "tickLabelPaintMap", term3466);
        setField(term3419, term3419.getClass(), "categoryLabelToolTips", term3471);
        setBooleanField(term3419, term3419.getClass(), "visible", true);
        setField(term3419, term3419.getClass(), "label", "HqBOwkVqjD");
        setField(term3489, term3489.getClass(), "fRequestedAttributes", null);
        setField(term3489, term3489.getClass(), "name", "SansSerif");
        setIntField(term3489, term3489.getClass(), "style", 0);
        setIntField(term3489, term3489.getClass(), "size", 12);
        setFloatField(term3489, term3489.getClass(), "pointSize", 12.0F);
        setField(term3489, term3489.getClass(), "peer", null);
        setLongField(term3489, term3489.getClass(), "pData", 0L);
        setField(term3489, term3489.getClass(), "font2DHandle", null);
        setField(term3489, term3489.getClass(), "values", null);
        setBooleanField(term3489, term3489.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term3489, term3489.getClass(), "createdFont", false);
        setBooleanField(term3489, term3489.getClass(), "nonIdentityTx", false);
        setIntField(term3489, term3489.getClass(), "hash", 0);
        setIntField(term3489, term3489.getClass(), "fontSerializedDataVersion", 1);
        setField(term3489, term3489.getClass(), "flmref", null);
        setField(term3419, term3419.getClass(), "labelFont", term3489);
        setIntField(term3510, term3510.getClass(), "value", -16777216);
        setField(term3510, term3510.getClass(), "frgbvalue", null);
        setField(term3510, term3510.getClass(), "fvalue", null);
        setFloatField(term3510, term3510.getClass(), "falpha", 0.0F);
        setField(term3510, term3510.getClass(), "cs", null);
        setField(term3419, term3419.getClass(), "labelPaint", term3510);
        setField(term3514, term3514.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term3513, term3513.getClass(), "unitType", term3514);
        setDoubleField(term3513, term3513.getClass(), "top", 3.0);
        setDoubleField(term3513, term3513.getClass(), "left", 3.0);
        setDoubleField(term3513, term3513.getClass(), "bottom", 3.0);
        setDoubleField(term3513, term3513.getClass(), "right", 3.0);
        setField(term3419, term3419.getClass(), "labelInsets", term3513);
        setDoubleField(term3419, term3419.getClass(), "labelAngle", 0.15917839663695388);
        setField(term3419, term3419.getClass(), "labelToolTip", "MAcUBcBckh");
        setField(term3419, term3419.getClass(), "labelURL", "oVgzLbrsFr");
        setBooleanField(term3419, term3419.getClass(), "axisLineVisible", true);
        setFloatField(term3564, term3564.getClass(), "width", 1.0F);
        setIntField(term3564, term3564.getClass(), "join", 0);
        setIntField(term3564, term3564.getClass(), "cap", 2);
        setFloatField(term3564, term3564.getClass(), "miterlimit", 10.0F);
        setField(term3564, term3564.getClass(), "dash", null);
        setFloatField(term3564, term3564.getClass(), "dash_phase", 0.0F);
        setField(term3419, term3419.getClass(), "axisLineStroke", term3564);
        setIntField(term3570, term3570.getClass(), "value", -8355712);
        setField(term3570, term3570.getClass(), "frgbvalue", null);
        setField(term3570, term3570.getClass(), "fvalue", null);
        setFloatField(term3570, term3570.getClass(), "falpha", 0.0F);
        setField(term3570, term3570.getClass(), "cs", null);
        setField(term3419, term3419.getClass(), "axisLinePaint", term3570);
        setBooleanField(term3419, term3419.getClass(), "tickLabelsVisible", true);
        setField(term3574, term3574.getClass(), "fRequestedAttributes", null);
        setField(term3574, term3574.getClass(), "name", "SansSerif");
        setIntField(term3574, term3574.getClass(), "style", 0);
        setIntField(term3574, term3574.getClass(), "size", 10);
        setFloatField(term3574, term3574.getClass(), "pointSize", 10.0F);
        setField(term3574, term3574.getClass(), "peer", null);
        setLongField(term3574, term3574.getClass(), "pData", 0L);
        setField(term3574, term3574.getClass(), "font2DHandle", null);
        setField(term3574, term3574.getClass(), "values", null);
        setBooleanField(term3574, term3574.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term3574, term3574.getClass(), "createdFont", false);
        setBooleanField(term3574, term3574.getClass(), "nonIdentityTx", false);
        setIntField(term3574, term3574.getClass(), "hash", 0);
        setIntField(term3574, term3574.getClass(), "fontSerializedDataVersion", 1);
        setField(term3574, term3574.getClass(), "flmref", null);
        setField(term3419, term3419.getClass(), "tickLabelFont", term3574);
        setField(term3419, term3419.getClass(), "tickLabelPaint", term3510);
        setField(term3595, term3595.getClass(), "unitType", term3514);
        setDoubleField(term3595, term3595.getClass(), "top", 2.0);
        setDoubleField(term3595, term3595.getClass(), "left", 4.0);
        setDoubleField(term3595, term3595.getClass(), "bottom", 2.0);
        setDoubleField(term3595, term3595.getClass(), "right", 4.0);
        setField(term3419, term3419.getClass(), "tickLabelInsets", term3595);
        setBooleanField(term3419, term3419.getClass(), "tickMarksVisible", true);
        setFloatField(term3419, term3419.getClass(), "tickMarkInsideLength", 0.17877543F);
        setFloatField(term3419, term3419.getClass(), "tickMarkOutsideLength", 2.0F);
        setFloatField(term3603, term3603.getClass(), "width", 1.0F);
        setIntField(term3603, term3603.getClass(), "join", 0);
        setIntField(term3603, term3603.getClass(), "cap", 2);
        setFloatField(term3603, term3603.getClass(), "miterlimit", 10.0F);
        setField(term3603, term3603.getClass(), "dash", null);
        setFloatField(term3603, term3603.getClass(), "dash_phase", 0.0F);
        setField(term3419, term3419.getClass(), "tickMarkStroke", term3603);
        setField(term3419, term3419.getClass(), "tickMarkPaint", term3570);
        setDoubleField(term3419, term3419.getClass(), "fixedDimension", 0.9374115574082594);
        setField(term3419, term3419.getClass(), "plot", null);
        setField(term3610, term3610.getClass(), "listenerList", term3611);
        setField(term3419, term3419.getClass(), "listenerList", term3610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        Object[] args = new Object[1];
        args[0] = term3419;
        try {
            callMethod(klass, "getCategoriesForAxis", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


