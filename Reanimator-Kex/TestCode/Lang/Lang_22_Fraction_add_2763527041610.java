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

public class Fraction_add_2763527041610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523278;
     Object term523360;

    public Fraction_add_2763527041610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523278 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term523278, term523278.getClass(), "numerator", 2097152);
        setIntField(term523278, term523278.getClass(), "denominator", 1632122716);
        term523360 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term523360, term523360.getClass(), "numerator", 524288);
        setIntField(term523360, term523360.getClass(), "denominator", -2074359906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term523360;
        try {
            callMethod(klass, "add", argTypes, term523278, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


