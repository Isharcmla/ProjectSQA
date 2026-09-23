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

public class MultiDirectional_iterateSimplex_433664628219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283415;

    public MultiDirectional_iterateSimplex_433664628219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283415 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term282541 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term283531 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term282544 = (double[]) newDoubleArray(34);
        Object term283647 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term282580 = (double[]) newDoubleArray(128);
        setIntField(term283415, term283415.getClass(), "iterations", 2147483646);
        setIntField(term283415, term283415.getClass(), "maxIterations", 2147483647);
        setField(term283531, term283531.getClass(), "point", term282544);
        setElement(term282541, 0, term283531);
        setField(term283647, term283647.getClass(), "point", term282580);
        setElement(term282541, 1, term283647);
        setField(term283415, term283415.getClass(), "simplex", term282541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term283415, args);
    }

};


