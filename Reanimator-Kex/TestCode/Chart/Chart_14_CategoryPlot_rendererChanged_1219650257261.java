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
import java.util.ArrayList;

public class CategoryPlot_rendererChanged_1219650257261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2348;

    public CategoryPlot_rendererChanged_1219650257261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2417 = new ArrayList();
        ArrayList term2461 = new ArrayList();
        term2348 = newInstance(Class.forName("org.jfree.chart.event.RendererChangeEvent"));
        Object term2349 = newInstance(Class.forName("java.lang.Object"));
        Object term2350 = newInstance(Class.forName("org.jfree.chart.event.ChartChangeEventType"));
        Object term2363 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term2364 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term2366 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2367 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term2373 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term2376 = newInstance(Class.forName("java.awt.Font"));
        Object term2387 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term2389 = newInstance(Class.forName("java.awt.Color"));
        Object term2416 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term2421 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term2423 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term2425 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2426 = (Object[]) newArray("java.lang.Object", 0);
        Object term2440 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2445 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term2446 = newInstance(Class.forName("java.awt.Color"));
        Object term2449 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2456 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term2467 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2468 = (Object[]) newArray("java.lang.Object", 0);
        Object term2469 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2470 = (Object[]) newArray("java.lang.Object", 0);
        Object term2472 = newInstance(Class.forName("java.lang.Object"));
        setField(term2348, term2348.getClass(), "renderer", term2349);
        setField(term2350, term2350.getClass(), "name", "hxCBltsObl");
        setField(term2348, term2348.getClass(), "type", term2350);
        setField(term2364, term2364.getClass(), "hintmap", null);
        setField(term2363, term2363.getClass(), "renderingHints", term2364);
        setBooleanField(term2363, term2363.getClass(), "borderVisible", true);
        setField(term2363, term2363.getClass(), "borderStroke", null);
        setField(term2363, term2363.getClass(), "borderPaint", null);
        setField(term2367, term2367.getClass(), "name", "");
        setField(term2366, term2366.getClass(), "unitType", term2367);
        setDoubleField(term2366, term2366.getClass(), "top", 1.0);
        setDoubleField(term2366, term2366.getClass(), "left", 1.0);
        setDoubleField(term2366, term2366.getClass(), "bottom", 1.0);
        setDoubleField(term2366, term2366.getClass(), "right", 1.0);
        setField(term2363, term2363.getClass(), "padding", term2366);
        setField(term2373, term2373.getClass(), "text", "");
        setField(term2376, term2376.getClass(), "fRequestedAttributes", null);
        setField(term2376, term2376.getClass(), "name", "");
        setIntField(term2376, term2376.getClass(), "style", 1);
        setIntField(term2376, term2376.getClass(), "size", 12);
        setFloatField(term2376, term2376.getClass(), "pointSize", 12.0F);
        setField(term2376, term2376.getClass(), "peer", null);
        setLongField(term2376, term2376.getClass(), "pData", 0L);
        setField(term2376, term2376.getClass(), "font2DHandle", null);
        setField(term2376, term2376.getClass(), "values", null);
        setBooleanField(term2376, term2376.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2376, term2376.getClass(), "createdFont", false);
        setBooleanField(term2376, term2376.getClass(), "nonIdentityTx", false);
        setIntField(term2376, term2376.getClass(), "hash", 0);
        setIntField(term2376, term2376.getClass(), "fontSerializedDataVersion", 1);
        setField(term2376, term2376.getClass(), "flmref", null);
        setField(term2373, term2373.getClass(), "font", term2376);
        setField(term2387, term2387.getClass(), "name", "");
        setField(term2373, term2373.getClass(), "textAlignment", term2387);
        setIntField(term2389, term2389.getClass(), "value", -16777216);
        setField(term2389, term2389.getClass(), "frgbvalue", null);
        setField(term2389, term2389.getClass(), "fvalue", null);
        setFloatField(term2389, term2389.getClass(), "falpha", 0.0F);
        setField(term2389, term2389.getClass(), "cs", null);
        setField(term2373, term2373.getClass(), "paint", term2389);
        setField(term2373, term2373.getClass(), "backgroundPaint", null);
        setField(term2373, term2373.getClass(), "toolTipText", "BndsHwAFMv");
        setField(term2373, term2373.getClass(), "urlText", "GzFkzHGYFt");
        setField(term2416, term2416.getClass(), "lines", term2417);
        setField(term2416, term2416.getClass(), "lineAlignment", term2387);
        setField(term2373, term2373.getClass(), "content", term2416);
        setBooleanField(term2373, term2373.getClass(), "expandToFitSpace", true);
        setField(term2421, term2421.getClass(), "name", "");
        setField(term2373, term2373.getClass(), "position", term2421);
        setField(term2373, term2373.getClass(), "horizontalAlignment", term2387);
        setField(term2423, term2423.getClass(), "name", "");
        setField(term2373, term2373.getClass(), "verticalAlignment", term2423);
        setField(term2425, term2425.getClass(), "listenerList", term2426);
        setField(term2373, term2373.getClass(), "listenerList", term2425);
        setBooleanField(term2373, term2373.getClass(), "notify", true);
        setField(term2373, term2373.getClass(), "id", "tShwQLRGNe");
        setField(term2440, term2440.getClass(), "unitType", term2367);
        setDoubleField(term2440, term2440.getClass(), "top", 0.0);
        setDoubleField(term2440, term2440.getClass(), "left", 0.0);
        setDoubleField(term2440, term2440.getClass(), "bottom", 0.0);
        setDoubleField(term2440, term2440.getClass(), "right", 0.0);
        setField(term2373, term2373.getClass(), "margin", term2440);
        setField(term2445, term2445.getClass(), "insets", term2440);
        setIntField(term2446, term2446.getClass(), "value", -1);
        setField(term2446, term2446.getClass(), "frgbvalue", null);
        setField(term2446, term2446.getClass(), "fvalue", null);
        setFloatField(term2446, term2446.getClass(), "falpha", 0.0F);
        setField(term2446, term2446.getClass(), "cs", null);
        setField(term2445, term2445.getClass(), "paint", term2446);
        setField(term2373, term2373.getClass(), "frame", term2445);
        setField(term2449, term2449.getClass(), "unitType", term2367);
        setDoubleField(term2449, term2449.getClass(), "top", 1.0);
        setDoubleField(term2449, term2449.getClass(), "left", 1.0);
        setDoubleField(term2449, term2449.getClass(), "bottom", 1.0);
        setDoubleField(term2449, term2449.getClass(), "right", 1.0);
        setField(term2373, term2373.getClass(), "padding", term2449);
        setDoubleField(term2373, term2373.getClass(), "width", 0.8598297828918529);
        setDoubleField(term2373, term2373.getClass(), "height", 0.43692187681405226);
        setFloatField(term2456, term2456.getClass(), "x", 0.0F);
        setFloatField(term2456, term2456.getClass(), "y", 0.0F);
        setFloatField(term2456, term2456.getClass(), "width", 0.0F);
        setFloatField(term2456, term2456.getClass(), "height", 0.0F);
        setField(term2373, term2373.getClass(), "bounds", term2456);
        setField(term2363, term2363.getClass(), "title", term2373);
        setField(term2363, term2363.getClass(), "subtitles", term2461);
        setField(term2363, term2363.getClass(), "plot", null);
        setField(term2363, term2363.getClass(), "backgroundPaint", null);
        setField(term2363, term2363.getClass(), "backgroundImage", null);
        setIntField(term2363, term2363.getClass(), "backgroundImageAlignment", 865208305);
        setFloatField(term2363, term2363.getClass(), "backgroundImageAlpha", 0.95272815F);
        setField(term2467, term2467.getClass(), "listenerList", term2468);
        setField(term2363, term2363.getClass(), "changeListeners", term2467);
        setField(term2469, term2469.getClass(), "listenerList", term2470);
        setField(term2363, term2363.getClass(), "progressListeners", term2469);
        setBooleanField(term2363, term2363.getClass(), "notify", true);
        setField(term2348, term2348.getClass(), "chart", term2363);
        setField(term2348, term2348.getClass(), "source", term2472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.event.RendererChangeEvent");
        Object[] args = new Object[1];
        args[0] = term2348;
        try {
            callMethod(klass, "rendererChanged", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


