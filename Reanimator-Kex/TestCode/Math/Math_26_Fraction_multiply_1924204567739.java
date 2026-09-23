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

public class Fraction_multiply_1924204567739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349865;
     Object term349955;

    public Fraction_multiply_1924204567739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349865 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term349865, term349865.getClass(), "numerator", -704511978);
        setIntField(term349865, term349865.getClass(), "denominator", 671093068);
        term349955 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term349955, term349955.getClass(), "numerator", -2147483647);
        setIntField(term349955, term349955.getClass(), "denominator", 1060641809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term349955;
        try {
            callMethod(klass, "multiply", argTypes, term349865, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


