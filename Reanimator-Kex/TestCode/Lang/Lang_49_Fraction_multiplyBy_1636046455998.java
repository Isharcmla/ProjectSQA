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

public class Fraction_multiplyBy_1636046455998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286513;
     Object term286593;

    public Fraction_multiplyBy_1636046455998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286513 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term286513, term286513.getClass(), "numerator", 570947202);
        setIntField(term286513, term286513.getClass(), "denominator", 1951531003);
        term286593 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term286593, term286593.getClass(), "numerator", 1301020674);
        setIntField(term286593, term286593.getClass(), "denominator", 1082622021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term286593;
        try {
            callMethod(klass, "multiplyBy", argTypes, term286513, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


