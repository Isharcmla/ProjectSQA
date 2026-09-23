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

public class Fraction_multiplyBy_16360464551585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465461;
     Object term465541;

    public Fraction_multiplyBy_16360464551585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465461 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term465461, term465461.getClass(), "numerator", 1593835514);
        term465541 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term465541, term465541.getClass(), "numerator", 1593835514);
        setIntField(term465541, term465541.getClass(), "denominator", 2013265905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term465541;
        try {
            callMethod(klass, "multiplyBy", argTypes, term465461, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


