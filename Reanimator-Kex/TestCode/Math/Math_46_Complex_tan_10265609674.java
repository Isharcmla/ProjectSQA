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

public class Complex_tan_10265609674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;
     Object term3109;
     Object term3097;

    public Complex_tan_10265609674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term228, term228.getClass(), "imaginary", 0.426231085465289);
        setDoubleField(term228, term228.getClass(), "real", 0.0027299293098262956);
        setBooleanField(term228, term228.getClass(), "isNaN", true);
        setBooleanField(term228, term228.getClass(), "isInfinite", true);
        setBooleanField(term228, term228.getClass(), "isZero", false);
        term3109 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3109, term3109.getClass(), "imaginary", 0.426231085465289);
        setDoubleField(term3109, term3109.getClass(), "real", 0.0027299293098262956);
        setBooleanField(term3109, term3109.getClass(), "isNaN", true);
        setBooleanField(term3109, term3109.getClass(), "isInfinite", true);
        setBooleanField(term3109, term3109.getClass(), "isZero", false);
        term3097 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3097, term3097.getClass(), "imaginary", Double.NaN);
        setDoubleField(term3097, term3097.getClass(), "real", Double.NaN);
        setBooleanField(term3097, term3097.getClass(), "isNaN", true);
        setBooleanField(term3097, term3097.getClass(), "isInfinite", false);
        setBooleanField(term3097, term3097.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tan", argTypes, term228, args);
        assertTrue(recursiveEquals(term228, term3109));
        assertTrue(recursiveEquals(retValue, term3097));
    }

};


