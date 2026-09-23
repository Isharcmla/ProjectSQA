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

public class MultiDirectional_iterateSimplex_433664628153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190165;

    public MultiDirectional_iterateSimplex_433664628153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190165 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term189877 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 512);
        Object term190281 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term189880 = (double[]) newDoubleArray(6);
        Object term190397 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term189888 = (double[]) newDoubleArray(16);
        setIntField(term190165, term190165.getClass(), "iterations", 2147483646);
        setIntField(term190165, term190165.getClass(), "maxIterations", 2147483647);
        setField(term190281, term190281.getClass(), "point", term189880);
        setElement(term189877, 0, term190281);
        setField(term190397, term190397.getClass(), "point", term189888);
        setElement(term189877, 1, term190397);
        setField(term190165, term190165.getClass(), "simplex", term189877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term190165, args);
    }

};


