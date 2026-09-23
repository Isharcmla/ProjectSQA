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

public class MultiDirectional_iterateSimplex_433664628137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169136;

    public MultiDirectional_iterateSimplex_433664628137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169136 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term167722 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term169252 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term167725 = (double[]) newDoubleArray(69);
        Object term169368 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term167796 = (double[]) newDoubleArray(72);
        setIntField(term169136, term169136.getClass(), "iterations", 2147483646);
        setIntField(term169136, term169136.getClass(), "maxIterations", 2147483647);
        setField(term169252, term169252.getClass(), "point", term167725);
        setElement(term167722, 0, term169252);
        setField(term169368, term169368.getClass(), "point", term167796);
        setElement(term167722, 1, term169368);
        setElement(term167722, 2, term169252);
        setElement(term167722, 3, term169252);
        setElement(term167722, 4, term169252);
        setElement(term167722, 5, term169252);
        setElement(term167722, 6, term169252);
        setElement(term167722, 7, term169252);
        setElement(term167722, 8, term169252);
        setElement(term167722, 9, term169252);
        setElement(term167722, 10, term169252);
        setElement(term167722, 11, term169252);
        setElement(term167722, 12, term169252);
        setElement(term167722, 13, term169252);
        setElement(term167722, 14, term169252);
        setElement(term167722, 15, term169252);
        setElement(term167722, 16, term169252);
        setElement(term167722, 17, term169252);
        setElement(term167722, 18, term169252);
        setElement(term167722, 19, term169252);
        setElement(term167722, 20, term169252);
        setElement(term167722, 21, term169252);
        setElement(term167722, 22, term169252);
        setElement(term167722, 23, term169252);
        setElement(term167722, 24, term169252);
        setElement(term167722, 25, term169252);
        setElement(term167722, 26, term169252);
        setElement(term167722, 27, term169252);
        setElement(term167722, 28, term169252);
        setElement(term167722, 29, term169252);
        setElement(term167722, 30, term169252);
        setElement(term167722, 31, term169252);
        setField(term169136, term169136.getClass(), "simplex", term167722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term169136, args);
    }

};


