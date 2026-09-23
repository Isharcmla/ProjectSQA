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

public class Complex_sqrt_90221718599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8303;
     Object term8330;
     Object term8325;

    public Complex_sqrt_90221718599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8303 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term8303, term8303.getClass(), "isNaN", false);
        setDoubleField(term8303, term8303.getClass(), "real", 0.0);
        term8330 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8330, term8330.getClass(), "imaginary", 0.0);
        setDoubleField(term8330, term8330.getClass(), "real", 0.0);
        setBooleanField(term8330, term8330.getClass(), "isNaN", false);
        setBooleanField(term8330, term8330.getClass(), "isInfinite", false);
        term8325 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8325, term8325.getClass(), "imaginary", 0.0);
        setDoubleField(term8325, term8325.getClass(), "real", 0.0);
        setBooleanField(term8325, term8325.getClass(), "isNaN", false);
        setBooleanField(term8325, term8325.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term8303, args);
        assertTrue(recursiveEquals(term8303, term8330));
        assertTrue(recursiveEquals(retValue, term8325));
    }

};


