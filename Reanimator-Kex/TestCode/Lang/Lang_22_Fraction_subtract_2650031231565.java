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

public class Fraction_subtract_2650031231565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508516;
     Object term508598;

    public Fraction_subtract_2650031231565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term508516 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term508516, term508516.getClass(), "numerator", 2048);
        setIntField(term508516, term508516.getClass(), "denominator", -394428584);
        term508598 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term508598, term508598.getClass(), "numerator", 2048);
        setIntField(term508598, term508598.getClass(), "denominator", 322638860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term508598;
        try {
            callMethod(klass, "subtract", argTypes, term508516, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


