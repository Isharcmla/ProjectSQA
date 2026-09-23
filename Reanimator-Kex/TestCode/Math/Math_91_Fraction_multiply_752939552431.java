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

public class Fraction_multiply_752939552431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155466;
     Object term155554;

    public Fraction_multiply_752939552431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155466 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term155466, term155466.getClass(), "numerator", -2147483630);
        setIntField(term155466, term155466.getClass(), "denominator", 2080374781);
        term155554 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term155554, term155554.getClass(), "numerator", -2080374797);
        setIntField(term155554, term155554.getClass(), "denominator", -2147483631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term155554;
        try {
            callMethod(klass, "multiply", argTypes, term155466, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


