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

public class Fraction_add_2763527042192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713178;
     Object term713260;

    public Fraction_add_2763527042192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term713178 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term713178, term713178.getClass(), "numerator", 1073741824);
        setIntField(term713178, term713178.getClass(), "denominator", 1738775572);
        term713260 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term713260, term713260.getClass(), "numerator", 1073741824);
        setIntField(term713260, term713260.getClass(), "denominator", -2071242918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term713260;
        try {
            callMethod(klass, "add", argTypes, term713178, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


