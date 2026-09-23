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

public class MultiDirectional_iterateSimplex_43366462841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36893;

    public MultiDirectional_iterateSimplex_43366462841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36893 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term36308 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term37009 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term36311 = (double[]) newDoubleArray(17);
        Object term37125 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term36330 = (double[]) newDoubleArray(128);
        setIntField(term36893, term36893.getClass(), "iterations", 2147483646);
        setIntField(term36893, term36893.getClass(), "maxIterations", 2147483647);
        setField(term37009, term37009.getClass(), "point", term36311);
        setElement(term36308, 0, term37009);
        setField(term37125, term37125.getClass(), "point", term36330);
        setElement(term36308, 1, term37125);
        setField(term36893, term36893.getClass(), "simplex", term36308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term36893, args);
    }

};


