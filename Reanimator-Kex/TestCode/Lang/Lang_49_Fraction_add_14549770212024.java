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

public class Fraction_add_14549770212024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594044;
     Object term594124;

    public Fraction_add_14549770212024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594044 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term594044, term594044.getClass(), "numerator", -2147483648);
        setIntField(term594044, term594044.getClass(), "denominator", 1343489068);
        term594124 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term594124, term594124.getClass(), "numerator", -2147483648);
        setIntField(term594124, term594124.getClass(), "denominator", -2014446522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term594124;
        try {
            callMethod(klass, "add", argTypes, term594044, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


