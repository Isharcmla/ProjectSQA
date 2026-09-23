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

public class Fraction_multiply_19242045672166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077669;
     Object term1077759;

    public Fraction_multiply_19242045672166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1077669 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1077669, term1077669.getClass(), "numerator", -805302270);
        term1077759 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1077759, term1077759.getClass(), "numerator", -805302270);
        setIntField(term1077759, term1077759.getClass(), "denominator", 803196715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1077759;
        try {
            callMethod(klass, "multiply", argTypes, term1077669, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


