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

public class Fraction_multiply_19242045671535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769012;
     Object term769102;

    public Fraction_multiply_19242045671535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term769012 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term769012, term769012.getClass(), "numerator", -2147483646);
        term769102 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term769102, term769102.getClass(), "numerator", -2147483646);
        setIntField(term769102, term769102.getClass(), "denominator", 2147483515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term769102;
        try {
            callMethod(klass, "multiply", argTypes, term769012, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


