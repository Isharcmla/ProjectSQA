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

public class PoissonDistributionImpl_cumulativeProbability_70654730424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4071;
     Object term4216;

    public PoissonDistributionImpl_cumulativeProbability_70654730424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4071 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        term4216 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(term4216, term4216.getClass(), "normal", null);
        setDoubleField(term4216, term4216.getClass(), "mean", 0.0);
        setIntField(term4216, term4216.getClass(), "maxIterations", 0);
        setDoubleField(term4216, term4216.getClass(), "epsilon", 0.0);
        setField(term4216, term4216.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        Object retValue = callMethod(klass, "cumulativeProbability", argTypes, term4071, args);
        assertTrue(recursiveEquals(term4071, term4216));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


