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

public class NormalDistributionImpl_getInitialDomain_110772615126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;
     Object term1448;

    public NormalDistributionImpl_getInitialDomain_110772615126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1163 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        term1448 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term1448, term1448.getClass(), "mean", 0.0);
        setDoubleField(term1448, term1448.getClass(), "standardDeviation", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.5;
        Object retValue = callMethod(klass, "getInitialDomain", argTypes, term1163, args);
        assertTrue(recursiveEquals(term1163, term1448));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


