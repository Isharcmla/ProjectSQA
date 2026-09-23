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

public class MultiDirectional_iterateSimplex_43366462834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24457;

    public MultiDirectional_iterateSimplex_43366462834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24457 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term23370 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 256);
        Object term24573 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term23373 = (double[]) newDoubleArray(24);
        Object term24689 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term23399 = (double[]) newDoubleArray(512);
        setIntField(term24457, term24457.getClass(), "iterations", 2147483646);
        setIntField(term24457, term24457.getClass(), "maxIterations", 2147483647);
        setField(term24573, term24573.getClass(), "point", term23373);
        setElement(term23370, 0, term24573);
        setField(term24689, term24689.getClass(), "point", term23399);
        setElement(term23370, 1, term24689);
        setField(term24457, term24457.getClass(), "simplex", term23370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term24457, args);
    }

};


