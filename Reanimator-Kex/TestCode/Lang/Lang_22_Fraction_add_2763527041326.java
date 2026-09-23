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

public class Fraction_add_2763527041326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431646;
     Object term431728;

    public Fraction_add_2763527041326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431646 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term431646, term431646.getClass(), "numerator", 2097152);
        setIntField(term431646, term431646.getClass(), "denominator", 1073741825);
        term431728 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term431728, term431728.getClass(), "numerator", 64);
        setIntField(term431728, term431728.getClass(), "denominator", -65536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term431728;
        try {
            callMethod(klass, "add", argTypes, term431646, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


