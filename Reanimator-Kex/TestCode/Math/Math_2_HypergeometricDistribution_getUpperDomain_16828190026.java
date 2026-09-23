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
import java.lang.Integer;

public class HypergeometricDistribution_getUpperDomain_16828190026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term83;
     Object term85;
     Object term1032;

    public HypergeometricDistribution_getUpperDomain_16828190026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term81 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term82 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term75, term75.getClass(), "numberOfSuccesses", -1179120542);
        setIntField(term75, term75.getClass(), "populationSize", -73683645);
        setIntField(term75, term75.getClass(), "sampleSize", -226514366);
        setDoubleField(term75, term75.getClass(), "numericalVariance", 0.2641345529914265);
        setBooleanField(term75, term75.getClass(), "numericalVarianceIsCalculated", true);
        setField(term82, term82.getClass(), "rand", null);
        setField(term82, term82.getClass(), "secRand", null);
        setField(term81, term81.getClass(), "delegate", term82);
        setField(term75, term75.getClass(), "randomData", term81);
        setField(term75, term75.getClass(), "random", null);
        term83 = new Integer(1193880199);
        term85 = new Integer(-1087774327);
        term1032 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term1033 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term1034 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term1032, term1032.getClass(), "numberOfSuccesses", -1179120542);
        setIntField(term1032, term1032.getClass(), "populationSize", -73683645);
        setIntField(term1032, term1032.getClass(), "sampleSize", -226514366);
        setDoubleField(term1032, term1032.getClass(), "numericalVariance", 0.2641345529914265);
        setBooleanField(term1032, term1032.getClass(), "numericalVarianceIsCalculated", true);
        setField(term1034, term1034.getClass(), "rand", null);
        setField(term1034, term1034.getClass(), "secRand", null);
        setField(term1033, term1033.getClass(), "delegate", term1034);
        setField(term1032, term1032.getClass(), "randomData", term1033);
        setField(term1032, term1032.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term83;
        args[1] = term85;
        Object retValue = callMethod(klass, "getUpperDomain", argTypes, term75, args);
        assertTrue(recursiveEquals(term75, term1032));
        assertTrue(recursiveEquals(term83, -1087774327));
        assertTrue(recursiveEquals(term85, 1193880199));
        assertTrue(recursiveEquals(retValue, -1087774327));
    }

};


