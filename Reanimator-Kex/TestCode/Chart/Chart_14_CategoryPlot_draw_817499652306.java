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

public class CategoryPlot_draw_817499652306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3197;
     Object term3203;

    public CategoryPlot_draw_817499652306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3198 = new HashMap();
        term3197 = newInstance(Class.forName("org.jfree.chart.plot.PlotState"));
        setField(term3197, term3197.getClass(), "sharedAxisStates", term3198);
        ArrayList term3216 = new ArrayList();
        ArrayList term3221 = new ArrayList();
        ArrayList term3225 = new ArrayList();
        term3203 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3204 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3205 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3210 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3211 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3220 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3205, term3205.getClass(), "x", 0.0);
        setDoubleField(term3205, term3205.getClass(), "y", 0.0);
        setDoubleField(term3205, term3205.getClass(), "width", 0.0);
        setDoubleField(term3205, term3205.getClass(), "height", 0.0);
        setField(term3204, term3204.getClass(), "chartArea", term3205);
        setField(term3210, term3210.getClass(), "owner", term3204);
        setField(term3210, term3210.getClass(), "plotArea", null);
        setDoubleField(term3211, term3211.getClass(), "x", 0.0);
        setDoubleField(term3211, term3211.getClass(), "y", 0.0);
        setDoubleField(term3211, term3211.getClass(), "width", 0.0);
        setDoubleField(term3211, term3211.getClass(), "height", 0.0);
        setField(term3210, term3210.getClass(), "dataArea", term3211);
        setField(term3210, term3210.getClass(), "subplotInfo", term3216);
        setField(term3204, term3204.getClass(), "plotInfo", term3210);
        setField(term3220, term3220.getClass(), "entities", term3221);
        setField(term3204, term3204.getClass(), "entities", term3220);
        setField(term3203, term3203.getClass(), "owner", term3204);
        setField(term3203, term3203.getClass(), "plotArea", null);
        setField(term3203, term3203.getClass(), "dataArea", null);
        setField(term3203, term3203.getClass(), "subplotInfo", term3225);
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
        args[3] = term3197;
        args[4] = term3203;
        try {
            callMethod(klass, "draw", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


