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

public class MultiDirectional_iterateSimplex_433664628184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227704;

    public MultiDirectional_iterateSimplex_433664628184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227704 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term226711 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term227820 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term226714 = (double[]) newDoubleArray(41);
        Object term227936 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term226757 = (double[]) newDoubleArray(128);
        setIntField(term227704, term227704.getClass(), "iterations", 2147483646);
        setIntField(term227704, term227704.getClass(), "maxIterations", 2147483647);
        setField(term227820, term227820.getClass(), "point", term226714);
        setElement(term226711, 0, term227820);
        setField(term227936, term227936.getClass(), "point", term226757);
        setElement(term226711, 1, term227936);
        setField(term227704, term227704.getClass(), "simplex", term226711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term227704, args);
    }

};


