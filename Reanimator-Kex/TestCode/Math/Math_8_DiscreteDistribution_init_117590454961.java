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

public class DiscreteDistribution_init_117590454961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37159;
     Object term37213;

    public DiscreteDistribution_init_117590454961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37069 = new ArrayList();
        Object term37017 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        setField(term37017, term37017.getClass(), "random", null);
        setField(term37017, term37017.getClass(), "singletons", term37069);
        term37159 = newInstance(Class.forName("org.apache.commons.math3.random.Well19937c"));
        Double term37459 = new Double(0.0);
        Object term37375 = newInstance(Class.forName("org.apache.commons.math3.optimization.PointValuePair"));
        Object term37413 = newInstance(Class.forName("java.lang.Object"));
        setField(term37375, term37375.getClass(), "key", term37413);
        setField(term37375, term37375.getClass(), "value", term37459);
        term37213 = new LinkedList();
        ((LinkedList) term37213).add(term37375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term37159;
        args[1] = term37213;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


