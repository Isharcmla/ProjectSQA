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

public class Complex_multiply_119237937257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term97;
     Object term529;
     Object term516;

    public Complex_multiply_119237937257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term92, term92.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term92, term92.getClass(), "real", 0.5279279537140873);
        setBooleanField(term92, term92.getClass(), "isNaN", true);
        setBooleanField(term92, term92.getClass(), "isInfinite", true);
        term97 = new Double(0.3202192021706908);
        term529 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term529, term529.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term529, term529.getClass(), "real", 0.5279279537140873);
        setBooleanField(term529, term529.getClass(), "isNaN", true);
        setBooleanField(term529, term529.getClass(), "isInfinite", true);
        term516 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term516, term516.getClass(), "imaginary", Double.NaN);
        setDoubleField(term516, term516.getClass(), "real", Double.NaN);
        setBooleanField(term516, term516.getClass(), "isNaN", true);
        setBooleanField(term516, term516.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term97;
        Object retValue = callMethod(klass, "multiply", argTypes, term92, args);
        assertTrue(recursiveEquals(term92, term529));
        assertTrue(recursiveEquals(term97, 0.3202192021706908));
        assertTrue(recursiveEquals(retValue, term516));
    }

};


