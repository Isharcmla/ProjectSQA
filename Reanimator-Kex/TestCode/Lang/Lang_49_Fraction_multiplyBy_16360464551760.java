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

public class Fraction_multiplyBy_16360464551760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514989;
     Object term515069;

    public Fraction_multiplyBy_16360464551760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term514989 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term514989, term514989.getClass(), "numerator", 170100994);
        term515069 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term515069, term515069.getClass(), "numerator", 170100994);
        setIntField(term515069, term515069.getClass(), "denominator", 1183330949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term515069;
        try {
            callMethod(klass, "multiplyBy", argTypes, term514989, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


