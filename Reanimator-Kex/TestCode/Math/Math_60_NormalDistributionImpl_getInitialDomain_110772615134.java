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

public class NormalDistributionImpl_getInitialDomain_110772615134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3549;
     Object term3560;

    public NormalDistributionImpl_getInitialDomain_110772615134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3549 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        term3560 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term3560, term3560.getClass(), "mean", 0.0);
        setDoubleField(term3560, term3560.getClass(), "standardDeviation", 0.0);
        setDoubleField(term3560, term3560.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term3560, term3560.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.POSITIVE_INFINITY;
        Object retValue = callMethod(klass, "getInitialDomain", argTypes, term3549, args);
        assertTrue(recursiveEquals(term3549, term3560));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


