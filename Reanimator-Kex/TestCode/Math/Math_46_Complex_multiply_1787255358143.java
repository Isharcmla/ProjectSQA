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

public class Complex_multiply_1787255358143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10790;
     Object term10827;
     Object term10828;
     Object term10821;

    public Complex_multiply_1787255358143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10790 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10790, term10790.getClass(), "isNaN", false);
        term10827 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10827, term10827.getClass(), "imaginary", 0.0);
        setDoubleField(term10827, term10827.getClass(), "real", 0.0);
        setBooleanField(term10827, term10827.getClass(), "isNaN", false);
        setBooleanField(term10827, term10827.getClass(), "isInfinite", false);
        setBooleanField(term10827, term10827.getClass(), "isZero", false);
        term10828 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10828, term10828.getClass(), "imaginary", 0.0);
        setDoubleField(term10828, term10828.getClass(), "real", 0.0);
        setBooleanField(term10828, term10828.getClass(), "isNaN", false);
        setBooleanField(term10828, term10828.getClass(), "isInfinite", false);
        setBooleanField(term10828, term10828.getClass(), "isZero", false);
        term10821 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10821, term10821.getClass(), "imaginary", 0.0);
        setDoubleField(term10821, term10821.getClass(), "real", 0.0);
        setBooleanField(term10821, term10821.getClass(), "isNaN", false);
        setBooleanField(term10821, term10821.getClass(), "isInfinite", false);
        setBooleanField(term10821, term10821.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term10790;
        Object retValue = callMethod(klass, "multiply", argTypes, term10790, args);
        assertTrue(recursiveEquals(term10790, term10827));
        assertTrue(recursiveEquals(term10790, term10828));
        assertTrue(recursiveEquals(retValue, term10821));
    }

};


