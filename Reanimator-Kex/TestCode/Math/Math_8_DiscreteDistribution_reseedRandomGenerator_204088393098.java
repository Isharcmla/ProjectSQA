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
import java.lang.Object;

public class DiscreteDistribution_reseedRandomGenerator_204088393098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58880;

    public DiscreteDistribution_reseedRandomGenerator_204088393098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58880 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term58976 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term59072 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term59162 = newInstance(Class.forName("org.apache.commons.math3.random.Well19937a"));
        setField(term59072, term59072.getClass(), "randomGenerator", term59162);
        setField(term58976, term58976.getClass(), "randomGenerator", term59072);
        setField(term58880, term58880.getClass(), "random", term58976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "reseedRandomGenerator", argTypes, term58880, args);
    }

};


