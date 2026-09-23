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

public class Complex_divide_2043353673145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20671;
     Object term20687;
     Object term20676;

    public Complex_divide_2043353673145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20671 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term20671, term20671.getClass(), "isNaN", false);
        term20687 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term20687, term20687.getClass(), "imaginary", 0.0);
        setDoubleField(term20687, term20687.getClass(), "real", 0.0);
        setBooleanField(term20687, term20687.getClass(), "isNaN", false);
        setBooleanField(term20687, term20687.getClass(), "isInfinite", false);
        term20676 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term20676, term20676.getClass(), "imaginary", Double.NaN);
        setDoubleField(term20676, term20676.getClass(), "real", Double.NaN);
        setBooleanField(term20676, term20676.getClass(), "isNaN", true);
        setBooleanField(term20676, term20676.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "divide", argTypes, term20671, args);
        assertTrue(recursiveEquals(term20671, term20687));
        assertTrue(recursiveEquals(retValue, term20676));
    }

};


