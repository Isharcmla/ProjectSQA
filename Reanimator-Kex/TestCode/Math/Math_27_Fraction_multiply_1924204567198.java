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

public class Fraction_multiply_1924204567198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69687;
     Object term69777;

    public Fraction_multiply_1924204567198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69687 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term69687, term69687.getClass(), "numerator", -536870906);
        term69777 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term69777, term69777.getClass(), "numerator", 4);
        setIntField(term69777, term69777.getClass(), "denominator", 1610612729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term69777;
        try {
            callMethod(klass, "multiply", argTypes, term69687, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


