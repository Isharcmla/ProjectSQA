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

public class MultiDirectional_iterateSimplex_43366462816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5581;

    public MultiDirectional_iterateSimplex_43366462816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5581 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term5376 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 4);
        Object term5697 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term5379 = (double[]) newDoubleArray(2);
        Object term5813 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term5383 = (double[]) newDoubleArray(2);
        setIntField(term5581, term5581.getClass(), "iterations", 2147483646);
        setIntField(term5581, term5581.getClass(), "maxIterations", 2147483647);
        setField(term5697, term5697.getClass(), "point", term5379);
        setElement(term5376, 0, term5697);
        setField(term5813, term5813.getClass(), "point", term5383);
        setElement(term5376, 1, term5813);
        setElement(term5376, 2, term5697);
        setElement(term5376, 3, term5697);
        setField(term5581, term5581.getClass(), "simplex", term5376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term5581, args);
    }

};


