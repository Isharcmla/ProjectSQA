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

public class MultiDirectional_iterateSimplex_433664628236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303626;

    public MultiDirectional_iterateSimplex_433664628236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303626 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term301622 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 50);
        Object term303742 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term301625 = (double[]) newDoubleArray(102);
        Object term303858 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term301729 = (double[]) newDoubleArray(102);
        setIntField(term303626, term303626.getClass(), "iterations", 2147483646);
        setIntField(term303626, term303626.getClass(), "maxIterations", 2147483647);
        setField(term303742, term303742.getClass(), "point", term301625);
        setElement(term301622, 0, term303742);
        setField(term303858, term303858.getClass(), "point", term301729);
        setElement(term301622, 1, term303858);
        setElement(term301622, 2, term303742);
        setElement(term301622, 3, term303742);
        setElement(term301622, 4, term303742);
        setElement(term301622, 5, term303742);
        setElement(term301622, 6, term303742);
        setElement(term301622, 7, term303742);
        setElement(term301622, 8, term303742);
        setElement(term301622, 9, term303742);
        setElement(term301622, 10, term303742);
        setElement(term301622, 11, term303742);
        setElement(term301622, 12, term303742);
        setElement(term301622, 13, term303742);
        setElement(term301622, 14, term303742);
        setElement(term301622, 15, term303742);
        setElement(term301622, 16, term303742);
        setElement(term301622, 17, term303742);
        setElement(term301622, 18, term303742);
        setElement(term301622, 19, term303742);
        setElement(term301622, 20, term303742);
        setElement(term301622, 21, term303742);
        setElement(term301622, 22, term303742);
        setElement(term301622, 23, term303742);
        setElement(term301622, 24, term303742);
        setElement(term301622, 25, term303742);
        setElement(term301622, 26, term303742);
        setElement(term301622, 27, term303742);
        setElement(term301622, 28, term303742);
        setElement(term301622, 29, term303742);
        setElement(term301622, 30, term303742);
        setElement(term301622, 31, term303742);
        setElement(term301622, 32, term303742);
        setElement(term301622, 33, term303742);
        setElement(term301622, 34, term303742);
        setElement(term301622, 35, term303742);
        setElement(term301622, 36, term303742);
        setElement(term301622, 37, term303742);
        setElement(term301622, 38, term303742);
        setElement(term301622, 39, term303742);
        setElement(term301622, 40, term303742);
        setElement(term301622, 41, term303742);
        setElement(term301622, 42, term303742);
        setElement(term301622, 43, term303742);
        setElement(term301622, 44, term303742);
        setElement(term301622, 45, term303742);
        setElement(term301622, 46, term303742);
        setElement(term301622, 47, term303742);
        setElement(term301622, 48, term303742);
        setElement(term301622, 49, term303742);
        setField(term303626, term303626.getClass(), "simplex", term301622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term303626, args);
    }

};


