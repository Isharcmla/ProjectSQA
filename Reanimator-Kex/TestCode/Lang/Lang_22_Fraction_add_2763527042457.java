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

public class Fraction_add_2763527042457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803895;
     Object term803977;

    public Fraction_add_2763527042457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803895 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term803895, term803895.getClass(), "numerator", 8);
        setIntField(term803895, term803895.getClass(), "denominator", 1644593356);
        term803977 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term803977, term803977.getClass(), "numerator", 64);
        setIntField(term803977, term803977.getClass(), "denominator", -2122793066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term803977;
        try {
            callMethod(klass, "add", argTypes, term803895, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


