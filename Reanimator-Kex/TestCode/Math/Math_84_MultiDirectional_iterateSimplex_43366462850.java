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

public class MultiDirectional_iterateSimplex_43366462850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46851;
     Object term47107;

    public MultiDirectional_iterateSimplex_43366462850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46851 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term46667 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 234);
        Object term46967 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term46669 = (double[]) newDoubleArray(0);
        setIntField(term46851, term46851.getClass(), "iterations", 2147483646);
        setIntField(term46851, term46851.getClass(), "maxIterations", 2147483647);
        setField(term46967, term46967.getClass(), "point", term46669);
        setDoubleField(term46967, term46967.getClass(), "value", -9.2233720024950374E18);
        setElement(term46667, 0, term46967);
        setField(term46851, term46851.getClass(), "simplex", term46667);
        term47107 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.DirectSearchOptimizer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = term47107;
        callMethod(klass, "iterateSimplex", argTypes, term46851, args);
    }

};


