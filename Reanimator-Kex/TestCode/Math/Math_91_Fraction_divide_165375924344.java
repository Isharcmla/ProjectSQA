package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_divide_165375924344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term94;

    public Fraction_divide_165375924344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term91, term91.getClass(), "denominator", 579005622);
        setIntField(term91, term91.getClass(), "numerator", -14890619);
        term94 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term94, term94.getClass(), "denominator", 1632125673);
        setIntField(term94, term94.getClass(), "numerator", 454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term94;
        try {
            callMethod(klass, "divide", argTypes, term91, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


