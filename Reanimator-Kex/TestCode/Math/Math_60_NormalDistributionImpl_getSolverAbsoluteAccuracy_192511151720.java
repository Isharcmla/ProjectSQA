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
import static org.apache.commons.math.distribution.EqualityUtils.*;
import java.lang.Object;

public class NormalDistributionImpl_getSolverAbsoluteAccuracy_192511151720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term1942;

    public NormalDistributionImpl_getSolverAbsoluteAccuracy_192511151720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term43 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term39, term39.getClass(), "mean", 0.5183269973490326);
        setDoubleField(term39, term39.getClass(), "standardDeviation", 1.0);
        setDoubleField(term39, term39.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term43, term43.getClass(), "rand", null);
        setField(term43, term43.getClass(), "secRand", null);
        setField(term39, term39.getClass(), "randomData", term43);
        term1942 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term1943 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term1942, term1942.getClass(), "mean", 0.5183269973490326);
        setDoubleField(term1942, term1942.getClass(), "standardDeviation", 1.0);
        setDoubleField(term1942, term1942.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term1943, term1943.getClass(), "rand", null);
        setField(term1943, term1943.getClass(), "secRand", null);
        setField(term1942, term1942.getClass(), "randomData", term1943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSolverAbsoluteAccuracy", argTypes, term39, args);
        assertTrue(recursiveEquals(term39, term1942));
        assertTrue(recursiveEquals(retValue, 1.0E-6));
    }

};


