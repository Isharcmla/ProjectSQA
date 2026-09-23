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

public class Fraction_multiplyBy_1636046455377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101020;
     Object term101100;

    public Fraction_multiplyBy_1636046455377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101020 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term101020, term101020.getClass(), "numerator", 1585389314);
        setIntField(term101020, term101020.getClass(), "denominator", 1073741824);
        term101100 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term101100, term101100.getClass(), "numerator", 1073741825);
        setIntField(term101100, term101100.getClass(), "denominator", 813713445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term101100;
        try {
            callMethod(klass, "multiplyBy", argTypes, term101020, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


