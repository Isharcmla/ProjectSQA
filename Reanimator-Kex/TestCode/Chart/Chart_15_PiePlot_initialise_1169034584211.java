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

public class PiePlot_initialise_1169034584211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term202;

    public PiePlot_initialise_1169034584211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = new Integer(568599855);
        ArrayList term215 = new ArrayList();
        ArrayList term220 = new ArrayList();
        ArrayList term224 = new ArrayList();
        term202 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term203 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term204 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term209 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term210 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term219 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term204, term204.getClass(), "x", 0.0);
        setDoubleField(term204, term204.getClass(), "y", 0.0);
        setDoubleField(term204, term204.getClass(), "width", 0.0);
        setDoubleField(term204, term204.getClass(), "height", 0.0);
        setField(term203, term203.getClass(), "chartArea", term204);
        setField(term209, term209.getClass(), "owner", term203);
        setField(term209, term209.getClass(), "plotArea", null);
        setDoubleField(term210, term210.getClass(), "x", 0.0);
        setDoubleField(term210, term210.getClass(), "y", 0.0);
        setDoubleField(term210, term210.getClass(), "width", 0.0);
        setDoubleField(term210, term210.getClass(), "height", 0.0);
        setField(term209, term209.getClass(), "dataArea", term210);
        setField(term209, term209.getClass(), "subplotInfo", term215);
        setField(term203, term203.getClass(), "plotInfo", term209);
        setField(term219, term219.getClass(), "entities", term220);
        setField(term203, term203.getClass(), "entities", term219);
        setField(term202, term202.getClass(), "owner", term203);
        setField(term202, term202.getClass(), "plotArea", null);
        setField(term202, term202.getClass(), "dataArea", null);
        setField(term202, term202.getClass(), "subplotInfo", term224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PiePlot");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term200;
        args[4] = term202;
        try {
            callMethod(klass, "initialise", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


