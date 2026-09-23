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

public class Fraction_add_2763527042154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702063;
     Object term702145;

    public Fraction_add_2763527042154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702063 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term702063, term702063.getClass(), "numerator", 4194304);
        setIntField(term702063, term702063.getClass(), "denominator", 1410438268);
        term702145 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term702145, term702145.getClass(), "numerator", 256);
        setIntField(term702145, term702145.getClass(), "denominator", -2072067538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term702145;
        try {
            callMethod(klass, "add", argTypes, term702063, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


