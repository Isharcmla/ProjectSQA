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

public class Fraction_addSub_635379901220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53444;
     Object term53524;

    public Fraction_addSub_635379901220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53444 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term53444, term53444.getClass(), "numerator", 268435456);
        setIntField(term53444, term53444.getClass(), "denominator", 1073741825);
        term53524 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term53524, term53524.getClass(), "numerator", 8388608);
        setIntField(term53524, term53524.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term53524;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term53444, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


