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

public class Fraction_subtract_14436274402303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682060;
     Object term682140;

    public Fraction_subtract_14436274402303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682060 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term682060, term682060.getClass(), "numerator", -2147483648);
        setIntField(term682060, term682060.getClass(), "denominator", -1449665032);
        term682140 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term682140, term682140.getClass(), "numerator", 131072);
        setIntField(term682140, term682140.getClass(), "denominator", 1748549596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term682140;
        try {
            callMethod(klass, "subtract", argTypes, term682060, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


