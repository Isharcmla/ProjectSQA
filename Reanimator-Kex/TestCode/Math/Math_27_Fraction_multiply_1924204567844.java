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

public class Fraction_multiply_1924204567844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347333;
     Object term347423;

    public Fraction_multiply_1924204567844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347333 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term347333, term347333.getClass(), "numerator", -34);
        setIntField(term347333, term347333.getClass(), "denominator", 3228);
        term347423 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term347423, term347423.getClass(), "numerator", -2147483647);
        setIntField(term347423, term347423.getClass(), "denominator", 1244657149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term347423;
        try {
            callMethod(klass, "multiply", argTypes, term347333, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


