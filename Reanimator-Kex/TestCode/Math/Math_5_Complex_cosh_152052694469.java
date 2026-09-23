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

public class Complex_cosh_152052694469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term2107;
     Object term2097;

    public Complex_cosh_152052694469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term153, term153.getClass(), "imaginary", 0.43337207054070237);
        setDoubleField(term153, term153.getClass(), "real", 0.13246999699526574);
        setBooleanField(term153, term153.getClass(), "isNaN", true);
        setBooleanField(term153, term153.getClass(), "isInfinite", false);
        term2107 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term2107, term2107.getClass(), "imaginary", 0.43337207054070237);
        setDoubleField(term2107, term2107.getClass(), "real", 0.13246999699526574);
        setBooleanField(term2107, term2107.getClass(), "isNaN", true);
        setBooleanField(term2107, term2107.getClass(), "isInfinite", false);
        term2097 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term2097, term2097.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2097, term2097.getClass(), "real", Double.NaN);
        setBooleanField(term2097, term2097.getClass(), "isNaN", true);
        setBooleanField(term2097, term2097.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cosh", argTypes, term153, args);
        assertTrue(recursiveEquals(term153, term2107));
        assertTrue(recursiveEquals(retValue, term2097));
    }

};


