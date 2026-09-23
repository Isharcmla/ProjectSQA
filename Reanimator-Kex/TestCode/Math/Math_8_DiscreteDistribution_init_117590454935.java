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
import org.apache.commons.math3.exception.NotPositiveException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Double;

public class DiscreteDistribution_init_117590454935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12889;

    public DiscreteDistribution_init_117590454935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13349 = new ArrayList();
        Object term13280 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term13323 = newInstance(Class.forName("org.apache.commons.math3.random.Well512a"));
        setField(term13280, term13280.getClass(), "random", term13323);
        setField(term13280, term13280.getClass(), "singletons", term13349);
        Double term13219 = new Double(-9.1873432398358118E18);
        Object term13051 = newInstance(Class.forName("org.apache.commons.math3.optimization.PointValuePair"));
        Object term13173 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        setField(term13051, term13051.getClass(), "key", term13173);
        setField(term13051, term13051.getClass(), "value", term13219);
        term12889 = new LinkedList();
        ((LinkedList) term12889).add(term13051);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
        ((LinkedList) term12889).add(term13280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12889;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NotPositiveException e) {
        }

    }

};


