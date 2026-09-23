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

public class Fraction_add_2763527041383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451816;
     Object term451898;

    public Fraction_add_2763527041383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451816 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term451816, term451816.getClass(), "numerator", 1024);
        setIntField(term451816, term451816.getClass(), "denominator", 828620132);
        term451898 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term451898, term451898.getClass(), "numerator", 33554432);
        setIntField(term451898, term451898.getClass(), "denominator", -1240865726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term451898;
        try {
            callMethod(klass, "add", argTypes, term451816, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


