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

public class Fraction_multiply_19242045671402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700815;
     Object term700905;

    public Fraction_multiply_19242045671402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700815 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term700815, term700815.getClass(), "numerator", -536871010);
        setIntField(term700815, term700815.getClass(), "denominator", 1073741796);
        term700905 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term700905, term700905.getClass(), "numerator", -2147483647);
        setIntField(term700905, term700905.getClass(), "denominator", 1417674805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term700905;
        try {
            callMethod(klass, "multiply", argTypes, term700815, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


