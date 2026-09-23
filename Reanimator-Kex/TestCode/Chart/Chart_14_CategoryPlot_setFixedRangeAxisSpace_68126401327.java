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

public class CategoryPlot_setFixedRangeAxisSpace_68126401327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3412;
     Object term3417;

    public CategoryPlot_setFixedRangeAxisSpace_68126401327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3412 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term3412, term3412.getClass(), "top", 0.2192450926212024);
        setDoubleField(term3412, term3412.getClass(), "bottom", 0.7591353014991907);
        setDoubleField(term3412, term3412.getClass(), "left", 0.791695029600875);
        setDoubleField(term3412, term3412.getClass(), "right", 0.6862221294683138);
        term3417 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term3412;
        args[1] = term3417;
        try {
            callMethod(klass, "setFixedRangeAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


