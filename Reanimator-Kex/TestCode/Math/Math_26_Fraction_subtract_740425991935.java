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

public class Fraction_subtract_740425991935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453822;
     Object term453912;

    public Fraction_subtract_740425991935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453822 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term453822, term453822.getClass(), "numerator", 134217728);
        setIntField(term453822, term453822.getClass(), "denominator", 1);
        term453912 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term453912, term453912.getClass(), "numerator", -2147483648);
        setIntField(term453912, term453912.getClass(), "denominator", -32756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term453912;
        try {
            callMethod(klass, "subtract", argTypes, term453822, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


