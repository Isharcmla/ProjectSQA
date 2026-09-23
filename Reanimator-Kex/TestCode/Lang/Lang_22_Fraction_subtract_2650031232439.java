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

public class Fraction_subtract_2650031232439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797391;
     Object term797473;

    public Fraction_subtract_2650031232439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term797391 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term797391, term797391.getClass(), "numerator", 8388608);
        setIntField(term797391, term797391.getClass(), "denominator", -441507080);
        term797473 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term797473, term797473.getClass(), "numerator", 512);
        setIntField(term797473, term797473.getClass(), "denominator", 253253724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term797473;
        try {
            callMethod(klass, "subtract", argTypes, term797391, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


