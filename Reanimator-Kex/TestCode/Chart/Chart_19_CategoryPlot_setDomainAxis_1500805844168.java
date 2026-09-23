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

public class CategoryPlot_setDomainAxis_1500805844168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public CategoryPlot_setDomainAxis_1500805844168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term368 = new HashMap();
        HashMap term373 = new HashMap();
        HashMap term378 = new HashMap();
        term326 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term333 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term334 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term335 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term337 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term339 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term342 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term345 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term346 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term348 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term352 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term353 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term355 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term358 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term361 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term362 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term364 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term396 = newInstance(Class.forName("java.awt.Font"));
        Object term417 = newInstance(Class.forName("java.awt.Color"));
        Object term420 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term421 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term471 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term477 = newInstance(Class.forName("java.awt.Color"));
        Object term481 = newInstance(Class.forName("java.awt.Font"));
        Object term502 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term510 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term517 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term518 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term326, term326.getClass(), "lowerMargin", 0.05);
        setDoubleField(term326, term326.getClass(), "upperMargin", 0.05);
        setDoubleField(term326, term326.getClass(), "categoryMargin", 0.2);
        setIntField(term326, term326.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term326, term326.getClass(), "maximumCategoryLabelWidthRatio", 0.09123778F);
        setIntField(term326, term326.getClass(), "categoryLabelPositionOffset", 4);
        setField(term335, term335.getClass(), "name", "");
        setField(term334, term334.getClass(), "categoryAnchor", term335);
        setField(term337, term337.getClass(), "name", "");
        setField(term334, term334.getClass(), "labelAnchor", term337);
        setField(term339, term339.getClass(), "name", "");
        setField(term334, term334.getClass(), "rotationAnchor", term339);
        setDoubleField(term334, term334.getClass(), "angle", 0.0);
        setField(term342, term342.getClass(), "name", "");
        setField(term334, term334.getClass(), "widthType", term342);
        setFloatField(term334, term334.getClass(), "widthRatio", 0.95F);
        setField(term333, term333.getClass(), "positionForAxisAtTop", term334);
        setField(term346, term346.getClass(), "name", "");
        setField(term345, term345.getClass(), "categoryAnchor", term346);
        setField(term348, term348.getClass(), "name", "");
        setField(term345, term345.getClass(), "labelAnchor", term348);
        setField(term345, term345.getClass(), "rotationAnchor", term339);
        setDoubleField(term345, term345.getClass(), "angle", 0.0);
        setField(term345, term345.getClass(), "widthType", term342);
        setFloatField(term345, term345.getClass(), "widthRatio", 0.95F);
        setField(term333, term333.getClass(), "positionForAxisAtBottom", term345);
        setField(term353, term353.getClass(), "name", "");
        setField(term352, term352.getClass(), "categoryAnchor", term353);
        setField(term355, term355.getClass(), "name", "");
        setField(term352, term352.getClass(), "labelAnchor", term355);
        setField(term352, term352.getClass(), "rotationAnchor", term339);
        setDoubleField(term352, term352.getClass(), "angle", 0.0);
        setField(term358, term358.getClass(), "name", "");
        setField(term352, term352.getClass(), "widthType", term358);
        setFloatField(term352, term352.getClass(), "widthRatio", 0.3F);
        setField(term333, term333.getClass(), "positionForAxisAtLeft", term352);
        setField(term362, term362.getClass(), "name", "");
        setField(term361, term361.getClass(), "categoryAnchor", term362);
        setField(term364, term364.getClass(), "name", "");
        setField(term361, term361.getClass(), "labelAnchor", term364);
        setField(term361, term361.getClass(), "rotationAnchor", term339);
        setDoubleField(term361, term361.getClass(), "angle", 0.0);
        setField(term361, term361.getClass(), "widthType", term358);
        setFloatField(term361, term361.getClass(), "widthRatio", 0.3F);
        setField(term333, term333.getClass(), "positionForAxisAtRight", term361);
        setField(term326, term326.getClass(), "categoryLabelPositions", term333);
        setField(term326, term326.getClass(), "tickLabelFontMap", term368);
        setField(term326, term326.getClass(), "tickLabelPaintMap", term373);
        setField(term326, term326.getClass(), "categoryLabelToolTips", term378);
        setBooleanField(term326, term326.getClass(), "visible", true);
        setField(term326, term326.getClass(), "label", "jJCZpVmanW");
        setField(term396, term396.getClass(), "fRequestedAttributes", null);
        setField(term396, term396.getClass(), "name", "SansSerif");
        setIntField(term396, term396.getClass(), "style", 0);
        setIntField(term396, term396.getClass(), "size", 12);
        setFloatField(term396, term396.getClass(), "pointSize", 12.0F);
        setField(term396, term396.getClass(), "peer", null);
        setLongField(term396, term396.getClass(), "pData", 0L);
        setField(term396, term396.getClass(), "font2DHandle", null);
        setField(term396, term396.getClass(), "values", null);
        setBooleanField(term396, term396.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term396, term396.getClass(), "createdFont", false);
        setBooleanField(term396, term396.getClass(), "nonIdentityTx", false);
        setIntField(term396, term396.getClass(), "hash", 0);
        setIntField(term396, term396.getClass(), "fontSerializedDataVersion", 1);
        setField(term396, term396.getClass(), "flmref", null);
        setField(term326, term326.getClass(), "labelFont", term396);
        setIntField(term417, term417.getClass(), "value", -16777216);
        setField(term417, term417.getClass(), "frgbvalue", null);
        setField(term417, term417.getClass(), "fvalue", null);
        setFloatField(term417, term417.getClass(), "falpha", 0.0F);
        setField(term417, term417.getClass(), "cs", null);
        setField(term326, term326.getClass(), "labelPaint", term417);
        setField(term421, term421.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term420, term420.getClass(), "unitType", term421);
        setDoubleField(term420, term420.getClass(), "top", 3.0);
        setDoubleField(term420, term420.getClass(), "left", 3.0);
        setDoubleField(term420, term420.getClass(), "bottom", 3.0);
        setDoubleField(term420, term420.getClass(), "right", 3.0);
        setField(term326, term326.getClass(), "labelInsets", term420);
        setDoubleField(term326, term326.getClass(), "labelAngle", 0.5523635872663106);
        setField(term326, term326.getClass(), "labelToolTip", "EGtDIRbSSb");
        setField(term326, term326.getClass(), "labelURL", "SzjVpOQTyS");
        setBooleanField(term326, term326.getClass(), "axisLineVisible", true);
        setFloatField(term471, term471.getClass(), "width", 1.0F);
        setIntField(term471, term471.getClass(), "join", 0);
        setIntField(term471, term471.getClass(), "cap", 2);
        setFloatField(term471, term471.getClass(), "miterlimit", 10.0F);
        setField(term471, term471.getClass(), "dash", null);
        setFloatField(term471, term471.getClass(), "dash_phase", 0.0F);
        setField(term326, term326.getClass(), "axisLineStroke", term471);
        setIntField(term477, term477.getClass(), "value", -8355712);
        setField(term477, term477.getClass(), "frgbvalue", null);
        setField(term477, term477.getClass(), "fvalue", null);
        setFloatField(term477, term477.getClass(), "falpha", 0.0F);
        setField(term477, term477.getClass(), "cs", null);
        setField(term326, term326.getClass(), "axisLinePaint", term477);
        setBooleanField(term326, term326.getClass(), "tickLabelsVisible", true);
        setField(term481, term481.getClass(), "fRequestedAttributes", null);
        setField(term481, term481.getClass(), "name", "SansSerif");
        setIntField(term481, term481.getClass(), "style", 0);
        setIntField(term481, term481.getClass(), "size", 10);
        setFloatField(term481, term481.getClass(), "pointSize", 10.0F);
        setField(term481, term481.getClass(), "peer", null);
        setLongField(term481, term481.getClass(), "pData", 0L);
        setField(term481, term481.getClass(), "font2DHandle", null);
        setField(term481, term481.getClass(), "values", null);
        setBooleanField(term481, term481.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term481, term481.getClass(), "createdFont", false);
        setBooleanField(term481, term481.getClass(), "nonIdentityTx", false);
        setIntField(term481, term481.getClass(), "hash", 0);
        setIntField(term481, term481.getClass(), "fontSerializedDataVersion", 1);
        setField(term481, term481.getClass(), "flmref", null);
        setField(term326, term326.getClass(), "tickLabelFont", term481);
        setField(term326, term326.getClass(), "tickLabelPaint", term417);
        setField(term502, term502.getClass(), "unitType", term421);
        setDoubleField(term502, term502.getClass(), "top", 2.0);
        setDoubleField(term502, term502.getClass(), "left", 4.0);
        setDoubleField(term502, term502.getClass(), "bottom", 2.0);
        setDoubleField(term502, term502.getClass(), "right", 4.0);
        setField(term326, term326.getClass(), "tickLabelInsets", term502);
        setBooleanField(term326, term326.getClass(), "tickMarksVisible", false);
        setFloatField(term326, term326.getClass(), "tickMarkInsideLength", 0.8564069F);
        setFloatField(term326, term326.getClass(), "tickMarkOutsideLength", 2.0F);
        setFloatField(term510, term510.getClass(), "width", 1.0F);
        setIntField(term510, term510.getClass(), "join", 0);
        setIntField(term510, term510.getClass(), "cap", 2);
        setFloatField(term510, term510.getClass(), "miterlimit", 10.0F);
        setField(term510, term510.getClass(), "dash", null);
        setFloatField(term510, term510.getClass(), "dash_phase", 0.0F);
        setField(term326, term326.getClass(), "tickMarkStroke", term510);
        setField(term326, term326.getClass(), "tickMarkPaint", term477);
        setDoubleField(term326, term326.getClass(), "fixedDimension", 0.544608645520025);
        setField(term326, term326.getClass(), "plot", null);
        setField(term517, term517.getClass(), "listenerList", term518);
        setField(term326, term326.getClass(), "listenerList", term517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        Object[] args = new Object[1];
        args[0] = term326;
        try {
            callMethod(klass, "setDomainAxis", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


