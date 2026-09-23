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

public class MultiDirectional_iterateSimplex_43366462895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109523;

    public MultiDirectional_iterateSimplex_43366462895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109523 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term108169 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term109639 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term108172 = (double[]) newDoubleArray(65);
        Object term109755 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term108239 = (double[]) newDoubleArray(80);
        setIntField(term109523, term109523.getClass(), "iterations", 2147483646);
        setIntField(term109523, term109523.getClass(), "maxIterations", 2147483647);
        setField(term109639, term109639.getClass(), "point", term108172);
        setElement(term108169, 0, term109639);
        setField(term109755, term109755.getClass(), "point", term108239);
        setElement(term108169, 1, term109755);
        setField(term109523, term109523.getClass(), "simplex", term108169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term109523, args);
    }

};


