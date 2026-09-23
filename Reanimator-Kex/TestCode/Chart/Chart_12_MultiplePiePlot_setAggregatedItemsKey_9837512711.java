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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class MultiplePiePlot_setAggregatedItemsKey_9837512711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1651;

    public MultiplePiePlot_setAggregatedItemsKey_9837512711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1706 = new ArrayList();
        ArrayList term1750 = new ArrayList();
        term1651 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term1652 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1653 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1655 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1656 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1662 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term1665 = newInstance(Class.forName("java.awt.Font"));
        Object term1676 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term1678 = newInstance(Class.forName("java.awt.Color"));
        Object term1705 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1710 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1712 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1714 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1715 = (Object[]) newArray("java.lang.Object", 0);
        Object term1729 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1734 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1735 = newInstance(Class.forName("java.awt.Color"));
        Object term1738 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1745 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1756 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1757 = (Object[]) newArray("java.lang.Object", 0);
        Object term1758 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1759 = (Object[]) newArray("java.lang.Object", 0);
        Object term1761 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term1653, term1653.getClass(), "hintmap", null);
        setField(term1652, term1652.getClass(), "renderingHints", term1653);
        setBooleanField(term1652, term1652.getClass(), "borderVisible", true);
        setField(term1652, term1652.getClass(), "borderStroke", null);
        setField(term1652, term1652.getClass(), "borderPaint", null);
        setField(term1656, term1656.getClass(), "name", "");
        setField(term1655, term1655.getClass(), "unitType", term1656);
        setDoubleField(term1655, term1655.getClass(), "top", 1.0);
        setDoubleField(term1655, term1655.getClass(), "left", 1.0);
        setDoubleField(term1655, term1655.getClass(), "bottom", 1.0);
        setDoubleField(term1655, term1655.getClass(), "right", 1.0);
        setField(term1652, term1652.getClass(), "padding", term1655);
        setField(term1662, term1662.getClass(), "text", "");
        setField(term1665, term1665.getClass(), "fRequestedAttributes", null);
        setField(term1665, term1665.getClass(), "name", "");
        setIntField(term1665, term1665.getClass(), "style", 1);
        setIntField(term1665, term1665.getClass(), "size", 12);
        setFloatField(term1665, term1665.getClass(), "pointSize", 12.0F);
        setField(term1665, term1665.getClass(), "peer", null);
        setLongField(term1665, term1665.getClass(), "pData", 0L);
        setField(term1665, term1665.getClass(), "font2DHandle", null);
        setField(term1665, term1665.getClass(), "values", null);
        setBooleanField(term1665, term1665.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1665, term1665.getClass(), "createdFont", false);
        setBooleanField(term1665, term1665.getClass(), "nonIdentityTx", false);
        setIntField(term1665, term1665.getClass(), "hash", 0);
        setIntField(term1665, term1665.getClass(), "fontSerializedDataVersion", 1);
        setField(term1665, term1665.getClass(), "flmref", null);
        setField(term1662, term1662.getClass(), "font", term1665);
        setField(term1676, term1676.getClass(), "name", "");
        setField(term1662, term1662.getClass(), "textAlignment", term1676);
        setIntField(term1678, term1678.getClass(), "value", -16777216);
        setField(term1678, term1678.getClass(), "frgbvalue", null);
        setField(term1678, term1678.getClass(), "fvalue", null);
        setFloatField(term1678, term1678.getClass(), "falpha", 0.0F);
        setField(term1678, term1678.getClass(), "cs", null);
        setField(term1662, term1662.getClass(), "paint", term1678);
        setField(term1662, term1662.getClass(), "backgroundPaint", null);
        setField(term1662, term1662.getClass(), "toolTipText", "wSQxaModmm");
        setField(term1662, term1662.getClass(), "urlText", "UlajhuVLaP");
        setField(term1705, term1705.getClass(), "lines", term1706);
        setField(term1705, term1705.getClass(), "lineAlignment", term1676);
        setField(term1662, term1662.getClass(), "content", term1705);
        setBooleanField(term1662, term1662.getClass(), "expandToFitSpace", true);
        setField(term1710, term1710.getClass(), "name", "");
        setField(term1662, term1662.getClass(), "position", term1710);
        setField(term1662, term1662.getClass(), "horizontalAlignment", term1676);
        setField(term1712, term1712.getClass(), "name", "");
        setField(term1662, term1662.getClass(), "verticalAlignment", term1712);
        setField(term1714, term1714.getClass(), "listenerList", term1715);
        setField(term1662, term1662.getClass(), "listenerList", term1714);
        setBooleanField(term1662, term1662.getClass(), "notify", true);
        setField(term1662, term1662.getClass(), "id", "gGSMzuGICf");
        setField(term1729, term1729.getClass(), "unitType", term1656);
        setDoubleField(term1729, term1729.getClass(), "top", 0.0);
        setDoubleField(term1729, term1729.getClass(), "left", 0.0);
        setDoubleField(term1729, term1729.getClass(), "bottom", 0.0);
        setDoubleField(term1729, term1729.getClass(), "right", 0.0);
        setField(term1662, term1662.getClass(), "margin", term1729);
        setField(term1734, term1734.getClass(), "insets", term1729);
        setIntField(term1735, term1735.getClass(), "value", -1);
        setField(term1735, term1735.getClass(), "frgbvalue", null);
        setField(term1735, term1735.getClass(), "fvalue", null);
        setFloatField(term1735, term1735.getClass(), "falpha", 0.0F);
        setField(term1735, term1735.getClass(), "cs", null);
        setField(term1734, term1734.getClass(), "paint", term1735);
        setField(term1662, term1662.getClass(), "frame", term1734);
        setField(term1738, term1738.getClass(), "unitType", term1656);
        setDoubleField(term1738, term1738.getClass(), "top", 1.0);
        setDoubleField(term1738, term1738.getClass(), "left", 1.0);
        setDoubleField(term1738, term1738.getClass(), "bottom", 1.0);
        setDoubleField(term1738, term1738.getClass(), "right", 1.0);
        setField(term1662, term1662.getClass(), "padding", term1738);
        setDoubleField(term1662, term1662.getClass(), "width", 0.37161417339133307);
        setDoubleField(term1662, term1662.getClass(), "height", 0.6805867182029153);
        setFloatField(term1745, term1745.getClass(), "x", 0.0F);
        setFloatField(term1745, term1745.getClass(), "y", 0.0F);
        setFloatField(term1745, term1745.getClass(), "width", 0.0F);
        setFloatField(term1745, term1745.getClass(), "height", 0.0F);
        setField(term1662, term1662.getClass(), "bounds", term1745);
        setField(term1652, term1652.getClass(), "title", term1662);
        setField(term1652, term1652.getClass(), "subtitles", term1750);
        setField(term1652, term1652.getClass(), "plot", null);
        setField(term1652, term1652.getClass(), "backgroundPaint", null);
        setField(term1652, term1652.getClass(), "backgroundImage", null);
        setIntField(term1652, term1652.getClass(), "backgroundImageAlignment", 1725571209);
        setFloatField(term1652, term1652.getClass(), "backgroundImageAlpha", 0.40176582F);
        setField(term1756, term1756.getClass(), "listenerList", term1757);
        setField(term1652, term1652.getClass(), "changeListeners", term1756);
        setField(term1758, term1758.getClass(), "listenerList", term1759);
        setField(term1652, term1652.getClass(), "progressListeners", term1758);
        setBooleanField(term1652, term1652.getClass(), "notify", true);
        setField(term1651, term1651.getClass(), "pieChart", term1652);
        setField(term1651, term1651.getClass(), "dataset", null);
        setField(term1761, term1761.getClass(), "name", "hxCBltsObl");
        setField(term1651, term1651.getClass(), "dataExtractOrder", term1761);
        setDoubleField(term1651, term1651.getClass(), "limit", 0.2852810965221698);
        setField(term1651, term1651.getClass(), "aggregatedItemsKey", null);
        setField(term1651, term1651.getClass(), "aggregatedItemsPaint", null);
        setField(term1651, term1651.getClass(), "sectionPaints", null);
        setField(term1651, term1651.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "datasetGroup", null);
        setField(term1651, term1651.getClass(), "noDataMessage", null);
        setField(term1651, term1651.getClass(), "noDataMessageFont", null);
        setField(term1651, term1651.getClass(), "noDataMessagePaint", null);
        setField(term1651, term1651.getClass(), "insets", null);
        setBooleanField(term1651, term1651.getClass(), "outlineVisible", false);
        setField(term1651, term1651.getClass(), "outlineStroke", null);
        setField(term1651, term1651.getClass(), "outlinePaint", null);
        setField(term1651, term1651.getClass(), "backgroundPaint", null);
        setField(term1651, term1651.getClass(), "backgroundImage", null);
        setIntField(term1651, term1651.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term1651, term1651.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term1651, term1651.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term1651, term1651.getClass(), "backgroundAlpha", 0.0F);
        setField(term1651, term1651.getClass(), "drawingSupplier", null);
        setField(term1651, term1651.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAggregatedItemsKey", argTypes, term1651, args);
    }

};


