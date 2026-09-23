package org.apache.commons.math.distribution;

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
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class NormalDistributionImpl_inverseCumulativeProbability_15095484878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term51;

    public NormalDistributionImpl_inverseCumulativeProbability_15095484878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term49 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term45, term45.getClass(), "mean", 0.7655020693602768);
        setDoubleField(term45, term45.getClass(), "standardDeviation", 1.0);
        setDoubleField(term45, term45.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term49, term49.getClass(), "rand", null);
        setField(term49, term49.getClass(), "secRand", null);
        setField(term45, term45.getClass(), "randomData", term49);
        term51 = new Double(0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term51;
        callMethod(klass, "inverseCumulativeProbability", argTypes, term45, args);
    }

};


