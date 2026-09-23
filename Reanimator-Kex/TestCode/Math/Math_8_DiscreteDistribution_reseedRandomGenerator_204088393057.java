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
import static org.apache.commons.math3.distribution.EqualityUtils.*;
import java.lang.Object;

public class DiscreteDistribution_reseedRandomGenerator_204088393057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34480;
     Object term34692;

    public DiscreteDistribution_reseedRandomGenerator_204088393057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34480 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term34576 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term34672 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term34576, term34576.getClass(), "randomGenerator", term34672);
        setField(term34480, term34480.getClass(), "random", term34576);
        term34692 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term34693 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term34694 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term34694, term34694.getClass(), "randomGenerator", null);
        setField(term34694, term34694.getClass(), "seed", null);
        setDoubleField(term34694, term34694.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term34694, term34694.getClass(), "haveNextNextGaussian", false);
        setField(term34693, term34693.getClass(), "randomGenerator", term34694);
        setField(term34693, term34693.getClass(), "seed", null);
        setDoubleField(term34693, term34693.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term34693, term34693.getClass(), "haveNextNextGaussian", false);
        setField(term34692, term34692.getClass(), "random", term34693);
        setField(term34692, term34692.getClass(), "singletons", null);
        setField(term34692, term34692.getClass(), "probabilities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "reseedRandomGenerator", argTypes, term34480, args);
        assertTrue(recursiveEquals(term34480, term34692));
    }

};


