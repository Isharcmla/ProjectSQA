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

public class Fraction_subtract_740425991987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411226;
     Object term411316;

    public Fraction_subtract_740425991987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411226 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term411226, term411226.getClass(), "numerator", 16);
        setIntField(term411226, term411226.getClass(), "denominator", 1);
        term411316 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term411316, term411316.getClass(), "numerator", 512);
        setIntField(term411316, term411316.getClass(), "denominator", -1710385396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term411316;
        try {
            callMethod(klass, "subtract", argTypes, term411226, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


