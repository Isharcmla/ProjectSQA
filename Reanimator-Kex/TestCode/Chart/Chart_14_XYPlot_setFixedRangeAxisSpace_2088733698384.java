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
import java.lang.Boolean;

public class XYPlot_setFixedRangeAxisSpace_2088733698384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1296;
     Object term1301;

    public XYPlot_setFixedRangeAxisSpace_2088733698384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1296 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term1296, term1296.getClass(), "top", 0.0668892744806211);
        setDoubleField(term1296, term1296.getClass(), "bottom", 0.3587267442738795);
        setDoubleField(term1296, term1296.getClass(), "left", 0.07802449704920456);
        setDoubleField(term1296, term1296.getClass(), "right", 0.5279279537140873);
        term1301 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1296;
        args[1] = term1301;
        try {
            callMethod(klass, "setFixedRangeAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


