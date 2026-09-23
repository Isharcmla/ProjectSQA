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

public class MultiDirectional_iterateSimplex_433664628150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187265;

    public MultiDirectional_iterateSimplex_433664628150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187265 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term185566 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term187381 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term185569 = (double[]) newDoubleArray(75);
        Object term187497 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term185646 = (double[]) newDoubleArray(256);
        setIntField(term187265, term187265.getClass(), "iterations", 2147483646);
        setIntField(term187265, term187265.getClass(), "maxIterations", 2147483647);
        setField(term187381, term187381.getClass(), "point", term185569);
        setElement(term185566, 0, term187381);
        setField(term187497, term187497.getClass(), "point", term185646);
        setElement(term185566, 1, term187497);
        setField(term187265, term187265.getClass(), "simplex", term185566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term187265, args);
    }

};


