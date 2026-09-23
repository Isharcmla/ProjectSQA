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

public class PoissonDistributionImpl_cumulativeProbability_70654730433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5750;
     Object term6144;

    public PoissonDistributionImpl_cumulativeProbability_70654730433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5750 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setDoubleField(term5750, term5750.getClass(), "mean", 0.0);
        setDoubleField(term5750, term5750.getClass(), "epsilon", 0.0);
        setIntField(term5750, term5750.getClass(), "maxIterations", 0);
        term6144 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(term6144, term6144.getClass(), "normal", null);
        setDoubleField(term6144, term6144.getClass(), "mean", 0.0);
        setIntField(term6144, term6144.getClass(), "maxIterations", 0);
        setDoubleField(term6144, term6144.getClass(), "epsilon", 0.0);
        setField(term6144, term6144.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 637729882;
        Object retValue = callMethod(klass, "cumulativeProbability", argTypes, term5750, args);
        assertTrue(recursiveEquals(term5750, term6144));
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


