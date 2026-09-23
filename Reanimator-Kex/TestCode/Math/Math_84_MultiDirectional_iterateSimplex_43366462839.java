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

public class MultiDirectional_iterateSimplex_43366462839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33756;

    public MultiDirectional_iterateSimplex_43366462839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33756 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term31846 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term33872 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term31849 = (double[]) newDoubleArray(95);
        Object term33988 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term31946 = (double[]) newDoubleArray(128);
        setIntField(term33756, term33756.getClass(), "iterations", 2147483646);
        setIntField(term33756, term33756.getClass(), "maxIterations", 2147483647);
        setField(term33872, term33872.getClass(), "point", term31849);
        setElement(term31846, 0, term33872);
        setField(term33988, term33988.getClass(), "point", term31946);
        setElement(term31846, 1, term33988);
        setField(term33756, term33756.getClass(), "simplex", term31846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term33756, args);
    }

};


