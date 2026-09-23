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
import java.lang.Double;

public class NormalDistributionImpl_getDomainUpperBound_201004189926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2536;
     Object term2541;
     Object term2612;

    public NormalDistributionImpl_getDomainUpperBound_201004189926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2536 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term2536, term2536.getClass(), "mean", 0.0);
        setDoubleField(term2536, term2536.getClass(), "standardDeviation", 0.0);
        setDoubleField(term2536, term2536.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term2536, term2536.getClass(), "randomData", null);
        term2541 = new Double(0.0);
        term2612 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term2612, term2612.getClass(), "mean", 0.0);
        setDoubleField(term2612, term2612.getClass(), "standardDeviation", 0.0);
        setDoubleField(term2612, term2612.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term2612, term2612.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2541;
        Object retValue = callMethod(klass, "getDomainUpperBound", argTypes, term2536, args);
        assertTrue(recursiveEquals(term2536, term2612));
        assertTrue(recursiveEquals(term2541, 0.0));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


