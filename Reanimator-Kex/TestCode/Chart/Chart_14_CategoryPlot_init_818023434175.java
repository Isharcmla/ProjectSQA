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

public class CategoryPlot_init_818023434175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CategoryPlot_init_818023434175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43 = new HashMap();
        HashMap term48 = new HashMap();
        HashMap term53 = new HashMap();
        term1 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term8 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term9 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term10 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term12 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term14 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term17 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term20 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term21 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term23 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term27 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term28 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term30 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term33 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term36 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term37 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term39 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term71 = newInstance(Class.forName("java.awt.Font"));
        Object term92 = newInstance(Class.forName("java.awt.Color"));
        Object term95 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term96 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term146 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term152 = newInstance(Class.forName("java.awt.Color"));
        Object term156 = newInstance(Class.forName("java.awt.Font"));
        Object term177 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term185 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term192 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term193 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term1, term1.getClass(), "lowerMargin", 0.05);
        setDoubleField(term1, term1.getClass(), "upperMargin", 0.05);
        setDoubleField(term1, term1.getClass(), "categoryMargin", 0.2);
        setIntField(term1, term1.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term1, term1.getClass(), "maximumCategoryLabelWidthRatio", 0.13238746F);
        setIntField(term1, term1.getClass(), "categoryLabelPositionOffset", 4);
        setField(term10, term10.getClass(), "name", "");
        setField(term9, term9.getClass(), "categoryAnchor", term10);
        setField(term12, term12.getClass(), "name", "");
        setField(term9, term9.getClass(), "labelAnchor", term12);
        setField(term14, term14.getClass(), "name", "");
        setField(term9, term9.getClass(), "rotationAnchor", term14);
        setDoubleField(term9, term9.getClass(), "angle", 0.0);
        setField(term17, term17.getClass(), "name", "");
        setField(term9, term9.getClass(), "widthType", term17);
        setFloatField(term9, term9.getClass(), "widthRatio", 0.95F);
        setField(term8, term8.getClass(), "positionForAxisAtTop", term9);
        setField(term21, term21.getClass(), "name", "");
        setField(term20, term20.getClass(), "categoryAnchor", term21);
        setField(term23, term23.getClass(), "name", "");
        setField(term20, term20.getClass(), "labelAnchor", term23);
        setField(term20, term20.getClass(), "rotationAnchor", term14);
        setDoubleField(term20, term20.getClass(), "angle", 0.0);
        setField(term20, term20.getClass(), "widthType", term17);
        setFloatField(term20, term20.getClass(), "widthRatio", 0.95F);
        setField(term8, term8.getClass(), "positionForAxisAtBottom", term20);
        setField(term28, term28.getClass(), "name", "");
        setField(term27, term27.getClass(), "categoryAnchor", term28);
        setField(term30, term30.getClass(), "name", "");
        setField(term27, term27.getClass(), "labelAnchor", term30);
        setField(term27, term27.getClass(), "rotationAnchor", term14);
        setDoubleField(term27, term27.getClass(), "angle", 0.0);
        setField(term33, term33.getClass(), "name", "");
        setField(term27, term27.getClass(), "widthType", term33);
        setFloatField(term27, term27.getClass(), "widthRatio", 0.3F);
        setField(term8, term8.getClass(), "positionForAxisAtLeft", term27);
        setField(term37, term37.getClass(), "name", "");
        setField(term36, term36.getClass(), "categoryAnchor", term37);
        setField(term39, term39.getClass(), "name", "");
        setField(term36, term36.getClass(), "labelAnchor", term39);
        setField(term36, term36.getClass(), "rotationAnchor", term14);
        setDoubleField(term36, term36.getClass(), "angle", 0.0);
        setField(term36, term36.getClass(), "widthType", term33);
        setFloatField(term36, term36.getClass(), "widthRatio", 0.3F);
        setField(term8, term8.getClass(), "positionForAxisAtRight", term36);
        setField(term1, term1.getClass(), "categoryLabelPositions", term8);
        setField(term1, term1.getClass(), "tickLabelFontMap", term43);
        setField(term1, term1.getClass(), "tickLabelPaintMap", term48);
        setField(term1, term1.getClass(), "categoryLabelToolTips", term53);
        setBooleanField(term1, term1.getClass(), "visible", true);
        setField(term1, term1.getClass(), "label", "PAEBtnZtTD");
        setField(term71, term71.getClass(), "fRequestedAttributes", null);
        setField(term71, term71.getClass(), "name", "SansSerif");
        setIntField(term71, term71.getClass(), "style", 0);
        setIntField(term71, term71.getClass(), "size", 12);
        setFloatField(term71, term71.getClass(), "pointSize", 12.0F);
        setField(term71, term71.getClass(), "peer", null);
        setLongField(term71, term71.getClass(), "pData", 0L);
        setField(term71, term71.getClass(), "font2DHandle", null);
        setField(term71, term71.getClass(), "values", null);
        setBooleanField(term71, term71.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term71, term71.getClass(), "createdFont", false);
        setBooleanField(term71, term71.getClass(), "nonIdentityTx", false);
        setIntField(term71, term71.getClass(), "hash", 0);
        setIntField(term71, term71.getClass(), "fontSerializedDataVersion", 1);
        setField(term71, term71.getClass(), "flmref", null);
        setField(term1, term1.getClass(), "labelFont", term71);
        setIntField(term92, term92.getClass(), "value", -16777216);
        setField(term92, term92.getClass(), "frgbvalue", null);
        setField(term92, term92.getClass(), "fvalue", null);
        setFloatField(term92, term92.getClass(), "falpha", 0.0F);
        setField(term92, term92.getClass(), "cs", null);
        setField(term1, term1.getClass(), "labelPaint", term92);
        setField(term96, term96.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term95, term95.getClass(), "unitType", term96);
        setDoubleField(term95, term95.getClass(), "top", 3.0);
        setDoubleField(term95, term95.getClass(), "left", 3.0);
        setDoubleField(term95, term95.getClass(), "bottom", 3.0);
        setDoubleField(term95, term95.getClass(), "right", 3.0);
        setField(term1, term1.getClass(), "labelInsets", term95);
        setDoubleField(term1, term1.getClass(), "labelAngle", 0.13238746331190498);
        setField(term1, term1.getClass(), "labelToolTip", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "labelURL", "MuLcgQHgqz");
        setBooleanField(term1, term1.getClass(), "axisLineVisible", true);
        setFloatField(term146, term146.getClass(), "width", 1.0F);
        setIntField(term146, term146.getClass(), "join", 0);
        setIntField(term146, term146.getClass(), "cap", 2);
        setFloatField(term146, term146.getClass(), "miterlimit", 10.0F);
        setField(term146, term146.getClass(), "dash", null);
        setFloatField(term146, term146.getClass(), "dash_phase", 0.0F);
        setField(term1, term1.getClass(), "axisLineStroke", term146);
        setIntField(term152, term152.getClass(), "value", -8355712);
        setField(term152, term152.getClass(), "frgbvalue", null);
        setField(term152, term152.getClass(), "fvalue", null);
        setFloatField(term152, term152.getClass(), "falpha", 0.0F);
        setField(term152, term152.getClass(), "cs", null);
        setField(term1, term1.getClass(), "axisLinePaint", term152);
        setBooleanField(term1, term1.getClass(), "tickLabelsVisible", true);
        setField(term156, term156.getClass(), "fRequestedAttributes", null);
        setField(term156, term156.getClass(), "name", "SansSerif");
        setIntField(term156, term156.getClass(), "style", 0);
        setIntField(term156, term156.getClass(), "size", 10);
        setFloatField(term156, term156.getClass(), "pointSize", 10.0F);
        setField(term156, term156.getClass(), "peer", null);
        setLongField(term156, term156.getClass(), "pData", 0L);
        setField(term156, term156.getClass(), "font2DHandle", null);
        setField(term156, term156.getClass(), "values", null);
        setBooleanField(term156, term156.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term156, term156.getClass(), "createdFont", false);
        setBooleanField(term156, term156.getClass(), "nonIdentityTx", false);
        setIntField(term156, term156.getClass(), "hash", 0);
        setIntField(term156, term156.getClass(), "fontSerializedDataVersion", 1);
        setField(term156, term156.getClass(), "flmref", null);
        setField(term1, term1.getClass(), "tickLabelFont", term156);
        setField(term1, term1.getClass(), "tickLabelPaint", term92);
        setField(term177, term177.getClass(), "unitType", term96);
        setDoubleField(term177, term177.getClass(), "top", 2.0);
        setDoubleField(term177, term177.getClass(), "left", 4.0);
        setDoubleField(term177, term177.getClass(), "bottom", 2.0);
        setDoubleField(term177, term177.getClass(), "right", 4.0);
        setField(term1, term1.getClass(), "tickLabelInsets", term177);
        setBooleanField(term1, term1.getClass(), "tickMarksVisible", false);
        setFloatField(term1, term1.getClass(), "tickMarkInsideLength", 0.3455959F);
        setFloatField(term1, term1.getClass(), "tickMarkOutsideLength", 2.0F);
        setFloatField(term185, term185.getClass(), "width", 1.0F);
        setIntField(term185, term185.getClass(), "join", 0);
        setIntField(term185, term185.getClass(), "cap", 2);
        setFloatField(term185, term185.getClass(), "miterlimit", 10.0F);
        setField(term185, term185.getClass(), "dash", null);
        setFloatField(term185, term185.getClass(), "dash_phase", 0.0F);
        setField(term1, term1.getClass(), "tickMarkStroke", term185);
        setField(term1, term1.getClass(), "tickMarkPaint", term152);
        setDoubleField(term1, term1.getClass(), "fixedDimension", 0.3455959125047594);
        setField(term1, term1.getClass(), "plot", null);
        setField(term192, term192.getClass(), "listenerList", term193);
        setField(term1, term1.getClass(), "listenerList", term192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[1] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        argTypes[2] = Class.forName("org.jfree.chart.axis.ValueAxis");
        argTypes[3] = Class.forName("org.jfree.chart.renderer.category.CategoryItemRenderer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


