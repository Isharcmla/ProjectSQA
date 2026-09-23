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

public class Complex_conjugate_45330319193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4804;
     Object term4978;
     Object term4972;

    public Complex_conjugate_45330319193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4804 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term4804, term4804.getClass(), "isNaN", false);
        setDoubleField(term4804, term4804.getClass(), "real", 0.0);
        setDoubleField(term4804, term4804.getClass(), "imaginary", -9.223372036854776E18);
        term4978 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4978, term4978.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term4978, term4978.getClass(), "real", 0.0);
        setBooleanField(term4978, term4978.getClass(), "isNaN", false);
        setBooleanField(term4978, term4978.getClass(), "isInfinite", false);
        setBooleanField(term4978, term4978.getClass(), "isZero", false);
        term4972 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4972, term4972.getClass(), "imaginary", 9.223372036854776E18);
        setDoubleField(term4972, term4972.getClass(), "real", 0.0);
        setBooleanField(term4972, term4972.getClass(), "isNaN", false);
        setBooleanField(term4972, term4972.getClass(), "isInfinite", false);
        setBooleanField(term4972, term4972.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term4804, args);
        assertTrue(recursiveEquals(term4804, term4978));
        assertTrue(recursiveEquals(retValue, term4972));
    }

};


