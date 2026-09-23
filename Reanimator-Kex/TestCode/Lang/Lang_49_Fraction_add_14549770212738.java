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

public class Fraction_add_14549770212738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816014;
     Object term816094;

    public Fraction_add_14549770212738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term816014 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term816014, term816014.getClass(), "numerator", 16384);
        setIntField(term816014, term816014.getClass(), "denominator", 1094557276);
        term816094 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term816094, term816094.getClass(), "numerator", 8388608);
        setIntField(term816094, term816094.getClass(), "denominator", -1478755298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term816094;
        try {
            callMethod(klass, "add", argTypes, term816014, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


