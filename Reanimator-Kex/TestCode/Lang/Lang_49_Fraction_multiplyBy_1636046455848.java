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

public class Fraction_multiplyBy_1636046455848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240064;
     Object term240144;

    public Fraction_multiplyBy_1636046455848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240064 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term240064, term240064.getClass(), "numerator", 181652530);
        term240144 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term240144, term240144.getClass(), "numerator", 42091522);
        setIntField(term240144, term240144.getClass(), "denominator", 210514189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term240144;
        try {
            callMethod(klass, "multiplyBy", argTypes, term240064, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


