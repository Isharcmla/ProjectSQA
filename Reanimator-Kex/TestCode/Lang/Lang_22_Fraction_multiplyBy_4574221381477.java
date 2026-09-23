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

public class Fraction_multiplyBy_4574221381477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480384;
     Object term480466;

    public Fraction_multiplyBy_4574221381477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480384 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term480384, term480384.getClass(), "numerator", 756364394);
        term480466 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term480466, term480466.getClass(), "numerator", 85196842);
        setIntField(term480466, term480466.getClass(), "denominator", 1615593473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term480466;
        try {
            callMethod(klass, "multiplyBy", argTypes, term480384, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


