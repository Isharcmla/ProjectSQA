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

public class Fraction_add_7517755721172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579587;
     Object term579677;

    public Fraction_add_7517755721172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term579587 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term579587, term579587.getClass(), "numerator", -2147483648);
        setIntField(term579587, term579587.getClass(), "denominator", -1308553486);
        term579677 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term579677, term579677.getClass(), "numerator", -2147483648);
        setIntField(term579677, term579677.getClass(), "denominator", -2029880319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term579677;
        try {
            callMethod(klass, "add", argTypes, term579587, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


