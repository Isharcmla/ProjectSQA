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

public class Fraction_multiply_1924204567610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280054;
     Object term280144;

    public Fraction_multiply_1924204567610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280054 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term280054, term280054.getClass(), "numerator", -2147483646);
        term280144 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term280144, term280144.getClass(), "numerator", -2147483646);
        setIntField(term280144, term280144.getClass(), "denominator", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term280144;
        try {
            callMethod(klass, "multiply", argTypes, term280054, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


