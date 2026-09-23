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

public class Fraction_multiply_19242045671543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643620;
     Object term643710;

    public Fraction_multiply_19242045671543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term643620 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term643620, term643620.getClass(), "numerator", -904912682);
        setIntField(term643620, term643620.getClass(), "denominator", 6);
        term643710 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term643710, term643710.getClass(), "numerator", -2147483647);
        setIntField(term643710, term643710.getClass(), "denominator", 1620070441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term643710;
        try {
            callMethod(klass, "multiply", argTypes, term643620, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


