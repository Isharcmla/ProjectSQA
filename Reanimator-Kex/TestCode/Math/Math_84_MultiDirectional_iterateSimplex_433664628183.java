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

public class MultiDirectional_iterateSimplex_433664628183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225934;

    public MultiDirectional_iterateSimplex_433664628183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225934 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term224776 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term226050 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term224779 = (double[]) newDoubleArray(28);
        Object term226166 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term224809 = (double[]) newDoubleArray(512);
        setIntField(term225934, term225934.getClass(), "iterations", 2147483646);
        setIntField(term225934, term225934.getClass(), "maxIterations", 2147483647);
        setField(term226050, term226050.getClass(), "point", term224779);
        setElement(term224776, 0, term226050);
        setField(term226166, term226166.getClass(), "point", term224809);
        setElement(term224776, 1, term226166);
        setField(term225934, term225934.getClass(), "simplex", term224776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term225934, args);
    }

};


