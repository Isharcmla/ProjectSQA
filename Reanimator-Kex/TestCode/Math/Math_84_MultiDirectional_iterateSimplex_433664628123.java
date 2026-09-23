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

public class MultiDirectional_iterateSimplex_433664628123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149612;

    public MultiDirectional_iterateSimplex_433664628123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149612 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term148892 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 256);
        Object term149728 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term148895 = (double[]) newDoubleArray(25);
        Object term149844 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term148922 = (double[]) newDoubleArray(128);
        setIntField(term149612, term149612.getClass(), "iterations", 2147483646);
        setIntField(term149612, term149612.getClass(), "maxIterations", 2147483647);
        setField(term149728, term149728.getClass(), "point", term148895);
        setElement(term148892, 0, term149728);
        setField(term149844, term149844.getClass(), "point", term148922);
        setElement(term148892, 1, term149844);
        setField(term149612, term149612.getClass(), "simplex", term148892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term149612, args);
    }

};


