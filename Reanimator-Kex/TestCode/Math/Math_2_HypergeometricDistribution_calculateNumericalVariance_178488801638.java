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

public class HypergeometricDistribution_calculateNumericalVariance_178488801638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2537;

    public HypergeometricDistribution_calculateNumericalVariance_178488801638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2537 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setIntField(term2537, term2537.getClass(), "numberOfSuccesses", 0);
        setIntField(term2537, term2537.getClass(), "populationSize", 0);
        setIntField(term2537, term2537.getClass(), "sampleSize", 0);
        setDoubleField(term2537, term2537.getClass(), "numericalVariance", 0.0);
        setBooleanField(term2537, term2537.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2537, term2537.getClass(), "randomData", null);
        setField(term2537, term2537.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateNumericalVariance", argTypes, term2537, args);
    }

};


