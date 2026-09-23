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

public class Fraction_subtract_7404259911468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610329;
     Object term610419;

    public Fraction_subtract_7404259911468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610329 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term610329, term610329.getClass(), "numerator", -2147483648);
        setIntField(term610329, term610329.getClass(), "denominator", 1);
        term610419 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term610419, term610419.getClass(), "numerator", -2147483648);
        setIntField(term610419, term610419.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term610419;
        try {
            callMethod(klass, "subtract", argTypes, term610329, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


