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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FDistributionImpl_init_130866674823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public FDistributionImpl_init_130866674823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1674 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term1674, term1674.getClass(), "numeratorDegreesOfFreedom", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 2.225073858507202E-308;
        args[1] = -1.6578092E-316;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


