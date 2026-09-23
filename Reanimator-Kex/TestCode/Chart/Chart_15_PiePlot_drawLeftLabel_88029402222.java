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

public class PiePlot_drawLeftLabel_88029402222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;
     Object term509;

    public PiePlot_drawLeftLabel_88029402222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term498 = new ArrayList();
        ArrayList term502 = new ArrayList();
        ArrayList term505 = new ArrayList();
        term477 = newInstance(Class.forName("org.jfree.chart.plot.PiePlotState"));
        Object term485 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term486 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term487 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term492 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term493 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term501 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setIntField(term477, term477.getClass(), "passesRequired", -1456670397);
        setDoubleField(term477, term477.getClass(), "total", 0.5873228247510078);
        setDoubleField(term477, term477.getClass(), "latestAngle", 0.8823181080774973);
        setField(term477, term477.getClass(), "explodedPieArea", null);
        setField(term477, term477.getClass(), "pieArea", null);
        setDoubleField(term477, term477.getClass(), "pieCenterX", 0.2192450926212024);
        setDoubleField(term477, term477.getClass(), "pieCenterY", 0.7591353014991907);
        setDoubleField(term477, term477.getClass(), "pieHRadius", 0.791695029600875);
        setDoubleField(term477, term477.getClass(), "pieWRadius", 0.6862221294683138);
        setField(term477, term477.getClass(), "linkArea", null);
        setDoubleField(term487, term487.getClass(), "x", 0.0);
        setDoubleField(term487, term487.getClass(), "y", 0.0);
        setDoubleField(term487, term487.getClass(), "width", 0.0);
        setDoubleField(term487, term487.getClass(), "height", 0.0);
        setField(term486, term486.getClass(), "chartArea", term487);
        setField(term492, term492.getClass(), "owner", term486);
        setField(term492, term492.getClass(), "plotArea", null);
        setDoubleField(term493, term493.getClass(), "x", 0.0);
        setDoubleField(term493, term493.getClass(), "y", 0.0);
        setDoubleField(term493, term493.getClass(), "width", 0.0);
        setDoubleField(term493, term493.getClass(), "height", 0.0);
        setField(term492, term492.getClass(), "dataArea", term493);
        setField(term492, term492.getClass(), "subplotInfo", term498);
        setField(term486, term486.getClass(), "plotInfo", term492);
        setField(term501, term501.getClass(), "entities", term502);
        setField(term486, term486.getClass(), "entities", term501);
        setField(term485, term485.getClass(), "owner", term486);
        setField(term485, term485.getClass(), "plotArea", null);
        setField(term485, term485.getClass(), "dataArea", null);
        setField(term485, term485.getClass(), "subplotInfo", term505);
        setField(term477, term477.getClass(), "info", term485);
        ArrayList term539 = new ArrayList();
        term509 = newInstance(Class.forName("org.jfree.chart.plot.PieLabelRecord"));
        Object term513 = newInstance(Class.forName("org.jfree.chart.text.TextBox"));
        Object term514 = newInstance(Class.forName("java.awt.Color"));
        Object term517 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term523 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term524 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term530 = newInstance(Class.forName("java.awt.Color"));
        Object term533 = newInstance(Class.forName("java.awt.Color"));
        Object term538 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term543 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        setField(term509, term509.getClass(), "key", null);
        setDoubleField(term509, term509.getClass(), "angle", 0.15917839663695388);
        setDoubleField(term509, term509.getClass(), "baseY", 0.9374115574082594);
        setDoubleField(term509, term509.getClass(), "allocatedY", 0.8454723071922143);
        setIntField(term514, term514.getClass(), "value", -16777216);
        setField(term514, term514.getClass(), "frgbvalue", null);
        setField(term514, term514.getClass(), "fvalue", null);
        setFloatField(term514, term514.getClass(), "falpha", 0.0F);
        setField(term514, term514.getClass(), "cs", null);
        setField(term513, term513.getClass(), "outlinePaint", term514);
        setFloatField(term517, term517.getClass(), "width", 1.0F);
        setIntField(term517, term517.getClass(), "join", 0);
        setIntField(term517, term517.getClass(), "cap", 2);
        setFloatField(term517, term517.getClass(), "miterlimit", 10.0F);
        setField(term517, term517.getClass(), "dash", null);
        setFloatField(term517, term517.getClass(), "dash_phase", 0.0F);
        setField(term513, term513.getClass(), "outlineStroke", term517);
        setField(term524, term524.getClass(), "name", "");
        setField(term523, term523.getClass(), "unitType", term524);
        setDoubleField(term523, term523.getClass(), "top", 1.0);
        setDoubleField(term523, term523.getClass(), "left", 3.0);
        setDoubleField(term523, term523.getClass(), "bottom", 1.0);
        setDoubleField(term523, term523.getClass(), "right", 3.0);
        setField(term513, term513.getClass(), "interiorGap", term523);
        setIntField(term530, term530.getClass(), "value", -64);
        setField(term530, term530.getClass(), "frgbvalue", null);
        setField(term530, term530.getClass(), "fvalue", null);
        setFloatField(term530, term530.getClass(), "falpha", 0.0F);
        setField(term530, term530.getClass(), "cs", null);
        setField(term513, term513.getClass(), "backgroundPaint", term530);
        setIntField(term533, term533.getClass(), "value", -8355712);
        setField(term533, term533.getClass(), "frgbvalue", null);
        setField(term533, term533.getClass(), "fvalue", null);
        setFloatField(term533, term533.getClass(), "falpha", 0.0F);
        setField(term533, term533.getClass(), "cs", null);
        setField(term513, term513.getClass(), "shadowPaint", term533);
        setDoubleField(term513, term513.getClass(), "shadowXOffset", 2.0);
        setDoubleField(term513, term513.getClass(), "shadowYOffset", 2.0);
        setField(term538, term538.getClass(), "lines", term539);
        setField(term543, term543.getClass(), "name", "");
        setField(term538, term538.getClass(), "lineAlignment", term543);
        setField(term513, term513.getClass(), "textBlock", term538);
        setField(term509, term509.getClass(), "label", term513);
        setDoubleField(term509, term509.getClass(), "labelHeight", 0.8566567697571895);
        setDoubleField(term509, term509.getClass(), "gap", 0.9203805380592256);
        setDoubleField(term509, term509.getClass(), "linkPercent", 0.5804948995371725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.plot.PiePlotState");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PieLabelRecord");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term477;
        args[2] = term509;
        try {
            callMethod(klass, "drawLeftLabel", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


