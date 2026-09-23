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
import java.lang.Double;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class XYPlot_zoomRangeAxes_1364567739439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1493;
     Object term1495;
     Object term1521;

    public XYPlot_zoomRangeAxes_1364567739439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1493 = new Double(0.8823181080774973);
        ArrayList term1508 = new ArrayList();
        ArrayList term1513 = new ArrayList();
        ArrayList term1517 = new ArrayList();
        term1495 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1496 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1497 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1502 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1503 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1512 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1497, term1497.getClass(), "x", 0.0);
        setDoubleField(term1497, term1497.getClass(), "y", 0.0);
        setDoubleField(term1497, term1497.getClass(), "width", 0.0);
        setDoubleField(term1497, term1497.getClass(), "height", 0.0);
        setField(term1496, term1496.getClass(), "chartArea", term1497);
        setField(term1502, term1502.getClass(), "owner", term1496);
        setField(term1502, term1502.getClass(), "plotArea", null);
        setDoubleField(term1503, term1503.getClass(), "x", 0.0);
        setDoubleField(term1503, term1503.getClass(), "y", 0.0);
        setDoubleField(term1503, term1503.getClass(), "width", 0.0);
        setDoubleField(term1503, term1503.getClass(), "height", 0.0);
        setField(term1502, term1502.getClass(), "dataArea", term1503);
        setField(term1502, term1502.getClass(), "subplotInfo", term1508);
        setField(term1496, term1496.getClass(), "plotInfo", term1502);
        setField(term1512, term1512.getClass(), "entities", term1513);
        setField(term1496, term1496.getClass(), "entities", term1512);
        setField(term1496, term1496.getClass(), "renderingSource", null);
        setField(term1495, term1495.getClass(), "owner", term1496);
        setField(term1495, term1495.getClass(), "plotArea", null);
        setField(term1495, term1495.getClass(), "dataArea", null);
        setField(term1495, term1495.getClass(), "subplotInfo", term1517);
        term1521 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term1493;
        args[1] = term1495;
        args[2] = null;
        args[3] = term1521;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


