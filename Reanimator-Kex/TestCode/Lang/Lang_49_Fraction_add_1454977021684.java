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

public class Fraction_add_1454977021684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188754;
     Object term188834;

    public Fraction_add_1454977021684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188754 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term188754, term188754.getClass(), "numerator", 16);
        setIntField(term188754, term188754.getClass(), "denominator", 1334806012);
        term188834 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term188834, term188834.getClass(), "numerator", 64);
        setIntField(term188834, term188834.getClass(), "denominator", -1981216530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term188834;
        try {
            callMethod(klass, "add", argTypes, term188754, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


