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

public class Fraction_multiply_1924204567825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400715;
     Object term400805;

    public Fraction_multiply_1924204567825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400715 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term400715, term400715.getClass(), "numerator", -2147483646);
        term400805 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term400805, term400805.getClass(), "numerator", -2147483646);
        setIntField(term400805, term400805.getClass(), "denominator", 2147483515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term400805;
        try {
            callMethod(klass, "multiply", argTypes, term400715, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


