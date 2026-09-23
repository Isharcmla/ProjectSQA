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

public class MultiDirectional_iterateSimplex_43366462845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42665;

    public MultiDirectional_iterateSimplex_43366462845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42665 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term40611 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term42781 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term40614 = (double[]) newDoubleArray(96);
        Object term42897 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term40712 = (double[]) newDoubleArray(256);
        setIntField(term42665, term42665.getClass(), "iterations", 2147483646);
        setIntField(term42665, term42665.getClass(), "maxIterations", 2147483647);
        setField(term42781, term42781.getClass(), "point", term40614);
        setElement(term40611, 0, term42781);
        setField(term42897, term42897.getClass(), "point", term40712);
        setElement(term40611, 1, term42897);
        setElement(term40611, 2, term42781);
        setElement(term40611, 3, term42781);
        setElement(term40611, 4, term42781);
        setElement(term40611, 5, term42781);
        setElement(term40611, 6, term42781);
        setElement(term40611, 7, term42781);
        setElement(term40611, 8, term42781);
        setElement(term40611, 9, term42781);
        setElement(term40611, 10, term42781);
        setElement(term40611, 11, term42781);
        setElement(term40611, 12, term42781);
        setElement(term40611, 13, term42781);
        setElement(term40611, 14, term42781);
        setElement(term40611, 15, term42781);
        setElement(term40611, 16, term42781);
        setElement(term40611, 17, term42781);
        setElement(term40611, 18, term42781);
        setElement(term40611, 19, term42781);
        setElement(term40611, 20, term42781);
        setElement(term40611, 21, term42781);
        setElement(term40611, 22, term42781);
        setElement(term40611, 23, term42781);
        setElement(term40611, 24, term42781);
        setElement(term40611, 25, term42781);
        setElement(term40611, 26, term42781);
        setElement(term40611, 27, term42781);
        setElement(term40611, 28, term42781);
        setElement(term40611, 29, term42781);
        setElement(term40611, 30, term42781);
        setElement(term40611, 31, term42781);
        setElement(term40611, 32, term42781);
        setElement(term40611, 33, term42781);
        setElement(term40611, 34, term42781);
        setElement(term40611, 35, term42781);
        setElement(term40611, 36, term42781);
        setElement(term40611, 37, term42781);
        setElement(term40611, 38, term42781);
        setElement(term40611, 39, term42781);
        setElement(term40611, 40, term42781);
        setElement(term40611, 41, term42781);
        setElement(term40611, 42, term42781);
        setElement(term40611, 43, term42781);
        setElement(term40611, 44, term42781);
        setElement(term40611, 45, term42781);
        setElement(term40611, 46, term42781);
        setElement(term40611, 47, term42781);
        setElement(term40611, 48, term42781);
        setElement(term40611, 49, term42781);
        setElement(term40611, 50, term42781);
        setElement(term40611, 51, term42781);
        setElement(term40611, 52, term42781);
        setElement(term40611, 53, term42781);
        setElement(term40611, 54, term42781);
        setElement(term40611, 55, term42781);
        setElement(term40611, 56, term42781);
        setElement(term40611, 57, term42781);
        setElement(term40611, 58, term42781);
        setElement(term40611, 59, term42781);
        setElement(term40611, 60, term42781);
        setElement(term40611, 61, term42781);
        setElement(term40611, 62, term42781);
        setElement(term40611, 63, term42781);
        setElement(term40611, 64, term42781);
        setElement(term40611, 65, term42781);
        setElement(term40611, 66, term42781);
        setElement(term40611, 67, term42781);
        setElement(term40611, 68, term42781);
        setElement(term40611, 69, term42781);
        setElement(term40611, 70, term42781);
        setElement(term40611, 71, term42781);
        setElement(term40611, 72, term42781);
        setElement(term40611, 73, term42781);
        setElement(term40611, 74, term42781);
        setElement(term40611, 75, term42781);
        setElement(term40611, 76, term42781);
        setElement(term40611, 77, term42781);
        setElement(term40611, 78, term42781);
        setElement(term40611, 79, term42781);
        setElement(term40611, 80, term42781);
        setElement(term40611, 81, term42781);
        setElement(term40611, 82, term42781);
        setElement(term40611, 83, term42781);
        setElement(term40611, 84, term42781);
        setElement(term40611, 85, term42781);
        setElement(term40611, 86, term42781);
        setElement(term40611, 87, term42781);
        setElement(term40611, 88, term42781);
        setElement(term40611, 89, term42781);
        setElement(term40611, 90, term42781);
        setElement(term40611, 91, term42781);
        setElement(term40611, 92, term42781);
        setElement(term40611, 93, term42781);
        setElement(term40611, 94, term42781);
        setElement(term40611, 95, term42781);
        setElement(term40611, 96, term42781);
        setElement(term40611, 97, term42781);
        setElement(term40611, 98, term42781);
        setElement(term40611, 99, term42781);
        setElement(term40611, 100, term42781);
        setElement(term40611, 101, term42781);
        setElement(term40611, 102, term42781);
        setElement(term40611, 103, term42781);
        setElement(term40611, 104, term42781);
        setElement(term40611, 105, term42781);
        setElement(term40611, 106, term42781);
        setElement(term40611, 107, term42781);
        setElement(term40611, 108, term42781);
        setElement(term40611, 109, term42781);
        setElement(term40611, 110, term42781);
        setElement(term40611, 111, term42781);
        setElement(term40611, 112, term42781);
        setElement(term40611, 113, term42781);
        setElement(term40611, 114, term42781);
        setElement(term40611, 115, term42781);
        setElement(term40611, 116, term42781);
        setElement(term40611, 117, term42781);
        setElement(term40611, 118, term42781);
        setElement(term40611, 119, term42781);
        setElement(term40611, 120, term42781);
        setElement(term40611, 121, term42781);
        setElement(term40611, 122, term42781);
        setElement(term40611, 123, term42781);
        setElement(term40611, 124, term42781);
        setElement(term40611, 125, term42781);
        setElement(term40611, 126, term42781);
        setElement(term40611, 127, term42781);
        setField(term42665, term42665.getClass(), "simplex", term40611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term42665, args);
    }

};


