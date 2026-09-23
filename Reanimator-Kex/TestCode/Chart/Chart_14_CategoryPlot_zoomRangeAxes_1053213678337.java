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

public class CategoryPlot_zoomRangeAxes_1053213678337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;
     Object term3769;

    public CategoryPlot_zoomRangeAxes_1053213678337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3767 = new Double(0.20737514139742264);
        ArrayList term3782 = new ArrayList();
        ArrayList term3787 = new ArrayList();
        ArrayList term3791 = new ArrayList();
        term3769 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3770 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3771 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3776 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3777 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3786 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3771, term3771.getClass(), "x", 0.0);
        setDoubleField(term3771, term3771.getClass(), "y", 0.0);
        setDoubleField(term3771, term3771.getClass(), "width", 0.0);
        setDoubleField(term3771, term3771.getClass(), "height", 0.0);
        setField(term3770, term3770.getClass(), "chartArea", term3771);
        setField(term3776, term3776.getClass(), "owner", term3770);
        setField(term3776, term3776.getClass(), "plotArea", null);
        setDoubleField(term3777, term3777.getClass(), "x", 0.0);
        setDoubleField(term3777, term3777.getClass(), "y", 0.0);
        setDoubleField(term3777, term3777.getClass(), "width", 0.0);
        setDoubleField(term3777, term3777.getClass(), "height", 0.0);
        setField(term3776, term3776.getClass(), "dataArea", term3777);
        setField(term3776, term3776.getClass(), "subplotInfo", term3782);
        setField(term3770, term3770.getClass(), "plotInfo", term3776);
        setField(term3786, term3786.getClass(), "entities", term3787);
        setField(term3770, term3770.getClass(), "entities", term3786);
        setField(term3769, term3769.getClass(), "owner", term3770);
        setField(term3769, term3769.getClass(), "plotArea", null);
        setField(term3769, term3769.getClass(), "dataArea", null);
        setField(term3769, term3769.getClass(), "subplotInfo", term3791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term3767;
        args[1] = term3769;
        args[2] = null;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


