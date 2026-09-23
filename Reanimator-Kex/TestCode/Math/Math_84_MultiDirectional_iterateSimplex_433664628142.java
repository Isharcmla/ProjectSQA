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

public class MultiDirectional_iterateSimplex_433664628142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174159;

    public MultiDirectional_iterateSimplex_433664628142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174159 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term172923 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 512);
        Object term174275 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term172926 = (double[]) newDoubleArray(59);
        Object term174391 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term172987 = (double[]) newDoubleArray(64);
        setIntField(term174159, term174159.getClass(), "iterations", 2147483646);
        setIntField(term174159, term174159.getClass(), "maxIterations", 2147483647);
        setField(term174275, term174275.getClass(), "point", term172926);
        setElement(term172923, 0, term174275);
        setField(term174391, term174391.getClass(), "point", term172987);
        setElement(term172923, 1, term174391);
        setField(term174159, term174159.getClass(), "simplex", term172923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term174159, args);
    }

};


