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

public class MultiDirectional_iterateSimplex_43366462844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40209;

    public MultiDirectional_iterateSimplex_43366462844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40209 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term39283 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term40325 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term39286 = (double[]) newDoubleArray(37);
        Object term40441 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term39325 = (double[]) newDoubleArray(128);
        setIntField(term40209, term40209.getClass(), "iterations", 2147483646);
        setIntField(term40209, term40209.getClass(), "maxIterations", 2147483647);
        setField(term40325, term40325.getClass(), "point", term39286);
        setElement(term39283, 0, term40325);
        setField(term40441, term40441.getClass(), "point", term39325);
        setElement(term39283, 1, term40441);
        setElement(term39283, 2, term40325);
        setElement(term39283, 3, term40325);
        setElement(term39283, 5, term40325);
        setElement(term39283, 6, term40325);
        setElement(term39283, 7, term40325);
        setElement(term39283, 8, term40325);
        setElement(term39283, 9, term40325);
        setElement(term39283, 10, term40325);
        setElement(term39283, 11, term40325);
        setElement(term39283, 12, term40325);
        setElement(term39283, 13, term40325);
        setElement(term39283, 14, term40325);
        setElement(term39283, 15, term40325);
        setElement(term39283, 16, term40325);
        setElement(term39283, 17, term40325);
        setElement(term39283, 18, term40325);
        setElement(term39283, 19, term40325);
        setElement(term39283, 20, term40325);
        setElement(term39283, 21, term40325);
        setElement(term39283, 22, term40325);
        setElement(term39283, 23, term40325);
        setElement(term39283, 24, term40325);
        setElement(term39283, 25, term40325);
        setElement(term39283, 26, term40325);
        setElement(term39283, 27, term40325);
        setElement(term39283, 28, term40325);
        setElement(term39283, 29, term40325);
        setElement(term39283, 30, term40325);
        setElement(term39283, 31, term40325);
        setElement(term39283, 32, term40325);
        setElement(term39283, 33, term40325);
        setElement(term39283, 34, term40325);
        setElement(term39283, 35, term40325);
        setElement(term39283, 36, term40325);
        setElement(term39283, 37, term40325);
        setElement(term39283, 38, term40325);
        setElement(term39283, 39, term40325);
        setElement(term39283, 40, term40325);
        setElement(term39283, 41, term40325);
        setElement(term39283, 42, term40325);
        setElement(term39283, 43, term40325);
        setElement(term39283, 44, term40325);
        setElement(term39283, 45, term40325);
        setElement(term39283, 46, term40325);
        setElement(term39283, 47, term40325);
        setElement(term39283, 48, term40325);
        setElement(term39283, 49, term40325);
        setElement(term39283, 50, term40325);
        setElement(term39283, 51, term40325);
        setElement(term39283, 52, term40325);
        setElement(term39283, 53, term40325);
        setElement(term39283, 54, term40325);
        setElement(term39283, 55, term40325);
        setElement(term39283, 56, term40325);
        setElement(term39283, 57, term40325);
        setElement(term39283, 58, term40325);
        setElement(term39283, 59, term40325);
        setElement(term39283, 60, term40325);
        setElement(term39283, 61, term40325);
        setElement(term39283, 62, term40325);
        setElement(term39283, 63, term40325);
        setElement(term39283, 64, term40325);
        setElement(term39283, 65, term40325);
        setElement(term39283, 66, term40325);
        setElement(term39283, 67, term40325);
        setElement(term39283, 68, term40325);
        setElement(term39283, 69, term40325);
        setElement(term39283, 70, term40325);
        setElement(term39283, 71, term40325);
        setElement(term39283, 72, term40325);
        setElement(term39283, 73, term40325);
        setElement(term39283, 74, term40325);
        setElement(term39283, 75, term40325);
        setElement(term39283, 76, term40325);
        setElement(term39283, 77, term40325);
        setElement(term39283, 78, term40325);
        setElement(term39283, 79, term40325);
        setElement(term39283, 80, term40325);
        setElement(term39283, 81, term40325);
        setElement(term39283, 82, term40325);
        setElement(term39283, 83, term40325);
        setElement(term39283, 84, term40325);
        setElement(term39283, 85, term40325);
        setElement(term39283, 86, term40325);
        setElement(term39283, 87, term40325);
        setElement(term39283, 88, term40325);
        setElement(term39283, 89, term40325);
        setElement(term39283, 90, term40325);
        setElement(term39283, 91, term40325);
        setElement(term39283, 92, term40325);
        setElement(term39283, 93, term40325);
        setElement(term39283, 94, term40325);
        setElement(term39283, 95, term40325);
        setElement(term39283, 96, term40325);
        setElement(term39283, 97, term40325);
        setElement(term39283, 98, term40325);
        setElement(term39283, 99, term40325);
        setElement(term39283, 100, term40325);
        setElement(term39283, 101, term40325);
        setElement(term39283, 102, term40325);
        setElement(term39283, 103, term40325);
        setElement(term39283, 104, term40325);
        setElement(term39283, 105, term40325);
        setElement(term39283, 106, term40325);
        setElement(term39283, 107, term40325);
        setElement(term39283, 108, term40325);
        setElement(term39283, 109, term40325);
        setElement(term39283, 110, term40325);
        setElement(term39283, 111, term40325);
        setElement(term39283, 112, term40325);
        setElement(term39283, 113, term40325);
        setElement(term39283, 114, term40325);
        setElement(term39283, 115, term40325);
        setElement(term39283, 116, term40325);
        setElement(term39283, 117, term40325);
        setElement(term39283, 118, term40325);
        setElement(term39283, 119, term40325);
        setElement(term39283, 120, term40325);
        setElement(term39283, 121, term40325);
        setElement(term39283, 122, term40325);
        setElement(term39283, 123, term40325);
        setElement(term39283, 124, term40325);
        setElement(term39283, 125, term40325);
        setElement(term39283, 126, term40325);
        setElement(term39283, 127, term40325);
        setField(term40209, term40209.getClass(), "simplex", term39283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term40209, args);
    }

};


