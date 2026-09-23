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

public class MultiDirectional_iterateSimplex_433664628193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240648;

    public MultiDirectional_iterateSimplex_433664628193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240648 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term239439 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term240764 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term239442 = (double[]) newDoubleArray(31);
        Object term240880 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term239475 = (double[]) newDoubleArray(512);
        setIntField(term240648, term240648.getClass(), "iterations", 2147483646);
        setIntField(term240648, term240648.getClass(), "maxIterations", 2147483647);
        setField(term240764, term240764.getClass(), "point", term239442);
        setElement(term239439, 0, term240764);
        setField(term240880, term240880.getClass(), "point", term239475);
        setElement(term239439, 1, term240880);
        setField(term240648, term240648.getClass(), "simplex", term239439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term240648, args);
    }

};


