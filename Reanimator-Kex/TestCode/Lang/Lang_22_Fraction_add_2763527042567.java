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

public class Fraction_add_2763527042567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842265;
     Object term842347;

    public Fraction_add_2763527042567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term842265 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term842265, term842265.getClass(), "numerator", 268435456);
        setIntField(term842265, term842265.getClass(), "denominator", 1186370332);
        term842347 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term842347, term842347.getClass(), "numerator", 67108864);
        setIntField(term842347, term842347.getClass(), "denominator", -1695659650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term842347;
        try {
            callMethod(klass, "add", argTypes, term842265, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


