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

public class MultiDirectional_iterateSimplex_433664628166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203490;

    public MultiDirectional_iterateSimplex_433664628166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203490 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term201758 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 12);
        Object term203606 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term201761 = (double[]) newDoubleArray(87);
        Object term203722 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term201850 = (double[]) newDoubleArray(87);
        setIntField(term203490, term203490.getClass(), "iterations", 2147483646);
        setIntField(term203490, term203490.getClass(), "maxIterations", 2147483647);
        setField(term203606, term203606.getClass(), "point", term201761);
        setElement(term201758, 0, term203606);
        setField(term203722, term203722.getClass(), "point", term201850);
        setElement(term201758, 1, term203722);
        setField(term203490, term203490.getClass(), "simplex", term201758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term203490, args);
    }

};


