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

public class MultiDirectional_iterateSimplex_43366462847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44429;

    public MultiDirectional_iterateSimplex_43366462847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44429 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term44182 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term44545 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term44185 = (double[]) newDoubleArray(4);
        Object term44661 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term44191 = (double[]) newDoubleArray(8);
        setIntField(term44429, term44429.getClass(), "iterations", 2147483646);
        setIntField(term44429, term44429.getClass(), "maxIterations", 2147483647);
        setField(term44545, term44545.getClass(), "point", term44185);
        setElement(term44182, 0, term44545);
        setField(term44661, term44661.getClass(), "point", term44191);
        setElement(term44182, 1, term44661);
        setElement(term44182, 2, term44545);
        setElement(term44182, 3, term44545);
        setElement(term44182, 5, term44545);
        setElement(term44182, 6, term44545);
        setElement(term44182, 7, term44545);
        setElement(term44182, 8, term44545);
        setElement(term44182, 9, term44545);
        setElement(term44182, 10, term44545);
        setElement(term44182, 11, term44545);
        setElement(term44182, 12, term44545);
        setElement(term44182, 13, term44545);
        setElement(term44182, 14, term44545);
        setElement(term44182, 15, term44545);
        setElement(term44182, 16, term44545);
        setElement(term44182, 17, term44545);
        setElement(term44182, 18, term44545);
        setElement(term44182, 19, term44545);
        setElement(term44182, 20, term44545);
        setElement(term44182, 21, term44545);
        setElement(term44182, 22, term44545);
        setElement(term44182, 23, term44545);
        setElement(term44182, 24, term44545);
        setElement(term44182, 25, term44545);
        setElement(term44182, 26, term44545);
        setElement(term44182, 27, term44545);
        setElement(term44182, 28, term44545);
        setElement(term44182, 29, term44545);
        setElement(term44182, 30, term44545);
        setElement(term44182, 31, term44545);
        setElement(term44182, 32, term44545);
        setElement(term44182, 33, term44545);
        setElement(term44182, 34, term44545);
        setElement(term44182, 35, term44545);
        setElement(term44182, 36, term44545);
        setElement(term44182, 37, term44545);
        setElement(term44182, 38, term44545);
        setElement(term44182, 39, term44545);
        setElement(term44182, 40, term44545);
        setElement(term44182, 41, term44545);
        setElement(term44182, 42, term44545);
        setElement(term44182, 43, term44545);
        setElement(term44182, 44, term44545);
        setElement(term44182, 45, term44545);
        setElement(term44182, 46, term44545);
        setElement(term44182, 47, term44545);
        setElement(term44182, 48, term44545);
        setElement(term44182, 49, term44545);
        setElement(term44182, 50, term44545);
        setElement(term44182, 51, term44545);
        setElement(term44182, 52, term44545);
        setElement(term44182, 53, term44545);
        setElement(term44182, 54, term44545);
        setElement(term44182, 55, term44545);
        setElement(term44182, 56, term44545);
        setElement(term44182, 57, term44545);
        setElement(term44182, 58, term44545);
        setElement(term44182, 59, term44545);
        setElement(term44182, 60, term44545);
        setElement(term44182, 61, term44545);
        setElement(term44182, 62, term44545);
        setElement(term44182, 63, term44545);
        setElement(term44182, 64, term44545);
        setElement(term44182, 65, term44545);
        setElement(term44182, 66, term44545);
        setElement(term44182, 67, term44545);
        setElement(term44182, 68, term44545);
        setElement(term44182, 69, term44545);
        setElement(term44182, 70, term44545);
        setElement(term44182, 71, term44545);
        setElement(term44182, 72, term44545);
        setElement(term44182, 73, term44545);
        setElement(term44182, 74, term44545);
        setElement(term44182, 75, term44545);
        setElement(term44182, 76, term44545);
        setElement(term44182, 77, term44545);
        setElement(term44182, 78, term44545);
        setElement(term44182, 79, term44545);
        setElement(term44182, 80, term44545);
        setElement(term44182, 81, term44545);
        setElement(term44182, 82, term44545);
        setElement(term44182, 83, term44545);
        setElement(term44182, 84, term44545);
        setElement(term44182, 85, term44545);
        setElement(term44182, 86, term44545);
        setElement(term44182, 87, term44545);
        setElement(term44182, 88, term44545);
        setElement(term44182, 89, term44545);
        setElement(term44182, 90, term44545);
        setElement(term44182, 91, term44545);
        setElement(term44182, 92, term44545);
        setElement(term44182, 93, term44545);
        setElement(term44182, 94, term44545);
        setElement(term44182, 95, term44545);
        setElement(term44182, 96, term44545);
        setElement(term44182, 97, term44545);
        setElement(term44182, 98, term44545);
        setElement(term44182, 99, term44545);
        setElement(term44182, 100, term44545);
        setElement(term44182, 101, term44545);
        setElement(term44182, 102, term44545);
        setElement(term44182, 103, term44545);
        setElement(term44182, 104, term44545);
        setElement(term44182, 105, term44545);
        setElement(term44182, 106, term44545);
        setElement(term44182, 107, term44545);
        setElement(term44182, 108, term44545);
        setElement(term44182, 109, term44545);
        setElement(term44182, 110, term44545);
        setElement(term44182, 111, term44545);
        setElement(term44182, 112, term44545);
        setElement(term44182, 113, term44545);
        setElement(term44182, 114, term44545);
        setElement(term44182, 115, term44545);
        setElement(term44182, 116, term44545);
        setElement(term44182, 117, term44545);
        setElement(term44182, 118, term44545);
        setElement(term44182, 119, term44545);
        setElement(term44182, 120, term44545);
        setElement(term44182, 121, term44545);
        setElement(term44182, 122, term44545);
        setElement(term44182, 123, term44545);
        setElement(term44182, 124, term44545);
        setElement(term44182, 125, term44545);
        setElement(term44182, 126, term44545);
        setElement(term44182, 127, term44545);
        setField(term44429, term44429.getClass(), "simplex", term44182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term44429, args);
    }

};


