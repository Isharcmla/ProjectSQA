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

public class Fraction_subtract_2650031231126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362347;
     Object term362429;

    public Fraction_subtract_2650031231126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362347 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term362347, term362347.getClass(), "numerator", 32);
        setIntField(term362347, term362347.getClass(), "denominator", -1686267432);
        term362429 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term362429, term362429.getClass(), "numerator", 262144);
        setIntField(term362429, term362429.getClass(), "denominator", 1360229196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term362429;
        try {
            callMethod(klass, "subtract", argTypes, term362347, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


