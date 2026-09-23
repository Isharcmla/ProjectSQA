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

public class FDistribution_isSupportUpperBoundInclusive_147683291830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;
     Object term2387;

    public FDistribution_isSupportUpperBoundInclusive_147683291830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term126 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term127 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term120, term120.getClass(), "numeratorDegreesOfFreedom", 0.5306473989087822);
        setDoubleField(term120, term120.getClass(), "denominatorDegreesOfFreedom", 0.022483645678509023);
        setDoubleField(term120, term120.getClass(), "solverAbsoluteAccuracy", 0.5308350402051779);
        setDoubleField(term120, term120.getClass(), "numericalVariance", 0.016575281023182953);
        setBooleanField(term120, term120.getClass(), "numericalVarianceIsCalculated", true);
        setField(term127, term127.getClass(), "rand", null);
        setField(term127, term127.getClass(), "secRand", null);
        setField(term126, term126.getClass(), "delegate", term127);
        setField(term120, term120.getClass(), "randomData", term126);
        setField(term120, term120.getClass(), "random", null);
        term2387 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2388 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2389 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2387, term2387.getClass(), "numeratorDegreesOfFreedom", 0.5306473989087822);
        setDoubleField(term2387, term2387.getClass(), "denominatorDegreesOfFreedom", 0.022483645678509023);
        setDoubleField(term2387, term2387.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2387, term2387.getClass(), "numericalVariance", 0.016575281023182953);
        setBooleanField(term2387, term2387.getClass(), "numericalVarianceIsCalculated", true);
        setField(term2389, term2389.getClass(), "rand", null);
        setField(term2389, term2389.getClass(), "secRand", null);
        setField(term2388, term2388.getClass(), "delegate", term2389);
        setField(term2387, term2387.getClass(), "randomData", term2388);
        setField(term2387, term2387.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSupportUpperBoundInclusive", argTypes, term120, args);
        assertTrue(recursiveEquals(term120, term2387));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


