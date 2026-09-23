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

public class HypergeometricDistribution_getSupportLowerBound_73984151815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;

    public HypergeometricDistribution_getSupportLowerBound_73984151815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term151 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term152 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term145, term145.getClass(), "numberOfSuccesses", 1328271830);
        setIntField(term145, term145.getClass(), "populationSize", 1596070772);
        setIntField(term145, term145.getClass(), "sampleSize", 97029295);
        setDoubleField(term145, term145.getClass(), "numericalVariance", 0.1374549299694151);
        setBooleanField(term145, term145.getClass(), "numericalVarianceIsCalculated", true);
        setField(term152, term152.getClass(), "rand", null);
        setField(term152, term152.getClass(), "secRand", null);
        setField(term151, term151.getClass(), "delegate", term152);
        setField(term145, term145.getClass(), "randomData", term151);
        setField(term145, term145.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSupportLowerBound", argTypes, term145, args);
    }

};


