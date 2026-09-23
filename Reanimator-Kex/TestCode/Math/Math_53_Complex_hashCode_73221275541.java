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

public class Complex_hashCode_73221275541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term377;

    public Complex_hashCode_73221275541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term41, term41.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term41, term41.getClass(), "real", 0.2779719046761513);
        setBooleanField(term41, term41.getClass(), "isNaN", false);
        setBooleanField(term41, term41.getClass(), "isInfinite", false);
        term377 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term377, term377.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term377, term377.getClass(), "real", 0.2779719046761513);
        setBooleanField(term377, term377.getClass(), "isNaN", false);
        setBooleanField(term377, term377.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41, args);
        assertTrue(recursiveEquals(term41, term377));
        assertTrue(recursiveEquals(retValue, 1797551533));
    }

};


