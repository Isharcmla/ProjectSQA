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

public class MultiDirectional_iterateSimplex_43366462861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60957;

    public MultiDirectional_iterateSimplex_43366462861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60957 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term60050 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term61073 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term60053 = (double[]) newDoubleArray(36);
        Object term61189 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term60091 = (double[]) newDoubleArray(128);
        setIntField(term60957, term60957.getClass(), "iterations", 2147483646);
        setIntField(term60957, term60957.getClass(), "maxIterations", 2147483647);
        setField(term61073, term61073.getClass(), "point", term60053);
        setElement(term60050, 0, term61073);
        setField(term61189, term61189.getClass(), "point", term60091);
        setElement(term60050, 1, term61189);
        setElement(term60050, 2, term61073);
        setElement(term60050, 3, term61073);
        setElement(term60050, 4, term61073);
        setElement(term60050, 5, term61073);
        setElement(term60050, 6, term61073);
        setElement(term60050, 7, term61073);
        setElement(term60050, 8, term61073);
        setElement(term60050, 9, term61073);
        setElement(term60050, 10, term61073);
        setElement(term60050, 11, term61073);
        setElement(term60050, 12, term61073);
        setElement(term60050, 13, term61073);
        setElement(term60050, 14, term61073);
        setElement(term60050, 15, term61073);
        setField(term60957, term60957.getClass(), "simplex", term60050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term60957, args);
    }

};


