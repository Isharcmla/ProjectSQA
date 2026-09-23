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

public class FDistribution_getNumeratorDegreesOfFreedom_196430298121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term2011;

    public FDistribution_getNumeratorDegreesOfFreedom_196430298121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term45 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term46 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term39, term39.getClass(), "numeratorDegreesOfFreedom", 0.4569171842750229);
        setDoubleField(term39, term39.getClass(), "denominatorDegreesOfFreedom", 0.8598297828918529);
        setDoubleField(term39, term39.getClass(), "solverAbsoluteAccuracy", 0.13481025392611334);
        setDoubleField(term39, term39.getClass(), "numericalVariance", 0.7633268466829064);
        setBooleanField(term39, term39.getClass(), "numericalVarianceIsCalculated", false);
        setField(term46, term46.getClass(), "rand", null);
        setField(term46, term46.getClass(), "secRand", null);
        setField(term45, term45.getClass(), "delegate", term46);
        setField(term39, term39.getClass(), "randomData", term45);
        setField(term39, term39.getClass(), "random", null);
        term2011 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2012 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2013 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2011, term2011.getClass(), "numeratorDegreesOfFreedom", 0.4569171842750229);
        setDoubleField(term2011, term2011.getClass(), "denominatorDegreesOfFreedom", 0.8598297828918529);
        setDoubleField(term2011, term2011.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2011, term2011.getClass(), "numericalVariance", 0.7633268466829064);
        setBooleanField(term2011, term2011.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2013, term2013.getClass(), "rand", null);
        setField(term2013, term2013.getClass(), "secRand", null);
        setField(term2012, term2012.getClass(), "delegate", term2013);
        setField(term2011, term2011.getClass(), "randomData", term2012);
        setField(term2011, term2011.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumeratorDegreesOfFreedom", argTypes, term39, args);
        assertTrue(recursiveEquals(term39, term2011));
        assertTrue(recursiveEquals(retValue, 0.4569171842750229));
    }

};


