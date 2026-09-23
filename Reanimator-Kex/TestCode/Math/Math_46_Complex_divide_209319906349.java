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

public class Complex_divide_209319906349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term57;
     Object term461;
     Object term448;

    public Complex_divide_209319906349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51, term51.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term51, term51.getClass(), "real", 0.7332741045694002);
        setBooleanField(term51, term51.getClass(), "isNaN", true);
        setBooleanField(term51, term51.getClass(), "isInfinite", true);
        setBooleanField(term51, term51.getClass(), "isZero", true);
        term57 = new Double(0.4569171842750229);
        term461 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term461, term461.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term461, term461.getClass(), "real", 0.7332741045694002);
        setBooleanField(term461, term461.getClass(), "isNaN", true);
        setBooleanField(term461, term461.getClass(), "isInfinite", true);
        setBooleanField(term461, term461.getClass(), "isZero", true);
        term448 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term448, term448.getClass(), "imaginary", Double.NaN);
        setDoubleField(term448, term448.getClass(), "real", Double.NaN);
        setBooleanField(term448, term448.getClass(), "isNaN", true);
        setBooleanField(term448, term448.getClass(), "isInfinite", false);
        setBooleanField(term448, term448.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term57;
        Object retValue = callMethod(klass, "divide", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term461));
        assertTrue(recursiveEquals(term57, 0.4569171842750229));
        assertTrue(recursiveEquals(retValue, term448));
    }

};


