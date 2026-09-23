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

public class Fraction_add_276352704488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148264;
     Object term148346;

    public Fraction_add_276352704488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148264 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term148264, term148264.getClass(), "numerator", 67108864);
        setIntField(term148264, term148264.getClass(), "denominator", 1448153332);
        term148346 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term148346, term148346.getClass(), "numerator", 16);
        setIntField(term148346, term148346.getClass(), "denominator", -2094045238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term148346;
        try {
            callMethod(klass, "add", argTypes, term148264, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


