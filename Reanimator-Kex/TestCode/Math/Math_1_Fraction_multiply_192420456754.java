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

public class Fraction_multiply_192420456754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term100;

    public Fraction_multiply_192420456754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term97, term97.getClass(), "denominator", 454281060);
        setIntField(term97, term97.getClass(), "numerator", -1786399638);
        term100 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term100, term100.getClass(), "denominator", 2055867847);
        setIntField(term100, term100.getClass(), "numerator", -1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term100;
        try {
            callMethod(klass, "multiply", argTypes, term97, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
