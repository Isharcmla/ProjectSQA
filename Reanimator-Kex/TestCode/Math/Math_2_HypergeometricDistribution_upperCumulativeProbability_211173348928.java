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

public class HypergeometricDistribution_upperCumulativeProbability_211173348928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term105;
     Object term1088;

    public HypergeometricDistribution_upperCumulativeProbability_211173348928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term103 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term104 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term97, term97.getClass(), "numberOfSuccesses", 1962444399);
        setIntField(term97, term97.getClass(), "populationSize", 767834723);
        setIntField(term97, term97.getClass(), "sampleSize", -602026508);
        setDoubleField(term97, term97.getClass(), "numericalVariance", 0.6076495596892013);
        setBooleanField(term97, term97.getClass(), "numericalVarianceIsCalculated", false);
        setField(term104, term104.getClass(), "rand", null);
        setField(term104, term104.getClass(), "secRand", null);
        setField(term103, term103.getClass(), "delegate", term104);
        setField(term97, term97.getClass(), "randomData", term103);
        setField(term97, term97.getClass(), "random", null);
        term105 = new Integer(-157887805);
        term1088 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term1089 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term1090 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term1088, term1088.getClass(), "numberOfSuccesses", 1962444399);
        setIntField(term1088, term1088.getClass(), "populationSize", 767834723);
        setIntField(term1088, term1088.getClass(), "sampleSize", -602026508);
        setDoubleField(term1088, term1088.getClass(), "numericalVariance", 0.6076495596892013);
        setBooleanField(term1088, term1088.getClass(), "numericalVarianceIsCalculated", false);
        setField(term1090, term1090.getClass(), "rand", null);
        setField(term1090, term1090.getClass(), "secRand", null);
        setField(term1089, term1089.getClass(), "delegate", term1090);
        setField(term1088, term1088.getClass(), "randomData", term1089);
        setField(term1088, term1088.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105;
        Object retValue = callMethod(klass, "upperCumulativeProbability", argTypes, term97, args);
        assertTrue(recursiveEquals(term97, term1088));
        assertTrue(recursiveEquals(term105, -157887805));
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


