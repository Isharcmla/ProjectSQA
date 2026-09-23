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

public class PoissonDistributionImpl_cumulativeProbability_70654730425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4208;
     Object term4265;

    public PoissonDistributionImpl_cumulativeProbability_70654730425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4208 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        term4265 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(term4265, term4265.getClass(), "normal", null);
        setDoubleField(term4265, term4265.getClass(), "mean", 0.0);
        setIntField(term4265, term4265.getClass(), "maxIterations", 0);
        setDoubleField(term4265, term4265.getClass(), "epsilon", 0.0);
        setField(term4265, term4265.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "cumulativeProbability", argTypes, term4208, args);
        assertTrue(recursiveEquals(term4208, term4265));
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


