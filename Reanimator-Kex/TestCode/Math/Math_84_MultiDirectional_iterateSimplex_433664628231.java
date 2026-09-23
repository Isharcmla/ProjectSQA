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

public class MultiDirectional_iterateSimplex_433664628231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297548;

    public MultiDirectional_iterateSimplex_433664628231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297548 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term295358 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term297664 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term295361 = (double[]) newDoubleArray(104);
        Object term297780 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term295467 = (double[]) newDoubleArray(256);
        setIntField(term297548, term297548.getClass(), "iterations", 2147483646);
        setIntField(term297548, term297548.getClass(), "maxIterations", 2147483647);
        setField(term297664, term297664.getClass(), "point", term295361);
        setElement(term295358, 0, term297664);
        setField(term297780, term297780.getClass(), "point", term295467);
        setElement(term295358, 1, term297780);
        setElement(term295358, 2, term297664);
        setElement(term295358, 3, term297664);
        setElement(term295358, 4, term297664);
        setElement(term295358, 5, term297664);
        setElement(term295358, 6, term297664);
        setElement(term295358, 7, term297664);
        setElement(term295358, 8, term297664);
        setElement(term295358, 9, term297664);
        setElement(term295358, 10, term297664);
        setElement(term295358, 11, term297664);
        setElement(term295358, 12, term297664);
        setElement(term295358, 13, term297664);
        setElement(term295358, 14, term297664);
        setElement(term295358, 15, term297664);
        setElement(term295358, 16, term297664);
        setElement(term295358, 17, term297664);
        setElement(term295358, 18, term297664);
        setElement(term295358, 19, term297664);
        setElement(term295358, 20, term297664);
        setElement(term295358, 21, term297664);
        setElement(term295358, 22, term297664);
        setElement(term295358, 23, term297664);
        setElement(term295358, 24, term297664);
        setElement(term295358, 25, term297664);
        setElement(term295358, 26, term297664);
        setElement(term295358, 27, term297664);
        setElement(term295358, 28, term297664);
        setElement(term295358, 29, term297664);
        setElement(term295358, 30, term297664);
        setElement(term295358, 31, term297664);
        setElement(term295358, 32, term297664);
        setElement(term295358, 33, term297664);
        setElement(term295358, 34, term297664);
        setElement(term295358, 35, term297664);
        setElement(term295358, 36, term297664);
        setElement(term295358, 37, term297664);
        setElement(term295358, 38, term297664);
        setElement(term295358, 39, term297664);
        setElement(term295358, 40, term297664);
        setElement(term295358, 41, term297664);
        setElement(term295358, 42, term297664);
        setElement(term295358, 43, term297664);
        setElement(term295358, 44, term297664);
        setElement(term295358, 45, term297664);
        setElement(term295358, 46, term297664);
        setElement(term295358, 47, term297664);
        setElement(term295358, 48, term297664);
        setElement(term295358, 49, term297664);
        setElement(term295358, 50, term297664);
        setElement(term295358, 51, term297664);
        setElement(term295358, 52, term297664);
        setElement(term295358, 53, term297664);
        setElement(term295358, 54, term297664);
        setElement(term295358, 55, term297664);
        setElement(term295358, 56, term297664);
        setElement(term295358, 57, term297664);
        setElement(term295358, 58, term297664);
        setElement(term295358, 59, term297664);
        setElement(term295358, 60, term297664);
        setElement(term295358, 61, term297664);
        setElement(term295358, 62, term297664);
        setElement(term295358, 63, term297664);
        setField(term297548, term297548.getClass(), "simplex", term295358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term297548, args);
    }

};


