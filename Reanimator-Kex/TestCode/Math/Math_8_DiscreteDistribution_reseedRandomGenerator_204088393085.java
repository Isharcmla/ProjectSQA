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

public class DiscreteDistribution_reseedRandomGenerator_204088393085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49255;
     Object term49576;

    public DiscreteDistribution_reseedRandomGenerator_204088393085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49255 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term49351 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term49447 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term49543 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term49447, term49447.getClass(), "randomGenerator", term49543);
        setField(term49351, term49351.getClass(), "randomGenerator", term49447);
        setField(term49255, term49255.getClass(), "random", term49351);
        term49576 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term49577 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term49578 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term49579 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term49579, term49579.getClass(), "randomGenerator", null);
        setField(term49579, term49579.getClass(), "seed", null);
        setDoubleField(term49579, term49579.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term49579, term49579.getClass(), "haveNextNextGaussian", false);
        setField(term49578, term49578.getClass(), "randomGenerator", term49579);
        setField(term49578, term49578.getClass(), "seed", null);
        setDoubleField(term49578, term49578.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term49578, term49578.getClass(), "haveNextNextGaussian", false);
        setField(term49577, term49577.getClass(), "randomGenerator", term49578);
        setField(term49577, term49577.getClass(), "seed", null);
        setDoubleField(term49577, term49577.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term49577, term49577.getClass(), "haveNextNextGaussian", false);
        setField(term49576, term49576.getClass(), "random", term49577);
        setField(term49576, term49576.getClass(), "singletons", null);
        setField(term49576, term49576.getClass(), "probabilities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "reseedRandomGenerator", argTypes, term49255, args);
        assertTrue(recursiveEquals(term49255, term49576));
    }

};


