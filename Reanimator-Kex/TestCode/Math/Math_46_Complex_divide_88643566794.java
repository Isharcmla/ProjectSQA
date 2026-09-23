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
import java.lang.Double;

public class Complex_divide_88643566794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4947;
     Object term5025;
     Object term5026;
     Object term5019;

    public Complex_divide_88643566794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4947 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term4947, term4947.getClass(), "isNaN", false);
        setBooleanField(term4947, term4947.getClass(), "isZero", false);
        term5025 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5025, term5025.getClass(), "imaginary", 0.0);
        setDoubleField(term5025, term5025.getClass(), "real", 0.0);
        setBooleanField(term5025, term5025.getClass(), "isNaN", false);
        setBooleanField(term5025, term5025.getClass(), "isInfinite", false);
        setBooleanField(term5025, term5025.getClass(), "isZero", false);
        term5026 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5026, term5026.getClass(), "imaginary", 0.0);
        setDoubleField(term5026, term5026.getClass(), "real", 0.0);
        setBooleanField(term5026, term5026.getClass(), "isNaN", false);
        setBooleanField(term5026, term5026.getClass(), "isInfinite", false);
        setBooleanField(term5026, term5026.getClass(), "isZero", false);
        term5019 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5019, term5019.getClass(), "imaginary", Double.NaN);
        setDoubleField(term5019, term5019.getClass(), "real", Double.NaN);
        setBooleanField(term5019, term5019.getClass(), "isNaN", true);
        setBooleanField(term5019, term5019.getClass(), "isInfinite", false);
        setBooleanField(term5019, term5019.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term4947;
        Object retValue = callMethod(klass, "divide", argTypes, term4947, args);
        assertTrue(recursiveEquals(term4947, term5025));
        assertTrue(recursiveEquals(term4947, term5026));
        assertTrue(recursiveEquals(retValue, term5019));
    }

};


