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

public class Complex_acos_1430561531163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24214;
     Object term24430;
     Object term24427;

    public Complex_acos_1430561531163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24214 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24214, term24214.getClass(), "real", 9.007474132647936E15);
        setDoubleField(term24214, term24214.getClass(), "imaginary", 7.0368744177664E13);
        term24430 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24430, term24430.getClass(), "imaginary", 7.0368744177664E13);
        setDoubleField(term24430, term24430.getClass(), "real", 9.007474132647936E15);
        term24427 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24427, term24427.getClass(), "imaginary", -37.43000878213391);
        setDoubleField(term24427, term24427.getClass(), "real", 0.007812102663347884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term24214, args);
        assertTrue(recursiveEquals(term24214, term24430));
        assertTrue(recursiveEquals(retValue, term24427));
    }

};


