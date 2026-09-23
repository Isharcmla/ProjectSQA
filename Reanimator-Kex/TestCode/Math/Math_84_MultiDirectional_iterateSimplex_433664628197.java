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

public class MultiDirectional_iterateSimplex_433664628197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247205;

    public MultiDirectional_iterateSimplex_433664628197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247205 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term246734 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term247321 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term246737 = (double[]) newDoubleArray(14);
        Object term247437 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term246753 = (double[]) newDoubleArray(64);
        setIntField(term247205, term247205.getClass(), "iterations", 2147483646);
        setIntField(term247205, term247205.getClass(), "maxIterations", 2147483647);
        setField(term247321, term247321.getClass(), "point", term246737);
        setElement(term246734, 0, term247321);
        setField(term247437, term247437.getClass(), "point", term246753);
        setElement(term246734, 1, term247437);
        setField(term247205, term247205.getClass(), "simplex", term246734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term247205, args);
    }

};


