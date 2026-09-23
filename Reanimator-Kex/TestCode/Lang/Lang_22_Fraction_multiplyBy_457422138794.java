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

public class Fraction_multiplyBy_457422138794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250833;
     Object term250915;

    public Fraction_multiplyBy_457422138794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250833 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term250833, term250833.getClass(), "numerator", 667872898);
        term250915 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term250915, term250915.getClass(), "numerator", 667872898);
        setIntField(term250915, term250915.getClass(), "denominator", 1561362453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term250915;
        try {
            callMethod(klass, "multiplyBy", argTypes, term250833, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


