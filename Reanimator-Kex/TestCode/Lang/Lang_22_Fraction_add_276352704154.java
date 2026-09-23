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

public class Fraction_add_276352704154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35939;
     Object term36021;

    public Fraction_add_276352704154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35939 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term35939, term35939.getClass(), "numerator", 32);
        setIntField(term35939, term35939.getClass(), "denominator", 1180293004);
        term36021 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term36021, term36021.getClass(), "numerator", 128);
        setIntField(term36021, term36021.getClass(), "denominator", -1075154186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term36021;
        try {
            callMethod(klass, "add", argTypes, term35939, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


