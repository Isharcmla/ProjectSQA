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

public class MultiDirectional_iterateSimplex_433664628161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196917;

    public MultiDirectional_iterateSimplex_433664628161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196917 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term196605 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 4);
        Object term197033 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term196608 = (double[]) newDoubleArray(8);
        Object term197149 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term196618 = (double[]) newDoubleArray(8);
        setIntField(term196917, term196917.getClass(), "iterations", 2147483646);
        setIntField(term196917, term196917.getClass(), "maxIterations", 2147483647);
        setField(term197033, term197033.getClass(), "point", term196608);
        setElement(term196605, 0, term197033);
        setField(term197149, term197149.getClass(), "point", term196618);
        setElement(term196605, 1, term197149);
        setElement(term196605, 2, term197033);
        setElement(term196605, 3, term197033);
        setField(term196917, term196917.getClass(), "simplex", term196605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term196917, args);
    }

};


