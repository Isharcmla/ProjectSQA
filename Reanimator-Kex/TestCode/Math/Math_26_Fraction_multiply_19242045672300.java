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

public class Fraction_multiply_19242045672300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1141536;
     Object term1141626;

    public Fraction_multiply_19242045672300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1141536 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1141536, term1141536.getClass(), "numerator", -539015202);
        setIntField(term1141536, term1141536.getClass(), "denominator", 4);
        term1141626 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1141626, term1141626.getClass(), "numerator", -2147483647);
        setIntField(term1141626, term1141626.getClass(), "denominator", 2134899797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1141626;
        try {
            callMethod(klass, "multiply", argTypes, term1141536, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


