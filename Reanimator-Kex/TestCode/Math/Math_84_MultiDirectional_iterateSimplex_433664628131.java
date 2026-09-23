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

public class MultiDirectional_iterateSimplex_433664628131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158307;

    public MultiDirectional_iterateSimplex_433664628131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158307 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term157327 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term158423 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term157330 = (double[]) newDoubleArray(44);
        Object term158539 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term157376 = (double[]) newDoubleArray(64);
        setIntField(term158307, term158307.getClass(), "iterations", 2147483646);
        setIntField(term158307, term158307.getClass(), "maxIterations", 2147483647);
        setField(term158423, term158423.getClass(), "point", term157330);
        setElement(term157327, 0, term158423);
        setField(term158539, term158539.getClass(), "point", term157376);
        setElement(term157327, 1, term158539);
        setElement(term157327, 2, term158423);
        setElement(term157327, 3, term158423);
        setElement(term157327, 4, term158423);
        setElement(term157327, 5, term158423);
        setElement(term157327, 6, term158423);
        setElement(term157327, 7, term158423);
        setElement(term157327, 8, term158423);
        setElement(term157327, 9, term158423);
        setElement(term157327, 10, term158423);
        setElement(term157327, 11, term158423);
        setElement(term157327, 12, term158423);
        setElement(term157327, 13, term158423);
        setElement(term157327, 14, term158423);
        setElement(term157327, 15, term158423);
        setField(term158307, term158307.getClass(), "simplex", term157327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term158307, args);
    }

};


