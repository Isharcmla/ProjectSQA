package org.apache.commons.math.special;

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
import static org.apache.commons.math.special.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.special.EqualityUtils.*;
import java.lang.Double;

public class Gamma_logGamma_76083977348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Gamma_logGamma_76083977348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        double[] term13461 = (double[]) newDoubleArray(14);
        setField(null, Class.forName("org.apache.commons.math.special.Gamma"), "lanczos", term13461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.special.Gamma");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.225073858508213E-308;
        Object retValue = callMethod(klass, "logGamma", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, Double.NEGATIVE_INFINITY));
    }

};


