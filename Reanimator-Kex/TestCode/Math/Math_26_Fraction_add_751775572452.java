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

public class Fraction_add_751775572452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202400;
     Object term202490;

    public Fraction_add_751775572452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202400 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term202400, term202400.getClass(), "numerator", 64);
        setIntField(term202400, term202400.getClass(), "denominator", -2096253630);
        term202490 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term202490, term202490.getClass(), "numerator", 16384);
        setIntField(term202490, term202490.getClass(), "denominator", -1103490135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term202490;
        try {
            callMethod(klass, "add", argTypes, term202400, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


