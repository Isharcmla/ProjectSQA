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

public class Fraction_subtract_2650031231796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584222;
     Object term584304;

    public Fraction_subtract_2650031231796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584222 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term584222, term584222.getClass(), "numerator", 2097152);
        setIntField(term584222, term584222.getClass(), "denominator", -1442118936);
        term584304 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term584304, term584304.getClass(), "numerator", -2147483648);
        setIntField(term584304, term584304.getClass(), "denominator", 1201749268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term584304;
        try {
            callMethod(klass, "subtract", argTypes, term584222, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


