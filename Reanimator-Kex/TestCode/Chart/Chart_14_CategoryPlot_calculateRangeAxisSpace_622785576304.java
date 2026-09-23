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

public class CategoryPlot_calculateRangeAxisSpace_622785576304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3192;

    public CategoryPlot_calculateRangeAxisSpace_622785576304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3192 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term3192, term3192.getClass(), "top", 0.11493000848982304);
        setDoubleField(term3192, term3192.getClass(), "bottom", 0.37161417339133307);
        setDoubleField(term3192, term3192.getClass(), "left", 0.6805867182029153);
        setDoubleField(term3192, term3192.getClass(), "right", 0.2852810965221698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.axis.AxisSpace");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term3192;
        try {
            callMethod(klass, "calculateRangeAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


