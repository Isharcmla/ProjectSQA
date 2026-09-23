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
import java.lang.Integer;

public class HypergeometricDistribution_cumulativeProbability_198813902520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term21;
     Object term934;

    public HypergeometricDistribution_cumulativeProbability_198813902520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term19 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term20 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term13, term13.getClass(), "numberOfSuccesses", -1955890973);
        setIntField(term13, term13.getClass(), "populationSize", -2038273078);
        setIntField(term13, term13.getClass(), "sampleSize", 1227103734);
        setDoubleField(term13, term13.getClass(), "numericalVariance", 0.13238746331190498);
        setBooleanField(term13, term13.getClass(), "numericalVarianceIsCalculated", false);
        setField(term20, term20.getClass(), "rand", null);
        setField(term20, term20.getClass(), "secRand", null);
        setField(term19, term19.getClass(), "delegate", term20);
        setField(term13, term13.getClass(), "randomData", term19);
        setField(term13, term13.getClass(), "random", null);
        term21 = new Integer(-1339778481);
        term934 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term935 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term936 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term934, term934.getClass(), "numberOfSuccesses", -1955890973);
        setIntField(term934, term934.getClass(), "populationSize", -2038273078);
        setIntField(term934, term934.getClass(), "sampleSize", 1227103734);
        setDoubleField(term934, term934.getClass(), "numericalVariance", 0.13238746331190498);
        setBooleanField(term934, term934.getClass(), "numericalVarianceIsCalculated", false);
        setField(term936, term936.getClass(), "rand", null);
        setField(term936, term936.getClass(), "secRand", null);
        setField(term935, term935.getClass(), "delegate", term936);
        setField(term934, term934.getClass(), "randomData", term935);
        setField(term934, term934.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21;
        Object retValue = callMethod(klass, "cumulativeProbability", argTypes, term13, args);
        assertTrue(recursiveEquals(term13, term934));
        assertTrue(recursiveEquals(term21, -1339778481));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


