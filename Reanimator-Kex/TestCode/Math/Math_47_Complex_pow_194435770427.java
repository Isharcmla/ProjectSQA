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

public class Complex_pow_194435770427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;
     Object term171;

    public Complex_pow_194435770427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term166, term166.getClass(), "imaginary", 0.025133051616627267);
        setDoubleField(term166, term166.getClass(), "real", 0.016575281023182953);
        setBooleanField(term166, term166.getClass(), "isNaN", false);
        setBooleanField(term166, term166.getClass(), "isInfinite", false);
        term171 = new Double(0.5308350402051779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term171;
        callMethod(klass, "pow", argTypes, term166, args);
    }

};


