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
import java.lang.Object;
import java.util.ArrayList;

public class XYPlot_drawAnnotations_1402403819338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;

    public XYPlot_drawAnnotations_1402403819338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term845 = new ArrayList();
        ArrayList term850 = new ArrayList();
        ArrayList term854 = new ArrayList();
        term832 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term833 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term834 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term839 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term840 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term849 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term834, term834.getClass(), "x", 0.0);
        setDoubleField(term834, term834.getClass(), "y", 0.0);
        setDoubleField(term834, term834.getClass(), "width", 0.0);
        setDoubleField(term834, term834.getClass(), "height", 0.0);
        setField(term833, term833.getClass(), "chartArea", term834);
        setField(term839, term839.getClass(), "owner", term833);
        setField(term839, term839.getClass(), "plotArea", null);
        setDoubleField(term840, term840.getClass(), "x", 0.0);
        setDoubleField(term840, term840.getClass(), "y", 0.0);
        setDoubleField(term840, term840.getClass(), "width", 0.0);
        setDoubleField(term840, term840.getClass(), "height", 0.0);
        setField(term839, term839.getClass(), "dataArea", term840);
        setField(term839, term839.getClass(), "subplotInfo", term845);
        setField(term833, term833.getClass(), "plotInfo", term839);
        setField(term849, term849.getClass(), "entities", term850);
        setField(term833, term833.getClass(), "entities", term849);
        setField(term832, term832.getClass(), "owner", term833);
        setField(term832, term832.getClass(), "plotArea", null);
        setField(term832, term832.getClass(), "dataArea", null);
        setField(term832, term832.getClass(), "subplotInfo", term854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term832;
        try {
            callMethod(klass, "drawAnnotations", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


