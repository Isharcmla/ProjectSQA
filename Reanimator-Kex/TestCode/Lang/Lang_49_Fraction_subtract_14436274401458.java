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

public class Fraction_subtract_14436274401458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426164;
     Object term426244;

    public Fraction_subtract_14436274401458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426164 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term426164, term426164.getClass(), "numerator", 4194304);
        setIntField(term426164, term426164.getClass(), "denominator", -10855368);
        term426244 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term426244, term426244.getClass(), "numerator", 1073741824);
        setIntField(term426244, term426244.getClass(), "denominator", 8328188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term426244;
        try {
            callMethod(klass, "subtract", argTypes, term426164, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


