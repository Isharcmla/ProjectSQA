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
import static org.apache.commons.math.distribution.EqualityUtils.*;
import java.lang.Object;

public class NormalDistributionImpl_sample_122096753822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term2512;

    public NormalDistributionImpl_sample_122096753822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term57 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term53, term53.getClass(), "mean", 0.7031006357544823);
        setDoubleField(term53, term53.getClass(), "standardDeviation", 1.0);
        setDoubleField(term53, term53.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term57, term57.getClass(), "rand", null);
        setField(term57, term57.getClass(), "secRand", null);
        setField(term53, term53.getClass(), "randomData", term57);
        term2512 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term2513 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term2514 = newInstance(Class.forName("org.apache.commons.math.random.JDKRandomGenerator"));
        Object term2515 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setDoubleField(term2512, term2512.getClass(), "mean", 0.7031006357544823);
        setDoubleField(term2512, term2512.getClass(), "standardDeviation", 1.0);
        setDoubleField(term2512, term2512.getClass(), "solverAbsoluteAccuracy", 0.0);
        setLongField(term2515, term2515.getClass(), "value", 205343378888877L);
        setField(term2514, term2514.getClass(), "seed", term2515);
        setDoubleField(term2514, term2514.getClass(), "nextNextGaussian", 0.5362946235531107);
        setBooleanField(term2514, term2514.getClass(), "haveNextNextGaussian", true);
        setField(term2513, term2513.getClass(), "rand", term2514);
        setField(term2513, term2513.getClass(), "secRand", null);
        setField(term2512, term2512.getClass(), "randomData", term2513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sample", argTypes, term53, args);
        assertTrue(recursiveEquals(term53, term2512));
        assertTrue(recursiveEquals(retValue, 0.25941654167081607));
    }

};


