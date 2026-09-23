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

public class Fraction_add_14549770211712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501803;
     Object term501883;

    public Fraction_add_14549770211712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501803 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term501803, term501803.getClass(), "numerator", 8388608);
        setIntField(term501803, term501803.getClass(), "denominator", 1410471756);
        term501883 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term501883, term501883.getClass(), "numerator", 128);
        setIntField(term501883, term501883.getClass(), "denominator", -2115573930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term501883;
        try {
            callMethod(klass, "add", argTypes, term501803, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


