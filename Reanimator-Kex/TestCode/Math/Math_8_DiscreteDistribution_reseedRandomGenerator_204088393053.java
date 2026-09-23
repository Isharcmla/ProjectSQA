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

public class DiscreteDistribution_reseedRandomGenerator_204088393053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31191;
     Object term31297;

    public DiscreteDistribution_reseedRandomGenerator_204088393053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31191 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term31287 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term31191, term31191.getClass(), "random", term31287);
        term31297 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term31298 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term31298, term31298.getClass(), "randomGenerator", null);
        setField(term31298, term31298.getClass(), "seed", null);
        setDoubleField(term31298, term31298.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term31298, term31298.getClass(), "haveNextNextGaussian", false);
        setField(term31297, term31297.getClass(), "random", term31298);
        setField(term31297, term31297.getClass(), "singletons", null);
        setField(term31297, term31297.getClass(), "probabilities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "reseedRandomGenerator", argTypes, term31191, args);
        assertTrue(recursiveEquals(term31191, term31297));
    }

};


