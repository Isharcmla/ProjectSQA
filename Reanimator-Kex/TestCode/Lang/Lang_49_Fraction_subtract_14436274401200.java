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

public class Fraction_subtract_14436274401200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349844;
     Object term349924;

    public Fraction_subtract_14436274401200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349844 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term349844, term349844.getClass(), "numerator", 1073741824);
        setIntField(term349844, term349844.getClass(), "denominator", -2147483647);
        term349924 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term349924, term349924.getClass(), "numerator", 1073741824);
        setIntField(term349924, term349924.getClass(), "denominator", 1073741824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term349924;
        try {
            callMethod(klass, "subtract", argTypes, term349844, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


