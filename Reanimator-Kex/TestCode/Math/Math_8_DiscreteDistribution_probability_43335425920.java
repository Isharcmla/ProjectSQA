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

public class DiscreteDistribution_probability_43335425920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3126;
     Object term4979;

    public DiscreteDistribution_probability_43335425920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3126 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term2991 = (double[]) newDoubleArray(0);
        setField(term3126, term3126.getClass(), "probabilities", term2991);
        term4979 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term4980 = (double[]) newDoubleArray(0);
        setField(term4979, term4979.getClass(), "random", null);
        setField(term4979, term4979.getClass(), "singletons", null);
        setField(term4979, term4979.getClass(), "probabilities", term4980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "probability", argTypes, term3126, args);
        assertTrue(recursiveEquals(term3126, term4979));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


