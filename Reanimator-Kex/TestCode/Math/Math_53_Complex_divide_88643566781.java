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

public class Complex_divide_88643566781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6090;
     Object term6135;
     Object term6136;
     Object term6130;

    public Complex_divide_88643566781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6090 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6090, term6090.getClass(), "isNaN", true);
        term6135 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6135, term6135.getClass(), "imaginary", 0.0);
        setDoubleField(term6135, term6135.getClass(), "real", 0.0);
        setBooleanField(term6135, term6135.getClass(), "isNaN", true);
        setBooleanField(term6135, term6135.getClass(), "isInfinite", false);
        term6136 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6136, term6136.getClass(), "imaginary", 0.0);
        setDoubleField(term6136, term6136.getClass(), "real", 0.0);
        setBooleanField(term6136, term6136.getClass(), "isNaN", true);
        setBooleanField(term6136, term6136.getClass(), "isInfinite", false);
        term6130 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6130, term6130.getClass(), "imaginary", Double.NaN);
        setDoubleField(term6130, term6130.getClass(), "real", Double.NaN);
        setBooleanField(term6130, term6130.getClass(), "isNaN", true);
        setBooleanField(term6130, term6130.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term6090;
        Object retValue = callMethod(klass, "divide", argTypes, term6090, args);
        assertTrue(recursiveEquals(term6090, term6135));
        assertTrue(recursiveEquals(term6090, term6136));
        assertTrue(recursiveEquals(retValue, term6130));
    }

};


