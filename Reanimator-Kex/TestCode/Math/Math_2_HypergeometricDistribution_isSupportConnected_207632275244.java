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

public class HypergeometricDistribution_isSupportConnected_207632275244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2579;

    public HypergeometricDistribution_isSupportConnected_207632275244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2579 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setIntField(term2579, term2579.getClass(), "numberOfSuccesses", 0);
        setIntField(term2579, term2579.getClass(), "populationSize", 0);
        setIntField(term2579, term2579.getClass(), "sampleSize", 0);
        setDoubleField(term2579, term2579.getClass(), "numericalVariance", 0.0);
        setBooleanField(term2579, term2579.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2579, term2579.getClass(), "randomData", null);
        setField(term2579, term2579.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSupportConnected", argTypes, term2579, args);
    }

};


