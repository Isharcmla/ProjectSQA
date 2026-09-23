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

public class MultiDirectional_iterateSimplex_433664628223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287706;

    public MultiDirectional_iterateSimplex_433664628223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287706 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term286507 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term287822 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term286510 = (double[]) newDoubleArray(53);
        Object term287938 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term286565 = (double[]) newDoubleArray(128);
        setIntField(term287706, term287706.getClass(), "iterations", 2147483646);
        setIntField(term287706, term287706.getClass(), "maxIterations", 2147483647);
        setField(term287822, term287822.getClass(), "point", term286510);
        setElement(term286507, 0, term287822);
        setField(term287938, term287938.getClass(), "point", term286565);
        setElement(term286507, 1, term287938);
        setField(term287706, term287706.getClass(), "simplex", term286507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term287706, args);
    }

};


