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

public class MultiDirectional_iterateSimplex_433664628133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161509;

    public MultiDirectional_iterateSimplex_433664628133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161509 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term159418 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 497);
        Object term161625 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term159421 = (double[]) newDoubleArray(83);
        Object term161741 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term159506 = (double[]) newDoubleArray(512);
        setIntField(term161509, term161509.getClass(), "iterations", 2147483646);
        setIntField(term161509, term161509.getClass(), "maxIterations", 2147483647);
        setField(term161625, term161625.getClass(), "point", term159421);
        setElement(term159418, 0, term161625);
        setField(term161741, term161741.getClass(), "point", term159506);
        setElement(term159418, 1, term161741);
        setField(term161509, term161509.getClass(), "simplex", term159418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term161509, args);
    }

};


