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

public class Fraction_add_7517755721438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719321;
     Object term719411;

    public Fraction_add_7517755721438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719321 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term719321, term719321.getClass(), "numerator", -2147483648);
        setIntField(term719321, term719321.getClass(), "denominator", -871758846);
        term719411 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term719411, term719411.getClass(), "numerator", 16384);
        setIntField(term719411, term719411.getClass(), "denominator", -2054563319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term719411;
        try {
            callMethod(klass, "add", argTypes, term719321, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


