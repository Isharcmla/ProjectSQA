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

public class MultiDirectional_iterateSimplex_433664628188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233657;

    public MultiDirectional_iterateSimplex_433664628188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233657 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term232265 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term233773 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term232268 = (double[]) newDoubleArray(68);
        Object term233889 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term232338 = (double[]) newDoubleArray(68);
        setIntField(term233657, term233657.getClass(), "iterations", 2147483646);
        setIntField(term233657, term233657.getClass(), "maxIterations", 2147483647);
        setField(term233773, term233773.getClass(), "point", term232268);
        setElement(term232265, 0, term233773);
        setField(term233889, term233889.getClass(), "point", term232338);
        setElement(term232265, 1, term233889);
        setElement(term232265, 2, term233773);
        setElement(term232265, 3, term233773);
        setElement(term232265, 5, term233773);
        setElement(term232265, 6, term233773);
        setElement(term232265, 7, term233773);
        setElement(term232265, 8, term233773);
        setElement(term232265, 9, term233773);
        setElement(term232265, 10, term233773);
        setElement(term232265, 11, term233773);
        setElement(term232265, 12, term233773);
        setElement(term232265, 13, term233773);
        setElement(term232265, 14, term233773);
        setElement(term232265, 15, term233773);
        setElement(term232265, 16, term233773);
        setElement(term232265, 17, term233773);
        setElement(term232265, 18, term233773);
        setElement(term232265, 19, term233773);
        setElement(term232265, 20, term233773);
        setElement(term232265, 21, term233773);
        setElement(term232265, 22, term233773);
        setElement(term232265, 23, term233773);
        setElement(term232265, 24, term233773);
        setElement(term232265, 25, term233773);
        setElement(term232265, 26, term233773);
        setElement(term232265, 27, term233773);
        setElement(term232265, 28, term233773);
        setElement(term232265, 29, term233773);
        setElement(term232265, 30, term233773);
        setElement(term232265, 31, term233773);
        setElement(term232265, 32, term233773);
        setElement(term232265, 33, term233773);
        setElement(term232265, 34, term233773);
        setElement(term232265, 35, term233773);
        setElement(term232265, 36, term233773);
        setElement(term232265, 37, term233773);
        setElement(term232265, 38, term233773);
        setElement(term232265, 39, term233773);
        setElement(term232265, 40, term233773);
        setElement(term232265, 41, term233773);
        setElement(term232265, 42, term233773);
        setElement(term232265, 43, term233773);
        setElement(term232265, 44, term233773);
        setElement(term232265, 45, term233773);
        setElement(term232265, 46, term233773);
        setElement(term232265, 47, term233773);
        setElement(term232265, 48, term233773);
        setElement(term232265, 49, term233773);
        setElement(term232265, 50, term233773);
        setElement(term232265, 51, term233773);
        setElement(term232265, 52, term233773);
        setElement(term232265, 53, term233773);
        setElement(term232265, 54, term233773);
        setElement(term232265, 55, term233773);
        setElement(term232265, 56, term233773);
        setElement(term232265, 57, term233773);
        setElement(term232265, 58, term233773);
        setElement(term232265, 59, term233773);
        setElement(term232265, 60, term233773);
        setElement(term232265, 61, term233773);
        setElement(term232265, 62, term233773);
        setElement(term232265, 63, term233773);
        setField(term233657, term233657.getClass(), "simplex", term232265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term233657, args);
    }

};


