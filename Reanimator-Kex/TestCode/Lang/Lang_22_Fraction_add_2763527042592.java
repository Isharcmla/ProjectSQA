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

public class Fraction_add_2763527042592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849269;
     Object term849351;

    public Fraction_add_2763527042592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849269 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term849269, term849269.getClass(), "numerator", 32768);
        setIntField(term849269, term849269.getClass(), "denominator", 1608507276);
        term849351 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term849351, term849351.getClass(), "numerator", 16384);
        setIntField(term849351, term849351.getClass(), "denominator", -1703936010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term849351;
        try {
            callMethod(klass, "add", argTypes, term849269, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


