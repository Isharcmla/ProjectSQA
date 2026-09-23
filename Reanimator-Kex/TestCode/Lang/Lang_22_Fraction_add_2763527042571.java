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

public class Fraction_add_2763527042571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843881;
     Object term843963;

    public Fraction_add_2763527042571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843881 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term843881, term843881.getClass(), "numerator", 33554432);
        setIntField(term843881, term843881.getClass(), "denominator", 1611651788);
        term843963 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term843963, term843963.getClass(), "numerator", 16);
        setIntField(term843963, term843963.getClass(), "denominator", -1727177322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term843963;
        try {
            callMethod(klass, "add", argTypes, term843881, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


