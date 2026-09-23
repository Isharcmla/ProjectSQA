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

public class Fraction_multiplyBy_16360464551975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580263;
     Object term580343;

    public Fraction_multiplyBy_16360464551975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580263 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term580263, term580263.getClass(), "numerator", 247756654);
        setIntField(term580263, term580263.getClass(), "denominator", -62128128);
        term580343 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term580343, term580343.getClass(), "numerator", 272236673);
        setIntField(term580343, term580343.getClass(), "denominator", 598792107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term580343;
        try {
            callMethod(klass, "multiplyBy", argTypes, term580263, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


