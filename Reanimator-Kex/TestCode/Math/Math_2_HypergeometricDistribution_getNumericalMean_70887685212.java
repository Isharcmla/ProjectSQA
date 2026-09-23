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

public class HypergeometricDistribution_getNumericalMean_70887685212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;

    public HypergeometricDistribution_getNumericalMean_70887685212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term127 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term128 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term121, term121.getClass(), "numberOfSuccesses", 1632125673);
        setIntField(term121, term121.getClass(), "populationSize", 454281060);
        setIntField(term121, term121.getClass(), "sampleSize", -1786399638);
        setDoubleField(term121, term121.getClass(), "numericalVariance", 0.8474802076607362);
        setBooleanField(term121, term121.getClass(), "numericalVarianceIsCalculated", false);
        setField(term128, term128.getClass(), "rand", null);
        setField(term128, term128.getClass(), "secRand", null);
        setField(term127, term127.getClass(), "delegate", term128);
        setField(term121, term121.getClass(), "randomData", term127);
        setField(term121, term121.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumericalMean", argTypes, term121, args);
    }

};


