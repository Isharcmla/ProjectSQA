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

public class Fraction_add_2763527041496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486457;
     Object term486539;

    public Fraction_add_2763527041496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486457 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term486457, term486457.getClass(), "numerator", 4194304);
        setIntField(term486457, term486457.getClass(), "denominator", 1408856924);
        term486539 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term486539, term486539.getClass(), "numerator", 256);
        setIntField(term486539, term486539.getClass(), "denominator", -2080745570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term486539;
        try {
            callMethod(klass, "add", argTypes, term486457, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


