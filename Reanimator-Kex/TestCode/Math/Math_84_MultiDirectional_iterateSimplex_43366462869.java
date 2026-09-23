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

public class MultiDirectional_iterateSimplex_43366462869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75385;

    public MultiDirectional_iterateSimplex_43366462869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75385 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term74024 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term75501 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term74027 = (double[]) newDoubleArray(55);
        Object term75617 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term74084 = (double[]) newDoubleArray(256);
        setIntField(term75385, term75385.getClass(), "iterations", 2147483646);
        setIntField(term75385, term75385.getClass(), "maxIterations", 2147483647);
        setField(term75501, term75501.getClass(), "point", term74027);
        setElement(term74024, 0, term75501);
        setField(term75617, term75617.getClass(), "point", term74084);
        setElement(term74024, 1, term75617);
        setField(term75385, term75385.getClass(), "simplex", term74024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term75385, args);
    }

};


