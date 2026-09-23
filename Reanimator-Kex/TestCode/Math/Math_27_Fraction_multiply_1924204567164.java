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

public class Fraction_multiply_1924204567164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51228;
     Object term51318;

    public Fraction_multiply_1924204567164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51228 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term51228, term51228.getClass(), "numerator", -531726306);
        term51318 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term51318, term51318.getClass(), "numerator", -1069514734);
        setIntField(term51318, term51318.getClass(), "denominator", 1214065693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term51318;
        try {
            callMethod(klass, "multiply", argTypes, term51228, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


