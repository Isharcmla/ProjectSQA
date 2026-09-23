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

public class HypergeometricDistribution_getPopulationSize_108664192024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term1004;

    public HypergeometricDistribution_getPopulationSize_108664192024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term65 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term66 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term59, term59.getClass(), "numberOfSuccesses", 1135664017);
        setIntField(term59, term59.getClass(), "populationSize", 590364439);
        setIntField(term59, term59.getClass(), "sampleSize", 865208305);
        setDoubleField(term59, term59.getClass(), "numericalVariance", 0.28570734989730284);
        setBooleanField(term59, term59.getClass(), "numericalVarianceIsCalculated", true);
        setField(term66, term66.getClass(), "rand", null);
        setField(term66, term66.getClass(), "secRand", null);
        setField(term65, term65.getClass(), "delegate", term66);
        setField(term59, term59.getClass(), "randomData", term65);
        setField(term59, term59.getClass(), "random", null);
        term1004 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term1005 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term1006 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term1004, term1004.getClass(), "numberOfSuccesses", 1135664017);
        setIntField(term1004, term1004.getClass(), "populationSize", 590364439);
        setIntField(term1004, term1004.getClass(), "sampleSize", 865208305);
        setDoubleField(term1004, term1004.getClass(), "numericalVariance", 0.28570734989730284);
        setBooleanField(term1004, term1004.getClass(), "numericalVarianceIsCalculated", true);
        setField(term1006, term1006.getClass(), "rand", null);
        setField(term1006, term1006.getClass(), "secRand", null);
        setField(term1005, term1005.getClass(), "delegate", term1006);
        setField(term1004, term1004.getClass(), "randomData", term1005);
        setField(term1004, term1004.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPopulationSize", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term1004));
        assertTrue(recursiveEquals(retValue, 590364439));
    }

};


