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
import java.lang.Double;

public class FDistribution_cumulativeProbability_3044820194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term37;

    public FDistribution_cumulativeProbability_3044820194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term34 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term35 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term28, term28.getClass(), "numeratorDegreesOfFreedom", 0.7031006357544823);
        setDoubleField(term28, term28.getClass(), "denominatorDegreesOfFreedom", 0.9527281779865117);
        setDoubleField(term28, term28.getClass(), "solverAbsoluteAccuracy", 0.6436713023569729);
        setDoubleField(term28, term28.getClass(), "numericalVariance", 0.2779719046761513);
        setBooleanField(term28, term28.getClass(), "numericalVarianceIsCalculated", false);
        setField(term35, term35.getClass(), "rand", null);
        setField(term35, term35.getClass(), "secRand", null);
        setField(term34, term34.getClass(), "delegate", term35);
        setField(term28, term28.getClass(), "randomData", term34);
        setField(term28, term28.getClass(), "random", null);
        term37 = new Double(0.7332741045694002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term37;
        callMethod(klass, "cumulativeProbability", argTypes, term28, args);
    }

};


