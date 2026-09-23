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

public class Fraction_subtract_14436274402374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702608;
     Object term702688;

    public Fraction_subtract_14436274402374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702608 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term702608, term702608.getClass(), "numerator", 2);
        setIntField(term702608, term702608.getClass(), "denominator", -1634492616);
        term702688 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term702688, term702688.getClass(), "numerator", -2147483648);
        setIntField(term702688, term702688.getClass(), "denominator", 1891445372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term702688;
        try {
            callMethod(klass, "subtract", argTypes, term702608, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


