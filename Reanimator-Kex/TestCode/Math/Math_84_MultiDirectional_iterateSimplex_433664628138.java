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

public class MultiDirectional_iterateSimplex_433664628138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169805;

    public MultiDirectional_iterateSimplex_433664628138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169805 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term169514 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 256);
        Object term169921 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term169516 = (double[]) newDoubleArray(7);
        setIntField(term169805, term169805.getClass(), "iterations", 2147483646);
        setIntField(term169805, term169805.getClass(), "maxIterations", 2147483647);
        setField(term169921, term169921.getClass(), "point", term169516);
        setElement(term169514, 0, term169921);
        setElement(term169514, 1, term169921);
        setField(term169805, term169805.getClass(), "simplex", term169514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term169805, args);
    }

};


