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
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Double;

public class DiscreteDistribution_init_7747176300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DiscreteDistribution_init_7747176300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6 = new Double(0.13238746331190498);
        Object term4 = newInstance(Class.forName("org.apache.commons.math3.util.Pair"));
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        setField(term4, term4.getClass(), "key", term5);
        setField(term4, term4.getClass(), "value", term6);
        Double term11 = new Double(0.3455959125047594);
        Object term9 = newInstance(Class.forName("org.apache.commons.math3.util.Pair"));
        Object term10 = newInstance(Class.forName("java.lang.Object"));
        setField(term9, term9.getClass(), "key", term10);
        setField(term9, term9.getClass(), "value", term11);
        Double term15 = new Double(0.5523635872663106);
        Object term14 = newInstance(Class.forName("org.apache.commons.math3.util.Pair"));
        setField(term14, term14.getClass(), "key", null);
        setField(term14, term14.getClass(), "value", term15);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term9);
        ((LinkedList) term1).add(term14);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


