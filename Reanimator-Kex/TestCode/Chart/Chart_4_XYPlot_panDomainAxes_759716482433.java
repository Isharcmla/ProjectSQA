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

public class XYPlot_panDomainAxes_759716482433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321;
     Object term1323;

    public XYPlot_panDomainAxes_759716482433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1321 = new Double(0.3202192021706908);
        ArrayList term1336 = new ArrayList();
        ArrayList term1341 = new ArrayList();
        ArrayList term1345 = new ArrayList();
        term1323 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1324 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1325 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1330 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1331 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1340 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1325, term1325.getClass(), "x", 0.0);
        setDoubleField(term1325, term1325.getClass(), "y", 0.0);
        setDoubleField(term1325, term1325.getClass(), "width", 0.0);
        setDoubleField(term1325, term1325.getClass(), "height", 0.0);
        setField(term1324, term1324.getClass(), "chartArea", term1325);
        setField(term1330, term1330.getClass(), "owner", term1324);
        setField(term1330, term1330.getClass(), "plotArea", null);
        setDoubleField(term1331, term1331.getClass(), "x", 0.0);
        setDoubleField(term1331, term1331.getClass(), "y", 0.0);
        setDoubleField(term1331, term1331.getClass(), "width", 0.0);
        setDoubleField(term1331, term1331.getClass(), "height", 0.0);
        setField(term1330, term1330.getClass(), "dataArea", term1331);
        setField(term1330, term1330.getClass(), "subplotInfo", term1336);
        setField(term1324, term1324.getClass(), "plotInfo", term1330);
        setField(term1340, term1340.getClass(), "entities", term1341);
        setField(term1324, term1324.getClass(), "entities", term1340);
        setField(term1324, term1324.getClass(), "renderingSource", null);
        setField(term1323, term1323.getClass(), "owner", term1324);
        setField(term1323, term1323.getClass(), "plotArea", null);
        setField(term1323, term1323.getClass(), "dataArea", null);
        setField(term1323, term1323.getClass(), "subplotInfo", term1345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term1321;
        args[1] = term1323;
        args[2] = null;
        try {
            callMethod(klass, "panDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


