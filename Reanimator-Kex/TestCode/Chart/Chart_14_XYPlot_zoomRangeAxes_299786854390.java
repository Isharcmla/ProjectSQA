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

public class XYPlot_zoomRangeAxes_299786854390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1449;
     Object term1451;
     Object term1453;

    public XYPlot_zoomRangeAxes_299786854390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1449 = new Double(0.5873228247510078);
        term1451 = new Double(0.8823181080774973);
        ArrayList term1466 = new ArrayList();
        ArrayList term1471 = new ArrayList();
        ArrayList term1475 = new ArrayList();
        term1453 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1454 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1455 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1460 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1461 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1470 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1455, term1455.getClass(), "x", 0.0);
        setDoubleField(term1455, term1455.getClass(), "y", 0.0);
        setDoubleField(term1455, term1455.getClass(), "width", 0.0);
        setDoubleField(term1455, term1455.getClass(), "height", 0.0);
        setField(term1454, term1454.getClass(), "chartArea", term1455);
        setField(term1460, term1460.getClass(), "owner", term1454);
        setField(term1460, term1460.getClass(), "plotArea", null);
        setDoubleField(term1461, term1461.getClass(), "x", 0.0);
        setDoubleField(term1461, term1461.getClass(), "y", 0.0);
        setDoubleField(term1461, term1461.getClass(), "width", 0.0);
        setDoubleField(term1461, term1461.getClass(), "height", 0.0);
        setField(term1460, term1460.getClass(), "dataArea", term1461);
        setField(term1460, term1460.getClass(), "subplotInfo", term1466);
        setField(term1454, term1454.getClass(), "plotInfo", term1460);
        setField(term1470, term1470.getClass(), "entities", term1471);
        setField(term1454, term1454.getClass(), "entities", term1470);
        setField(term1453, term1453.getClass(), "owner", term1454);
        setField(term1453, term1453.getClass(), "plotArea", null);
        setField(term1453, term1453.getClass(), "dataArea", null);
        setField(term1453, term1453.getClass(), "subplotInfo", term1475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[3] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[4];
        args[0] = term1449;
        args[1] = term1451;
        args[2] = term1453;
        args[3] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


