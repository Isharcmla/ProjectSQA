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

public class MultiplePiePlot_prefetchSectionPaints_118399140616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2528;

    public MultiplePiePlot_prefetchSectionPaints_118399140616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2583 = new ArrayList();
        ArrayList term2627 = new ArrayList();
        term2528 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term2529 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term2530 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term2532 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2533 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term2539 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term2542 = newInstance(Class.forName("java.awt.Font"));
        Object term2553 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term2555 = newInstance(Class.forName("java.awt.Color"));
        Object term2582 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term2587 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term2589 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term2591 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2592 = (Object[]) newArray("java.lang.Object", 0);
        Object term2606 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2611 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term2612 = newInstance(Class.forName("java.awt.Color"));
        Object term2615 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2622 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term2633 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2634 = (Object[]) newArray("java.lang.Object", 0);
        Object term2635 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2636 = (Object[]) newArray("java.lang.Object", 0);
        Object term2638 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term2530, term2530.getClass(), "hintmap", null);
        setField(term2529, term2529.getClass(), "renderingHints", term2530);
        setBooleanField(term2529, term2529.getClass(), "borderVisible", true);
        setField(term2529, term2529.getClass(), "borderStroke", null);
        setField(term2529, term2529.getClass(), "borderPaint", null);
        setField(term2533, term2533.getClass(), "name", "");
        setField(term2532, term2532.getClass(), "unitType", term2533);
        setDoubleField(term2532, term2532.getClass(), "top", 1.0);
        setDoubleField(term2532, term2532.getClass(), "left", 1.0);
        setDoubleField(term2532, term2532.getClass(), "bottom", 1.0);
        setDoubleField(term2532, term2532.getClass(), "right", 1.0);
        setField(term2529, term2529.getClass(), "padding", term2532);
        setField(term2539, term2539.getClass(), "text", "");
        setField(term2542, term2542.getClass(), "fRequestedAttributes", null);
        setField(term2542, term2542.getClass(), "name", "");
        setIntField(term2542, term2542.getClass(), "style", 1);
        setIntField(term2542, term2542.getClass(), "size", 12);
        setFloatField(term2542, term2542.getClass(), "pointSize", 12.0F);
        setField(term2542, term2542.getClass(), "peer", null);
        setLongField(term2542, term2542.getClass(), "pData", 0L);
        setField(term2542, term2542.getClass(), "font2DHandle", null);
        setField(term2542, term2542.getClass(), "values", null);
        setBooleanField(term2542, term2542.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2542, term2542.getClass(), "createdFont", false);
        setBooleanField(term2542, term2542.getClass(), "nonIdentityTx", false);
        setIntField(term2542, term2542.getClass(), "hash", 0);
        setIntField(term2542, term2542.getClass(), "fontSerializedDataVersion", 1);
        setField(term2542, term2542.getClass(), "flmref", null);
        setField(term2539, term2539.getClass(), "font", term2542);
        setField(term2553, term2553.getClass(), "name", "");
        setField(term2539, term2539.getClass(), "textAlignment", term2553);
        setIntField(term2555, term2555.getClass(), "value", -16777216);
        setField(term2555, term2555.getClass(), "frgbvalue", null);
        setField(term2555, term2555.getClass(), "fvalue", null);
        setFloatField(term2555, term2555.getClass(), "falpha", 0.0F);
        setField(term2555, term2555.getClass(), "cs", null);
        setField(term2539, term2539.getClass(), "paint", term2555);
        setField(term2539, term2539.getClass(), "backgroundPaint", null);
        setField(term2539, term2539.getClass(), "toolTipText", "ieCtQFdkii");
        setField(term2539, term2539.getClass(), "urlText", "dEnhdmILtU");
        setField(term2582, term2582.getClass(), "lines", term2583);
        setField(term2582, term2582.getClass(), "lineAlignment", term2553);
        setField(term2539, term2539.getClass(), "content", term2582);
        setBooleanField(term2539, term2539.getClass(), "expandToFitSpace", true);
        setField(term2587, term2587.getClass(), "name", "");
        setField(term2539, term2539.getClass(), "position", term2587);
        setField(term2539, term2539.getClass(), "horizontalAlignment", term2553);
        setField(term2589, term2589.getClass(), "name", "");
        setField(term2539, term2539.getClass(), "verticalAlignment", term2589);
        setField(term2591, term2591.getClass(), "listenerList", term2592);
        setField(term2539, term2539.getClass(), "listenerList", term2591);
        setBooleanField(term2539, term2539.getClass(), "notify", true);
        setField(term2539, term2539.getClass(), "id", "hoicvmsovO");
        setField(term2606, term2606.getClass(), "unitType", term2533);
        setDoubleField(term2606, term2606.getClass(), "top", 0.0);
        setDoubleField(term2606, term2606.getClass(), "left", 0.0);
        setDoubleField(term2606, term2606.getClass(), "bottom", 0.0);
        setDoubleField(term2606, term2606.getClass(), "right", 0.0);
        setField(term2539, term2539.getClass(), "margin", term2606);
        setField(term2611, term2611.getClass(), "insets", term2606);
        setIntField(term2612, term2612.getClass(), "value", -1);
        setField(term2612, term2612.getClass(), "frgbvalue", null);
        setField(term2612, term2612.getClass(), "fvalue", null);
        setFloatField(term2612, term2612.getClass(), "falpha", 0.0F);
        setField(term2612, term2612.getClass(), "cs", null);
        setField(term2611, term2611.getClass(), "paint", term2612);
        setField(term2539, term2539.getClass(), "frame", term2611);
        setField(term2615, term2615.getClass(), "unitType", term2533);
        setDoubleField(term2615, term2615.getClass(), "top", 1.0);
        setDoubleField(term2615, term2615.getClass(), "left", 1.0);
        setDoubleField(term2615, term2615.getClass(), "bottom", 1.0);
        setDoubleField(term2615, term2615.getClass(), "right", 1.0);
        setField(term2539, term2539.getClass(), "padding", term2615);
        setDoubleField(term2539, term2539.getClass(), "width", 0.5873228247510078);
        setDoubleField(term2539, term2539.getClass(), "height", 0.8823181080774973);
        setFloatField(term2622, term2622.getClass(), "x", 0.0F);
        setFloatField(term2622, term2622.getClass(), "y", 0.0F);
        setFloatField(term2622, term2622.getClass(), "width", 0.0F);
        setFloatField(term2622, term2622.getClass(), "height", 0.0F);
        setField(term2539, term2539.getClass(), "bounds", term2622);
        setField(term2529, term2529.getClass(), "title", term2539);
        setField(term2529, term2529.getClass(), "subtitles", term2627);
        setField(term2529, term2529.getClass(), "plot", null);
        setField(term2529, term2529.getClass(), "backgroundPaint", null);
        setField(term2529, term2529.getClass(), "backgroundImage", null);
        setIntField(term2529, term2529.getClass(), "backgroundImageAlignment", 597278769);
        setFloatField(term2529, term2529.getClass(), "backgroundImageAlpha", 0.13906479F);
        setField(term2633, term2633.getClass(), "listenerList", term2634);
        setField(term2529, term2529.getClass(), "changeListeners", term2633);
        setField(term2635, term2635.getClass(), "listenerList", term2636);
        setField(term2529, term2529.getClass(), "progressListeners", term2635);
        setBooleanField(term2529, term2529.getClass(), "notify", true);
        setField(term2528, term2528.getClass(), "pieChart", term2529);
        setField(term2528, term2528.getClass(), "dataset", null);
        setField(term2638, term2638.getClass(), "name", "eqJfYWRaEL");
        setField(term2528, term2528.getClass(), "dataExtractOrder", term2638);
        setDoubleField(term2528, term2528.getClass(), "limit", 0.2192450926212024);
        setField(term2528, term2528.getClass(), "aggregatedItemsKey", null);
        setField(term2528, term2528.getClass(), "aggregatedItemsPaint", null);
        setField(term2528, term2528.getClass(), "sectionPaints", null);
        setField(term2528, term2528.getClass(), "parent", null);
        setField(term2528, term2528.getClass(), "datasetGroup", null);
        setField(term2528, term2528.getClass(), "noDataMessage", null);
        setField(term2528, term2528.getClass(), "noDataMessageFont", null);
        setField(term2528, term2528.getClass(), "noDataMessagePaint", null);
        setField(term2528, term2528.getClass(), "insets", null);
        setBooleanField(term2528, term2528.getClass(), "outlineVisible", false);
        setField(term2528, term2528.getClass(), "outlineStroke", null);
        setField(term2528, term2528.getClass(), "outlinePaint", null);
        setField(term2528, term2528.getClass(), "backgroundPaint", null);
        setField(term2528, term2528.getClass(), "backgroundImage", null);
        setIntField(term2528, term2528.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term2528, term2528.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term2528, term2528.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term2528, term2528.getClass(), "backgroundAlpha", 0.0F);
        setField(term2528, term2528.getClass(), "drawingSupplier", null);
        setField(term2528, term2528.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prefetchSectionPaints", argTypes, term2528, args);
    }

};


