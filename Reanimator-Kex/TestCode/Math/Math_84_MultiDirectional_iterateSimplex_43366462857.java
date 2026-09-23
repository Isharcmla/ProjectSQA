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

public class MultiDirectional_iterateSimplex_43366462857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58169;

    public MultiDirectional_iterateSimplex_43366462857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58169 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term57299 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term58285 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term57302 = (double[]) newDoubleArray(39);
        Object term58401 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term57343 = (double[]) newDoubleArray(40);
        setIntField(term58169, term58169.getClass(), "iterations", 2147483646);
        setIntField(term58169, term58169.getClass(), "maxIterations", 2147483647);
        setField(term58285, term58285.getClass(), "point", term57302);
        setElement(term57299, 0, term58285);
        setField(term58401, term58401.getClass(), "point", term57343);
        setElement(term57299, 1, term58401);
        setField(term58169, term58169.getClass(), "simplex", term57299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term58169, args);
    }

};


