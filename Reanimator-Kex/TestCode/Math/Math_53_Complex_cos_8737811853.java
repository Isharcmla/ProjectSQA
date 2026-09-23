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

public class Complex_cos_8737811853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term1046;
     Object term1036;

    public Complex_cos_8737811853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term113, term113.getClass(), "imaginary", 0.5873228247510078);
        setDoubleField(term113, term113.getClass(), "real", 0.8823181080774973);
        setBooleanField(term113, term113.getClass(), "isNaN", true);
        setBooleanField(term113, term113.getClass(), "isInfinite", true);
        term1046 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1046, term1046.getClass(), "imaginary", 0.5873228247510078);
        setDoubleField(term1046, term1046.getClass(), "real", 0.8823181080774973);
        setBooleanField(term1046, term1046.getClass(), "isNaN", true);
        setBooleanField(term1046, term1046.getClass(), "isInfinite", true);
        term1036 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1036, term1036.getClass(), "imaginary", Double.NaN);
        setDoubleField(term1036, term1036.getClass(), "real", Double.NaN);
        setBooleanField(term1036, term1036.getClass(), "isNaN", true);
        setBooleanField(term1036, term1036.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cos", argTypes, term113, args);
        assertTrue(recursiveEquals(term113, term1046));
        assertTrue(recursiveEquals(retValue, term1036));
    }

};


