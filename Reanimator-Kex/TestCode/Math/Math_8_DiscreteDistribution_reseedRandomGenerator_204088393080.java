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

public class DiscreteDistribution_reseedRandomGenerator_204088393080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47345;

    public DiscreteDistribution_reseedRandomGenerator_204088393080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47345 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term47441 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term47531 = newInstance(Class.forName("org.apache.commons.math3.random.Well19937c"));
        setField(term47441, term47441.getClass(), "randomGenerator", term47531);
        setField(term47345, term47345.getClass(), "random", term47441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "reseedRandomGenerator", argTypes, term47345, args);
    }

};


