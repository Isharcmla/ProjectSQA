package org.apache.commons.lang.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_1636046455113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19917;
     Object term19997;

    public Fraction_multiplyBy_1636046455113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19917 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term19917, term19917.getClass(), "numerator", 1572898);
        setIntField(term19917, term19917.getClass(), "denominator", 16);
        term19997 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term19997, term19997.getClass(), "numerator", 268435458);
        setIntField(term19997, term19997.getClass(), "denominator", 2141519877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term19997;
        try {
            callMethod(klass, "multiplyBy", argTypes, term19917, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


