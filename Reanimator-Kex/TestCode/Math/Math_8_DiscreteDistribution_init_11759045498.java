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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Double;

public class DiscreteDistribution_init_11759045498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;

    public DiscreteDistribution_init_11759045498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term29 = new Double(0.40176586625454525);
        Object term27 = newInstance(Class.forName("org.apache.commons.math3.util.Pair"));
        Object term28 = newInstance(Class.forName("java.lang.Object"));
        setField(term27, term27.getClass(), "key", term28);
        setField(term27, term27.getClass(), "value", term29);
        Double term34 = new Double(0.2641345529914265);
        Object term32 = newInstance(Class.forName("org.apache.commons.math3.util.Pair"));
        Object term33 = newInstance(Class.forName("java.lang.Object"));
        setField(term32, term32.getClass(), "key", term33);
        setField(term32, term32.getClass(), "value", term34);
        Double term38 = new Double(0.36923381893433327);
        Object term37 = newInstance(Class.forName("org.apache.commons.math3.util.Pair"));
        setField(term37, term37.getClass(), "key", null);
        setField(term37, term37.getClass(), "value", term38);
        term24 = new LinkedList();
        ((LinkedList) term24).add(term27);
        ((LinkedList) term24).add(term32);
        ((LinkedList) term24).add(term37);
        ((LinkedList) term24).add((Object)null);
        ((LinkedList) term24).add((Object)null);
        ((LinkedList) term24).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


