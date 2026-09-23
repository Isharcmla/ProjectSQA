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

public class MultiDirectional_iterateSimplex_43366462874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82172;

    public MultiDirectional_iterateSimplex_43366462874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82172 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term81581 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term82288 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term81584 = (double[]) newDoubleArray(23);
        Object term82404 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term81609 = (double[]) newDoubleArray(32);
        setIntField(term82172, term82172.getClass(), "iterations", 2147483646);
        setIntField(term82172, term82172.getClass(), "maxIterations", 2147483647);
        setField(term82288, term82288.getClass(), "point", term81584);
        setElement(term81581, 0, term82288);
        setField(term82404, term82404.getClass(), "point", term81609);
        setElement(term81581, 1, term82404);
        setField(term82172, term82172.getClass(), "simplex", term81581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term82172, args);
    }

};


