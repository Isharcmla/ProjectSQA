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

public class CategoryPlot_render_657780076282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2982;
     Object term2984;

    public CategoryPlot_render_657780076282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2982 = new Integer(-14890619);
        ArrayList term2997 = new ArrayList();
        ArrayList term3002 = new ArrayList();
        ArrayList term3006 = new ArrayList();
        term2984 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2985 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term2986 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term2991 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term2992 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3001 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term2986, term2986.getClass(), "x", 0.0);
        setDoubleField(term2986, term2986.getClass(), "y", 0.0);
        setDoubleField(term2986, term2986.getClass(), "width", 0.0);
        setDoubleField(term2986, term2986.getClass(), "height", 0.0);
        setField(term2985, term2985.getClass(), "chartArea", term2986);
        setField(term2991, term2991.getClass(), "owner", term2985);
        setField(term2991, term2991.getClass(), "plotArea", null);
        setDoubleField(term2992, term2992.getClass(), "x", 0.0);
        setDoubleField(term2992, term2992.getClass(), "y", 0.0);
        setDoubleField(term2992, term2992.getClass(), "width", 0.0);
        setDoubleField(term2992, term2992.getClass(), "height", 0.0);
        setField(term2991, term2991.getClass(), "dataArea", term2992);
        setField(term2991, term2991.getClass(), "subplotInfo", term2997);
        setField(term2985, term2985.getClass(), "plotInfo", term2991);
        setField(term3001, term3001.getClass(), "entities", term3002);
        setField(term2985, term2985.getClass(), "entities", term3001);
        setField(term2984, term2984.getClass(), "owner", term2985);
        setField(term2984, term2984.getClass(), "plotArea", null);
        setField(term2984, term2984.getClass(), "dataArea", null);
        setField(term2984, term2984.getClass(), "subplotInfo", term3006);
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
        args[2] = term2982;
        args[3] = term2984;
        try {
            callMethod(klass, "render", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


