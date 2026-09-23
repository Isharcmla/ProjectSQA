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

public class Fraction_multiply_19242045671061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442650;
     Object term442740;

    public Fraction_multiply_19242045671061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442650 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term442650, term442650.getClass(), "numerator", -1052769854);
        term442740 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term442740, term442740.getClass(), "numerator", -1052769854);
        setIntField(term442740, term442740.getClass(), "denominator", 2094040291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term442740;
        try {
            callMethod(klass, "multiply", argTypes, term442650, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


