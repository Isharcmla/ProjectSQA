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

public class Fraction_add_14549770212130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626848;
     Object term626928;

    public Fraction_add_14549770212130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626848 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term626848, term626848.getClass(), "numerator", 32);
        setIntField(term626848, term626848.getClass(), "denominator", 1621745212);
        term626928 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term626928, term626928.getClass(), "numerator", 8);
        setIntField(term626928, term626928.getClass(), "denominator", -1425917298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term626928;
        try {
            callMethod(klass, "add", argTypes, term626848, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


