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

public class Fraction_add_14549770212385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706481;
     Object term706561;

    public Fraction_add_14549770212385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706481 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term706481, term706481.getClass(), "numerator", -2147483648);
        setIntField(term706481, term706481.getClass(), "denominator", 1393725852);
        term706561 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term706561, term706561.getClass(), "numerator", 33554432);
        setIntField(term706561, term706561.getClass(), "denominator", -1918944834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term706561;
        try {
            callMethod(klass, "add", argTypes, term706481, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


