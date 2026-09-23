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

public class HypergeometricDistribution_getNumberOfSuccesses_63756530323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term992;

    public HypergeometricDistribution_getNumberOfSuccesses_63756530323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term57 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term58 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term51, term51.getClass(), "numberOfSuccesses", -2068769794);
        setIntField(term51, term51.getClass(), "populationSize", -117576464);
        setIntField(term51, term51.getClass(), "sampleSize", -1007160944);
        setDoubleField(term51, term51.getClass(), "numericalVariance", 0.544608645520025);
        setBooleanField(term51, term51.getClass(), "numericalVarianceIsCalculated", false);
        setField(term58, term58.getClass(), "rand", null);
        setField(term58, term58.getClass(), "secRand", null);
        setField(term57, term57.getClass(), "delegate", term58);
        setField(term51, term51.getClass(), "randomData", term57);
        setField(term51, term51.getClass(), "random", null);
        term992 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term993 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term994 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term992, term992.getClass(), "numberOfSuccesses", -2068769794);
        setIntField(term992, term992.getClass(), "populationSize", -117576464);
        setIntField(term992, term992.getClass(), "sampleSize", -1007160944);
        setDoubleField(term992, term992.getClass(), "numericalVariance", 0.544608645520025);
        setBooleanField(term992, term992.getClass(), "numericalVarianceIsCalculated", false);
        setField(term994, term994.getClass(), "rand", null);
        setField(term994, term994.getClass(), "secRand", null);
        setField(term993, term993.getClass(), "delegate", term994);
        setField(term992, term992.getClass(), "randomData", term993);
        setField(term992, term992.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumberOfSuccesses", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term992));
        assertTrue(recursiveEquals(retValue, -2068769794));
    }

};


