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

public class XYPlot_zoomRangeAxes_299786854440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1523;
     Object term1525;
     Object term1527;

    public XYPlot_zoomRangeAxes_299786854440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1523 = new Double(0.2192450926212024);
        term1525 = new Double(0.7591353014991907);
        ArrayList term1540 = new ArrayList();
        ArrayList term1545 = new ArrayList();
        ArrayList term1549 = new ArrayList();
        term1527 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1528 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1529 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1534 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1535 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1544 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1529, term1529.getClass(), "x", 0.0);
        setDoubleField(term1529, term1529.getClass(), "y", 0.0);
        setDoubleField(term1529, term1529.getClass(), "width", 0.0);
        setDoubleField(term1529, term1529.getClass(), "height", 0.0);
        setField(term1528, term1528.getClass(), "chartArea", term1529);
        setField(term1534, term1534.getClass(), "owner", term1528);
        setField(term1534, term1534.getClass(), "plotArea", null);
        setDoubleField(term1535, term1535.getClass(), "x", 0.0);
        setDoubleField(term1535, term1535.getClass(), "y", 0.0);
        setDoubleField(term1535, term1535.getClass(), "width", 0.0);
        setDoubleField(term1535, term1535.getClass(), "height", 0.0);
        setField(term1534, term1534.getClass(), "dataArea", term1535);
        setField(term1534, term1534.getClass(), "subplotInfo", term1540);
        setField(term1528, term1528.getClass(), "plotInfo", term1534);
        setField(term1544, term1544.getClass(), "entities", term1545);
        setField(term1528, term1528.getClass(), "entities", term1544);
        setField(term1528, term1528.getClass(), "renderingSource", null);
        setField(term1527, term1527.getClass(), "owner", term1528);
        setField(term1527, term1527.getClass(), "plotArea", null);
        setField(term1527, term1527.getClass(), "dataArea", null);
        setField(term1527, term1527.getClass(), "subplotInfo", term1549);
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
        args[0] = term1523;
        args[1] = term1525;
        args[2] = term1527;
        args[3] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


