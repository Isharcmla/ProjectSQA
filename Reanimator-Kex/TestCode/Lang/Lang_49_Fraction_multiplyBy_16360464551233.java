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

public class Fraction_multiplyBy_16360464551233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360384;
     Object term360464;

    public Fraction_multiplyBy_16360464551233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360384 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term360384, term360384.getClass(), "numerator", 1149295742);
        setIntField(term360384, term360384.getClass(), "denominator", 1333788661);
        term360464 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term360464, term360464.getClass(), "numerator", 1610612702);
        setIntField(term360464, term360464.getClass(), "denominator", 1376145483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term360464;
        try {
            callMethod(klass, "multiplyBy", argTypes, term360384, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


