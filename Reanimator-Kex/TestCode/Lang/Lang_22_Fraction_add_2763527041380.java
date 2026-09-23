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

public class Fraction_add_2763527041380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450317;
     Object term450399;

    public Fraction_add_2763527041380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450317 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term450317, term450317.getClass(), "numerator", 2097152);
        setIntField(term450317, term450317.getClass(), "denominator", 1235952412);
        term450399 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term450399, term450399.getClass(), "numerator", 16384);
        setIntField(term450399, term450399.getClass(), "denominator", -1839673858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term450399;
        try {
            callMethod(klass, "add", argTypes, term450317, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


