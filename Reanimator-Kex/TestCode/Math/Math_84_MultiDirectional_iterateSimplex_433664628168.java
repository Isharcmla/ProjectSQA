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

public class MultiDirectional_iterateSimplex_433664628168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204848;

    public MultiDirectional_iterateSimplex_433664628168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204848 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term204443 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term204964 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term204446 = (double[]) newDoubleArray(13);
        Object term205080 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term204461 = (double[]) newDoubleArray(16);
        setIntField(term204848, term204848.getClass(), "iterations", 2147483646);
        setIntField(term204848, term204848.getClass(), "maxIterations", 2147483647);
        setField(term204964, term204964.getClass(), "point", term204446);
        setElement(term204443, 0, term204964);
        setField(term205080, term205080.getClass(), "point", term204461);
        setElement(term204443, 1, term205080);
        setField(term204848, term204848.getClass(), "simplex", term204443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term204848, args);
    }

};


