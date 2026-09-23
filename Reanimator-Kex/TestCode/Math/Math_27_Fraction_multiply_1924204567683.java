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

public class Fraction_multiply_1924204567683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280320;
     Object term280410;

    public Fraction_multiply_1924204567683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280320 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term280320, term280320.getClass(), "numerator", -536870906);
        term280410 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term280410, term280410.getClass(), "numerator", 1048580);
        setIntField(term280410, term280410.getClass(), "denominator", 1610612729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term280410;
        try {
            callMethod(klass, "multiply", argTypes, term280320, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


