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

public class XYPlot_setFixedRangeAxisSpace_847302728383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;

    public XYPlot_setFixedRangeAxisSpace_847302728383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1291 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term1291, term1291.getClass(), "top", 0.6805867182029153);
        setDoubleField(term1291, term1291.getClass(), "bottom", 0.2852810965221698);
        setDoubleField(term1291, term1291.getClass(), "left", 0.6300849762307866);
        setDoubleField(term1291, term1291.getClass(), "right", 0.9737083944266686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        Object[] args = new Object[1];
        args[0] = term1291;
        try {
            callMethod(klass, "setFixedRangeAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


