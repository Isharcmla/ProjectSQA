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

public class HypergeometricDistribution_getSupportUpperBound_54612916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;

    public HypergeometricDistribution_getSupportUpperBound_54612916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term159 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term160 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term153, term153.getClass(), "numberOfSuccesses", -1371869594);
        setIntField(term153, term153.getClass(), "populationSize", -2095575670);
        setIntField(term153, term153.getClass(), "sampleSize", 1225272962);
        setDoubleField(term153, term153.getClass(), "numericalVariance", 0.7031006357544823);
        setBooleanField(term153, term153.getClass(), "numericalVarianceIsCalculated", false);
        setField(term160, term160.getClass(), "rand", null);
        setField(term160, term160.getClass(), "secRand", null);
        setField(term159, term159.getClass(), "delegate", term160);
        setField(term153, term153.getClass(), "randomData", term159);
        setField(term153, term153.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSupportUpperBound", argTypes, term153, args);
    }

};


