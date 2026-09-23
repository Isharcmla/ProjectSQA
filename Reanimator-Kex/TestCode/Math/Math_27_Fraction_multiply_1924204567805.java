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

public class Fraction_multiply_1924204567805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330338;
     Object term330428;

    public Fraction_multiply_1924204567805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330338 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term330338, term330338.getClass(), "numerator", -2145250814);
        setIntField(term330338, term330338.getClass(), "denominator", 4);
        term330428 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term330428, term330428.getClass(), "numerator", -2147483647);
        setIntField(term330428, term330428.getClass(), "denominator", 1141183419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term330428;
        try {
            callMethod(klass, "multiply", argTypes, term330338, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


