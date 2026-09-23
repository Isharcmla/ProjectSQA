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
import java.lang.Double;

public class Complex_divide_2043353673137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19726;
     Object term19739;
     Object term19728;

    public Complex_divide_2043353673137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19726 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term19726, term19726.getClass(), "isNaN", true);
        term19739 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term19739, term19739.getClass(), "imaginary", 0.0);
        setDoubleField(term19739, term19739.getClass(), "real", 0.0);
        setBooleanField(term19739, term19739.getClass(), "isNaN", true);
        setBooleanField(term19739, term19739.getClass(), "isInfinite", false);
        term19728 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term19728, term19728.getClass(), "imaginary", Double.NaN);
        setDoubleField(term19728, term19728.getClass(), "real", Double.NaN);
        setBooleanField(term19728, term19728.getClass(), "isNaN", true);
        setBooleanField(term19728, term19728.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "divide", argTypes, term19726, args);
        assertTrue(recursiveEquals(term19726, term19739));
        assertTrue(recursiveEquals(retValue, term19728));
    }

};


