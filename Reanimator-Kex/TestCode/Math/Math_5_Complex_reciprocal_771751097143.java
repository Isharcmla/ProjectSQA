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

public class Complex_reciprocal_771751097143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20526;
     Object term20567;
     Object term20562;

    public Complex_reciprocal_771751097143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20526 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term20526, term20526.getClass(), "isNaN", false);
        setDoubleField(term20526, term20526.getClass(), "real", 4.503599627370497E15);
        term20567 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term20567, term20567.getClass(), "imaginary", 0.0);
        setDoubleField(term20567, term20567.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term20567, term20567.getClass(), "isNaN", false);
        setBooleanField(term20567, term20567.getClass(), "isInfinite", false);
        term20562 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term20562, term20562.getClass(), "imaginary", -0.0);
        setDoubleField(term20562, term20562.getClass(), "real", 2.2204460492503126E-16);
        setBooleanField(term20562, term20562.getClass(), "isNaN", false);
        setBooleanField(term20562, term20562.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reciprocal", argTypes, term20526, args);
        assertTrue(recursiveEquals(term20526, term20567));
        assertTrue(recursiveEquals(retValue, term20562));
    }

};


