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

public class Fraction_subtract_193671812873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14302;
     Object term14390;

    public Fraction_subtract_193671812873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14302 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term14302, term14302.getClass(), "numerator", 32);
        setIntField(term14302, term14302.getClass(), "denominator", -2147483647);
        term14390 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term14390, term14390.getClass(), "numerator", 256);
        setIntField(term14390, term14390.getClass(), "denominator", -1194864370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term14390;
        try {
            callMethod(klass, "subtract", argTypes, term14302, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


