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
     Object term108;
     Object term114;
     Object term575;
     Object term568;

    public Complex_multiply_119237937257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108, term108.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term108, term108.getClass(), "real", 0.5279279537140873);
        setBooleanField(term108, term108.getClass(), "isNaN", false);
        setBooleanField(term108, term108.getClass(), "isInfinite", true);
        setBooleanField(term108, term108.getClass(), "isZero", false);
        term114 = new Double(0.3202192021706908);
        term575 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term575, term575.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term575, term575.getClass(), "real", 0.5279279537140873);
        setBooleanField(term575, term575.getClass(), "isNaN", false);
        setBooleanField(term575, term575.getClass(), "isInfinite", true);
        setBooleanField(term575, term575.getClass(), "isZero", false);
        term568 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term568, term568.getClass(), "imaginary", 0.0249849421948657);
        setDoubleField(term568, term568.getClass(), "real", 0.1690526681419304);
        setBooleanField(term568, term568.getClass(), "isNaN", false);
        setBooleanField(term568, term568.getClass(), "isInfinite", false);
        setBooleanField(term568, term568.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term114;
        Object retValue = callMethod(klass, "multiply", argTypes, term108, args);
        assertTrue(recursiveEquals(term108, term575));
        assertTrue(recursiveEquals(term114, 0.3202192021706908));
        assertTrue(recursiveEquals(retValue, term568));
    }

};


