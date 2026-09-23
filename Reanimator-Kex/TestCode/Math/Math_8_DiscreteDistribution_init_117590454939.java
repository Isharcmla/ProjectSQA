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
import java.util.LinkedList;
import java.lang.Double;

public class DiscreteDistribution_init_117590454939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19439;

    public DiscreteDistribution_init_117590454939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19385 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        setField(term19385, term19385.getClass(), "random", null);
        setField(term19385, term19385.getClass(), "singletons", null);
        Double term19743 = new Double(0.0);
        Object term19601 = newInstance(Class.forName("org.apache.commons.math3.optimization.PointValuePair"));
        Object term19697 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term19601, term19601.getClass(), "key", term19697);
        setField(term19601, term19601.getClass(), "value", term19743);
        term19439 = new LinkedList();
        ((LinkedList) term19439).add(term19601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19439;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


