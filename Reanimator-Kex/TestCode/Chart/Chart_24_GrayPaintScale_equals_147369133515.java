package org.jfree.chart.renderer;

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
import static org.jfree.chart.renderer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.renderer.EqualityUtils.*;

public class GrayPaintScale_equals_147369133515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term212;
     Object term213;

    public GrayPaintScale_equals_147369133515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        term212 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term212, term212.getClass(), "lowerBound", 0.0);
        setDoubleField(term212, term212.getClass(), "upperBound", 0.0);
        term213 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term213, term213.getClass(), "lowerBound", 0.0);
        setDoubleField(term213, term213.getClass(), "upperBound", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term206;
        Object retValue = callMethod(klass, "equals", argTypes, term206, args);
        assertTrue(recursiveEquals(term206, term212));
        assertTrue(recursiveEquals(term206, term213));
        assertTrue(recursiveEquals(retValue, true));
    }

};


