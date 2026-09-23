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

public class Fraction_subtract_14436274402165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639113;
     Object term639193;

    public Fraction_subtract_14436274402165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term639113 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term639113, term639113.getClass(), "numerator", 64);
        setIntField(term639113, term639113.getClass(), "denominator", -1948660024);
        term639193 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term639193, term639193.getClass(), "numerator", 2048);
        setIntField(term639193, term639193.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term639193;
        try {
            callMethod(klass, "subtract", argTypes, term639113, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


