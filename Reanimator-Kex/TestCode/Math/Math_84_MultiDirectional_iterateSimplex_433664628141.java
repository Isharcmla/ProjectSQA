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

public class MultiDirectional_iterateSimplex_433664628141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172560;

    public MultiDirectional_iterateSimplex_433664628141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172560 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term171258 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term172676 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term171261 = (double[]) newDoubleArray(63);
        Object term172792 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term171326 = (double[]) newDoubleArray(63);
        setIntField(term172560, term172560.getClass(), "iterations", 2147483646);
        setIntField(term172560, term172560.getClass(), "maxIterations", 2147483647);
        setField(term172676, term172676.getClass(), "point", term171261);
        setElement(term171258, 0, term172676);
        setField(term172792, term172792.getClass(), "point", term171326);
        setElement(term171258, 1, term172792);
        setElement(term171258, 2, term172676);
        setElement(term171258, 3, term172676);
        setElement(term171258, 4, term172676);
        setElement(term171258, 5, term172676);
        setElement(term171258, 6, term172676);
        setElement(term171258, 7, term172676);
        setElement(term171258, 8, term172676);
        setElement(term171258, 9, term172676);
        setElement(term171258, 10, term172676);
        setElement(term171258, 11, term172676);
        setElement(term171258, 12, term172676);
        setElement(term171258, 13, term172676);
        setElement(term171258, 14, term172676);
        setElement(term171258, 15, term172676);
        setElement(term171258, 16, term172676);
        setElement(term171258, 17, term172676);
        setElement(term171258, 18, term172676);
        setElement(term171258, 19, term172676);
        setElement(term171258, 20, term172676);
        setElement(term171258, 21, term172676);
        setElement(term171258, 22, term172676);
        setElement(term171258, 23, term172676);
        setElement(term171258, 24, term172676);
        setElement(term171258, 25, term172676);
        setElement(term171258, 26, term172676);
        setElement(term171258, 27, term172676);
        setElement(term171258, 28, term172676);
        setElement(term171258, 29, term172676);
        setElement(term171258, 30, term172676);
        setElement(term171258, 31, term172676);
        setElement(term171258, 32, term172676);
        setElement(term171258, 33, term172676);
        setElement(term171258, 34, term172676);
        setElement(term171258, 35, term172676);
        setElement(term171258, 36, term172676);
        setElement(term171258, 37, term172676);
        setElement(term171258, 38, term172676);
        setElement(term171258, 39, term172676);
        setElement(term171258, 40, term172676);
        setElement(term171258, 41, term172676);
        setElement(term171258, 42, term172676);
        setElement(term171258, 43, term172676);
        setElement(term171258, 44, term172676);
        setElement(term171258, 45, term172676);
        setElement(term171258, 46, term172676);
        setElement(term171258, 47, term172676);
        setElement(term171258, 48, term172676);
        setElement(term171258, 49, term172676);
        setElement(term171258, 50, term172676);
        setElement(term171258, 51, term172676);
        setElement(term171258, 52, term172676);
        setElement(term171258, 53, term172676);
        setElement(term171258, 54, term172676);
        setElement(term171258, 55, term172676);
        setElement(term171258, 56, term172676);
        setElement(term171258, 57, term172676);
        setElement(term171258, 58, term172676);
        setElement(term171258, 59, term172676);
        setElement(term171258, 60, term172676);
        setElement(term171258, 61, term172676);
        setElement(term171258, 62, term172676);
        setElement(term171258, 63, term172676);
        setElement(term171258, 64, term172676);
        setElement(term171258, 65, term172676);
        setElement(term171258, 66, term172676);
        setElement(term171258, 67, term172676);
        setElement(term171258, 68, term172676);
        setElement(term171258, 69, term172676);
        setElement(term171258, 70, term172676);
        setElement(term171258, 71, term172676);
        setElement(term171258, 72, term172676);
        setElement(term171258, 73, term172676);
        setElement(term171258, 74, term172676);
        setElement(term171258, 75, term172676);
        setElement(term171258, 76, term172676);
        setElement(term171258, 77, term172676);
        setElement(term171258, 78, term172676);
        setElement(term171258, 79, term172676);
        setElement(term171258, 80, term172676);
        setElement(term171258, 81, term172676);
        setElement(term171258, 82, term172676);
        setElement(term171258, 83, term172676);
        setElement(term171258, 84, term172676);
        setElement(term171258, 85, term172676);
        setElement(term171258, 86, term172676);
        setElement(term171258, 87, term172676);
        setElement(term171258, 88, term172676);
        setElement(term171258, 89, term172676);
        setElement(term171258, 90, term172676);
        setElement(term171258, 91, term172676);
        setElement(term171258, 92, term172676);
        setElement(term171258, 93, term172676);
        setElement(term171258, 94, term172676);
        setElement(term171258, 95, term172676);
        setElement(term171258, 96, term172676);
        setElement(term171258, 97, term172676);
        setElement(term171258, 98, term172676);
        setElement(term171258, 99, term172676);
        setElement(term171258, 100, term172676);
        setElement(term171258, 101, term172676);
        setElement(term171258, 102, term172676);
        setElement(term171258, 103, term172676);
        setElement(term171258, 104, term172676);
        setElement(term171258, 105, term172676);
        setElement(term171258, 106, term172676);
        setElement(term171258, 107, term172676);
        setElement(term171258, 108, term172676);
        setElement(term171258, 109, term172676);
        setElement(term171258, 110, term172676);
        setElement(term171258, 111, term172676);
        setElement(term171258, 112, term172676);
        setElement(term171258, 113, term172676);
        setElement(term171258, 114, term172676);
        setElement(term171258, 115, term172676);
        setElement(term171258, 116, term172676);
        setElement(term171258, 117, term172676);
        setElement(term171258, 118, term172676);
        setElement(term171258, 119, term172676);
        setElement(term171258, 120, term172676);
        setElement(term171258, 121, term172676);
        setElement(term171258, 122, term172676);
        setElement(term171258, 123, term172676);
        setElement(term171258, 124, term172676);
        setElement(term171258, 125, term172676);
        setElement(term171258, 126, term172676);
        setElement(term171258, 127, term172676);
        setField(term172560, term172560.getClass(), "simplex", term171258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term172560, args);
    }

};


