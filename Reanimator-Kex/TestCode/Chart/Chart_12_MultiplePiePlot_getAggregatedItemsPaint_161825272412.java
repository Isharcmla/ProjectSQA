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

public class MultiplePiePlot_getAggregatedItemsPaint_161825272412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;

    public MultiplePiePlot_getAggregatedItemsPaint_161825272412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1875 = new ArrayList();
        ArrayList term1919 = new ArrayList();
        term1820 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term1821 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1822 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1824 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1825 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1831 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term1834 = newInstance(Class.forName("java.awt.Font"));
        Object term1845 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term1847 = newInstance(Class.forName("java.awt.Color"));
        Object term1874 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1879 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1881 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1883 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1884 = (Object[]) newArray("java.lang.Object", 0);
        Object term1898 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1903 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1904 = newInstance(Class.forName("java.awt.Color"));
        Object term1907 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1914 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1925 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1926 = (Object[]) newArray("java.lang.Object", 0);
        Object term1927 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1928 = (Object[]) newArray("java.lang.Object", 0);
        Object term1930 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term1822, term1822.getClass(), "hintmap", null);
        setField(term1821, term1821.getClass(), "renderingHints", term1822);
        setBooleanField(term1821, term1821.getClass(), "borderVisible", true);
        setField(term1821, term1821.getClass(), "borderStroke", null);
        setField(term1821, term1821.getClass(), "borderPaint", null);
        setField(term1825, term1825.getClass(), "name", "");
        setField(term1824, term1824.getClass(), "unitType", term1825);
        setDoubleField(term1824, term1824.getClass(), "top", 1.0);
        setDoubleField(term1824, term1824.getClass(), "left", 1.0);
        setDoubleField(term1824, term1824.getClass(), "bottom", 1.0);
        setDoubleField(term1824, term1824.getClass(), "right", 1.0);
        setField(term1821, term1821.getClass(), "padding", term1824);
        setField(term1831, term1831.getClass(), "text", "");
        setField(term1834, term1834.getClass(), "fRequestedAttributes", null);
        setField(term1834, term1834.getClass(), "name", "");
        setIntField(term1834, term1834.getClass(), "style", 1);
        setIntField(term1834, term1834.getClass(), "size", 12);
        setFloatField(term1834, term1834.getClass(), "pointSize", 12.0F);
        setField(term1834, term1834.getClass(), "peer", null);
        setLongField(term1834, term1834.getClass(), "pData", 0L);
        setField(term1834, term1834.getClass(), "font2DHandle", null);
        setField(term1834, term1834.getClass(), "values", null);
        setBooleanField(term1834, term1834.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1834, term1834.getClass(), "createdFont", false);
        setBooleanField(term1834, term1834.getClass(), "nonIdentityTx", false);
        setIntField(term1834, term1834.getClass(), "hash", 0);
        setIntField(term1834, term1834.getClass(), "fontSerializedDataVersion", 1);
        setField(term1834, term1834.getClass(), "flmref", null);
        setField(term1831, term1831.getClass(), "font", term1834);
        setField(term1845, term1845.getClass(), "name", "");
        setField(term1831, term1831.getClass(), "textAlignment", term1845);
        setIntField(term1847, term1847.getClass(), "value", -16777216);
        setField(term1847, term1847.getClass(), "frgbvalue", null);
        setField(term1847, term1847.getClass(), "fvalue", null);
        setFloatField(term1847, term1847.getClass(), "falpha", 0.0F);
        setField(term1847, term1847.getClass(), "cs", null);
        setField(term1831, term1831.getClass(), "paint", term1847);
        setField(term1831, term1831.getClass(), "backgroundPaint", null);
        setField(term1831, term1831.getClass(), "toolTipText", "BndsHwAFMv");
        setField(term1831, term1831.getClass(), "urlText", "GzFkzHGYFt");
        setField(term1874, term1874.getClass(), "lines", term1875);
        setField(term1874, term1874.getClass(), "lineAlignment", term1845);
        setField(term1831, term1831.getClass(), "content", term1874);
        setBooleanField(term1831, term1831.getClass(), "expandToFitSpace", false);
        setField(term1879, term1879.getClass(), "name", "");
        setField(term1831, term1831.getClass(), "position", term1879);
        setField(term1831, term1831.getClass(), "horizontalAlignment", term1845);
        setField(term1881, term1881.getClass(), "name", "");
        setField(term1831, term1831.getClass(), "verticalAlignment", term1881);
        setField(term1883, term1883.getClass(), "listenerList", term1884);
        setField(term1831, term1831.getClass(), "listenerList", term1883);
        setBooleanField(term1831, term1831.getClass(), "notify", true);
        setField(term1831, term1831.getClass(), "id", "tShwQLRGNe");
        setField(term1898, term1898.getClass(), "unitType", term1825);
        setDoubleField(term1898, term1898.getClass(), "top", 0.0);
        setDoubleField(term1898, term1898.getClass(), "left", 0.0);
        setDoubleField(term1898, term1898.getClass(), "bottom", 0.0);
        setDoubleField(term1898, term1898.getClass(), "right", 0.0);
        setField(term1831, term1831.getClass(), "margin", term1898);
        setField(term1903, term1903.getClass(), "insets", term1898);
        setIntField(term1904, term1904.getClass(), "value", -1);
        setField(term1904, term1904.getClass(), "frgbvalue", null);
        setField(term1904, term1904.getClass(), "fvalue", null);
        setFloatField(term1904, term1904.getClass(), "falpha", 0.0F);
        setField(term1904, term1904.getClass(), "cs", null);
        setField(term1903, term1903.getClass(), "paint", term1904);
        setField(term1831, term1831.getClass(), "frame", term1903);
        setField(term1907, term1907.getClass(), "unitType", term1825);
        setDoubleField(term1907, term1907.getClass(), "top", 1.0);
        setDoubleField(term1907, term1907.getClass(), "left", 1.0);
        setDoubleField(term1907, term1907.getClass(), "bottom", 1.0);
        setDoubleField(term1907, term1907.getClass(), "right", 1.0);
        setField(term1831, term1831.getClass(), "padding", term1907);
        setDoubleField(term1831, term1831.getClass(), "width", 0.6300849762307866);
        setDoubleField(term1831, term1831.getClass(), "height", 0.9737083944266686);
        setFloatField(term1914, term1914.getClass(), "x", 0.0F);
        setFloatField(term1914, term1914.getClass(), "y", 0.0F);
        setFloatField(term1914, term1914.getClass(), "width", 0.0F);
        setFloatField(term1914, term1914.getClass(), "height", 0.0F);
        setField(term1831, term1831.getClass(), "bounds", term1914);
        setField(term1821, term1821.getClass(), "title", term1831);
        setField(term1821, term1821.getClass(), "subtitles", term1919);
        setField(term1821, term1821.getClass(), "plot", null);
        setField(term1821, term1821.getClass(), "backgroundPaint", null);
        setField(term1821, term1821.getClass(), "backgroundImage", null);
        setIntField(term1821, term1821.getClass(), "backgroundImageAlignment", -522618178);
        setFloatField(term1821, term1821.getClass(), "backgroundImageAlpha", 0.8783184F);
        setField(term1925, term1925.getClass(), "listenerList", term1926);
        setField(term1821, term1821.getClass(), "changeListeners", term1925);
        setField(term1927, term1927.getClass(), "listenerList", term1928);
        setField(term1821, term1821.getClass(), "progressListeners", term1927);
        setBooleanField(term1821, term1821.getClass(), "notify", true);
        setField(term1820, term1820.getClass(), "pieChart", term1821);
        setField(term1820, term1820.getClass(), "dataset", null);
        setField(term1930, term1930.getClass(), "name", "LvtrsXUliU");
        setField(term1820, term1820.getClass(), "dataExtractOrder", term1930);
        setDoubleField(term1820, term1820.getClass(), "limit", 0.0668892744806211);
        setField(term1820, term1820.getClass(), "aggregatedItemsKey", null);
        setField(term1820, term1820.getClass(), "aggregatedItemsPaint", null);
        setField(term1820, term1820.getClass(), "sectionPaints", null);
        setField(term1820, term1820.getClass(), "parent", null);
        setField(term1820, term1820.getClass(), "datasetGroup", null);
        setField(term1820, term1820.getClass(), "noDataMessage", null);
        setField(term1820, term1820.getClass(), "noDataMessageFont", null);
        setField(term1820, term1820.getClass(), "noDataMessagePaint", null);
        setField(term1820, term1820.getClass(), "insets", null);
        setBooleanField(term1820, term1820.getClass(), "outlineVisible", false);
        setField(term1820, term1820.getClass(), "outlineStroke", null);
        setField(term1820, term1820.getClass(), "outlinePaint", null);
        setField(term1820, term1820.getClass(), "backgroundPaint", null);
        setField(term1820, term1820.getClass(), "backgroundImage", null);
        setIntField(term1820, term1820.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term1820, term1820.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term1820, term1820.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term1820, term1820.getClass(), "backgroundAlpha", 0.0F);
        setField(term1820, term1820.getClass(), "drawingSupplier", null);
        setField(term1820, term1820.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAggregatedItemsPaint", argTypes, term1820, args);
    }

};


