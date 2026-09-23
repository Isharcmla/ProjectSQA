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

public class MultiDirectional_iterateSimplex_43366462871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78463;

    public MultiDirectional_iterateSimplex_43366462871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78463 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term77317 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 256);
        Object term78579 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term77320 = (double[]) newDoubleArray(50);
        Object term78695 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term77372 = (double[]) newDoubleArray(128);
        setIntField(term78463, term78463.getClass(), "iterations", 2147483646);
        setIntField(term78463, term78463.getClass(), "maxIterations", 2147483647);
        setField(term78579, term78579.getClass(), "point", term77320);
        setElement(term77317, 0, term78579);
        setField(term78695, term78695.getClass(), "point", term77372);
        setElement(term77317, 1, term78695);
        setField(term78463, term78463.getClass(), "simplex", term77317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term78463, args);
    }

};


