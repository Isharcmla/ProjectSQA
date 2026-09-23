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

public class Complex_divide_88643566797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5958;
     Object term6129;
     Object term6130;
     Object term6124;

    public Complex_divide_88643566797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5958 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5958, term5958.getClass(), "isNaN", true);
        term6129 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6129, term6129.getClass(), "imaginary", 0.0);
        setDoubleField(term6129, term6129.getClass(), "real", 0.0);
        setBooleanField(term6129, term6129.getClass(), "isNaN", true);
        setBooleanField(term6129, term6129.getClass(), "isInfinite", false);
        term6130 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6130, term6130.getClass(), "imaginary", 0.0);
        setDoubleField(term6130, term6130.getClass(), "real", 0.0);
        setBooleanField(term6130, term6130.getClass(), "isNaN", true);
        setBooleanField(term6130, term6130.getClass(), "isInfinite", false);
        term6124 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6124, term6124.getClass(), "imaginary", Double.NaN);
        setDoubleField(term6124, term6124.getClass(), "real", Double.NaN);
        setBooleanField(term6124, term6124.getClass(), "isNaN", true);
        setBooleanField(term6124, term6124.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term5958;
        Object retValue = callMethod(klass, "divide", argTypes, term5958, args);
        assertTrue(recursiveEquals(term5958, term6129));
        assertTrue(recursiveEquals(term5958, term6130));
        assertTrue(recursiveEquals(retValue, term6124));
    }

};


