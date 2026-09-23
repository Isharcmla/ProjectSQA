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

public class XYPlot_panRangeAxes_905174495434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;
     Object term1351;

    public XYPlot_panRangeAxes_905174495434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1349 = new Double(0.22651340641904605);
        ArrayList term1364 = new ArrayList();
        ArrayList term1369 = new ArrayList();
        ArrayList term1373 = new ArrayList();
        term1351 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1352 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1353 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1358 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1359 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1368 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1353, term1353.getClass(), "x", 0.0);
        setDoubleField(term1353, term1353.getClass(), "y", 0.0);
        setDoubleField(term1353, term1353.getClass(), "width", 0.0);
        setDoubleField(term1353, term1353.getClass(), "height", 0.0);
        setField(term1352, term1352.getClass(), "chartArea", term1353);
        setField(term1358, term1358.getClass(), "owner", term1352);
        setField(term1358, term1358.getClass(), "plotArea", null);
        setDoubleField(term1359, term1359.getClass(), "x", 0.0);
        setDoubleField(term1359, term1359.getClass(), "y", 0.0);
        setDoubleField(term1359, term1359.getClass(), "width", 0.0);
        setDoubleField(term1359, term1359.getClass(), "height", 0.0);
        setField(term1358, term1358.getClass(), "dataArea", term1359);
        setField(term1358, term1358.getClass(), "subplotInfo", term1364);
        setField(term1352, term1352.getClass(), "plotInfo", term1358);
        setField(term1368, term1368.getClass(), "entities", term1369);
        setField(term1352, term1352.getClass(), "entities", term1368);
        setField(term1352, term1352.getClass(), "renderingSource", null);
        setField(term1351, term1351.getClass(), "owner", term1352);
        setField(term1351, term1351.getClass(), "plotArea", null);
        setField(term1351, term1351.getClass(), "dataArea", null);
        setField(term1351, term1351.getClass(), "subplotInfo", term1373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term1349;
        args[1] = term1351;
        args[2] = null;
        try {
            callMethod(klass, "panRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


