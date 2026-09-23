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

public class Fraction_add_276352704828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262217;
     Object term262299;

    public Fraction_add_276352704828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262217 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term262217, term262217.getClass(), "numerator", 2097152);
        setIntField(term262217, term262217.getClass(), "denominator", 709167316);
        term262299 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term262299, term262299.getClass(), "numerator", 1073741824);
        setIntField(term262299, term262299.getClass(), "denominator", -2520086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term262299;
        try {
            callMethod(klass, "add", argTypes, term262217, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


