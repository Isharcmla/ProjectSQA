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

public class MultiDirectional_iterateSimplex_43366462838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31057;

    public MultiDirectional_iterateSimplex_43366462838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31057 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term29699 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term31173 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term29702 = (double[]) newDoubleArray(40);
        Object term31289 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term29744 = (double[]) newDoubleArray(512);
        setIntField(term31057, term31057.getClass(), "iterations", 2147483646);
        setIntField(term31057, term31057.getClass(), "maxIterations", 2147483647);
        setField(term31173, term31173.getClass(), "point", term29702);
        setElement(term29699, 0, term31173);
        setField(term31289, term31289.getClass(), "point", term29744);
        setElement(term29699, 1, term31289);
        setElement(term29699, 2, term31173);
        setElement(term29699, 3, term31173);
        setElement(term29699, 4, term31173);
        setElement(term29699, 5, term31173);
        setElement(term29699, 6, term31173);
        setElement(term29699, 7, term31173);
        setElement(term29699, 8, term31173);
        setElement(term29699, 9, term31173);
        setElement(term29699, 10, term31173);
        setElement(term29699, 11, term31173);
        setElement(term29699, 12, term31173);
        setElement(term29699, 13, term31173);
        setElement(term29699, 14, term31173);
        setElement(term29699, 15, term31173);
        setElement(term29699, 16, term31173);
        setElement(term29699, 17, term31173);
        setElement(term29699, 18, term31173);
        setElement(term29699, 19, term31173);
        setElement(term29699, 20, term31173);
        setElement(term29699, 21, term31173);
        setElement(term29699, 22, term31173);
        setElement(term29699, 23, term31173);
        setElement(term29699, 24, term31173);
        setElement(term29699, 25, term31173);
        setElement(term29699, 26, term31173);
        setElement(term29699, 27, term31173);
        setElement(term29699, 28, term31173);
        setElement(term29699, 29, term31173);
        setElement(term29699, 30, term31173);
        setElement(term29699, 31, term31173);
        setElement(term29699, 32, term31173);
        setElement(term29699, 33, term31173);
        setElement(term29699, 34, term31173);
        setElement(term29699, 35, term31173);
        setElement(term29699, 36, term31173);
        setElement(term29699, 37, term31173);
        setElement(term29699, 38, term31173);
        setElement(term29699, 39, term31173);
        setElement(term29699, 40, term31173);
        setElement(term29699, 41, term31173);
        setElement(term29699, 42, term31173);
        setElement(term29699, 43, term31173);
        setElement(term29699, 44, term31173);
        setElement(term29699, 45, term31173);
        setElement(term29699, 46, term31173);
        setElement(term29699, 47, term31173);
        setElement(term29699, 48, term31173);
        setElement(term29699, 49, term31173);
        setElement(term29699, 50, term31173);
        setElement(term29699, 51, term31173);
        setElement(term29699, 52, term31173);
        setElement(term29699, 53, term31173);
        setElement(term29699, 54, term31173);
        setElement(term29699, 55, term31173);
        setElement(term29699, 56, term31173);
        setElement(term29699, 57, term31173);
        setElement(term29699, 58, term31173);
        setElement(term29699, 59, term31173);
        setElement(term29699, 60, term31173);
        setElement(term29699, 61, term31173);
        setElement(term29699, 62, term31173);
        setElement(term29699, 63, term31173);
        setElement(term29699, 64, term31173);
        setElement(term29699, 65, term31173);
        setElement(term29699, 66, term31173);
        setElement(term29699, 67, term31173);
        setElement(term29699, 68, term31173);
        setElement(term29699, 69, term31173);
        setElement(term29699, 70, term31173);
        setElement(term29699, 71, term31173);
        setElement(term29699, 72, term31173);
        setElement(term29699, 73, term31173);
        setElement(term29699, 74, term31173);
        setElement(term29699, 75, term31173);
        setElement(term29699, 76, term31173);
        setElement(term29699, 77, term31173);
        setElement(term29699, 78, term31173);
        setElement(term29699, 79, term31173);
        setElement(term29699, 80, term31173);
        setElement(term29699, 81, term31173);
        setElement(term29699, 82, term31173);
        setElement(term29699, 83, term31173);
        setElement(term29699, 84, term31173);
        setElement(term29699, 85, term31173);
        setElement(term29699, 86, term31173);
        setElement(term29699, 87, term31173);
        setElement(term29699, 88, term31173);
        setElement(term29699, 89, term31173);
        setElement(term29699, 90, term31173);
        setElement(term29699, 91, term31173);
        setElement(term29699, 92, term31173);
        setElement(term29699, 93, term31173);
        setElement(term29699, 94, term31173);
        setElement(term29699, 95, term31173);
        setElement(term29699, 96, term31173);
        setElement(term29699, 97, term31173);
        setElement(term29699, 98, term31173);
        setElement(term29699, 99, term31173);
        setElement(term29699, 100, term31173);
        setElement(term29699, 101, term31173);
        setElement(term29699, 102, term31173);
        setElement(term29699, 103, term31173);
        setElement(term29699, 104, term31173);
        setElement(term29699, 105, term31173);
        setElement(term29699, 106, term31173);
        setElement(term29699, 107, term31173);
        setElement(term29699, 108, term31173);
        setElement(term29699, 109, term31173);
        setElement(term29699, 110, term31173);
        setElement(term29699, 111, term31173);
        setElement(term29699, 112, term31173);
        setElement(term29699, 113, term31173);
        setElement(term29699, 114, term31173);
        setElement(term29699, 115, term31173);
        setElement(term29699, 116, term31173);
        setElement(term29699, 117, term31173);
        setElement(term29699, 118, term31173);
        setElement(term29699, 119, term31173);
        setElement(term29699, 120, term31173);
        setElement(term29699, 121, term31173);
        setElement(term29699, 122, term31173);
        setElement(term29699, 123, term31173);
        setElement(term29699, 124, term31173);
        setElement(term29699, 125, term31173);
        setElement(term29699, 126, term31173);
        setElement(term29699, 127, term31173);
        setField(term31057, term31057.getClass(), "simplex", term29699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term31057, args);
    }

};


