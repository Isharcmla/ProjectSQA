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

public class XYPlot_handleClick_663512838349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1058;
     Object term1060;
     Object term1062;

    public XYPlot_handleClick_663512838349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1058 = new Integer(-817164822);
        term1060 = new Integer(-1016503459);
        ArrayList term1075 = new ArrayList();
        ArrayList term1080 = new ArrayList();
        ArrayList term1084 = new ArrayList();
        term1062 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1063 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1064 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1069 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1070 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1079 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1064, term1064.getClass(), "x", 0.0);
        setDoubleField(term1064, term1064.getClass(), "y", 0.0);
        setDoubleField(term1064, term1064.getClass(), "width", 0.0);
        setDoubleField(term1064, term1064.getClass(), "height", 0.0);
        setField(term1063, term1063.getClass(), "chartArea", term1064);
        setField(term1069, term1069.getClass(), "owner", term1063);
        setField(term1069, term1069.getClass(), "plotArea", null);
        setDoubleField(term1070, term1070.getClass(), "x", 0.0);
        setDoubleField(term1070, term1070.getClass(), "y", 0.0);
        setDoubleField(term1070, term1070.getClass(), "width", 0.0);
        setDoubleField(term1070, term1070.getClass(), "height", 0.0);
        setField(term1069, term1069.getClass(), "dataArea", term1070);
        setField(term1069, term1069.getClass(), "subplotInfo", term1075);
        setField(term1063, term1063.getClass(), "plotInfo", term1069);
        setField(term1079, term1079.getClass(), "entities", term1080);
        setField(term1063, term1063.getClass(), "entities", term1079);
        setField(term1062, term1062.getClass(), "owner", term1063);
        setField(term1062, term1062.getClass(), "plotArea", null);
        setField(term1062, term1062.getClass(), "dataArea", null);
        setField(term1062, term1062.getClass(), "subplotInfo", term1084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = term1058;
        args[1] = term1060;
        args[2] = term1062;
        try {
            callMethod(klass, "handleClick", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


