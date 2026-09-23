package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class Complex_init_17686043790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10803;

    public Complex_init_17686043790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2257 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term2257, term2257.getClass(), "real", 0.0);
        setDoubleField(term2257, term2257.getClass(), "imaginary", 0.0);
        setBooleanField(term2257, term2257.getClass(), "isNaN", false);
        term10803 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10803, term10803.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term10803, term10803.getClass(), "real", -2.225073858507202E-308);
        setBooleanField(term10803, term10803.getClass(), "isNaN", false);
        setBooleanField(term10803, term10803.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -2.225073858507202E-308;
        args[1] = Double.POSITIVE_INFINITY;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10803));
    }

};


