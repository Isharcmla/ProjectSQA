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
import java.lang.Double;

public class NormalDistributionImpl_getInitialDomain_110772615125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term81;
     Object term2552;

    public NormalDistributionImpl_getInitialDomain_110772615125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term79 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term75, term75.getClass(), "mean", 0.7332741045694002);
        setDoubleField(term75, term75.getClass(), "standardDeviation", 1.0);
        setDoubleField(term75, term75.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term79, term79.getClass(), "rand", null);
        setField(term79, term79.getClass(), "secRand", null);
        setField(term75, term75.getClass(), "randomData", term79);
        term81 = new Double(0.4569171842750229);
        term2552 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term2553 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term2552, term2552.getClass(), "mean", 0.7332741045694002);
        setDoubleField(term2552, term2552.getClass(), "standardDeviation", 1.0);
        setDoubleField(term2552, term2552.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term2553, term2553.getClass(), "rand", null);
        setField(term2553, term2553.getClass(), "secRand", null);
        setField(term2552, term2552.getClass(), "randomData", term2553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term81;
        Object retValue = callMethod(klass, "getInitialDomain", argTypes, term75, args);
        assertTrue(recursiveEquals(term75, term2552));
        assertTrue(recursiveEquals(term81, 0.4569171842750229));
        assertTrue(recursiveEquals(retValue, -0.26672589543059977));
    }

};


