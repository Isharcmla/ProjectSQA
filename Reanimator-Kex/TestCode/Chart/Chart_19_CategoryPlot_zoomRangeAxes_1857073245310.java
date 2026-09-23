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

public class CategoryPlot_zoomRangeAxes_1857073245310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3538;
     Object term3540;
     Object term3542;

    public CategoryPlot_zoomRangeAxes_1857073245310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3538 = new Double(0.15917839663695388);
        term3540 = new Double(0.9374115574082594);
        ArrayList term3555 = new ArrayList();
        ArrayList term3560 = new ArrayList();
        ArrayList term3564 = new ArrayList();
        term3542 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3543 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3544 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3549 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3550 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3559 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3544, term3544.getClass(), "x", 0.0);
        setDoubleField(term3544, term3544.getClass(), "y", 0.0);
        setDoubleField(term3544, term3544.getClass(), "width", 0.0);
        setDoubleField(term3544, term3544.getClass(), "height", 0.0);
        setField(term3543, term3543.getClass(), "chartArea", term3544);
        setField(term3549, term3549.getClass(), "owner", term3543);
        setField(term3549, term3549.getClass(), "plotArea", null);
        setDoubleField(term3550, term3550.getClass(), "x", 0.0);
        setDoubleField(term3550, term3550.getClass(), "y", 0.0);
        setDoubleField(term3550, term3550.getClass(), "width", 0.0);
        setDoubleField(term3550, term3550.getClass(), "height", 0.0);
        setField(term3549, term3549.getClass(), "dataArea", term3550);
        setField(term3549, term3549.getClass(), "subplotInfo", term3555);
        setField(term3543, term3543.getClass(), "plotInfo", term3549);
        setField(term3559, term3559.getClass(), "entities", term3560);
        setField(term3543, term3543.getClass(), "entities", term3559);
        setField(term3542, term3542.getClass(), "owner", term3543);
        setField(term3542, term3542.getClass(), "plotArea", null);
        setField(term3542, term3542.getClass(), "dataArea", null);
        setField(term3542, term3542.getClass(), "subplotInfo", term3564);
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
        args[0] = term3538;
        args[1] = term3540;
        args[2] = term3542;
        args[3] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


