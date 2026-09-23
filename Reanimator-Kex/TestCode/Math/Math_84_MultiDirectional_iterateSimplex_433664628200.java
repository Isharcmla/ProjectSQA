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

public class MultiDirectional_iterateSimplex_433664628200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251295;

    public MultiDirectional_iterateSimplex_433664628200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251295 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term249508 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 256);
        Object term251411 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term249511 = (double[]) newDoubleArray(90);
        Object term251527 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term249603 = (double[]) newDoubleArray(90);
        setIntField(term251295, term251295.getClass(), "iterations", 2147483646);
        setIntField(term251295, term251295.getClass(), "maxIterations", 2147483647);
        setField(term251411, term251411.getClass(), "point", term249511);
        setElement(term249508, 0, term251411);
        setField(term251527, term251527.getClass(), "point", term249603);
        setElement(term249508, 1, term251527);
        setField(term251295, term251295.getClass(), "simplex", term249508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term251295, args);
    }

};


