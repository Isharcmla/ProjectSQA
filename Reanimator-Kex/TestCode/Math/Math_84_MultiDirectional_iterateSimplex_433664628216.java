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

public class MultiDirectional_iterateSimplex_433664628216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280187;

    public MultiDirectional_iterateSimplex_433664628216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280187 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term278309 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 20);
        Object term280303 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term278312 = (double[]) newDoubleArray(93);
        Object term280419 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term278407 = (double[]) newDoubleArray(128);
        setIntField(term280187, term280187.getClass(), "iterations", 2147483646);
        setIntField(term280187, term280187.getClass(), "maxIterations", 2147483647);
        setField(term280303, term280303.getClass(), "point", term278312);
        setElement(term278309, 0, term280303);
        setField(term280419, term280419.getClass(), "point", term278407);
        setElement(term278309, 1, term280419);
        setElement(term278309, 2, term280303);
        setElement(term278309, 3, term280303);
        setElement(term278309, 4, term280303);
        setElement(term278309, 5, term280303);
        setElement(term278309, 6, term280303);
        setElement(term278309, 7, term280303);
        setElement(term278309, 8, term280303);
        setElement(term278309, 9, term280303);
        setElement(term278309, 10, term280303);
        setElement(term278309, 11, term280303);
        setElement(term278309, 12, term280303);
        setElement(term278309, 13, term280303);
        setElement(term278309, 14, term280303);
        setElement(term278309, 15, term280303);
        setElement(term278309, 17, term280303);
        setElement(term278309, 18, term280303);
        setElement(term278309, 19, term280303);
        setField(term280187, term280187.getClass(), "simplex", term278309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term280187, args);
    }

};


