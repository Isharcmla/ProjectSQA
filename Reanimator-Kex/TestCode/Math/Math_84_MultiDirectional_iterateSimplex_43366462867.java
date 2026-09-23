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

public class MultiDirectional_iterateSimplex_43366462867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72657;

    public MultiDirectional_iterateSimplex_43366462867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72657 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term71204 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term72773 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term71207 = (double[]) newDoubleArray(70);
        Object term72889 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term71279 = (double[]) newDoubleArray(96);
        setIntField(term72657, term72657.getClass(), "iterations", 2147483646);
        setIntField(term72657, term72657.getClass(), "maxIterations", 2147483647);
        setField(term72773, term72773.getClass(), "point", term71207);
        setElement(term71204, 0, term72773);
        setField(term72889, term72889.getClass(), "point", term71279);
        setElement(term71204, 1, term72889);
        setField(term72657, term72657.getClass(), "simplex", term71204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term72657, args);
    }

};


