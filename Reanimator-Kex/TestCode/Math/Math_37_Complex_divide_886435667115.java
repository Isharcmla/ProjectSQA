package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;
import java.lang.Double;

public class Complex_divide_886435667115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19228;
     Object term19248;
     Object term19249;
     Object term19243;

    public Complex_divide_886435667115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19228 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term19228, term19228.getClass(), "isNaN", false);
        setDoubleField(term19228, term19228.getClass(), "real", 0.0);
        setDoubleField(term19228, term19228.getClass(), "imaginary", 0.0);
        term19248 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19248, term19248.getClass(), "imaginary", 0.0);
        setDoubleField(term19248, term19248.getClass(), "real", 0.0);
        setBooleanField(term19248, term19248.getClass(), "isNaN", false);
        setBooleanField(term19248, term19248.getClass(), "isInfinite", false);
        term19249 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19249, term19249.getClass(), "imaginary", 0.0);
        setDoubleField(term19249, term19249.getClass(), "real", 0.0);
        setBooleanField(term19249, term19249.getClass(), "isNaN", false);
        setBooleanField(term19249, term19249.getClass(), "isInfinite", false);
        term19243 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19243, term19243.getClass(), "imaginary", Double.NaN);
        setDoubleField(term19243, term19243.getClass(), "real", Double.NaN);
        setBooleanField(term19243, term19243.getClass(), "isNaN", true);
        setBooleanField(term19243, term19243.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term19228;
        Object retValue = callMethod(klass, "divide", argTypes, term19228, args);
        assertTrue(recursiveEquals(term19228, term19248));
        assertTrue(recursiveEquals(term19228, term19249));
        assertTrue(recursiveEquals(retValue, term19243));
    }

};


