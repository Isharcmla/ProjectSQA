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

public class Fraction_subtract_740425991645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260315;
     Object term260405;

    public Fraction_subtract_740425991645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260315 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term260315, term260315.getClass(), "numerator", 33554432);
        setIntField(term260315, term260315.getClass(), "denominator", 1);
        term260405 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term260405, term260405.getClass(), "numerator", 1);
        setIntField(term260405, term260405.getClass(), "denominator", -1699137452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term260405;
        try {
            callMethod(klass, "subtract", argTypes, term260315, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


