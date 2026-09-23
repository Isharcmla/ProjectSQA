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

public class MultiDirectional_iterateSimplex_43366462862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63415;

    public MultiDirectional_iterateSimplex_43366462862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63415 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term61358 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term63531 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term61361 = (double[]) newDoubleArray(81);
        Object term63647 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term61444 = (double[]) newDoubleArray(512);
        setIntField(term63415, term63415.getClass(), "iterations", 2147483646);
        setIntField(term63415, term63415.getClass(), "maxIterations", 2147483647);
        setField(term63531, term63531.getClass(), "point", term61361);
        setElement(term61358, 0, term63531);
        setField(term63647, term63647.getClass(), "point", term61444);
        setElement(term61358, 1, term63647);
        setElement(term61358, 2, term63531);
        setElement(term61358, 3, term63531);
        setElement(term61358, 4, term63531);
        setElement(term61358, 5, term63531);
        setElement(term61358, 6, term63531);
        setElement(term61358, 7, term63531);
        setField(term63415, term63415.getClass(), "simplex", term61358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term63415, args);
    }

};


