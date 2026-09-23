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

public class Fraction_multiply_19242045671091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534199;
     Object term534289;

    public Fraction_multiply_19242045671091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534199 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term534199, term534199.getClass(), "numerator", -570438154);
        term534289 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term534289, term534289.getClass(), "numerator", 4);
        setIntField(term534289, term534289.getClass(), "denominator", 1778388097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term534289;
        try {
            callMethod(klass, "multiply", argTypes, term534199, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


