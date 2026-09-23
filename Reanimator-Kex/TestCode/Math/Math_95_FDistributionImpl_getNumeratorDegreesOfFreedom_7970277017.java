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

public class FDistributionImpl_getNumeratorDegreesOfFreedom_7970277017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term1003;

    public FDistributionImpl_getNumeratorDegreesOfFreedom_7970277017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term35, term35.getClass(), "numeratorDegreesOfFreedom", 0.4569171842750229);
        setDoubleField(term35, term35.getClass(), "denominatorDegreesOfFreedom", 0.8598297828918529);
        term1003 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term1003, term1003.getClass(), "numeratorDegreesOfFreedom", 0.4569171842750229);
        setDoubleField(term1003, term1003.getClass(), "denominatorDegreesOfFreedom", 0.8598297828918529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumeratorDegreesOfFreedom", argTypes, term35, args);
        assertTrue(recursiveEquals(term35, term1003));
        assertTrue(recursiveEquals(retValue, 0.4569171842750229));
    }

};


