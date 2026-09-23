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

public class NormalDistributionImpl_getDomainUpperBound_201004189922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term992;
     Object term995;
     Object term1029;

    public NormalDistributionImpl_getDomainUpperBound_201004189922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term992 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term992, term992.getClass(), "mean", 0.0);
        setDoubleField(term992, term992.getClass(), "standardDeviation", 0.0);
        term995 = new Double(0.0);
        term1029 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term1029, term1029.getClass(), "mean", 0.0);
        setDoubleField(term1029, term1029.getClass(), "standardDeviation", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term995;
        Object retValue = callMethod(klass, "getDomainUpperBound", argTypes, term992, args);
        assertTrue(recursiveEquals(term992, term1029));
        assertTrue(recursiveEquals(term995, 0.0));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


