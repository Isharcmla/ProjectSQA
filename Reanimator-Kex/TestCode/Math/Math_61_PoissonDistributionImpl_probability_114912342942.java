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

public class PoissonDistributionImpl_probability_114912342942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9873;
     Object term9891;

    public PoissonDistributionImpl_probability_114912342942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9873 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setDoubleField(term9873, term9873.getClass(), "mean", 4.503600164241408E15);
        term9891 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(term9891, term9891.getClass(), "normal", null);
        setDoubleField(term9891, term9891.getClass(), "mean", 4.503600164241408E15);
        setIntField(term9891, term9891.getClass(), "maxIterations", 0);
        setDoubleField(term9891, term9891.getClass(), "epsilon", 0.0);
        setField(term9891, term9891.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "probability", argTypes, term9873, args);
        assertTrue(recursiveEquals(term9873, term9891));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


