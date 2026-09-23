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

public class Fraction_add_7517755721336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665382;
     Object term665472;

    public Fraction_add_7517755721336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665382 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term665382, term665382.getClass(), "numerator", 4194304);
        setIntField(term665382, term665382.getClass(), "denominator", -2146392894);
        term665472 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term665472, term665472.getClass(), "numerator", 134217728);
        setIntField(term665472, term665472.getClass(), "denominator", -1797464563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term665472;
        try {
            callMethod(klass, "add", argTypes, term665382, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


