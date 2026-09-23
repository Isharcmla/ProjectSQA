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

public class MultiDirectional_iterateSimplex_43366462855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54363;

    public MultiDirectional_iterateSimplex_43366462855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54363 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term52815 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term54479 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term52818 = (double[]) newDoubleArray(51);
        Object term54595 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term52871 = (double[]) newDoubleArray(512);
        setIntField(term54363, term54363.getClass(), "iterations", 2147483646);
        setIntField(term54363, term54363.getClass(), "maxIterations", 2147483647);
        setField(term54479, term54479.getClass(), "point", term52818);
        setElement(term52815, 0, term54479);
        setField(term54595, term54595.getClass(), "point", term52871);
        setElement(term52815, 1, term54595);
        setField(term54363, term54363.getClass(), "simplex", term52815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term54363, args);
    }

};


