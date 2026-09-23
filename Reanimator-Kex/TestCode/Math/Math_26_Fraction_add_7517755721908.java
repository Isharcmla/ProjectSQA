package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_7517755721908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955525;
     Object term955615;

    public Fraction_add_7517755721908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term955525 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term955525, term955525.getClass(), "numerator", 2048);
        setIntField(term955525, term955525.getClass(), "denominator", -989782878);
        term955615 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term955615, term955615.getClass(), "numerator", 16777216);
        setIntField(term955615, term955615.getClass(), "denominator", -1811941739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term955615;
        try {
            callMethod(klass, "add", argTypes, term955525, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


