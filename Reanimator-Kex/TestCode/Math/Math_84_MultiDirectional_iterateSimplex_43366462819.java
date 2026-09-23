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

public class MultiDirectional_iterateSimplex_43366462819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7687;

    public MultiDirectional_iterateSimplex_43366462819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7687 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term7208 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 12);
        Object term7803 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term7211 = (double[]) newDoubleArray(3);
        Object term7919 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term7216 = (double[]) newDoubleArray(256);
        setIntField(term7687, term7687.getClass(), "iterations", 2147483646);
        setIntField(term7687, term7687.getClass(), "maxIterations", 2147483647);
        setField(term7803, term7803.getClass(), "point", term7211);
        setElement(term7208, 0, term7803);
        setField(term7919, term7919.getClass(), "point", term7216);
        setElement(term7208, 1, term7919);
        setField(term7687, term7687.getClass(), "simplex", term7208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term7687, args);
    }

};


