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

public class CategoryPlot_setFixedRangeAxisSpace_1290804469326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3407;

    public CategoryPlot_setFixedRangeAxisSpace_1290804469326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3407 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term3407, term3407.getClass(), "top", 0.6397214730945112);
        setDoubleField(term3407, term3407.getClass(), "bottom", 0.25937345430928016);
        setDoubleField(term3407, term3407.getClass(), "left", 0.5873228247510078);
        setDoubleField(term3407, term3407.getClass(), "right", 0.8823181080774973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        Object[] args = new Object[1];
        args[0] = term3407;
        try {
            callMethod(klass, "setFixedRangeAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


