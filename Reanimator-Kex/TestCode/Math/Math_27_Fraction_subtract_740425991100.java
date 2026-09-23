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

public class Fraction_subtract_740425991100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23095;
     Object term23185;

    public Fraction_subtract_740425991100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23095 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term23095, term23095.getClass(), "numerator", -2147483648);
        setIntField(term23095, term23095.getClass(), "denominator", 1);
        term23185 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term23185, term23185.getClass(), "numerator", -2147483648);
        setIntField(term23185, term23185.getClass(), "denominator", -1073761972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term23185;
        try {
            callMethod(klass, "subtract", argTypes, term23095, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


