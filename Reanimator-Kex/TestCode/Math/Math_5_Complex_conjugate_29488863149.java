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

public class Complex_conjugate_29488863149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term630;
     Object term625;

    public Complex_conjugate_29488863149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term29, term29.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term29, term29.getClass(), "real", 0.1374549299694151);
        setBooleanField(term29, term29.getClass(), "isNaN", false);
        setBooleanField(term29, term29.getClass(), "isInfinite", true);
        term630 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term630, term630.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term630, term630.getClass(), "real", 0.1374549299694151);
        setBooleanField(term630, term630.getClass(), "isNaN", false);
        setBooleanField(term630, term630.getClass(), "isInfinite", true);
        term625 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term625, term625.getClass(), "imaginary", -0.7655020693602768);
        setDoubleField(term625, term625.getClass(), "real", 0.1374549299694151);
        setBooleanField(term625, term625.getClass(), "isNaN", false);
        setBooleanField(term625, term625.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term29, args);
        assertTrue(recursiveEquals(term29, term630));
        assertTrue(recursiveEquals(retValue, term625));
    }

};


