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

public class Fraction_add_14549770212404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713893;
     Object term713973;

    public Fraction_add_14549770212404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term713893 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term713893, term713893.getClass(), "numerator", 1024);
        setIntField(term713893, term713893.getClass(), "denominator", 836962588);
        term713973 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term713973, term713973.getClass(), "numerator", -2147483648);
        setIntField(term713973, term713973.getClass(), "denominator", -1246182530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term713973;
        try {
            callMethod(klass, "add", argTypes, term713893, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


