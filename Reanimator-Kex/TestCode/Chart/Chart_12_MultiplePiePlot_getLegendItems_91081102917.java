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

public class MultiplePiePlot_getLegendItems_91081102917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2697;

    public MultiplePiePlot_getLegendItems_91081102917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2752 = new ArrayList();
        ArrayList term2796 = new ArrayList();
        term2697 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term2698 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term2699 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term2701 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2702 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term2708 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term2711 = newInstance(Class.forName("java.awt.Font"));
        Object term2722 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term2724 = newInstance(Class.forName("java.awt.Color"));
        Object term2751 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term2756 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term2758 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term2760 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2761 = (Object[]) newArray("java.lang.Object", 0);
        Object term2775 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2780 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term2781 = newInstance(Class.forName("java.awt.Color"));
        Object term2784 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2791 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term2802 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2803 = (Object[]) newArray("java.lang.Object", 0);
        Object term2804 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2805 = (Object[]) newArray("java.lang.Object", 0);
        Object term2807 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term2699, term2699.getClass(), "hintmap", null);
        setField(term2698, term2698.getClass(), "renderingHints", term2699);
        setBooleanField(term2698, term2698.getClass(), "borderVisible", false);
        setField(term2698, term2698.getClass(), "borderStroke", null);
        setField(term2698, term2698.getClass(), "borderPaint", null);
        setField(term2702, term2702.getClass(), "name", "");
        setField(term2701, term2701.getClass(), "unitType", term2702);
        setDoubleField(term2701, term2701.getClass(), "top", 1.0);
        setDoubleField(term2701, term2701.getClass(), "left", 1.0);
        setDoubleField(term2701, term2701.getClass(), "bottom", 1.0);
        setDoubleField(term2701, term2701.getClass(), "right", 1.0);
        setField(term2698, term2698.getClass(), "padding", term2701);
        setField(term2708, term2708.getClass(), "text", "");
        setField(term2711, term2711.getClass(), "fRequestedAttributes", null);
        setField(term2711, term2711.getClass(), "name", "");
        setIntField(term2711, term2711.getClass(), "style", 1);
        setIntField(term2711, term2711.getClass(), "size", 12);
        setFloatField(term2711, term2711.getClass(), "pointSize", 12.0F);
        setField(term2711, term2711.getClass(), "peer", null);
        setLongField(term2711, term2711.getClass(), "pData", 0L);
        setField(term2711, term2711.getClass(), "font2DHandle", null);
        setField(term2711, term2711.getClass(), "values", null);
        setBooleanField(term2711, term2711.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2711, term2711.getClass(), "createdFont", false);
        setBooleanField(term2711, term2711.getClass(), "nonIdentityTx", false);
        setIntField(term2711, term2711.getClass(), "hash", 0);
        setIntField(term2711, term2711.getClass(), "fontSerializedDataVersion", 1);
        setField(term2711, term2711.getClass(), "flmref", null);
        setField(term2708, term2708.getClass(), "font", term2711);
        setField(term2722, term2722.getClass(), "name", "");
        setField(term2708, term2708.getClass(), "textAlignment", term2722);
        setIntField(term2724, term2724.getClass(), "value", -16777216);
        setField(term2724, term2724.getClass(), "frgbvalue", null);
        setField(term2724, term2724.getClass(), "fvalue", null);
        setFloatField(term2724, term2724.getClass(), "falpha", 0.0F);
        setField(term2724, term2724.getClass(), "cs", null);
        setField(term2708, term2708.getClass(), "paint", term2724);
        setField(term2708, term2708.getClass(), "backgroundPaint", null);
        setField(term2708, term2708.getClass(), "toolTipText", "fhkbdRViHi");
        setField(term2708, term2708.getClass(), "urlText", "uWHnvSvaPl");
        setField(term2751, term2751.getClass(), "lines", term2752);
        setField(term2751, term2751.getClass(), "lineAlignment", term2722);
        setField(term2708, term2708.getClass(), "content", term2751);
        setBooleanField(term2708, term2708.getClass(), "expandToFitSpace", true);
        setField(term2756, term2756.getClass(), "name", "");
        setField(term2708, term2708.getClass(), "position", term2756);
        setField(term2708, term2708.getClass(), "horizontalAlignment", term2722);
        setField(term2758, term2758.getClass(), "name", "");
        setField(term2708, term2708.getClass(), "verticalAlignment", term2758);
        setField(term2760, term2760.getClass(), "listenerList", term2761);
        setField(term2708, term2708.getClass(), "listenerList", term2760);
        setBooleanField(term2708, term2708.getClass(), "notify", true);
        setField(term2708, term2708.getClass(), "id", "kBdSllIBVz");
        setField(term2775, term2775.getClass(), "unitType", term2702);
        setDoubleField(term2775, term2775.getClass(), "top", 0.0);
        setDoubleField(term2775, term2775.getClass(), "left", 0.0);
        setDoubleField(term2775, term2775.getClass(), "bottom", 0.0);
        setDoubleField(term2775, term2775.getClass(), "right", 0.0);
        setField(term2708, term2708.getClass(), "margin", term2775);
        setField(term2780, term2780.getClass(), "insets", term2775);
        setIntField(term2781, term2781.getClass(), "value", -1);
        setField(term2781, term2781.getClass(), "frgbvalue", null);
        setField(term2781, term2781.getClass(), "fvalue", null);
        setFloatField(term2781, term2781.getClass(), "falpha", 0.0F);
        setField(term2781, term2781.getClass(), "cs", null);
        setField(term2780, term2780.getClass(), "paint", term2781);
        setField(term2708, term2708.getClass(), "frame", term2780);
        setField(term2784, term2784.getClass(), "unitType", term2702);
        setDoubleField(term2784, term2784.getClass(), "top", 1.0);
        setDoubleField(term2784, term2784.getClass(), "left", 1.0);
        setDoubleField(term2784, term2784.getClass(), "bottom", 1.0);
        setDoubleField(term2784, term2784.getClass(), "right", 1.0);
        setField(term2708, term2708.getClass(), "padding", term2784);
        setDoubleField(term2708, term2708.getClass(), "width", 0.7591353014991907);
        setDoubleField(term2708, term2708.getClass(), "height", 0.791695029600875);
        setFloatField(term2791, term2791.getClass(), "x", 0.0F);
        setFloatField(term2791, term2791.getClass(), "y", 0.0F);
        setFloatField(term2791, term2791.getClass(), "width", 0.0F);
        setFloatField(term2791, term2791.getClass(), "height", 0.0F);
        setField(term2708, term2708.getClass(), "bounds", term2791);
        setField(term2698, term2698.getClass(), "title", term2708);
        setField(term2698, term2698.getClass(), "subtitles", term2796);
        setField(term2698, term2698.getClass(), "plot", null);
        setField(term2698, term2698.getClass(), "backgroundPaint", null);
        setField(term2698, term2698.getClass(), "backgroundImage", null);
        setIntField(term2698, term2698.getClass(), "backgroundImageAlignment", -1685132342);
        setFloatField(term2698, term2698.getClass(), "backgroundImageAlpha", 0.6076495F);
        setField(term2802, term2802.getClass(), "listenerList", term2803);
        setField(term2698, term2698.getClass(), "changeListeners", term2802);
        setField(term2804, term2804.getClass(), "listenerList", term2805);
        setField(term2698, term2698.getClass(), "progressListeners", term2804);
        setBooleanField(term2698, term2698.getClass(), "notify", false);
        setField(term2697, term2697.getClass(), "pieChart", term2698);
        setField(term2697, term2697.getClass(), "dataset", null);
        setField(term2807, term2807.getClass(), "name", "TJmVBGfTML");
        setField(term2697, term2697.getClass(), "dataExtractOrder", term2807);
        setDoubleField(term2697, term2697.getClass(), "limit", 0.6862221294683138);
        setField(term2697, term2697.getClass(), "aggregatedItemsKey", null);
        setField(term2697, term2697.getClass(), "aggregatedItemsPaint", null);
        setField(term2697, term2697.getClass(), "sectionPaints", null);
        setField(term2697, term2697.getClass(), "parent", null);
        setField(term2697, term2697.getClass(), "datasetGroup", null);
        setField(term2697, term2697.getClass(), "noDataMessage", null);
        setField(term2697, term2697.getClass(), "noDataMessageFont", null);
        setField(term2697, term2697.getClass(), "noDataMessagePaint", null);
        setField(term2697, term2697.getClass(), "insets", null);
        setBooleanField(term2697, term2697.getClass(), "outlineVisible", false);
        setField(term2697, term2697.getClass(), "outlineStroke", null);
        setField(term2697, term2697.getClass(), "outlinePaint", null);
        setField(term2697, term2697.getClass(), "backgroundPaint", null);
        setField(term2697, term2697.getClass(), "backgroundImage", null);
        setIntField(term2697, term2697.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term2697, term2697.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term2697, term2697.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term2697, term2697.getClass(), "backgroundAlpha", 0.0F);
        setField(term2697, term2697.getClass(), "drawingSupplier", null);
        setField(term2697, term2697.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLegendItems", argTypes, term2697, args);
    }

};


