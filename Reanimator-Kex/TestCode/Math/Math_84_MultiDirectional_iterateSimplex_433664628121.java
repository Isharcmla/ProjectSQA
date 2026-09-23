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

public class MultiDirectional_iterateSimplex_433664628121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147018;

    public MultiDirectional_iterateSimplex_433664628121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147018 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term145863 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term147134 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term145866 = (double[]) newDoubleArray(43);
        Object term147250 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term145911 = (double[]) newDoubleArray(256);
        setIntField(term147018, term147018.getClass(), "iterations", 2147483646);
        setIntField(term147018, term147018.getClass(), "maxIterations", 2147483647);
        setField(term147134, term147134.getClass(), "point", term145866);
        setElement(term145863, 0, term147134);
        setField(term147250, term147250.getClass(), "point", term145911);
        setElement(term145863, 1, term147250);
        setElement(term145863, 2, term147134);
        setElement(term145863, 3, term147134);
        setElement(term145863, 4, term147134);
        setElement(term145863, 5, term147134);
        setElement(term145863, 6, term147134);
        setElement(term145863, 7, term147134);
        setElement(term145863, 8, term147134);
        setElement(term145863, 9, term147134);
        setElement(term145863, 10, term147134);
        setElement(term145863, 11, term147134);
        setElement(term145863, 12, term147134);
        setElement(term145863, 13, term147134);
        setElement(term145863, 14, term147134);
        setElement(term145863, 15, term147134);
        setElement(term145863, 16, term147134);
        setElement(term145863, 17, term147134);
        setElement(term145863, 18, term147134);
        setElement(term145863, 19, term147134);
        setElement(term145863, 20, term147134);
        setElement(term145863, 21, term147134);
        setElement(term145863, 22, term147134);
        setElement(term145863, 23, term147134);
        setElement(term145863, 24, term147134);
        setElement(term145863, 25, term147134);
        setElement(term145863, 26, term147134);
        setElement(term145863, 27, term147134);
        setElement(term145863, 28, term147134);
        setElement(term145863, 29, term147134);
        setElement(term145863, 30, term147134);
        setElement(term145863, 31, term147134);
        setElement(term145863, 32, term147134);
        setElement(term145863, 33, term147134);
        setElement(term145863, 34, term147134);
        setElement(term145863, 35, term147134);
        setElement(term145863, 36, term147134);
        setElement(term145863, 37, term147134);
        setElement(term145863, 38, term147134);
        setElement(term145863, 39, term147134);
        setElement(term145863, 40, term147134);
        setElement(term145863, 41, term147134);
        setElement(term145863, 42, term147134);
        setElement(term145863, 43, term147134);
        setElement(term145863, 44, term147134);
        setElement(term145863, 45, term147134);
        setElement(term145863, 46, term147134);
        setElement(term145863, 47, term147134);
        setElement(term145863, 48, term147134);
        setElement(term145863, 49, term147134);
        setElement(term145863, 50, term147134);
        setElement(term145863, 51, term147134);
        setElement(term145863, 52, term147134);
        setElement(term145863, 53, term147134);
        setElement(term145863, 54, term147134);
        setElement(term145863, 55, term147134);
        setElement(term145863, 56, term147134);
        setElement(term145863, 57, term147134);
        setElement(term145863, 58, term147134);
        setElement(term145863, 59, term147134);
        setElement(term145863, 60, term147134);
        setElement(term145863, 61, term147134);
        setElement(term145863, 62, term147134);
        setElement(term145863, 63, term147134);
        setElement(term145863, 64, term147134);
        setElement(term145863, 65, term147134);
        setElement(term145863, 66, term147134);
        setElement(term145863, 67, term147134);
        setElement(term145863, 68, term147134);
        setElement(term145863, 69, term147134);
        setElement(term145863, 70, term147134);
        setElement(term145863, 71, term147134);
        setElement(term145863, 72, term147134);
        setElement(term145863, 73, term147134);
        setElement(term145863, 74, term147134);
        setElement(term145863, 75, term147134);
        setElement(term145863, 76, term147134);
        setElement(term145863, 77, term147134);
        setElement(term145863, 78, term147134);
        setElement(term145863, 79, term147134);
        setElement(term145863, 80, term147134);
        setElement(term145863, 81, term147134);
        setElement(term145863, 82, term147134);
        setElement(term145863, 83, term147134);
        setElement(term145863, 84, term147134);
        setElement(term145863, 85, term147134);
        setElement(term145863, 86, term147134);
        setElement(term145863, 87, term147134);
        setElement(term145863, 88, term147134);
        setElement(term145863, 89, term147134);
        setElement(term145863, 90, term147134);
        setElement(term145863, 91, term147134);
        setElement(term145863, 92, term147134);
        setElement(term145863, 93, term147134);
        setElement(term145863, 94, term147134);
        setElement(term145863, 95, term147134);
        setElement(term145863, 96, term147134);
        setElement(term145863, 97, term147134);
        setElement(term145863, 98, term147134);
        setElement(term145863, 99, term147134);
        setElement(term145863, 100, term147134);
        setElement(term145863, 101, term147134);
        setElement(term145863, 102, term147134);
        setElement(term145863, 103, term147134);
        setElement(term145863, 104, term147134);
        setElement(term145863, 105, term147134);
        setElement(term145863, 106, term147134);
        setElement(term145863, 107, term147134);
        setElement(term145863, 108, term147134);
        setElement(term145863, 109, term147134);
        setElement(term145863, 110, term147134);
        setElement(term145863, 111, term147134);
        setElement(term145863, 112, term147134);
        setElement(term145863, 113, term147134);
        setElement(term145863, 114, term147134);
        setElement(term145863, 115, term147134);
        setElement(term145863, 116, term147134);
        setElement(term145863, 117, term147134);
        setElement(term145863, 118, term147134);
        setElement(term145863, 119, term147134);
        setElement(term145863, 120, term147134);
        setElement(term145863, 121, term147134);
        setElement(term145863, 122, term147134);
        setElement(term145863, 123, term147134);
        setElement(term145863, 124, term147134);
        setElement(term145863, 125, term147134);
        setElement(term145863, 126, term147134);
        setElement(term145863, 127, term147134);
        setField(term147018, term147018.getClass(), "simplex", term145863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term147018, args);
    }

};


