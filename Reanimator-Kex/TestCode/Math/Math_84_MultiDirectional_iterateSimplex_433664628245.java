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

public class MultiDirectional_iterateSimplex_433664628245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319014;

    public MultiDirectional_iterateSimplex_433664628245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319014 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term316789 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term319130 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term316792 = (double[]) newDoubleArray(114);
        Object term319246 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term316908 = (double[]) newDoubleArray(120);
        setIntField(term319014, term319014.getClass(), "iterations", 2147483646);
        setIntField(term319014, term319014.getClass(), "maxIterations", 2147483647);
        setField(term319130, term319130.getClass(), "point", term316792);
        setElement(term316789, 0, term319130);
        setField(term319246, term319246.getClass(), "point", term316908);
        setElement(term316789, 1, term319246);
        setElement(term316789, 2, term319130);
        setElement(term316789, 3, term319130);
        setElement(term316789, 4, term319130);
        setElement(term316789, 5, term319130);
        setElement(term316789, 6, term319130);
        setElement(term316789, 7, term319130);
        setElement(term316789, 8, term319130);
        setElement(term316789, 9, term319130);
        setElement(term316789, 10, term319130);
        setElement(term316789, 11, term319130);
        setElement(term316789, 12, term319130);
        setElement(term316789, 13, term319130);
        setElement(term316789, 14, term319130);
        setElement(term316789, 15, term319130);
        setElement(term316789, 16, term319130);
        setElement(term316789, 17, term319130);
        setElement(term316789, 18, term319130);
        setElement(term316789, 19, term319130);
        setElement(term316789, 20, term319130);
        setElement(term316789, 21, term319130);
        setElement(term316789, 22, term319130);
        setElement(term316789, 23, term319130);
        setElement(term316789, 24, term319130);
        setElement(term316789, 25, term319130);
        setElement(term316789, 26, term319130);
        setElement(term316789, 27, term319130);
        setElement(term316789, 28, term319130);
        setElement(term316789, 29, term319130);
        setElement(term316789, 30, term319130);
        setElement(term316789, 31, term319130);
        setField(term319014, term319014.getClass(), "simplex", term316789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term319014, args);
    }

};


