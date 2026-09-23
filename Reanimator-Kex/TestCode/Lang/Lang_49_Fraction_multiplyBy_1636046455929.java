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

public class Fraction_multiplyBy_1636046455929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265084;
     Object term265164;

    public Fraction_multiplyBy_1636046455929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265084 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term265084, term265084.getClass(), "numerator", 124338258);
        setIntField(term265084, term265084.getClass(), "denominator", -2013265920);
        term265164 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term265164, term265164.getClass(), "numerator", 1284964268);
        setIntField(term265164, term265164.getClass(), "denominator", 1568669693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term265164;
        try {
            callMethod(klass, "multiplyBy", argTypes, term265084, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


