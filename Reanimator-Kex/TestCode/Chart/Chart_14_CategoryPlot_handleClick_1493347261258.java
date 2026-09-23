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

public class CategoryPlot_handleClick_1493347261258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2314;
     Object term2316;
     Object term2318;

    public CategoryPlot_handleClick_1493347261258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2314 = new Integer(1135664017);
        term2316 = new Integer(590364439);
        ArrayList term2331 = new ArrayList();
        ArrayList term2336 = new ArrayList();
        ArrayList term2340 = new ArrayList();
        term2318 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2319 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term2320 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term2325 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2326 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term2335 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term2320, term2320.getClass(), "x", 0.0);
        setDoubleField(term2320, term2320.getClass(), "y", 0.0);
        setDoubleField(term2320, term2320.getClass(), "width", 0.0);
        setDoubleField(term2320, term2320.getClass(), "height", 0.0);
        setField(term2319, term2319.getClass(), "chartArea", term2320);
        setField(term2325, term2325.getClass(), "owner", term2319);
        setField(term2325, term2325.getClass(), "plotArea", null);
        setDoubleField(term2326, term2326.getClass(), "x", 0.0);
        setDoubleField(term2326, term2326.getClass(), "y", 0.0);
        setDoubleField(term2326, term2326.getClass(), "width", 0.0);
        setDoubleField(term2326, term2326.getClass(), "height", 0.0);
        setField(term2325, term2325.getClass(), "dataArea", term2326);
        setField(term2325, term2325.getClass(), "subplotInfo", term2331);
        setField(term2319, term2319.getClass(), "plotInfo", term2325);
        setField(term2335, term2335.getClass(), "entities", term2336);
        setField(term2319, term2319.getClass(), "entities", term2335);
        setField(term2318, term2318.getClass(), "owner", term2319);
        setField(term2318, term2318.getClass(), "plotArea", null);
        setField(term2318, term2318.getClass(), "dataArea", null);
        setField(term2318, term2318.getClass(), "subplotInfo", term2340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = term2314;
        args[1] = term2316;
        args[2] = term2318;
        try {
            callMethod(klass, "handleClick", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


