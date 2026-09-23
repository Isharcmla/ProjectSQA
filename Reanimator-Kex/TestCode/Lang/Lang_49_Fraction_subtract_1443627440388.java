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

public class Fraction_subtract_1443627440388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104005;
     Object term104085;

    public Fraction_subtract_1443627440388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104005 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term104005, term104005.getClass(), "numerator", 16384);
        setIntField(term104005, term104005.getClass(), "denominator", -2147483647);
        term104085 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term104085, term104085.getClass(), "numerator", 256);
        setIntField(term104085, term104085.getClass(), "denominator", 1073741824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term104085;
        try {
            callMethod(klass, "subtract", argTypes, term104005, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


