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

public class CategoryPlot_getDomainAxisIndex_1066286520172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1711;

    public CategoryPlot_getDomainAxisIndex_1066286520172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1753 = new HashMap();
        HashMap term1758 = new HashMap();
        HashMap term1763 = new HashMap();
        term1711 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term1718 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term1719 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term1720 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term1722 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term1724 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term1727 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term1730 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term1731 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term1733 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term1737 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term1738 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term1740 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term1743 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term1746 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term1747 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term1749 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term1781 = newInstance(Class.forName("java.awt.Font"));
        Object term1802 = newInstance(Class.forName("java.awt.Color"));
        Object term1805 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1806 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1856 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term1862 = newInstance(Class.forName("java.awt.Color"));
        Object term1866 = newInstance(Class.forName("java.awt.Font"));
        Object term1887 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1895 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term1902 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1903 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term1711, term1711.getClass(), "lowerMargin", 0.05);
        setDoubleField(term1711, term1711.getClass(), "upperMargin", 0.05);
        setDoubleField(term1711, term1711.getClass(), "categoryMargin", 0.2);
        setIntField(term1711, term1711.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term1711, term1711.getClass(), "maximumCategoryLabelWidthRatio", 0.20144695F);
        setIntField(term1711, term1711.getClass(), "categoryLabelPositionOffset", 4);
        setField(term1720, term1720.getClass(), "name", "");
        setField(term1719, term1719.getClass(), "categoryAnchor", term1720);
        setField(term1722, term1722.getClass(), "name", "");
        setField(term1719, term1719.getClass(), "labelAnchor", term1722);
        setField(term1724, term1724.getClass(), "name", "");
        setField(term1719, term1719.getClass(), "rotationAnchor", term1724);
        setDoubleField(term1719, term1719.getClass(), "angle", 0.0);
        setField(term1727, term1727.getClass(), "name", "");
        setField(term1719, term1719.getClass(), "widthType", term1727);
        setFloatField(term1719, term1719.getClass(), "widthRatio", 0.95F);
        setField(term1718, term1718.getClass(), "positionForAxisAtTop", term1719);
        setField(term1731, term1731.getClass(), "name", "");
        setField(term1730, term1730.getClass(), "categoryAnchor", term1731);
        setField(term1733, term1733.getClass(), "name", "");
        setField(term1730, term1730.getClass(), "labelAnchor", term1733);
        setField(term1730, term1730.getClass(), "rotationAnchor", term1724);
        setDoubleField(term1730, term1730.getClass(), "angle", 0.0);
        setField(term1730, term1730.getClass(), "widthType", term1727);
        setFloatField(term1730, term1730.getClass(), "widthRatio", 0.95F);
        setField(term1718, term1718.getClass(), "positionForAxisAtBottom", term1730);
        setField(term1738, term1738.getClass(), "name", "");
        setField(term1737, term1737.getClass(), "categoryAnchor", term1738);
        setField(term1740, term1740.getClass(), "name", "");
        setField(term1737, term1737.getClass(), "labelAnchor", term1740);
        setField(term1737, term1737.getClass(), "rotationAnchor", term1724);
        setDoubleField(term1737, term1737.getClass(), "angle", 0.0);
        setField(term1743, term1743.getClass(), "name", "");
        setField(term1737, term1737.getClass(), "widthType", term1743);
        setFloatField(term1737, term1737.getClass(), "widthRatio", 0.3F);
        setField(term1718, term1718.getClass(), "positionForAxisAtLeft", term1737);
        setField(term1747, term1747.getClass(), "name", "");
        setField(term1746, term1746.getClass(), "categoryAnchor", term1747);
        setField(term1749, term1749.getClass(), "name", "");
        setField(term1746, term1746.getClass(), "labelAnchor", term1749);
        setField(term1746, term1746.getClass(), "rotationAnchor", term1724);
        setDoubleField(term1746, term1746.getClass(), "angle", 0.0);
        setField(term1746, term1746.getClass(), "widthType", term1743);
        setFloatField(term1746, term1746.getClass(), "widthRatio", 0.3F);
        setField(term1718, term1718.getClass(), "positionForAxisAtRight", term1746);
        setField(term1711, term1711.getClass(), "categoryLabelPositions", term1718);
        setField(term1711, term1711.getClass(), "tickLabelFontMap", term1753);
        setField(term1711, term1711.getClass(), "tickLabelPaintMap", term1758);
        setField(term1711, term1711.getClass(), "categoryLabelToolTips", term1763);
        setBooleanField(term1711, term1711.getClass(), "visible", true);
        setField(term1711, term1711.getClass(), "label", "IoAlmYsBwc");
        setField(term1781, term1781.getClass(), "fRequestedAttributes", null);
        setField(term1781, term1781.getClass(), "name", "SansSerif");
        setIntField(term1781, term1781.getClass(), "style", 0);
        setIntField(term1781, term1781.getClass(), "size", 12);
        setFloatField(term1781, term1781.getClass(), "pointSize", 12.0F);
        setField(term1781, term1781.getClass(), "peer", null);
        setLongField(term1781, term1781.getClass(), "pData", 0L);
        setField(term1781, term1781.getClass(), "font2DHandle", null);
        setField(term1781, term1781.getClass(), "values", null);
        setBooleanField(term1781, term1781.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1781, term1781.getClass(), "createdFont", false);
        setBooleanField(term1781, term1781.getClass(), "nonIdentityTx", false);
        setIntField(term1781, term1781.getClass(), "hash", 0);
        setIntField(term1781, term1781.getClass(), "fontSerializedDataVersion", 1);
        setField(term1781, term1781.getClass(), "flmref", null);
        setField(term1711, term1711.getClass(), "labelFont", term1781);
        setIntField(term1802, term1802.getClass(), "value", -16777216);
        setField(term1802, term1802.getClass(), "frgbvalue", null);
        setField(term1802, term1802.getClass(), "fvalue", null);
        setFloatField(term1802, term1802.getClass(), "falpha", 0.0F);
        setField(term1802, term1802.getClass(), "cs", null);
        setField(term1711, term1711.getClass(), "labelPaint", term1802);
        setField(term1806, term1806.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term1805, term1805.getClass(), "unitType", term1806);
        setDoubleField(term1805, term1805.getClass(), "top", 3.0);
        setDoubleField(term1805, term1805.getClass(), "left", 3.0);
        setDoubleField(term1805, term1805.getClass(), "bottom", 3.0);
        setDoubleField(term1805, term1805.getClass(), "right", 3.0);
        setField(term1711, term1711.getClass(), "labelInsets", term1805);
        setDoubleField(term1711, term1711.getClass(), "labelAngle", 0.6436713023569729);
        setField(term1711, term1711.getClass(), "labelToolTip", "TEParAifyi");
        setField(term1711, term1711.getClass(), "labelURL", "OWDIEULEFu");
        setBooleanField(term1711, term1711.getClass(), "axisLineVisible", true);
        setFloatField(term1856, term1856.getClass(), "width", 1.0F);
        setIntField(term1856, term1856.getClass(), "join", 0);
        setIntField(term1856, term1856.getClass(), "cap", 2);
        setFloatField(term1856, term1856.getClass(), "miterlimit", 10.0F);
        setField(term1856, term1856.getClass(), "dash", null);
        setFloatField(term1856, term1856.getClass(), "dash_phase", 0.0F);
        setField(term1711, term1711.getClass(), "axisLineStroke", term1856);
        setIntField(term1862, term1862.getClass(), "value", -8355712);
        setField(term1862, term1862.getClass(), "frgbvalue", null);
        setField(term1862, term1862.getClass(), "fvalue", null);
        setFloatField(term1862, term1862.getClass(), "falpha", 0.0F);
        setField(term1862, term1862.getClass(), "cs", null);
        setField(term1711, term1711.getClass(), "axisLinePaint", term1862);
        setBooleanField(term1711, term1711.getClass(), "tickLabelsVisible", true);
        setField(term1866, term1866.getClass(), "fRequestedAttributes", null);
        setField(term1866, term1866.getClass(), "name", "SansSerif");
        setIntField(term1866, term1866.getClass(), "style", 0);
        setIntField(term1866, term1866.getClass(), "size", 10);
        setFloatField(term1866, term1866.getClass(), "pointSize", 10.0F);
        setField(term1866, term1866.getClass(), "peer", null);
        setLongField(term1866, term1866.getClass(), "pData", 0L);
        setField(term1866, term1866.getClass(), "font2DHandle", null);
        setField(term1866, term1866.getClass(), "values", null);
        setBooleanField(term1866, term1866.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1866, term1866.getClass(), "createdFont", false);
        setBooleanField(term1866, term1866.getClass(), "nonIdentityTx", false);
        setIntField(term1866, term1866.getClass(), "hash", 0);
        setIntField(term1866, term1866.getClass(), "fontSerializedDataVersion", 1);
        setField(term1866, term1866.getClass(), "flmref", null);
        setField(term1711, term1711.getClass(), "tickLabelFont", term1866);
        setField(term1711, term1711.getClass(), "tickLabelPaint", term1802);
        setField(term1887, term1887.getClass(), "unitType", term1806);
        setDoubleField(term1887, term1887.getClass(), "top", 2.0);
        setDoubleField(term1887, term1887.getClass(), "left", 4.0);
        setDoubleField(term1887, term1887.getClass(), "bottom", 2.0);
        setDoubleField(term1887, term1887.getClass(), "right", 4.0);
        setField(term1711, term1711.getClass(), "tickLabelInsets", term1887);
        setBooleanField(term1711, term1711.getClass(), "tickMarksVisible", false);
        setFloatField(term1711, term1711.getClass(), "tickMarkInsideLength", 0.9431611F);
        setFloatField(term1711, term1711.getClass(), "tickMarkOutsideLength", 2.0F);
        setFloatField(term1895, term1895.getClass(), "width", 1.0F);
        setIntField(term1895, term1895.getClass(), "join", 0);
        setIntField(term1895, term1895.getClass(), "cap", 2);
        setFloatField(term1895, term1895.getClass(), "miterlimit", 10.0F);
        setField(term1895, term1895.getClass(), "dash", null);
        setFloatField(term1895, term1895.getClass(), "dash_phase", 0.0F);
        setField(term1711, term1711.getClass(), "tickMarkStroke", term1895);
        setField(term1711, term1711.getClass(), "tickMarkPaint", term1862);
        setDoubleField(term1711, term1711.getClass(), "fixedDimension", 0.7332741045694002);
        setField(term1711, term1711.getClass(), "plot", null);
        setField(term1902, term1902.getClass(), "listenerList", term1903);
        setField(term1711, term1711.getClass(), "listenerList", term1902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        Object[] args = new Object[1];
        args[0] = term1711;
        try {
            callMethod(klass, "getDomainAxisIndex", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


