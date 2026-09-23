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

public class MultiplePiePlot_equals_132160567318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2866;
     Object term2995;

    public MultiplePiePlot_equals_132160567318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2921 = new ArrayList();
        ArrayList term2965 = new ArrayList();
        term2866 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term2867 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term2868 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term2870 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2871 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term2877 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term2880 = newInstance(Class.forName("java.awt.Font"));
        Object term2891 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term2893 = newInstance(Class.forName("java.awt.Color"));
        Object term2920 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term2925 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term2927 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term2929 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2930 = (Object[]) newArray("java.lang.Object", 0);
        Object term2944 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2949 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term2950 = newInstance(Class.forName("java.awt.Color"));
        Object term2953 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2960 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term2971 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2972 = (Object[]) newArray("java.lang.Object", 0);
        Object term2973 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2974 = (Object[]) newArray("java.lang.Object", 0);
        Object term2976 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term2868, term2868.getClass(), "hintmap", null);
        setField(term2867, term2867.getClass(), "renderingHints", term2868);
        setBooleanField(term2867, term2867.getClass(), "borderVisible", false);
        setField(term2867, term2867.getClass(), "borderStroke", null);
        setField(term2867, term2867.getClass(), "borderPaint", null);
        setField(term2871, term2871.getClass(), "name", "");
        setField(term2870, term2870.getClass(), "unitType", term2871);
        setDoubleField(term2870, term2870.getClass(), "top", 1.0);
        setDoubleField(term2870, term2870.getClass(), "left", 1.0);
        setDoubleField(term2870, term2870.getClass(), "bottom", 1.0);
        setDoubleField(term2870, term2870.getClass(), "right", 1.0);
        setField(term2867, term2867.getClass(), "padding", term2870);
        setField(term2877, term2877.getClass(), "text", "");
        setField(term2880, term2880.getClass(), "fRequestedAttributes", null);
        setField(term2880, term2880.getClass(), "name", "");
        setIntField(term2880, term2880.getClass(), "style", 1);
        setIntField(term2880, term2880.getClass(), "size", 12);
        setFloatField(term2880, term2880.getClass(), "pointSize", 12.0F);
        setField(term2880, term2880.getClass(), "peer", null);
        setLongField(term2880, term2880.getClass(), "pData", 0L);
        setField(term2880, term2880.getClass(), "font2DHandle", null);
        setField(term2880, term2880.getClass(), "values", null);
        setBooleanField(term2880, term2880.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2880, term2880.getClass(), "createdFont", false);
        setBooleanField(term2880, term2880.getClass(), "nonIdentityTx", false);
        setIntField(term2880, term2880.getClass(), "hash", 0);
        setIntField(term2880, term2880.getClass(), "fontSerializedDataVersion", 1);
        setField(term2880, term2880.getClass(), "flmref", null);
        setField(term2877, term2877.getClass(), "font", term2880);
        setField(term2891, term2891.getClass(), "name", "");
        setField(term2877, term2877.getClass(), "textAlignment", term2891);
        setIntField(term2893, term2893.getClass(), "value", -16777216);
        setField(term2893, term2893.getClass(), "frgbvalue", null);
        setField(term2893, term2893.getClass(), "fvalue", null);
        setFloatField(term2893, term2893.getClass(), "falpha", 0.0F);
        setField(term2893, term2893.getClass(), "cs", null);
        setField(term2877, term2877.getClass(), "paint", term2893);
        setField(term2877, term2877.getClass(), "backgroundPaint", null);
        setField(term2877, term2877.getClass(), "toolTipText", "tPlsykYBqO");
        setField(term2877, term2877.getClass(), "urlText", "bLPjGVBhlX");
        setField(term2920, term2920.getClass(), "lines", term2921);
        setField(term2920, term2920.getClass(), "lineAlignment", term2891);
        setField(term2877, term2877.getClass(), "content", term2920);
        setBooleanField(term2877, term2877.getClass(), "expandToFitSpace", true);
        setField(term2925, term2925.getClass(), "name", "");
        setField(term2877, term2877.getClass(), "position", term2925);
        setField(term2877, term2877.getClass(), "horizontalAlignment", term2891);
        setField(term2927, term2927.getClass(), "name", "");
        setField(term2877, term2877.getClass(), "verticalAlignment", term2927);
        setField(term2929, term2929.getClass(), "listenerList", term2930);
        setField(term2877, term2877.getClass(), "listenerList", term2929);
        setBooleanField(term2877, term2877.getClass(), "notify", true);
        setField(term2877, term2877.getClass(), "id", "whBvTVIIlC");
        setField(term2944, term2944.getClass(), "unitType", term2871);
        setDoubleField(term2944, term2944.getClass(), "top", 0.0);
        setDoubleField(term2944, term2944.getClass(), "left", 0.0);
        setDoubleField(term2944, term2944.getClass(), "bottom", 0.0);
        setDoubleField(term2944, term2944.getClass(), "right", 0.0);
        setField(term2877, term2877.getClass(), "margin", term2944);
        setField(term2949, term2949.getClass(), "insets", term2944);
        setIntField(term2950, term2950.getClass(), "value", -1);
        setField(term2950, term2950.getClass(), "frgbvalue", null);
        setField(term2950, term2950.getClass(), "fvalue", null);
        setFloatField(term2950, term2950.getClass(), "falpha", 0.0F);
        setField(term2950, term2950.getClass(), "cs", null);
        setField(term2949, term2949.getClass(), "paint", term2950);
        setField(term2877, term2877.getClass(), "frame", term2949);
        setField(term2953, term2953.getClass(), "unitType", term2871);
        setDoubleField(term2953, term2953.getClass(), "top", 1.0);
        setDoubleField(term2953, term2953.getClass(), "left", 1.0);
        setDoubleField(term2953, term2953.getClass(), "bottom", 1.0);
        setDoubleField(term2953, term2953.getClass(), "right", 1.0);
        setField(term2877, term2877.getClass(), "padding", term2953);
        setDoubleField(term2877, term2877.getClass(), "width", 0.15917839663695388);
        setDoubleField(term2877, term2877.getClass(), "height", 0.9374115574082594);
        setFloatField(term2960, term2960.getClass(), "x", 0.0F);
        setFloatField(term2960, term2960.getClass(), "y", 0.0F);
        setFloatField(term2960, term2960.getClass(), "width", 0.0F);
        setFloatField(term2960, term2960.getClass(), "height", 0.0F);
        setField(term2877, term2877.getClass(), "bounds", term2960);
        setField(term2867, term2867.getClass(), "title", term2877);
        setField(term2867, term2867.getClass(), "subtitles", term2965);
        setField(term2867, term2867.getClass(), "plot", null);
        setField(term2867, term2867.getClass(), "backgroundPaint", null);
        setField(term2867, term2867.getClass(), "backgroundImage", null);
        setIntField(term2867, term2867.getClass(), "backgroundImageAlignment", -1456670397);
        setFloatField(term2867, term2867.getClass(), "backgroundImageAlpha", 0.6608425F);
        setField(term2971, term2971.getClass(), "listenerList", term2972);
        setField(term2867, term2867.getClass(), "changeListeners", term2971);
        setField(term2973, term2973.getClass(), "listenerList", term2974);
        setField(term2867, term2867.getClass(), "progressListeners", term2973);
        setBooleanField(term2867, term2867.getClass(), "notify", false);
        setField(term2866, term2866.getClass(), "pieChart", term2867);
        setField(term2866, term2866.getClass(), "dataset", null);
        setField(term2976, term2976.getClass(), "name", "IgRJUzaCwW");
        setField(term2866, term2866.getClass(), "dataExtractOrder", term2976);
        setDoubleField(term2866, term2866.getClass(), "limit", 0.8454723071922143);
        setField(term2866, term2866.getClass(), "aggregatedItemsKey", null);
        setField(term2866, term2866.getClass(), "aggregatedItemsPaint", null);
        setField(term2866, term2866.getClass(), "sectionPaints", null);
        setField(term2866, term2866.getClass(), "parent", null);
        setField(term2866, term2866.getClass(), "datasetGroup", null);
        setField(term2866, term2866.getClass(), "noDataMessage", null);
        setField(term2866, term2866.getClass(), "noDataMessageFont", null);
        setField(term2866, term2866.getClass(), "noDataMessagePaint", null);
        setField(term2866, term2866.getClass(), "insets", null);
        setBooleanField(term2866, term2866.getClass(), "outlineVisible", false);
        setField(term2866, term2866.getClass(), "outlineStroke", null);
        setField(term2866, term2866.getClass(), "outlinePaint", null);
        setField(term2866, term2866.getClass(), "backgroundPaint", null);
        setField(term2866, term2866.getClass(), "backgroundImage", null);
        setIntField(term2866, term2866.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term2866, term2866.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term2866, term2866.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term2866, term2866.getClass(), "backgroundAlpha", 0.0F);
        setField(term2866, term2866.getClass(), "drawingSupplier", null);
        setField(term2866, term2866.getClass(), "listenerList", null);
        term2995 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2995;
        callMethod(klass, "equals", argTypes, term2866, args);
    }

};


