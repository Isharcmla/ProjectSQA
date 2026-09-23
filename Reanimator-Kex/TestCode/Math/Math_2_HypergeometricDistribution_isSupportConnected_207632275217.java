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

public class HypergeometricDistribution_isSupportConnected_207632275217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;

    public HypergeometricDistribution_isSupportConnected_207632275217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term167 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term168 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term161, term161.getClass(), "numberOfSuccesses", 1324040357);
        setIntField(term161, term161.getClass(), "populationSize", -1588772968);
        setIntField(term161, term161.getClass(), "sampleSize", -93135961);
        setDoubleField(term161, term161.getClass(), "numericalVariance", 0.9527281779865117);
        setBooleanField(term161, term161.getClass(), "numericalVarianceIsCalculated", false);
        setField(term168, term168.getClass(), "rand", null);
        setField(term168, term168.getClass(), "secRand", null);
        setField(term167, term167.getClass(), "delegate", term168);
        setField(term161, term161.getClass(), "randomData", term167);
        setField(term161, term161.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSupportConnected", argTypes, term161, args);
    }

};


