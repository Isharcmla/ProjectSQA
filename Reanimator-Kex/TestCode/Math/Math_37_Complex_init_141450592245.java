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

public class Complex_init_141450592245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term282;

    public Complex_init_141450592245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Double(0.3455959125047594);
        term5 = new Double(0.5523635872663106);
        term282 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term282, term282.getClass(), "imaginary", 0.5523635872663106);
        setDoubleField(term282, term282.getClass(), "real", 0.3455959125047594);
        setBooleanField(term282, term282.getClass(), "isNaN", false);
        setBooleanField(term282, term282.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term3;
        args[1] = term5;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term282));
        assertTrue(recursiveEquals(term3, 0.3455959125047594));
        assertTrue(recursiveEquals(term5, 0.5523635872663106));
    }

};


