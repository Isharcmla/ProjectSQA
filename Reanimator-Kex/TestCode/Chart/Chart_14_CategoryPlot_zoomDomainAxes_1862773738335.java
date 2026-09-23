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

public class CategoryPlot_zoomDomainAxes_1862773738335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3707;
     Object term3709;
     Object term3711;

    public CategoryPlot_zoomDomainAxes_1862773738335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3707 = new Double(0.8566567697571895);
        term3709 = new Double(0.9203805380592256);
        ArrayList term3724 = new ArrayList();
        ArrayList term3729 = new ArrayList();
        ArrayList term3733 = new ArrayList();
        term3711 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3712 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3713 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3718 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3719 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3728 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3713, term3713.getClass(), "x", 0.0);
        setDoubleField(term3713, term3713.getClass(), "y", 0.0);
        setDoubleField(term3713, term3713.getClass(), "width", 0.0);
        setDoubleField(term3713, term3713.getClass(), "height", 0.0);
        setField(term3712, term3712.getClass(), "chartArea", term3713);
        setField(term3718, term3718.getClass(), "owner", term3712);
        setField(term3718, term3718.getClass(), "plotArea", null);
        setDoubleField(term3719, term3719.getClass(), "x", 0.0);
        setDoubleField(term3719, term3719.getClass(), "y", 0.0);
        setDoubleField(term3719, term3719.getClass(), "width", 0.0);
        setDoubleField(term3719, term3719.getClass(), "height", 0.0);
        setField(term3718, term3718.getClass(), "dataArea", term3719);
        setField(term3718, term3718.getClass(), "subplotInfo", term3724);
        setField(term3712, term3712.getClass(), "plotInfo", term3718);
        setField(term3728, term3728.getClass(), "entities", term3729);
        setField(term3712, term3712.getClass(), "entities", term3728);
        setField(term3711, term3711.getClass(), "owner", term3712);
        setField(term3711, term3711.getClass(), "plotArea", null);
        setField(term3711, term3711.getClass(), "dataArea", null);
        setField(term3711, term3711.getClass(), "subplotInfo", term3733);
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
        args[0] = term3707;
        args[1] = term3709;
        args[2] = term3711;
        args[3] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


