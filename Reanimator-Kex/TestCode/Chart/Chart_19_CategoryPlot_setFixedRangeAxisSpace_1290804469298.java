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

public class CategoryPlot_setFixedRangeAxisSpace_1290804469298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3127;

    public CategoryPlot_setFixedRangeAxisSpace_1290804469298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3127 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term3127, term3127.getClass(), "top", 0.3202192021706908);
        setDoubleField(term3127, term3127.getClass(), "bottom", 0.22651340641904605);
        setDoubleField(term3127, term3127.getClass(), "left", 0.8878841294187743);
        setDoubleField(term3127, term3127.getClass(), "right", 0.6588948704887806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        Object[] args = new Object[1];
        args[0] = term3127;
        try {
            callMethod(klass, "setFixedRangeAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


