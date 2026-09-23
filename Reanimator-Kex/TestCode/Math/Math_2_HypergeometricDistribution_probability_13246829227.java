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

public class HypergeometricDistribution_probability_13246829227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term95;
     Object term1060;

    public HypergeometricDistribution_probability_13246829227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term93 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term94 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term87, term87.getClass(), "numberOfSuccesses", -1530420153);
        setIntField(term87, term87.getClass(), "populationSize", -469968304);
        setIntField(term87, term87.getClass(), "sampleSize", -1145578966);
        setDoubleField(term87, term87.getClass(), "numericalVariance", 0.36923381893433327);
        setBooleanField(term87, term87.getClass(), "numericalVarianceIsCalculated", true);
        setField(term94, term94.getClass(), "rand", null);
        setField(term94, term94.getClass(), "secRand", null);
        setField(term93, term93.getClass(), "delegate", term94);
        setField(term87, term87.getClass(), "randomData", term93);
        setField(term87, term87.getClass(), "random", null);
        term95 = new Integer(679763016);
        term1060 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term1061 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term1062 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term1060, term1060.getClass(), "numberOfSuccesses", -1530420153);
        setIntField(term1060, term1060.getClass(), "populationSize", -469968304);
        setIntField(term1060, term1060.getClass(), "sampleSize", -1145578966);
        setDoubleField(term1060, term1060.getClass(), "numericalVariance", 0.36923381893433327);
        setBooleanField(term1060, term1060.getClass(), "numericalVarianceIsCalculated", true);
        setField(term1062, term1062.getClass(), "rand", null);
        setField(term1062, term1062.getClass(), "secRand", null);
        setField(term1061, term1061.getClass(), "delegate", term1062);
        setField(term1060, term1060.getClass(), "randomData", term1061);
        setField(term1060, term1060.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term95;
        Object retValue = callMethod(klass, "probability", argTypes, term87, args);
        assertTrue(recursiveEquals(term87, term1060));
        assertTrue(recursiveEquals(term95, 679763016));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


