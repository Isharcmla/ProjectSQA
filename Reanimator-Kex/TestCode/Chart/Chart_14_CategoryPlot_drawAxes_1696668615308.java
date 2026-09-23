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

public class CategoryPlot_drawAxes_1696668615308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3229;

    public CategoryPlot_drawAxes_1696668615308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3242 = new ArrayList();
        ArrayList term3247 = new ArrayList();
        ArrayList term3251 = new ArrayList();
        term3229 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3230 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3231 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3236 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3237 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3246 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3231, term3231.getClass(), "x", 0.0);
        setDoubleField(term3231, term3231.getClass(), "y", 0.0);
        setDoubleField(term3231, term3231.getClass(), "width", 0.0);
        setDoubleField(term3231, term3231.getClass(), "height", 0.0);
        setField(term3230, term3230.getClass(), "chartArea", term3231);
        setField(term3236, term3236.getClass(), "owner", term3230);
        setField(term3236, term3236.getClass(), "plotArea", null);
        setDoubleField(term3237, term3237.getClass(), "x", 0.0);
        setDoubleField(term3237, term3237.getClass(), "y", 0.0);
        setDoubleField(term3237, term3237.getClass(), "width", 0.0);
        setDoubleField(term3237, term3237.getClass(), "height", 0.0);
        setField(term3236, term3236.getClass(), "dataArea", term3237);
        setField(term3236, term3236.getClass(), "subplotInfo", term3242);
        setField(term3230, term3230.getClass(), "plotInfo", term3236);
        setField(term3246, term3246.getClass(), "entities", term3247);
        setField(term3230, term3230.getClass(), "entities", term3246);
        setField(term3229, term3229.getClass(), "owner", term3230);
        setField(term3229, term3229.getClass(), "plotArea", null);
        setField(term3229, term3229.getClass(), "dataArea", null);
        setField(term3229, term3229.getClass(), "subplotInfo", term3251);
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
        args[3] = term3229;
        try {
            callMethod(klass, "drawAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


