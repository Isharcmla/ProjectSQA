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

public class CategoryPlot_zoomRangeAxes_792292360338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3795;
     Object term3797;
     Object term3823;

    public CategoryPlot_zoomRangeAxes_792292360338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3795 = new Double(0.7919370314903882);
        ArrayList term3810 = new ArrayList();
        ArrayList term3815 = new ArrayList();
        ArrayList term3819 = new ArrayList();
        term3797 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3798 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3799 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3804 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3805 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3814 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3799, term3799.getClass(), "x", 0.0);
        setDoubleField(term3799, term3799.getClass(), "y", 0.0);
        setDoubleField(term3799, term3799.getClass(), "width", 0.0);
        setDoubleField(term3799, term3799.getClass(), "height", 0.0);
        setField(term3798, term3798.getClass(), "chartArea", term3799);
        setField(term3804, term3804.getClass(), "owner", term3798);
        setField(term3804, term3804.getClass(), "plotArea", null);
        setDoubleField(term3805, term3805.getClass(), "x", 0.0);
        setDoubleField(term3805, term3805.getClass(), "y", 0.0);
        setDoubleField(term3805, term3805.getClass(), "width", 0.0);
        setDoubleField(term3805, term3805.getClass(), "height", 0.0);
        setField(term3804, term3804.getClass(), "dataArea", term3805);
        setField(term3804, term3804.getClass(), "subplotInfo", term3810);
        setField(term3798, term3798.getClass(), "plotInfo", term3804);
        setField(term3814, term3814.getClass(), "entities", term3815);
        setField(term3798, term3798.getClass(), "entities", term3814);
        setField(term3797, term3797.getClass(), "owner", term3798);
        setField(term3797, term3797.getClass(), "plotArea", null);
        setField(term3797, term3797.getClass(), "dataArea", null);
        setField(term3797, term3797.getClass(), "subplotInfo", term3819);
        term3823 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term3795;
        args[1] = term3797;
        args[2] = null;
        args[3] = term3823;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


