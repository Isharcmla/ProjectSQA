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

public class XYPlot_zoomRangeAxes_1103646421438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1465;
     Object term1467;

    public XYPlot_zoomRangeAxes_1103646421438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1465 = new Double(0.5873228247510078);
        ArrayList term1480 = new ArrayList();
        ArrayList term1485 = new ArrayList();
        ArrayList term1489 = new ArrayList();
        term1467 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1468 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1469 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1474 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1475 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1484 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1469, term1469.getClass(), "x", 0.0);
        setDoubleField(term1469, term1469.getClass(), "y", 0.0);
        setDoubleField(term1469, term1469.getClass(), "width", 0.0);
        setDoubleField(term1469, term1469.getClass(), "height", 0.0);
        setField(term1468, term1468.getClass(), "chartArea", term1469);
        setField(term1474, term1474.getClass(), "owner", term1468);
        setField(term1474, term1474.getClass(), "plotArea", null);
        setDoubleField(term1475, term1475.getClass(), "x", 0.0);
        setDoubleField(term1475, term1475.getClass(), "y", 0.0);
        setDoubleField(term1475, term1475.getClass(), "width", 0.0);
        setDoubleField(term1475, term1475.getClass(), "height", 0.0);
        setField(term1474, term1474.getClass(), "dataArea", term1475);
        setField(term1474, term1474.getClass(), "subplotInfo", term1480);
        setField(term1468, term1468.getClass(), "plotInfo", term1474);
        setField(term1484, term1484.getClass(), "entities", term1485);
        setField(term1468, term1468.getClass(), "entities", term1484);
        setField(term1468, term1468.getClass(), "renderingSource", null);
        setField(term1467, term1467.getClass(), "owner", term1468);
        setField(term1467, term1467.getClass(), "plotArea", null);
        setField(term1467, term1467.getClass(), "dataArea", null);
        setField(term1467, term1467.getClass(), "subplotInfo", term1489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term1465;
        args[1] = term1467;
        args[2] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


