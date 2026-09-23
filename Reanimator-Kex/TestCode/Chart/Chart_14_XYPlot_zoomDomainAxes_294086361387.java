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

public class XYPlot_zoomDomainAxes_294086361387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;
     Object term1363;
     Object term1365;

    public XYPlot_zoomDomainAxes_294086361387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1361 = new Double(0.8878841294187743);
        term1363 = new Double(0.6588948704887806);
        ArrayList term1378 = new ArrayList();
        ArrayList term1383 = new ArrayList();
        ArrayList term1387 = new ArrayList();
        term1365 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1366 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1367 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1372 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1373 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1382 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1367, term1367.getClass(), "x", 0.0);
        setDoubleField(term1367, term1367.getClass(), "y", 0.0);
        setDoubleField(term1367, term1367.getClass(), "width", 0.0);
        setDoubleField(term1367, term1367.getClass(), "height", 0.0);
        setField(term1366, term1366.getClass(), "chartArea", term1367);
        setField(term1372, term1372.getClass(), "owner", term1366);
        setField(term1372, term1372.getClass(), "plotArea", null);
        setDoubleField(term1373, term1373.getClass(), "x", 0.0);
        setDoubleField(term1373, term1373.getClass(), "y", 0.0);
        setDoubleField(term1373, term1373.getClass(), "width", 0.0);
        setDoubleField(term1373, term1373.getClass(), "height", 0.0);
        setField(term1372, term1372.getClass(), "dataArea", term1373);
        setField(term1372, term1372.getClass(), "subplotInfo", term1378);
        setField(term1366, term1366.getClass(), "plotInfo", term1372);
        setField(term1382, term1382.getClass(), "entities", term1383);
        setField(term1366, term1366.getClass(), "entities", term1382);
        setField(term1365, term1365.getClass(), "owner", term1366);
        setField(term1365, term1365.getClass(), "plotArea", null);
        setField(term1365, term1365.getClass(), "dataArea", null);
        setField(term1365, term1365.getClass(), "subplotInfo", term1387);
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
        args[0] = term1361;
        args[1] = term1363;
        args[2] = term1365;
        args[3] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


