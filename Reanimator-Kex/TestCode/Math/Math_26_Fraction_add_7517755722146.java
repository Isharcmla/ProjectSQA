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

public class Fraction_add_7517755722146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066540;
     Object term1066630;

    public Fraction_add_7517755722146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1066540 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1066540, term1066540.getClass(), "numerator", -2147483648);
        setIntField(term1066540, term1066540.getClass(), "denominator", -6290990);
        term1066630 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1066630, term1066630.getClass(), "numerator", -2147483648);
        setIntField(term1066630, term1066630.getClass(), "denominator", -2146434767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1066630;
        try {
            callMethod(klass, "add", argTypes, term1066540, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


