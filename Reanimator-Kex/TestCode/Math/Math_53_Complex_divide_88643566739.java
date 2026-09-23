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

public class Complex_divide_88643566739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term30;
     Object term352;
     Object term353;
     Object term347;

    public Complex_divide_88643566739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term25, term25.getClass(), "imaginary", 0.8474802076607362);
        setDoubleField(term25, term25.getClass(), "real", 0.5183269973490326);
        setBooleanField(term25, term25.getClass(), "isNaN", false);
        setBooleanField(term25, term25.getClass(), "isInfinite", true);
        term30 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30, term30.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term30, term30.getClass(), "real", 0.1374549299694151);
        setBooleanField(term30, term30.getClass(), "isNaN", false);
        setBooleanField(term30, term30.getClass(), "isInfinite", true);
        term352 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term352, term352.getClass(), "imaginary", 0.8474802076607362);
        setDoubleField(term352, term352.getClass(), "real", 0.5183269973490326);
        setBooleanField(term352, term352.getClass(), "isNaN", false);
        setBooleanField(term352, term352.getClass(), "isInfinite", true);
        term353 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term353, term353.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term353, term353.getClass(), "real", 0.1374549299694151);
        setBooleanField(term353, term353.getClass(), "isNaN", false);
        setBooleanField(term353, term353.getClass(), "isInfinite", true);
        term347 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term347, term347.getClass(), "imaginary", -0.4633756860450958);
        setDoubleField(term347, term347.getClass(), "real", 1.1902952540638512);
        setBooleanField(term347, term347.getClass(), "isNaN", false);
        setBooleanField(term347, term347.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term30;
        Object retValue = callMethod(klass, "divide", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term352));
        assertTrue(recursiveEquals(term30, term353));
        assertTrue(recursiveEquals(retValue, term347));
    }

};


