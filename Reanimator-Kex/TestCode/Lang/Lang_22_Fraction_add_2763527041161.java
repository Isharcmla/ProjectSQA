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

public class Fraction_add_2763527041161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375031;
     Object term375113;

    public Fraction_add_2763527041161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375031 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term375031, term375031.getClass(), "numerator", 32768);
        setIntField(term375031, term375031.getClass(), "denominator", 58792732);
        term375113 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term375113, term375113.getClass(), "numerator", 536870912);
        setIntField(term375113, term375113.getClass(), "denominator", -74428290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term375113;
        try {
            callMethod(klass, "add", argTypes, term375031, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


