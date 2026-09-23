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

public class MultiDirectional_iterateSimplex_43366462853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51595;

    public MultiDirectional_iterateSimplex_43366462853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51595 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term51045 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term51711 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term51048 = (double[]) newDoubleArray(15);
        Object term51827 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term51065 = (double[]) newDoubleArray(128);
        setIntField(term51595, term51595.getClass(), "iterations", 2147483646);
        setIntField(term51595, term51595.getClass(), "maxIterations", 2147483647);
        setField(term51711, term51711.getClass(), "point", term51048);
        setElement(term51045, 0, term51711);
        setField(term51827, term51827.getClass(), "point", term51065);
        setElement(term51045, 1, term51827);
        setElement(term51045, 2, term51711);
        setElement(term51045, 3, term51711);
        setElement(term51045, 5, term51711);
        setElement(term51045, 6, term51711);
        setElement(term51045, 7, term51711);
        setElement(term51045, 8, term51711);
        setElement(term51045, 9, term51711);
        setElement(term51045, 10, term51711);
        setElement(term51045, 11, term51711);
        setElement(term51045, 12, term51711);
        setElement(term51045, 13, term51711);
        setElement(term51045, 14, term51711);
        setElement(term51045, 15, term51711);
        setField(term51595, term51595.getClass(), "simplex", term51045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term51595, args);
    }

};


