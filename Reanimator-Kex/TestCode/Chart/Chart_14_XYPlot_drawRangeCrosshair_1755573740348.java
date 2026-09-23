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

public class XYPlot_drawRangeCrosshair_1755573740348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033;
     Object term1046;

    public XYPlot_drawRangeCrosshair_1755573740348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1033 = newInstance(Class.forName("org.jfree.chart.plot.PlotOrientation"));
        setField(term1033, term1033.getClass(), "name", "OWDIEULEFu");
        term1046 = new Double(0.9828442029246764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotOrientation");
        argTypes[3] = double.class;
        argTypes[4] = Class.forName("org.jfree.chart.axis.ValueAxis");
        argTypes[5] = Class.forName("java.awt.Stroke");
        argTypes[6] = Class.forName("java.awt.Paint");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term1033;
        args[3] = term1046;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        try {
            callMethod(klass, "drawRangeCrosshair", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


