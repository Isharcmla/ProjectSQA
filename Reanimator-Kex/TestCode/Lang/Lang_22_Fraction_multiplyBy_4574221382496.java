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

public class Fraction_multiplyBy_4574221382496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817277;
     Object term817359;

    public Fraction_multiplyBy_4574221382496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term817277 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term817277, term817277.getClass(), "numerator", 1323774390);
        setIntField(term817277, term817277.getClass(), "denominator", -536870912);
        term817359 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term817359, term817359.getClass(), "numerator", 269503497);
        setIntField(term817359, term817359.getClass(), "denominator", 1939497591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term817359;
        try {
            callMethod(klass, "multiplyBy", argTypes, term817277, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


