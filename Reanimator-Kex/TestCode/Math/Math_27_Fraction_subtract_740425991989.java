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

public class Fraction_subtract_740425991989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412810;
     Object term412900;

    public Fraction_subtract_740425991989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412810 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term412810, term412810.getClass(), "numerator", 134217728);
        setIntField(term412810, term412810.getClass(), "denominator", 1);
        term412900 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term412900, term412900.getClass(), "numerator", -2147483648);
        setIntField(term412900, term412900.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term412900;
        try {
            callMethod(klass, "subtract", argTypes, term412810, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


