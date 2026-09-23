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

public class GrayPaintScale_equals_147369133519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;
     Object term490;
     Object term897;
     Object term898;

    public GrayPaintScale_equals_147369133519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        term490 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        term897 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term897, term897.getClass(), "lowerBound", 0.0);
        setDoubleField(term897, term897.getClass(), "upperBound", 0.0);
        term898 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term898, term898.getClass(), "lowerBound", 0.0);
        setDoubleField(term898, term898.getClass(), "upperBound", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term490;
        Object retValue = callMethod(klass, "equals", argTypes, term406, args);
        assertTrue(recursiveEquals(term406, term897));
        assertTrue(recursiveEquals(term490, term898));
        assertTrue(recursiveEquals(retValue, true));
    }

};


