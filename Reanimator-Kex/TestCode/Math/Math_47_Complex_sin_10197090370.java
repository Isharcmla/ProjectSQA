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

public class Complex_sin_10197090370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term2903;
     Object term2893;

    public Complex_sin_10197090370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term173, term173.getClass(), "imaginary", 0.7154795600170818);
        setDoubleField(term173, term173.getClass(), "real", 0.6355029654528058);
        setBooleanField(term173, term173.getClass(), "isNaN", true);
        setBooleanField(term173, term173.getClass(), "isInfinite", true);
        term2903 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2903, term2903.getClass(), "imaginary", 0.7154795600170818);
        setDoubleField(term2903, term2903.getClass(), "real", 0.6355029654528058);
        setBooleanField(term2903, term2903.getClass(), "isNaN", true);
        setBooleanField(term2903, term2903.getClass(), "isInfinite", true);
        term2893 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2893, term2893.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2893, term2893.getClass(), "real", Double.NaN);
        setBooleanField(term2893, term2893.getClass(), "isNaN", true);
        setBooleanField(term2893, term2893.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sin", argTypes, term173, args);
        assertTrue(recursiveEquals(term173, term2903));
        assertTrue(recursiveEquals(retValue, term2893));
    }

};


