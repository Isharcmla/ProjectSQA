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
import java.lang.NullPointerException;
import static org.jfree.chart.renderer.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class AbstractCategoryItemRenderer_getItemMiddle_1144353000105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term316;

    public AbstractCategoryItemRenderer_getItemMiddle_1144353000105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term168 = new HashMap();
        HashMap term173 = new HashMap();
        HashMap term178 = new HashMap();
        term126 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term133 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term134 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term135 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term137 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term139 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term142 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term145 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term146 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term148 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term152 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term153 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term155 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term158 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term161 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term162 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term164 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term196 = newInstance(Class.forName("java.awt.Font"));
        Object term214 = newInstance(Class.forName("java.awt.Color"));
        Object term217 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term218 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term268 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term274 = newInstance(Class.forName("java.awt.Color"));
        Object term278 = newInstance(Class.forName("java.awt.Font"));
        Object term296 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term307 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term314 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term315 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term126, term126.getClass(), "lowerMargin", 0.05);
        setDoubleField(term126, term126.getClass(), "upperMargin", 0.05);
        setDoubleField(term126, term126.getClass(), "categoryMargin", 0.2);
        setIntField(term126, term126.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term126, term126.getClass(), "maximumCategoryLabelWidthRatio", 0.13238746F);
        setIntField(term126, term126.getClass(), "categoryLabelPositionOffset", 4);
        setField(term135, term135.getClass(), "name", "");
        setField(term134, term134.getClass(), "categoryAnchor", term135);
        setField(term137, term137.getClass(), "name", "");
        setField(term134, term134.getClass(), "labelAnchor", term137);
        setField(term139, term139.getClass(), "name", "");
        setField(term134, term134.getClass(), "rotationAnchor", term139);
        setDoubleField(term134, term134.getClass(), "angle", 0.0);
        setField(term142, term142.getClass(), "name", "");
        setField(term134, term134.getClass(), "widthType", term142);
        setFloatField(term134, term134.getClass(), "widthRatio", 0.95F);
        setField(term133, term133.getClass(), "positionForAxisAtTop", term134);
        setField(term146, term146.getClass(), "name", "");
        setField(term145, term145.getClass(), "categoryAnchor", term146);
        setField(term148, term148.getClass(), "name", "");
        setField(term145, term145.getClass(), "labelAnchor", term148);
        setField(term145, term145.getClass(), "rotationAnchor", term139);
        setDoubleField(term145, term145.getClass(), "angle", 0.0);
        setField(term145, term145.getClass(), "widthType", term142);
        setFloatField(term145, term145.getClass(), "widthRatio", 0.95F);
        setField(term133, term133.getClass(), "positionForAxisAtBottom", term145);
        setField(term153, term153.getClass(), "name", "");
        setField(term152, term152.getClass(), "categoryAnchor", term153);
        setField(term155, term155.getClass(), "name", "");
        setField(term152, term152.getClass(), "labelAnchor", term155);
        setField(term152, term152.getClass(), "rotationAnchor", term139);
        setDoubleField(term152, term152.getClass(), "angle", 0.0);
        setField(term158, term158.getClass(), "name", "");
        setField(term152, term152.getClass(), "widthType", term158);
        setFloatField(term152, term152.getClass(), "widthRatio", 0.3F);
        setField(term133, term133.getClass(), "positionForAxisAtLeft", term152);
        setField(term162, term162.getClass(), "name", "");
        setField(term161, term161.getClass(), "categoryAnchor", term162);
        setField(term164, term164.getClass(), "name", "");
        setField(term161, term161.getClass(), "labelAnchor", term164);
        setField(term161, term161.getClass(), "rotationAnchor", term139);
        setDoubleField(term161, term161.getClass(), "angle", 0.0);
        setField(term161, term161.getClass(), "widthType", term158);
        setFloatField(term161, term161.getClass(), "widthRatio", 0.3F);
        setField(term133, term133.getClass(), "positionForAxisAtRight", term161);
        setField(term126, term126.getClass(), "categoryLabelPositions", term133);
        setField(term126, term126.getClass(), "tickLabelFontMap", term168);
        setField(term126, term126.getClass(), "tickLabelPaintMap", term173);
        setField(term126, term126.getClass(), "categoryLabelToolTips", term178);
        setBooleanField(term126, term126.getClass(), "visible", true);
        setField(term126, term126.getClass(), "label", "sjlJAEtRrb");
        setField(term196, term196.getClass(), "fRequestedAttributes", null);
        setField(term196, term196.getClass(), "name", "Tahoma");
        setIntField(term196, term196.getClass(), "style", 0);
        setIntField(term196, term196.getClass(), "size", 12);
        setFloatField(term196, term196.getClass(), "pointSize", 12.0F);
        setField(term196, term196.getClass(), "peer", null);
        setLongField(term196, term196.getClass(), "pData", 0L);
        setField(term196, term196.getClass(), "font2DHandle", null);
        setField(term196, term196.getClass(), "values", null);
        setBooleanField(term196, term196.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term196, term196.getClass(), "createdFont", false);
        setBooleanField(term196, term196.getClass(), "nonIdentityTx", false);
        setIntField(term196, term196.getClass(), "hash", 0);
        setIntField(term196, term196.getClass(), "fontSerializedDataVersion", 1);
        setField(term196, term196.getClass(), "flmref", null);
        setField(term126, term126.getClass(), "labelFont", term196);
        setIntField(term214, term214.getClass(), "value", -16777216);
        setField(term214, term214.getClass(), "frgbvalue", null);
        setField(term214, term214.getClass(), "fvalue", null);
        setFloatField(term214, term214.getClass(), "falpha", 0.0F);
        setField(term214, term214.getClass(), "cs", null);
        setField(term126, term126.getClass(), "labelPaint", term214);
        setField(term218, term218.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term217, term217.getClass(), "unitType", term218);
        setDoubleField(term217, term217.getClass(), "top", 3.0);
        setDoubleField(term217, term217.getClass(), "left", 3.0);
        setDoubleField(term217, term217.getClass(), "bottom", 3.0);
        setDoubleField(term217, term217.getClass(), "right", 3.0);
        setField(term126, term126.getClass(), "labelInsets", term217);
        setDoubleField(term126, term126.getClass(), "labelAngle", 0.13238746331190498);
        setField(term126, term126.getClass(), "labelToolTip", "MuLcgQHgqz");
        setField(term126, term126.getClass(), "labelURL", "xxtlPwDYFs");
        setBooleanField(term126, term126.getClass(), "axisLineVisible", true);
        setFloatField(term268, term268.getClass(), "width", 1.0F);
        setIntField(term268, term268.getClass(), "join", 0);
        setIntField(term268, term268.getClass(), "cap", 2);
        setFloatField(term268, term268.getClass(), "miterlimit", 10.0F);
        setField(term268, term268.getClass(), "dash", null);
        setFloatField(term268, term268.getClass(), "dash_phase", 0.0F);
        setField(term126, term126.getClass(), "axisLineStroke", term268);
        setIntField(term274, term274.getClass(), "value", -8355712);
        setField(term274, term274.getClass(), "frgbvalue", null);
        setField(term274, term274.getClass(), "fvalue", null);
        setFloatField(term274, term274.getClass(), "falpha", 0.0F);
        setField(term274, term274.getClass(), "cs", null);
        setField(term126, term126.getClass(), "axisLinePaint", term274);
        setBooleanField(term126, term126.getClass(), "tickLabelsVisible", true);
        setField(term278, term278.getClass(), "fRequestedAttributes", null);
        setField(term278, term278.getClass(), "name", "Tahoma");
        setIntField(term278, term278.getClass(), "style", 0);
        setIntField(term278, term278.getClass(), "size", 12);
        setFloatField(term278, term278.getClass(), "pointSize", 12.0F);
        setField(term278, term278.getClass(), "peer", null);
        setLongField(term278, term278.getClass(), "pData", 0L);
        setField(term278, term278.getClass(), "font2DHandle", null);
        setField(term278, term278.getClass(), "values", null);
        setBooleanField(term278, term278.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term278, term278.getClass(), "createdFont", false);
        setBooleanField(term278, term278.getClass(), "nonIdentityTx", false);
        setIntField(term278, term278.getClass(), "hash", 0);
        setIntField(term278, term278.getClass(), "fontSerializedDataVersion", 1);
        setField(term278, term278.getClass(), "flmref", null);
        setField(term126, term126.getClass(), "tickLabelFont", term278);
        setField(term126, term126.getClass(), "tickLabelPaint", term214);
        setField(term296, term296.getClass(), "unitType", term218);
        setDoubleField(term296, term296.getClass(), "top", 2.0);
        setDoubleField(term296, term296.getClass(), "left", 4.0);
        setDoubleField(term296, term296.getClass(), "bottom", 2.0);
        setDoubleField(term296, term296.getClass(), "right", 4.0);
        setField(term126, term126.getClass(), "tickLabelInsets", term296);
        setBooleanField(term126, term126.getClass(), "tickMarksVisible", true);
        setFloatField(term126, term126.getClass(), "tickMarkInsideLength", 0.3455959F);
        setFloatField(term126, term126.getClass(), "tickMarkOutsideLength", 2.0F);
        setBooleanField(term126, term126.getClass(), "minorTickMarksVisible", false);
        setFloatField(term126, term126.getClass(), "minorTickMarkInsideLength", 0.09123778F);
        setFloatField(term126, term126.getClass(), "minorTickMarkOutsideLength", 2.0F);
        setFloatField(term307, term307.getClass(), "width", 1.0F);
        setIntField(term307, term307.getClass(), "join", 0);
        setIntField(term307, term307.getClass(), "cap", 2);
        setFloatField(term307, term307.getClass(), "miterlimit", 10.0F);
        setField(term307, term307.getClass(), "dash", null);
        setFloatField(term307, term307.getClass(), "dash_phase", 0.0F);
        setField(term126, term126.getClass(), "tickMarkStroke", term307);
        setField(term126, term126.getClass(), "tickMarkPaint", term274);
        setDoubleField(term126, term126.getClass(), "fixedDimension", 0.3455959125047594);
        setField(term126, term126.getClass(), "plot", null);
        setField(term314, term314.getClass(), "listenerList", term315);
        setField(term126, term126.getClass(), "listenerList", term314);
        term316 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        setField(term316, term316.getClass(), "name", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[3] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        argTypes[4] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[5] = Class.forName("org.jfree.chart.util.RectangleEdge");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term126;
        args[4] = null;
        args[5] = term316;
        try {
            callMethod(klass, "getItemMiddle", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
