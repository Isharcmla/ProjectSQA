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

public class Fraction_subtract_14436274401073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309747;
     Object term309827;

    public Fraction_subtract_14436274401073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309747 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term309747, term309747.getClass(), "numerator", -2147483648);
        setIntField(term309747, term309747.getClass(), "denominator", -2147483647);
        term309827 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term309827, term309827.getClass(), "numerator", -2147483648);
        setIntField(term309827, term309827.getClass(), "denominator", 1073741824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term309827;
        try {
            callMethod(klass, "subtract", argTypes, term309747, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


