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

public class HypergeometricDistribution_getNumericalVariance_77999536013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;

    public HypergeometricDistribution_getNumericalVariance_77999536013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term135 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term136 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term129, term129.getClass(), "numberOfSuccesses", 2055867847);
        setIntField(term129, term129.getClass(), "populationSize", -1048298087);
        setIntField(term129, term129.getClass(), "sampleSize", 292681826);
        setDoubleField(term129, term129.getClass(), "numericalVariance", 0.5183269973490326);
        setBooleanField(term129, term129.getClass(), "numericalVarianceIsCalculated", true);
        setField(term136, term136.getClass(), "rand", null);
        setField(term136, term136.getClass(), "secRand", null);
        setField(term135, term135.getClass(), "delegate", term136);
        setField(term129, term129.getClass(), "randomData", term135);
        setField(term129, term129.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumericalVariance", argTypes, term129, args);
    }

};


