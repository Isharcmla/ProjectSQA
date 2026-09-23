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
import java.lang.Double;

public class Complex_multiply_109920531799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12597;
     Object term12610;
     Object term12599;

    public Complex_multiply_109920531799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12597 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term12597, term12597.getClass(), "isNaN", true);
        term12610 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term12610, term12610.getClass(), "imaginary", 0.0);
        setDoubleField(term12610, term12610.getClass(), "real", 0.0);
        setBooleanField(term12610, term12610.getClass(), "isNaN", true);
        setBooleanField(term12610, term12610.getClass(), "isInfinite", false);
        term12599 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term12599, term12599.getClass(), "imaginary", Double.NaN);
        setDoubleField(term12599, term12599.getClass(), "real", Double.NaN);
        setBooleanField(term12599, term12599.getClass(), "isNaN", true);
        setBooleanField(term12599, term12599.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "multiply", argTypes, term12597, args);
        assertTrue(recursiveEquals(term12597, term12610));
        assertTrue(recursiveEquals(retValue, term12599));
    }

};


