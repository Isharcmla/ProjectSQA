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

public class Complex_multiply_125761987795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10711;
     Object term10724;
     Object term10713;

    public Complex_multiply_125761987795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10711 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10711, term10711.getClass(), "isNaN", true);
        term10724 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10724, term10724.getClass(), "imaginary", 0.0);
        setDoubleField(term10724, term10724.getClass(), "real", 0.0);
        setBooleanField(term10724, term10724.getClass(), "isNaN", true);
        setBooleanField(term10724, term10724.getClass(), "isInfinite", false);
        term10713 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10713, term10713.getClass(), "imaginary", Double.NaN);
        setDoubleField(term10713, term10713.getClass(), "real", Double.NaN);
        setBooleanField(term10713, term10713.getClass(), "isNaN", true);
        setBooleanField(term10713, term10713.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "multiply", argTypes, term10711, args);
        assertTrue(recursiveEquals(term10711, term10724));
        assertTrue(recursiveEquals(retValue, term10713));
    }

};


