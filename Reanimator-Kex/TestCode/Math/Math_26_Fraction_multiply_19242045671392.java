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

public class Fraction_multiply_19242045671392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696433;
     Object term696523;

    public Fraction_multiply_19242045671392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696433 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term696433, term696433.getClass(), "numerator", -2147482618);
        setIntField(term696433, term696433.getClass(), "denominator", 924844052);
        term696523 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term696523, term696523.getClass(), "numerator", -2147483647);
        setIntField(term696523, term696523.getClass(), "denominator", 2147482617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term696523;
        try {
            callMethod(klass, "multiply", argTypes, term696433, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


