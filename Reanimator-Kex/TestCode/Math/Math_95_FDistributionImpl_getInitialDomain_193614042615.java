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

public class FDistributionImpl_getInitialDomain_193614042615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term28;
     Object term991;

    public FDistributionImpl_getInitialDomain_193614042615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term25, term25.getClass(), "numeratorDegreesOfFreedom", 0.7031006357544823);
        setDoubleField(term25, term25.getClass(), "denominatorDegreesOfFreedom", 0.9527281779865117);
        term28 = new Double(0.9828442029246764);
        term991 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term991, term991.getClass(), "numeratorDegreesOfFreedom", 0.7031006357544823);
        setDoubleField(term991, term991.getClass(), "denominatorDegreesOfFreedom", 0.9527281779865117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term28;
        Object retValue = callMethod(klass, "getInitialDomain", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term991));
        assertTrue(recursiveEquals(term28, 0.9828442029246764));
        assertTrue(recursiveEquals(retValue, -0.9097238729815086));
    }

};


