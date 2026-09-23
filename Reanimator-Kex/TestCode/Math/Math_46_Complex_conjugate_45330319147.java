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
     Object term33;
     Object term421;
     Object term415;

    public Complex_conjugate_45330319147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33, term33.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term33, term33.getClass(), "real", 0.1374549299694151);
        setBooleanField(term33, term33.getClass(), "isNaN", false);
        setBooleanField(term33, term33.getClass(), "isInfinite", true);
        setBooleanField(term33, term33.getClass(), "isZero", false);
        term421 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term421, term421.getClass(), "imaginary", 0.7655020693602768);
        setDoubleField(term421, term421.getClass(), "real", 0.1374549299694151);
        setBooleanField(term421, term421.getClass(), "isNaN", false);
        setBooleanField(term421, term421.getClass(), "isInfinite", true);
        setBooleanField(term421, term421.getClass(), "isZero", false);
        term415 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term415, term415.getClass(), "imaginary", -0.7655020693602768);
        setDoubleField(term415, term415.getClass(), "real", 0.1374549299694151);
        setBooleanField(term415, term415.getClass(), "isNaN", false);
        setBooleanField(term415, term415.getClass(), "isInfinite", false);
        setBooleanField(term415, term415.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term33, args);
        assertTrue(recursiveEquals(term33, term421));
        assertTrue(recursiveEquals(retValue, term415));
    }

};


