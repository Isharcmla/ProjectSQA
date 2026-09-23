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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class PiePlot_draw_1381178752212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;
     Object term234;

    public PiePlot_draw_1381178752212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term229 = new HashMap();
        term228 = newInstance(Class.forName("org.jfree.chart.plot.PlotState"));
        setField(term228, term228.getClass(), "sharedAxisStates", term229);
        ArrayList term247 = new ArrayList();
        ArrayList term252 = new ArrayList();
        ArrayList term256 = new ArrayList();
        term234 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term235 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term236 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term241 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term242 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term251 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term236, term236.getClass(), "x", 0.0);
        setDoubleField(term236, term236.getClass(), "y", 0.0);
        setDoubleField(term236, term236.getClass(), "width", 0.0);
        setDoubleField(term236, term236.getClass(), "height", 0.0);
        setField(term235, term235.getClass(), "chartArea", term236);
        setField(term241, term241.getClass(), "owner", term235);
        setField(term241, term241.getClass(), "plotArea", null);
        setDoubleField(term242, term242.getClass(), "x", 0.0);
        setDoubleField(term242, term242.getClass(), "y", 0.0);
        setDoubleField(term242, term242.getClass(), "width", 0.0);
        setDoubleField(term242, term242.getClass(), "height", 0.0);
        setField(term241, term241.getClass(), "dataArea", term242);
        setField(term241, term241.getClass(), "subplotInfo", term247);
        setField(term235, term235.getClass(), "plotInfo", term241);
        setField(term251, term251.getClass(), "entities", term252);
        setField(term235, term235.getClass(), "entities", term251);
        setField(term234, term234.getClass(), "owner", term235);
        setField(term234, term234.getClass(), "plotArea", null);
        setField(term234, term234.getClass(), "dataArea", null);
        setField(term234, term234.getClass(), "subplotInfo", term256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotState");
        argTypes[4] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term228;
        args[4] = term234;
        try {
            callMethod(klass, "draw", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


