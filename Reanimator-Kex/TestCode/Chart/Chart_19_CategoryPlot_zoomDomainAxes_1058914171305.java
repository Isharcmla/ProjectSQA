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

public class CategoryPlot_zoomDomainAxes_1058914171305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3392;
     Object term3394;

    public CategoryPlot_zoomDomainAxes_1058914171305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3392 = new Double(0.5873228247510078);
        ArrayList term3407 = new ArrayList();
        ArrayList term3412 = new ArrayList();
        ArrayList term3416 = new ArrayList();
        term3394 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3395 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3396 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3401 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3402 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3411 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3396, term3396.getClass(), "x", 0.0);
        setDoubleField(term3396, term3396.getClass(), "y", 0.0);
        setDoubleField(term3396, term3396.getClass(), "width", 0.0);
        setDoubleField(term3396, term3396.getClass(), "height", 0.0);
        setField(term3395, term3395.getClass(), "chartArea", term3396);
        setField(term3401, term3401.getClass(), "owner", term3395);
        setField(term3401, term3401.getClass(), "plotArea", null);
        setDoubleField(term3402, term3402.getClass(), "x", 0.0);
        setDoubleField(term3402, term3402.getClass(), "y", 0.0);
        setDoubleField(term3402, term3402.getClass(), "width", 0.0);
        setDoubleField(term3402, term3402.getClass(), "height", 0.0);
        setField(term3401, term3401.getClass(), "dataArea", term3402);
        setField(term3401, term3401.getClass(), "subplotInfo", term3407);
        setField(term3395, term3395.getClass(), "plotInfo", term3401);
        setField(term3411, term3411.getClass(), "entities", term3412);
        setField(term3395, term3395.getClass(), "entities", term3411);
        setField(term3394, term3394.getClass(), "owner", term3395);
        setField(term3394, term3394.getClass(), "plotArea", null);
        setField(term3394, term3394.getClass(), "dataArea", null);
        setField(term3394, term3394.getClass(), "subplotInfo", term3416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term3392;
        args[1] = term3394;
        args[2] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


