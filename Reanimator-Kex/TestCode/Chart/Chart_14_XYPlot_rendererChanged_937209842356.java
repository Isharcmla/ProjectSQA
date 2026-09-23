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

public class XYPlot_rendererChanged_937209842356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1094;

    public XYPlot_rendererChanged_937209842356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1163 = new ArrayList();
        ArrayList term1207 = new ArrayList();
        term1094 = newInstance(Class.forName("org.jfree.chart.event.RendererChangeEvent"));
        Object term1095 = newInstance(Class.forName("java.lang.Object"));
        Object term1096 = newInstance(Class.forName("org.jfree.chart.event.ChartChangeEventType"));
        Object term1109 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1110 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1112 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1113 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1119 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term1122 = newInstance(Class.forName("java.awt.Font"));
        Object term1133 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term1135 = newInstance(Class.forName("java.awt.Color"));
        Object term1162 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1167 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1169 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1171 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1172 = (Object[]) newArray("java.lang.Object", 0);
        Object term1186 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1191 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1192 = newInstance(Class.forName("java.awt.Color"));
        Object term1195 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1202 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1213 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1214 = (Object[]) newArray("java.lang.Object", 0);
        Object term1215 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1216 = (Object[]) newArray("java.lang.Object", 0);
        Object term1218 = newInstance(Class.forName("java.lang.Object"));
        setField(term1094, term1094.getClass(), "renderer", term1095);
        setField(term1096, term1096.getClass(), "name", "dWRymuLBtr");
        setField(term1094, term1094.getClass(), "type", term1096);
        setField(term1110, term1110.getClass(), "hintmap", null);
        setField(term1109, term1109.getClass(), "renderingHints", term1110);
        setBooleanField(term1109, term1109.getClass(), "borderVisible", false);
        setField(term1109, term1109.getClass(), "borderStroke", null);
        setField(term1109, term1109.getClass(), "borderPaint", null);
        setField(term1113, term1113.getClass(), "name", "");
        setField(term1112, term1112.getClass(), "unitType", term1113);
        setDoubleField(term1112, term1112.getClass(), "top", 1.0);
        setDoubleField(term1112, term1112.getClass(), "left", 1.0);
        setDoubleField(term1112, term1112.getClass(), "bottom", 1.0);
        setDoubleField(term1112, term1112.getClass(), "right", 1.0);
        setField(term1109, term1109.getClass(), "padding", term1112);
        setField(term1119, term1119.getClass(), "text", "");
        setField(term1122, term1122.getClass(), "fRequestedAttributes", null);
        setField(term1122, term1122.getClass(), "name", "");
        setIntField(term1122, term1122.getClass(), "style", 1);
        setIntField(term1122, term1122.getClass(), "size", 12);
        setFloatField(term1122, term1122.getClass(), "pointSize", 12.0F);
        setField(term1122, term1122.getClass(), "peer", null);
        setLongField(term1122, term1122.getClass(), "pData", 0L);
        setField(term1122, term1122.getClass(), "font2DHandle", null);
        setField(term1122, term1122.getClass(), "values", null);
        setBooleanField(term1122, term1122.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1122, term1122.getClass(), "createdFont", false);
        setBooleanField(term1122, term1122.getClass(), "nonIdentityTx", false);
        setIntField(term1122, term1122.getClass(), "hash", 0);
        setIntField(term1122, term1122.getClass(), "fontSerializedDataVersion", 1);
        setField(term1122, term1122.getClass(), "flmref", null);
        setField(term1119, term1119.getClass(), "font", term1122);
        setField(term1133, term1133.getClass(), "name", "");
        setField(term1119, term1119.getClass(), "textAlignment", term1133);
        setIntField(term1135, term1135.getClass(), "value", -16777216);
        setField(term1135, term1135.getClass(), "frgbvalue", null);
        setField(term1135, term1135.getClass(), "fvalue", null);
        setFloatField(term1135, term1135.getClass(), "falpha", 0.0F);
        setField(term1135, term1135.getClass(), "cs", null);
        setField(term1119, term1119.getClass(), "paint", term1135);
        setField(term1119, term1119.getClass(), "backgroundPaint", null);
        setField(term1119, term1119.getClass(), "toolTipText", "AijpHYOFuy");
        setField(term1119, term1119.getClass(), "urlText", "SbAoxhfrkn");
        setField(term1162, term1162.getClass(), "lines", term1163);
        setField(term1162, term1162.getClass(), "lineAlignment", term1133);
        setField(term1119, term1119.getClass(), "content", term1162);
        setBooleanField(term1119, term1119.getClass(), "expandToFitSpace", false);
        setField(term1167, term1167.getClass(), "name", "");
        setField(term1119, term1119.getClass(), "position", term1167);
        setField(term1119, term1119.getClass(), "horizontalAlignment", term1133);
        setField(term1169, term1169.getClass(), "name", "");
        setField(term1119, term1119.getClass(), "verticalAlignment", term1169);
        setField(term1171, term1171.getClass(), "listenerList", term1172);
        setField(term1119, term1119.getClass(), "listenerList", term1171);
        setBooleanField(term1119, term1119.getClass(), "notify", true);
        setField(term1119, term1119.getClass(), "id", "kuTXqwMtDB");
        setField(term1186, term1186.getClass(), "unitType", term1113);
        setDoubleField(term1186, term1186.getClass(), "top", 0.0);
        setDoubleField(term1186, term1186.getClass(), "left", 0.0);
        setDoubleField(term1186, term1186.getClass(), "bottom", 0.0);
        setDoubleField(term1186, term1186.getClass(), "right", 0.0);
        setField(term1119, term1119.getClass(), "margin", term1186);
        setField(term1191, term1191.getClass(), "insets", term1186);
        setIntField(term1192, term1192.getClass(), "value", -1);
        setField(term1192, term1192.getClass(), "frgbvalue", null);
        setField(term1192, term1192.getClass(), "fvalue", null);
        setFloatField(term1192, term1192.getClass(), "falpha", 0.0F);
        setField(term1192, term1192.getClass(), "cs", null);
        setField(term1191, term1191.getClass(), "paint", term1192);
        setField(term1119, term1119.getClass(), "frame", term1191);
        setField(term1195, term1195.getClass(), "unitType", term1113);
        setDoubleField(term1195, term1195.getClass(), "top", 1.0);
        setDoubleField(term1195, term1195.getClass(), "left", 1.0);
        setDoubleField(term1195, term1195.getClass(), "bottom", 1.0);
        setDoubleField(term1195, term1195.getClass(), "right", 1.0);
        setField(term1119, term1119.getClass(), "padding", term1195);
        setDoubleField(term1119, term1119.getClass(), "width", 0.2779719046761513);
        setDoubleField(term1119, term1119.getClass(), "height", 0.6436713023569729);
        setFloatField(term1202, term1202.getClass(), "x", 0.0F);
        setFloatField(term1202, term1202.getClass(), "y", 0.0F);
        setFloatField(term1202, term1202.getClass(), "width", 0.0F);
        setFloatField(term1202, term1202.getClass(), "height", 0.0F);
        setField(term1119, term1119.getClass(), "bounds", term1202);
        setField(term1109, term1109.getClass(), "title", term1119);
        setField(term1109, term1109.getClass(), "subtitles", term1207);
        setField(term1109, term1109.getClass(), "plot", null);
        setField(term1109, term1109.getClass(), "backgroundPaint", null);
        setField(term1109, term1109.getClass(), "backgroundImage", null);
        setIntField(term1109, term1109.getClass(), "backgroundImageAlignment", -1968847291);
        setFloatField(term1109, term1109.getClass(), "backgroundImageAlpha", 0.13238746F);
        setField(term1213, term1213.getClass(), "listenerList", term1214);
        setField(term1109, term1109.getClass(), "changeListeners", term1213);
        setField(term1215, term1215.getClass(), "listenerList", term1216);
        setField(term1109, term1109.getClass(), "progressListeners", term1215);
        setBooleanField(term1109, term1109.getClass(), "notify", true);
        setField(term1094, term1094.getClass(), "chart", term1109);
        setField(term1094, term1094.getClass(), "source", term1218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.event.RendererChangeEvent");
        Object[] args = new Object[1];
        args[0] = term1094;
        try {
            callMethod(klass, "rendererChanged", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


