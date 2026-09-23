package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120789;
     Object term120877;

    public Fraction_add_1925368547354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120789 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term120789, term120789.getClass(), "numerator", 1073741824);
        setIntField(term120789, term120789.getClass(), "denominator", -245462801);
        term120877 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term120877, term120877.getClass(), "numerator", 33554432);
        setIntField(term120877, term120877.getClass(), "denominator", 1866368067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term120877;
        try {
            callMethod(klass, "add", argTypes, term120789, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


