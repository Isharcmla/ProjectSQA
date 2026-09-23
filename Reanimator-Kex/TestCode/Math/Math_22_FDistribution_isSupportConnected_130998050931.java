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

public class FDistribution_isSupportConnected_130998050931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term2400;

    public FDistribution_isSupportConnected_130998050931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term135 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term136 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term129, term129.getClass(), "numeratorDegreesOfFreedom", 0.7154795600170818);
        setDoubleField(term129, term129.getClass(), "denominatorDegreesOfFreedom", 0.6355029654528058);
        setDoubleField(term129, term129.getClass(), "solverAbsoluteAccuracy", 0.03699061125289671);
        setDoubleField(term129, term129.getClass(), "numericalVariance", 0.36226058076369927);
        setBooleanField(term129, term129.getClass(), "numericalVarianceIsCalculated", false);
        setField(term136, term136.getClass(), "rand", null);
        setField(term136, term136.getClass(), "secRand", null);
        setField(term135, term135.getClass(), "delegate", term136);
        setField(term129, term129.getClass(), "randomData", term135);
        setField(term129, term129.getClass(), "random", null);
        term2400 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2401 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2402 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2400, term2400.getClass(), "numeratorDegreesOfFreedom", 0.7154795600170818);
        setDoubleField(term2400, term2400.getClass(), "denominatorDegreesOfFreedom", 0.6355029654528058);
        setDoubleField(term2400, term2400.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2400, term2400.getClass(), "numericalVariance", 0.36226058076369927);
        setBooleanField(term2400, term2400.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2402, term2402.getClass(), "rand", null);
        setField(term2402, term2402.getClass(), "secRand", null);
        setField(term2401, term2401.getClass(), "delegate", term2402);
        setField(term2400, term2400.getClass(), "randomData", term2401);
        setField(term2400, term2400.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSupportConnected", argTypes, term129, args);
        assertTrue(recursiveEquals(term129, term2400));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


