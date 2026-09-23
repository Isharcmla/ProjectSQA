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

public class NormalDistributionImpl_cumulativeProbability_15200734956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term37;

    public NormalDistributionImpl_cumulativeProbability_15200734956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term35 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term31, term31.getClass(), "mean", 0.37773193782763337);
        setDoubleField(term31, term31.getClass(), "standardDeviation", 1.0);
        setDoubleField(term31, term31.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term35, term35.getClass(), "rand", null);
        setField(term35, term35.getClass(), "secRand", null);
        setField(term31, term31.getClass(), "randomData", term35);
        term37 = new Double(0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term37;
        callMethod(klass, "cumulativeProbability", argTypes, term31, args);
    }

};


