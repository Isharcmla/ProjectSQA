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

public class MultiDirectional_iterateSimplex_433664628175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212408;

    public MultiDirectional_iterateSimplex_433664628175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212408 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term211652 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term212524 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term211655 = (double[]) newDoubleArray(27);
        Object term212640 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term211684 = (double[]) newDoubleArray(128);
        setIntField(term212408, term212408.getClass(), "iterations", 2147483646);
        setIntField(term212408, term212408.getClass(), "maxIterations", 2147483647);
        setField(term212524, term212524.getClass(), "point", term211655);
        setElement(term211652, 0, term212524);
        setField(term212640, term212640.getClass(), "point", term211684);
        setElement(term211652, 1, term212640);
        setElement(term211652, 2, term212524);
        setElement(term211652, 3, term212524);
        setElement(term211652, 4, term212524);
        setElement(term211652, 5, term212524);
        setElement(term211652, 6, term212524);
        setElement(term211652, 7, term212524);
        setElement(term211652, 8, term212524);
        setElement(term211652, 9, term212524);
        setElement(term211652, 10, term212524);
        setElement(term211652, 11, term212524);
        setElement(term211652, 12, term212524);
        setElement(term211652, 13, term212524);
        setElement(term211652, 14, term212524);
        setElement(term211652, 15, term212524);
        setElement(term211652, 17, term212524);
        setElement(term211652, 18, term212524);
        setElement(term211652, 19, term212524);
        setElement(term211652, 20, term212524);
        setElement(term211652, 21, term212524);
        setElement(term211652, 22, term212524);
        setElement(term211652, 23, term212524);
        setElement(term211652, 24, term212524);
        setElement(term211652, 25, term212524);
        setElement(term211652, 26, term212524);
        setElement(term211652, 27, term212524);
        setElement(term211652, 28, term212524);
        setElement(term211652, 29, term212524);
        setElement(term211652, 30, term212524);
        setElement(term211652, 31, term212524);
        setElement(term211652, 32, term212524);
        setElement(term211652, 33, term212524);
        setElement(term211652, 34, term212524);
        setElement(term211652, 35, term212524);
        setElement(term211652, 36, term212524);
        setElement(term211652, 37, term212524);
        setElement(term211652, 38, term212524);
        setElement(term211652, 39, term212524);
        setElement(term211652, 40, term212524);
        setElement(term211652, 41, term212524);
        setElement(term211652, 42, term212524);
        setElement(term211652, 43, term212524);
        setElement(term211652, 44, term212524);
        setElement(term211652, 45, term212524);
        setElement(term211652, 46, term212524);
        setElement(term211652, 47, term212524);
        setElement(term211652, 48, term212524);
        setElement(term211652, 49, term212524);
        setElement(term211652, 50, term212524);
        setElement(term211652, 51, term212524);
        setElement(term211652, 52, term212524);
        setElement(term211652, 53, term212524);
        setElement(term211652, 54, term212524);
        setElement(term211652, 55, term212524);
        setElement(term211652, 56, term212524);
        setElement(term211652, 57, term212524);
        setElement(term211652, 58, term212524);
        setElement(term211652, 59, term212524);
        setElement(term211652, 60, term212524);
        setElement(term211652, 61, term212524);
        setElement(term211652, 62, term212524);
        setElement(term211652, 63, term212524);
        setElement(term211652, 64, term212524);
        setElement(term211652, 65, term212524);
        setElement(term211652, 66, term212524);
        setElement(term211652, 67, term212524);
        setElement(term211652, 68, term212524);
        setElement(term211652, 69, term212524);
        setElement(term211652, 70, term212524);
        setElement(term211652, 71, term212524);
        setElement(term211652, 72, term212524);
        setElement(term211652, 73, term212524);
        setElement(term211652, 74, term212524);
        setElement(term211652, 75, term212524);
        setElement(term211652, 76, term212524);
        setElement(term211652, 77, term212524);
        setElement(term211652, 78, term212524);
        setElement(term211652, 79, term212524);
        setElement(term211652, 80, term212524);
        setElement(term211652, 81, term212524);
        setElement(term211652, 82, term212524);
        setElement(term211652, 83, term212524);
        setElement(term211652, 84, term212524);
        setElement(term211652, 85, term212524);
        setElement(term211652, 86, term212524);
        setElement(term211652, 87, term212524);
        setElement(term211652, 88, term212524);
        setElement(term211652, 89, term212524);
        setElement(term211652, 90, term212524);
        setElement(term211652, 91, term212524);
        setElement(term211652, 92, term212524);
        setElement(term211652, 93, term212524);
        setElement(term211652, 94, term212524);
        setElement(term211652, 95, term212524);
        setElement(term211652, 96, term212524);
        setElement(term211652, 97, term212524);
        setElement(term211652, 98, term212524);
        setElement(term211652, 99, term212524);
        setElement(term211652, 100, term212524);
        setElement(term211652, 101, term212524);
        setElement(term211652, 102, term212524);
        setElement(term211652, 103, term212524);
        setElement(term211652, 104, term212524);
        setElement(term211652, 105, term212524);
        setElement(term211652, 106, term212524);
        setElement(term211652, 107, term212524);
        setElement(term211652, 108, term212524);
        setElement(term211652, 109, term212524);
        setElement(term211652, 110, term212524);
        setElement(term211652, 111, term212524);
        setElement(term211652, 112, term212524);
        setElement(term211652, 113, term212524);
        setElement(term211652, 114, term212524);
        setElement(term211652, 115, term212524);
        setElement(term211652, 116, term212524);
        setElement(term211652, 117, term212524);
        setElement(term211652, 118, term212524);
        setElement(term211652, 119, term212524);
        setElement(term211652, 120, term212524);
        setElement(term211652, 121, term212524);
        setElement(term211652, 122, term212524);
        setElement(term211652, 123, term212524);
        setElement(term211652, 124, term212524);
        setElement(term211652, 125, term212524);
        setElement(term211652, 126, term212524);
        setElement(term211652, 127, term212524);
        setField(term212408, term212408.getClass(), "simplex", term211652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term212408, args);
    }

};


