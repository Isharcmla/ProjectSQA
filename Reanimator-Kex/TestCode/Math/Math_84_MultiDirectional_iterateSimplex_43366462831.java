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

public class MultiDirectional_iterateSimplex_43366462831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21132;

    public MultiDirectional_iterateSimplex_43366462831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21132 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term20682 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 512);
        Object term21248 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term20685 = (double[]) newDoubleArray(9);
        Object term21364 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term20696 = (double[]) newDoubleArray(128);
        setIntField(term21132, term21132.getClass(), "iterations", 2147483646);
        setIntField(term21132, term21132.getClass(), "maxIterations", 2147483647);
        setField(term21248, term21248.getClass(), "point", term20685);
        setElement(term20682, 0, term21248);
        setField(term21364, term21364.getClass(), "point", term20696);
        setElement(term20682, 1, term21364);
        setField(term21132, term21132.getClass(), "simplex", term20682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term21132, args);
    }

};


