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

public class MultiDirectional_iterateSimplex_43366462891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102714;

    public MultiDirectional_iterateSimplex_43366462891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102714 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term100724 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 9);
        Object term102830 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term100727 = (double[]) newDoubleArray(92);
        Object term102946 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term100821 = (double[]) newDoubleArray(256);
        setIntField(term102714, term102714.getClass(), "iterations", 2147483646);
        setIntField(term102714, term102714.getClass(), "maxIterations", 2147483647);
        setField(term102830, term102830.getClass(), "point", term100727);
        setElement(term100724, 0, term102830);
        setField(term102946, term102946.getClass(), "point", term100821);
        setElement(term100724, 1, term102946);
        setField(term102714, term102714.getClass(), "simplex", term100724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term102714, args);
    }

};


