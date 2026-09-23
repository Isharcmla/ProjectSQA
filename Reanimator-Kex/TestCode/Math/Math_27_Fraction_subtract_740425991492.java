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

public class Fraction_subtract_740425991492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196692;
     Object term196782;

    public Fraction_subtract_740425991492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196692 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term196692, term196692.getClass(), "numerator", 134217728);
        setIntField(term196692, term196692.getClass(), "denominator", 1);
        term196782 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term196782, term196782.getClass(), "numerator", 536870912);
        setIntField(term196782, term196782.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term196782;
        try {
            callMethod(klass, "subtract", argTypes, term196692, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


