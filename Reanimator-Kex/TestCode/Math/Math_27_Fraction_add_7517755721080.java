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

public class Fraction_add_7517755721080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450307;
     Object term450397;

    public Fraction_add_7517755721080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450307 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term450307, term450307.getClass(), "numerator", -2147483648);
        setIntField(term450307, term450307.getClass(), "denominator", -1864364030);
        term450397 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term450397, term450397.getClass(), "numerator", 16777216);
        setIntField(term450397, term450397.getClass(), "denominator", -2021662791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term450397;
        try {
            callMethod(klass, "add", argTypes, term450307, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


