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

public class XYPlot_zoomDomainAxes_1097945928435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377;
     Object term1379;

    public XYPlot_zoomDomainAxes_1097945928435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377 = new Double(0.8878841294187743);
        ArrayList term1392 = new ArrayList();
        ArrayList term1397 = new ArrayList();
        ArrayList term1401 = new ArrayList();
        term1379 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1380 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1381 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1386 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1387 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1396 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1381, term1381.getClass(), "x", 0.0);
        setDoubleField(term1381, term1381.getClass(), "y", 0.0);
        setDoubleField(term1381, term1381.getClass(), "width", 0.0);
        setDoubleField(term1381, term1381.getClass(), "height", 0.0);
        setField(term1380, term1380.getClass(), "chartArea", term1381);
        setField(term1386, term1386.getClass(), "owner", term1380);
        setField(term1386, term1386.getClass(), "plotArea", null);
        setDoubleField(term1387, term1387.getClass(), "x", 0.0);
        setDoubleField(term1387, term1387.getClass(), "y", 0.0);
        setDoubleField(term1387, term1387.getClass(), "width", 0.0);
        setDoubleField(term1387, term1387.getClass(), "height", 0.0);
        setField(term1386, term1386.getClass(), "dataArea", term1387);
        setField(term1386, term1386.getClass(), "subplotInfo", term1392);
        setField(term1380, term1380.getClass(), "plotInfo", term1386);
        setField(term1396, term1396.getClass(), "entities", term1397);
        setField(term1380, term1380.getClass(), "entities", term1396);
        setField(term1380, term1380.getClass(), "renderingSource", null);
        setField(term1379, term1379.getClass(), "owner", term1380);
        setField(term1379, term1379.getClass(), "plotArea", null);
        setField(term1379, term1379.getClass(), "dataArea", null);
        setField(term1379, term1379.getClass(), "subplotInfo", term1401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term1377;
        args[1] = term1379;
        args[2] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


