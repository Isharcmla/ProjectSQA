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

public class Fraction_subtract_193671812886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18124;
     Object term18212;

    public Fraction_subtract_193671812886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18124 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term18124, term18124.getClass(), "numerator", 65536);
        setIntField(term18124, term18124.getClass(), "denominator", -2147483647);
        term18212 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term18212, term18212.getClass(), "numerator", 4096);
        setIntField(term18212, term18212.getClass(), "denominator", -1008696334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term18212;
        try {
            callMethod(klass, "subtract", argTypes, term18124, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


