package org.apache.commons.lang3.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_2650031232371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775148;
     Object term775230;

    public Fraction_subtract_2650031232371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775148 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term775148, term775148.getClass(), "numerator", 262144);
        setIntField(term775148, term775148.getClass(), "denominator", -545526216);
        term775230 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term775230, term775230.getClass(), "numerator", 32);
        setIntField(term775230, term775230.getClass(), "denominator", 426884092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term775230;
        try {
            callMethod(klass, "subtract", argTypes, term775148, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


