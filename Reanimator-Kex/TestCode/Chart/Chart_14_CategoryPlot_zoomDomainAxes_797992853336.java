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

public class CategoryPlot_zoomDomainAxes_797992853336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3737;
     Object term3739;
     Object term3765;

    public CategoryPlot_zoomDomainAxes_797992853336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3737 = new Double(0.5804948995371725);
        ArrayList term3752 = new ArrayList();
        ArrayList term3757 = new ArrayList();
        ArrayList term3761 = new ArrayList();
        term3739 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3740 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3741 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3746 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3747 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3756 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3741, term3741.getClass(), "x", 0.0);
        setDoubleField(term3741, term3741.getClass(), "y", 0.0);
        setDoubleField(term3741, term3741.getClass(), "width", 0.0);
        setDoubleField(term3741, term3741.getClass(), "height", 0.0);
        setField(term3740, term3740.getClass(), "chartArea", term3741);
        setField(term3746, term3746.getClass(), "owner", term3740);
        setField(term3746, term3746.getClass(), "plotArea", null);
        setDoubleField(term3747, term3747.getClass(), "x", 0.0);
        setDoubleField(term3747, term3747.getClass(), "y", 0.0);
        setDoubleField(term3747, term3747.getClass(), "width", 0.0);
        setDoubleField(term3747, term3747.getClass(), "height", 0.0);
        setField(term3746, term3746.getClass(), "dataArea", term3747);
        setField(term3746, term3746.getClass(), "subplotInfo", term3752);
        setField(term3740, term3740.getClass(), "plotInfo", term3746);
        setField(term3756, term3756.getClass(), "entities", term3757);
        setField(term3740, term3740.getClass(), "entities", term3756);
        setField(term3739, term3739.getClass(), "owner", term3740);
        setField(term3739, term3739.getClass(), "plotArea", null);
        setField(term3739, term3739.getClass(), "dataArea", null);
        setField(term3739, term3739.getClass(), "subplotInfo", term3761);
        term3765 = new Boolean(false);
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
        args[0] = term3737;
        args[1] = term3739;
        args[2] = null;
        args[3] = term3765;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


