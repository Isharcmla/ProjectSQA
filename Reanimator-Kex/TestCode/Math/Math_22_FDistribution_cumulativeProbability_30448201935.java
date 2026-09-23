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
import static org.apache.commons.math3.distribution.EqualityUtils.*;

public class FDistribution_cumulativeProbability_30448201935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2658;
     Object term2805;

    public FDistribution_cumulativeProbability_30448201935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2658 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        term2805 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        setDoubleField(term2805, term2805.getClass(), "numeratorDegreesOfFreedom", 0.0);
        setDoubleField(term2805, term2805.getClass(), "denominatorDegreesOfFreedom", 0.0);
        setDoubleField(term2805, term2805.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2805, term2805.getClass(), "numericalVariance", 0.0);
        setBooleanField(term2805, term2805.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2805, term2805.getClass(), "randomData", null);
        setField(term2805, term2805.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -7.291122019556399E-304;
        Object retValue = callMethod(klass, "cumulativeProbability", argTypes, term2658, args);
        assertTrue(recursiveEquals(term2658, term2805));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


