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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiDirectional_iterateSimplex_43366462824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10639;

    public MultiDirectional_iterateSimplex_43366462824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10639 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term10479 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 489);
        Object term10755 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term10481 = (double[]) newDoubleArray(0);
        setIntField(term10639, term10639.getClass(), "iterations", 2147483646);
        setIntField(term10639, term10639.getClass(), "maxIterations", 2147483647);
        setField(term10755, term10755.getClass(), "point", term10481);
        setElement(term10479, 0, term10755);
        setField(term10639, term10639.getClass(), "simplex", term10479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "iterateSimplex", argTypes, term10639, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


