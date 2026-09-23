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

public class CategoryPlot_zoomRangeAxes_1053213678308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3480;
     Object term3482;

    public CategoryPlot_zoomRangeAxes_1053213678308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3480 = new Double(0.791695029600875);
        ArrayList term3495 = new ArrayList();
        ArrayList term3500 = new ArrayList();
        ArrayList term3504 = new ArrayList();
        term3482 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3483 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3484 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3489 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3490 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3499 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3484, term3484.getClass(), "x", 0.0);
        setDoubleField(term3484, term3484.getClass(), "y", 0.0);
        setDoubleField(term3484, term3484.getClass(), "width", 0.0);
        setDoubleField(term3484, term3484.getClass(), "height", 0.0);
        setField(term3483, term3483.getClass(), "chartArea", term3484);
        setField(term3489, term3489.getClass(), "owner", term3483);
        setField(term3489, term3489.getClass(), "plotArea", null);
        setDoubleField(term3490, term3490.getClass(), "x", 0.0);
        setDoubleField(term3490, term3490.getClass(), "y", 0.0);
        setDoubleField(term3490, term3490.getClass(), "width", 0.0);
        setDoubleField(term3490, term3490.getClass(), "height", 0.0);
        setField(term3489, term3489.getClass(), "dataArea", term3490);
        setField(term3489, term3489.getClass(), "subplotInfo", term3495);
        setField(term3483, term3483.getClass(), "plotInfo", term3489);
        setField(term3499, term3499.getClass(), "entities", term3500);
        setField(term3483, term3483.getClass(), "entities", term3499);
        setField(term3482, term3482.getClass(), "owner", term3483);
        setField(term3482, term3482.getClass(), "plotArea", null);
        setField(term3482, term3482.getClass(), "dataArea", null);
        setField(term3482, term3482.getClass(), "subplotInfo", term3504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term3480;
        args[1] = term3482;
        args[2] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


