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
import java.lang.Double;

public class GrayPaintScale_init_11217140178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term38;

    public GrayPaintScale_init_11217140178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term3 = new Double(0.3455959125047594);
        term38 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term38, term38.getClass(), "lowerBound", 0.13238746331190498);
        setDoubleField(term38, term38.getClass(), "upperBound", 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38));
        assertTrue(recursiveEquals(term1, 0.13238746331190498));
        assertTrue(recursiveEquals(term3, 0.3455959125047594));
    }

};


