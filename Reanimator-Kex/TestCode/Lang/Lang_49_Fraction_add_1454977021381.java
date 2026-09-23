package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1454977021381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102358;
     Object term102438;

    public Fraction_add_1454977021381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102358 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term102358, term102358.getClass(), "numerator", -2147483648);
        setIntField(term102358, term102358.getClass(), "denominator", 436879612);
        term102438 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term102438, term102438.getClass(), "numerator", 134217728);
        setIntField(term102438, term102438.getClass(), "denominator", -492658962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term102438;
        try {
            callMethod(klass, "add", argTypes, term102358, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


