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

public class MultiDirectional_iterateSimplex_43366462813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220;

    public MultiDirectional_iterateSimplex_43366462813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term3997 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 512);
        Object term4336 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term4000 = (double[]) newDoubleArray(1);
        Object term4452 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term4003 = (double[]) newDoubleArray(32);
        setIntField(term4220, term4220.getClass(), "iterations", 2147483646);
        setIntField(term4220, term4220.getClass(), "maxIterations", 2147483647);
        setField(term4336, term4336.getClass(), "point", term4000);
        setElement(term3997, 0, term4336);
        setField(term4452, term4452.getClass(), "point", term4003);
        setElement(term3997, 1, term4452);
        setField(term4220, term4220.getClass(), "simplex", term3997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term4220, args);
    }

};


