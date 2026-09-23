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

public class Fraction_multiplyBy_4574221382438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796814;
     Object term796896;

    public Fraction_multiplyBy_4574221382438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term796814 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term796814, term796814.getClass(), "numerator", 823753394);
        term796896 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term796896, term796896.getClass(), "numerator", 822165554);
        setIntField(term796896, term796896.getClass(), "denominator", 2085814805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term796896;
        try {
            callMethod(klass, "multiplyBy", argTypes, term796814, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


