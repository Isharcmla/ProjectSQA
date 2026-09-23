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

public class MultiDirectional_iterateSimplex_43366462892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105058;

    public MultiDirectional_iterateSimplex_43366462892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105058 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term103299 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 500);
        Object term105174 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term103302 = (double[]) newDoubleArray(86);
        Object term105290 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term103390 = (double[]) newDoubleArray(128);
        setIntField(term105058, term105058.getClass(), "iterations", 2147483646);
        setIntField(term105058, term105058.getClass(), "maxIterations", 2147483647);
        setField(term105174, term105174.getClass(), "point", term103302);
        setElement(term103299, 0, term105174);
        setField(term105290, term105290.getClass(), "point", term103390);
        setElement(term103299, 1, term105290);
        setField(term105058, term105058.getClass(), "simplex", term103299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term105058, args);
    }

};


