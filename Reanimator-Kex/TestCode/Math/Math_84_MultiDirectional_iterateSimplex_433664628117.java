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

public class MultiDirectional_iterateSimplex_433664628117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140144;

    public MultiDirectional_iterateSimplex_433664628117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140144 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term138545 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term140260 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term138548 = (double[]) newDoubleArray(54);
        Object term140376 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term138604 = (double[]) newDoubleArray(512);
        setIntField(term140144, term140144.getClass(), "iterations", 2147483646);
        setIntField(term140144, term140144.getClass(), "maxIterations", 2147483647);
        setField(term140260, term140260.getClass(), "point", term138548);
        setElement(term138545, 0, term140260);
        setField(term140376, term140376.getClass(), "point", term138604);
        setElement(term138545, 1, term140376);
        setField(term140144, term140144.getClass(), "simplex", term138545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term140144, args);
    }

};


