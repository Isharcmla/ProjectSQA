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
     Object term204;
     Object term2872;
     Object term2860;

    public Complex_sin_10197090370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term204, term204.getClass(), "imaginary", 0.7154795600170818);
        setDoubleField(term204, term204.getClass(), "real", 0.6355029654528058);
        setBooleanField(term204, term204.getClass(), "isNaN", true);
        setBooleanField(term204, term204.getClass(), "isInfinite", false);
        setBooleanField(term204, term204.getClass(), "isZero", false);
        term2872 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2872, term2872.getClass(), "imaginary", 0.7154795600170818);
        setDoubleField(term2872, term2872.getClass(), "real", 0.6355029654528058);
        setBooleanField(term2872, term2872.getClass(), "isNaN", true);
        setBooleanField(term2872, term2872.getClass(), "isInfinite", false);
        setBooleanField(term2872, term2872.getClass(), "isZero", false);
        term2860 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2860, term2860.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2860, term2860.getClass(), "real", Double.NaN);
        setBooleanField(term2860, term2860.getClass(), "isNaN", true);
        setBooleanField(term2860, term2860.getClass(), "isInfinite", false);
        setBooleanField(term2860, term2860.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sin", argTypes, term204, args);
        assertTrue(recursiveEquals(term204, term2872));
        assertTrue(recursiveEquals(retValue, term2860));
    }

};


