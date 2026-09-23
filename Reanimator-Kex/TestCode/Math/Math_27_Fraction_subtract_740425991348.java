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

public class Fraction_subtract_740425991348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137862;
     Object term137952;

    public Fraction_subtract_740425991348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137862 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term137862, term137862.getClass(), "numerator", -2147483648);
        setIntField(term137862, term137862.getClass(), "denominator", 1);
        term137952 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term137952, term137952.getClass(), "numerator", -2147483648);
        setIntField(term137952, term137952.getClass(), "denominator", -1165400348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term137952;
        try {
            callMethod(klass, "subtract", argTypes, term137862, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


