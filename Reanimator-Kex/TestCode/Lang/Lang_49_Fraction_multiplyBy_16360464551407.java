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

public class Fraction_multiplyBy_16360464551407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410920;
     Object term411000;

    public Fraction_multiplyBy_16360464551407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410920 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term410920, term410920.getClass(), "numerator", 268435294);
        setIntField(term410920, term410920.getClass(), "denominator", 0);
        term411000 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term411000, term411000.getClass(), "numerator", 805306369);
        setIntField(term411000, term411000.getClass(), "denominator", 1342177475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term411000;
        try {
            callMethod(klass, "multiplyBy", argTypes, term410920, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


