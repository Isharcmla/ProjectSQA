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

public class CategoryPlot_render_657780076309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3255;
     Object term3257;

    public CategoryPlot_render_657780076309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3255 = new Integer(1596070772);
        ArrayList term3270 = new ArrayList();
        ArrayList term3275 = new ArrayList();
        ArrayList term3279 = new ArrayList();
        term3257 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3258 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3259 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3264 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3265 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3274 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3259, term3259.getClass(), "x", 0.0);
        setDoubleField(term3259, term3259.getClass(), "y", 0.0);
        setDoubleField(term3259, term3259.getClass(), "width", 0.0);
        setDoubleField(term3259, term3259.getClass(), "height", 0.0);
        setField(term3258, term3258.getClass(), "chartArea", term3259);
        setField(term3264, term3264.getClass(), "owner", term3258);
        setField(term3264, term3264.getClass(), "plotArea", null);
        setDoubleField(term3265, term3265.getClass(), "x", 0.0);
        setDoubleField(term3265, term3265.getClass(), "y", 0.0);
        setDoubleField(term3265, term3265.getClass(), "width", 0.0);
        setDoubleField(term3265, term3265.getClass(), "height", 0.0);
        setField(term3264, term3264.getClass(), "dataArea", term3265);
        setField(term3264, term3264.getClass(), "subplotInfo", term3270);
        setField(term3258, term3258.getClass(), "plotInfo", term3264);
        setField(term3274, term3274.getClass(), "entities", term3275);
        setField(term3258, term3258.getClass(), "entities", term3274);
        setField(term3257, term3257.getClass(), "owner", term3258);
        setField(term3257, term3257.getClass(), "plotArea", null);
        setField(term3257, term3257.getClass(), "dataArea", null);
        setField(term3257, term3257.getClass(), "subplotInfo", term3279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term3255;
        args[3] = term3257;
        try {
            callMethod(klass, "render", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


