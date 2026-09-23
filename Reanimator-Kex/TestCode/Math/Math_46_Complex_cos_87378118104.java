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

public class Complex_cos_87378118104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5796;
     Object term5810;
     Object term5798;

    public Complex_cos_87378118104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5796 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5796, term5796.getClass(), "isNaN", true);
        term5810 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5810, term5810.getClass(), "imaginary", 0.0);
        setDoubleField(term5810, term5810.getClass(), "real", 0.0);
        setBooleanField(term5810, term5810.getClass(), "isNaN", true);
        setBooleanField(term5810, term5810.getClass(), "isInfinite", false);
        setBooleanField(term5810, term5810.getClass(), "isZero", false);
        term5798 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5798, term5798.getClass(), "imaginary", Double.NaN);
        setDoubleField(term5798, term5798.getClass(), "real", Double.NaN);
        setBooleanField(term5798, term5798.getClass(), "isNaN", true);
        setBooleanField(term5798, term5798.getClass(), "isInfinite", false);
        setBooleanField(term5798, term5798.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cos", argTypes, term5796, args);
        assertTrue(recursiveEquals(term5796, term5810));
        assertTrue(recursiveEquals(retValue, term5798));
    }

};


