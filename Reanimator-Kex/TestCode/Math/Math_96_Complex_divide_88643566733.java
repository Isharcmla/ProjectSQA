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

public class Complex_divide_88643566733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term20;
     Object term208;
     Object term209;
     Object term205;

    public Complex_divide_88643566733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17, term17.getClass(), "imaginary", 0.8474802076607362);
        setDoubleField(term17, term17.getClass(), "real", 0.5183269973490326);
        term20 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20, term20.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term20, term20.getClass(), "real", 0.1374549299694151);
        term208 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term208, term208.getClass(), "imaginary", 0.8474802076607362);
        setDoubleField(term208, term208.getClass(), "real", 0.5183269973490326);
        term209 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term209, term209.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term209, term209.getClass(), "real", 0.1374549299694151);
        term205 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term205, term205.getClass(), "imaginary", -0.4633756860450958);
        setDoubleField(term205, term205.getClass(), "real", 1.1902952540638512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term20;
        Object retValue = callMethod(klass, "divide", argTypes, term17, args);
        assertTrue(recursiveEquals(term17, term208));
        assertTrue(recursiveEquals(term20, term209));
        assertTrue(recursiveEquals(retValue, term205));
    }

};


