package org.apache.commons.math.optimization.direct;

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
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiDirectional_iterateSimplex_433664628165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201477;

    public MultiDirectional_iterateSimplex_433664628165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201477 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term201071 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term201593 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term201074 = (double[]) newDoubleArray(12);
        Object term201709 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term201088 = (double[]) newDoubleArray(32);
        setIntField(term201477, term201477.getClass(), "iterations", 2147483646);
        setIntField(term201477, term201477.getClass(), "maxIterations", 2147483647);
        setField(term201593, term201593.getClass(), "point", term201074);
        setElement(term201071, 0, term201593);
        setField(term201709, term201709.getClass(), "point", term201088);
        setElement(term201071, 1, term201709);
        setField(term201477, term201477.getClass(), "simplex", term201071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term201477, args);
    }

};


