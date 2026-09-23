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

public class PoissonDistributionImpl_cumulativeProbability_70654730450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11927;

    public PoissonDistributionImpl_cumulativeProbability_70654730450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11927 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setDoubleField(term11927, term11927.getClass(), "mean", 6.755399441055748E15);
        setDoubleField(term11927, term11927.getClass(), "epsilon", -4.503599627370495E15);
        setIntField(term11927, term11927.getClass(), "maxIterations", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 33554431;
        callMethod(klass, "cumulativeProbability", argTypes, term11927, args);
    }

};


