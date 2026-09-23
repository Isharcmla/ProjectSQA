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

public class Fraction_multiply_1924204567414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183143;
     Object term183233;

    public Fraction_multiply_1924204567414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183143 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term183143, term183143.getClass(), "numerator", -678895478);
        term183233 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term183233, term183233.getClass(), "numerator", -2101331968);
        setIntField(term183233, term183233.getClass(), "denominator", 1606441015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term183233;
        try {
            callMethod(klass, "multiply", argTypes, term183143, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


