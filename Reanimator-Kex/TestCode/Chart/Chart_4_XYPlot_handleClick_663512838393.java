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

public class XYPlot_handleClick_663512838393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1069;
     Object term1071;
     Object term1073;

    public XYPlot_handleClick_663512838393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1069 = new Integer(579005622);
        term1071 = new Integer(-14890619);
        ArrayList term1086 = new ArrayList();
        ArrayList term1091 = new ArrayList();
        ArrayList term1095 = new ArrayList();
        term1073 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1074 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1075 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1080 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1081 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1090 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1075, term1075.getClass(), "x", 0.0);
        setDoubleField(term1075, term1075.getClass(), "y", 0.0);
        setDoubleField(term1075, term1075.getClass(), "width", 0.0);
        setDoubleField(term1075, term1075.getClass(), "height", 0.0);
        setField(term1074, term1074.getClass(), "chartArea", term1075);
        setField(term1080, term1080.getClass(), "owner", term1074);
        setField(term1080, term1080.getClass(), "plotArea", null);
        setDoubleField(term1081, term1081.getClass(), "x", 0.0);
        setDoubleField(term1081, term1081.getClass(), "y", 0.0);
        setDoubleField(term1081, term1081.getClass(), "width", 0.0);
        setDoubleField(term1081, term1081.getClass(), "height", 0.0);
        setField(term1080, term1080.getClass(), "dataArea", term1081);
        setField(term1080, term1080.getClass(), "subplotInfo", term1086);
        setField(term1074, term1074.getClass(), "plotInfo", term1080);
        setField(term1090, term1090.getClass(), "entities", term1091);
        setField(term1074, term1074.getClass(), "entities", term1090);
        setField(term1074, term1074.getClass(), "renderingSource", null);
        setField(term1073, term1073.getClass(), "owner", term1074);
        setField(term1073, term1073.getClass(), "plotArea", null);
        setField(term1073, term1073.getClass(), "dataArea", null);
        setField(term1073, term1073.getClass(), "subplotInfo", term1095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = term1069;
        args[1] = term1071;
        args[2] = term1073;
        try {
            callMethod(klass, "handleClick", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


