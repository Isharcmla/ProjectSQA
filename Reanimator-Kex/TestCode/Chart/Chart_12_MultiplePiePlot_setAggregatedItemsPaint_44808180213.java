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

public class MultiplePiePlot_setAggregatedItemsPaint_44808180213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1989;

    public MultiplePiePlot_setAggregatedItemsPaint_44808180213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2044 = new ArrayList();
        ArrayList term2088 = new ArrayList();
        term1989 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term1990 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1991 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1993 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1994 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term2000 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term2003 = newInstance(Class.forName("java.awt.Font"));
        Object term2014 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term2016 = newInstance(Class.forName("java.awt.Color"));
        Object term2043 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term2048 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term2050 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term2052 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2053 = (Object[]) newArray("java.lang.Object", 0);
        Object term2067 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2072 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term2073 = newInstance(Class.forName("java.awt.Color"));
        Object term2076 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2083 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term2094 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2095 = (Object[]) newArray("java.lang.Object", 0);
        Object term2096 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2097 = (Object[]) newArray("java.lang.Object", 0);
        Object term2099 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term1991, term1991.getClass(), "hintmap", null);
        setField(term1990, term1990.getClass(), "renderingHints", term1991);
        setBooleanField(term1990, term1990.getClass(), "borderVisible", true);
        setField(term1990, term1990.getClass(), "borderStroke", null);
        setField(term1990, term1990.getClass(), "borderPaint", null);
        setField(term1994, term1994.getClass(), "name", "");
        setField(term1993, term1993.getClass(), "unitType", term1994);
        setDoubleField(term1993, term1993.getClass(), "top", 1.0);
        setDoubleField(term1993, term1993.getClass(), "left", 1.0);
        setDoubleField(term1993, term1993.getClass(), "bottom", 1.0);
        setDoubleField(term1993, term1993.getClass(), "right", 1.0);
        setField(term1990, term1990.getClass(), "padding", term1993);
        setField(term2000, term2000.getClass(), "text", "");
        setField(term2003, term2003.getClass(), "fRequestedAttributes", null);
        setField(term2003, term2003.getClass(), "name", "");
        setIntField(term2003, term2003.getClass(), "style", 1);
        setIntField(term2003, term2003.getClass(), "size", 12);
        setFloatField(term2003, term2003.getClass(), "pointSize", 12.0F);
        setField(term2003, term2003.getClass(), "peer", null);
        setLongField(term2003, term2003.getClass(), "pData", 0L);
        setField(term2003, term2003.getClass(), "font2DHandle", null);
        setField(term2003, term2003.getClass(), "values", null);
        setBooleanField(term2003, term2003.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2003, term2003.getClass(), "createdFont", false);
        setBooleanField(term2003, term2003.getClass(), "nonIdentityTx", false);
        setIntField(term2003, term2003.getClass(), "hash", 0);
        setIntField(term2003, term2003.getClass(), "fontSerializedDataVersion", 1);
        setField(term2003, term2003.getClass(), "flmref", null);
        setField(term2000, term2000.getClass(), "font", term2003);
        setField(term2014, term2014.getClass(), "name", "");
        setField(term2000, term2000.getClass(), "textAlignment", term2014);
        setIntField(term2016, term2016.getClass(), "value", -16777216);
        setField(term2016, term2016.getClass(), "frgbvalue", null);
        setField(term2016, term2016.getClass(), "fvalue", null);
        setFloatField(term2016, term2016.getClass(), "falpha", 0.0F);
        setField(term2016, term2016.getClass(), "cs", null);
        setField(term2000, term2000.getClass(), "paint", term2016);
        setField(term2000, term2000.getClass(), "backgroundPaint", null);
        setField(term2000, term2000.getClass(), "toolTipText", "xLbjWUgOIL");
        setField(term2000, term2000.getClass(), "urlText", "jDtqGUpnZN");
        setField(term2043, term2043.getClass(), "lines", term2044);
        setField(term2043, term2043.getClass(), "lineAlignment", term2014);
        setField(term2000, term2000.getClass(), "content", term2043);
        setBooleanField(term2000, term2000.getClass(), "expandToFitSpace", true);
        setField(term2048, term2048.getClass(), "name", "");
        setField(term2000, term2000.getClass(), "position", term2048);
        setField(term2000, term2000.getClass(), "horizontalAlignment", term2014);
        setField(term2050, term2050.getClass(), "name", "");
        setField(term2000, term2000.getClass(), "verticalAlignment", term2050);
        setField(term2052, term2052.getClass(), "listenerList", term2053);
        setField(term2000, term2000.getClass(), "listenerList", term2052);
        setBooleanField(term2000, term2000.getClass(), "notify", true);
        setField(term2000, term2000.getClass(), "id", "nGKItKLYNC");
        setField(term2067, term2067.getClass(), "unitType", term1994);
        setDoubleField(term2067, term2067.getClass(), "top", 0.0);
        setDoubleField(term2067, term2067.getClass(), "left", 0.0);
        setDoubleField(term2067, term2067.getClass(), "bottom", 0.0);
        setDoubleField(term2067, term2067.getClass(), "right", 0.0);
        setField(term2000, term2000.getClass(), "margin", term2067);
        setField(term2072, term2072.getClass(), "insets", term2067);
        setIntField(term2073, term2073.getClass(), "value", -1);
        setField(term2073, term2073.getClass(), "frgbvalue", null);
        setField(term2073, term2073.getClass(), "fvalue", null);
        setFloatField(term2073, term2073.getClass(), "falpha", 0.0F);
        setField(term2073, term2073.getClass(), "cs", null);
        setField(term2072, term2072.getClass(), "paint", term2073);
        setField(term2000, term2000.getClass(), "frame", term2072);
        setField(term2076, term2076.getClass(), "unitType", term1994);
        setDoubleField(term2076, term2076.getClass(), "top", 1.0);
        setDoubleField(term2076, term2076.getClass(), "left", 1.0);
        setDoubleField(term2076, term2076.getClass(), "bottom", 1.0);
        setDoubleField(term2076, term2076.getClass(), "right", 1.0);
        setField(term2000, term2000.getClass(), "padding", term2076);
        setDoubleField(term2000, term2000.getClass(), "width", 0.3587267442738795);
        setDoubleField(term2000, term2000.getClass(), "height", 0.07802449704920456);
        setFloatField(term2083, term2083.getClass(), "x", 0.0F);
        setFloatField(term2083, term2083.getClass(), "y", 0.0F);
        setFloatField(term2083, term2083.getClass(), "width", 0.0F);
        setFloatField(term2083, term2083.getClass(), "height", 0.0F);
        setField(term2000, term2000.getClass(), "bounds", term2083);
        setField(term1990, term1990.getClass(), "title", term2000);
        setField(term1990, term1990.getClass(), "subtitles", term2088);
        setField(term1990, term1990.getClass(), "plot", null);
        setField(term1990, term1990.getClass(), "backgroundPaint", null);
        setField(term1990, term1990.getClass(), "backgroundImage", null);
        setIntField(term1990, term1990.getClass(), "backgroundImageAlignment", 1134449235);
        setFloatField(term1990, term1990.getClass(), "backgroundImageAlpha", 0.26413453F);
        setField(term2094, term2094.getClass(), "listenerList", term2095);
        setField(term1990, term1990.getClass(), "changeListeners", term2094);
        setField(term2096, term2096.getClass(), "listenerList", term2097);
        setField(term1990, term1990.getClass(), "progressListeners", term2096);
        setBooleanField(term1990, term1990.getClass(), "notify", true);
        setField(term1989, term1989.getClass(), "pieChart", term1990);
        setField(term1989, term1989.getClass(), "dataset", null);
        setField(term2099, term2099.getClass(), "name", "UiUYnPrcCi");
        setField(term1989, term1989.getClass(), "dataExtractOrder", term2099);
        setDoubleField(term1989, term1989.getClass(), "limit", 0.5279279537140873);
        setField(term1989, term1989.getClass(), "aggregatedItemsKey", null);
        setField(term1989, term1989.getClass(), "aggregatedItemsPaint", null);
        setField(term1989, term1989.getClass(), "sectionPaints", null);
        setField(term1989, term1989.getClass(), "parent", null);
        setField(term1989, term1989.getClass(), "datasetGroup", null);
        setField(term1989, term1989.getClass(), "noDataMessage", null);
        setField(term1989, term1989.getClass(), "noDataMessageFont", null);
        setField(term1989, term1989.getClass(), "noDataMessagePaint", null);
        setField(term1989, term1989.getClass(), "insets", null);
        setBooleanField(term1989, term1989.getClass(), "outlineVisible", false);
        setField(term1989, term1989.getClass(), "outlineStroke", null);
        setField(term1989, term1989.getClass(), "outlinePaint", null);
        setField(term1989, term1989.getClass(), "backgroundPaint", null);
        setField(term1989, term1989.getClass(), "backgroundImage", null);
        setIntField(term1989, term1989.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term1989, term1989.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term1989, term1989.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term1989, term1989.getClass(), "backgroundAlpha", 0.0F);
        setField(term1989, term1989.getClass(), "drawingSupplier", null);
        setField(term1989, term1989.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Paint");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAggregatedItemsPaint", argTypes, term1989, args);
    }

};


