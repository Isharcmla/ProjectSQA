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

public class FDistribution_getSupportLowerBound_129945749827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term2098;

    public FDistribution_getSupportLowerBound_129945749827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term99 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term100 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term93, term93.getClass(), "numeratorDegreesOfFreedom", 0.6862221294683138);
        setDoubleField(term93, term93.getClass(), "denominatorDegreesOfFreedom", 0.15917839663695388);
        setDoubleField(term93, term93.getClass(), "solverAbsoluteAccuracy", 0.8566567697571895);
        setDoubleField(term93, term93.getClass(), "numericalVariance", 0.8454723071922143);
        setBooleanField(term93, term93.getClass(), "numericalVarianceIsCalculated", false);
        setField(term100, term100.getClass(), "rand", null);
        setField(term100, term100.getClass(), "secRand", null);
        setField(term99, term99.getClass(), "delegate", term100);
        setField(term93, term93.getClass(), "randomData", term99);
        setField(term93, term93.getClass(), "random", null);
        term2098 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2099 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2100 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2098, term2098.getClass(), "numeratorDegreesOfFreedom", 0.6862221294683138);
        setDoubleField(term2098, term2098.getClass(), "denominatorDegreesOfFreedom", 0.15917839663695388);
        setDoubleField(term2098, term2098.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2098, term2098.getClass(), "numericalVariance", 0.8454723071922143);
        setBooleanField(term2098, term2098.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2100, term2100.getClass(), "rand", null);
        setField(term2100, term2100.getClass(), "secRand", null);
        setField(term2099, term2099.getClass(), "delegate", term2100);
        setField(term2098, term2098.getClass(), "randomData", term2099);
        setField(term2098, term2098.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSupportLowerBound", argTypes, term93, args);
        assertTrue(recursiveEquals(term93, term2098));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


