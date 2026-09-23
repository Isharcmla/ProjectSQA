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

public class HypergeometricDistribution_calculateNumericalVariance_178488801614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public HypergeometricDistribution_calculateNumericalVariance_178488801614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term143 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term144 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term137, term137.getClass(), "numberOfSuccesses", 458147407);
        setIntField(term137, term137.getClass(), "populationSize", -184153539);
        setIntField(term137, term137.getClass(), "sampleSize", 493620644);
        setDoubleField(term137, term137.getClass(), "numericalVariance", 0.7655020693602768);
        setBooleanField(term137, term137.getClass(), "numericalVarianceIsCalculated", false);
        setField(term144, term144.getClass(), "rand", null);
        setField(term144, term144.getClass(), "secRand", null);
        setField(term143, term143.getClass(), "delegate", term144);
        setField(term137, term137.getClass(), "randomData", term143);
        setField(term137, term137.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateNumericalVariance", argTypes, term137, args);
    }

};


