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
import java.lang.Double;

public class Complex_pow_194435770429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term183;

    public Complex_pow_194435770429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term178, term178.getClass(), "imaginary", 0.6355029654528058);
        setDoubleField(term178, term178.getClass(), "real", 0.0022646783892913414);
        setBooleanField(term178, term178.getClass(), "isNaN", false);
        setBooleanField(term178, term178.getClass(), "isInfinite", false);
        term183 = new Double(0.36226058076369927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term183;
        callMethod(klass, "pow", argTypes, term178, args);
    }

};


