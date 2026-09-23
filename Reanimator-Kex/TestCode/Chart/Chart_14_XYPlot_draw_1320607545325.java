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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class XYPlot_draw_1320607545325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term697;

    public XYPlot_draw_1320607545325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term692 = new HashMap();
        term691 = newInstance(Class.forName("org.jfree.chart.plot.PlotState"));
        setField(term691, term691.getClass(), "sharedAxisStates", term692);
        ArrayList term710 = new ArrayList();
        ArrayList term715 = new ArrayList();
        ArrayList term719 = new ArrayList();
        term697 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term698 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term699 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term704 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term705 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term714 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term699, term699.getClass(), "x", 0.0);
        setDoubleField(term699, term699.getClass(), "y", 0.0);
        setDoubleField(term699, term699.getClass(), "width", 0.0);
        setDoubleField(term699, term699.getClass(), "height", 0.0);
        setField(term698, term698.getClass(), "chartArea", term699);
        setField(term704, term704.getClass(), "owner", term698);
        setField(term704, term704.getClass(), "plotArea", null);
        setDoubleField(term705, term705.getClass(), "x", 0.0);
        setDoubleField(term705, term705.getClass(), "y", 0.0);
        setDoubleField(term705, term705.getClass(), "width", 0.0);
        setDoubleField(term705, term705.getClass(), "height", 0.0);
        setField(term704, term704.getClass(), "dataArea", term705);
        setField(term704, term704.getClass(), "subplotInfo", term710);
        setField(term698, term698.getClass(), "plotInfo", term704);
        setField(term714, term714.getClass(), "entities", term715);
        setField(term698, term698.getClass(), "entities", term714);
        setField(term697, term697.getClass(), "owner", term698);
        setField(term697, term697.getClass(), "plotArea", null);
        setField(term697, term697.getClass(), "dataArea", null);
        setField(term697, term697.getClass(), "subplotInfo", term719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotState");
        argTypes[4] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term691;
        args[4] = term697;
        try {
            callMethod(klass, "draw", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


