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

public class MultiDirectional_iterateSimplex_433664628171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207417;

    public MultiDirectional_iterateSimplex_433664628171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207417 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term206619 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term207533 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term206622 = (double[]) newDoubleArray(22);
        Object term207649 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term206646 = (double[]) newDoubleArray(256);
        setIntField(term207417, term207417.getClass(), "iterations", 2147483646);
        setIntField(term207417, term207417.getClass(), "maxIterations", 2147483647);
        setField(term207533, term207533.getClass(), "point", term206622);
        setElement(term206619, 0, term207533);
        setField(term207649, term207649.getClass(), "point", term206646);
        setElement(term206619, 1, term207649);
        setElement(term206619, 2, term207533);
        setElement(term206619, 3, term207533);
        setElement(term206619, 4, term207533);
        setElement(term206619, 5, term207533);
        setElement(term206619, 6, term207533);
        setElement(term206619, 7, term207533);
        setElement(term206619, 8, term207533);
        setElement(term206619, 9, term207533);
        setElement(term206619, 10, term207533);
        setElement(term206619, 11, term207533);
        setElement(term206619, 12, term207533);
        setElement(term206619, 13, term207533);
        setElement(term206619, 14, term207533);
        setElement(term206619, 15, term207533);
        setElement(term206619, 16, term207533);
        setElement(term206619, 17, term207533);
        setElement(term206619, 18, term207533);
        setElement(term206619, 19, term207533);
        setElement(term206619, 20, term207533);
        setElement(term206619, 21, term207533);
        setElement(term206619, 22, term207533);
        setElement(term206619, 23, term207533);
        setElement(term206619, 24, term207533);
        setElement(term206619, 25, term207533);
        setElement(term206619, 26, term207533);
        setElement(term206619, 27, term207533);
        setElement(term206619, 28, term207533);
        setElement(term206619, 29, term207533);
        setElement(term206619, 30, term207533);
        setElement(term206619, 31, term207533);
        setElement(term206619, 32, term207533);
        setElement(term206619, 33, term207533);
        setElement(term206619, 34, term207533);
        setElement(term206619, 35, term207533);
        setElement(term206619, 36, term207533);
        setElement(term206619, 37, term207533);
        setElement(term206619, 38, term207533);
        setElement(term206619, 39, term207533);
        setElement(term206619, 40, term207533);
        setElement(term206619, 41, term207533);
        setElement(term206619, 42, term207533);
        setElement(term206619, 43, term207533);
        setElement(term206619, 44, term207533);
        setElement(term206619, 45, term207533);
        setElement(term206619, 46, term207533);
        setElement(term206619, 47, term207533);
        setElement(term206619, 48, term207533);
        setElement(term206619, 49, term207533);
        setElement(term206619, 50, term207533);
        setElement(term206619, 51, term207533);
        setElement(term206619, 52, term207533);
        setElement(term206619, 53, term207533);
        setElement(term206619, 54, term207533);
        setElement(term206619, 55, term207533);
        setElement(term206619, 56, term207533);
        setElement(term206619, 57, term207533);
        setElement(term206619, 58, term207533);
        setElement(term206619, 59, term207533);
        setElement(term206619, 60, term207533);
        setElement(term206619, 61, term207533);
        setElement(term206619, 62, term207533);
        setElement(term206619, 63, term207533);
        setField(term207417, term207417.getClass(), "simplex", term206619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term207417, args);
    }

};


