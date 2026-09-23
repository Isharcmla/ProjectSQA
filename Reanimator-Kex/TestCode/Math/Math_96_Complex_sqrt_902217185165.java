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

public class Complex_sqrt_902217185165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24542;
     Object term24561;
     Object term24558;

    public Complex_sqrt_902217185165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24542 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24542, term24542.getClass(), "real", 0.0);
        setDoubleField(term24542, term24542.getClass(), "imaginary", 0.0);
        term24561 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24561, term24561.getClass(), "imaginary", 0.0);
        setDoubleField(term24561, term24561.getClass(), "real", 0.0);
        term24558 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24558, term24558.getClass(), "imaginary", 0.0);
        setDoubleField(term24558, term24558.getClass(), "real", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term24542, args);
        assertTrue(recursiveEquals(term24542, term24561));
        assertTrue(recursiveEquals(retValue, term24558));
    }

};


