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

public class MultiDirectional_iterateSimplex_43366462873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81212;

    public MultiDirectional_iterateSimplex_43366462873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81212 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term79858 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term81328 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term79861 = (double[]) newDoubleArray(66);
        Object term81444 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term79929 = (double[]) newDoubleArray(66);
        setIntField(term81212, term81212.getClass(), "iterations", 2147483646);
        setIntField(term81212, term81212.getClass(), "maxIterations", 2147483647);
        setField(term81328, term81328.getClass(), "point", term79861);
        setElement(term79858, 0, term81328);
        setField(term81444, term81444.getClass(), "point", term79929);
        setElement(term79858, 1, term81444);
        setField(term81212, term81212.getClass(), "simplex", term79858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term81212, args);
    }

};


