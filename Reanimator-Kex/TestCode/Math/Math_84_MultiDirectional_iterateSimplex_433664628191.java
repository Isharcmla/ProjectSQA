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

public class MultiDirectional_iterateSimplex_433664628191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236656;

    public MultiDirectional_iterateSimplex_433664628191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236656 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term235634 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term236772 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term235637 = (double[]) newDoubleArray(20);
        Object term236888 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term235659 = (double[]) newDoubleArray(512);
        setIntField(term236656, term236656.getClass(), "iterations", 2147483646);
        setIntField(term236656, term236656.getClass(), "maxIterations", 2147483647);
        setField(term236772, term236772.getClass(), "point", term235637);
        setElement(term235634, 0, term236772);
        setField(term236888, term236888.getClass(), "point", term235659);
        setElement(term235634, 1, term236888);
        setField(term236656, term236656.getClass(), "simplex", term235634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term236656, args);
    }

};


