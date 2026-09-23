package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_751775572363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157808;
     Object term157898;

    public Fraction_add_751775572363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157808 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term157808, term157808.getClass(), "numerator", 4096);
        setIntField(term157808, term157808.getClass(), "denominator", -31829902);
        term157898 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term157898, term157898.getClass(), "numerator", 134217728);
        setIntField(term157898, term157898.getClass(), "denominator", -1870874047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term157898;
        try {
            callMethod(klass, "add", argTypes, term157808, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


