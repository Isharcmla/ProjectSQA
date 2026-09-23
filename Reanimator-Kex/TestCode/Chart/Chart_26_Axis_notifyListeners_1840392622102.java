package org.jfree.chart.axis;

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
import java.lang.NullPointerException;
import static org.jfree.chart.axis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Axis_notifyListeners_1840392622102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;

    public Axis_notifyListeners_1840392622102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term329 = new ArrayList();
        ArrayList term373 = new ArrayList();
        term261 = newInstance(Class.forName("org.jfree.chart.event.AxisChangeEvent"));
        Object term262 = newInstance(Class.forName("org.jfree.chart.event.ChartChangeEventType"));
        Object term275 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term276 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term278 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term279 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term285 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term288 = newInstance(Class.forName("java.awt.Font"));
        Object term299 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term301 = newInstance(Class.forName("java.awt.Color"));
        Object term328 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term333 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term335 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term337 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term338 = (Object[]) newArray("java.lang.Object", 0);
        Object term352 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term357 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term358 = newInstance(Class.forName("java.awt.Color"));
        Object term361 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term368 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term379 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term380 = (Object[]) newArray("java.lang.Object", 0);
        Object term381 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term382 = (Object[]) newArray("java.lang.Object", 0);
        Object term384 = newInstance(Class.forName("java.lang.Object"));
        setField(term261, term261.getClass(), "axis", null);
        setField(term262, term262.getClass(), "name", "EGtDIRbSSb");
        setField(term261, term261.getClass(), "type", term262);
        setField(term276, term276.getClass(), "hintmap", null);
        setField(term275, term275.getClass(), "renderingHints", term276);
        setBooleanField(term275, term275.getClass(), "borderVisible", false);
        setField(term275, term275.getClass(), "borderStroke", null);
        setField(term275, term275.getClass(), "borderPaint", null);
        setField(term279, term279.getClass(), "name", "");
        setField(term278, term278.getClass(), "unitType", term279);
        setDoubleField(term278, term278.getClass(), "top", 1.0);
        setDoubleField(term278, term278.getClass(), "left", 1.0);
        setDoubleField(term278, term278.getClass(), "bottom", 1.0);
        setDoubleField(term278, term278.getClass(), "right", 1.0);
        setField(term275, term275.getClass(), "padding", term278);
        setField(term285, term285.getClass(), "text", "");
        setField(term288, term288.getClass(), "fRequestedAttributes", null);
        setField(term288, term288.getClass(), "name", "");
        setIntField(term288, term288.getClass(), "style", 1);
        setIntField(term288, term288.getClass(), "size", 12);
        setFloatField(term288, term288.getClass(), "pointSize", 12.0F);
        setField(term288, term288.getClass(), "peer", null);
        setLongField(term288, term288.getClass(), "pData", 0L);
        setField(term288, term288.getClass(), "font2DHandle", null);
        setField(term288, term288.getClass(), "values", null);
        setBooleanField(term288, term288.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term288, term288.getClass(), "createdFont", false);
        setBooleanField(term288, term288.getClass(), "nonIdentityTx", false);
        setIntField(term288, term288.getClass(), "hash", 0);
        setIntField(term288, term288.getClass(), "fontSerializedDataVersion", 1);
        setField(term288, term288.getClass(), "flmref", null);
        setField(term285, term285.getClass(), "font", term288);
        setField(term299, term299.getClass(), "name", "");
        setField(term285, term285.getClass(), "textAlignment", term299);
        setIntField(term301, term301.getClass(), "value", -16777216);
        setField(term301, term301.getClass(), "frgbvalue", null);
        setField(term301, term301.getClass(), "fvalue", null);
        setFloatField(term301, term301.getClass(), "falpha", 0.0F);
        setField(term301, term301.getClass(), "cs", null);
        setField(term285, term285.getClass(), "paint", term301);
        setField(term285, term285.getClass(), "backgroundPaint", null);
        setField(term285, term285.getClass(), "toolTipText", "SzjVpOQTyS");
        setField(term285, term285.getClass(), "urlText", "MjGYSRKTNF");
        setField(term328, term328.getClass(), "lines", term329);
        setField(term328, term328.getClass(), "lineAlignment", term299);
        setField(term285, term285.getClass(), "content", term328);
        setBooleanField(term285, term285.getClass(), "expandToFitSpace", true);
        setField(term333, term333.getClass(), "name", "");
        setField(term285, term285.getClass(), "position", term333);
        setField(term285, term285.getClass(), "horizontalAlignment", term299);
        setField(term335, term335.getClass(), "name", "");
        setField(term285, term285.getClass(), "verticalAlignment", term335);
        setField(term337, term337.getClass(), "listenerList", term338);
        setField(term285, term285.getClass(), "listenerList", term337);
        setBooleanField(term285, term285.getClass(), "notify", true);
        setField(term285, term285.getClass(), "id", "hRNSzYYIrc");
        setField(term352, term352.getClass(), "unitType", term279);
        setDoubleField(term352, term352.getClass(), "top", 0.0);
        setDoubleField(term352, term352.getClass(), "left", 0.0);
        setDoubleField(term352, term352.getClass(), "bottom", 0.0);
        setDoubleField(term352, term352.getClass(), "right", 0.0);
        setField(term285, term285.getClass(), "margin", term352);
        setField(term357, term357.getClass(), "insets", term352);
        setIntField(term358, term358.getClass(), "value", -1);
        setField(term358, term358.getClass(), "frgbvalue", null);
        setField(term358, term358.getClass(), "fvalue", null);
        setFloatField(term358, term358.getClass(), "falpha", 0.0F);
        setField(term358, term358.getClass(), "cs", null);
        setField(term357, term357.getClass(), "paint", term358);
        setField(term285, term285.getClass(), "frame", term357);
        setField(term361, term361.getClass(), "unitType", term279);
        setDoubleField(term361, term361.getClass(), "top", 1.0);
        setDoubleField(term361, term361.getClass(), "left", 1.0);
        setDoubleField(term361, term361.getClass(), "bottom", 1.0);
        setDoubleField(term361, term361.getClass(), "right", 1.0);
        setField(term285, term285.getClass(), "padding", term361);
        setDoubleField(term285, term285.getClass(), "width", 0.5523635872663106);
        setDoubleField(term285, term285.getClass(), "height", 0.544608645520025);
        setFloatField(term368, term368.getClass(), "x", 0.0F);
        setFloatField(term368, term368.getClass(), "y", 0.0F);
        setFloatField(term368, term368.getClass(), "width", 0.0F);
        setFloatField(term368, term368.getClass(), "height", 0.0F);
        setField(term285, term285.getClass(), "bounds", term368);
        setField(term275, term275.getClass(), "title", term285);
        setField(term275, term275.getClass(), "subtitles", term373);
        setField(term275, term275.getClass(), "plot", null);
        setField(term275, term275.getClass(), "backgroundPaint", null);
        setField(term275, term275.getClass(), "backgroundImage", null);
        setIntField(term275, term275.getClass(), "backgroundImageAlignment", -1685132342);
        setFloatField(term275, term275.getClass(), "backgroundImageAlpha", 0.5523636F);
        setField(term379, term379.getClass(), "listenerList", term380);
        setField(term275, term275.getClass(), "changeListeners", term379);
        setField(term381, term381.getClass(), "listenerList", term382);
        setField(term275, term275.getClass(), "progressListeners", term381);
        setBooleanField(term275, term275.getClass(), "notify", false);
        setField(term261, term261.getClass(), "chart", term275);
        setField(term261, term261.getClass(), "source", term384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.axis.Axis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.event.AxisChangeEvent");
        Object[] args = new Object[1];
        args[0] = term261;
        try {
            callMethod(klass, "notifyListeners", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


