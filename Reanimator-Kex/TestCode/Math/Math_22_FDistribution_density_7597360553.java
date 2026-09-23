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

public class FDistribution_density_7597360553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term26;

    public FDistribution_density_7597360553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term23 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term24 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term17, term17.getClass(), "numeratorDegreesOfFreedom", 0.6076495596892013);
        setDoubleField(term17, term17.getClass(), "denominatorDegreesOfFreedom", 0.37773193782763337);
        setDoubleField(term17, term17.getClass(), "solverAbsoluteAccuracy", 0.7655020693602768);
        setDoubleField(term17, term17.getClass(), "numericalVariance", 0.5183269973490326);
        setBooleanField(term17, term17.getClass(), "numericalVarianceIsCalculated", false);
        setField(term24, term24.getClass(), "rand", null);
        setField(term24, term24.getClass(), "secRand", null);
        setField(term23, term23.getClass(), "delegate", term24);
        setField(term17, term17.getClass(), "randomData", term23);
        setField(term17, term17.getClass(), "random", null);
        term26 = new Double(0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term26;
        callMethod(klass, "density", argTypes, term17, args);
    }

};


