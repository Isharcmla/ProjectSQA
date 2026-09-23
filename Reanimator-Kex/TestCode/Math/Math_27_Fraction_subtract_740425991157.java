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

public class Fraction_subtract_740425991157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49073;
     Object term49163;

    public Fraction_subtract_740425991157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49073 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term49073, term49073.getClass(), "numerator", 33554432);
        setIntField(term49073, term49073.getClass(), "denominator", 1);
        term49163 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term49163, term49163.getClass(), "numerator", 1);
        setIntField(term49163, term49163.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term49163;
        try {
            callMethod(klass, "subtract", argTypes, term49073, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


