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
import java.util.ArrayList;
import java.lang.Object;

public class Axis_drawLabel_903243129104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460;
     Object term473;
     Object term480;

    public Axis_drawLabel_903243129104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        setField(term460, term460.getClass(), "name", "uuaPigETmJ");
        ArrayList term475 = new ArrayList();
        term473 = newInstance(Class.forName("org.jfree.chart.axis.AxisState"));
        setDoubleField(term473, term473.getClass(), "cursor", 0.28570734989730284);
        setField(term473, term473.getClass(), "ticks", term475);
        setDoubleField(term473, term473.getClass(), "max", 0.40176586625454525);
        ArrayList term493 = new ArrayList();
        ArrayList term498 = new ArrayList();
        ArrayList term502 = new ArrayList();
        term480 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term481 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term482 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term487 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term488 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term497 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term482, term482.getClass(), "x", 0.0);
        setDoubleField(term482, term482.getClass(), "y", 0.0);
        setDoubleField(term482, term482.getClass(), "width", 0.0);
        setDoubleField(term482, term482.getClass(), "height", 0.0);
        setField(term481, term481.getClass(), "chartArea", term482);
        setField(term487, term487.getClass(), "owner", term481);
        setField(term487, term487.getClass(), "plotArea", null);
        setDoubleField(term488, term488.getClass(), "x", 0.0);
        setDoubleField(term488, term488.getClass(), "y", 0.0);
        setDoubleField(term488, term488.getClass(), "width", 0.0);
        setDoubleField(term488, term488.getClass(), "height", 0.0);
        setField(term487, term487.getClass(), "dataArea", term488);
        setField(term487, term487.getClass(), "subplotInfo", term493);
        setField(term481, term481.getClass(), "plotInfo", term487);
        setField(term497, term497.getClass(), "entities", term498);
        setField(term481, term481.getClass(), "entities", term497);
        setField(term480, term480.getClass(), "owner", term481);
        setField(term480, term480.getClass(), "plotArea", null);
        setField(term480, term480.getClass(), "dataArea", null);
        setField(term480, term480.getClass(), "subplotInfo", term502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.axis.Axis");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[4] = Class.forName("org.jfree.chart.util.RectangleEdge");
        argTypes[5] = Class.forName("org.jfree.chart.axis.AxisState");
        argTypes[6] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[7];
        args[0] = "NRdvgJlhkX";
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term460;
        args[5] = term473;
        args[6] = term480;
        try {
            callMethod(klass, "drawLabel", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


