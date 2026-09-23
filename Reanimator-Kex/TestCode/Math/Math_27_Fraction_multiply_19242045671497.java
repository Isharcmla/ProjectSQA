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

public class Fraction_multiply_19242045671497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624568;
     Object term624658;

    public Fraction_multiply_19242045671497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624568 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term624568, term624568.getClass(), "numerator", -270602);
        term624658 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term624658, term624658.getClass(), "numerator", 4);
        setIntField(term624658, term624658.getClass(), "denominator", 1610679313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term624658;
        try {
            callMethod(klass, "multiply", argTypes, term624568, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


