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

public class MultiDirectional_iterateSimplex_43366462899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115266;

    public MultiDirectional_iterateSimplex_43366462899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115266 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term114171 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 256);
        Object term115382 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term114174 = (double[]) newDoubleArray(47);
        Object term115498 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term114223 = (double[]) newDoubleArray(128);
        setIntField(term115266, term115266.getClass(), "iterations", 2147483646);
        setIntField(term115266, term115266.getClass(), "maxIterations", 2147483647);
        setField(term115382, term115382.getClass(), "point", term114174);
        setElement(term114171, 0, term115382);
        setField(term115498, term115498.getClass(), "point", term114223);
        setElement(term114171, 1, term115498);
        setField(term115266, term115266.getClass(), "simplex", term114171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term115266, args);
    }

};


