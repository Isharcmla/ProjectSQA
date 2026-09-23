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

public class Fraction_subtract_2650031231152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372348;
     Object term372430;

    public Fraction_subtract_2650031231152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372348 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term372348, term372348.getClass(), "numerator", 16384);
        setIntField(term372348, term372348.getClass(), "denominator", -272645384);
        term372430 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term372430, term372430.getClass(), "numerator", 1073741824);
        setIntField(term372430, term372430.getClass(), "denominator", 152924764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term372430;
        try {
            callMethod(klass, "subtract", argTypes, term372348, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


