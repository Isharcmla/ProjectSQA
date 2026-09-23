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

public class Fraction_subtract_14436274402313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684799;
     Object term684879;

    public Fraction_subtract_14436274402313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684799 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term684799, term684799.getClass(), "numerator", 1073741824);
        setIntField(term684799, term684799.getClass(), "denominator", -809906248);
        term684879 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term684879, term684879.getClass(), "numerator", 1073741824);
        setIntField(term684879, term684879.getClass(), "denominator", 1040110524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term684879;
        try {
            callMethod(klass, "subtract", argTypes, term684799, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


