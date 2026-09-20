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

public class Fraction_multiply_192420456787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22088;
     Object term22178;

    public Fraction_multiply_192420456787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22088 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term22088, term22088.getClass(), "numerator", -26203666);
        term22178 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term22178, term22178.getClass(), "numerator", 17662993);
        setIntField(term22178, term22178.getClass(), "denominator", 1657669049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term22178;
        try {
            callMethod(klass, "multiply", argTypes, term22088, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
