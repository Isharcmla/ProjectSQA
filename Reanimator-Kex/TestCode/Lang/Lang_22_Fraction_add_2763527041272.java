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

public class Fraction_add_2763527041272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412372;
     Object term412454;

    public Fraction_add_2763527041272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412372 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term412372, term412372.getClass(), "numerator", -2147483648);
        setIntField(term412372, term412372.getClass(), "denominator", 1479996700);
        term412454 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term412454, term412454.getClass(), "numerator", -2147483648);
        setIntField(term412454, term412454.getClass(), "denominator", -1948975106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term412454;
        try {
            callMethod(klass, "add", argTypes, term412372, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


