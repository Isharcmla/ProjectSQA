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

public class Fraction_subtract_14436274401485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435857;
     Object term435937;

    public Fraction_subtract_14436274401485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435857 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term435857, term435857.getClass(), "numerator", 1073741824);
        setIntField(term435857, term435857.getClass(), "denominator", -546537608);
        term435937 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term435937, term435937.getClass(), "numerator", 268435456);
        setIntField(term435937, term435937.getClass(), "denominator", 430282140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term435937;
        try {
            callMethod(klass, "subtract", argTypes, term435857, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


