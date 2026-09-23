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

public class CategoryPlot_zoomRangeAxes_1857073245339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3825;
     Object term3827;
     Object term3829;

    public CategoryPlot_zoomRangeAxes_1857073245339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3825 = new Double(0.2109867221632754);
        term3827 = new Double(0.3227335400819148);
        ArrayList term3842 = new ArrayList();
        ArrayList term3847 = new ArrayList();
        ArrayList term3851 = new ArrayList();
        term3829 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3830 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3831 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3836 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3837 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3846 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3831, term3831.getClass(), "x", 0.0);
        setDoubleField(term3831, term3831.getClass(), "y", 0.0);
        setDoubleField(term3831, term3831.getClass(), "width", 0.0);
        setDoubleField(term3831, term3831.getClass(), "height", 0.0);
        setField(term3830, term3830.getClass(), "chartArea", term3831);
        setField(term3836, term3836.getClass(), "owner", term3830);
        setField(term3836, term3836.getClass(), "plotArea", null);
        setDoubleField(term3837, term3837.getClass(), "x", 0.0);
        setDoubleField(term3837, term3837.getClass(), "y", 0.0);
        setDoubleField(term3837, term3837.getClass(), "width", 0.0);
        setDoubleField(term3837, term3837.getClass(), "height", 0.0);
        setField(term3836, term3836.getClass(), "dataArea", term3837);
        setField(term3836, term3836.getClass(), "subplotInfo", term3842);
        setField(term3830, term3830.getClass(), "plotInfo", term3836);
        setField(term3846, term3846.getClass(), "entities", term3847);
        setField(term3830, term3830.getClass(), "entities", term3846);
        setField(term3829, term3829.getClass(), "owner", term3830);
        setField(term3829, term3829.getClass(), "plotArea", null);
        setField(term3829, term3829.getClass(), "dataArea", null);
        setField(term3829, term3829.getClass(), "subplotInfo", term3851);
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
        args[0] = term3825;
        args[1] = term3827;
        args[2] = term3829;
        args[3] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


