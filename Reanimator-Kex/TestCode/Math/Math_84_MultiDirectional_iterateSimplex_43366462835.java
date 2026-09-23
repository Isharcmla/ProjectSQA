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

public class MultiDirectional_iterateSimplex_43366462835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26482;

    public MultiDirectional_iterateSimplex_43366462835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26482 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term25230 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term26598 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term25233 = (double[]) newDoubleArray(60);
        Object term26714 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term25295 = (double[]) newDoubleArray(64);
        setIntField(term26482, term26482.getClass(), "iterations", 2147483646);
        setIntField(term26482, term26482.getClass(), "maxIterations", 2147483647);
        setField(term26598, term26598.getClass(), "point", term25233);
        setElement(term25230, 0, term26598);
        setField(term26714, term26714.getClass(), "point", term25295);
        setElement(term25230, 1, term26714);
        setField(term26482, term26482.getClass(), "simplex", term25230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term26482, args);
    }

};


