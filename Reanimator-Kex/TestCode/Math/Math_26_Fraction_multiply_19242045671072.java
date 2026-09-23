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

public class Fraction_multiply_19242045671072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524871;
     Object term524961;

    public Fraction_multiply_19242045671072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524871 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term524871, term524871.getClass(), "numerator", -134217986);
        setIntField(term524871, term524871.getClass(), "denominator", 525884012);
        term524961 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term524961, term524961.getClass(), "numerator", -2147483647);
        setIntField(term524961, term524961.getClass(), "denominator", 132451973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term524961;
        try {
            callMethod(klass, "multiply", argTypes, term524871, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


