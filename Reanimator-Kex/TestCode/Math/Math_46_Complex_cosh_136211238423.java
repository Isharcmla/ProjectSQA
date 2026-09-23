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

public class Complex_cosh_136211238423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;

    public Complex_cosh_136211238423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term166, term166.getClass(), "imaginary", 0.20737514139742264);
        setDoubleField(term166, term166.getClass(), "real", 0.7919370314903882);
        setBooleanField(term166, term166.getClass(), "isNaN", false);
        setBooleanField(term166, term166.getClass(), "isInfinite", true);
        setBooleanField(term166, term166.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cosh", argTypes, term166, args);
    }

};


