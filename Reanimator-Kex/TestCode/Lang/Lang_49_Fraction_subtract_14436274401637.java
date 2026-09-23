package org.apache.commons.lang.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_14436274401637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480187;
     Object term480267;

    public Fraction_subtract_14436274401637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480187 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term480187, term480187.getClass(), "numerator", -2147483648);
        setIntField(term480187, term480187.getClass(), "denominator", -1605004251);
        term480267 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term480267, term480267.getClass(), "numerator", -2147483648);
        setIntField(term480267, term480267.getClass(), "denominator", 98304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term480267;
        try {
            callMethod(klass, "subtract", argTypes, term480187, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


