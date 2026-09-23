package org.apache.commons.lang3.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_265003123274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73849;
     Object term73931;

    public Fraction_subtract_265003123274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73849 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term73849, term73849.getClass(), "numerator", 256);
        setIntField(term73849, term73849.getClass(), "denominator", -536870920);
        term73931 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term73931, term73931.getClass(), "numerator", 1);
        setIntField(term73931, term73931.getClass(), "denominator", 357738716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term73931;
        try {
            callMethod(klass, "subtract", argTypes, term73849, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


