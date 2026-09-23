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

public class CategoryPlot_draw_817499652279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2924;
     Object term2930;

    public CategoryPlot_draw_817499652279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2925 = new HashMap();
        term2924 = newInstance(Class.forName("org.jfree.chart.plot.PlotState"));
        setField(term2924, term2924.getClass(), "sharedAxisStates", term2925);
        ArrayList term2943 = new ArrayList();
        ArrayList term2948 = new ArrayList();
        ArrayList term2952 = new ArrayList();
        term2930 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2931 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term2932 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term2937 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2938 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term2947 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term2932, term2932.getClass(), "x", 0.0);
        setDoubleField(term2932, term2932.getClass(), "y", 0.0);
        setDoubleField(term2932, term2932.getClass(), "width", 0.0);
        setDoubleField(term2932, term2932.getClass(), "height", 0.0);
        setField(term2931, term2931.getClass(), "chartArea", term2932);
        setField(term2937, term2937.getClass(), "owner", term2931);
        setField(term2937, term2937.getClass(), "plotArea", null);
        setDoubleField(term2938, term2938.getClass(), "x", 0.0);
        setDoubleField(term2938, term2938.getClass(), "y", 0.0);
        setDoubleField(term2938, term2938.getClass(), "width", 0.0);
        setDoubleField(term2938, term2938.getClass(), "height", 0.0);
        setField(term2937, term2937.getClass(), "dataArea", term2938);
        setField(term2937, term2937.getClass(), "subplotInfo", term2943);
        setField(term2931, term2931.getClass(), "plotInfo", term2937);
        setField(term2947, term2947.getClass(), "entities", term2948);
        setField(term2931, term2931.getClass(), "entities", term2947);
        setField(term2930, term2930.getClass(), "owner", term2931);
        setField(term2930, term2930.getClass(), "plotArea", null);
        setField(term2930, term2930.getClass(), "dataArea", null);
        setField(term2930, term2930.getClass(), "subplotInfo", term2952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
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
        args[3] = term2924;
        args[4] = term2930;
        try {
            callMethod(klass, "draw", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


