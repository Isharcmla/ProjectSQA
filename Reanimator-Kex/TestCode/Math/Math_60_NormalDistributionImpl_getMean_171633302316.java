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

public class NormalDistributionImpl_getMean_171633302316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term1184;

    public NormalDistributionImpl_getMean_171633302316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term15 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term11, term11.getClass(), "mean", 0.40176586625454525);
        setDoubleField(term11, term11.getClass(), "standardDeviation", 1.0);
        setDoubleField(term11, term11.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term15, term15.getClass(), "rand", null);
        setField(term15, term15.getClass(), "secRand", null);
        setField(term11, term11.getClass(), "randomData", term15);
        term1184 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term1185 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term1184, term1184.getClass(), "mean", 0.40176586625454525);
        setDoubleField(term1184, term1184.getClass(), "standardDeviation", 1.0);
        setDoubleField(term1184, term1184.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term1185, term1185.getClass(), "rand", null);
        setField(term1185, term1185.getClass(), "secRand", null);
        setField(term1184, term1184.getClass(), "randomData", term1185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMean", argTypes, term11, args);
        assertTrue(recursiveEquals(term11, term1184));
        assertTrue(recursiveEquals(retValue, 0.40176586625454525));
    }

};


