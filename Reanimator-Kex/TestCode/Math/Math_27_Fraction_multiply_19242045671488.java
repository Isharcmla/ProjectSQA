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

public class Fraction_multiply_19242045671488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620189;
     Object term620279;

    public Fraction_multiply_19242045671488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620189 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term620189, term620189.getClass(), "numerator", -410476158);
        term620279 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term620279, term620279.getClass(), "numerator", -528474110);
        setIntField(term620279, term620279.getClass(), "denominator", 2072258563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term620279;
        try {
            callMethod(klass, "multiply", argTypes, term620189, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


