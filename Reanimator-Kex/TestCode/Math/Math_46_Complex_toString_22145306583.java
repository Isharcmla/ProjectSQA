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
     Object term282;
     Object term4072;

    public Complex_toString_22145306583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term282, term282.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term282, term282.getClass(), "real", 0.09067063848644474);
        setBooleanField(term282, term282.getClass(), "isNaN", true);
        setBooleanField(term282, term282.getClass(), "isInfinite", false);
        setBooleanField(term282, term282.getClass(), "isZero", false);
        term4072 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4072, term4072.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term4072, term4072.getClass(), "real", 0.09067063848644474);
        setBooleanField(term4072, term4072.getClass(), "isNaN", true);
        setBooleanField(term4072, term4072.getClass(), "isInfinite", false);
        setBooleanField(term4072, term4072.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term282, args);
        assertTrue(recursiveEquals(term282, term4072));
        assertTrue(recursiveEquals(retValue, "(0.09067063848644474, 0.5617009352394552)"));
    }

};


