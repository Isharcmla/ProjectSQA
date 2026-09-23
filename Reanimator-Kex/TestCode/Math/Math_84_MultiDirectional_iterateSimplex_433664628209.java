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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiDirectional_iterateSimplex_433664628209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263400;

    public MultiDirectional_iterateSimplex_433664628209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263400 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term261356 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 13);
        Object term263516 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term261359 = (double[]) newDoubleArray(128);
        Object term263632 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term261489 = (double[]) newDoubleArray(119);
        setIntField(term263400, term263400.getClass(), "iterations", 2147483646);
        setIntField(term263400, term263400.getClass(), "maxIterations", 2147483647);
        setField(term263516, term263516.getClass(), "point", term261359);
        setElement(term261356, 0, term263516);
        setField(term263632, term263632.getClass(), "point", term261489);
        setElement(term261356, 1, term263632);
        setElement(term261356, 2, term263516);
        setElement(term261356, 3, term263516);
        setElement(term261356, 5, term263516);
        setElement(term261356, 6, term263516);
        setElement(term261356, 7, term263516);
        setElement(term261356, 8, term263516);
        setElement(term261356, 9, term263516);
        setElement(term261356, 10, term263516);
        setElement(term261356, 11, term263516);
        setElement(term261356, 12, term263516);
        setField(term263400, term263400.getClass(), "simplex", term261356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "iterateSimplex", argTypes, term263400, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


