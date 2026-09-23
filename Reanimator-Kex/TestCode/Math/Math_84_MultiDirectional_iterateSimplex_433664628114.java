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

public class MultiDirectional_iterateSimplex_433664628114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135671;

    public MultiDirectional_iterateSimplex_433664628114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135671 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term134543 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 512);
        Object term135787 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term134546 = (double[]) newDoubleArray(49);
        Object term135903 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term134597 = (double[]) newDoubleArray(128);
        setIntField(term135671, term135671.getClass(), "iterations", 2147483646);
        setIntField(term135671, term135671.getClass(), "maxIterations", 2147483647);
        setField(term135787, term135787.getClass(), "point", term134546);
        setElement(term134543, 0, term135787);
        setField(term135903, term135903.getClass(), "point", term134597);
        setElement(term134543, 1, term135903);
        setField(term135671, term135671.getClass(), "simplex", term134543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term135671, args);
    }

};


