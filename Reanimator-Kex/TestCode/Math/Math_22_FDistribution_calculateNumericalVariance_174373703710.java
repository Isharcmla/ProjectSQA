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

public class FDistribution_calculateNumericalVariance_174373703710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;

    public FDistribution_calculateNumericalVariance_174373703710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term90 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term91 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term84, term84.getClass(), "numeratorDegreesOfFreedom", 0.5873228247510078);
        setDoubleField(term84, term84.getClass(), "denominatorDegreesOfFreedom", 0.8823181080774973);
        setDoubleField(term84, term84.getClass(), "solverAbsoluteAccuracy", 0.791695029600875);
        setDoubleField(term84, term84.getClass(), "numericalVariance", 0.7591353014991907);
        setBooleanField(term84, term84.getClass(), "numericalVarianceIsCalculated", true);
        setField(term91, term91.getClass(), "rand", null);
        setField(term91, term91.getClass(), "secRand", null);
        setField(term90, term90.getClass(), "delegate", term91);
        setField(term84, term84.getClass(), "randomData", term90);
        setField(term84, term84.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateNumericalVariance", argTypes, term84, args);
    }

};


