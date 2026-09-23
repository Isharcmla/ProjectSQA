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

public class NormalDistributionImpl_getInitialDomain_110772615121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term44;
     Object term1006;

    public NormalDistributionImpl_getInitialDomain_110772615121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term41, term41.getClass(), "mean", 0.9828442029246764);
        setDoubleField(term41, term41.getClass(), "standardDeviation", 1.0);
        term44 = new Double(0.2779719046761513);
        term1006 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term1006, term1006.getClass(), "mean", 0.9828442029246764);
        setDoubleField(term1006, term1006.getClass(), "standardDeviation", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term44;
        Object retValue = callMethod(klass, "getInitialDomain", argTypes, term41, args);
        assertTrue(recursiveEquals(term41, term1006));
        assertTrue(recursiveEquals(term44, 0.2779719046761513));
        assertTrue(recursiveEquals(retValue, -0.017155797075323553));
    }

};


