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

public class XYPlot_zoomDomainAxes_294086361437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1435;
     Object term1437;
     Object term1439;

    public XYPlot_zoomDomainAxes_294086361437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1435 = new Double(0.6397214730945112);
        term1437 = new Double(0.25937345430928016);
        ArrayList term1452 = new ArrayList();
        ArrayList term1457 = new ArrayList();
        ArrayList term1461 = new ArrayList();
        term1439 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1440 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1441 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1446 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1447 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1456 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1441, term1441.getClass(), "x", 0.0);
        setDoubleField(term1441, term1441.getClass(), "y", 0.0);
        setDoubleField(term1441, term1441.getClass(), "width", 0.0);
        setDoubleField(term1441, term1441.getClass(), "height", 0.0);
        setField(term1440, term1440.getClass(), "chartArea", term1441);
        setField(term1446, term1446.getClass(), "owner", term1440);
        setField(term1446, term1446.getClass(), "plotArea", null);
        setDoubleField(term1447, term1447.getClass(), "x", 0.0);
        setDoubleField(term1447, term1447.getClass(), "y", 0.0);
        setDoubleField(term1447, term1447.getClass(), "width", 0.0);
        setDoubleField(term1447, term1447.getClass(), "height", 0.0);
        setField(term1446, term1446.getClass(), "dataArea", term1447);
        setField(term1446, term1446.getClass(), "subplotInfo", term1452);
        setField(term1440, term1440.getClass(), "plotInfo", term1446);
        setField(term1456, term1456.getClass(), "entities", term1457);
        setField(term1440, term1440.getClass(), "entities", term1456);
        setField(term1440, term1440.getClass(), "renderingSource", null);
        setField(term1439, term1439.getClass(), "owner", term1440);
        setField(term1439, term1439.getClass(), "plotArea", null);
        setField(term1439, term1439.getClass(), "dataArea", null);
        setField(term1439, term1439.getClass(), "subplotInfo", term1461);
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
        args[0] = term1435;
        args[1] = term1437;
        args[2] = term1439;
        args[3] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


