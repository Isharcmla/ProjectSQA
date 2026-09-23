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

public class Complex_sqrt_902217185119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11563;
     Object term11632;
     Object term11627;

    public Complex_sqrt_902217185119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11563 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term11563, term11563.getClass(), "isNaN", false);
        setDoubleField(term11563, term11563.getClass(), "real", -9.1873432398190346E18);
        term11632 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11632, term11632.getClass(), "imaginary", 0.0);
        setDoubleField(term11632, term11632.getClass(), "real", -9.1873432398190346E18);
        setBooleanField(term11632, term11632.getClass(), "isNaN", false);
        setBooleanField(term11632, term11632.getClass(), "isInfinite", false);
        term11627 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11627, term11627.getClass(), "imaginary", 3.031063054411609E9);
        setDoubleField(term11627, term11627.getClass(), "real", 0.0);
        setBooleanField(term11627, term11627.getClass(), "isNaN", false);
        setBooleanField(term11627, term11627.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term11563, args);
        assertTrue(recursiveEquals(term11563, term11632));
        assertTrue(recursiveEquals(retValue, term11627));
    }

};


