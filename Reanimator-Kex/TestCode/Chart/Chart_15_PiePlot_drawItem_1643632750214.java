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
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class PiePlot_drawItem_1643632750214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;
     Object term288;
     Object term320;

    public PiePlot_drawItem_1643632750214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286 = new Integer(1725571209);
        ArrayList term309 = new ArrayList();
        ArrayList term313 = new ArrayList();
        ArrayList term316 = new ArrayList();
        term288 = newInstance(Class.forName("org.jfree.chart.plot.PiePlotState"));
        Object term296 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term297 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term298 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term303 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term304 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term312 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setIntField(term288, term288.getClass(), "passesRequired", -522618178);
        setDoubleField(term288, term288.getClass(), "total", 0.8474802076607362);
        setDoubleField(term288, term288.getClass(), "latestAngle", 0.5183269973490326);
        setField(term288, term288.getClass(), "explodedPieArea", null);
        setField(term288, term288.getClass(), "pieArea", null);
        setDoubleField(term288, term288.getClass(), "pieCenterX", 0.7655020693602768);
        setDoubleField(term288, term288.getClass(), "pieCenterY", 0.1374549299694151);
        setDoubleField(term288, term288.getClass(), "pieHRadius", 0.7031006357544823);
        setDoubleField(term288, term288.getClass(), "pieWRadius", 0.9527281779865117);
        setField(term288, term288.getClass(), "linkArea", null);
        setDoubleField(term298, term298.getClass(), "x", 0.0);
        setDoubleField(term298, term298.getClass(), "y", 0.0);
        setDoubleField(term298, term298.getClass(), "width", 0.0);
        setDoubleField(term298, term298.getClass(), "height", 0.0);
        setField(term297, term297.getClass(), "chartArea", term298);
        setField(term303, term303.getClass(), "owner", term297);
        setField(term303, term303.getClass(), "plotArea", null);
        setDoubleField(term304, term304.getClass(), "x", 0.0);
        setDoubleField(term304, term304.getClass(), "y", 0.0);
        setDoubleField(term304, term304.getClass(), "width", 0.0);
        setDoubleField(term304, term304.getClass(), "height", 0.0);
        setField(term303, term303.getClass(), "dataArea", term304);
        setField(term303, term303.getClass(), "subplotInfo", term309);
        setField(term297, term297.getClass(), "plotInfo", term303);
        setField(term312, term312.getClass(), "entities", term313);
        setField(term297, term297.getClass(), "entities", term312);
        setField(term296, term296.getClass(), "owner", term297);
        setField(term296, term296.getClass(), "plotArea", null);
        setField(term296, term296.getClass(), "dataArea", null);
        setField(term296, term296.getClass(), "subplotInfo", term316);
        setField(term288, term288.getClass(), "info", term296);
        term320 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.PiePlotState");
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term286;
        args[2] = null;
        args[3] = term288;
        args[4] = term320;
        try {
            callMethod(klass, "drawItem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


