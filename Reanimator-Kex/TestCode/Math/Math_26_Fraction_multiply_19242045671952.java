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

public class Fraction_multiply_19242045671952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976188;
     Object term976278;

    public Fraction_multiply_19242045671952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term976188 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term976188, term976188.getClass(), "numerator", -1023922658);
        term976278 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term976278, term976278.getClass(), "numerator", -1023889890);
        setIntField(term976278, term976278.getClass(), "denominator", 1977084061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term976278;
        try {
            callMethod(klass, "multiply", argTypes, term976188, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


