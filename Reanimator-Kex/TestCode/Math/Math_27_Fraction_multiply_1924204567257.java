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

public class Fraction_multiply_1924204567257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99747;
     Object term99837;

    public Fraction_multiply_1924204567257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99747 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term99747, term99747.getClass(), "numerator", -2147483646);
        term99837 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term99837, term99837.getClass(), "numerator", -2147483646);
        setIntField(term99837, term99837.getClass(), "denominator", 1073741923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term99837;
        try {
            callMethod(klass, "multiply", argTypes, term99747, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


