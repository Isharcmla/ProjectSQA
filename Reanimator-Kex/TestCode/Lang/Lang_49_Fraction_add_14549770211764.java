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

public class Fraction_add_14549770211764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516332;
     Object term516412;

    public Fraction_add_14549770211764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516332 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term516332, term516332.getClass(), "numerator", 268435456);
        setIntField(term516332, term516332.getClass(), "denominator", 1385921276);
        term516412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term516412, term516412.getClass(), "numerator", 8192);
        setIntField(term516412, term516412.getClass(), "denominator", -2077229330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term516412;
        try {
            callMethod(klass, "add", argTypes, term516332, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


