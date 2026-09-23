package org.apache.commons.math3.distribution;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Double;

public class DiscreteDistribution_init_117590454921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3486;
     Object term3540;

    public DiscreteDistribution_init_117590454921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3396 = new ArrayList();
        Object term3344 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        setField(term3344, term3344.getClass(), "random", null);
        setField(term3344, term3344.getClass(), "singletons", term3396);
        term3486 = newInstance(Class.forName("org.apache.commons.math3.random.Well44497b"));
        ArrayList term3754 = new ArrayList();
        Double term3800 = new Double(0.0);
        Object term3702 = newInstance(Class.forName("org.apache.commons.math3.optimization.PointValuePair"));
        setField(term3702, term3702.getClass(), "key", term3754);
        setField(term3702, term3702.getClass(), "value", term3800);
        term3540 = new LinkedList();
        ((LinkedList) term3540).add(term3702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3486;
        args[1] = term3540;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


