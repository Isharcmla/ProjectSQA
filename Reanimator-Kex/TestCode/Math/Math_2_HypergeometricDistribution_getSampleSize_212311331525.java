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

public class HypergeometricDistribution_getSampleSize_212311331525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term1016;

    public HypergeometricDistribution_getSampleSize_212311331525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term73 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term74 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term67, term67.getClass(), "numberOfSuccesses", -1275173084);
        setIntField(term67, term67.getClass(), "populationSize", -244121226);
        setIntField(term67, term67.getClass(), "sampleSize", -203030934);
        setDoubleField(term67, term67.getClass(), "numericalVariance", 0.40176586625454525);
        setBooleanField(term67, term67.getClass(), "numericalVarianceIsCalculated", true);
        setField(term74, term74.getClass(), "rand", null);
        setField(term74, term74.getClass(), "secRand", null);
        setField(term73, term73.getClass(), "delegate", term74);
        setField(term67, term67.getClass(), "randomData", term73);
        setField(term67, term67.getClass(), "random", null);
        term1016 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term1017 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term1018 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term1016, term1016.getClass(), "numberOfSuccesses", -1275173084);
        setIntField(term1016, term1016.getClass(), "populationSize", -244121226);
        setIntField(term1016, term1016.getClass(), "sampleSize", -203030934);
        setDoubleField(term1016, term1016.getClass(), "numericalVariance", 0.40176586625454525);
        setBooleanField(term1016, term1016.getClass(), "numericalVarianceIsCalculated", true);
        setField(term1018, term1018.getClass(), "rand", null);
        setField(term1018, term1018.getClass(), "secRand", null);
        setField(term1017, term1017.getClass(), "delegate", term1018);
        setField(term1016, term1016.getClass(), "randomData", term1017);
        setField(term1016, term1016.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSampleSize", argTypes, term67, args);
        assertTrue(recursiveEquals(term67, term1016));
        assertTrue(recursiveEquals(retValue, -203030934));
    }

};


