package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_1936718128586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221817;
     Object term221905;

    public Fraction_subtract_1936718128586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221817 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term221817, term221817.getClass(), "numerator", 2097152);
        setIntField(term221817, term221817.getClass(), "denominator", -2147483647);
        term221905 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term221905, term221905.getClass(), "numerator", 1048576);
        setIntField(term221905, term221905.getClass(), "denominator", -1085328534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term221905;
        try {
            callMethod(klass, "subtract", argTypes, term221817, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


