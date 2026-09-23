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

public class FDistribution_getSupportUpperBound_55906985128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;

    public FDistribution_getSupportUpperBound_55906985128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term108 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term109 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term102, term102.getClass(), "numeratorDegreesOfFreedom", 0.9203805380592256);
        setDoubleField(term102, term102.getClass(), "denominatorDegreesOfFreedom", 0.5804948995371725);
        setDoubleField(term102, term102.getClass(), "solverAbsoluteAccuracy", 0.2109867221632754);
        setDoubleField(term102, term102.getClass(), "numericalVariance", 0.7919370314903882);
        setBooleanField(term102, term102.getClass(), "numericalVarianceIsCalculated", true);
        setField(term109, term109.getClass(), "rand", null);
        setField(term109, term109.getClass(), "secRand", null);
        setField(term108, term108.getClass(), "delegate", term109);
        setField(term102, term102.getClass(), "randomData", term108);
        setField(term102, term102.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSupportUpperBound", argTypes, term102, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


