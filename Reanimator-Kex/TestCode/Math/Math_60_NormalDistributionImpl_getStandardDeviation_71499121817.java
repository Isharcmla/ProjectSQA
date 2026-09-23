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

public class NormalDistributionImpl_getStandardDeviation_71499121817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term1192;

    public NormalDistributionImpl_getStandardDeviation_71499121817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term21 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term17, term17.getClass(), "mean", 0.2641345529914265);
        setDoubleField(term17, term17.getClass(), "standardDeviation", 1.0);
        setDoubleField(term17, term17.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term21, term21.getClass(), "rand", null);
        setField(term21, term21.getClass(), "secRand", null);
        setField(term17, term17.getClass(), "randomData", term21);
        term1192 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term1193 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term1192, term1192.getClass(), "mean", 0.2641345529914265);
        setDoubleField(term1192, term1192.getClass(), "standardDeviation", 1.0);
        setDoubleField(term1192, term1192.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term1193, term1193.getClass(), "rand", null);
        setField(term1193, term1193.getClass(), "secRand", null);
        setField(term1192, term1192.getClass(), "randomData", term1193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getStandardDeviation", argTypes, term17, args);
        assertTrue(recursiveEquals(term17, term1192));
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


