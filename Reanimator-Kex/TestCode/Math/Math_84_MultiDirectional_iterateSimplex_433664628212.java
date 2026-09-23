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

public class MultiDirectional_iterateSimplex_433664628212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272628;

    public MultiDirectional_iterateSimplex_433664628212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272628 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term270521 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term272744 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term270524 = (double[]) newDoubleArray(99);
        Object term272860 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term270625 = (double[]) newDoubleArray(256);
        setIntField(term272628, term272628.getClass(), "iterations", 2147483646);
        setIntField(term272628, term272628.getClass(), "maxIterations", 2147483647);
        setField(term272744, term272744.getClass(), "point", term270524);
        setElement(term270521, 0, term272744);
        setField(term272860, term272860.getClass(), "point", term270625);
        setElement(term270521, 1, term272860);
        setField(term272628, term272628.getClass(), "simplex", term270521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term272628, args);
    }

};


