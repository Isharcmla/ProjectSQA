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

public class FDistribution_getNumericalMean_147521909524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2050;

    public FDistribution_getNumericalMean_147521909524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2050 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        setDoubleField(term2050, term2050.getClass(), "numeratorDegreesOfFreedom", 0.0);
        setDoubleField(term2050, term2050.getClass(), "denominatorDegreesOfFreedom", 0.0);
        setDoubleField(term2050, term2050.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2050, term2050.getClass(), "numericalVariance", 0.0);
        setBooleanField(term2050, term2050.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2050, term2050.getClass(), "randomData", null);
        setField(term2050, term2050.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumericalMean", argTypes, term2050, args);
    }

};


