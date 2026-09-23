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

public class Fraction_multiplyBy_16360464551884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552562;
     Object term552642;

    public Fraction_multiplyBy_16360464551884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552562 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term552562, term552562.getClass(), "numerator", 1090012730);
        term552642 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term552642, term552642.getClass(), "numerator", 1090012730);
        setIntField(term552642, term552642.getClass(), "denominator", 591617889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term552642;
        try {
            callMethod(klass, "multiplyBy", argTypes, term552562, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


