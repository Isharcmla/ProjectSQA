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

public class CategoryPlot_zoomDomainAxes_1862773738306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3420;
     Object term3422;
     Object term3424;

    public CategoryPlot_zoomDomainAxes_1862773738306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3420 = new Double(0.8823181080774973);
        term3422 = new Double(0.2192450926212024);
        ArrayList term3437 = new ArrayList();
        ArrayList term3442 = new ArrayList();
        ArrayList term3446 = new ArrayList();
        term3424 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3425 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3426 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3431 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3432 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3441 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3426, term3426.getClass(), "x", 0.0);
        setDoubleField(term3426, term3426.getClass(), "y", 0.0);
        setDoubleField(term3426, term3426.getClass(), "width", 0.0);
        setDoubleField(term3426, term3426.getClass(), "height", 0.0);
        setField(term3425, term3425.getClass(), "chartArea", term3426);
        setField(term3431, term3431.getClass(), "owner", term3425);
        setField(term3431, term3431.getClass(), "plotArea", null);
        setDoubleField(term3432, term3432.getClass(), "x", 0.0);
        setDoubleField(term3432, term3432.getClass(), "y", 0.0);
        setDoubleField(term3432, term3432.getClass(), "width", 0.0);
        setDoubleField(term3432, term3432.getClass(), "height", 0.0);
        setField(term3431, term3431.getClass(), "dataArea", term3432);
        setField(term3431, term3431.getClass(), "subplotInfo", term3437);
        setField(term3425, term3425.getClass(), "plotInfo", term3431);
        setField(term3441, term3441.getClass(), "entities", term3442);
        setField(term3425, term3425.getClass(), "entities", term3441);
        setField(term3424, term3424.getClass(), "owner", term3425);
        setField(term3424, term3424.getClass(), "plotArea", null);
        setField(term3424, term3424.getClass(), "dataArea", null);
        setField(term3424, term3424.getClass(), "subplotInfo", term3446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[3] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[4];
        args[0] = term3420;
        args[1] = term3422;
        args[2] = term3424;
        args[3] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


