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
import java.lang.ClassCastException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Double;

public class DiscreteDistribution_init_117590454925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7576;

    public DiscreteDistribution_init_117590454925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7522 = new ArrayList();
        Object term7382 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term7470 = newInstance(Class.forName("org.apache.commons.math3.random.Well1024a"));
        setField(term7382, term7382.getClass(), "random", term7470);
        setField(term7382, term7382.getClass(), "singletons", term7522);
        Double term7782 = new Double(0.0);
        Object term7736 = newInstance(Class.forName("org.apache.commons.math3.optim.PointVectorValuePair"));
        setField(term7736, term7736.getClass(), "key", null);
        setField(term7736, term7736.getClass(), "value", term7782);
        Double term7924 = new Double(-8.6469112845513523E18);
        Object term7878 = newInstance(Class.forName("org.apache.commons.math3.optim.PointValuePair"));
        setField(term7878, term7878.getClass(), "key", null);
        setField(term7878, term7878.getClass(), "value", term7924);
        term7576 = new LinkedList();
        ((LinkedList) term7576).add(term7736);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
        ((LinkedList) term7576).add(term7878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7576;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


