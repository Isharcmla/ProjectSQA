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

public class XYPlot_zoomRangeAxes_1364567739389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;
     Object term1421;
     Object term1447;

    public XYPlot_zoomRangeAxes_1364567739389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1419 = new Double(0.25937345430928016);
        ArrayList term1434 = new ArrayList();
        ArrayList term1439 = new ArrayList();
        ArrayList term1443 = new ArrayList();
        term1421 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1422 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1423 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1428 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1429 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1438 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1423, term1423.getClass(), "x", 0.0);
        setDoubleField(term1423, term1423.getClass(), "y", 0.0);
        setDoubleField(term1423, term1423.getClass(), "width", 0.0);
        setDoubleField(term1423, term1423.getClass(), "height", 0.0);
        setField(term1422, term1422.getClass(), "chartArea", term1423);
        setField(term1428, term1428.getClass(), "owner", term1422);
        setField(term1428, term1428.getClass(), "plotArea", null);
        setDoubleField(term1429, term1429.getClass(), "x", 0.0);
        setDoubleField(term1429, term1429.getClass(), "y", 0.0);
        setDoubleField(term1429, term1429.getClass(), "width", 0.0);
        setDoubleField(term1429, term1429.getClass(), "height", 0.0);
        setField(term1428, term1428.getClass(), "dataArea", term1429);
        setField(term1428, term1428.getClass(), "subplotInfo", term1434);
        setField(term1422, term1422.getClass(), "plotInfo", term1428);
        setField(term1438, term1438.getClass(), "entities", term1439);
        setField(term1422, term1422.getClass(), "entities", term1438);
        setField(term1421, term1421.getClass(), "owner", term1422);
        setField(term1421, term1421.getClass(), "plotArea", null);
        setField(term1421, term1421.getClass(), "dataArea", null);
        setField(term1421, term1421.getClass(), "subplotInfo", term1443);
        term1447 = new Boolean(true);
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
        args[0] = term1419;
        args[1] = term1421;
        args[2] = null;
        args[3] = term1447;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


