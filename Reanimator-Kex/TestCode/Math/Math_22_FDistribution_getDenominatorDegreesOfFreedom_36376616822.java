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
import java.lang.Object;

public class FDistribution_getDenominatorDegreesOfFreedom_36376616822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term2023;

    public FDistribution_getDenominatorDegreesOfFreedom_36376616822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term54 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term55 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term48, term48.getClass(), "numeratorDegreesOfFreedom", 0.3800088629986428);
        setDoubleField(term48, term48.getClass(), "denominatorDegreesOfFreedom", 0.5840714198152577);
        setDoubleField(term48, term48.getClass(), "solverAbsoluteAccuracy", 0.11493000848982304);
        setDoubleField(term48, term48.getClass(), "numericalVariance", 0.10667076642995188);
        setBooleanField(term48, term48.getClass(), "numericalVarianceIsCalculated", false);
        setField(term55, term55.getClass(), "rand", null);
        setField(term55, term55.getClass(), "secRand", null);
        setField(term54, term54.getClass(), "delegate", term55);
        setField(term48, term48.getClass(), "randomData", term54);
        setField(term48, term48.getClass(), "random", null);
        term2023 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2024 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2025 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2023, term2023.getClass(), "numeratorDegreesOfFreedom", 0.3800088629986428);
        setDoubleField(term2023, term2023.getClass(), "denominatorDegreesOfFreedom", 0.5840714198152577);
        setDoubleField(term2023, term2023.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2023, term2023.getClass(), "numericalVariance", 0.10667076642995188);
        setBooleanField(term2023, term2023.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2025, term2025.getClass(), "rand", null);
        setField(term2025, term2025.getClass(), "secRand", null);
        setField(term2024, term2024.getClass(), "delegate", term2025);
        setField(term2023, term2023.getClass(), "randomData", term2024);
        setField(term2023, term2023.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominatorDegreesOfFreedom", argTypes, term48, args);
        assertTrue(recursiveEquals(term48, term2023));
        assertTrue(recursiveEquals(retValue, 0.5840714198152577));
    }

};


