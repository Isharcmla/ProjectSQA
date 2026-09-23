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

public class FDistribution_isSupportLowerBoundInclusive_29153541529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term2374;

    public FDistribution_isSupportLowerBoundInclusive_29153541529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term117 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term118 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term111, term111.getClass(), "numeratorDegreesOfFreedom", 0.3227335400819148);
        setDoubleField(term111, term111.getClass(), "denominatorDegreesOfFreedom", 0.43337207054070237);
        setDoubleField(term111, term111.getClass(), "solverAbsoluteAccuracy", 0.11179067076100713);
        setDoubleField(term111, term111.getClass(), "numericalVariance", 0.9126850255993704);
        setBooleanField(term111, term111.getClass(), "numericalVarianceIsCalculated", false);
        setField(term118, term118.getClass(), "rand", null);
        setField(term118, term118.getClass(), "secRand", null);
        setField(term117, term117.getClass(), "delegate", term118);
        setField(term111, term111.getClass(), "randomData", term117);
        setField(term111, term111.getClass(), "random", null);
        term2374 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2375 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2376 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2374, term2374.getClass(), "numeratorDegreesOfFreedom", 0.3227335400819148);
        setDoubleField(term2374, term2374.getClass(), "denominatorDegreesOfFreedom", 0.43337207054070237);
        setDoubleField(term2374, term2374.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2374, term2374.getClass(), "numericalVariance", 0.9126850255993704);
        setBooleanField(term2374, term2374.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2376, term2376.getClass(), "rand", null);
        setField(term2376, term2376.getClass(), "secRand", null);
        setField(term2375, term2375.getClass(), "delegate", term2376);
        setField(term2374, term2374.getClass(), "randomData", term2375);
        setField(term2374, term2374.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSupportLowerBoundInclusive", argTypes, term111, args);
        assertTrue(recursiveEquals(term111, term2374));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


