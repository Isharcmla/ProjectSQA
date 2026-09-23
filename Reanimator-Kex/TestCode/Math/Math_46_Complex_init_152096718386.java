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
import java.lang.Object;

public class Complex_init_152096718386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4393;

    public Complex_init_152096718386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4375 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4375, term4375.getClass(), "real", 0.0);
        setDoubleField(term4375, term4375.getClass(), "imaginary", 0.0);
        setBooleanField(term4375, term4375.getClass(), "isNaN", false);
        setBooleanField(term4375, term4375.getClass(), "isInfinite", false);
        term4393 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4393, term4393.getClass(), "imaginary", 0.0);
        setDoubleField(term4393, term4393.getClass(), "real", 0.0);
        setBooleanField(term4393, term4393.getClass(), "isNaN", false);
        setBooleanField(term4393, term4393.getClass(), "isInfinite", false);
        setBooleanField(term4393, term4393.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4393));
    }

};


