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
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;

public class CategoryPlot_setDomainAxis_1500746262169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584;
     Object term586;

    public CategoryPlot_setDomainAxis_1500746262169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584 = new Integer(1162663216);
        HashMap term628 = new HashMap();
        HashMap term633 = new HashMap();
        HashMap term638 = new HashMap();
        term586 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term593 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term594 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term595 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term597 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term599 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term602 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term605 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term606 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term608 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term612 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term613 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term615 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term618 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term621 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term622 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term624 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term656 = newInstance(Class.forName("java.awt.Font"));
        Object term677 = newInstance(Class.forName("java.awt.Color"));
        Object term680 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term681 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term731 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term737 = newInstance(Class.forName("java.awt.Color"));
        Object term741 = newInstance(Class.forName("java.awt.Font"));
        Object term762 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term770 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term777 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term778 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term586, term586.getClass(), "lowerMargin", 0.05);
        setDoubleField(term586, term586.getClass(), "upperMargin", 0.05);
        setDoubleField(term586, term586.getClass(), "categoryMargin", 0.2);
        setIntField(term586, term586.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term586, term586.getClass(), "maximumCategoryLabelWidthRatio", 0.5446086F);
        setIntField(term586, term586.getClass(), "categoryLabelPositionOffset", 4);
        setField(term595, term595.getClass(), "name", "");
        setField(term594, term594.getClass(), "categoryAnchor", term595);
        setField(term597, term597.getClass(), "name", "");
        setField(term594, term594.getClass(), "labelAnchor", term597);
        setField(term599, term599.getClass(), "name", "");
        setField(term594, term594.getClass(), "rotationAnchor", term599);
        setDoubleField(term594, term594.getClass(), "angle", 0.0);
        setField(term602, term602.getClass(), "name", "");
        setField(term594, term594.getClass(), "widthType", term602);
        setFloatField(term594, term594.getClass(), "widthRatio", 0.95F);
        setField(term593, term593.getClass(), "positionForAxisAtTop", term594);
        setField(term606, term606.getClass(), "name", "");
        setField(term605, term605.getClass(), "categoryAnchor", term606);
        setField(term608, term608.getClass(), "name", "");
        setField(term605, term605.getClass(), "labelAnchor", term608);
        setField(term605, term605.getClass(), "rotationAnchor", term599);
        setDoubleField(term605, term605.getClass(), "angle", 0.0);
        setField(term605, term605.getClass(), "widthType", term602);
        setFloatField(term605, term605.getClass(), "widthRatio", 0.95F);
        setField(term593, term593.getClass(), "positionForAxisAtBottom", term605);
        setField(term613, term613.getClass(), "name", "");
        setField(term612, term612.getClass(), "categoryAnchor", term613);
        setField(term615, term615.getClass(), "name", "");
        setField(term612, term612.getClass(), "labelAnchor", term615);
        setField(term612, term612.getClass(), "rotationAnchor", term599);
        setDoubleField(term612, term612.getClass(), "angle", 0.0);
        setField(term618, term618.getClass(), "name", "");
        setField(term612, term612.getClass(), "widthType", term618);
        setFloatField(term612, term612.getClass(), "widthRatio", 0.3F);
        setField(term593, term593.getClass(), "positionForAxisAtLeft", term612);
        setField(term622, term622.getClass(), "name", "");
        setField(term621, term621.getClass(), "categoryAnchor", term622);
        setField(term624, term624.getClass(), "name", "");
        setField(term621, term621.getClass(), "labelAnchor", term624);
        setField(term621, term621.getClass(), "rotationAnchor", term599);
        setDoubleField(term621, term621.getClass(), "angle", 0.0);
        setField(term621, term621.getClass(), "widthType", term618);
        setFloatField(term621, term621.getClass(), "widthRatio", 0.3F);
        setField(term593, term593.getClass(), "positionForAxisAtRight", term621);
        setField(term586, term586.getClass(), "categoryLabelPositions", term593);
        setField(term586, term586.getClass(), "tickLabelFontMap", term628);
        setField(term586, term586.getClass(), "tickLabelPaintMap", term633);
        setField(term586, term586.getClass(), "categoryLabelToolTips", term638);
        setBooleanField(term586, term586.getClass(), "visible", true);
        setField(term586, term586.getClass(), "label", "MjGYSRKTNF");
        setField(term656, term656.getClass(), "fRequestedAttributes", null);
        setField(term656, term656.getClass(), "name", "SansSerif");
        setIntField(term656, term656.getClass(), "style", 0);
        setIntField(term656, term656.getClass(), "size", 12);
        setFloatField(term656, term656.getClass(), "pointSize", 12.0F);
        setField(term656, term656.getClass(), "peer", null);
        setLongField(term656, term656.getClass(), "pData", 0L);
        setField(term656, term656.getClass(), "font2DHandle", null);
        setField(term656, term656.getClass(), "values", null);
        setBooleanField(term656, term656.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term656, term656.getClass(), "createdFont", false);
        setBooleanField(term656, term656.getClass(), "nonIdentityTx", false);
        setIntField(term656, term656.getClass(), "hash", 0);
        setIntField(term656, term656.getClass(), "fontSerializedDataVersion", 1);
        setField(term656, term656.getClass(), "flmref", null);
        setField(term586, term586.getClass(), "labelFont", term656);
        setIntField(term677, term677.getClass(), "value", -16777216);
        setField(term677, term677.getClass(), "frgbvalue", null);
        setField(term677, term677.getClass(), "fvalue", null);
        setFloatField(term677, term677.getClass(), "falpha", 0.0F);
        setField(term677, term677.getClass(), "cs", null);
        setField(term586, term586.getClass(), "labelPaint", term677);
        setField(term681, term681.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term680, term680.getClass(), "unitType", term681);
        setDoubleField(term680, term680.getClass(), "top", 3.0);
        setDoubleField(term680, term680.getClass(), "left", 3.0);
        setDoubleField(term680, term680.getClass(), "bottom", 3.0);
        setDoubleField(term680, term680.getClass(), "right", 3.0);
        setField(term586, term586.getClass(), "labelInsets", term680);
        setDoubleField(term586, term586.getClass(), "labelAngle", 0.28570734989730284);
        setField(term586, term586.getClass(), "labelToolTip", "hRNSzYYIrc");
        setField(term586, term586.getClass(), "labelURL", "RMFIsYGgne");
        setBooleanField(term586, term586.getClass(), "axisLineVisible", true);
        setFloatField(term731, term731.getClass(), "width", 1.0F);
        setIntField(term731, term731.getClass(), "join", 0);
        setIntField(term731, term731.getClass(), "cap", 2);
        setFloatField(term731, term731.getClass(), "miterlimit", 10.0F);
        setField(term731, term731.getClass(), "dash", null);
        setFloatField(term731, term731.getClass(), "dash_phase", 0.0F);
        setField(term586, term586.getClass(), "axisLineStroke", term731);
        setIntField(term737, term737.getClass(), "value", -8355712);
        setField(term737, term737.getClass(), "frgbvalue", null);
        setField(term737, term737.getClass(), "fvalue", null);
        setFloatField(term737, term737.getClass(), "falpha", 0.0F);
        setField(term737, term737.getClass(), "cs", null);
        setField(term586, term586.getClass(), "axisLinePaint", term737);
        setBooleanField(term586, term586.getClass(), "tickLabelsVisible", true);
        setField(term741, term741.getClass(), "fRequestedAttributes", null);
        setField(term741, term741.getClass(), "name", "SansSerif");
        setIntField(term741, term741.getClass(), "style", 0);
        setIntField(term741, term741.getClass(), "size", 10);
        setFloatField(term741, term741.getClass(), "pointSize", 10.0F);
        setField(term741, term741.getClass(), "peer", null);
        setLongField(term741, term741.getClass(), "pData", 0L);
        setField(term741, term741.getClass(), "font2DHandle", null);
        setField(term741, term741.getClass(), "values", null);
        setBooleanField(term741, term741.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term741, term741.getClass(), "createdFont", false);
        setBooleanField(term741, term741.getClass(), "nonIdentityTx", false);
        setIntField(term741, term741.getClass(), "hash", 0);
        setIntField(term741, term741.getClass(), "fontSerializedDataVersion", 1);
        setField(term741, term741.getClass(), "flmref", null);
        setField(term586, term586.getClass(), "tickLabelFont", term741);
        setField(term586, term586.getClass(), "tickLabelPaint", term677);
        setField(term762, term762.getClass(), "unitType", term681);
        setDoubleField(term762, term762.getClass(), "top", 2.0);
        setDoubleField(term762, term762.getClass(), "left", 4.0);
        setDoubleField(term762, term762.getClass(), "bottom", 2.0);
        setDoubleField(term762, term762.getClass(), "right", 4.0);
        setField(term586, term586.getClass(), "tickLabelInsets", term762);
        setBooleanField(term586, term586.getClass(), "tickMarksVisible", false);
        setFloatField(term586, term586.getClass(), "tickMarkInsideLength", 0.2857073F);
        setFloatField(term586, term586.getClass(), "tickMarkOutsideLength", 2.0F);
        setFloatField(term770, term770.getClass(), "width", 1.0F);
        setIntField(term770, term770.getClass(), "join", 0);
        setIntField(term770, term770.getClass(), "cap", 2);
        setFloatField(term770, term770.getClass(), "miterlimit", 10.0F);
        setField(term770, term770.getClass(), "dash", null);
        setFloatField(term770, term770.getClass(), "dash_phase", 0.0F);
        setField(term586, term586.getClass(), "tickMarkStroke", term770);
        setField(term586, term586.getClass(), "tickMarkPaint", term737);
        setDoubleField(term586, term586.getClass(), "fixedDimension", 0.40176586625454525);
        setField(term586, term586.getClass(), "plot", null);
        setField(term777, term777.getClass(), "listenerList", term778);
        setField(term586, term586.getClass(), "listenerList", term777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        Object[] args = new Object[2];
        args[0] = term584;
        args[1] = term586;
        try {
            callMethod(klass, "setDomainAxis", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


