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

public class Complex_getImaginary_74926337236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term594;

    public Complex_getImaginary_74926337236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30, term30.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term30, term30.getClass(), "real", 0.7332741045694002);
        term594 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term594, term594.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term594, term594.getClass(), "real", 0.7332741045694002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImaginary", argTypes, term30, args);
        assertTrue(recursiveEquals(term30, term594));
        assertTrue(recursiveEquals(retValue, 0.6436713023569729));
    }

};


