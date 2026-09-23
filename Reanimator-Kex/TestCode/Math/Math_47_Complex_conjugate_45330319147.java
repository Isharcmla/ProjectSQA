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

public class Complex_conjugate_45330319147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term361;
     Object term356;

    public Complex_conjugate_45330319147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term29, term29.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term29, term29.getClass(), "real", 0.1374549299694151);
        setBooleanField(term29, term29.getClass(), "isNaN", false);
        setBooleanField(term29, term29.getClass(), "isInfinite", true);
        term361 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term361, term361.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term361, term361.getClass(), "real", 0.1374549299694151);
        setBooleanField(term361, term361.getClass(), "isNaN", false);
        setBooleanField(term361, term361.getClass(), "isInfinite", true);
        term356 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term356, term356.getClass(), "imaginary", -0.7655020693602768);
        setDoubleField(term356, term356.getClass(), "real", 0.1374549299694151);
        setBooleanField(term356, term356.getClass(), "isNaN", false);
        setBooleanField(term356, term356.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term29, args);
        assertTrue(recursiveEquals(term29, term361));
        assertTrue(recursiveEquals(retValue, term356));
    }

};


