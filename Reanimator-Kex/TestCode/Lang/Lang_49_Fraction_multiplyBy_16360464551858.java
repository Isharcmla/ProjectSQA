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

public class Fraction_multiplyBy_16360464551858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544653;
     Object term544733;

    public Fraction_multiplyBy_16360464551858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544653 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term544653, term544653.getClass(), "numerator", 17037826);
        term544733 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term544733, term544733.getClass(), "numerator", 17037826);
        setIntField(term544733, term544733.getClass(), "denominator", 2086797453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term544733;
        try {
            callMethod(klass, "multiplyBy", argTypes, term544653, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


