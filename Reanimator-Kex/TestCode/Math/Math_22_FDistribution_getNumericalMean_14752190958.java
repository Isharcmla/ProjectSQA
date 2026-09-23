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
import java.lang.Object;

public class FDistribution_getNumericalMean_14752190958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public FDistribution_getNumericalMean_14752190958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term72 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term73 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term66, term66.getClass(), "numeratorDegreesOfFreedom", 0.0668892744806211);
        setDoubleField(term66, term66.getClass(), "denominatorDegreesOfFreedom", 0.3587267442738795);
        setDoubleField(term66, term66.getClass(), "solverAbsoluteAccuracy", 0.3202192021706908);
        setDoubleField(term66, term66.getClass(), "numericalVariance", 0.5279279537140873);
        setBooleanField(term66, term66.getClass(), "numericalVarianceIsCalculated", true);
        setField(term73, term73.getClass(), "rand", null);
        setField(term73, term73.getClass(), "secRand", null);
        setField(term72, term72.getClass(), "delegate", term73);
        setField(term66, term66.getClass(), "randomData", term72);
        setField(term66, term66.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumericalMean", argTypes, term66, args);
    }

};


