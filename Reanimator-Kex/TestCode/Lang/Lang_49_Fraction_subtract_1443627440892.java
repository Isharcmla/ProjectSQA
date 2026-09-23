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

public class Fraction_subtract_1443627440892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253913;
     Object term253993;

    public Fraction_subtract_1443627440892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253913 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term253913, term253913.getClass(), "numerator", 256);
        setIntField(term253913, term253913.getClass(), "denominator", -889974936);
        term253993 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term253993, term253993.getClass(), "numerator", 8388608);
        setIntField(term253993, term253993.getClass(), "denominator", 1226440788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term253993;
        try {
            callMethod(klass, "subtract", argTypes, term253913, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


