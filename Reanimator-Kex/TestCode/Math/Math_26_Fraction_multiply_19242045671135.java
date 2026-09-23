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

public class Fraction_multiply_19242045671135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558160;
     Object term558250;

    public Fraction_multiply_19242045671135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558160 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term558160, term558160.getClass(), "numerator", -1341642174);
        term558250 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term558250, term558250.getClass(), "numerator", -2147481086);
        setIntField(term558250, term558250.getClass(), "denominator", 2013531019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term558250;
        try {
            callMethod(klass, "multiply", argTypes, term558160, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


