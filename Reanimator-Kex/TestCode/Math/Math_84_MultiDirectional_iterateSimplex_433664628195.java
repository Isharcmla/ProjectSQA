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

public class MultiDirectional_iterateSimplex_433664628195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245177;

    public MultiDirectional_iterateSimplex_433664628195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245177 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term243486 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term245293 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term243489 = (double[]) newDoubleArray(82);
        Object term245409 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term243573 = (double[]) newDoubleArray(128);
        setIntField(term245177, term245177.getClass(), "iterations", 2147483646);
        setIntField(term245177, term245177.getClass(), "maxIterations", 2147483647);
        setField(term245293, term245293.getClass(), "point", term243489);
        setElement(term243486, 0, term245293);
        setField(term245409, term245409.getClass(), "point", term243573);
        setElement(term243486, 1, term245409);
        setElement(term243486, 2, term245293);
        setElement(term243486, 3, term245293);
        setElement(term243486, 4, term245293);
        setElement(term243486, 5, term245293);
        setElement(term243486, 6, term245293);
        setElement(term243486, 7, term245293);
        setElement(term243486, 8, term245293);
        setElement(term243486, 9, term245293);
        setElement(term243486, 10, term245293);
        setElement(term243486, 11, term245293);
        setElement(term243486, 12, term245293);
        setElement(term243486, 13, term245293);
        setElement(term243486, 14, term245293);
        setElement(term243486, 15, term245293);
        setElement(term243486, 17, term245293);
        setElement(term243486, 18, term245293);
        setElement(term243486, 19, term245293);
        setElement(term243486, 20, term245293);
        setElement(term243486, 21, term245293);
        setElement(term243486, 22, term245293);
        setElement(term243486, 23, term245293);
        setElement(term243486, 24, term245293);
        setElement(term243486, 25, term245293);
        setElement(term243486, 26, term245293);
        setElement(term243486, 27, term245293);
        setElement(term243486, 28, term245293);
        setElement(term243486, 29, term245293);
        setElement(term243486, 30, term245293);
        setElement(term243486, 31, term245293);
        setElement(term243486, 32, term245293);
        setElement(term243486, 33, term245293);
        setElement(term243486, 34, term245293);
        setElement(term243486, 35, term245293);
        setElement(term243486, 36, term245293);
        setElement(term243486, 37, term245293);
        setElement(term243486, 38, term245293);
        setElement(term243486, 39, term245293);
        setElement(term243486, 40, term245293);
        setElement(term243486, 41, term245293);
        setElement(term243486, 42, term245293);
        setElement(term243486, 43, term245293);
        setElement(term243486, 44, term245293);
        setElement(term243486, 45, term245293);
        setElement(term243486, 46, term245293);
        setElement(term243486, 47, term245293);
        setElement(term243486, 48, term245293);
        setElement(term243486, 49, term245293);
        setElement(term243486, 50, term245293);
        setElement(term243486, 51, term245293);
        setElement(term243486, 52, term245293);
        setElement(term243486, 53, term245293);
        setElement(term243486, 54, term245293);
        setElement(term243486, 55, term245293);
        setElement(term243486, 56, term245293);
        setElement(term243486, 57, term245293);
        setElement(term243486, 58, term245293);
        setElement(term243486, 59, term245293);
        setElement(term243486, 60, term245293);
        setElement(term243486, 61, term245293);
        setElement(term243486, 62, term245293);
        setElement(term243486, 63, term245293);
        setField(term245177, term245177.getClass(), "simplex", term243486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term245177, args);
    }

};


