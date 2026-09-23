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

public class XYPlot_zoomDomainAxes_1358867246386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1331;
     Object term1333;
     Object term1359;

    public XYPlot_zoomDomainAxes_1358867246386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1331 = new Double(0.22651340641904605);
        ArrayList term1346 = new ArrayList();
        ArrayList term1351 = new ArrayList();
        ArrayList term1355 = new ArrayList();
        term1333 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1334 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1335 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1340 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1341 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1350 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1335, term1335.getClass(), "x", 0.0);
        setDoubleField(term1335, term1335.getClass(), "y", 0.0);
        setDoubleField(term1335, term1335.getClass(), "width", 0.0);
        setDoubleField(term1335, term1335.getClass(), "height", 0.0);
        setField(term1334, term1334.getClass(), "chartArea", term1335);
        setField(term1340, term1340.getClass(), "owner", term1334);
        setField(term1340, term1340.getClass(), "plotArea", null);
        setDoubleField(term1341, term1341.getClass(), "x", 0.0);
        setDoubleField(term1341, term1341.getClass(), "y", 0.0);
        setDoubleField(term1341, term1341.getClass(), "width", 0.0);
        setDoubleField(term1341, term1341.getClass(), "height", 0.0);
        setField(term1340, term1340.getClass(), "dataArea", term1341);
        setField(term1340, term1340.getClass(), "subplotInfo", term1346);
        setField(term1334, term1334.getClass(), "plotInfo", term1340);
        setField(term1350, term1350.getClass(), "entities", term1351);
        setField(term1334, term1334.getClass(), "entities", term1350);
        setField(term1333, term1333.getClass(), "owner", term1334);
        setField(term1333, term1333.getClass(), "plotArea", null);
        setField(term1333, term1333.getClass(), "dataArea", null);
        setField(term1333, term1333.getClass(), "subplotInfo", term1355);
        term1359 = new Boolean(true);
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
        args[0] = term1331;
        args[1] = term1333;
        args[2] = null;
        args[3] = term1359;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


