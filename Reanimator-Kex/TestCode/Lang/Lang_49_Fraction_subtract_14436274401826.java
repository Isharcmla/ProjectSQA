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

public class Fraction_subtract_14436274401826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534180;
     Object term534260;

    public Fraction_subtract_14436274401826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534180 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term534180, term534180.getClass(), "numerator", 1073741824);
        setIntField(term534180, term534180.getClass(), "denominator", -2146451448);
        term534260 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term534260, term534260.getClass(), "numerator", 1073741824);
        setIntField(term534260, term534260.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term534260;
        try {
            callMethod(klass, "subtract", argTypes, term534180, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


