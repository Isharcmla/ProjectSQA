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

public class Fraction_multiply_19242045671388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577430;
     Object term577520;

    public Fraction_multiply_19242045671388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577430 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term577430, term577430.getClass(), "numerator", -526628954);
        term577520 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term577520, term577520.getClass(), "numerator", -1609039866);
        setIntField(term577520, term577520.getClass(), "denominator", 973742297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term577520;
        try {
            callMethod(klass, "multiply", argTypes, term577430, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


