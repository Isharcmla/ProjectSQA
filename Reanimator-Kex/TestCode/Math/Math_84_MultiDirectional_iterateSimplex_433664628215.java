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

public class MultiDirectional_iterateSimplex_433664628215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277970;

    public MultiDirectional_iterateSimplex_433664628215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277970 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term277092 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term278086 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term277095 = (double[]) newDoubleArray(38);
        Object term278202 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term277135 = (double[]) newDoubleArray(64);
        setIntField(term277970, term277970.getClass(), "iterations", 2147483646);
        setIntField(term277970, term277970.getClass(), "maxIterations", 2147483647);
        setField(term278086, term278086.getClass(), "point", term277095);
        setElement(term277092, 0, term278086);
        setField(term278202, term278202.getClass(), "point", term277135);
        setElement(term277092, 1, term278202);
        setField(term277970, term277970.getClass(), "simplex", term277092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term277970, args);
    }

};


