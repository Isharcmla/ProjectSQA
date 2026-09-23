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

public class Fraction_add_2763527041678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544516;
     Object term544598;

    public Fraction_add_2763527041678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544516 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term544516, term544516.getClass(), "numerator", 67108864);
        setIntField(term544516, term544516.getClass(), "denominator", 930428);
        term544598 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term544598, term544598.getClass(), "numerator", 128);
        setIntField(term544598, term544598.getClass(), "denominator", -861010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term544598;
        try {
            callMethod(klass, "add", argTypes, term544516, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


