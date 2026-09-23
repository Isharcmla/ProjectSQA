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

public class Fraction_multiplyBy_1636046455145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30659;
     Object term30739;

    public Fraction_multiplyBy_1636046455145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30659 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term30659, term30659.getClass(), "numerator", 1093999994);
        term30739 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term30739, term30739.getClass(), "numerator", 524289);
        setIntField(term30739, term30739.getClass(), "denominator", 1260737345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term30739;
        try {
            callMethod(klass, "multiplyBy", argTypes, term30659, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


