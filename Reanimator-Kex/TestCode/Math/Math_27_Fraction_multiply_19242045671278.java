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

public class Fraction_multiply_19242045671278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523340;
     Object term523430;

    public Fraction_multiply_19242045671278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523340 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term523340, term523340.getClass(), "numerator", -243800958);
        term523430 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term523430, term523430.getClass(), "numerator", -243800958);
        setIntField(term523430, term523430.getClass(), "denominator", 2061728883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term523430;
        try {
            callMethod(klass, "multiply", argTypes, term523340, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


