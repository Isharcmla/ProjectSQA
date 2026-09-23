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

public class Fraction_multiplyBy_16360464551469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430084;
     Object term430164;

    public Fraction_multiplyBy_16360464551469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430084 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term430084, term430084.getClass(), "numerator", 1329714682);
        term430164 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term430164, term430164.getClass(), "numerator", 1463928314);
        setIntField(term430164, term430164.getClass(), "denominator", 1476407297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term430164;
        try {
            callMethod(klass, "multiplyBy", argTypes, term430084, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


