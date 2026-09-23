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

public class Fraction_multiplyBy_16360464552297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679731;
     Object term679811;

    public Fraction_multiplyBy_16360464552297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679731 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term679731, term679731.getClass(), "numerator", 540787682);
        setIntField(term679731, term679731.getClass(), "denominator", 16);
        term679811 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term679811, term679811.getClass(), "numerator", 2);
        setIntField(term679811, term679811.getClass(), "denominator", 1612571125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term679811;
        try {
            callMethod(klass, "multiplyBy", argTypes, term679731, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


