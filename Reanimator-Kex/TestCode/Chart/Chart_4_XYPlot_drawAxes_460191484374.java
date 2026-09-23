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

public class XYPlot_drawAxes_460191484374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755;

    public XYPlot_drawAxes_460191484374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term768 = new ArrayList();
        ArrayList term773 = new ArrayList();
        ArrayList term777 = new ArrayList();
        term755 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term756 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term757 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term762 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term763 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term772 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term757, term757.getClass(), "x", 0.0);
        setDoubleField(term757, term757.getClass(), "y", 0.0);
        setDoubleField(term757, term757.getClass(), "width", 0.0);
        setDoubleField(term757, term757.getClass(), "height", 0.0);
        setField(term756, term756.getClass(), "chartArea", term757);
        setField(term762, term762.getClass(), "owner", term756);
        setField(term762, term762.getClass(), "plotArea", null);
        setDoubleField(term763, term763.getClass(), "x", 0.0);
        setDoubleField(term763, term763.getClass(), "y", 0.0);
        setDoubleField(term763, term763.getClass(), "width", 0.0);
        setDoubleField(term763, term763.getClass(), "height", 0.0);
        setField(term762, term762.getClass(), "dataArea", term763);
        setField(term762, term762.getClass(), "subplotInfo", term768);
        setField(term756, term756.getClass(), "plotInfo", term762);
        setField(term772, term772.getClass(), "entities", term773);
        setField(term756, term756.getClass(), "entities", term772);
        setField(term756, term756.getClass(), "renderingSource", null);
        setField(term755, term755.getClass(), "owner", term756);
        setField(term755, term755.getClass(), "plotArea", null);
        setField(term755, term755.getClass(), "dataArea", null);
        setField(term755, term755.getClass(), "subplotInfo", term777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term755;
        try {
            callMethod(klass, "drawAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


