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

public class Fraction_multiplyBy_4574221382069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673969;
     Object term674051;

    public Fraction_multiplyBy_4574221382069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673969 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term673969, term673969.getClass(), "numerator", 48423906);
        term674051 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term674051, term674051.getClass(), "numerator", 48423906);
        setIntField(term674051, term674051.getClass(), "denominator", 641834501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term674051;
        try {
            callMethod(klass, "multiplyBy", argTypes, term673969, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


