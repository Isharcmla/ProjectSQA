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
import java.util.ArrayList;

public class DiscreteDistribution_getSamples_78043274528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9077;
     Object term9308;
     Object term9302;

    public DiscreteDistribution_getSamples_78043274528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9077 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term8927 = (double[]) newDoubleArray(0);
        setField(term9077, term9077.getClass(), "probabilities", term8927);
        term9308 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term9309 = (double[]) newDoubleArray(0);
        setField(term9308, term9308.getClass(), "random", null);
        setField(term9308, term9308.getClass(), "singletons", null);
        setField(term9308, term9308.getClass(), "probabilities", term9309);
        term9302 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSamples", argTypes, term9077, args);
        assertTrue(recursiveEquals(term9077, term9308));
        assertTrue(recursiveEquals(retValue, term9302));
    }

};


