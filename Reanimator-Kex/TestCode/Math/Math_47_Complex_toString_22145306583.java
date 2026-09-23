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

public class Complex_toString_22145306583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240;
     Object term4619;

    public Complex_toString_22145306583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term240, term240.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term240, term240.getClass(), "real", 0.09067063848644474);
        setBooleanField(term240, term240.getClass(), "isNaN", true);
        setBooleanField(term240, term240.getClass(), "isInfinite", false);
        term4619 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4619, term4619.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term4619, term4619.getClass(), "real", 0.09067063848644474);
        setBooleanField(term4619, term4619.getClass(), "isNaN", true);
        setBooleanField(term4619, term4619.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term240, args);
        assertTrue(recursiveEquals(term240, term4619));
        assertTrue(recursiveEquals(retValue, "(0.09067063848644474, 0.5617009352394552)"));
    }

};


