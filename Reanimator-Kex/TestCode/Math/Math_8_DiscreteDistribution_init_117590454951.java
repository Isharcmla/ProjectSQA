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
import java.lang.NullPointerException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class DiscreteDistribution_init_117590454951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29775;
     Object term29829;

    public DiscreteDistribution_init_117590454951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29679 = new ArrayList();
        Object term29627 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        setField(term29627, term29627.getClass(), "random", null);
        setField(term29627, term29627.getClass(), "singletons", term29679);
        term29775 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term30003 = newInstance(Class.forName("org.apache.commons.math3.optimization.PointVectorValuePair"));
        term29829 = new LinkedList();
        ((LinkedList) term29829).add(term30003);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
        ((LinkedList) term29829).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term29775;
        args[1] = term29829;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


