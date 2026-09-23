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

public class MultiDirectional_iterateSimplex_433664628106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127302;

    public MultiDirectional_iterateSimplex_433664628106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127302 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term127039 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term127418 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term127042 = (double[]) newDoubleArray(5);
        Object term127534 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term127049 = (double[]) newDoubleArray(8);
        setIntField(term127302, term127302.getClass(), "iterations", 2147483646);
        setIntField(term127302, term127302.getClass(), "maxIterations", 2147483647);
        setField(term127418, term127418.getClass(), "point", term127042);
        setElement(term127039, 0, term127418);
        setField(term127534, term127534.getClass(), "point", term127049);
        setElement(term127039, 1, term127534);
        setField(term127302, term127302.getClass(), "simplex", term127039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term127302, args);
    }

};


