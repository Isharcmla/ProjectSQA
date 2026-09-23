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

public class MultiDirectional_iterateSimplex_433664628118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142403;

    public MultiDirectional_iterateSimplex_433664628118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142403 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term140947 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term142519 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term140950 = (double[]) newDoubleArray(71);
        Object term142635 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term141023 = (double[]) newDoubleArray(80);
        setIntField(term142403, term142403.getClass(), "iterations", 2147483646);
        setIntField(term142403, term142403.getClass(), "maxIterations", 2147483647);
        setField(term142519, term142519.getClass(), "point", term140950);
        setElement(term140947, 0, term142519);
        setField(term142635, term142635.getClass(), "point", term141023);
        setElement(term140947, 1, term142635);
        setField(term142403, term142403.getClass(), "simplex", term140947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term142403, args);
    }

};


