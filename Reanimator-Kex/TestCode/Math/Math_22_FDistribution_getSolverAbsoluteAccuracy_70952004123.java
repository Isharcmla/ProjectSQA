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

public class FDistribution_getSolverAbsoluteAccuracy_70952004123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term2035;

    public FDistribution_getSolverAbsoluteAccuracy_70952004123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term63 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term64 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term57, term57.getClass(), "numeratorDegreesOfFreedom", 0.37161417339133307);
        setDoubleField(term57, term57.getClass(), "denominatorDegreesOfFreedom", 0.6805867182029153);
        setDoubleField(term57, term57.getClass(), "solverAbsoluteAccuracy", 0.9737083944266686);
        setDoubleField(term57, term57.getClass(), "numericalVariance", 0.6300849762307866);
        setBooleanField(term57, term57.getClass(), "numericalVarianceIsCalculated", true);
        setField(term64, term64.getClass(), "rand", null);
        setField(term64, term64.getClass(), "secRand", null);
        setField(term63, term63.getClass(), "delegate", term64);
        setField(term57, term57.getClass(), "randomData", term63);
        setField(term57, term57.getClass(), "random", null);
        term2035 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2036 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2037 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2035, term2035.getClass(), "numeratorDegreesOfFreedom", 0.37161417339133307);
        setDoubleField(term2035, term2035.getClass(), "denominatorDegreesOfFreedom", 0.6805867182029153);
        setDoubleField(term2035, term2035.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2035, term2035.getClass(), "numericalVariance", 0.6300849762307866);
        setBooleanField(term2035, term2035.getClass(), "numericalVarianceIsCalculated", true);
        setField(term2037, term2037.getClass(), "rand", null);
        setField(term2037, term2037.getClass(), "secRand", null);
        setField(term2036, term2036.getClass(), "delegate", term2037);
        setField(term2035, term2035.getClass(), "randomData", term2036);
        setField(term2035, term2035.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSolverAbsoluteAccuracy", argTypes, term57, args);
        assertTrue(recursiveEquals(term57, term2035));
        assertTrue(recursiveEquals(retValue, 0.9737083944266686));
    }

};


