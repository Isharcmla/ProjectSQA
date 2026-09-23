package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_14436274402796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835348;
     Object term835428;

    public Fraction_subtract_14436274402796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term835348 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term835348, term835348.getClass(), "numerator", 524288);
        setIntField(term835348, term835348.getClass(), "denominator", -7340328);
        term835428 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term835428, term835428.getClass(), "numerator", -2147483648);
        setIntField(term835428, term835428.getClass(), "denominator", 6115020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term835428;
        try {
            callMethod(klass, "subtract", argTypes, term835348, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


