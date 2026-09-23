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

public class FDistribution_getNumericalVariance_154633760325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term2067;

    public FDistribution_getNumericalVariance_154633760325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term81 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term82 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term75, term75.getClass(), "numeratorDegreesOfFreedom", 0.22651340641904605);
        setDoubleField(term75, term75.getClass(), "denominatorDegreesOfFreedom", 0.8878841294187743);
        setDoubleField(term75, term75.getClass(), "solverAbsoluteAccuracy", 0.25937345430928016);
        setDoubleField(term75, term75.getClass(), "numericalVariance", 0.6397214730945112);
        setBooleanField(term75, term75.getClass(), "numericalVarianceIsCalculated", true);
        setField(term82, term82.getClass(), "rand", null);
        setField(term82, term82.getClass(), "secRand", null);
        setField(term81, term81.getClass(), "delegate", term82);
        setField(term75, term75.getClass(), "randomData", term81);
        setField(term75, term75.getClass(), "random", null);
        term2067 = newInstance(Class.forName("org.apache.commons.math3.distribution.FDistribution"));
        Object term2068 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term2069 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setDoubleField(term2067, term2067.getClass(), "numeratorDegreesOfFreedom", 0.22651340641904605);
        setDoubleField(term2067, term2067.getClass(), "denominatorDegreesOfFreedom", 0.8878841294187743);
        setDoubleField(term2067, term2067.getClass(), "solverAbsoluteAccuracy", 0.0);
        setDoubleField(term2067, term2067.getClass(), "numericalVariance", 0.6397214730945112);
        setBooleanField(term2067, term2067.getClass(), "numericalVarianceIsCalculated", true);
        setField(term2069, term2069.getClass(), "rand", null);
        setField(term2069, term2069.getClass(), "secRand", null);
        setField(term2068, term2068.getClass(), "delegate", term2069);
        setField(term2067, term2067.getClass(), "randomData", term2068);
        setField(term2067, term2067.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.FDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumericalVariance", argTypes, term75, args);
        assertTrue(recursiveEquals(term75, term2067));
        assertTrue(recursiveEquals(retValue, 0.6397214730945112));
    }

};


