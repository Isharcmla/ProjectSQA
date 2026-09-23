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

public class MultiDirectional_iterateSimplex_433664628129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156126;

    public MultiDirectional_iterateSimplex_433664628129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156126 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term154840 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term156242 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term154843 = (double[]) newDoubleArray(62);
        Object term156358 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term154907 = (double[]) newDoubleArray(64);
        setIntField(term156126, term156126.getClass(), "iterations", 2147483646);
        setIntField(term156126, term156126.getClass(), "maxIterations", 2147483647);
        setField(term156242, term156242.getClass(), "point", term154843);
        setElement(term154840, 0, term156242);
        setField(term156358, term156358.getClass(), "point", term154907);
        setElement(term154840, 1, term156358);
        setField(term156126, term156126.getClass(), "simplex", term154840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term156126, args);
    }

};


