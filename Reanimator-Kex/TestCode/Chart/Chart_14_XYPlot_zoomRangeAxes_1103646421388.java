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

public class XYPlot_zoomRangeAxes_1103646421388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1391;
     Object term1393;

    public XYPlot_zoomRangeAxes_1103646421388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1391 = new Double(0.6397214730945112);
        ArrayList term1406 = new ArrayList();
        ArrayList term1411 = new ArrayList();
        ArrayList term1415 = new ArrayList();
        term1393 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1394 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1395 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1400 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1401 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1410 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1395, term1395.getClass(), "x", 0.0);
        setDoubleField(term1395, term1395.getClass(), "y", 0.0);
        setDoubleField(term1395, term1395.getClass(), "width", 0.0);
        setDoubleField(term1395, term1395.getClass(), "height", 0.0);
        setField(term1394, term1394.getClass(), "chartArea", term1395);
        setField(term1400, term1400.getClass(), "owner", term1394);
        setField(term1400, term1400.getClass(), "plotArea", null);
        setDoubleField(term1401, term1401.getClass(), "x", 0.0);
        setDoubleField(term1401, term1401.getClass(), "y", 0.0);
        setDoubleField(term1401, term1401.getClass(), "width", 0.0);
        setDoubleField(term1401, term1401.getClass(), "height", 0.0);
        setField(term1400, term1400.getClass(), "dataArea", term1401);
        setField(term1400, term1400.getClass(), "subplotInfo", term1406);
        setField(term1394, term1394.getClass(), "plotInfo", term1400);
        setField(term1410, term1410.getClass(), "entities", term1411);
        setField(term1394, term1394.getClass(), "entities", term1410);
        setField(term1393, term1393.getClass(), "owner", term1394);
        setField(term1393, term1393.getClass(), "plotArea", null);
        setField(term1393, term1393.getClass(), "dataArea", null);
        setField(term1393, term1393.getClass(), "subplotInfo", term1415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term1391;
        args[1] = term1393;
        args[2] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


