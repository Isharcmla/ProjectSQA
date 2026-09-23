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

public class Complex_sqrt_1060631745153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22573;
     Object term22637;
     Object term22632;

    public Complex_sqrt_1060631745153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22573 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term22573, term22573.getClass(), "isNaN", false);
        setDoubleField(term22573, term22573.getClass(), "real", 1.407375153106952E15);
        setBooleanField(term22573, term22573.getClass(), "isInfinite", false);
        setDoubleField(term22573, term22573.getClass(), "imaginary", 1.0133649051713568E16);
        term22637 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term22637, term22637.getClass(), "imaginary", 1.0133649051713568E16);
        setDoubleField(term22637, term22637.getClass(), "real", 1.407375153106952E15);
        setBooleanField(term22637, term22637.getClass(), "isNaN", false);
        setBooleanField(term22637, term22637.getClass(), "isInfinite", false);
        term22632 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term22632, term22632.getClass(), "imaginary", 6.642114211444076E7);
        setDoubleField(term22632, term22632.getClass(), "real", 7.628330926810719E7);
        setBooleanField(term22632, term22632.getClass(), "isNaN", false);
        setBooleanField(term22632, term22632.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term22573, args);
        assertTrue(recursiveEquals(term22573, term22637));
        assertTrue(recursiveEquals(retValue, term22632));
    }

};


