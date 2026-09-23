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

public class MultiDirectional_iterateSimplex_433664628208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264814;

    public MultiDirectional_iterateSimplex_433664628208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264814 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term263884 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term264930 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term263887 = (double[]) newDoubleArray(42);
        Object term265046 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term263931 = (double[]) newDoubleArray(48);
        setIntField(term264814, term264814.getClass(), "iterations", 2147483646);
        setIntField(term264814, term264814.getClass(), "maxIterations", 2147483647);
        setField(term264930, term264930.getClass(), "point", term263887);
        setElement(term263884, 0, term264930);
        setField(term265046, term265046.getClass(), "point", term263931);
        setElement(term263884, 1, term265046);
        setField(term264814, term264814.getClass(), "simplex", term263884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term264814, args);
    }

};


