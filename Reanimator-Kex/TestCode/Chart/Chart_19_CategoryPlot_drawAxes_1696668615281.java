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

public class CategoryPlot_drawAxes_1696668615281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2956;

    public CategoryPlot_drawAxes_1696668615281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2969 = new ArrayList();
        ArrayList term2974 = new ArrayList();
        ArrayList term2978 = new ArrayList();
        term2956 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2957 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term2958 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term2963 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2964 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term2973 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term2958, term2958.getClass(), "x", 0.0);
        setDoubleField(term2958, term2958.getClass(), "y", 0.0);
        setDoubleField(term2958, term2958.getClass(), "width", 0.0);
        setDoubleField(term2958, term2958.getClass(), "height", 0.0);
        setField(term2957, term2957.getClass(), "chartArea", term2958);
        setField(term2963, term2963.getClass(), "owner", term2957);
        setField(term2963, term2963.getClass(), "plotArea", null);
        setDoubleField(term2964, term2964.getClass(), "x", 0.0);
        setDoubleField(term2964, term2964.getClass(), "y", 0.0);
        setDoubleField(term2964, term2964.getClass(), "width", 0.0);
        setDoubleField(term2964, term2964.getClass(), "height", 0.0);
        setField(term2963, term2963.getClass(), "dataArea", term2964);
        setField(term2963, term2963.getClass(), "subplotInfo", term2969);
        setField(term2957, term2957.getClass(), "plotInfo", term2963);
        setField(term2973, term2973.getClass(), "entities", term2974);
        setField(term2957, term2957.getClass(), "entities", term2973);
        setField(term2956, term2956.getClass(), "owner", term2957);
        setField(term2956, term2956.getClass(), "plotArea", null);
        setField(term2956, term2956.getClass(), "dataArea", null);
        setField(term2956, term2956.getClass(), "subplotInfo", term2978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term2956;
        try {
            callMethod(klass, "drawAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


