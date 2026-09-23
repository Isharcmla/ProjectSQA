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
import java.lang.Double;

public class Complex_init_141450592290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4669;

    public Complex_init_141450592290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4636 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4636, term4636.getClass(), "real", 0.0);
        setDoubleField(term4636, term4636.getClass(), "imaginary", 0.0);
        setBooleanField(term4636, term4636.getClass(), "isNaN", false);
        term4669 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4669, term4669.getClass(), "imaginary", -2.225073858507202E-308);
        setDoubleField(term4669, term4669.getClass(), "real", Double.POSITIVE_INFINITY);
        setBooleanField(term4669, term4669.getClass(), "isNaN", false);
        setBooleanField(term4669, term4669.getClass(), "isInfinite", true);
        setBooleanField(term4669, term4669.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = Double.POSITIVE_INFINITY;
        args[1] = -2.225073858507202E-308;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4669));
    }

};


