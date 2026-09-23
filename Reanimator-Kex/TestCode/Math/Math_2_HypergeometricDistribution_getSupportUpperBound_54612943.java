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

public class HypergeometricDistribution_getSupportUpperBound_54612943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573;

    public HypergeometricDistribution_getSupportUpperBound_54612943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2573 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setIntField(term2573, term2573.getClass(), "numberOfSuccesses", 0);
        setIntField(term2573, term2573.getClass(), "populationSize", 0);
        setIntField(term2573, term2573.getClass(), "sampleSize", 0);
        setDoubleField(term2573, term2573.getClass(), "numericalVariance", 0.0);
        setBooleanField(term2573, term2573.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2573, term2573.getClass(), "randomData", null);
        setField(term2573, term2573.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSupportUpperBound", argTypes, term2573, args);
    }

};


