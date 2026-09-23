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

public class Fraction_multiply_1924204567569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261028;
     Object term261118;

    public Fraction_multiply_1924204567569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261028 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term261028, term261028.getClass(), "numerator", -905829358);
        setIntField(term261028, term261028.getClass(), "denominator", 2147483644);
        term261118 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term261118, term261118.getClass(), "numerator", -2147483647);
        setIntField(term261118, term261118.getClass(), "denominator", 1966158339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term261118;
        try {
            callMethod(klass, "multiply", argTypes, term261028, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


