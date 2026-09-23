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

public class Fraction_add_7517755721214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604503;
     Object term604593;

    public Fraction_add_7517755721214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604503 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term604503, term604503.getClass(), "numerator", -2147483648);
        setIntField(term604503, term604503.getClass(), "denominator", -1005518790);
        term604593 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term604593, term604593.getClass(), "numerator", 16);
        setIntField(term604593, term604593.getClass(), "denominator", -1611142543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term604593;
        try {
            callMethod(klass, "add", argTypes, term604503, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


