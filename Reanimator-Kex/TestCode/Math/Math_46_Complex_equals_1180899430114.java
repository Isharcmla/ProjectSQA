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

public class Complex_equals_1180899430114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6821;
     Object term6830;
     Object term6831;

    public Complex_equals_1180899430114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6821 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term6830 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6830, term6830.getClass(), "imaginary", 0.0);
        setDoubleField(term6830, term6830.getClass(), "real", 0.0);
        setBooleanField(term6830, term6830.getClass(), "isNaN", false);
        setBooleanField(term6830, term6830.getClass(), "isInfinite", false);
        setBooleanField(term6830, term6830.getClass(), "isZero", false);
        term6831 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6831, term6831.getClass(), "imaginary", 0.0);
        setDoubleField(term6831, term6831.getClass(), "real", 0.0);
        setBooleanField(term6831, term6831.getClass(), "isNaN", false);
        setBooleanField(term6831, term6831.getClass(), "isInfinite", false);
        setBooleanField(term6831, term6831.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6821;
        Object retValue = callMethod(klass, "equals", argTypes, term6821, args);
        assertTrue(recursiveEquals(term6821, term6830));
        assertTrue(recursiveEquals(term6821, term6831));
        assertTrue(recursiveEquals(retValue, true));
    }

};


