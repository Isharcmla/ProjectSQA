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

public class Fraction_subtract_2650031231747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567316;
     Object term567398;

    public Fraction_subtract_2650031231747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567316 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term567316, term567316.getClass(), "numerator", 2048);
        setIntField(term567316, term567316.getClass(), "denominator", -1835016);
        term567398 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term567398, term567398.getClass(), "numerator", 8388608);
        setIntField(term567398, term567398.getClass(), "denominator", 1441756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term567398;
        try {
            callMethod(klass, "subtract", argTypes, term567316, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


