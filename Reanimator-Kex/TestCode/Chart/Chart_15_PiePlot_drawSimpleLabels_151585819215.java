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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Double;
import java.util.ArrayList;

public class PiePlot_drawSimpleLabels_151585819215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;
     Object term332;
     Object term334;

    public PiePlot_drawSimpleLabels_151585819215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term325 = newInstance(Class.forName("java.lang.Object"));
        Object term327 = newInstance(Class.forName("java.lang.Object"));
        Object term329 = newInstance(Class.forName("java.lang.Object"));
        term322 = new LinkedList();
        ((LinkedList) term322).add(term325);
        ((LinkedList) term322).add(term327);
        ((LinkedList) term322).add(term329);
        ((LinkedList) term322).add((Object)null);
        term332 = new Double(0.9828442029246764);
        ArrayList term355 = new ArrayList();
        ArrayList term359 = new ArrayList();
        ArrayList term362 = new ArrayList();
        term334 = newInstance(Class.forName("org.jfree.chart.plot.PiePlotState"));
        Object term342 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term343 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term344 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term349 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term350 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term358 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setIntField(term334, term334.getClass(), "passesRequired", -883034806);
        setDoubleField(term334, term334.getClass(), "total", 0.2779719046761513);
        setDoubleField(term334, term334.getClass(), "latestAngle", 0.6436713023569729);
        setField(term334, term334.getClass(), "explodedPieArea", null);
        setField(term334, term334.getClass(), "pieArea", null);
        setDoubleField(term334, term334.getClass(), "pieCenterX", 0.7332741045694002);
        setDoubleField(term334, term334.getClass(), "pieCenterY", 0.4569171842750229);
        setDoubleField(term334, term334.getClass(), "pieHRadius", 0.8598297828918529);
        setDoubleField(term334, term334.getClass(), "pieWRadius", 0.43692187681405226);
        setField(term334, term334.getClass(), "linkArea", null);
        setDoubleField(term344, term344.getClass(), "x", 0.0);
        setDoubleField(term344, term344.getClass(), "y", 0.0);
        setDoubleField(term344, term344.getClass(), "width", 0.0);
        setDoubleField(term344, term344.getClass(), "height", 0.0);
        setField(term343, term343.getClass(), "chartArea", term344);
        setField(term349, term349.getClass(), "owner", term343);
        setField(term349, term349.getClass(), "plotArea", null);
        setDoubleField(term350, term350.getClass(), "x", 0.0);
        setDoubleField(term350, term350.getClass(), "y", 0.0);
        setDoubleField(term350, term350.getClass(), "width", 0.0);
        setDoubleField(term350, term350.getClass(), "height", 0.0);
        setField(term349, term349.getClass(), "dataArea", term350);
        setField(term349, term349.getClass(), "subplotInfo", term355);
        setField(term343, term343.getClass(), "plotInfo", term349);
        setField(term358, term358.getClass(), "entities", term359);
        setField(term343, term343.getClass(), "entities", term358);
        setField(term342, term342.getClass(), "owner", term343);
        setField(term342, term342.getClass(), "plotArea", null);
        setField(term342, term342.getClass(), "dataArea", null);
        setField(term342, term342.getClass(), "subplotInfo", term362);
        setField(term334, term334.getClass(), "info", term342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = double.class;
        argTypes[3] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[4] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[5] = Class.forName("org.jfree.chart.plot.PiePlotState");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term322;
        args[2] = term332;
        args[3] = null;
        args[4] = null;
        args[5] = term334;
        try {
            callMethod(klass, "drawSimpleLabels", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


