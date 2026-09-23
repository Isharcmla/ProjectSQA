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

public class Fraction_multiply_19242045672258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1120778;
     Object term1120868;

    public Fraction_multiply_19242045672258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1120778 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1120778, term1120778.getClass(), "numerator", -1995994642);
        setIntField(term1120778, term1120778.getClass(), "denominator", 20);
        term1120868 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1120868, term1120868.getClass(), "numerator", -2147483647);
        setIntField(term1120868, term1120868.getClass(), "denominator", 1182828661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1120868;
        try {
            callMethod(klass, "multiply", argTypes, term1120778, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


