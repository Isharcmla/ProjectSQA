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

public class XYPlot_zoomDomainAxes_1358867246436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1405;
     Object term1407;
     Object term1433;

    public XYPlot_zoomDomainAxes_1358867246436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1405 = new Double(0.6588948704887806);
        ArrayList term1420 = new ArrayList();
        ArrayList term1425 = new ArrayList();
        ArrayList term1429 = new ArrayList();
        term1407 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1408 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1409 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1414 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1415 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1424 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1409, term1409.getClass(), "x", 0.0);
        setDoubleField(term1409, term1409.getClass(), "y", 0.0);
        setDoubleField(term1409, term1409.getClass(), "width", 0.0);
        setDoubleField(term1409, term1409.getClass(), "height", 0.0);
        setField(term1408, term1408.getClass(), "chartArea", term1409);
        setField(term1414, term1414.getClass(), "owner", term1408);
        setField(term1414, term1414.getClass(), "plotArea", null);
        setDoubleField(term1415, term1415.getClass(), "x", 0.0);
        setDoubleField(term1415, term1415.getClass(), "y", 0.0);
        setDoubleField(term1415, term1415.getClass(), "width", 0.0);
        setDoubleField(term1415, term1415.getClass(), "height", 0.0);
        setField(term1414, term1414.getClass(), "dataArea", term1415);
        setField(term1414, term1414.getClass(), "subplotInfo", term1420);
        setField(term1408, term1408.getClass(), "plotInfo", term1414);
        setField(term1424, term1424.getClass(), "entities", term1425);
        setField(term1408, term1408.getClass(), "entities", term1424);
        setField(term1408, term1408.getClass(), "renderingSource", null);
        setField(term1407, term1407.getClass(), "owner", term1408);
        setField(term1407, term1407.getClass(), "plotArea", null);
        setField(term1407, term1407.getClass(), "dataArea", null);
        setField(term1407, term1407.getClass(), "subplotInfo", term1429);
        term1433 = new Boolean(false);
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
        args[0] = term1405;
        args[1] = term1407;
        args[2] = null;
        args[3] = term1433;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


