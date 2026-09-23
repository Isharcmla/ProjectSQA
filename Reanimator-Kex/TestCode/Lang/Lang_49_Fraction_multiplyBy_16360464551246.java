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

public class Fraction_multiplyBy_16360464551246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364481;
     Object term364561;

    public Fraction_multiplyBy_16360464551246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364481 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term364481, term364481.getClass(), "numerator", 311624922);
        term364561 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term364561, term364561.getClass(), "numerator", 269681858);
        setIntField(term364561, term364561.getClass(), "denominator", 1852400385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term364561;
        try {
            callMethod(klass, "multiplyBy", argTypes, term364481, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


