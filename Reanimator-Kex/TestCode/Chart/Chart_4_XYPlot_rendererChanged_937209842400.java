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

public class XYPlot_rendererChanged_937209842400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1105;

    public XYPlot_rendererChanged_937209842400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1175 = new ArrayList();
        ArrayList term1221 = new ArrayList();
        term1105 = newInstance(Class.forName("org.jfree.chart.event.RendererChangeEvent"));
        Object term1106 = newInstance(Class.forName("java.lang.Object"));
        Object term1108 = newInstance(Class.forName("org.jfree.chart.event.ChartChangeEventType"));
        Object term1121 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1122 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1124 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1125 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1131 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term1134 = newInstance(Class.forName("java.awt.Font"));
        Object term1145 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term1147 = newInstance(Class.forName("java.awt.Color"));
        Object term1174 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1181 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1183 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1185 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1186 = (Object[]) newArray("java.lang.Object", 0);
        Object term1200 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1205 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1206 = newInstance(Class.forName("java.awt.Color"));
        Object term1209 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1216 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1227 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1228 = (Object[]) newArray("java.lang.Object", 0);
        Object term1229 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1230 = (Object[]) newArray("java.lang.Object", 0);
        Object term1232 = newInstance(Class.forName("java.lang.Object"));
        setField(term1105, term1105.getClass(), "renderer", term1106);
        setBooleanField(term1105, term1105.getClass(), "seriesVisibilityChanged", true);
        setField(term1108, term1108.getClass(), "name", "dWRymuLBtr");
        setField(term1105, term1105.getClass(), "type", term1108);
        setField(term1122, term1122.getClass(), "hintmap", null);
        setField(term1121, term1121.getClass(), "renderingHints", term1122);
        setBooleanField(term1121, term1121.getClass(), "borderVisible", true);
        setField(term1121, term1121.getClass(), "borderStroke", null);
        setField(term1121, term1121.getClass(), "borderPaint", null);
        setField(term1125, term1125.getClass(), "name", "");
        setField(term1124, term1124.getClass(), "unitType", term1125);
        setDoubleField(term1124, term1124.getClass(), "top", 1.0);
        setDoubleField(term1124, term1124.getClass(), "left", 1.0);
        setDoubleField(term1124, term1124.getClass(), "bottom", 1.0);
        setDoubleField(term1124, term1124.getClass(), "right", 1.0);
        setField(term1121, term1121.getClass(), "padding", term1124);
        setField(term1131, term1131.getClass(), "text", "");
        setField(term1134, term1134.getClass(), "fRequestedAttributes", null);
        setField(term1134, term1134.getClass(), "name", "");
        setIntField(term1134, term1134.getClass(), "style", 1);
        setIntField(term1134, term1134.getClass(), "size", 12);
        setFloatField(term1134, term1134.getClass(), "pointSize", 12.0F);
        setField(term1134, term1134.getClass(), "peer", null);
        setLongField(term1134, term1134.getClass(), "pData", 0L);
        setField(term1134, term1134.getClass(), "font2DHandle", null);
        setField(term1134, term1134.getClass(), "values", null);
        setBooleanField(term1134, term1134.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1134, term1134.getClass(), "createdFont", false);
        setBooleanField(term1134, term1134.getClass(), "nonIdentityTx", false);
        setIntField(term1134, term1134.getClass(), "hash", 0);
        setIntField(term1134, term1134.getClass(), "fontSerializedDataVersion", 1);
        setField(term1134, term1134.getClass(), "flmref", null);
        setField(term1131, term1131.getClass(), "font", term1134);
        setField(term1145, term1145.getClass(), "name", "");
        setField(term1131, term1131.getClass(), "textAlignment", term1145);
        setIntField(term1147, term1147.getClass(), "value", -16777216);
        setField(term1147, term1147.getClass(), "frgbvalue", null);
        setField(term1147, term1147.getClass(), "fvalue", null);
        setFloatField(term1147, term1147.getClass(), "falpha", 0.0F);
        setField(term1147, term1147.getClass(), "cs", null);
        setField(term1131, term1131.getClass(), "paint", term1147);
        setField(term1131, term1131.getClass(), "backgroundPaint", null);
        setField(term1131, term1131.getClass(), "toolTipText", "AijpHYOFuy");
        setField(term1131, term1131.getClass(), "urlText", "SbAoxhfrkn");
        setField(term1174, term1174.getClass(), "lines", term1175);
        setField(term1174, term1174.getClass(), "lineAlignment", term1145);
        setField(term1131, term1131.getClass(), "content", term1174);
        setBooleanField(term1131, term1131.getClass(), "expandToFitSpace", true);
        setIntField(term1131, term1131.getClass(), "maximumLinesToDisplay", 2147483647);
        setBooleanField(term1131, term1131.getClass(), "visible", true);
        setField(term1181, term1181.getClass(), "name", "");
        setField(term1131, term1131.getClass(), "position", term1181);
        setField(term1131, term1131.getClass(), "horizontalAlignment", term1145);
        setField(term1183, term1183.getClass(), "name", "");
        setField(term1131, term1131.getClass(), "verticalAlignment", term1183);
        setField(term1185, term1185.getClass(), "listenerList", term1186);
        setField(term1131, term1131.getClass(), "listenerList", term1185);
        setBooleanField(term1131, term1131.getClass(), "notify", true);
        setField(term1131, term1131.getClass(), "id", "kuTXqwMtDB");
        setField(term1200, term1200.getClass(), "unitType", term1125);
        setDoubleField(term1200, term1200.getClass(), "top", 0.0);
        setDoubleField(term1200, term1200.getClass(), "left", 0.0);
        setDoubleField(term1200, term1200.getClass(), "bottom", 0.0);
        setDoubleField(term1200, term1200.getClass(), "right", 0.0);
        setField(term1131, term1131.getClass(), "margin", term1200);
        setField(term1205, term1205.getClass(), "insets", term1200);
        setIntField(term1206, term1206.getClass(), "value", -1);
        setField(term1206, term1206.getClass(), "frgbvalue", null);
        setField(term1206, term1206.getClass(), "fvalue", null);
        setFloatField(term1206, term1206.getClass(), "falpha", 0.0F);
        setField(term1206, term1206.getClass(), "cs", null);
        setField(term1205, term1205.getClass(), "paint", term1206);
        setField(term1131, term1131.getClass(), "frame", term1205);
        setField(term1209, term1209.getClass(), "unitType", term1125);
        setDoubleField(term1209, term1209.getClass(), "top", 1.0);
        setDoubleField(term1209, term1209.getClass(), "left", 1.0);
        setDoubleField(term1209, term1209.getClass(), "bottom", 1.0);
        setDoubleField(term1209, term1209.getClass(), "right", 1.0);
        setField(term1131, term1131.getClass(), "padding", term1209);
        setDoubleField(term1131, term1131.getClass(), "width", 0.2779719046761513);
        setDoubleField(term1131, term1131.getClass(), "height", 0.6436713023569729);
        setFloatField(term1216, term1216.getClass(), "x", 0.0F);
        setFloatField(term1216, term1216.getClass(), "y", 0.0F);
        setFloatField(term1216, term1216.getClass(), "width", 0.0F);
        setFloatField(term1216, term1216.getClass(), "height", 0.0F);
        setField(term1131, term1131.getClass(), "bounds", term1216);
        setField(term1121, term1121.getClass(), "title", term1131);
        setField(term1121, term1121.getClass(), "subtitles", term1221);
        setField(term1121, term1121.getClass(), "plot", null);
        setField(term1121, term1121.getClass(), "backgroundPaint", null);
        setField(term1121, term1121.getClass(), "backgroundImage", null);
        setIntField(term1121, term1121.getClass(), "backgroundImageAlignment", 1632125673);
        setFloatField(term1121, term1121.getClass(), "backgroundImageAlpha", 0.13238746F);
        setField(term1227, term1227.getClass(), "listenerList", term1228);
        setField(term1121, term1121.getClass(), "changeListeners", term1227);
        setField(term1229, term1229.getClass(), "listenerList", term1230);
        setField(term1121, term1121.getClass(), "progressListeners", term1229);
        setBooleanField(term1121, term1121.getClass(), "notify", true);
        setField(term1105, term1105.getClass(), "chart", term1121);
        setField(term1105, term1105.getClass(), "source", term1232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.event.RendererChangeEvent");
        Object[] args = new Object[1];
        args[0] = term1105;
        try {
            callMethod(klass, "rendererChanged", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


