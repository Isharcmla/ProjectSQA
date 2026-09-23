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

public class Fraction_subtract_14436274402001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588158;
     Object term588238;

    public Fraction_subtract_14436274402001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588158 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term588158, term588158.getClass(), "numerator", 128);
        setIntField(term588158, term588158.getClass(), "denominator", -1377838216);
        term588238 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term588238, term588238.getClass(), "numerator", 1048576);
        setIntField(term588238, term588238.getClass(), "denominator", 1147725724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term588238;
        try {
            callMethod(klass, "subtract", argTypes, term588158, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


