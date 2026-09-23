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

public class Fraction_add_7517755721526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763126;
     Object term763216;

    public Fraction_add_7517755721526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term763126 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term763126, term763126.getClass(), "numerator", 8388608);
        setIntField(term763126, term763126.getClass(), "denominator", -2109734894);
        term763216 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term763216, term763216.getClass(), "numerator", 536870912);
        setIntField(term763216, term763216.getClass(), "denominator", -1642070079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term763216;
        try {
            callMethod(klass, "add", argTypes, term763126, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


