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

public class Fraction_add_14549770211513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445192;
     Object term445272;

    public Fraction_add_14549770211513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445192 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term445192, term445192.getClass(), "numerator", 2097152);
        setIntField(term445192, term445192.getClass(), "denominator", 69652);
        term445272 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term445272, term445272.getClass(), "numerator", 33554432);
        setIntField(term445272, term445272.getClass(), "denominator", -100390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term445272;
        try {
            callMethod(klass, "add", argTypes, term445192, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


